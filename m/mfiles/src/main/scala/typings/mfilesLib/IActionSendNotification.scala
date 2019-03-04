package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActionSendNotification extends js.Object {
  var Message: java.lang.String
  var RecipientsEx: IUserOrUserGroupIDExs
  var Subject: java.lang.String
  def Clone(): IActionSendNotification
}

object IActionSendNotification {
  @scala.inline
  def apply(
    Clone: js.Function0[IActionSendNotification],
    Message: java.lang.String,
    RecipientsEx: IUserOrUserGroupIDExs,
    Subject: java.lang.String
  ): IActionSendNotification = {
    val __obj = js.Dynamic.literal(Clone = Clone, Message = Message, RecipientsEx = RecipientsEx, Subject = Subject)
  
    __obj.asInstanceOf[IActionSendNotification]
  }
}

