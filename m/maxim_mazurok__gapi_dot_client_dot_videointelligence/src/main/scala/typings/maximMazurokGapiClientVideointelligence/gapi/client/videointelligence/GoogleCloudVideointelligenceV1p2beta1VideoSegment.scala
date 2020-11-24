package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1p2beta1VideoSegment extends js.Object {
  
  /** Time-offset, relative to the beginning of the video, corresponding to the end of the segment (inclusive). */
  var endTimeOffset: js.UndefOr[String] = js.native
  
  /** Time-offset, relative to the beginning of the video, corresponding to the start of the segment (inclusive). */
  var startTimeOffset: js.UndefOr[String] = js.native
}
object GoogleCloudVideointelligenceV1p2beta1VideoSegment {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p2beta1VideoSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p2beta1VideoSegment]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p2beta1VideoSegmentOps[Self <: GoogleCloudVideointelligenceV1p2beta1VideoSegment] (val x: Self) extends AnyVal {
    
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
    def setEndTimeOffset(value: String): Self = this.set("endTimeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTimeOffset: Self = this.set("endTimeOffset", js.undefined)
    
    @scala.inline
    def setStartTimeOffset(value: String): Self = this.set("startTimeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTimeOffset: Self = this.set("startTimeOffset", js.undefined)
  }
}
