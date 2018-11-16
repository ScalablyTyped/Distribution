package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultUserGroupOperations extends js.Object {
  def AddOrUndeleteUserGroup(UserGroup: IUserGroupAdmin): IUserGroupAdmin = js.native
  def AddUserGroupAdmin(UserGroup: IUserGroupAdmin): IUserGroupAdmin = js.native
  def GetGroupsOfUserOrGroup(UserOrGroupID: scala.Double, IsGroup: scala.Boolean): IUserGroups = js.native
  def GetUserGroup(UserGroupID: mfilesLib.MFilesNs.MFBuiltInUserGroup): IUserGroup = js.native
  def GetUserGroup(UserGroupID: scala.Double): IUserGroup = js.native
  def GetUserGroupAdmin(UserGroupID: mfilesLib.MFilesNs.MFBuiltInUserGroup): IUserGroupAdmin = js.native
  def GetUserGroupAdmin(UserGroupID: scala.Double): IUserGroupAdmin = js.native
  def GetUserGroupIDByAlias(Alias: java.lang.String): scala.Double = js.native
  def GetUserGroupIDByGUID(UserGroupGUID: java.lang.String): scala.Double = js.native
  def GetUserGroupList(): IKeyNamePairs = js.native
  def GetUserGroups(): IUserGroups = js.native
  def GetUserGroupsAdmin(): IUserGroupsAdmin = js.native
  def RemoveUserGroupAdmin(UserGroupID: mfilesLib.MFilesNs.MFBuiltInUserGroup): scala.Unit = js.native
  def RemoveUserGroupAdmin(UserGroupID: scala.Double): scala.Unit = js.native
  def UpdateUserGroupAdmin(UserGroup: IUserGroupAdmin): scala.Unit = js.native
}

