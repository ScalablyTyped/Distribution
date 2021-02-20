package typings.microsoftSdkSoap.mod.global.Sdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Sdk.Collection")
@js.native
class Collection[T] protected () extends StObject {
  /**
    * A Collection for a specified type.
    * @param type The function that specifies the type.
    * @param items An array of items to add to the collection.
    */
  def this(`type`: T) = this()
  def this(`type`: T, items: js.Array[T]) = this()
  
  /**
    * Adds an item to the collection.
    * @param item An item to add to the collection.
    */
  def add(item: T): Unit = js.native
  
  /**
    * Adds an array of objects to the collection.
    * @param items An array of items to add to the collection.
    */
  def addRange(items: js.Array[_]): Unit = js.native
  
  /**
    * Removes all items from the collection.
    */
  def clear(): Unit = js.native
  
  /**
    * Returns whether an object exists within the collection.
    * @param item The item to search in the collection.
    */
  def contains(item: T): scala.Boolean = js.native
  /**
    * Returns whether an object exists within the collection.
    * @param predicate A comparer function which is invoked for each item of the collection.
    */
  def contains(predicate: js.Function1[/* item */ T, scala.Boolean]): scala.Boolean = js.native
  
  /**
    * Applies the action contained within a delegate function.
    * @param fn Delegate function with parameters for item and index.
    */
  def forEach(fn: js.Function2[/* item */ T, /* index */ scala.Double, _]): Unit = js.native
  
  /**
    * Gets the item in the collection at the specified index.
    * @param index The index of the item to return.
    */
  def getByIndex(index: scala.Double): T = js.native
  
  /**
    * Returns the number of items in the collection.
    */
  def getCount(): scala.Double = js.native
  
  /**
    * Gets the type defined for the collection.
    */
  def getType(): T = js.native
  
  /**
    * Removes an item from the collection.
    * @param item A reference to the item to be removed.
    */
  def remove(item: T): Unit = js.native
  
  /**
    * Returns an Sdk.Collection that contains all the items of this collection that satisfy the specified predicate function.
    * @param predicate A predicate function that takes a collection item as argument and returns a boolean.
    */
  def select(predicate: js.Function1[/* item */ T, scala.Boolean]): Collection[T] = js.native
  
  /**
    * Gets a copy of the array of items in the collection.
    */
  def toArray(): js.Array[T] = js.native
}
