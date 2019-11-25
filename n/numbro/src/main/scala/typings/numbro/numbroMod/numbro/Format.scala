package typings.numbro.numbroMod.numbro

import typings.numbro.numbroStrings.billion
import typings.numbro.numbroStrings.byte
import typings.numbro.numbroStrings.currency
import typings.numbro.numbroStrings.million
import typings.numbro.numbroStrings.number
import typings.numbro.numbroStrings.ordinal
import typings.numbro.numbroStrings.parenthesis
import typings.numbro.numbroStrings.percent
import typings.numbro.numbroStrings.sign
import typings.numbro.numbroStrings.thousand
import typings.numbro.numbroStrings.time
import typings.numbro.numbroStrings.trillion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  var average: js.UndefOr[Boolean] = js.undefined
  var characteristic: js.UndefOr[Double] = js.undefined
  var forceAverage: js.UndefOr[trillion | billion | million | thousand] = js.undefined
  var forceSign: js.UndefOr[Boolean] = js.undefined
  var mantissa: js.UndefOr[Double] = js.undefined
  var negative: js.UndefOr[sign | parenthesis] = js.undefined
  var optionalMantissa: js.UndefOr[Boolean] = js.undefined
  var output: js.UndefOr[currency | percent | byte | time | ordinal | number] = js.undefined
  var postfix: js.UndefOr[Double] = js.undefined
  var prefix: js.UndefOr[Double] = js.undefined
  var spaceSeparated: js.UndefOr[Boolean] = js.undefined
  var thousandSeparated: js.UndefOr[Boolean] = js.undefined
  var totalLength: js.UndefOr[Double] = js.undefined
  var trimMantissa: js.UndefOr[Boolean] = js.undefined
}

object Format {
  @scala.inline
  def apply(
    average: js.UndefOr[Boolean] = js.undefined,
    characteristic: Int | Double = null,
    forceAverage: trillion | billion | million | thousand = null,
    forceSign: js.UndefOr[Boolean] = js.undefined,
    mantissa: Int | Double = null,
    negative: sign | parenthesis = null,
    optionalMantissa: js.UndefOr[Boolean] = js.undefined,
    output: currency | percent | byte | time | ordinal | number = null,
    postfix: Int | Double = null,
    prefix: Int | Double = null,
    spaceSeparated: js.UndefOr[Boolean] = js.undefined,
    thousandSeparated: js.UndefOr[Boolean] = js.undefined,
    totalLength: Int | Double = null,
    trimMantissa: js.UndefOr[Boolean] = js.undefined
  ): Format = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(average)) __obj.updateDynamic("average")(average.asInstanceOf[js.Any])
    if (characteristic != null) __obj.updateDynamic("characteristic")(characteristic.asInstanceOf[js.Any])
    if (forceAverage != null) __obj.updateDynamic("forceAverage")(forceAverage.asInstanceOf[js.Any])
    if (!js.isUndefined(forceSign)) __obj.updateDynamic("forceSign")(forceSign.asInstanceOf[js.Any])
    if (mantissa != null) __obj.updateDynamic("mantissa")(mantissa.asInstanceOf[js.Any])
    if (negative != null) __obj.updateDynamic("negative")(negative.asInstanceOf[js.Any])
    if (!js.isUndefined(optionalMantissa)) __obj.updateDynamic("optionalMantissa")(optionalMantissa.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (postfix != null) __obj.updateDynamic("postfix")(postfix.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceSeparated)) __obj.updateDynamic("spaceSeparated")(spaceSeparated.asInstanceOf[js.Any])
    if (!js.isUndefined(thousandSeparated)) __obj.updateDynamic("thousandSeparated")(thousandSeparated.asInstanceOf[js.Any])
    if (totalLength != null) __obj.updateDynamic("totalLength")(totalLength.asInstanceOf[js.Any])
    if (!js.isUndefined(trimMantissa)) __obj.updateDynamic("trimMantissa")(trimMantissa.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
}

