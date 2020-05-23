package typings.paystack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Email extends js.Object {
  var email: String
  var first_name: String
  var last_name: String
  var metadata: js.UndefOr[js.Any] = js.undefined
  var phone: String
}

object Email {
  @scala.inline
  def apply(email: String, first_name: String, last_name: String, phone: String, metadata: js.Any = null): Email = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Email]
  }
}

