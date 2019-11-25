package typings.numbro.numbroMod.numbro

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
    val __obj = js.Dynamic.literal(abbreviations = abbreviations.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], delimiters = delimiters.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], languageTag = languageTag.asInstanceOf[js.Any], ordinal = js.Any.fromFunction1(ordinal))
    if (byteFormat != null) __obj.updateDynamic("byteFormat")(byteFormat.asInstanceOf[js.Any])
    if (currencyFormat != null) __obj.updateDynamic("currencyFormat")(currencyFormat.asInstanceOf[js.Any])
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (ordinalFormat != null) __obj.updateDynamic("ordinalFormat")(ordinalFormat.asInstanceOf[js.Any])
    if (percentageFormat != null) __obj.updateDynamic("percentageFormat")(percentageFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumbroLanguage]
  }
}

