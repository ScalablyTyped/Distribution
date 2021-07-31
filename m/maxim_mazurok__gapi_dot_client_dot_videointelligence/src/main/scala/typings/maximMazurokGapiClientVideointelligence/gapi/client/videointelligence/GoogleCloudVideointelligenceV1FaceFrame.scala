package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1FaceFrame extends StObject {
  
  /** Normalized Bounding boxes in a frame. There can be more than one boxes if the same face is detected in multiple locations within the current frame. */
  var normalizedBoundingBoxes: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1NormalizedBoundingBox]] = js.undefined
  
  /** Time-offset, relative to the beginning of the video, corresponding to the video frame for this location. */
  var timeOffset: js.UndefOr[String] = js.undefined
}
object GoogleCloudVideointelligenceV1FaceFrame {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1FaceFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1FaceFrame]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1FaceFrameMutableBuilder[Self <: GoogleCloudVideointelligenceV1FaceFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNormalizedBoundingBoxes(value: js.Array[GoogleCloudVideointelligenceV1NormalizedBoundingBox]): Self = StObject.set(x, "normalizedBoundingBoxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizedBoundingBoxesUndefined: Self = StObject.set(x, "normalizedBoundingBoxes", js.undefined)
    
    @scala.inline
    def setNormalizedBoundingBoxesVarargs(value: GoogleCloudVideointelligenceV1NormalizedBoundingBox*): Self = StObject.set(x, "normalizedBoundingBoxes", js.Array(value :_*))
    
    @scala.inline
    def setTimeOffset(value: String): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeOffsetUndefined: Self = StObject.set(x, "timeOffset", js.undefined)
  }
}
