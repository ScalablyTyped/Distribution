package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IServerLoginAccountOperations extends js.Object {
  def AddLoginAccount(LoginAccount: ILoginAccount, Password: java.lang.String): scala.Unit
  def ForceLogout(AccountNames: IStrings): scala.Unit
  def GetLoginAccount(AccountName: java.lang.String): ILoginAccount
  def GetLoginAccounts(): ILoginAccounts
  def GetLoginAccountsWithSessions(): ILoginAccounts
  def GetPersonalInformationFromDomain(AccountName: java.lang.String): ILoginAccountPersonalInformation
  def ModifyLoginAccount(LoginAccount: ILoginAccount): scala.Unit
  def RemoveLoginAccount(AccountName: java.lang.String): scala.Unit
  def UpdateLoginPassword(AccountName: java.lang.String, NewPassword: java.lang.String): scala.Unit
}

