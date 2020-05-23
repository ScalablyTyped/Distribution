package typings.numbro.mod.numbro

import typings.numbro.anon.Code
import typings.numbro.anon.Decimal
import typings.numbro.anon.FourDigits
import typings.numbro.anon.Million
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumbroLanguage extends js.Object {
  var abbreviations: Million
  var byteFormat: js.UndefOr[Format] = js.undefined
  var currency: Code
  var currencyFormat: js.UndefOr[Format] = js.undefined
  var defaults: js.UndefOr[Format] = js.undefined
  var delimiters: Decimal
  var formats: FourDigits
  var languageTag: String
  var ordinalFormat: js.UndefOr[Format] = js.undefined
  var percentageFormat: js.UndefOr[Format] = js.undefined
  var spaceSeparated: js.UndefOr[Boolean] = js.undefined
  def ordinal(num: Double): String
}

object NumbroLanguage {
  @scala.inline
  def apply(
    abbreviations: Million,
    currency: Code,
    delimiters: Decimal,
    formats: FourDigits,
    languageTag: String,
    ordinal: Double => String,
    byteFormat: Format = null,
    currencyFormat: Format = null,
    defaults: Format = null,
    ordinalFormat: Format = null,
    percentageFormat: Format = null,
    spaceSeparated: js.UndefOr[Boolean] = js.undefined
  ): NumbroLanguage = {
    val __obj = js.Dynamic.literal(abbreviations = abbreviations.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], delimiters = delimiters.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], languageTag = languageTag.asInstanceOf[js.Any], ordinal = js.Any.fromFunction1(ordinal))
    if (byteFormat != null) __obj.updateDynamic("byteFormat")(byteFormat.asInstanceOf[js.Any])
    if (currencyFormat != null) __obj.updateDynamic("currencyFormat")(currencyFormat.asInstanceOf[js.Any])
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (ordinalFormat != null) __obj.updateDynamic("ordinalFormat")(ordinalFormat.asInstanceOf[js.Any])
    if (percentageFormat != null) __obj.updateDynamic("percentageFormat")(percentageFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceSeparated)) __obj.updateDynamic("spaceSeparated")(spaceSeparated.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumbroLanguage]
  }
}

