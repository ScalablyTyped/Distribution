package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultNotificationOperations extends js.Object {
  def SendCustomNotification(
    UserOrUserGroupIDs: IUserOrUserGroupIDs,
    IncludeSubstituteUsers: Boolean,
    ExternalRecipients: IStrings,
    SendWithServerEmailIdentity: Boolean,
    Subject: String,
    Body: String
  ): Unit
}

object IVaultNotificationOperations {
  @scala.inline
  def apply(SendCustomNotification: (IUserOrUserGroupIDs, Boolean, IStrings, Boolean, String, String) => Unit): IVaultNotificationOperations = {
    val __obj = js.Dynamic.literal(SendCustomNotification = js.Any.fromFunction6(SendCustomNotification))
    __obj.asInstanceOf[IVaultNotificationOperations]
  }
}

