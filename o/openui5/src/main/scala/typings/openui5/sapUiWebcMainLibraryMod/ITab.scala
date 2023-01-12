package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITab extends StObject {
  
  var __implements__sap_ui_webc_main_ITab: Boolean
}
object ITab {
  
  inline def apply(__implements__sap_ui_webc_main_ITab: Boolean): ITab = {
    val __obj = js.Dynamic.literal(__implements__sap_ui_webc_main_ITab = __implements__sap_ui_webc_main_ITab.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITab]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITab] (val x: Self) extends AnyVal {
    
    inline def set__implements__sap_ui_webc_main_ITab(value: Boolean): Self = StObject.set(x, "__implements__sap_ui_webc_main_ITab", value.asInstanceOf[js.Any])
  }
}
