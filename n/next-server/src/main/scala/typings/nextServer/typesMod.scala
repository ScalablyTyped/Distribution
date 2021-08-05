package typings.nextServer

import typings.nextServer.anon.BodyParser
import typings.nextServer.nextServerStrings.hybrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait PageConfig extends StObject {
    
    var amp: js.UndefOr[Boolean | hybrid] = js.undefined
    
    var api: js.UndefOr[BodyParser] = js.undefined
    
    var experimentalPrerender: js.UndefOr[Boolean] = js.undefined
  }
  object PageConfig {
    
    inline def apply(): PageConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageConfig]
    }
    
    extension [Self <: PageConfig](x: Self) {
      
      inline def setAmp(value: Boolean | hybrid): Self = StObject.set(x, "amp", value.asInstanceOf[js.Any])
      
      inline def setAmpUndefined: Self = StObject.set(x, "amp", js.undefined)
      
      inline def setApi(value: BodyParser): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
      
      inline def setExperimentalPrerender(value: Boolean): Self = StObject.set(x, "experimentalPrerender", value.asInstanceOf[js.Any])
      
      inline def setExperimentalPrerenderUndefined: Self = StObject.set(x, "experimentalPrerender", js.undefined)
    }
  }
}
