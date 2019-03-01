package typings
package pluploadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait plupload_resize extends js.Object {
  var crop: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var preserve_headers: js.UndefOr[scala.Boolean] = js.undefined
  var quality: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object plupload_resize {
  @scala.inline
  def apply(
    crop: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    preserve_headers: js.UndefOr[scala.Boolean] = js.undefined,
    quality: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): plupload_resize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(crop)) __obj.updateDynamic("crop")(crop)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(preserve_headers)) __obj.updateDynamic("preserve_headers")(preserve_headers)
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[plupload_resize]
  }
}

