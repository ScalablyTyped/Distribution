package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActionSendNotification extends js.Object {
  var Message: String
  var RecipientsEx: IUserOrUserGroupIDExs
  var Subject: String
  def Clone(): IActionSendNotification
}

object IActionSendNotification {
  @scala.inline
  def apply(
    Clone: () => IActionSendNotification,
    Message: String,
    RecipientsEx: IUserOrUserGroupIDExs,
    Subject: String
  ): IActionSendNotification = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Message = Message.asInstanceOf[js.Any], RecipientsEx = RecipientsEx.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionSendNotification]
  }
}

