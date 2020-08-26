package typings.paypalCheckoutComponents.callbackDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancellationData extends js.Object {
  var billingID: String = js.native
  var button_version: String = js.native
  var cancelUrl: String = js.native
  var intent: String = js.native
  var paymentID: String = js.native
  var paymentToken: String = js.native
}

object CancellationData {
  @scala.inline
  def apply(
    billingID: String,
    button_version: String,
    cancelUrl: String,
    intent: String,
    paymentID: String,
    paymentToken: String
  ): CancellationData = {
    val __obj = js.Dynamic.literal(billingID = billingID.asInstanceOf[js.Any], button_version = button_version.asInstanceOf[js.Any], cancelUrl = cancelUrl.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], paymentID = paymentID.asInstanceOf[js.Any], paymentToken = paymentToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancellationData]
  }
  @scala.inline
  implicit class CancellationDataOps[Self <: CancellationData] (val x: Self) extends AnyVal {
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
    def setBillingID(value: String): Self = this.set("billingID", value.asInstanceOf[js.Any])
    @scala.inline
    def setButton_version(value: String): Self = this.set("button_version", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancelUrl(value: String): Self = this.set("cancelUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntent(value: String): Self = this.set("intent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaymentID(value: String): Self = this.set("paymentID", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaymentToken(value: String): Self = this.set("paymentToken", value.asInstanceOf[js.Any])
  }
  
}

