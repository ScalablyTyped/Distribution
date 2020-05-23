package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailVerified extends js.Object {
  var email: String
  var verified: Boolean
}

object EmailVerified {
  @scala.inline
  def apply(email: String, verified: Boolean): EmailVerified = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailVerified]
  }
}

