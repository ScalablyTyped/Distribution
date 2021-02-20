package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1beta2FaceFrame extends StObject {
  
  /** Normalized Bounding boxes in a frame. There can be more than one boxes if the same face is detected in multiple locations within the current frame. */
  var normalizedBoundingBoxes: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2NormalizedBoundingBox]] = js.native
  
  /** Time-offset, relative to the beginning of the video, corresponding to the video frame for this location. */
  var timeOffset: js.UndefOr[String] = js.native
}
object GoogleCloudVideointelligenceV1beta2FaceFrame {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1beta2FaceFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2FaceFrame]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1beta2FaceFrameMutableBuilder[Self <: GoogleCloudVideointelligenceV1beta2FaceFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNormalizedBoundingBoxes(value: js.Array[GoogleCloudVideointelligenceV1beta2NormalizedBoundingBox]): Self = StObject.set(x, "normalizedBoundingBoxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizedBoundingBoxesUndefined: Self = StObject.set(x, "normalizedBoundingBoxes", js.undefined)
    
    @scala.inline
    def setNormalizedBoundingBoxesVarargs(value: GoogleCloudVideointelligenceV1beta2NormalizedBoundingBox*): Self = StObject.set(x, "normalizedBoundingBoxes", js.Array(value :_*))
    
    @scala.inline
    def setTimeOffset(value: String): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeOffsetUndefined: Self = StObject.set(x, "timeOffset", js.undefined)
  }
}
