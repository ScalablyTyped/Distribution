package typings.openui5.sapUiCoreLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mvc {
  
  /**
    * @since 1.56.0
    *
    * Marker interface for a ControllerExtension.
    */
  trait IControllerExtension extends StObject {
    
    var __implements__sap_ui_core_mvc_IControllerExtension: Boolean
  }
  object IControllerExtension {
    
    inline def apply(__implements__sap_ui_core_mvc_IControllerExtension: Boolean): IControllerExtension = {
      val __obj = js.Dynamic.literal(__implements__sap_ui_core_mvc_IControllerExtension = __implements__sap_ui_core_mvc_IControllerExtension.asInstanceOf[js.Any])
      __obj.asInstanceOf[IControllerExtension]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IControllerExtension] (val x: Self) extends AnyVal {
      
      inline def set__implements__sap_ui_core_mvc_IControllerExtension(value: Boolean): Self = StObject.set(x, "__implements__sap_ui_core_mvc_IControllerExtension", value.asInstanceOf[js.Any])
    }
  }
}
