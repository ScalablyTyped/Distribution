package typings.naverWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptureVisibleTabOptions extends js.Object {
  /**
    * Optional. The format of an image.
    * One of: "jpeg", or "png"
    */
  var format: js.UndefOr[String] = js.native
  /**
    * Optional.
    * When format is "jpeg", controls the quality of the resulting image. This value is ignored for PNG images. As quality is decreased, the resulting image will have more visual artifacts, and the number of bytes needed to store it will decrease.
    */
  var quality: js.UndefOr[Double] = js.native
}

object CaptureVisibleTabOptions {
  @scala.inline
  def apply(): CaptureVisibleTabOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptureVisibleTabOptions]
  }
  @scala.inline
  implicit class CaptureVisibleTabOptionsOps[Self <: CaptureVisibleTabOptions] (val x: Self) extends AnyVal {
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
  }
  
}

