package typings.numeral

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumeralJSLocale extends js.Object {
  var abbreviations: AnonBillion
  var currency: AnonSymbol
  var delimiters: AnonDecimal
  def ordinal(num: Double): String
}

object NumeralJSLocale {
  @scala.inline
  def apply(
    abbreviations: AnonBillion,
    currency: AnonSymbol,
    delimiters: AnonDecimal,
    ordinal: Double => String
  ): NumeralJSLocale = {
    val __obj = js.Dynamic.literal(abbreviations = abbreviations.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], delimiters = delimiters.asInstanceOf[js.Any], ordinal = js.Any.fromFunction1(ordinal))
    __obj.asInstanceOf[NumeralJSLocale]
  }
}

