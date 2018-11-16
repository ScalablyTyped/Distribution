package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IVaultUserOperations extends js.Object {
  def AddOrUndeleteUserAccount(User: IUserAccount): IUserAccount
  def AddUserAccount(User: IUserAccount): IUserAccount
  def GetLoginAccountOfUser(UserID: scala.Double): ILoginAccount
  def GetLoginAccounts(): ILoginAccounts
  def GetUserAccount(UserID: scala.Double): IUserAccount
  def GetUserAccounts(): IUserAccounts
  def GetUserIDByGUID(UserGUID: java.lang.String): scala.Double
  def GetUserList(): IKeyNamePairs
  def ModifyUserAccount(User: IUserAccount): scala.Unit
  def RemoveUserAccount(UserID: scala.Double): scala.Unit
}

