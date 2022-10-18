package typings.openui5.anon

import typings.openui5.int
import typings.openui5.sapUiCoreItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  /**
    * ID of the ListBox which triggered the event.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The currently selected index of the ListBox. In the case of multiple selection, this is exactly one of
    * the selected indices - the one whose selection has triggered the selection change. To get all currently
    * selected indices, use selectedIndices.
    */
  var selectedIndex: js.UndefOr[int] = js.undefined
  
  /**
    * Array containing the indices which are selected.
    */
  var selectedIndices: js.UndefOr[js.Array[int]] = js.undefined
  
  /**
    * The currently selected item of the ListBox. In the case of multiple selection, this is exactly one of
    * the selected items - the one whose selection has triggered the selection change.
    */
  var selectedItem: js.UndefOr[default] = js.undefined
}
object Id {
  
  inline def apply(): Id = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Id]
  }
  
  extension [Self <: Id](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setSelectedIndex(value: int): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    
    inline def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
    
    inline def setSelectedIndices(value: js.Array[int]): Self = StObject.set(x, "selectedIndices", value.asInstanceOf[js.Any])
    
    inline def setSelectedIndicesUndefined: Self = StObject.set(x, "selectedIndices", js.undefined)
    
    inline def setSelectedIndicesVarargs(value: int*): Self = StObject.set(x, "selectedIndices", js.Array(value*))
    
    inline def setSelectedItem(value: default): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
  }
}
