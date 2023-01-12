package typings.openui5.anon

import typings.openui5.sapUiUx3NavigationItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemKey extends StObject {
  
  /**
    * Id of selected NavigationItem
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The selected NavigationItem
    */
  var item: js.UndefOr[default] = js.undefined
  
  /**
    * Key of selected NavigationItem
    */
  var key: js.UndefOr[String] = js.undefined
}
object ItemKey {
  
  inline def apply(): ItemKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemKey] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setItem(value: default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
