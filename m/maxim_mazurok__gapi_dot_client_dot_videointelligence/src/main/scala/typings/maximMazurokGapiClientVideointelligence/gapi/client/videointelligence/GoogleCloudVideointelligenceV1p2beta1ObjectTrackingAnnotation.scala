package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1p2beta1ObjectTrackingAnnotation extends StObject {
  
  /** Object category's labeling confidence of this track. */
  var confidence: js.UndefOr[Double] = js.undefined
  
  /** Entity to specify the object category that this track is labeled as. */
  var entity: js.UndefOr[GoogleCloudVideointelligenceV1p2beta1Entity] = js.undefined
  
  /**
    * Information corresponding to all frames where this object track appears. Non-streaming batch mode: it may be one or multiple ObjectTrackingFrame messages in frames. Streaming mode:
    * it can only be one ObjectTrackingFrame message in frames.
    */
  var frames: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p2beta1ObjectTrackingFrame]] = js.undefined
  
  /** Non-streaming batch mode ONLY. Each object track corresponds to one video segment where it appears. */
  var segment: js.UndefOr[GoogleCloudVideointelligenceV1p2beta1VideoSegment] = js.undefined
  
  /**
    * Streaming mode ONLY. In streaming mode, we do not know the end time of a tracked object before it is completed. Hence, there is no VideoSegment info returned. Instead, we provide a
    * unique identifiable integer track_id so that the customers can correlate the results of the ongoing ObjectTrackAnnotation of the same track_id over time.
    */
  var trackId: js.UndefOr[String] = js.undefined
  
  /** Feature version. */
  var version: js.UndefOr[String] = js.undefined
}
object GoogleCloudVideointelligenceV1p2beta1ObjectTrackingAnnotation {
  
  inline def apply(): GoogleCloudVideointelligenceV1p2beta1ObjectTrackingAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p2beta1ObjectTrackingAnnotation]
  }
  
  extension [Self <: GoogleCloudVideointelligenceV1p2beta1ObjectTrackingAnnotation](x: Self) {
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setEntity(value: GoogleCloudVideointelligenceV1p2beta1Entity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    inline def setFrames(value: js.Array[GoogleCloudVideointelligenceV1p2beta1ObjectTrackingFrame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
    
    inline def setFramesVarargs(value: GoogleCloudVideointelligenceV1p2beta1ObjectTrackingFrame*): Self = StObject.set(x, "frames", js.Array(value*))
    
    inline def setSegment(value: GoogleCloudVideointelligenceV1p2beta1VideoSegment): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    inline def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
    
    inline def setTrackId(value: String): Self = StObject.set(x, "trackId", value.asInstanceOf[js.Any])
    
    inline def setTrackIdUndefined: Self = StObject.set(x, "trackId", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
