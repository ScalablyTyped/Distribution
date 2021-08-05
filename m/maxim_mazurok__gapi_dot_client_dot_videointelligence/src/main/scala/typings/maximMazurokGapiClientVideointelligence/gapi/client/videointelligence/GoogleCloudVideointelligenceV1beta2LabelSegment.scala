package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1beta2LabelSegment extends StObject {
  
  /** Confidence that the label is accurate. Range: [0, 1]. */
  var confidence: js.UndefOr[Double] = js.undefined
  
  /** Video segment where a label was detected. */
  var segment: js.UndefOr[GoogleCloudVideointelligenceV1beta2VideoSegment] = js.undefined
}
object GoogleCloudVideointelligenceV1beta2LabelSegment {
  
  inline def apply(): GoogleCloudVideointelligenceV1beta2LabelSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2LabelSegment]
  }
  
  extension [Self <: GoogleCloudVideointelligenceV1beta2LabelSegment](x: Self) {
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setSegment(value: GoogleCloudVideointelligenceV1beta2VideoSegment): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    inline def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
  }
}
