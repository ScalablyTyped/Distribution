package typings.microsoftAjax.global.Sys

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Adds update and management functionality to target objects such as arrays, DOM elements, and objects.
  * The Sys.Observer class is based on the Observer pattern. The Sys.Observer class maintains a list of interested dependents (observers) in a separate object (the subject).
  * All methods that are contained in the Sys.Observer class are static.
  * In order to be used with the Sys.Observer class, an object must be an object, array, or DOM element.
  * @see {@link http://msdn.microsoft.com/en-us/library/dd393710(v=vs.100).aspx}
  */
@JSGlobal("Sys.Observer")
@js.native
class Observer ()
  extends StObject
     with typings.microsoftAjax.Sys.Observer
object Observer {
  
  @JSGlobal("Sys.Observer")
  @js.native
  val ^ : js.Any = js.native
  
  //#region Methods
  /**
    * Adds an item to the collection in an observable manner.
    * @param target
    *           The array to which an item will be added.
    * @param item
    *           The item to add.
    */
  /* static member */
  inline def add(target: js.Array[js.Any], item: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(target.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Adds an event handler to the target.
    * @param target The array to which an event handler will be added.
    * @param handler The event handler.
    */
  /* static member */
  inline def addCollectionChanged(target: js.Any, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCollectionChanged")(target.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Adds an observable event handler to the target.
    * @param eventName A string that contains the event name.
    * @param handler The added function.
    */
  /* static member */
  inline def addEventHandler(target: js.Any, eventName: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventHandler")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Adds a propertyChanged event handler to the target.
    * @param target The object to observe.
    * @param handler The function handler to add.
    */
  /* static member */
  inline def addPropertyChanged(target: js.Any, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPropertyChanged")(target.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Adds items to the collection in an observable manner.
    * @param target The array to which items will be added.
    * @param items The array of items to add.
    */
  /* static member */
  inline def addRange(target: js.Array[js.Any], items: js.Array[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRange")(target.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Begins the process of updating the target object.
    * @param target The object to update.
    */
  /* static member */
  inline def beginUpdate(target: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beginUpdate")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Clears the array of its elements in an observable manner.
    * @param target The array to clear.
    */
  /* static member */
  inline def clear(target: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Ends the process of updating the target object.
    * @param target The object being updated.
    */
  /* static member */
  inline def endUpdate(target: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("endUpdate")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Inserts an item at the specified index in an observable manner.
    * @param target The array to which the item is inserted.
    * @param index A number that represents the index where the item will be inserted.
    * @param item The item to insert.
    */
  /* static member */
  inline def insert(target: js.Any, index: Double, item: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(target.asInstanceOf[js.Any], index.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  //#endregion
  //#region Properties
  /**
    * Indicates that the target is being updated.
    * @param target The target object to update.
    * @return true if given target argument is currently updating; otherwise false.
    */
  /* static member */
  inline def isUpdating(target: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUpdating")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Makes an object directly observable by adding observable methods to it.
    * @param target The object, array, or DOM element to make observable.
    * @return The observable object.
    * @see {@link http://msdn.microsoft.com/en-us/library/dd393633(v=vs.100).aspx}
    */
  /* static member */
  inline def makeObservable(target: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeObservable")(target.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /**
    * Raises the collectionChanged event.
    * @param target The collection to which an event is raised.
    * @param changes A Sys.CollectionChange object that contains the list of changes that were performed on the collection since the last event.
    */
  /* static member */
  inline def raiseCollectionChanged(target: js.Array[js.Any], changes: typings.microsoftAjax.Sys.CollectionChange): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("raiseCollectionChanged")(target.asInstanceOf[js.Any], changes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Raises an observable event on the target.
    * @param target The target object.
    * @param eventName A string that contains the event name.
    * @param eventArgs A Sys.EventArgs object used to pass event argument information.
    */
  /* static member */
  inline def raiseEvent(target: js.Any, eventName: String, eventArgs: typings.microsoftAjax.Sys.EventArgs): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("raiseEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventArgs.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Raises a propertyChanged notification event.
    * @param target The object to which an event is raised.
    * @param propertyName The name of the property that changed.
    */
  /* static member */
  inline def raisePropertyChanged(target: js.Any, propertyName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("raisePropertyChanged")(target.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Removes the first occurrence of an item from the array in an observable manner.
    * @param target The array to which the item will be removed.
    * @param item The item to remove.
    * @return true if the item is found in the array. Otherwise false.
    */
  /* static member */
  inline def remove(target: js.Array[js.Any], item: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(target.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Removes the item at the specified index from the array in an observable manner.
    * @param target The array to which an item is removed.
    * @param index A number that represents the index of the item to remove.
    */
  /* static member */
  inline def removeAt(target: js.Array[js.Any], index: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAt")(target.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Removes the collectionChanged event handler from the target.
    * @param target The array from which the collectionChanged event handler is removed.
    * @param handler The function to remove.
    */
  /* static member */
  inline def removeCollectionChanged(target: js.Any, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeCollectionChanged")(target.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Removes a propertyChanged event handler from the target.
    * @param target The object to observe.
    * @param handler The event handler to remove.
    */
  /* static member */
  inline def removeEventHandler(target: js.Any, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventHandler")(target.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets a property or field on the target in an observable manner.
    * The raisePropertyChanged method is called after the setValue method set the value of the target object property.
    * @param target The object to which the property is set.
    * @param propertyName A string that contains the name of the property or field to set.
    * @param value The value to set.
    */
  /* static member */
  inline def setValue(target: js.Any, propertyName: String, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setValue")(target.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
