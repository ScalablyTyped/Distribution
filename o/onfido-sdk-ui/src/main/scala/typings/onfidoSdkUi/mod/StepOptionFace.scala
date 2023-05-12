package typings.onfidoSdkUi.mod

import typings.onfidoSdkUi.onfidoSdkUiStrings.motion
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepOptionFace
  extends StObject
     with CaptureOptions {
  
  var forceCrossDevice: js.UndefOr[scala.Nothing] = js.undefined
  
  var motionFallbackVariant: js.UndefOr[Omit[RequestedVariant, motion]] = js.undefined
  
  var photoCaptureFallback: js.UndefOr[Boolean] = js.undefined
  
  var recordMotionAudio: js.UndefOr[Boolean] = js.undefined
  
  var useMultipleSelfieCapture: js.UndefOr[Boolean] = js.undefined
  
  var useWorkflow: js.UndefOr[Boolean] = js.undefined
}
object StepOptionFace {
  
  inline def apply(): StepOptionFace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepOptionFace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StepOptionFace] (val x: Self) extends AnyVal {
    
    inline def setMotionFallbackVariant(value: Omit[RequestedVariant, motion]): Self = StObject.set(x, "motionFallbackVariant", value.asInstanceOf[js.Any])
    
    inline def setMotionFallbackVariantUndefined: Self = StObject.set(x, "motionFallbackVariant", js.undefined)
    
    inline def setPhotoCaptureFallback(value: Boolean): Self = StObject.set(x, "photoCaptureFallback", value.asInstanceOf[js.Any])
    
    inline def setPhotoCaptureFallbackUndefined: Self = StObject.set(x, "photoCaptureFallback", js.undefined)
    
    inline def setRecordMotionAudio(value: Boolean): Self = StObject.set(x, "recordMotionAudio", value.asInstanceOf[js.Any])
    
    inline def setRecordMotionAudioUndefined: Self = StObject.set(x, "recordMotionAudio", js.undefined)
    
    inline def setUseMultipleSelfieCapture(value: Boolean): Self = StObject.set(x, "useMultipleSelfieCapture", value.asInstanceOf[js.Any])
    
    inline def setUseMultipleSelfieCaptureUndefined: Self = StObject.set(x, "useMultipleSelfieCapture", js.undefined)
    
    inline def setUseWorkflow(value: Boolean): Self = StObject.set(x, "useWorkflow", value.asInstanceOf[js.Any])
    
    inline def setUseWorkflowUndefined: Self = StObject.set(x, "useWorkflow", js.undefined)
  }
}
