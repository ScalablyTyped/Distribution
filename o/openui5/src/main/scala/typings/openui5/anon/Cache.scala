package typings.openui5.anon

import typings.openui5.sapUiCoreMvcControllerMod.default
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cache extends StObject {
  
  /**
    * Cache configuration; caching gets active when this object is provided with vView.cache.keys array; keys
    * are used to store data in the cache and for invalidation of the cache.
    */
  var cache: js.UndefOr[`6`] = js.undefined
  
  /**
    * Controller instance to be used for this view. The given controller instance overrides the controller
    * defined in the view definition. Sharing one controller instance between multiple views is not possible.
    */
  var controller: js.UndefOr[default] = js.undefined
  
  /**
    * XML string or XML document that defines the view. Exactly one of `viewName` or `definition` must be given.
    */
  var definition: js.UndefOr[String | Document] = js.undefined
  
  /**
    * Specifies an ID for the View instance. If no ID is given, an ID will be generated.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Preprocessors configuration, see {@link sap.ui.core.mvc.View} **Note**: These preprocessors are only
    * available to this instance. For global or on-demand availability use {@link sap.ui.core.mvc.XMLView.registerPreprocessor}.
    */
  var preprocessors: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Corresponds to an XML module that can be loaded via the module system (oOptions.viewName + suffix ".view.xml")
    */
  var viewName: js.UndefOr[String] = js.undefined
}
object Cache {
  
  inline def apply(): Cache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cache]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cache] (val x: Self) extends AnyVal {
    
    inline def setCache(value: `6`): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setController(value: default): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    inline def setDefinition(value: String | Document): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPreprocessors(value: js.Object): Self = StObject.set(x, "preprocessors", value.asInstanceOf[js.Any])
    
    inline def setPreprocessorsUndefined: Self = StObject.set(x, "preprocessors", js.undefined)
    
    inline def setViewName(value: String): Self = StObject.set(x, "viewName", value.asInstanceOf[js.Any])
    
    inline def setViewNameUndefined: Self = StObject.set(x, "viewName", js.undefined)
  }
}
