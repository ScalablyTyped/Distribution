package typings.postmark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmailAddress extends js.Object {
  var EmailAddress: String
}

object AnonEmailAddress {
  @scala.inline
  def apply(EmailAddress: String): AnonEmailAddress = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmailAddress]
  }
}

