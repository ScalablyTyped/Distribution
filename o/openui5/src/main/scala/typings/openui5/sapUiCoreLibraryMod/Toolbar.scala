package typings.openui5.sapUiCoreLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Toolbar extends StObject {
  
  var __implements__sap_ui_core_Toolbar: Boolean
}
object Toolbar {
  
  inline def apply(__implements__sap_ui_core_Toolbar: Boolean): Toolbar = {
    val __obj = js.Dynamic.literal(__implements__sap_ui_core_Toolbar = __implements__sap_ui_core_Toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Toolbar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Toolbar] (val x: Self) extends AnyVal {
    
    inline def set__implements__sap_ui_core_Toolbar(value: Boolean): Self = StObject.set(x, "__implements__sap_ui_core_Toolbar", value.asInstanceOf[js.Any])
  }
}
