package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoice

import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.Currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cost extends js.Object {
  var amount: js.UndefOr[Currency] = js.undefined
  var percent: js.UndefOr[Double] = js.undefined
}

object Cost {
  @scala.inline
  def apply(amount: Currency = null, percent: Int | Double = null): Cost = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount)
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cost]
  }
}

