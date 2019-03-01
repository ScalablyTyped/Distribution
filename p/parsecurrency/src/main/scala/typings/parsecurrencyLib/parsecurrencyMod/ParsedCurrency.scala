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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currency")(currency)
    __obj.updateDynamic("decimalSeparator")(decimalSeparator)
    __obj.updateDynamic("decimals")(decimals)
    __obj.updateDynamic("groupSeparator")(groupSeparator)
    __obj.updateDynamic("integer")(integer)
    __obj.updateDynamic("raw")(raw)
    __obj.updateDynamic("symbol")(symbol)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ParsedCurrency]
  }
}

