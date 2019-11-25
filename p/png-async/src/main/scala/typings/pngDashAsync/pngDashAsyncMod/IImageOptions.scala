package typings.pngDashAsync.pngDashAsyncMod

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
    deflateChunkSize: Int | Double = null,
    deflateLevel: Int | Double = null,
    deflateStrategy: EDeflateStrategy = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    filterType: EFilterType = null,
    height: Int | Double = null,
    width: Int | Double = null
  ): IImageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkCRC)) __obj.updateDynamic("checkCRC")(checkCRC.asInstanceOf[js.Any])
    if (deflateChunkSize != null) __obj.updateDynamic("deflateChunkSize")(deflateChunkSize.asInstanceOf[js.Any])
    if (deflateLevel != null) __obj.updateDynamic("deflateLevel")(deflateLevel.asInstanceOf[js.Any])
    if (deflateStrategy != null) __obj.updateDynamic("deflateStrategy")(deflateStrategy.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IImageOptions]
  }
}

