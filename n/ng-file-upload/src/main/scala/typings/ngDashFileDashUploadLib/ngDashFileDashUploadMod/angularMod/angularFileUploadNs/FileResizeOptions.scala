package typings
package ngDashFileDashUploadLib.ngDashFileDashUploadMod.angularMod.angularFileUploadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileResizeOptions extends js.Object {
  var centerCrop: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  var quality: js.UndefOr[scala.Double] = js.undefined
  var ratio: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var resizeIf: js.UndefOr[ResizeIfFunction] = js.undefined
  var restoreExif: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object FileResizeOptions {
  @scala.inline
  def apply(
    centerCrop: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    pattern: java.lang.String = null,
    quality: scala.Int | scala.Double = null,
    ratio: scala.Double | java.lang.String = null,
    resizeIf: ResizeIfFunction = null,
    restoreExif: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): FileResizeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(centerCrop)) __obj.updateDynamic("centerCrop")(centerCrop)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (resizeIf != null) __obj.updateDynamic("resizeIf")(resizeIf)
    if (!js.isUndefined(restoreExif)) __obj.updateDynamic("restoreExif")(restoreExif)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileResizeOptions]
  }
}

