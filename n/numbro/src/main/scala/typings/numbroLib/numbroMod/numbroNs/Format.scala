package typings
package numbroLib.numbroMod.numbroNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  var average: js.UndefOr[scala.Boolean] = js.undefined
  var characteristic: js.UndefOr[scala.Double] = js.undefined
  var forceAverage: js.UndefOr[
    numbroLib.numbroLibStrings.trillion | numbroLib.numbroLibStrings.billion | numbroLib.numbroLibStrings.million | numbroLib.numbroLibStrings.thousand
  ] = js.undefined
  var forceSign: js.UndefOr[scala.Boolean] = js.undefined
  var mantissa: js.UndefOr[scala.Double] = js.undefined
  var negative: js.UndefOr[numbroLib.numbroLibStrings.sign | numbroLib.numbroLibStrings.parenthesis] = js.undefined
  var optionalMantissa: js.UndefOr[scala.Boolean] = js.undefined
  var output: js.UndefOr[
    numbroLib.numbroLibStrings.currency | numbroLib.numbroLibStrings.percent | numbroLib.numbroLibStrings.byte | numbroLib.numbroLibStrings.time | numbroLib.numbroLibStrings.ordinal | numbroLib.numbroLibStrings.number
  ] = js.undefined
  var postfix: js.UndefOr[scala.Double] = js.undefined
  var prefix: js.UndefOr[scala.Double] = js.undefined
  var spaceSeparated: js.UndefOr[scala.Boolean] = js.undefined
  var thousandSeparated: js.UndefOr[scala.Boolean] = js.undefined
  var totalLength: js.UndefOr[scala.Double] = js.undefined
  var trimMantissa: js.UndefOr[scala.Boolean] = js.undefined
}

object Format {
  @scala.inline
  def apply(
    average: js.UndefOr[scala.Boolean] = js.undefined,
    characteristic: scala.Int | scala.Double = null,
    forceAverage: numbroLib.numbroLibStrings.trillion | numbroLib.numbroLibStrings.billion | numbroLib.numbroLibStrings.million | numbroLib.numbroLibStrings.thousand = null,
    forceSign: js.UndefOr[scala.Boolean] = js.undefined,
    mantissa: scala.Int | scala.Double = null,
    negative: numbroLib.numbroLibStrings.sign | numbroLib.numbroLibStrings.parenthesis = null,
    optionalMantissa: js.UndefOr[scala.Boolean] = js.undefined,
    output: numbroLib.numbroLibStrings.currency | numbroLib.numbroLibStrings.percent | numbroLib.numbroLibStrings.byte | numbroLib.numbroLibStrings.time | numbroLib.numbroLibStrings.ordinal | numbroLib.numbroLibStrings.number = null,
    postfix: scala.Int | scala.Double = null,
    prefix: scala.Int | scala.Double = null,
    spaceSeparated: js.UndefOr[scala.Boolean] = js.undefined,
    thousandSeparated: js.UndefOr[scala.Boolean] = js.undefined,
    totalLength: scala.Int | scala.Double = null,
    trimMantissa: js.UndefOr[scala.Boolean] = js.undefined
  ): Format = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(average)) __obj.updateDynamic("average")(average)
    if (characteristic != null) __obj.updateDynamic("characteristic")(characteristic.asInstanceOf[js.Any])
    if (forceAverage != null) __obj.updateDynamic("forceAverage")(forceAverage.asInstanceOf[js.Any])
    if (!js.isUndefined(forceSign)) __obj.updateDynamic("forceSign")(forceSign)
    if (mantissa != null) __obj.updateDynamic("mantissa")(mantissa.asInstanceOf[js.Any])
    if (negative != null) __obj.updateDynamic("negative")(negative.asInstanceOf[js.Any])
    if (!js.isUndefined(optionalMantissa)) __obj.updateDynamic("optionalMantissa")(optionalMantissa)
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (postfix != null) __obj.updateDynamic("postfix")(postfix.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceSeparated)) __obj.updateDynamic("spaceSeparated")(spaceSeparated)
    if (!js.isUndefined(thousandSeparated)) __obj.updateDynamic("thousandSeparated")(thousandSeparated)
    if (totalLength != null) __obj.updateDynamic("totalLength")(totalLength.asInstanceOf[js.Any])
    if (!js.isUndefined(trimMantissa)) __obj.updateDynamic("trimMantissa")(trimMantissa)
    __obj.asInstanceOf[Format]
  }
}

