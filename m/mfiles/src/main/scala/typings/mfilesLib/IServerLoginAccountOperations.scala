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

object IServerLoginAccountOperations {
  @scala.inline
  def apply(
    AddLoginAccount: js.Function2[ILoginAccount, java.lang.String, scala.Unit],
    ForceLogout: js.Function1[IStrings, scala.Unit],
    GetLoginAccount: js.Function1[java.lang.String, ILoginAccount],
    GetLoginAccounts: js.Function0[ILoginAccounts],
    GetLoginAccountsWithSessions: js.Function0[ILoginAccounts],
    GetPersonalInformationFromDomain: js.Function1[java.lang.String, ILoginAccountPersonalInformation],
    ModifyLoginAccount: js.Function1[ILoginAccount, scala.Unit],
    RemoveLoginAccount: js.Function1[java.lang.String, scala.Unit],
    UpdateLoginPassword: js.Function2[java.lang.String, java.lang.String, scala.Unit]
  ): IServerLoginAccountOperations = {
    val __obj = js.Dynamic.literal(AddLoginAccount = AddLoginAccount, ForceLogout = ForceLogout, GetLoginAccount = GetLoginAccount, GetLoginAccounts = GetLoginAccounts, GetLoginAccountsWithSessions = GetLoginAccountsWithSessions, GetPersonalInformationFromDomain = GetPersonalInformationFromDomain, ModifyLoginAccount = ModifyLoginAccount, RemoveLoginAccount = RemoveLoginAccount, UpdateLoginPassword = UpdateLoginPassword)
  
    __obj.asInstanceOf[IServerLoginAccountOperations]
  }
}

