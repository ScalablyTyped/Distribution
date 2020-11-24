package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Crop extends js.Object {
  
  /** The number of pixels to crop from the bottom. The default is 0. */
  var bottomPixels: js.UndefOr[Double] = js.native
  
  /** The number of pixels to crop from the left. The default is 0. */
  var leftPixels: js.UndefOr[Double] = js.native
  
  /** The number of pixels to crop from the right. The default is 0. */
  var rightPixels: js.UndefOr[Double] = js.native
  
  /** The number of pixels to crop from the top. The default is 0. */
  var topPixels: js.UndefOr[Double] = js.native
}
object Crop {
  
  @scala.inline
  def apply(): Crop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Crop]
  }
  
  @scala.inline
  implicit class CropOps[Self <: Crop] (val x: Self) extends AnyVal {
    
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
    def setBottomPixels(value: Double): Self = this.set("bottomPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomPixels: Self = this.set("bottomPixels", js.undefined)
    
    @scala.inline
    def setLeftPixels(value: Double): Self = this.set("leftPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftPixels: Self = this.set("leftPixels", js.undefined)
    
    @scala.inline
    def setRightPixels(value: Double): Self = this.set("rightPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightPixels: Self = this.set("rightPixels", js.undefined)
    
    @scala.inline
    def setTopPixels(value: Double): Self = this.set("topPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopPixels: Self = this.set("topPixels", js.undefined)
  }
}
