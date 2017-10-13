package copy;
//here we cretaed test as copy which that organizes a set of related classes and interfaces.
import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		//public : it can be called from anywhere.
		//static : doesn't belong to a specific object.
		//void : returns to no value.
		//main : is special because it will start the program.
		// TODO Auto-generated method stub
		Set set1=new HashSet();
		//As it implements the Set Interface, duplicate values are not allowed.
		//Objects that you insert in HashSet are not guaranteed to be inserted
		//in same order. Objects are inserted based on their hash code. 
		//NULL elements are allowed in HashSet. HashSet also implements 
		//Serializable and Cloneable interfaces.
		//creating the object
				set1.add("srujan");//add the values
				set1.add("chintu");
				set1.add("sudha");
				set1.add("nagaraj");
				
				Set set2=new HashSet();
				//creating the objects
				set2.add("uma");//adding the values
				set2.add("shanthi");
				set2.add("priya");
				set2.add("tharani");
				
				System.out.println("Set1 elements:"+set1);
				//print set1
				System.out.println("Set2 elements:"+set2);
				//print set2
				set1.addAll(set2);
				//add all the values of set2 to set1
				System.out.println("After adding set2 elements into set1:");
				System.out.println(set1);
				//print set1
				//system : is a class in java language pacakge.
		  		//out : static member of the system class.
		  		//println : to print what is output.
			    
			}

		
	}


