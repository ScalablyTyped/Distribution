package typings.numbro.mod.numbro

import typings.numbro.anon.Billion
import typings.numbro.numbroStrings.billion
import typings.numbro.numbroStrings.binary
import typings.numbro.numbroStrings.byte
import typings.numbro.numbroStrings.currency
import typings.numbro.numbroStrings.decimal
import typings.numbro.numbroStrings.general
import typings.numbro.numbroStrings.infix
import typings.numbro.numbroStrings.million
import typings.numbro.numbroStrings.number
import typings.numbro.numbroStrings.ordinal
import typings.numbro.numbroStrings.parenthesis
import typings.numbro.numbroStrings.percent
import typings.numbro.numbroStrings.postfix
import typings.numbro.numbroStrings.prefix
import typings.numbro.numbroStrings.sign
import typings.numbro.numbroStrings.thousand
import typings.numbro.numbroStrings.time
import typings.numbro.numbroStrings.trillion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  var abbreviations: js.UndefOr[Billion] = js.undefined
  var average: js.UndefOr[Boolean] = js.undefined
  var base: js.UndefOr[decimal | binary | general] = js.undefined
  var characteristic: js.UndefOr[Double] = js.undefined
  var currencyPosition: js.UndefOr[prefix | infix | postfix] = js.undefined
  var currencySymbol: js.UndefOr[String] = js.undefined
  var exponential: js.UndefOr[Boolean] = js.undefined
  var forceAverage: js.UndefOr[trillion | billion | million | thousand] = js.undefined
  var forceSign: js.UndefOr[Boolean] = js.undefined
  var mantissa: js.UndefOr[Double] = js.undefined
  var negative: js.UndefOr[sign | parenthesis] = js.undefined
  var optionalCharacteristic: js.UndefOr[Boolean] = js.undefined
  var optionalMantissa: js.UndefOr[Boolean] = js.undefined
  var output: js.UndefOr[currency | percent | byte | time | ordinal | number] = js.undefined
  var postfix: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var prefixSymbol: js.UndefOr[Boolean] = js.undefined
  var roundingFunction: js.UndefOr[js.Function1[/* num */ Double, Double]] = js.undefined
  var spaceSeparated: js.UndefOr[Boolean] = js.undefined
  var spaceSeparatedCurrency: js.UndefOr[Boolean] = js.undefined
  var thousandSeparated: js.UndefOr[Boolean] = js.undefined
  var totalLength: js.UndefOr[Double] = js.undefined
  var trimMantissa: js.UndefOr[Boolean] = js.undefined
}

object Format {
  @scala.inline
  def apply(
    abbreviations: Billion = null,
    average: js.UndefOr[Boolean] = js.undefined,
    base: decimal | binary | general = null,
    characteristic: js.UndefOr[Double] = js.undefined,
    currencyPosition: prefix | infix | postfix = null,
    currencySymbol: String = null,
    exponential: js.UndefOr[Boolean] = js.undefined,
    forceAverage: trillion | billion | million | thousand = null,
    forceSign: js.UndefOr[Boolean] = js.undefined,
    mantissa: js.UndefOr[Double] = js.undefined,
    negative: sign | parenthesis = null,
    optionalCharacteristic: js.UndefOr[Boolean] = js.undefined,
    optionalMantissa: js.UndefOr[Boolean] = js.undefined,
    output: currency | percent | byte | time | ordinal | number = null,
    postfix: String = null,
    prefix: String = null,
    prefixSymbol: js.UndefOr[Boolean] = js.undefined,
    roundingFunction: /* num */ Double => Double = null,
    spaceSeparated: js.UndefOr[Boolean] = js.undefined,
    spaceSeparatedCurrency: js.UndefOr[Boolean] = js.undefined,
    thousandSeparated: js.UndefOr[Boolean] = js.undefined,
    totalLength: js.UndefOr[Double] = js.undefined,
    trimMantissa: js.UndefOr[Boolean] = js.undefined
  ): Format = {
    val __obj = js.Dynamic.literal()
    if (abbreviations != null) __obj.updateDynamic("abbreviations")(abbreviations.asInstanceOf[js.Any])
    if (!js.isUndefined(average)) __obj.updateDynamic("average")(average.get.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (!js.isUndefined(characteristic)) __obj.updateDynamic("characteristic")(characteristic.get.asInstanceOf[js.Any])
    if (currencyPosition != null) __obj.updateDynamic("currencyPosition")(currencyPosition.asInstanceOf[js.Any])
    if (currencySymbol != null) __obj.updateDynamic("currencySymbol")(currencySymbol.asInstanceOf[js.Any])
    if (!js.isUndefined(exponential)) __obj.updateDynamic("exponential")(exponential.get.asInstanceOf[js.Any])
    if (forceAverage != null) __obj.updateDynamic("forceAverage")(forceAverage.asInstanceOf[js.Any])
    if (!js.isUndefined(forceSign)) __obj.updateDynamic("forceSign")(forceSign.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mantissa)) __obj.updateDynamic("mantissa")(mantissa.get.asInstanceOf[js.Any])
    if (negative != null) __obj.updateDynamic("negative")(negative.asInstanceOf[js.Any])
    if (!js.isUndefined(optionalCharacteristic)) __obj.updateDynamic("optionalCharacteristic")(optionalCharacteristic.get.asInstanceOf[js.Any])
    if (!js.isUndefined(optionalMantissa)) __obj.updateDynamic("optionalMantissa")(optionalMantissa.get.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (postfix != null) __obj.updateDynamic("postfix")(postfix.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(prefixSymbol)) __obj.updateDynamic("prefixSymbol")(prefixSymbol.get.asInstanceOf[js.Any])
    if (roundingFunction != null) __obj.updateDynamic("roundingFunction")(js.Any.fromFunction1(roundingFunction))
    if (!js.isUndefined(spaceSeparated)) __obj.updateDynamic("spaceSeparated")(spaceSeparated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceSeparatedCurrency)) __obj.updateDynamic("spaceSeparatedCurrency")(spaceSeparatedCurrency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(thousandSeparated)) __obj.updateDynamic("thousandSeparated")(thousandSeparated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalLength)) __obj.updateDynamic("totalLength")(totalLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trimMantissa)) __obj.updateDynamic("trimMantissa")(trimMantissa.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
}

