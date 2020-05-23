package typings.paypalRestSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Allowedpaymentmethod extends js.Object {
  var allowed_payment_method: String
}

object Allowedpaymentmethod {
  @scala.inline
  def apply(allowed_payment_method: String): Allowedpaymentmethod = {
    val __obj = js.Dynamic.literal(allowed_payment_method = allowed_payment_method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Allowedpaymentmethod]
  }
}

