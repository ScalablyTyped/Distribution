package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1p3beta1Track extends StObject {
  
  /** Optional. Attributes in the track level. */
  var attributes: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p3beta1DetectedAttribute]] = js.undefined
  
  /** Optional. The confidence score of the tracked object. */
  var confidence: js.UndefOr[Double] = js.undefined
  
  /** Video segment of a track. */
  var segment: js.UndefOr[GoogleCloudVideointelligenceV1p3beta1VideoSegment] = js.undefined
  
  /** The object with timestamp and attributes per frame in the track. */
  var timestampedObjects: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p3beta1TimestampedObject]] = js.undefined
}
object GoogleCloudVideointelligenceV1p3beta1Track {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p3beta1Track = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p3beta1Track]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p3beta1TrackMutableBuilder[Self <: GoogleCloudVideointelligenceV1p3beta1Track] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Array[GoogleCloudVideointelligenceV1p3beta1DetectedAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: GoogleCloudVideointelligenceV1p3beta1DetectedAttribute*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    @scala.inline
    def setSegment(value: GoogleCloudVideointelligenceV1p3beta1VideoSegment): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
    
    @scala.inline
    def setTimestampedObjects(value: js.Array[GoogleCloudVideointelligenceV1p3beta1TimestampedObject]): Self = StObject.set(x, "timestampedObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampedObjectsUndefined: Self = StObject.set(x, "timestampedObjects", js.undefined)
    
    @scala.inline
    def setTimestampedObjectsVarargs(value: GoogleCloudVideointelligenceV1p3beta1TimestampedObject*): Self = StObject.set(x, "timestampedObjects", js.Array(value :_*))
  }
}
