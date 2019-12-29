package typings.pica

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PicaResizeBufferOptions extends js.Object {
  // use alpha channel. Default = false.
  var alpha: js.UndefOr[Boolean] = js.undefined
  // Optional. Output buffer to write data, if you don't wish pica to create new one.
  var dest: js.UndefOr[String] = js.undefined
  // src image height.
  var height: Double
  // 0..3. Default = 3 (lanczos, win=3).
  var quality: js.UndefOr[Double] = js.undefined
  // Uint8Array with source data.
  var src: js.Array[Double]
  // output height, >=0, in pixels.
  var toHeigh: Double
  // output width, >=0, in pixels.
  var toWidth: Double
  // >=0, in percents. Default = 0 (off). Usually between 50 to 100 is good.
  var unsharpAmount: js.UndefOr[Double] = js.undefined
  // 0.5..2.0. Radius of Gaussian blur.
  // If it is less than 0.5, Unsharp Mask is off. Big values are clamped to 2.0.
  var unsharpRadius: js.UndefOr[Double] = js.undefined
  // 0..255. Default = 0. Threshold for applying unsharp mask.
  var unsharpThreshold: js.UndefOr[Double] = js.undefined
  // src image width.
  var width: Double
}

object PicaResizeBufferOptions {
  @scala.inline
  def apply(
    height: Double,
    src: js.Array[Double],
    toHeigh: Double,
    toWidth: Double,
    width: Double,
    alpha: js.UndefOr[Boolean] = js.undefined,
    dest: String = null,
    quality: Int | Double = null,
    unsharpAmount: Int | Double = null,
    unsharpRadius: Int | Double = null,
    unsharpThreshold: Int | Double = null
  ): PicaResizeBufferOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], toHeigh = toHeigh.asInstanceOf[js.Any], toWidth = toWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (dest != null) __obj.updateDynamic("dest")(dest.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (unsharpAmount != null) __obj.updateDynamic("unsharpAmount")(unsharpAmount.asInstanceOf[js.Any])
    if (unsharpRadius != null) __obj.updateDynamic("unsharpRadius")(unsharpRadius.asInstanceOf[js.Any])
    if (unsharpThreshold != null) __obj.updateDynamic("unsharpThreshold")(unsharpThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[PicaResizeBufferOptions]
  }
}

