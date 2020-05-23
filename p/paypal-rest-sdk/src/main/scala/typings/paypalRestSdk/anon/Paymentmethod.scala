package typings.paypalRestSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Paymentmethod extends js.Object {
  var payment_method: String
}

object Paymentmethod {
  @scala.inline
  def apply(payment_method: String): Paymentmethod = {
    val __obj = js.Dynamic.literal(payment_method = payment_method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paymentmethod]
  }
}

