package typings.numeral

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumeralJSLocale extends js.Object {
  var abbreviations: Anon_Billion
  var currency: Anon_Symbol
  var delimiters: Anon_Decimal
  def ordinal(num: Double): String
}

object NumeralJSLocale {
  @scala.inline
  def apply(
    abbreviations: Anon_Billion,
    currency: Anon_Symbol,
    delimiters: Anon_Decimal,
    ordinal: Double => String
  ): NumeralJSLocale = {
    val __obj = js.Dynamic.literal(abbreviations = abbreviations.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], delimiters = delimiters.asInstanceOf[js.Any], ordinal = js.Any.fromFunction1(ordinal))
  
    __obj.asInstanceOf[NumeralJSLocale]
  }
}

