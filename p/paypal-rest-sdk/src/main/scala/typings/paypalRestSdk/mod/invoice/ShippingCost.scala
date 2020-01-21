package typings.paypalRestSdk.mod.invoice

import typings.paypalRestSdk.mod.Currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingCost extends js.Object {
  var amount: js.UndefOr[Currency] = js.undefined
  var tax: js.UndefOr[Tax] = js.undefined
}

object ShippingCost {
  @scala.inline
  def apply(amount: Currency = null, tax: Tax = null): ShippingCost = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (tax != null) __obj.updateDynamic("tax")(tax.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShippingCost]
  }
}

