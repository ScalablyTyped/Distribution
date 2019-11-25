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
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], decimalSeparator = decimalSeparator.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], groupSeparator = groupSeparator.asInstanceOf[js.Any], integer = integer.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParsedCurrency]
  }
}

