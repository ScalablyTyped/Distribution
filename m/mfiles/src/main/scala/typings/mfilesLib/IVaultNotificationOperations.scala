package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IVaultNotificationOperations extends js.Object {
  def SendCustomNotification(
    UserOrUserGroupIDs: IUserOrUserGroupIDs,
    IncludeSubstituteUsers: scala.Boolean,
    ExternalRecipients: IStrings,
    SendWithServerEmailIdentity: scala.Boolean,
    Subject: java.lang.String,
    Body: java.lang.String
  ): scala.Unit
}

