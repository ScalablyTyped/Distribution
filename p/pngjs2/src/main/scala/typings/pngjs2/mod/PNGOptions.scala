package typings.pngjs2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PNGOptions extends js.Object {
  var checkCRC: js.UndefOr[Boolean] = js.undefined
  var colorType: js.UndefOr[Double] = js.undefined
  var deflateChunkSize: js.UndefOr[Double] = js.undefined
  var deflateFactory: js.UndefOr[js.Any] = js.undefined
  var deflateLevel: js.UndefOr[Double] = js.undefined
  var deflateStrategy: js.UndefOr[Double] = js.undefined
  var filterType: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var inputHasAlpha: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object PNGOptions {
  @scala.inline
  def apply(
    checkCRC: js.UndefOr[Boolean] = js.undefined,
    colorType: js.UndefOr[Double] = js.undefined,
    deflateChunkSize: js.UndefOr[Double] = js.undefined,
    deflateFactory: js.Any = null,
    deflateLevel: js.UndefOr[Double] = js.undefined,
    deflateStrategy: js.UndefOr[Double] = js.undefined,
    filterType: Double | js.Array[Double] = null,
    height: js.UndefOr[Double] = js.undefined,
    inputHasAlpha: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): PNGOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkCRC)) __obj.updateDynamic("checkCRC")(checkCRC.get.asInstanceOf[js.Any])
    if (!js.isUndefined(colorType)) __obj.updateDynamic("colorType")(colorType.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deflateChunkSize)) __obj.updateDynamic("deflateChunkSize")(deflateChunkSize.get.asInstanceOf[js.Any])
    if (deflateFactory != null) __obj.updateDynamic("deflateFactory")(deflateFactory.asInstanceOf[js.Any])
    if (!js.isUndefined(deflateLevel)) __obj.updateDynamic("deflateLevel")(deflateLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deflateStrategy)) __obj.updateDynamic("deflateStrategy")(deflateStrategy.get.asInstanceOf[js.Any])
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inputHasAlpha)) __obj.updateDynamic("inputHasAlpha")(inputHasAlpha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PNGOptions]
  }
}

