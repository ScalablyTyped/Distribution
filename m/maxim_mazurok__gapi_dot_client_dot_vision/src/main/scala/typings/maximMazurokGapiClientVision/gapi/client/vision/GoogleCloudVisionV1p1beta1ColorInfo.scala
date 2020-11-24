package typings.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p1beta1ColorInfo extends js.Object {
  
  /** RGB components of the color. */
  var color: js.UndefOr[Color] = js.native
  
  /** The fraction of pixels the color occupies in the image. Value in range [0, 1]. */
  var pixelFraction: js.UndefOr[Double] = js.native
  
  /** Image-specific score for this color. Value in range [0, 1]. */
  var score: js.UndefOr[Double] = js.native
}
object GoogleCloudVisionV1p1beta1ColorInfo {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p1beta1ColorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p1beta1ColorInfo]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p1beta1ColorInfoOps[Self <: GoogleCloudVisionV1p1beta1ColorInfo] (val x: Self) extends AnyVal {
    
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
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setPixelFraction(value: Double): Self = this.set("pixelFraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelFraction: Self = this.set("pixelFraction", js.undefined)
    
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScore: Self = this.set("score", js.undefined)
  }
}
