package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultNotificationOperations")
@js.native
class VaultNotificationOperations ()
  extends mfilesLib.IVaultNotificationOperations {
  /* CompleteClass */
  override def SendCustomNotification(
    UserOrUserGroupIDs: mfilesLib.IUserOrUserGroupIDs,
    IncludeSubstituteUsers: scala.Boolean,
    ExternalRecipients: mfilesLib.IStrings,
    SendWithServerEmailIdentity: scala.Boolean,
    Subject: java.lang.String,
    Body: java.lang.String
  ): scala.Unit = js.native
}

