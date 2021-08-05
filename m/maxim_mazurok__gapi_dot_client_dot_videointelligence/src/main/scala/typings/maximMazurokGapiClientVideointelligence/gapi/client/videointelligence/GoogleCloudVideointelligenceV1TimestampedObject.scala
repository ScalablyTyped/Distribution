package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1TimestampedObject extends StObject {
  
  /** Optional. The attributes of the object in the bounding box. */
  var attributes: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1DetectedAttribute]] = js.undefined
  
  /** Optional. The detected landmarks. */
  var landmarks: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1DetectedLandmark]] = js.undefined
  
  /** Normalized Bounding box in a frame, where the object is located. */
  var normalizedBoundingBox: js.UndefOr[GoogleCloudVideointelligenceV1NormalizedBoundingBox] = js.undefined
  
  /** Time-offset, relative to the beginning of the video, corresponding to the video frame for this object. */
  var timeOffset: js.UndefOr[String] = js.undefined
}
object GoogleCloudVideointelligenceV1TimestampedObject {
  
  inline def apply(): GoogleCloudVideointelligenceV1TimestampedObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1TimestampedObject]
  }
  
  extension [Self <: GoogleCloudVideointelligenceV1TimestampedObject](x: Self) {
    
    inline def setAttributes(value: js.Array[GoogleCloudVideointelligenceV1DetectedAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: GoogleCloudVideointelligenceV1DetectedAttribute*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    inline def setLandmarks(value: js.Array[GoogleCloudVideointelligenceV1DetectedLandmark]): Self = StObject.set(x, "landmarks", value.asInstanceOf[js.Any])
    
    inline def setLandmarksUndefined: Self = StObject.set(x, "landmarks", js.undefined)
    
    inline def setLandmarksVarargs(value: GoogleCloudVideointelligenceV1DetectedLandmark*): Self = StObject.set(x, "landmarks", js.Array(value :_*))
    
    inline def setNormalizedBoundingBox(value: GoogleCloudVideointelligenceV1NormalizedBoundingBox): Self = StObject.set(x, "normalizedBoundingBox", value.asInstanceOf[js.Any])
    
    inline def setNormalizedBoundingBoxUndefined: Self = StObject.set(x, "normalizedBoundingBox", js.undefined)
    
    inline def setTimeOffset(value: String): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    inline def setTimeOffsetUndefined: Self = StObject.set(x, "timeOffset", js.undefined)
  }
}
