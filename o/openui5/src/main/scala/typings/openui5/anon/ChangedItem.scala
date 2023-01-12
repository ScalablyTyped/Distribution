package typings.openui5.anon

import typings.openui5.sapUiCoreItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangedItem extends StObject {
  
  /**
    * Item which selection is changed
    */
  var changedItem: js.UndefOr[default] = js.undefined
  
  /**
    * Array of items whose selection has changed.
    */
  var changedItems: js.UndefOr[js.Array[default]] = js.undefined
  
  /**
    * Indicates whether the select all action is triggered or not.
    */
  var selectAll: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Selection state: true if item is selected, false if item is not selected
    */
  var selected: js.UndefOr[Boolean] = js.undefined
}
object ChangedItem {
  
  inline def apply(): ChangedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangedItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangedItem] (val x: Self) extends AnyVal {
    
    inline def setChangedItem(value: default): Self = StObject.set(x, "changedItem", value.asInstanceOf[js.Any])
    
    inline def setChangedItemUndefined: Self = StObject.set(x, "changedItem", js.undefined)
    
    inline def setChangedItems(value: js.Array[default]): Self = StObject.set(x, "changedItems", value.asInstanceOf[js.Any])
    
    inline def setChangedItemsUndefined: Self = StObject.set(x, "changedItems", js.undefined)
    
    inline def setChangedItemsVarargs(value: default*): Self = StObject.set(x, "changedItems", js.Array(value*))
    
    inline def setSelectAll(value: Boolean): Self = StObject.set(x, "selectAll", value.asInstanceOf[js.Any])
    
    inline def setSelectAllUndefined: Self = StObject.set(x, "selectAll", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
