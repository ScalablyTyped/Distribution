package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserAccount extends js.Object {
  var AccessControlList: IAccessControlList
  var Enabled: scala.Boolean
  var ID: scala.Double
  var InternalUser: scala.Boolean
  var LoginName: java.lang.String
  var VaultLanguage: scala.Double
  var VaultRoles: mfilesLib.MFilesNs.MFUserAccountVaultRole
  def AddVaultRoles(VaultRolesToAdd: mfilesLib.MFilesNs.MFUserAccountVaultRole): scala.Unit
  def Clone(): IUserAccount
  def CloneFrom(UserAccount: IUserAccount): scala.Unit
  def RemoveVaultRoles(VaultRolesToRemove: mfilesLib.MFilesNs.MFUserAccountVaultRole): scala.Unit
}

object IUserAccount {
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    AddVaultRoles: js.Function1[mfilesLib.MFilesNs.MFUserAccountVaultRole, scala.Unit],
    Clone: js.Function0[IUserAccount],
    CloneFrom: js.Function1[IUserAccount, scala.Unit],
    Enabled: scala.Boolean,
    ID: scala.Double,
    InternalUser: scala.Boolean,
    LoginName: java.lang.String,
    RemoveVaultRoles: js.Function1[mfilesLib.MFilesNs.MFUserAccountVaultRole, scala.Unit],
    VaultLanguage: scala.Double,
    VaultRoles: mfilesLib.MFilesNs.MFUserAccountVaultRole
  ): IUserAccount = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList, AddVaultRoles = AddVaultRoles, Clone = Clone, CloneFrom = CloneFrom, Enabled = Enabled, ID = ID, InternalUser = InternalUser, LoginName = LoginName, RemoveVaultRoles = RemoveVaultRoles, VaultLanguage = VaultLanguage, VaultRoles = VaultRoles)
  
    __obj.asInstanceOf[IUserAccount]
  }
}

