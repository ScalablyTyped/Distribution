package typings.openfin

import typings.openfin.openfinStrings.`load-failed`
import typings.openfin.openfinStrings.`load-started`
import typings.openfin.openfinStrings.`load-succeeded`
import typings.openfin.openfinStrings.failed
import typings.openfin.openfinStrings.succeeded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object preloadScriptMod {
  
  trait PreloadScript extends StObject {
    
    var mandatory: js.UndefOr[Boolean] = js.undefined
    
    var state: js.UndefOr[`load-started` | `load-failed` | `load-succeeded` | failed | succeeded] = js.undefined
    
    var url: String
  }
  object PreloadScript {
    
    inline def apply(url: String): PreloadScript = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreloadScript]
    }
    
    extension [Self <: PreloadScript](x: Self) {
      
      inline def setMandatory(value: Boolean): Self = StObject.set(x, "mandatory", value.asInstanceOf[js.Any])
      
      inline def setMandatoryUndefined: Self = StObject.set(x, "mandatory", js.undefined)
      
      inline def setState(value: `load-started` | `load-failed` | `load-succeeded` | failed | succeeded): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
