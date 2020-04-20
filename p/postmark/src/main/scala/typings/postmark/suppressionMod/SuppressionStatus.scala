package typings.postmark.suppressionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuppressionStatus extends js.Object {
  var EmailAddress: String
  var Message: String
  var Status: String
}

object SuppressionStatus {
  @scala.inline
  def apply(EmailAddress: String, Message: String, Status: String): SuppressionStatus = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuppressionStatus]
  }
}

