package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1p1beta1DetectedLandmark extends js.Object {
  
  /** The confidence score of the detected landmark. Range [0, 1]. */
  var confidence: js.UndefOr[Double] = js.native
  
  /** The name of this landmark, for example, left_hand, right_shoulder. */
  var name: js.UndefOr[String] = js.native
  
  /** The 2D point of the detected landmark using the normalized image coordindate system. The normalized coordinates have the range from 0 to 1. */
  var point: js.UndefOr[GoogleCloudVideointelligenceV1p1beta1NormalizedVertex] = js.native
}
object GoogleCloudVideointelligenceV1p1beta1DetectedLandmark {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p1beta1DetectedLandmark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p1beta1DetectedLandmark]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p1beta1DetectedLandmarkOps[Self <: GoogleCloudVideointelligenceV1p1beta1DetectedLandmark] (val x: Self) extends AnyVal {
    
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
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfidence: Self = this.set("confidence", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPoint(value: GoogleCloudVideointelligenceV1p1beta1NormalizedVertex): Self = this.set("point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
  }
}
