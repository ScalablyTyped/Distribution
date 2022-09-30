package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepOptionFace
  extends StObject
     with CaptureOptions {
  
  var forceCrossDevice: js.UndefOr[scala.Nothing] = js.undefined
  
  var photoCaptureFallback: js.UndefOr[Boolean] = js.undefined
  
  var useMultipleSelfieCapture: js.UndefOr[Boolean] = js.undefined
}
object StepOptionFace {
  
  inline def apply(): StepOptionFace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepOptionFace]
  }
  
  extension [Self <: StepOptionFace](x: Self) {
    
    inline def setPhotoCaptureFallback(value: Boolean): Self = StObject.set(x, "photoCaptureFallback", value.asInstanceOf[js.Any])
    
    inline def setPhotoCaptureFallbackUndefined: Self = StObject.set(x, "photoCaptureFallback", js.undefined)
    
    inline def setUseMultipleSelfieCapture(value: Boolean): Self = StObject.set(x, "useMultipleSelfieCapture", value.asInstanceOf[js.Any])
    
    inline def setUseMultipleSelfieCaptureUndefined: Self = StObject.set(x, "useMultipleSelfieCapture", js.undefined)
  }
}
