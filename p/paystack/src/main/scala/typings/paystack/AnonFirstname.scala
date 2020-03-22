package typings.paystack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFirstname extends js.Object {
  var email: String
  var first_name: String
  var last_name: String
  var phone: String
}

object AnonFirstname {
  @scala.inline
  def apply(email: String, first_name: String, last_name: String, phone: String): AnonFirstname = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFirstname]
  }
}

