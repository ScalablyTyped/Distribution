package typings.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p4beta1FaceRecognitionResult extends js.Object {
  
  /** The Celebrity that this face was matched to. */
  var celebrity: js.UndefOr[GoogleCloudVisionV1p4beta1Celebrity] = js.native
  
  /** Recognition confidence. Range [0, 1]. */
  var confidence: js.UndefOr[Double] = js.native
}
object GoogleCloudVisionV1p4beta1FaceRecognitionResult {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p4beta1FaceRecognitionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p4beta1FaceRecognitionResult]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p4beta1FaceRecognitionResultOps[Self <: GoogleCloudVisionV1p4beta1FaceRecognitionResult] (val x: Self) extends AnyVal {
    
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
    def setCelebrity(value: GoogleCloudVisionV1p4beta1Celebrity): Self = this.set("celebrity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCelebrity: Self = this.set("celebrity", js.undefined)
    
    @scala.inline
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfidence: Self = this.set("confidence", js.undefined)
  }
}
