package typings.pngAsync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IImageOptions extends js.Object {
  var checkCRC: js.UndefOr[Boolean] = js.undefined
  var deflateChunkSize: js.UndefOr[Double] = js.undefined
  var deflateLevel: js.UndefOr[Double] = js.undefined
  var deflateStrategy: js.UndefOr[EDeflateStrategy] = js.undefined
  var fill: js.UndefOr[Boolean] = js.undefined
  var filterType: js.UndefOr[EFilterType] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object IImageOptions {
  @scala.inline
  def apply(
    checkCRC: js.UndefOr[Boolean] = js.undefined,
    deflateChunkSize: js.UndefOr[Double] = js.undefined,
    deflateLevel: js.UndefOr[Double] = js.undefined,
    deflateStrategy: EDeflateStrategy = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    filterType: EFilterType = null,
    height: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): IImageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkCRC)) __obj.updateDynamic("checkCRC")(checkCRC.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deflateChunkSize)) __obj.updateDynamic("deflateChunkSize")(deflateChunkSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deflateLevel)) __obj.updateDynamic("deflateLevel")(deflateLevel.get.asInstanceOf[js.Any])
    if (deflateStrategy != null) __obj.updateDynamic("deflateStrategy")(deflateStrategy.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.get.asInstanceOf[js.Any])
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IImageOptions]
  }
}

