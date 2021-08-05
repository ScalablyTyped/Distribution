package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1p2beta1ObjectTrackingFrame extends StObject {
  
  /** The normalized bounding box location of this object track for the frame. */
  var normalizedBoundingBox: js.UndefOr[GoogleCloudVideointelligenceV1p2beta1NormalizedBoundingBox] = js.undefined
  
  /** The timestamp of the frame in microseconds. */
  var timeOffset: js.UndefOr[String] = js.undefined
}
object GoogleCloudVideointelligenceV1p2beta1ObjectTrackingFrame {
  
  inline def apply(): GoogleCloudVideointelligenceV1p2beta1ObjectTrackingFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p2beta1ObjectTrackingFrame]
  }
  
  extension [Self <: GoogleCloudVideointelligenceV1p2beta1ObjectTrackingFrame](x: Self) {
    
    inline def setNormalizedBoundingBox(value: GoogleCloudVideointelligenceV1p2beta1NormalizedBoundingBox): Self = StObject.set(x, "normalizedBoundingBox", value.asInstanceOf[js.Any])
    
    inline def setNormalizedBoundingBoxUndefined: Self = StObject.set(x, "normalizedBoundingBox", js.undefined)
    
    inline def setTimeOffset(value: String): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    inline def setTimeOffsetUndefined: Self = StObject.set(x, "timeOffset", js.undefined)
  }
}
