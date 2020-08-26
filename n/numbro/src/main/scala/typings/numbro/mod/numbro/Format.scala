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

@js.native
trait Format extends js.Object {
  var abbreviations: js.UndefOr[Billion] = js.native
  var average: js.UndefOr[Boolean] = js.native
  var base: js.UndefOr[decimal | binary | general] = js.native
  var characteristic: js.UndefOr[Double] = js.native
  var currencyPosition: js.UndefOr[prefix | infix | postfix] = js.native
  var currencySymbol: js.UndefOr[String] = js.native
  var exponential: js.UndefOr[Boolean] = js.native
  var forceAverage: js.UndefOr[trillion | billion | million | thousand] = js.native
  var forceSign: js.UndefOr[Boolean] = js.native
  var mantissa: js.UndefOr[Double] = js.native
  var negative: js.UndefOr[sign | parenthesis] = js.native
  var optionalCharacteristic: js.UndefOr[Boolean] = js.native
  var optionalMantissa: js.UndefOr[Boolean] = js.native
  var output: js.UndefOr[currency | percent | byte | time | ordinal | number] = js.native
  var postfix: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var prefixSymbol: js.UndefOr[Boolean] = js.native
  var roundingFunction: js.UndefOr[js.Function1[/* num */ Double, Double]] = js.native
  var spaceSeparated: js.UndefOr[Boolean] = js.native
  var spaceSeparatedCurrency: js.UndefOr[Boolean] = js.native
  var thousandSeparated: js.UndefOr[Boolean] = js.native
  var totalLength: js.UndefOr[Double] = js.native
  var trimMantissa: js.UndefOr[Boolean] = js.native
}

object Format {
  @scala.inline
  def apply(): Format = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Format]
  }
  @scala.inline
  implicit class FormatOps[Self <: Format] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAbbreviations(value: Billion): Self = this.set("abbreviations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbbreviations: Self = this.set("abbreviations", js.undefined)
    @scala.inline
    def setAverage(value: Boolean): Self = this.set("average", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAverage: Self = this.set("average", js.undefined)
    @scala.inline
    def setBase(value: decimal | binary | general): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    @scala.inline
    def setCharacteristic(value: Double): Self = this.set("characteristic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharacteristic: Self = this.set("characteristic", js.undefined)
    @scala.inline
    def setCurrencyPosition(value: prefix | infix | postfix): Self = this.set("currencyPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencyPosition: Self = this.set("currencyPosition", js.undefined)
    @scala.inline
    def setCurrencySymbol(value: String): Self = this.set("currencySymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencySymbol: Self = this.set("currencySymbol", js.undefined)
    @scala.inline
    def setExponential(value: Boolean): Self = this.set("exponential", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExponential: Self = this.set("exponential", js.undefined)
    @scala.inline
    def setForceAverage(value: trillion | billion | million | thousand): Self = this.set("forceAverage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceAverage: Self = this.set("forceAverage", js.undefined)
    @scala.inline
    def setForceSign(value: Boolean): Self = this.set("forceSign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceSign: Self = this.set("forceSign", js.undefined)
    @scala.inline
    def setMantissa(value: Double): Self = this.set("mantissa", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMantissa: Self = this.set("mantissa", js.undefined)
    @scala.inline
    def setNegative(value: sign | parenthesis): Self = this.set("negative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegative: Self = this.set("negative", js.undefined)
    @scala.inline
    def setOptionalCharacteristic(value: Boolean): Self = this.set("optionalCharacteristic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionalCharacteristic: Self = this.set("optionalCharacteristic", js.undefined)
    @scala.inline
    def setOptionalMantissa(value: Boolean): Self = this.set("optionalMantissa", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionalMantissa: Self = this.set("optionalMantissa", js.undefined)
    @scala.inline
    def setOutput(value: currency | percent | byte | time | ordinal | number): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    @scala.inline
    def setPostfix(value: String): Self = this.set("postfix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostfix: Self = this.set("postfix", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setPrefixSymbol(value: Boolean): Self = this.set("prefixSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixSymbol: Self = this.set("prefixSymbol", js.undefined)
    @scala.inline
    def setRoundingFunction(value: /* num */ Double => Double): Self = this.set("roundingFunction", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRoundingFunction: Self = this.set("roundingFunction", js.undefined)
    @scala.inline
    def setSpaceSeparated(value: Boolean): Self = this.set("spaceSeparated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpaceSeparated: Self = this.set("spaceSeparated", js.undefined)
    @scala.inline
    def setSpaceSeparatedCurrency(value: Boolean): Self = this.set("spaceSeparatedCurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpaceSeparatedCurrency: Self = this.set("spaceSeparatedCurrency", js.undefined)
    @scala.inline
    def setThousandSeparated(value: Boolean): Self = this.set("thousandSeparated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThousandSeparated: Self = this.set("thousandSeparated", js.undefined)
    @scala.inline
    def setTotalLength(value: Double): Self = this.set("totalLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalLength: Self = this.set("totalLength", js.undefined)
    @scala.inline
    def setTrimMantissa(value: Boolean): Self = this.set("trimMantissa", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrimMantissa: Self = this.set("trimMantissa", js.undefined)
  }
  
}

