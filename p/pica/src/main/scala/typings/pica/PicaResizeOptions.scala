package typings.pica

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PicaResizeOptions extends js.Object {
  // use alpha channel. Default = false.
  var alpha: js.UndefOr[Boolean] = js.undefined
  // Promise instance. If defined, current operation will be terminated on rejection.
  var cancelToken: js.UndefOr[String] = js.undefined
  // 0..3. Default = 3 (lanczos, win=3).
  var quality: js.UndefOr[Double] = js.undefined
  // >=0, in percents. Default = 0 (off). Usually between 50 to 100 is good.
  var unsharpAmount: js.UndefOr[Double] = js.undefined
  //  0.5..2.0. By default it's not set. Radius of Gaussian blur.
  // If it is less than 0.5, Unsharp Mask is off. Big values are clamped to 2.0.
  var unsharpRadius: js.UndefOr[Double] = js.undefined
  // 0..255. Default = 0. Threshold for applying unsharp mask.
  var unsharpThreshold: js.UndefOr[Double] = js.undefined
}

object PicaResizeOptions {
  @scala.inline
  def apply(
    alpha: js.UndefOr[Boolean] = js.undefined,
    cancelToken: String = null,
    quality: js.UndefOr[Double] = js.undefined,
    unsharpAmount: js.UndefOr[Double] = js.undefined,
    unsharpRadius: js.UndefOr[Double] = js.undefined,
    unsharpThreshold: js.UndefOr[Double] = js.undefined
  ): PicaResizeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (cancelToken != null) __obj.updateDynamic("cancelToken")(cancelToken.asInstanceOf[js.Any])
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unsharpAmount)) __obj.updateDynamic("unsharpAmount")(unsharpAmount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unsharpRadius)) __obj.updateDynamic("unsharpRadius")(unsharpRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unsharpThreshold)) __obj.updateDynamic("unsharpThreshold")(unsharpThreshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PicaResizeOptions]
  }
}

