package typings.microsoftAjax.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adds update and management functionality to target objects such as arrays, DOM elements, and objects.
  * The Sys.Observer class is based on the Observer pattern. The Sys.Observer class maintains a list of interested dependents (observers) in a separate object (the subject).
  * All methods that are contained in the Sys.Observer class are static.
  * In order to be used with the Sys.Observer class, an object must be an object, array, or DOM element.
  * @see {@link http://msdn.microsoft.com/en-us/library/dd393710(v=vs.100).aspx}
  */
@JSGlobal("Sys.Observer")
@js.native
class Observer () extends js.Object

/* static members */
@JSGlobal("Sys.Observer")
@js.native
object Observer extends js.Object {
  //#region Methods
  /**
    * Adds an item to the collection in an observable manner.
    * @param target
    *           The array to which an item will be added.
    * @param item
    *           The item to add.
    */
  def add(target: js.Array[_], item: js.Any): Unit = js.native
  /**
    * Adds an event handler to the target.
    * @param target The array to which an event handler will be added.
    * @param handler The event handler.
    */
  def addCollectionChanged(target: js.Any, handler: js.Function): Unit = js.native
  /**
    * Adds an observable event handler to the target.
    * @param eventName A string that contains the event name.
    * @param handler The added function.
    */
  def addEventHandler(target: js.Any, eventName: String, handler: js.Function): Unit = js.native
  /**
    * Adds a propertyChanged event handler to the target.
    * @param target The object to observe.
    * @param handler The function handler to add.
    */
  def addPropertyChanged(target: js.Any, handler: js.Function): Unit = js.native
  /**
    * Adds items to the collection in an observable manner.
    * @param target The array to which items will be added.
    * @param items The array of items to add.
    */
  def addRange(target: js.Array[_], items: js.Array[_]): Unit = js.native
  /**
    * Begins the process of updating the target object.
    * @param target The object to update.
    */
  def beginUpdate(target: js.Any): Unit = js.native
  /**
    * Clears the array of its elements in an observable manner.
    * @param target The array to clear.
    */
  def clear(target: js.Any): Unit = js.native
  /**
    * Ends the process of updating the target object.
    * @param target The object being updated.
    */
  def endUpdate(target: js.Any): Unit = js.native
  /**
    * Inserts an item at the specified index in an observable manner.
    * @param target The array to which the item is inserted.
    * @param index A number that represents the index where the item will be inserted.
    * @param item The item to insert.
    */
  def insert(target: js.Any, index: Double, item: js.Any): Unit = js.native
  //#endregion
  //#region Properties
  /**
    * Indicates that the target is being updated.
    * @param target The target object to update.
    * @return true if given target argument is currently updating; otherwise false.
    */
  def isUpdating(target: js.Any): Boolean = js.native
  /**
    * Makes an object directly observable by adding observable methods to it.
    * @param target The object, array, or DOM element to make observable.
    * @return The observable object.
    * @see {@link http://msdn.microsoft.com/en-us/library/dd393633(v=vs.100).aspx}
    */
  def makeObservable(target: js.Any): js.Any = js.native
  /**
    * Raises the collectionChanged event.
    * @param target The collection to which an event is raised.
    * @param changes A Sys.CollectionChange object that contains the list of changes that were performed on the collection since the last event.
    */
  def raiseCollectionChanged(target: js.Array[_], changes: CollectionChange): Unit = js.native
  /**
    * Raises an observable event on the target.
    * @param target The target object.
    * @param eventName A string that contains the event name.
    * @param eventArgs A Sys.EventArgs object used to pass event argument information.
    */
  def raiseEvent(target: js.Any, eventName: String, eventArgs: EventArgs): Unit = js.native
  /**
    * Raises a propertyChanged notification event.
    * @param target The object to which an event is raised.
    * @param propertyName The name of the property that changed.
    */
  def raisePropertyChanged(target: js.Any, propertyName: String): Unit = js.native
  /**
    * Removes the first occurrence of an item from the array in an observable manner.
    * @param target The array to which the item will be removed.
    * @param item The item to remove.
    * @return true if the item is found in the array. Otherwise false.
    */
  def remove(target: js.Array[_], item: js.Any): Boolean = js.native
  /**
    * Removes the item at the specified index from the array in an observable manner.
    * @param target The array to which an item is removed.
    * @param index A number that represents the index of the item to remove.
    */
  def removeAt(target: js.Array[_], index: Double): Unit = js.native
  /**
    * Removes the collectionChanged event handler from the target.
    * @param target The array from which the collectionChanged event handler is removed.
    * @param handler The function to remove.
    */
  def removeCollectionChanged(target: js.Any, handler: js.Function): Unit = js.native
  /**
    * Removes a propertyChanged event handler from the target.
    * @param target The object to observe.
    * @param handler The event handler to remove.
    */
  def removeEventHandler(target: js.Any, handler: js.Function): Unit = js.native
  /**
    * Sets a property or field on the target in an observable manner.
    * The raisePropertyChanged method is called after the setValue method set the value of the target object property.
    * @param target The object to which the property is set.
    * @param propertyName A string that contains the name of the property or field to set.
    * @param value The value to set.
    */
  def setValue(target: js.Any, propertyName: String, value: js.Any): Unit = js.native
}

