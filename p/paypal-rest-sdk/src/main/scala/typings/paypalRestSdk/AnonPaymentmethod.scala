package typings.paypalRestSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPaymentmethod extends js.Object {
  var payment_method: String
}

object AnonPaymentmethod {
  @scala.inline
  def apply(payment_method: String): AnonPaymentmethod = {
    val __obj = js.Dynamic.literal(payment_method = payment_method.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPaymentmethod]
  }
}

