package typings.openui5.anon

import typings.openui5.sapMListItemBaseMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListItems extends StObject {
  
  /**
    * The item whose selection has changed. In `MultiSelect` mode, only the up-most selected item is returned.
    * This parameter can be used for single-selection modes.
    */
  var listItem: js.UndefOr[default] = js.undefined
  
  /**
    * Array of items whose selection has changed. This parameter can be used for `MultiSelect` mode.
    */
  var listItems: js.UndefOr[js.Array[default]] = js.undefined
  
  /**
    * Indicates whether the select all action is triggered or not.
    */
  var selectAll: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the `listItem` parameter is selected or not.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
}
object ListItems {
  
  inline def apply(): ListItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItems]
  }
  
  extension [Self <: ListItems](x: Self) {
    
    inline def setListItem(value: default): Self = StObject.set(x, "listItem", value.asInstanceOf[js.Any])
    
    inline def setListItemUndefined: Self = StObject.set(x, "listItem", js.undefined)
    
    inline def setListItems(value: js.Array[default]): Self = StObject.set(x, "listItems", value.asInstanceOf[js.Any])
    
    inline def setListItemsUndefined: Self = StObject.set(x, "listItems", js.undefined)
    
    inline def setListItemsVarargs(value: default*): Self = StObject.set(x, "listItems", js.Array(value*))
    
    inline def setSelectAll(value: Boolean): Self = StObject.set(x, "selectAll", value.asInstanceOf[js.Any])
    
    inline def setSelectAllUndefined: Self = StObject.set(x, "selectAll", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
