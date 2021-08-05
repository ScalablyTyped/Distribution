package typings.microsoftAjax.Sys

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a change in a collection.
  * @see {@link http://msdn.microsoft.com/en-us/library/dd393798(v=vs.100).aspx}
  */
trait CollectionChange extends StObject {
  
  //#endregion
  //#region Fields
  /**
    * Gets a NotifyCollectionChangedAction object that contains the change action enumeration value.
    * @return A NotifyCollectionChangedAction object.
    */
  var action: NotifyCollectionChangedAction
  
  /**
    * @return An array of items that were added.
    */
  var newItems: js.Array[js.Any]
  
  /**
    * The index where new items have been inserted.
    * @return An integer that represents the index where new items have been inserted.
    */
  var newStartingIndex: Double
  
  /**
    * The items that were removed when the NotifyCollectionChangedAction object is set to remove.
    * @return An array containing the items that were removed.
    */
  var oldItems: js.Array[js.Any]
  
  /**
    * Gets the index where old items have been removed.
    * @return An integer that represents the index where old items have been removed.
    */
  var oldStartingIndex: Double
}
object CollectionChange {
  
  inline def apply(
    action: NotifyCollectionChangedAction,
    newItems: js.Array[js.Any],
    newStartingIndex: Double,
    oldItems: js.Array[js.Any],
    oldStartingIndex: Double
  ): CollectionChange = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], newItems = newItems.asInstanceOf[js.Any], newStartingIndex = newStartingIndex.asInstanceOf[js.Any], oldItems = oldItems.asInstanceOf[js.Any], oldStartingIndex = oldStartingIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionChange]
  }
  
  extension [Self <: CollectionChange](x: Self) {
    
    inline def setAction(value: NotifyCollectionChangedAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setNewItems(value: js.Array[js.Any]): Self = StObject.set(x, "newItems", value.asInstanceOf[js.Any])
    
    inline def setNewItemsVarargs(value: js.Any*): Self = StObject.set(x, "newItems", js.Array(value :_*))
    
    inline def setNewStartingIndex(value: Double): Self = StObject.set(x, "newStartingIndex", value.asInstanceOf[js.Any])
    
    inline def setOldItems(value: js.Array[js.Any]): Self = StObject.set(x, "oldItems", value.asInstanceOf[js.Any])
    
    inline def setOldItemsVarargs(value: js.Any*): Self = StObject.set(x, "oldItems", js.Array(value :_*))
    
    inline def setOldStartingIndex(value: Double): Self = StObject.set(x, "oldStartingIndex", value.asInstanceOf[js.Any])
  }
}
