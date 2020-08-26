package typings.paypalRestSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Allowedpaymentmethod extends js.Object {
  var allowed_payment_method: String = js.native
}

object Allowedpaymentmethod {
  @scala.inline
  def apply(allowed_payment_method: String): Allowedpaymentmethod = {
    val __obj = js.Dynamic.literal(allowed_payment_method = allowed_payment_method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Allowedpaymentmethod]
  }
  @scala.inline
  implicit class AllowedpaymentmethodOps[Self <: Allowedpaymentmethod] (val x: Self) extends AnyVal {
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
    def setAllowed_payment_method(value: String): Self = this.set("allowed_payment_method", value.asInstanceOf[js.Any])
  }
  
}

