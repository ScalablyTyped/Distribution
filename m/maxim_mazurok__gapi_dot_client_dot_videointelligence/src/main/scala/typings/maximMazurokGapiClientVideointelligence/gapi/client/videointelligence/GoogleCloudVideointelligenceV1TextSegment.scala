package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1TextSegment extends StObject {
  
  /** Confidence for the track of detected text. It is calculated as the highest over all frames where OCR detected text appears. */
  var confidence: js.UndefOr[Double] = js.undefined
  
  /** Information related to the frames where OCR detected text appears. */
  var frames: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1TextFrame]] = js.undefined
  
  /** Video segment where a text snippet was detected. */
  var segment: js.UndefOr[GoogleCloudVideointelligenceV1VideoSegment] = js.undefined
}
object GoogleCloudVideointelligenceV1TextSegment {
  
  inline def apply(): GoogleCloudVideointelligenceV1TextSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1TextSegment]
  }
  
  extension [Self <: GoogleCloudVideointelligenceV1TextSegment](x: Self) {
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setFrames(value: js.Array[GoogleCloudVideointelligenceV1TextFrame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
    
    inline def setFramesVarargs(value: GoogleCloudVideointelligenceV1TextFrame*): Self = StObject.set(x, "frames", js.Array(value*))
    
    inline def setSegment(value: GoogleCloudVideointelligenceV1VideoSegment): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    inline def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
  }
}
