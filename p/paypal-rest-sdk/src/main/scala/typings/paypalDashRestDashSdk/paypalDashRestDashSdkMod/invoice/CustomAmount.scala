package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoice

import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.Currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomAmount extends js.Object {
  var amount: Currency
  var label: String
}

object CustomAmount {
  @scala.inline
  def apply(amount: Currency, label: String): CustomAmount = {
    val __obj = js.Dynamic.literal(amount = amount, label = label)
  
    __obj.asInstanceOf[CustomAmount]
  }
}

