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

object IVaultNotificationOperations {
  @scala.inline
  def apply(
    SendCustomNotification: js.Function6[
      IUserOrUserGroupIDs, 
      scala.Boolean, 
      IStrings, 
      scala.Boolean, 
      java.lang.String, 
      java.lang.String, 
      scala.Unit
    ]
  ): IVaultNotificationOperations = {
    val __obj = js.Dynamic.literal(SendCustomNotification = SendCustomNotification)
  
    __obj.asInstanceOf[IVaultNotificationOperations]
  }
}

