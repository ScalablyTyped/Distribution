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
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1beta2LabelSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2LabelSegment]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1beta2LabelSegmentMutableBuilder[Self <: GoogleCloudVideointelligenceV1beta2LabelSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    @scala.inline
    def setSegment(value: GoogleCloudVideointelligenceV1beta2VideoSegment): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
  }
}
