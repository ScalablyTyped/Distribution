package typings.openui5.anon

import typings.openui5.sapMUploadCollectionItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedSelectedItem extends StObject {
  
  /**
    * Indicates whether the `listItem` parameter is selected or not.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The item whose selection has changed. In `MultiSelect` mode, only the topmost selected item is returned.
    * This parameter can be used for single-selection modes.
    */
  var selectedItem: js.UndefOr[default] = js.undefined
  
  /**
    * Array of items whose selection has changed. This parameter can be used for `MultiSelect` mode.
    */
  var selectedItems: js.UndefOr[js.Array[default]] = js.undefined
}
object SelectedSelectedItem {
  
  inline def apply(): SelectedSelectedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedSelectedItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectedSelectedItem] (val x: Self) extends AnyVal {
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedItem(value: default): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
    
    inline def setSelectedItems(value: js.Array[default]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
    
    inline def setSelectedItemsVarargs(value: default*): Self = StObject.set(x, "selectedItems", js.Array(value*))
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
