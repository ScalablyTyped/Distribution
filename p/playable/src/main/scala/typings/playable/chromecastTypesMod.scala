package typings.playable

import typings.playable.playbackEngineTypesMod.IEngineDebugInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chromecastTypesMod {
  
  trait IChromecastDebugInfo
    extends StObject
       with IEngineDebugInfo {
    
    var src: String
  }
  object IChromecastDebugInfo {
    
    inline def apply(currentTime: Double, duration: Double, output: String, src: String): IChromecastDebugInfo = {
      val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[IChromecastDebugInfo]
    }
    
    extension [Self <: IChromecastDebugInfo](x: Self) {
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
}
