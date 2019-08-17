package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Currency extends js.Object {
  var currency: String
  var value: String
}

object Currency {
  @scala.inline
  def apply(currency: String, value: String): Currency = {
    val __obj = js.Dynamic.literal(currency = currency, value = value)
  
    __obj.asInstanceOf[Currency]
  }
}

