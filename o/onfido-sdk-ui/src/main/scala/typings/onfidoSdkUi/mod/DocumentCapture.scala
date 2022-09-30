package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentCapture extends StObject {
  
  /**
  	 * The number of additional image quality retries that should return an error if an image quality validation is detected.
  	 * This means that if image quality validations are detected, the user will only see an error on the first [1 + max_total_retries] upload attempt.
  	 * From the [1 + max_total_retries + 1] attempt, if image quality validations are detected, the user will see a warning and they use can choose to
  	 * proceed regardless of the image quality warning.
  	 */
  var max_total_retries: Double
  
  var torch_turn_on_timeMs: js.UndefOr[Double] = js.undefined
  
  var video_bitrate: js.UndefOr[Double] = js.undefined
  
  var video_length_ms: js.UndefOr[Double] = js.undefined
}
object DocumentCapture {
  
  inline def apply(max_total_retries: Double): DocumentCapture = {
    val __obj = js.Dynamic.literal(max_total_retries = max_total_retries.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentCapture]
  }
  
  extension [Self <: DocumentCapture](x: Self) {
    
    inline def setMax_total_retries(value: Double): Self = StObject.set(x, "max_total_retries", value.asInstanceOf[js.Any])
    
    inline def setTorch_turn_on_timeMs(value: Double): Self = StObject.set(x, "torch_turn_on_timeMs", value.asInstanceOf[js.Any])
    
    inline def setTorch_turn_on_timeMsUndefined: Self = StObject.set(x, "torch_turn_on_timeMs", js.undefined)
    
    inline def setVideo_bitrate(value: Double): Self = StObject.set(x, "video_bitrate", value.asInstanceOf[js.Any])
    
    inline def setVideo_bitrateUndefined: Self = StObject.set(x, "video_bitrate", js.undefined)
    
    inline def setVideo_length_ms(value: Double): Self = StObject.set(x, "video_length_ms", value.asInstanceOf[js.Any])
    
    inline def setVideo_length_msUndefined: Self = StObject.set(x, "video_length_ms", js.undefined)
  }
}
