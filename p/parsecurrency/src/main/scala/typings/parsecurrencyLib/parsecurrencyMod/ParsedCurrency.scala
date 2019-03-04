package typings
package parsecurrencyLib.parsecurrencyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedCurrency extends js.Object {
  var currency: java.lang.String
  var decimalSeparator: java.lang.String
  var decimals: java.lang.String
  var groupSeparator: java.lang.String
  var integer: java.lang.String
  var raw: java.lang.String
  var symbol: java.lang.String
  var value: scala.Double
}

object ParsedCurrency {
  @scala.inline
  def apply(
    currency: java.lang.String,
    decimalSeparator: java.lang.String,
    decimals: java.lang.String,
    groupSeparator: java.lang.String,
    integer: java.lang.String,
    raw: java.lang.String,
    symbol: java.lang.String,
    value: scala.Double
  ): ParsedCurrency = {
    val __obj = js.Dynamic.literal(currency = currency, decimalSeparator = decimalSeparator, decimals = decimals, groupSeparator = groupSeparator, integer = integer, raw = raw, symbol = symbol, value = value)
  
    __obj.asInstanceOf[ParsedCurrency]
  }
}

