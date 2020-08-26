package typings.pica.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PicaResizeBufferOptions extends js.Object {
  // use alpha channel. Default = false.
  var alpha: js.UndefOr[Boolean] = js.native
  // Optional. Output buffer to write data, if you don't wish pica to create new one.
  var dest: js.UndefOr[String] = js.native
  // src image height.
  var height: Double = js.native
  // 0..3. Default = 3 (lanczos, win=3).
  var quality: js.UndefOr[Double] = js.native
  // Uint8Array with source data.
  var src: js.Array[Double] = js.native
  // output height, >=0, in pixels.
  var toHeigh: Double = js.native
  // output width, >=0, in pixels.
  var toWidth: Double = js.native
  // >=0, in percents. Default = 0 (off). Usually between 50 to 100 is good.
  var unsharpAmount: js.UndefOr[Double] = js.native
  // 0.5..2.0. Radius of Gaussian blur.
  // If it is less than 0.5, Unsharp Mask is off. Big values are clamped to 2.0.
  var unsharpRadius: js.UndefOr[Double] = js.native
  // 0..255. Default = 0. Threshold for applying unsharp mask.
  var unsharpThreshold: js.UndefOr[Double] = js.native
  // src image width.
  var width: Double = js.native
}

object PicaResizeBufferOptions {
  @scala.inline
  def apply(height: Double, src: js.Array[Double], toHeigh: Double, toWidth: Double, width: Double): PicaResizeBufferOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], toHeigh = toHeigh.asInstanceOf[js.Any], toWidth = toWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PicaResizeBufferOptions]
  }
  @scala.inline
  implicit class PicaResizeBufferOptionsOps[Self <: PicaResizeBufferOptions] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrcVarargs(value: Double*): Self = this.set("src", js.Array(value :_*))
    @scala.inline
    def setSrc(value: js.Array[Double]): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setToHeigh(value: Double): Self = this.set("toHeigh", value.asInstanceOf[js.Any])
    @scala.inline
    def setToWidth(value: Double): Self = this.set("toWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlpha(value: Boolean): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    @scala.inline
    def setDest(value: String): Self = this.set("dest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDest: Self = this.set("dest", js.undefined)
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    @scala.inline
    def setUnsharpAmount(value: Double): Self = this.set("unsharpAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnsharpAmount: Self = this.set("unsharpAmount", js.undefined)
    @scala.inline
    def setUnsharpRadius(value: Double): Self = this.set("unsharpRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnsharpRadius: Self = this.set("unsharpRadius", js.undefined)
    @scala.inline
    def setUnsharpThreshold(value: Double): Self = this.set("unsharpThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnsharpThreshold: Self = this.set("unsharpThreshold", js.undefined)
  }
  
}

