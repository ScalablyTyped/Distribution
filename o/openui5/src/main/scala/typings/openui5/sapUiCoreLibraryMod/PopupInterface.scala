package typings.openui5.sapUiCoreLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupInterface extends StObject {
  
  var __implements__sap_ui_core_PopupInterface: Boolean
}
object PopupInterface {
  
  inline def apply(__implements__sap_ui_core_PopupInterface: Boolean): PopupInterface = {
    val __obj = js.Dynamic.literal(__implements__sap_ui_core_PopupInterface = __implements__sap_ui_core_PopupInterface.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupInterface]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopupInterface] (val x: Self) extends AnyVal {
    
    inline def set__implements__sap_ui_core_PopupInterface(value: Boolean): Self = StObject.set(x, "__implements__sap_ui_core_PopupInterface", value.asInstanceOf[js.Any])
  }
}
