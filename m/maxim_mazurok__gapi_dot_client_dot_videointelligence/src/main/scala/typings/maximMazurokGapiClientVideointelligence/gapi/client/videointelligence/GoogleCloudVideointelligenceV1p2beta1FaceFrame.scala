package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1p2beta1FaceFrame extends StObject {
  
  /** Normalized Bounding boxes in a frame. There can be more than one boxes if the same face is detected in multiple locations within the current frame. */
  var normalizedBoundingBoxes: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p2beta1NormalizedBoundingBox]] = js.undefined
  
  /** Time-offset, relative to the beginning of the video, corresponding to the video frame for this location. */
  var timeOffset: js.UndefOr[String] = js.undefined
}
object GoogleCloudVideointelligenceV1p2beta1FaceFrame {
  
  inline def apply(): GoogleCloudVideointelligenceV1p2beta1FaceFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p2beta1FaceFrame]
  }
  
  extension [Self <: GoogleCloudVideointelligenceV1p2beta1FaceFrame](x: Self) {
    
    inline def setNormalizedBoundingBoxes(value: js.Array[GoogleCloudVideointelligenceV1p2beta1NormalizedBoundingBox]): Self = StObject.set(x, "normalizedBoundingBoxes", value.asInstanceOf[js.Any])
    
    inline def setNormalizedBoundingBoxesUndefined: Self = StObject.set(x, "normalizedBoundingBoxes", js.undefined)
    
    inline def setNormalizedBoundingBoxesVarargs(value: GoogleCloudVideointelligenceV1p2beta1NormalizedBoundingBox*): Self = StObject.set(x, "normalizedBoundingBoxes", js.Array(value*))
    
    inline def setTimeOffset(value: String): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    inline def setTimeOffsetUndefined: Self = StObject.set(x, "timeOffset", js.undefined)
  }
}
