package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMenuItem extends StObject {
  
  var __implements__sap_ui_webc_main_IMenuItem: Boolean
}
object IMenuItem {
  
  inline def apply(__implements__sap_ui_webc_main_IMenuItem: Boolean): IMenuItem = {
    val __obj = js.Dynamic.literal(__implements__sap_ui_webc_main_IMenuItem = __implements__sap_ui_webc_main_IMenuItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMenuItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMenuItem] (val x: Self) extends AnyVal {
    
    inline def set__implements__sap_ui_webc_main_IMenuItem(value: Boolean): Self = StObject.set(x, "__implements__sap_ui_webc_main_IMenuItem", value.asInstanceOf[js.Any])
  }
}
