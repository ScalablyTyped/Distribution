package typings.openui5.anon

import typings.openui5.sapMFacetFilterItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllSelected extends StObject {
  
  /**
    * `True` if the select All checkbox is selected. This will be `false` if all items are actually selected
    * (every FacetFilterItem.selected == true). In that case selectedItems will contain all selected items.
    */
  var allSelected: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Array of selected items. Items returned are only copies and therefore can only be used to read properties,
    * not set them.
    */
  var selectedItems: js.UndefOr[js.Array[default]] = js.undefined
  
  /**
    * Associative array containing the keys of selected FacetFilterItems. Unlike the selectedItems parameter,
    * this contains only the keys for all selected items, not the items themselves. Being an associative array,
    * each object property is the FacetFilterItem key value and the value of the property is the FacetFilterItem
    * text.
    */
  var selectedKeys: js.UndefOr[js.Object] = js.undefined
}
object AllSelected {
  
  inline def apply(): AllSelected = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllSelected]
  }
  
  extension [Self <: AllSelected](x: Self) {
    
    inline def setAllSelected(value: Boolean): Self = StObject.set(x, "allSelected", value.asInstanceOf[js.Any])
    
    inline def setAllSelectedUndefined: Self = StObject.set(x, "allSelected", js.undefined)
    
    inline def setSelectedItems(value: js.Array[default]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
    
    inline def setSelectedItemsVarargs(value: default*): Self = StObject.set(x, "selectedItems", js.Array(value*))
    
    inline def setSelectedKeys(value: js.Object): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
    
    inline def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
  }
}
