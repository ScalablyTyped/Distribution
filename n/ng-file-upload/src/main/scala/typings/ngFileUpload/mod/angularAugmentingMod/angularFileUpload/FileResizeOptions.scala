package typings.ngFileUpload.mod.angularAugmentingMod.angularFileUpload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileResizeOptions extends js.Object {
  var centerCrop: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var pattern: js.UndefOr[String] = js.undefined
  var quality: js.UndefOr[Double] = js.undefined
  var ratio: js.UndefOr[Double | String] = js.undefined
  var resizeIf: js.UndefOr[ResizeIfFunction] = js.undefined
  var restoreExif: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object FileResizeOptions {
  @scala.inline
  def apply(
    centerCrop: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    pattern: String = null,
    quality: js.UndefOr[Double] = js.undefined,
    ratio: Double | String = null,
    resizeIf: (/* width */ Double, /* height */ Double) => Boolean = null,
    restoreExif: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): FileResizeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(centerCrop)) __obj.updateDynamic("centerCrop")(centerCrop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (resizeIf != null) __obj.updateDynamic("resizeIf")(js.Any.fromFunction2(resizeIf))
    if (!js.isUndefined(restoreExif)) __obj.updateDynamic("restoreExif")(restoreExif.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileResizeOptions]
  }
}

