package typings
package pngjs2Lib.pngjs2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PNGOptions extends js.Object {
  var checkCRC: js.UndefOr[scala.Boolean] = js.undefined
  var colorType: js.UndefOr[scala.Double] = js.undefined
  var deflateChunkSize: js.UndefOr[scala.Double] = js.undefined
  var deflateFactory: js.UndefOr[js.Any] = js.undefined
  var deflateLevel: js.UndefOr[scala.Double] = js.undefined
  var deflateStrategy: js.UndefOr[scala.Double] = js.undefined
  var filterType: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var inputHasAlpha: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object PNGOptions {
  @scala.inline
  def apply(
    checkCRC: js.UndefOr[scala.Boolean] = js.undefined,
    colorType: scala.Int | scala.Double = null,
    deflateChunkSize: scala.Int | scala.Double = null,
    deflateFactory: js.Any = null,
    deflateLevel: scala.Int | scala.Double = null,
    deflateStrategy: scala.Int | scala.Double = null,
    filterType: scala.Double | js.Array[scala.Double] = null,
    height: scala.Int | scala.Double = null,
    inputHasAlpha: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): PNGOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkCRC)) __obj.updateDynamic("checkCRC")(checkCRC)
    if (colorType != null) __obj.updateDynamic("colorType")(colorType.asInstanceOf[js.Any])
    if (deflateChunkSize != null) __obj.updateDynamic("deflateChunkSize")(deflateChunkSize.asInstanceOf[js.Any])
    if (deflateFactory != null) __obj.updateDynamic("deflateFactory")(deflateFactory)
    if (deflateLevel != null) __obj.updateDynamic("deflateLevel")(deflateLevel.asInstanceOf[js.Any])
    if (deflateStrategy != null) __obj.updateDynamic("deflateStrategy")(deflateStrategy.asInstanceOf[js.Any])
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(inputHasAlpha)) __obj.updateDynamic("inputHasAlpha")(inputHasAlpha)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PNGOptions]
  }
}

