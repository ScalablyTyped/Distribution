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
    AddVaultRoles: mfilesLib.MFilesNs.MFUserAccountVaultRole => scala.Unit,
    Clone: () => IUserAccount,
    CloneFrom: IUserAccount => scala.Unit,
    Enabled: scala.Boolean,
    ID: scala.Double,
    InternalUser: scala.Boolean,
    LoginName: java.lang.String,
    RemoveVaultRoles: mfilesLib.MFilesNs.MFUserAccountVaultRole => scala.Unit,
    VaultLanguage: scala.Double,
    VaultRoles: mfilesLib.MFilesNs.MFUserAccountVaultRole
  ): IUserAccount = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList, AddVaultRoles = js.Any.fromFunction1(AddVaultRoles), Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), Enabled = Enabled, ID = ID, InternalUser = InternalUser, LoginName = LoginName, RemoveVaultRoles = js.Any.fromFunction1(RemoveVaultRoles), VaultLanguage = VaultLanguage, VaultRoles = VaultRoles)
  
    __obj.asInstanceOf[IUserAccount]
  }
}

