package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageBitmapOptions extends js.Object {
  var colorSpaceConversion: js.UndefOr[
    pdfjsDashDistLib.pdfjsDashDistLibStrings.none | pdfjsDashDistLib.pdfjsDashDistLibStrings.default
  ] = js.undefined
  var imageOrientation: js.UndefOr[
    pdfjsDashDistLib.pdfjsDashDistLibStrings.none | pdfjsDashDistLib.pdfjsDashDistLibStrings.flipY
  ] = js.undefined
  var premultiplyAlpha: js.UndefOr[
    pdfjsDashDistLib.pdfjsDashDistLibStrings.none | pdfjsDashDistLib.pdfjsDashDistLibStrings.premultiply | pdfjsDashDistLib.pdfjsDashDistLibStrings.default
  ] = js.undefined
  var resizeHeight: js.UndefOr[scala.Double] = js.undefined
  var resizeQuality: js.UndefOr[
    pdfjsDashDistLib.pdfjsDashDistLibStrings.pixelated | pdfjsDashDistLib.pdfjsDashDistLibStrings.low | pdfjsDashDistLib.pdfjsDashDistLibStrings.medium | pdfjsDashDistLib.pdfjsDashDistLibStrings.high
  ] = js.undefined
  var resizeWidth: js.UndefOr[scala.Double] = js.undefined
}

object ImageBitmapOptions {
  @scala.inline
  def apply(
    colorSpaceConversion: pdfjsDashDistLib.pdfjsDashDistLibStrings.none | pdfjsDashDistLib.pdfjsDashDistLibStrings.default = null,
    imageOrientation: pdfjsDashDistLib.pdfjsDashDistLibStrings.none | pdfjsDashDistLib.pdfjsDashDistLibStrings.flipY = null,
    premultiplyAlpha: pdfjsDashDistLib.pdfjsDashDistLibStrings.none | pdfjsDashDistLib.pdfjsDashDistLibStrings.premultiply | pdfjsDashDistLib.pdfjsDashDistLibStrings.default = null,
    resizeHeight: scala.Int | scala.Double = null,
    resizeQuality: pdfjsDashDistLib.pdfjsDashDistLibStrings.pixelated | pdfjsDashDistLib.pdfjsDashDistLibStrings.low | pdfjsDashDistLib.pdfjsDashDistLibStrings.medium | pdfjsDashDistLib.pdfjsDashDistLibStrings.high = null,
    resizeWidth: scala.Int | scala.Double = null
  ): ImageBitmapOptions = {
    val __obj = js.Dynamic.literal()
    if (colorSpaceConversion != null) __obj.updateDynamic("colorSpaceConversion")(colorSpaceConversion.asInstanceOf[js.Any])
    if (imageOrientation != null) __obj.updateDynamic("imageOrientation")(imageOrientation.asInstanceOf[js.Any])
    if (premultiplyAlpha != null) __obj.updateDynamic("premultiplyAlpha")(premultiplyAlpha.asInstanceOf[js.Any])
    if (resizeHeight != null) __obj.updateDynamic("resizeHeight")(resizeHeight.asInstanceOf[js.Any])
    if (resizeQuality != null) __obj.updateDynamic("resizeQuality")(resizeQuality.asInstanceOf[js.Any])
    if (resizeWidth != null) __obj.updateDynamic("resizeWidth")(resizeWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageBitmapOptions]
  }
}

