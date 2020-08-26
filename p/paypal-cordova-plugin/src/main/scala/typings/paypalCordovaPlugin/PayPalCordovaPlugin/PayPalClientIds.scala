package typings.paypalCordovaPlugin.PayPalCordovaPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PayPalClientIds extends js.Object {
  var PayPalEnvironmentProduction: String = js.native
  var PayPalEnvironmentSandbox: String = js.native
}

object PayPalClientIds {
  @scala.inline
  def apply(PayPalEnvironmentProduction: String, PayPalEnvironmentSandbox: String): PayPalClientIds = {
    val __obj = js.Dynamic.literal(PayPalEnvironmentProduction = PayPalEnvironmentProduction.asInstanceOf[js.Any], PayPalEnvironmentSandbox = PayPalEnvironmentSandbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayPalClientIds]
  }
  @scala.inline
  implicit class PayPalClientIdsOps[Self <: PayPalClientIds] (val x: Self) extends AnyVal {
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
    def setPayPalEnvironmentProduction(value: String): Self = this.set("PayPalEnvironmentProduction", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayPalEnvironmentSandbox(value: String): Self = this.set("PayPalEnvironmentSandbox", value.asInstanceOf[js.Any])
  }
  
}

