package typings.paypalRestSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowedpaymentmethod extends js.Object {
  var allowed_payment_method: String
}

object AnonAllowedpaymentmethod {
  @scala.inline
  def apply(allowed_payment_method: String): AnonAllowedpaymentmethod = {
    val __obj = js.Dynamic.literal(allowed_payment_method = allowed_payment_method.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowedpaymentmethod]
  }
}

