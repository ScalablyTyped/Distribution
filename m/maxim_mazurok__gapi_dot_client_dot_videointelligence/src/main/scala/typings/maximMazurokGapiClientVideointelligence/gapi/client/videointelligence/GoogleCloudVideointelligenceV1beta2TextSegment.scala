package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1beta2TextSegment extends StObject {
  
  /** Confidence for the track of detected text. It is calculated as the highest over all frames where OCR detected text appears. */
  var confidence: js.UndefOr[Double] = js.native
  
  /** Information related to the frames where OCR detected text appears. */
  var frames: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2TextFrame]] = js.native
  
  /** Video segment where a text snippet was detected. */
  var segment: js.UndefOr[GoogleCloudVideointelligenceV1beta2VideoSegment] = js.native
}
object GoogleCloudVideointelligenceV1beta2TextSegment {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1beta2TextSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2TextSegment]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1beta2TextSegmentMutableBuilder[Self <: GoogleCloudVideointelligenceV1beta2TextSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    @scala.inline
    def setFrames(value: js.Array[GoogleCloudVideointelligenceV1beta2TextFrame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
    
    @scala.inline
    def setFramesVarargs(value: GoogleCloudVideointelligenceV1beta2TextFrame*): Self = StObject.set(x, "frames", js.Array(value :_*))
    
    @scala.inline
    def setSegment(value: GoogleCloudVideointelligenceV1beta2VideoSegment): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
  }
}
