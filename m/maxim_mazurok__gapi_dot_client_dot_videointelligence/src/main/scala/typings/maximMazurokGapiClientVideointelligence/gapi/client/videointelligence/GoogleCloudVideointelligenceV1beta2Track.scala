package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1beta2Track extends StObject {
  
  /** Optional. Attributes in the track level. */
  var attributes: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2DetectedAttribute]] = js.undefined
  
  /** Optional. The confidence score of the tracked object. */
  var confidence: js.UndefOr[Double] = js.undefined
  
  /** Video segment of a track. */
  var segment: js.UndefOr[GoogleCloudVideointelligenceV1beta2VideoSegment] = js.undefined
  
  /** The object with timestamp and attributes per frame in the track. */
  var timestampedObjects: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2TimestampedObject]] = js.undefined
}
object GoogleCloudVideointelligenceV1beta2Track {
  
  inline def apply(): GoogleCloudVideointelligenceV1beta2Track = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2Track]
  }
  
  extension [Self <: GoogleCloudVideointelligenceV1beta2Track](x: Self) {
    
    inline def setAttributes(value: js.Array[GoogleCloudVideointelligenceV1beta2DetectedAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: GoogleCloudVideointelligenceV1beta2DetectedAttribute*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setSegment(value: GoogleCloudVideointelligenceV1beta2VideoSegment): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    inline def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
    
    inline def setTimestampedObjects(value: js.Array[GoogleCloudVideointelligenceV1beta2TimestampedObject]): Self = StObject.set(x, "timestampedObjects", value.asInstanceOf[js.Any])
    
    inline def setTimestampedObjectsUndefined: Self = StObject.set(x, "timestampedObjects", js.undefined)
    
    inline def setTimestampedObjectsVarargs(value: GoogleCloudVideointelligenceV1beta2TimestampedObject*): Self = StObject.set(x, "timestampedObjects", js.Array(value :_*))
  }
}
