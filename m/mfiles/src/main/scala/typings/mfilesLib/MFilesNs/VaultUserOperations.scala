package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultUserOperations")
@js.native
class VaultUserOperations ()
  extends mfilesLib.IVaultUserOperations {
  /* CompleteClass */
  override def AddOrUndeleteUserAccount(User: mfilesLib.IUserAccount): mfilesLib.IUserAccount = js.native
  /* CompleteClass */
  override def AddUserAccount(User: mfilesLib.IUserAccount): mfilesLib.IUserAccount = js.native
  /* CompleteClass */
  override def GetLoginAccountOfUser(UserID: scala.Double): mfilesLib.ILoginAccount = js.native
  /* CompleteClass */
  override def GetLoginAccounts(): mfilesLib.ILoginAccounts = js.native
  /* CompleteClass */
  override def GetUserAccount(UserID: scala.Double): mfilesLib.IUserAccount = js.native
  /* CompleteClass */
  override def GetUserAccounts(): mfilesLib.IUserAccounts = js.native
  /* CompleteClass */
  override def GetUserIDByGUID(UserGUID: java.lang.String): scala.Double = js.native
  /* CompleteClass */
  override def GetUserList(): mfilesLib.IKeyNamePairs = js.native
  /* CompleteClass */
  override def ModifyUserAccount(User: mfilesLib.IUserAccount): scala.Unit = js.native
  /* CompleteClass */
  override def RemoveUserAccount(UserID: scala.Double): scala.Unit = js.native
}

