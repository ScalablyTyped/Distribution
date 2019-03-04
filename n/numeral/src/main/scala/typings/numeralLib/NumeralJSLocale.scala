package typings
package numeralLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumeralJSLocale extends js.Object {
  var abbreviations: Anon_Billion
  var currency: Anon_Symbol
  var delimiters: Anon_Decimal
  def ordinal(num: scala.Double): java.lang.String
}

object NumeralJSLocale {
  @scala.inline
  def apply(
    abbreviations: Anon_Billion,
    currency: Anon_Symbol,
    delimiters: Anon_Decimal,
    ordinal: js.Function1[scala.Double, java.lang.String]
  ): NumeralJSLocale = {
    val __obj = js.Dynamic.literal(abbreviations = abbreviations, currency = currency, delimiters = delimiters, ordinal = ordinal)
  
    __obj.asInstanceOf[NumeralJSLocale]
  }
}

