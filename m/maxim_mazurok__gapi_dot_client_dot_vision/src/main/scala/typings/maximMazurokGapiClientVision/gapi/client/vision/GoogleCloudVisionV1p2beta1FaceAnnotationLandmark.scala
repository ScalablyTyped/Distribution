package typings.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p2beta1FaceAnnotationLandmark extends js.Object {
  
  /** Face landmark position. */
  var position: js.UndefOr[GoogleCloudVisionV1p2beta1Position] = js.native
  
  /** Face landmark type. */
  var `type`: js.UndefOr[String] = js.native
}
object GoogleCloudVisionV1p2beta1FaceAnnotationLandmark {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p2beta1FaceAnnotationLandmark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p2beta1FaceAnnotationLandmark]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p2beta1FaceAnnotationLandmarkOps[Self <: GoogleCloudVisionV1p2beta1FaceAnnotationLandmark] (val x: Self) extends AnyVal {
    
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
    def setPosition(value: GoogleCloudVisionV1p2beta1Position): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
