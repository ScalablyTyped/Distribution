package typings.openui5.anon

import typings.openui5.sapMStandardListItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedContexts extends StObject {
  
  /**
    * Returns the binding contexts of the selected items including the non-visible items, but excluding the
    * not loaded items. See {@link sap.m.ListBase#getSelectedContexts getSelectedContexts} of `sap.m.ListBase`.
    * NOTE: In contrast to the parameter "selectedItems", this parameter will also include the selected but
    * NOT visible items (e.g. due to list filtering). An empty array will be set for this parameter if no data
    * binding is used. NOTE: When the list binding is pre-filtered and there are items in the selection that
    * are not visible upon opening the dialog, these contexts are not loaded. Therefore, these items will not
    * be included in the selectedContexts array unless they are displayed at least once.
    */
  var selectedContexts: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  /**
    * Returns the selected list item. When no item is selected, "null" is returned. When multi-selection is
    * enabled and multiple items are selected, only the first selected item is returned.
    */
  var selectedItem: js.UndefOr[default] = js.undefined
  
  /**
    * Returns an array containing the visible selected list items. If no items are selected, an empty array
    * is returned.
    */
  var selectedItems: js.UndefOr[js.Array[default]] = js.undefined
}
object SelectedContexts {
  
  inline def apply(): SelectedContexts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedContexts]
  }
  
  extension [Self <: SelectedContexts](x: Self) {
    
    inline def setSelectedContexts(value: js.Array[js.Object]): Self = StObject.set(x, "selectedContexts", value.asInstanceOf[js.Any])
    
    inline def setSelectedContextsUndefined: Self = StObject.set(x, "selectedContexts", js.undefined)
    
    inline def setSelectedContextsVarargs(value: js.Object*): Self = StObject.set(x, "selectedContexts", js.Array(value*))
    
    inline def setSelectedItem(value: default): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
    
    inline def setSelectedItems(value: js.Array[default]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
    
    inline def setSelectedItemsVarargs(value: default*): Self = StObject.set(x, "selectedItems", js.Array(value*))
  }
}
