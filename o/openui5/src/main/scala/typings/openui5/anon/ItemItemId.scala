package typings.openui5.anon

import typings.openui5.sapUiUx3NavigationItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemItemId extends StObject {
  
  /**
    * The newly selected NavigationItem.
    */
  var item: js.UndefOr[default] = js.undefined
  
  /**
    * The ID of the newly selected NavigationItem.
    */
  var itemId: js.UndefOr[String] = js.undefined
}
object ItemItemId {
  
  inline def apply(): ItemItemId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemItemId]
  }
  
  extension [Self <: ItemItemId](x: Self) {
    
    inline def setItem(value: default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
