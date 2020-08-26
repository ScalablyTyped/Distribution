package typings.paypalCheckoutComponents.callbackDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizationData extends js.Object {
  var billingToken: js.UndefOr[String] = js.native
  var payerId: String = js.native
  var paymentId: js.UndefOr[String] = js.native
  var vault: js.UndefOr[Boolean] = js.native
}

object AuthorizationData {
  @scala.inline
  def apply(payerId: String): AuthorizationData = {
    val __obj = js.Dynamic.literal(payerId = payerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationData]
  }
  @scala.inline
  implicit class AuthorizationDataOps[Self <: AuthorizationData] (val x: Self) extends AnyVal {
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
    def setPayerId(value: String): Self = this.set("payerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setBillingToken(value: String): Self = this.set("billingToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBillingToken: Self = this.set("billingToken", js.undefined)
    @scala.inline
    def setPaymentId(value: String): Self = this.set("paymentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentId: Self = this.set("paymentId", js.undefined)
    @scala.inline
    def setVault(value: Boolean): Self = this.set("vault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVault: Self = this.set("vault", js.undefined)
  }
  
}

