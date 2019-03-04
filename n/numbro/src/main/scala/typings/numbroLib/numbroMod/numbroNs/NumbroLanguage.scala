package typings
package numbroLib.numbroMod.numbroNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumbroLanguage extends js.Object {
  var abbreviations: numbroLib.Anon_Billion
  var byteFormat: js.UndefOr[Format] = js.undefined
  var currency: numbroLib.Anon_Code
  var currencyFormat: js.UndefOr[Format] = js.undefined
  var defaults: js.UndefOr[Format] = js.undefined
  var delimiters: numbroLib.Anon_Decimal
  var formats: numbroLib.Anon_FourDigits
  var languageTag: java.lang.String
  var ordinalFormat: js.UndefOr[Format] = js.undefined
  var percentageFormat: js.UndefOr[Format] = js.undefined
  def ordinal(num: scala.Double): java.lang.String
}

object NumbroLanguage {
  @scala.inline
  def apply(
    abbreviations: numbroLib.Anon_Billion,
    currency: numbroLib.Anon_Code,
    delimiters: numbroLib.Anon_Decimal,
    formats: numbroLib.Anon_FourDigits,
    languageTag: java.lang.String,
    ordinal: js.Function1[scala.Double, java.lang.String],
    byteFormat: Format = null,
    currencyFormat: Format = null,
    defaults: Format = null,
    ordinalFormat: Format = null,
    percentageFormat: Format = null
  ): NumbroLanguage = {
    val __obj = js.Dynamic.literal(abbreviations = abbreviations, currency = currency, delimiters = delimiters, formats = formats, languageTag = languageTag, ordinal = ordinal)
    if (byteFormat != null) __obj.updateDynamic("byteFormat")(byteFormat)
    if (currencyFormat != null) __obj.updateDynamic("currencyFormat")(currencyFormat)
    if (defaults != null) __obj.updateDynamic("defaults")(defaults)
    if (ordinalFormat != null) __obj.updateDynamic("ordinalFormat")(ordinalFormat)
    if (percentageFormat != null) __obj.updateDynamic("percentageFormat")(percentageFormat)
    __obj.asInstanceOf[NumbroLanguage]
  }
}

