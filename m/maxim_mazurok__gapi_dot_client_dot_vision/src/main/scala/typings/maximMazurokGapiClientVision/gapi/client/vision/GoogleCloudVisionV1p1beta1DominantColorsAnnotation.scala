package typings.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p1beta1DominantColorsAnnotation extends js.Object {
  
  /** RGB color values with their score and pixel fraction. */
  var colors: js.UndefOr[js.Array[GoogleCloudVisionV1p1beta1ColorInfo]] = js.native
}
object GoogleCloudVisionV1p1beta1DominantColorsAnnotation {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p1beta1DominantColorsAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p1beta1DominantColorsAnnotation]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p1beta1DominantColorsAnnotationOps[Self <: GoogleCloudVisionV1p1beta1DominantColorsAnnotation] (val x: Self) extends AnyVal {
    
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
    def setColorsVarargs(value: GoogleCloudVisionV1p1beta1ColorInfo*): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: js.Array[GoogleCloudVisionV1p1beta1ColorInfo]): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
  }
}
