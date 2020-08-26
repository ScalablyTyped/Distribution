package typings.pica.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PicaResizeOptions extends js.Object {
  // use alpha channel. Default = false.
  var alpha: js.UndefOr[Boolean] = js.native
  // Promise instance. If defined, current operation will be terminated on rejection.
  var cancelToken: js.UndefOr[String] = js.native
  // 0..3. Default = 3 (lanczos, win=3).
  var quality: js.UndefOr[Double] = js.native
  // >=0, in percents. Default = 0 (off). Usually between 50 to 100 is good.
  var unsharpAmount: js.UndefOr[Double] = js.native
  //  0.5..2.0. By default it's not set. Radius of Gaussian blur.
  // If it is less than 0.5, Unsharp Mask is off. Big values are clamped to 2.0.
  var unsharpRadius: js.UndefOr[Double] = js.native
  // 0..255. Default = 0. Threshold for applying unsharp mask.
  var unsharpThreshold: js.UndefOr[Double] = js.native
}

object PicaResizeOptions {
  @scala.inline
  def apply(): PicaResizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PicaResizeOptions]
  }
  @scala.inline
  implicit class PicaResizeOptionsOps[Self <: PicaResizeOptions] (val x: Self) extends AnyVal {
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
    def setAlpha(value: Boolean): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    @scala.inline
    def setCancelToken(value: String): Self = this.set("cancelToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelToken: Self = this.set("cancelToken", js.undefined)
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

