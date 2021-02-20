package typings.openfin

import typings.openfin.openfinStrings.`load-failed`
import typings.openfin.openfinStrings.`load-started`
import typings.openfin.openfinStrings.`load-succeeded`
import typings.openfin.openfinStrings.failed
import typings.openfin.openfinStrings.succeeded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object preloadScriptMod {
  
  @js.native
  trait PreloadScript extends StObject {
    
    var mandatory: js.UndefOr[Boolean] = js.native
    
    var state: js.UndefOr[`load-started` | `load-failed` | `load-succeeded` | failed | succeeded] = js.native
    
    var url: String = js.native
  }
  object PreloadScript {
    
    @scala.inline
    def apply(url: String): PreloadScript = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreloadScript]
    }
    
    @scala.inline
    implicit class PreloadScriptMutableBuilder[Self <: PreloadScript] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMandatory(value: Boolean): Self = StObject.set(x, "mandatory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMandatoryUndefined: Self = StObject.set(x, "mandatory", js.undefined)
      
      @scala.inline
      def setState(value: `load-started` | `load-failed` | `load-succeeded` | failed | succeeded): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
