package typings.openui5.anon

import typings.openui5.sapUiCoreMvcControllerMod.default
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncCache extends StObject {
  
  /**
    * whether the view source is loaded asynchronously
    */
  var async: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Cache configuration, only for `async` views; caching gets active when this object is provided with vView.cache.keys
    * array; keys are used to store data in the cache and for invalidation of the cache
    */
  var cache: js.UndefOr[`36`] = js.undefined
  
  /**
    * Controller instance to be used for this view
    */
  var controller: js.UndefOr[default] = js.undefined
  
  /**
    * Preprocessors configuration, see {@link sap.ui.core.mvc.View}
    */
  var preprocessors: js.UndefOr[js.Object] = js.undefined
  
  /**
    * XML string or XML document that defines the view
    */
  var viewContent: js.UndefOr[String | Document] = js.undefined
  
  /**
    * Name of the view resource in module name notation (without suffix)
    */
  var viewName: js.UndefOr[String] = js.undefined
}
object AsyncCache {
  
  inline def apply(): AsyncCache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncCache]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AsyncCache] (val x: Self) extends AnyVal {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setCache(value: `36`): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setController(value: default): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    inline def setPreprocessors(value: js.Object): Self = StObject.set(x, "preprocessors", value.asInstanceOf[js.Any])
    
    inline def setPreprocessorsUndefined: Self = StObject.set(x, "preprocessors", js.undefined)
    
    inline def setViewContent(value: String | Document): Self = StObject.set(x, "viewContent", value.asInstanceOf[js.Any])
    
    inline def setViewContentUndefined: Self = StObject.set(x, "viewContent", js.undefined)
    
    inline def setViewName(value: String): Self = StObject.set(x, "viewName", value.asInstanceOf[js.Any])
    
    inline def setViewNameUndefined: Self = StObject.set(x, "viewName", js.undefined)
  }
}
