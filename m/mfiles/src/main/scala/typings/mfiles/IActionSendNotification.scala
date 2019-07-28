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
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Message = Message, RecipientsEx = RecipientsEx, Subject = Subject)
  
    __obj.asInstanceOf[IActionSendNotification]
  }
}

