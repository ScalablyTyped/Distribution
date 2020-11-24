package typings.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p1beta1CropHintsAnnotation extends js.Object {
  
  /** Crop hint results. */
  var cropHints: js.UndefOr[js.Array[GoogleCloudVisionV1p1beta1CropHint]] = js.native
}
object GoogleCloudVisionV1p1beta1CropHintsAnnotation {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p1beta1CropHintsAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p1beta1CropHintsAnnotation]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p1beta1CropHintsAnnotationOps[Self <: GoogleCloudVisionV1p1beta1CropHintsAnnotation] (val x: Self) extends AnyVal {
    
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
    def setCropHintsVarargs(value: GoogleCloudVisionV1p1beta1CropHint*): Self = this.set("cropHints", js.Array(value :_*))
    
    @scala.inline
    def setCropHints(value: js.Array[GoogleCloudVisionV1p1beta1CropHint]): Self = this.set("cropHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCropHints: Self = this.set("cropHints", js.undefined)
  }
}
