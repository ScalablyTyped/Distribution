package typings.openui5.anon

import typings.openui5.sapUiCoreMvcControllerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewContent extends StObject {
  
  /**
    * defines how the view source is loaded and rendered later on
    */
  var async: js.UndefOr[Boolean] = js.undefined
  
  /**
    * controller to be used for this view instance
    */
  var controller: js.UndefOr[default] = js.undefined
  
  /**
    * view definition as a JSON string or an object literal
    */
  var viewContent: js.UndefOr[String | js.Object] = js.undefined
  
  /**
    * name of a view resource in module name notation (without suffix)
    */
  var viewName: js.UndefOr[String] = js.undefined
}
object ViewContent {
  
  inline def apply(): ViewContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewContent]
  }
  
  extension [Self <: ViewContent](x: Self) {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setController(value: default): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    inline def setViewContent(value: String | js.Object): Self = StObject.set(x, "viewContent", value.asInstanceOf[js.Any])
    
    inline def setViewContentUndefined: Self = StObject.set(x, "viewContent", js.undefined)
    
    inline def setViewName(value: String): Self = StObject.set(x, "viewName", value.asInstanceOf[js.Any])
    
    inline def setViewNameUndefined: Self = StObject.set(x, "viewName", js.undefined)
  }
}
