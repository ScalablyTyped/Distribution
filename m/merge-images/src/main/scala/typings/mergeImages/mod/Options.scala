package typings.mergeImages.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var Canvas: js.UndefOr[js.Any] = js.undefined
  var Images: js.UndefOr[js.Any] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var quality: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    Canvas: js.Any = null,
    Images: js.Any = null,
    format: String = null,
    height: js.UndefOr[Double] = js.undefined,
    quality: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (Canvas != null) __obj.updateDynamic("Canvas")(Canvas.asInstanceOf[js.Any])
    if (Images != null) __obj.updateDynamic("Images")(Images.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

