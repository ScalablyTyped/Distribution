package typings
package pngDashAsyncLib.pngDashAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IImageOptions extends js.Object {
  var checkCRC: js.UndefOr[scala.Boolean] = js.undefined
  var deflateChunkSize: js.UndefOr[scala.Double] = js.undefined
  var deflateLevel: js.UndefOr[scala.Double] = js.undefined
  var deflateStrategy: js.UndefOr[EDeflateStrategy] = js.undefined
  var fill: js.UndefOr[scala.Boolean] = js.undefined
  var filterType: js.UndefOr[EFilterType] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object IImageOptions {
  @scala.inline
  def apply(
    checkCRC: js.UndefOr[scala.Boolean] = js.undefined,
    deflateChunkSize: scala.Int | scala.Double = null,
    deflateLevel: scala.Int | scala.Double = null,
    deflateStrategy: EDeflateStrategy = null,
    fill: js.UndefOr[scala.Boolean] = js.undefined,
    filterType: EFilterType = null,
    height: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): IImageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkCRC)) __obj.updateDynamic("checkCRC")(checkCRC)
    if (deflateChunkSize != null) __obj.updateDynamic("deflateChunkSize")(deflateChunkSize.asInstanceOf[js.Any])
    if (deflateLevel != null) __obj.updateDynamic("deflateLevel")(deflateLevel.asInstanceOf[js.Any])
    if (deflateStrategy != null) __obj.updateDynamic("deflateStrategy")(deflateStrategy)
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (filterType != null) __obj.updateDynamic("filterType")(filterType)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IImageOptions]
  }
}

