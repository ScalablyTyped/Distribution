package typings.paystack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthorizationcode extends js.Object {
  var amount: Double
  var authorization_code: String
  var email: String
  var reference: String
}

object AnonAuthorizationcode {
  @scala.inline
  def apply(amount: Double, authorization_code: String, email: String, reference: String): AnonAuthorizationcode = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], authorization_code = authorization_code.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthorizationcode]
  }
}

