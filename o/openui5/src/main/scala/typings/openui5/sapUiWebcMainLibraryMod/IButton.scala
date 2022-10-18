package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IButton extends StObject {
  
  var __implements__sap_ui_webc_main_IButton: Boolean
}
object IButton {
  
  inline def apply(__implements__sap_ui_webc_main_IButton: Boolean): IButton = {
    val __obj = js.Dynamic.literal(__implements__sap_ui_webc_main_IButton = __implements__sap_ui_webc_main_IButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[IButton]
  }
  
  extension [Self <: IButton](x: Self) {
    
    inline def set__implements__sap_ui_webc_main_IButton(value: Boolean): Self = StObject.set(x, "__implements__sap_ui_webc_main_IButton", value.asInstanceOf[js.Any])
  }
}
