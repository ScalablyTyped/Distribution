package typings.microsoftAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
* Provides extensions to the base ECMAScript (JavaScript) Array functionality by adding static methods.
* Array Type Extensions
* @see {@link http://msdn.microsoft.com/en-us/library/bb383786(v=vs.100).aspx}
*/
@js.native
trait ArrayConstructor extends StObject {
  
  //#region Extensions
  /**
    * Adds an element to the end of an Array object. This function is static and is invoked without creating an instance of the object.
    * @param array
    *       The array to add the item to.
    * @param item
    *
    */
  def add[T](array: js.Array[T], element: T): Unit = js.native
  
  /**
    * Copies all the elements of the specified array to the end of an Array object.
    */
  def addRange[T](array: js.Array[T], items: js.Array[T]): Unit = js.native
  
  /**
    * Removes all elements from an Array object.
    */
  def clear[T](array: js.Array[T]): Unit = js.native
  
  /**
    * Creates a shallow copy of an Array object.
    */
  def clone[T](array: js.Array[T]): js.Array[T] = js.native
  
  /**
    * Determines whether an element is in an Array object.
    */
  def contains[T](array: js.Array[T], element: T): Boolean = js.native
  
  /**
    * Removes the first element from an Array object.
    */
  def dequeue[T](array: js.Array[T]): T = js.native
  
  /**
    * Adds an element to the end of an Array object. Use the add function instead of the Array.enqueue function.
    */
  def enqueue[T](array: js.Array[T], element: T): Unit = js.native
  
  /**
    * Performs a specified action on each element of an Array object.
    */
  def forEach[T](
    array: js.Array[T],
    method: js.Function3[/* element */ T, /* index */ Double, /* array */ js.Array[T], Unit],
    instance: js.Any
  ): Unit = js.native
  
  /**
    * Searches for the specified element of an Array object and returns its index.
    */
  def indexOf[T](array: js.Array[T], item: T): Double = js.native
  def indexOf[T](array: js.Array[T], item: T, startIndex: Double): Double = js.native
  
  /**
    * Inserts a value at the specified location in an Array object.
    */
  def insert[T](array: js.Array[T], index: Double, item: T): Unit = js.native
  
  /**
    * Creates an Array object from a string representation.
    */
  def parse[T](value: java.lang.String): js.Array[T] = js.native
  
  /**
    * Removes the first occurrence of an element in an Array object.
    */
  def remove[T](array: js.Array[T], item: T): Boolean = js.native
  
  /**
    * Removes an element at the specified location in an Array object.
    */
  def removeAt[T](array: js.Array[T], index: Double): Unit = js.native
}
