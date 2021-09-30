/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays_ejemplo1;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Arrays_Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num[]={20 , 30, 40};
         
        //Busca un valor que le pasamos por parámetro, devuelve su posición. 
        System.out.println("Metodo binarySearch: "+Arrays.binarySearch(num, 21)); //Devuelve un 4 (posc)
        
        //Copia el array num hasta la cuarta posicion(este ultimo no incluido), devuelve un array
        int num2[]=Arrays.copyOf(num, 4);
        System.out.println("Metodo copyOf ");
        //Lo recorremos para ver que lo realiza correctamente
        muestraArray(num2);
         
        //Copia el array num de la tercera hasta la sexta posicion, devuelve un array
        int num3[]=Arrays.copyOfRange(num, 2, 6);
        System.out.println("Metodo copyOfRange");
        muestraArray(num3);

        //Compara si num1 y num2 no son iguales
        System.out.println("Metodo equals: "+Arrays.equals(num, num2));
        
        System.out.println("Metodo fill"); //Rellena un array con un valor que le indiquemos como parámetro.
        Arrays.fill(num3, 5);
        muestraArray(num3);
         
        System.out.println("Metodo toString");//Muestra el contenido del array pasado como parámetros
        System.out.println(Arrays.toString(num));
    }
     
    public static void muestraArray(int num[]){
     
        for (int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
    
}
