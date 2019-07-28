package typings.numbro.numbroMod.numbroNs

import typings.numbro.Anon_Billion
import typings.numbro.Anon_Code
import typings.numbro.Anon_Decimal
import typings.numbro.Anon_FourDigits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumbroLanguage extends js.Object {
  var abbreviations: Anon_Billion
  var byteFormat: js.UndefOr[Format] = js.undefined
  var currency: Anon_Code
  var currencyFormat: js.UndefOr[Format] = js.undefined
  var defaults: js.UndefOr[Format] = js.undefined
  var delimiters: Anon_Decimal
  var formats: Anon_FourDigits
  var languageTag: String
  var ordinalFormat: js.UndefOr[Format] = js.undefined
  var percentageFormat: js.UndefOr[Format] = js.undefined
  def ordinal(num: Double): String
}

object NumbroLanguage {
  @scala.inline
  def apply(
    abbreviations: Anon_Billion,
    currency: Anon_Code,
    delimiters: Anon_Decimal,
    formats: Anon_FourDigits,
    languageTag: String,
    ordinal: Double => String,
    byteFormat: Format = null,
    currencyFormat: Format = null,
    defaults: Format = null,
    ordinalFormat: Format = null,
    percentageFormat: Format = null
  ): NumbroLanguage = {
    val __obj = js.Dynamic.literal(abbreviations = abbreviations, currency = currency, delimiters = delimiters, formats = formats, languageTag = languageTag, ordinal = js.Any.fromFunction1(ordinal))
    if (byteFormat != null) __obj.updateDynamic("byteFormat")(byteFormat)
    if (currencyFormat != null) __obj.updateDynamic("currencyFormat")(currencyFormat)
    if (defaults != null) __obj.updateDynamic("defaults")(defaults)
    if (ordinalFormat != null) __obj.updateDynamic("ordinalFormat")(ordinalFormat)
    if (percentageFormat != null) __obj.updateDynamic("percentageFormat")(percentageFormat)
    __obj.asInstanceOf[NumbroLanguage]
  }
}

