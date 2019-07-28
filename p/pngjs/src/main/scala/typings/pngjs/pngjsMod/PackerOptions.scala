package typings.pngjs.pngjsMod

import typings.pngjs.Anon_Blue
import typings.pngjs.Fn_Options
import typings.pngjs.pngjsNumbers.`16`
import typings.pngjs.pngjsNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackerOptions extends js.Object {
  var bgColor: js.UndefOr[Anon_Blue] = js.undefined
  var bitDepth: js.UndefOr[`8` | `16`] = js.undefined
  var colorType: js.UndefOr[ColorType] = js.undefined
  var deflateChunkSize: js.UndefOr[Double] = js.undefined
  var deflateFactory: js.UndefOr[Fn_Options] = js.undefined
  var deflateLevel: js.UndefOr[Double] = js.undefined
  var deflateStrategy: js.UndefOr[Double] = js.undefined
  var filterType: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var inputColorType: js.UndefOr[ColorType] = js.undefined
  var inputHasAlpha: js.UndefOr[Boolean] = js.undefined
}

object PackerOptions {
  @scala.inline
  def apply(
    bgColor: Anon_Blue = null,
    bitDepth: `8` | `16` = null,
    colorType: ColorType = null,
    deflateChunkSize: Int | Double = null,
    deflateFactory: Fn_Options = null,
    deflateLevel: Int | Double = null,
    deflateStrategy: Int | Double = null,
    filterType: Double | js.Array[Double] = null,
    inputColorType: ColorType = null,
    inputHasAlpha: js.UndefOr[Boolean] = js.undefined
  ): PackerOptions = {
    val __obj = js.Dynamic.literal()
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor)
    if (bitDepth != null) __obj.updateDynamic("bitDepth")(bitDepth.asInstanceOf[js.Any])
    if (colorType != null) __obj.updateDynamic("colorType")(colorType)
    if (deflateChunkSize != null) __obj.updateDynamic("deflateChunkSize")(deflateChunkSize.asInstanceOf[js.Any])
    if (deflateFactory != null) __obj.updateDynamic("deflateFactory")(deflateFactory)
    if (deflateLevel != null) __obj.updateDynamic("deflateLevel")(deflateLevel.asInstanceOf[js.Any])
    if (deflateStrategy != null) __obj.updateDynamic("deflateStrategy")(deflateStrategy.asInstanceOf[js.Any])
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    if (inputColorType != null) __obj.updateDynamic("inputColorType")(inputColorType)
    if (!js.isUndefined(inputHasAlpha)) __obj.updateDynamic("inputHasAlpha")(inputHasAlpha)
    __obj.asInstanceOf[PackerOptions]
  }
}

