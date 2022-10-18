package typings.openui5.anon

import typings.openui5.sapUiCoreMvcControllerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Definition extends StObject {
  
  /**
    * Controller instance to be used for this view. The given controller instance overrides the controller
    * defined in the view definition. Sharing a controller instance between multiple views is not supported.
    */
  var controller: js.UndefOr[default] = js.undefined
  
  /**
    * view definition as a JSON string or an object literal
    */
  var definition: js.UndefOr[String | js.Object] = js.undefined
  
  /**
    * Specifies an ID for the view instance. If no ID is given, an ID will be generated.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The view name (in dot-notation) that corresponds to a JSON resource that can be loaded via the module
    * system (viewName + suffix ".view.json").
    */
  var viewName: js.UndefOr[String] = js.undefined
}
object Definition {
  
  inline def apply(): Definition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Definition]
  }
  
  extension [Self <: Definition](x: Self) {
    
    inline def setController(value: default): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    inline def setDefinition(value: String | js.Object): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setViewName(value: String): Self = StObject.set(x, "viewName", value.asInstanceOf[js.Any])
    
    inline def setViewNameUndefined: Self = StObject.set(x, "viewName", js.undefined)
  }
}
