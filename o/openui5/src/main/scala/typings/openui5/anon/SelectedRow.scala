package typings.openui5.anon

import typings.openui5.sapUiCoreItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedRow extends StObject {
  
  /**
    * This is the item selected in the suggestion popup for one and two-value suggestions. For tabular suggestions,
    * this value will not be set.
    */
  var selectedItem: js.UndefOr[default] = js.undefined
  
  /**
    * This is the row selected in the tabular suggestion popup represented as a ColumnListItem. For one and
    * two-value suggestions, this value will not be set.
    *
    * **Note:** The row result function to select a result value for the string is already executed at this
    * time. To pick different value for the input field or to do follow up steps after the item has been selected.
    */
  var selectedRow: js.UndefOr[typings.openui5.sapMColumnListItemMod.default] = js.undefined
}
object SelectedRow {
  
  inline def apply(): SelectedRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedRow]
  }
  
  extension [Self <: SelectedRow](x: Self) {
    
    inline def setSelectedItem(value: default): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
    
    inline def setSelectedRow(value: typings.openui5.sapMColumnListItemMod.default): Self = StObject.set(x, "selectedRow", value.asInstanceOf[js.Any])
    
    inline def setSelectedRowUndefined: Self = StObject.set(x, "selectedRow", js.undefined)
  }
}
