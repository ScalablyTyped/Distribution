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

