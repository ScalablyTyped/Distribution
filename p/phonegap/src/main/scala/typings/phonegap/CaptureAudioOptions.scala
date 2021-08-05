package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptureAudioOptions extends StObject {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var mode: js.UndefOr[Double] = js.undefined
}
object CaptureAudioOptions {
  
  inline def apply(): CaptureAudioOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptureAudioOptions]
  }
  
  extension [Self <: CaptureAudioOptions](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
