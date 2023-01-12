package typings.openui5.sapUiWebcFioriLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShellBarItem extends StObject {
  
  var __implements__sap_ui_webc_fiori_IShellBarItem: Boolean
}
object IShellBarItem {
  
  inline def apply(__implements__sap_ui_webc_fiori_IShellBarItem: Boolean): IShellBarItem = {
    val __obj = js.Dynamic.literal(__implements__sap_ui_webc_fiori_IShellBarItem = __implements__sap_ui_webc_fiori_IShellBarItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShellBarItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IShellBarItem] (val x: Self) extends AnyVal {
    
    inline def set__implements__sap_ui_webc_fiori_IShellBarItem(value: Boolean): Self = StObject.set(x, "__implements__sap_ui_webc_fiori_IShellBarItem", value.asInstanceOf[js.Any])
  }
}
