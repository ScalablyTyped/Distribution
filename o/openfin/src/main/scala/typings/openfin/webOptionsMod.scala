package typings.openfin

import typings.openfin.preloadScriptMod.PreloadScript
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webOptionsMod {
  
  trait WebOptions extends StObject {
    
    var contentRedirect: js.UndefOr[Any] = js.undefined
    
    var customContext: js.UndefOr[Any] = js.undefined
    
    var experimental: js.UndefOr[Any] = js.undefined
    
    var name: String
    
    var preloadScripts: js.UndefOr[js.Array[PreloadScript]] = js.undefined
    
    var uuid: String
  }
  object WebOptions {
    
    inline def apply(name: String, uuid: String): WebOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebOptions]
    }
    
    extension [Self <: WebOptions](x: Self) {
      
      inline def setContentRedirect(value: Any): Self = StObject.set(x, "contentRedirect", value.asInstanceOf[js.Any])
      
      inline def setContentRedirectUndefined: Self = StObject.set(x, "contentRedirect", js.undefined)
      
      inline def setCustomContext(value: Any): Self = StObject.set(x, "customContext", value.asInstanceOf[js.Any])
      
      inline def setCustomContextUndefined: Self = StObject.set(x, "customContext", js.undefined)
      
      inline def setExperimental(value: Any): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
      
      inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPreloadScripts(value: js.Array[PreloadScript]): Self = StObject.set(x, "preloadScripts", value.asInstanceOf[js.Any])
      
      inline def setPreloadScriptsUndefined: Self = StObject.set(x, "preloadScripts", js.undefined)
      
      inline def setPreloadScriptsVarargs(value: PreloadScript*): Self = StObject.set(x, "preloadScripts", js.Array(value*))
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
}
