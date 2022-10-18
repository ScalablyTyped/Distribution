package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenGraphAudio extends StObject {
  
  var audio: js.UndefOr[String] = js.undefined
  
  var secureUrl: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object OpenGraphAudio {
  
  inline def apply(): OpenGraphAudio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenGraphAudio]
  }
  
  extension [Self <: OpenGraphAudio](x: Self) {
    
    inline def setAudio(value: String): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setSecureUrl(value: String): Self = StObject.set(x, "secureUrl", value.asInstanceOf[js.Any])
    
    inline def setSecureUrlUndefined: Self = StObject.set(x, "secureUrl", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
