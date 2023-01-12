package typings.openui5.anon

import typings.openui5.sapUiUnifiedMenuMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Menu extends StObject {
  
  /**
    * Refence to the selected `menu` instance to be opened.
    */
  var menu: js.UndefOr[default] = js.undefined
}
object Menu {
  
  inline def apply(): Menu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Menu]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Menu] (val x: Self) extends AnyVal {
    
    inline def setMenu(value: default): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
  }
}
