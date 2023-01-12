package typings.openui5.sapUiCoreLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITitleContent extends StObject {
  
  var __implements__sap_ui_core_ITitleContent: Boolean
}
object ITitleContent {
  
  inline def apply(__implements__sap_ui_core_ITitleContent: Boolean): ITitleContent = {
    val __obj = js.Dynamic.literal(__implements__sap_ui_core_ITitleContent = __implements__sap_ui_core_ITitleContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITitleContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITitleContent] (val x: Self) extends AnyVal {
    
    inline def set__implements__sap_ui_core_ITitleContent(value: Boolean): Self = StObject.set(x, "__implements__sap_ui_core_ITitleContent", value.asInstanceOf[js.Any])
  }
}
