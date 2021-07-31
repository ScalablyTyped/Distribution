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
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1Track = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1Track]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1TrackMutableBuilder[Self <: GoogleCloudVideointelligenceV1Track] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Array[GoogleCloudVideointelligenceV1DetectedAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: GoogleCloudVideointelligenceV1DetectedAttribute*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    @scala.inline
    def setSegment(value: GoogleCloudVideointelligenceV1VideoSegment): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
    
    @scala.inline
    def setTimestampedObjects(value: js.Array[GoogleCloudVideointelligenceV1TimestampedObject]): Self = StObject.set(x, "timestampedObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampedObjectsUndefined: Self = StObject.set(x, "timestampedObjects", js.undefined)
    
    @scala.inline
    def setTimestampedObjectsVarargs(value: GoogleCloudVideointelligenceV1TimestampedObject*): Self = StObject.set(x, "timestampedObjects", js.Array(value :_*))
  }
}
