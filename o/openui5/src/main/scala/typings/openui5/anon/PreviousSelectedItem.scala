package typings.openui5.anon

import typings.openui5.sapUiCoreItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviousSelectedItem extends StObject {
  
  /**
    * The previous selected item.
    */
  var previousSelectedItem: js.UndefOr[default] = js.undefined
  
  /**
    * The selected item.
    */
  var selectedItem: js.UndefOr[default] = js.undefined
}
object PreviousSelectedItem {
  
  inline def apply(): PreviousSelectedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreviousSelectedItem]
  }
  
  extension [Self <: PreviousSelectedItem](x: Self) {
    
    inline def setPreviousSelectedItem(value: default): Self = StObject.set(x, "previousSelectedItem", value.asInstanceOf[js.Any])
    
    inline def setPreviousSelectedItemUndefined: Self = StObject.set(x, "previousSelectedItem", js.undefined)
    
    inline def setSelectedItem(value: default): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
  }
}
