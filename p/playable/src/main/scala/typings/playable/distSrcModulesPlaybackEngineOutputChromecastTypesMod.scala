package typings.playable

import typings.playable.distSrcModulesPlaybackEngineTypesMod.IEngineDebugInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesPlaybackEngineOutputChromecastTypesMod {
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IChromecastDebugInfo] (val x: Self) extends AnyVal {
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
}
