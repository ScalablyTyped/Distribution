package typings.microsoftAjax.Sys

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a change in a collection.
  * @see {@link http://msdn.microsoft.com/en-us/library/dd393798(v=vs.100).aspx}
  */
@js.native
trait CollectionChange extends StObject {
  
  //#endregion
  //#region Fields
  /**
    * Gets a NotifyCollectionChangedAction object that contains the change action enumeration value.
    * @return A NotifyCollectionChangedAction object.
    */
  var action: NotifyCollectionChangedAction = js.native
  
  /**
    * @return An array of items that were added.
    */
  var newItems: js.Array[_] = js.native
  
  /**
    * The index where new items have been inserted.
    * @return An integer that represents the index where new items have been inserted.
    */
  var newStartingIndex: Double = js.native
  
  /**
    * The items that were removed when the NotifyCollectionChangedAction object is set to remove.
    * @return An array containing the items that were removed.
    */
  var oldItems: js.Array[_] = js.native
  
  /**
    * Gets the index where old items have been removed.
    * @return An integer that represents the index where old items have been removed.
    */
  var oldStartingIndex: Double = js.native
}
object CollectionChange {
  
  @scala.inline
  def apply(
    action: NotifyCollectionChangedAction,
    newItems: js.Array[_],
    newStartingIndex: Double,
    oldItems: js.Array[_],
    oldStartingIndex: Double
  ): CollectionChange = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], newItems = newItems.asInstanceOf[js.Any], newStartingIndex = newStartingIndex.asInstanceOf[js.Any], oldItems = oldItems.asInstanceOf[js.Any], oldStartingIndex = oldStartingIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionChange]
  }
  
  @scala.inline
  implicit class CollectionChangeMutableBuilder[Self <: CollectionChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: NotifyCollectionChangedAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewItems(value: js.Array[_]): Self = StObject.set(x, "newItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewItemsVarargs(value: js.Any*): Self = StObject.set(x, "newItems", js.Array(value :_*))
    
    @scala.inline
    def setNewStartingIndex(value: Double): Self = StObject.set(x, "newStartingIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldItems(value: js.Array[_]): Self = StObject.set(x, "oldItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldItemsVarargs(value: js.Any*): Self = StObject.set(x, "oldItems", js.Array(value :_*))
    
    @scala.inline
    def setOldStartingIndex(value: Double): Self = StObject.set(x, "oldStartingIndex", value.asInstanceOf[js.Any])
  }
}
