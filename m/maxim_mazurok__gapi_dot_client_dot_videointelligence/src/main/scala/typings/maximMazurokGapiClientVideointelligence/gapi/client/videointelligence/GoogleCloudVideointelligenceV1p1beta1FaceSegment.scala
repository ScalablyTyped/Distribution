package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1p1beta1FaceSegment extends js.Object {
  
  /** Video segment where a face was detected. */
  var segment: js.UndefOr[GoogleCloudVideointelligenceV1p1beta1VideoSegment] = js.native
}
object GoogleCloudVideointelligenceV1p1beta1FaceSegment {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p1beta1FaceSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p1beta1FaceSegment]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p1beta1FaceSegmentOps[Self <: GoogleCloudVideointelligenceV1p1beta1FaceSegment] (val x: Self) extends AnyVal {
    
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
    def setSegment(value: GoogleCloudVideointelligenceV1p1beta1VideoSegment): Self = this.set("segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegment: Self = this.set("segment", js.undefined)
  }
}
