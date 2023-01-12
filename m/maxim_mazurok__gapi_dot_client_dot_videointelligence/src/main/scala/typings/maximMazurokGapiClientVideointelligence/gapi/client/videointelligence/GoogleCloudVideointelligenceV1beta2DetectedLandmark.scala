package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1beta2DetectedLandmark extends StObject {
  
  /** The confidence score of the detected landmark. Range [0, 1]. */
  var confidence: js.UndefOr[Double] = js.undefined
  
  /** The name of this landmark, for example, left_hand, right_shoulder. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The 2D point of the detected landmark using the normalized image coordindate system. The normalized coordinates have the range from 0 to 1. */
  var point: js.UndefOr[GoogleCloudVideointelligenceV1beta2NormalizedVertex] = js.undefined
}
object GoogleCloudVideointelligenceV1beta2DetectedLandmark {
  
  inline def apply(): GoogleCloudVideointelligenceV1beta2DetectedLandmark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2DetectedLandmark]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudVideointelligenceV1beta2DetectedLandmark] (val x: Self) extends AnyVal {
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPoint(value: GoogleCloudVideointelligenceV1beta2NormalizedVertex): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
  }
}
