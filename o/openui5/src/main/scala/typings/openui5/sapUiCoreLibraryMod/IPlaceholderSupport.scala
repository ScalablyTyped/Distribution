package typings.openui5.sapUiCoreLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPlaceholderSupport extends StObject {
  
  var __implements__sap_ui_core_IPlaceholderSupport: Boolean
}
object IPlaceholderSupport {
  
  inline def apply(__implements__sap_ui_core_IPlaceholderSupport: Boolean): IPlaceholderSupport = {
    val __obj = js.Dynamic.literal(__implements__sap_ui_core_IPlaceholderSupport = __implements__sap_ui_core_IPlaceholderSupport.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlaceholderSupport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPlaceholderSupport] (val x: Self) extends AnyVal {
    
    inline def set__implements__sap_ui_core_IPlaceholderSupport(value: Boolean): Self = StObject.set(x, "__implements__sap_ui_core_IPlaceholderSupport", value.asInstanceOf[js.Any])
  }
}
