package typings
package pngjsLib.pngjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackerOptions extends js.Object {
  var bgColor: js.UndefOr[pngjsLib.Anon_Blue] = js.undefined
  var bitDepth: js.UndefOr[pngjsLib.pngjsLibNumbers.`8` | pngjsLib.pngjsLibNumbers.`16`] = js.undefined
  var colorType: js.UndefOr[ColorType] = js.undefined
  var deflateChunkSize: js.UndefOr[scala.Double] = js.undefined
  var deflateFactory: js.UndefOr[pngjsLib.Fn_Options] = js.undefined
  var deflateLevel: js.UndefOr[scala.Double] = js.undefined
  var deflateStrategy: js.UndefOr[scala.Double] = js.undefined
  var filterType: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var inputColorType: js.UndefOr[ColorType] = js.undefined
  var inputHasAlpha: js.UndefOr[scala.Boolean] = js.undefined
}

object PackerOptions {
  @scala.inline
  def apply(
    bgColor: pngjsLib.Anon_Blue = null,
    bitDepth: pngjsLib.pngjsLibNumbers.`8` | pngjsLib.pngjsLibNumbers.`16` = null,
    colorType: ColorType = null,
    deflateChunkSize: scala.Int | scala.Double = null,
    deflateFactory: pngjsLib.Fn_Options = null,
    deflateLevel: scala.Int | scala.Double = null,
    deflateStrategy: scala.Int | scala.Double = null,
    filterType: scala.Double | js.Array[scala.Double] = null,
    inputColorType: ColorType = null,
    inputHasAlpha: js.UndefOr[scala.Boolean] = js.undefined
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

