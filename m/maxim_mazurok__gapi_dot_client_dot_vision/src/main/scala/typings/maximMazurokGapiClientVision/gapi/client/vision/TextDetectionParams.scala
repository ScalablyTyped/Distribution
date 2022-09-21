package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDetectionParams extends StObject {
  
  /** A list of advanced OCR options to fine-tune OCR behavior. */
  var advancedOcrOptions: js.UndefOr[js.Array[String]] = js.undefined
  
  /** By default, Cloud Vision API only includes confidence score for DOCUMENT_TEXT_DETECTION result. Set the flag to true to include confidence score for TEXT_DETECTION as well. */
  var enableTextDetectionConfidenceScore: js.UndefOr[Boolean] = js.undefined
}
object TextDetectionParams {
  
  inline def apply(): TextDetectionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextDetectionParams]
  }
  
  extension [Self <: TextDetectionParams](x: Self) {
    
    inline def setAdvancedOcrOptions(value: js.Array[String]): Self = StObject.set(x, "advancedOcrOptions", value.asInstanceOf[js.Any])
    
    inline def setAdvancedOcrOptionsUndefined: Self = StObject.set(x, "advancedOcrOptions", js.undefined)
    
    inline def setAdvancedOcrOptionsVarargs(value: String*): Self = StObject.set(x, "advancedOcrOptions", js.Array(value*))
    
    inline def setEnableTextDetectionConfidenceScore(value: Boolean): Self = StObject.set(x, "enableTextDetectionConfidenceScore", value.asInstanceOf[js.Any])
    
    inline def setEnableTextDetectionConfidenceScoreUndefined: Self = StObject.set(x, "enableTextDetectionConfidenceScore", js.undefined)
  }
}
