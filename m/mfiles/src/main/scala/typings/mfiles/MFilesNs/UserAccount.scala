package typings.mfiles.MFilesNs

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IAccessControlList
import typings.mfiles.IUserAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.UserAccount")
@js.native
class UserAccount () extends IUserAccount {
  /* CompleteClass */
  override var AccessControlList: IAccessControlList = js.native
  /* CompleteClass */
  override var Enabled: Boolean = js.native
  /* CompleteClass */
  override var ID: Double = js.native
  /* CompleteClass */
  override var InternalUser: Boolean = js.native
  /* CompleteClass */
  override var LoginName: String = js.native
  /* CompleteClass */
  override var VaultLanguage: Double = js.native
  /* CompleteClass */
  override var VaultRoles: MFUserAccountVaultRole = js.native
  /* CompleteClass */
  override def AddVaultRoles(VaultRolesToAdd: MFUserAccountVaultRole): Unit = js.native
  /* CompleteClass */
  override def Clone(): IUserAccount = js.native
  /* CompleteClass */
  override def CloneFrom(UserAccount: IUserAccount): Unit = js.native
  /* CompleteClass */
  override def RemoveVaultRoles(VaultRolesToRemove: MFUserAccountVaultRole): Unit = js.native
}

@JSGlobal("MFiles.UserAccount")
@js.native
object UserAccount extends Instantiable0[IUserAccount]

