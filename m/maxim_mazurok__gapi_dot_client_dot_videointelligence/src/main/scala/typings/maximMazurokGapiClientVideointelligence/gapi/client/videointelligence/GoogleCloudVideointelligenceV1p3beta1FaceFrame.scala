package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1p3beta1FaceFrame extends js.Object {
  
  /** Normalized Bounding boxes in a frame. There can be more than one boxes if the same face is detected in multiple locations within the current frame. */
  var normalizedBoundingBoxes: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p3beta1NormalizedBoundingBox]] = js.native
  
  /** Time-offset, relative to the beginning of the video, corresponding to the video frame for this location. */
  var timeOffset: js.UndefOr[String] = js.native
}
object GoogleCloudVideointelligenceV1p3beta1FaceFrame {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p3beta1FaceFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p3beta1FaceFrame]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p3beta1FaceFrameOps[Self <: GoogleCloudVideointelligenceV1p3beta1FaceFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNormalizedBoundingBoxesVarargs(value: GoogleCloudVideointelligenceV1p3beta1NormalizedBoundingBox*): Self = this.set("normalizedBoundingBoxes", js.Array(value :_*))
    
    @scala.inline
    def setNormalizedBoundingBoxes(value: js.Array[GoogleCloudVideointelligenceV1p3beta1NormalizedBoundingBox]): Self = this.set("normalizedBoundingBoxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalizedBoundingBoxes: Self = this.set("normalizedBoundingBoxes", js.undefined)
    
    @scala.inline
    def setTimeOffset(value: String): Self = this.set("timeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeOffset: Self = this.set("timeOffset", js.undefined)
  }
}
