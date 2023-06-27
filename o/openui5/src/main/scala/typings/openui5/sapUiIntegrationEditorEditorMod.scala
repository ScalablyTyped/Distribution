package typings.openui5

import typings.openui5.anon.Headers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiIntegrationEditorEditorMod {
  
  trait EditorFacade extends StObject {
    
    var __implements__sap_ui_integration_editor_EditorFacade: Boolean
    
    /**
      * @experimental (since 1.94)
      *
      * Performs an HTTP request using the given configuration.
      *
      * @returns Resolves when the request is successful, rejects otherwise.
      */
    def request(/**
      * The configuration of the request.
      */
    oConfiguration: Headers): js.Promise[Any]
  }
  object EditorFacade {
    
    inline def apply(__implements__sap_ui_integration_editor_EditorFacade: Boolean, request: Headers => js.Promise[Any]): EditorFacade = {
      val __obj = js.Dynamic.literal(__implements__sap_ui_integration_editor_EditorFacade = __implements__sap_ui_integration_editor_EditorFacade.asInstanceOf[js.Any], request = js.Any.fromFunction1(request))
      __obj.asInstanceOf[EditorFacade]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditorFacade] (val x: Self) extends AnyVal {
      
      inline def setRequest(value: Headers => js.Promise[Any]): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
      
      inline def set__implements__sap_ui_integration_editor_EditorFacade(value: Boolean): Self = StObject.set(x, "__implements__sap_ui_integration_editor_EditorFacade", value.asInstanceOf[js.Any])
    }
  }
}
