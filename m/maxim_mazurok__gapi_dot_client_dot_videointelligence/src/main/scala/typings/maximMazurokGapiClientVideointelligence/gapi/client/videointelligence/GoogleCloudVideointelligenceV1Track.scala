package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1Track extends StObject {
  
  /** Optional. Attributes in the track level. */
  var attributes: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1DetectedAttribute]] = js.undefined
  
  /** Optional. The confidence score of the tracked object. */
  var confidence: js.UndefOr[Double] = js.undefined
  
  /** Video segment of a track. */
  var segment: js.UndefOr[GoogleCloudVideointelligenceV1VideoSegment] = js.undefined
  
  /** The object with timestamp and attributes per frame in the track. */
  var timestampedObjects: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1TimestampedObject]] = js.undefined
}
object GoogleCloudVideointelligenceV1Track {
  
  inline def apply(): GoogleCloudVideointelligenceV1Track = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1Track]
  }
  
  extension [Self <: GoogleCloudVideointelligenceV1Track](x: Self) {
    
    inline def setAttributes(value: js.Array[GoogleCloudVideointelligenceV1DetectedAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: GoogleCloudVideointelligenceV1DetectedAttribute*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setSegment(value: GoogleCloudVideointelligenceV1VideoSegment): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    inline def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
    
    inline def setTimestampedObjects(value: js.Array[GoogleCloudVideointelligenceV1TimestampedObject]): Self = StObject.set(x, "timestampedObjects", value.asInstanceOf[js.Any])
    
    inline def setTimestampedObjectsUndefined: Self = StObject.set(x, "timestampedObjects", js.undefined)
    
    inline def setTimestampedObjectsVarargs(value: GoogleCloudVideointelligenceV1TimestampedObject*): Self = StObject.set(x, "timestampedObjects", js.Array(value :_*))
  }
}
