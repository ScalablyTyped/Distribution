package typings.openfin

import typings.openfin.preloadScriptMod.PreloadScript
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webOptionsMod {
  
  trait WebOptions extends StObject {
    
    var contentRedirect: js.UndefOr[js.Any] = js.undefined
    
    var customContext: js.UndefOr[js.Any] = js.undefined
    
    var experimental: js.UndefOr[js.Any] = js.undefined
    
    var name: String
    
    var preloadScripts: js.UndefOr[js.Array[PreloadScript]] = js.undefined
    
    var uuid: String
  }
  object WebOptions {
    
    @scala.inline
    def apply(name: String, uuid: String): WebOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebOptions]
    }
    
    @scala.inline
    implicit class WebOptionsMutableBuilder[Self <: WebOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentRedirect(value: js.Any): Self = StObject.set(x, "contentRedirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentRedirectUndefined: Self = StObject.set(x, "contentRedirect", js.undefined)
      
      @scala.inline
      def setCustomContext(value: js.Any): Self = StObject.set(x, "customContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomContextUndefined: Self = StObject.set(x, "customContext", js.undefined)
      
      @scala.inline
      def setExperimental(value: js.Any): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadScripts(value: js.Array[PreloadScript]): Self = StObject.set(x, "preloadScripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadScriptsUndefined: Self = StObject.set(x, "preloadScripts", js.undefined)
      
      @scala.inline
      def setPreloadScriptsVarargs(value: PreloadScript*): Self = StObject.set(x, "preloadScripts", js.Array(value :_*))
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
}
