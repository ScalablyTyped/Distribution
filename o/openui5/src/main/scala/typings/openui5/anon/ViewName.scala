package typings.openui5.anon

import typings.openui5.sapUiCoreMvcControllerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewName extends StObject {
  
  /**
    * Controller instance to be used for this view. The given controller instance overrides the controller
    * defined in the view definition. Sharing a controller instance between multiple views is not supported.
    */
  var controller: js.UndefOr[default] = js.undefined
  
  /**
    * Specifies an ID for the view instance. If no ID is given, an ID will be generated.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the view definition. The view must still be defined using {@link sap.ui.jsview}.
    */
  var viewName: js.UndefOr[String] = js.undefined
}
object ViewName {
  
  inline def apply(): ViewName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewName]
  }
  
  extension [Self <: ViewName](x: Self) {
    
    inline def setController(value: default): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setViewName(value: String): Self = StObject.set(x, "viewName", value.asInstanceOf[js.Any])
    
    inline def setViewNameUndefined: Self = StObject.set(x, "viewName", js.undefined)
  }
}
