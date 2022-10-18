package typings.openui5.anon

import typings.openui5.sapUiCoreItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdItem extends StObject {
  
  /**
    * The ID of the selected PaneBarItem.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The selected Item
    */
  var item: js.UndefOr[default] = js.undefined
  
  /**
    * The key of the selected Item (or null if there is no key)
    */
  var key: js.UndefOr[String] = js.undefined
}
object IdItem {
  
  inline def apply(): IdItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdItem]
  }
  
  extension [Self <: IdItem](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setItem(value: default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
