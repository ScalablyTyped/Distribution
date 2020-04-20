package typings.mfiles

import typings.mfiles.MFiles.MFUserAccountVaultRole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserAccount extends js.Object {
  var AccessControlList: IAccessControlList
  var Enabled: Boolean
  var ID: Double
  var InternalUser: Boolean
  var LoginName: String
  var VaultLanguage: Double
  var VaultRoles: MFUserAccountVaultRole
  def AddVaultRoles(VaultRolesToAdd: MFUserAccountVaultRole): Unit
  def Clone(): IUserAccount
  def CloneFrom(UserAccount: IUserAccount): Unit
  def RemoveVaultRoles(VaultRolesToRemove: MFUserAccountVaultRole): Unit
}

object IUserAccount {
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    AddVaultRoles: MFUserAccountVaultRole => Unit,
    Clone: () => IUserAccount,
    CloneFrom: IUserAccount => Unit,
    Enabled: Boolean,
    ID: Double,
    InternalUser: Boolean,
    LoginName: String,
    RemoveVaultRoles: MFUserAccountVaultRole => Unit,
    VaultLanguage: Double,
    VaultRoles: MFUserAccountVaultRole
  ): IUserAccount = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList.asInstanceOf[js.Any], AddVaultRoles = js.Any.fromFunction1(AddVaultRoles), Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), Enabled = Enabled.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], InternalUser = InternalUser.asInstanceOf[js.Any], LoginName = LoginName.asInstanceOf[js.Any], RemoveVaultRoles = js.Any.fromFunction1(RemoveVaultRoles), VaultLanguage = VaultLanguage.asInstanceOf[js.Any], VaultRoles = VaultRoles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUserAccount]
  }
}

