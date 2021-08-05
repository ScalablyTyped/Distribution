package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p4beta1FaceRecognitionResult extends StObject {
  
  /** The Celebrity that this face was matched to. */
  var celebrity: js.UndefOr[GoogleCloudVisionV1p4beta1Celebrity] = js.undefined
  
  /** Recognition confidence. Range [0, 1]. */
  var confidence: js.UndefOr[Double] = js.undefined
}
object GoogleCloudVisionV1p4beta1FaceRecognitionResult {
  
  inline def apply(): GoogleCloudVisionV1p4beta1FaceRecognitionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p4beta1FaceRecognitionResult]
  }
  
  extension [Self <: GoogleCloudVisionV1p4beta1FaceRecognitionResult](x: Self) {
    
    inline def setCelebrity(value: GoogleCloudVisionV1p4beta1Celebrity): Self = StObject.set(x, "celebrity", value.asInstanceOf[js.Any])
    
    inline def setCelebrityUndefined: Self = StObject.set(x, "celebrity", js.undefined)
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
  }
}
