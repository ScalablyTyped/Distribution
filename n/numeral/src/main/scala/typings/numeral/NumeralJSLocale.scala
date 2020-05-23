package typings.numeral

import typings.numeral.anon.Billion
import typings.numeral.anon.Decimal
import typings.numeral.anon.Symbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumeralJSLocale extends js.Object {
  var abbreviations: Billion
  var currency: Symbol
  var delimiters: Decimal
  def ordinal(num: Double): String
}

object NumeralJSLocale {
  @scala.inline
  def apply(abbreviations: Billion, currency: Symbol, delimiters: Decimal, ordinal: Double => String): NumeralJSLocale = {
    val __obj = js.Dynamic.literal(abbreviations = abbreviations.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], delimiters = delimiters.asInstanceOf[js.Any], ordinal = js.Any.fromFunction1(ordinal))
    __obj.asInstanceOf[NumeralJSLocale]
  }
}

