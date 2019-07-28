package typings.parsecurrency.parsecurrencyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedCurrency extends js.Object {
  var currency: String
  var decimalSeparator: String
  var decimals: String
  var groupSeparator: String
  var integer: String
  var raw: String
  var symbol: String
  var value: Double
}

object ParsedCurrency {
  @scala.inline
  def apply(
    currency: String,
    decimalSeparator: String,
    decimals: String,
    groupSeparator: String,
    integer: String,
    raw: String,
    symbol: String,
    value: Double
  ): ParsedCurrency = {
    val __obj = js.Dynamic.literal(currency = currency, decimalSeparator = decimalSeparator, decimals = decimals, groupSeparator = groupSeparator, integer = integer, raw = raw, symbol = symbol, value = value)
  
    __obj.asInstanceOf[ParsedCurrency]
  }
}

