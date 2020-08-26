package typings.paypalRestSdk.mod.invoice

import typings.paypalRestSdk.mod.Currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomAmount extends js.Object {
  var amount: Currency = js.native
  var label: String = js.native
}

object CustomAmount {
  @scala.inline
  def apply(amount: Currency, label: String): CustomAmount = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomAmount]
  }
  @scala.inline
  implicit class CustomAmountOps[Self <: CustomAmount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAmount(value: Currency): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

