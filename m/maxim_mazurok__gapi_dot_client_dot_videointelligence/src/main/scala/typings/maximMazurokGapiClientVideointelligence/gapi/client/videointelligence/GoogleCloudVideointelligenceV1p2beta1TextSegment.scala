package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1p2beta1TextSegment extends StObject {
  
  /** Confidence for the track of detected text. It is calculated as the highest over all frames where OCR detected text appears. */
  var confidence: js.UndefOr[Double] = js.undefined
  
  /** Information related to the frames where OCR detected text appears. */
  var frames: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p2beta1TextFrame]] = js.undefined
  
  /** Video segment where a text snippet was detected. */
  var segment: js.UndefOr[GoogleCloudVideointelligenceV1p2beta1VideoSegment] = js.undefined
}
object GoogleCloudVideointelligenceV1p2beta1TextSegment {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p2beta1TextSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p2beta1TextSegment]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p2beta1TextSegmentMutableBuilder[Self <: GoogleCloudVideointelligenceV1p2beta1TextSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    @scala.inline
    def setFrames(value: js.Array[GoogleCloudVideointelligenceV1p2beta1TextFrame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
    
    @scala.inline
    def setFramesVarargs(value: GoogleCloudVideointelligenceV1p2beta1TextFrame*): Self = StObject.set(x, "frames", js.Array(value :_*))
    
    @scala.inline
    def setSegment(value: GoogleCloudVideointelligenceV1p2beta1VideoSegment): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
  }
}
