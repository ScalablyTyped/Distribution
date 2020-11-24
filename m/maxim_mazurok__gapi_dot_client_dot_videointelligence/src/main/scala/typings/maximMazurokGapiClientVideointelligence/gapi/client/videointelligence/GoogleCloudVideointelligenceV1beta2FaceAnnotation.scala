package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1beta2FaceAnnotation extends js.Object {
  
  /** All video frames where a face was detected. */
  var frames: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2FaceFrame]] = js.native
  
  /** All video segments where a face was detected. */
  var segments: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2FaceSegment]] = js.native
  
  /** Thumbnail of a representative face view (in JPEG format). */
  var thumbnail: js.UndefOr[String] = js.native
}
object GoogleCloudVideointelligenceV1beta2FaceAnnotation {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1beta2FaceAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2FaceAnnotation]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1beta2FaceAnnotationOps[Self <: GoogleCloudVideointelligenceV1beta2FaceAnnotation] (val x: Self) extends AnyVal {
    
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
    def setFramesVarargs(value: GoogleCloudVideointelligenceV1beta2FaceFrame*): Self = this.set("frames", js.Array(value :_*))
    
    @scala.inline
    def setFrames(value: js.Array[GoogleCloudVideointelligenceV1beta2FaceFrame]): Self = this.set("frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrames: Self = this.set("frames", js.undefined)
    
    @scala.inline
    def setSegmentsVarargs(value: GoogleCloudVideointelligenceV1beta2FaceSegment*): Self = this.set("segments", js.Array(value :_*))
    
    @scala.inline
    def setSegments(value: js.Array[GoogleCloudVideointelligenceV1beta2FaceSegment]): Self = this.set("segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegments: Self = this.set("segments", js.undefined)
    
    @scala.inline
    def setThumbnail(value: String): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnail: Self = this.set("thumbnail", js.undefined)
  }
}
