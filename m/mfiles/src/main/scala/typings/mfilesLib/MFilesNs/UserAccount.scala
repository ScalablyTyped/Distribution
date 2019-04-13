package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.UserAccount")
@js.native
class UserAccount ()
  extends mfilesLib.IUserAccount {
  /* CompleteClass */
  override var AccessControlList: mfilesLib.IAccessControlList = js.native
  /* CompleteClass */
  override var Enabled: scala.Boolean = js.native
  /* CompleteClass */
  override var ID: scala.Double = js.native
  /* CompleteClass */
  override var InternalUser: scala.Boolean = js.native
  /* CompleteClass */
  override var LoginName: java.lang.String = js.native
  /* CompleteClass */
  override var VaultLanguage: scala.Double = js.native
  /* CompleteClass */
  override var VaultRoles: MFUserAccountVaultRole = js.native
  /* CompleteClass */
  override def AddVaultRoles(VaultRolesToAdd: MFUserAccountVaultRole): scala.Unit = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IUserAccount = js.native
  /* CompleteClass */
  override def CloneFrom(UserAccount: mfilesLib.IUserAccount): scala.Unit = js.native
  /* CompleteClass */
  override def RemoveVaultRoles(VaultRolesToRemove: MFUserAccountVaultRole): scala.Unit = js.native
}

@JSGlobal("MFiles.UserAccount")
@js.native
object UserAccount
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IUserAccount]

