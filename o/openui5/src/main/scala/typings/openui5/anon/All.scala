package typings.openui5.anon

import typings.openui5.int
import typings.openui5.sapUiCoreListItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait All extends StObject {
  
  /**
    * If it is true, then Item All is selected. That means all items in the list are selected - no filter is
    * set.
    */
  var all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Id of the FacetFilterList taht fires the event.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Array of selected Indices.
    */
  var selectedIndices: js.UndefOr[js.Array[int]] = js.undefined
  
  /**
    * Array of selected Items.
    */
  var selectedItems: js.UndefOr[js.Array[default]] = js.undefined
}
object All {
  
  inline def apply(): All = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[All]
  }
  
  extension [Self <: All](x: Self) {
    
    inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setSelectedIndices(value: js.Array[int]): Self = StObject.set(x, "selectedIndices", value.asInstanceOf[js.Any])
    
    inline def setSelectedIndicesUndefined: Self = StObject.set(x, "selectedIndices", js.undefined)
    
    inline def setSelectedIndicesVarargs(value: int*): Self = StObject.set(x, "selectedIndices", js.Array(value*))
    
    inline def setSelectedItems(value: js.Array[default]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
    
    inline def setSelectedItemsVarargs(value: default*): Self = StObject.set(x, "selectedItems", js.Array(value*))
  }
}
