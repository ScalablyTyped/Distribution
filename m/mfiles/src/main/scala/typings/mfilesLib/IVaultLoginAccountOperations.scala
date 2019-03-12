package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultLoginAccountOperations extends js.Object {
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

object IVaultLoginAccountOperations {
  @scala.inline
  def apply(
    AddLoginAccount: (ILoginAccount, java.lang.String) => scala.Unit,
    ForceLogout: IStrings => scala.Unit,
    GetLoginAccount: java.lang.String => ILoginAccount,
    GetLoginAccounts: () => ILoginAccounts,
    GetLoginAccountsWithSessions: () => ILoginAccounts,
    GetPersonalInformationFromDomain: java.lang.String => ILoginAccountPersonalInformation,
    ModifyLoginAccount: ILoginAccount => scala.Unit,
    RemoveLoginAccount: java.lang.String => scala.Unit,
    UpdateLoginPassword: (java.lang.String, java.lang.String) => scala.Unit
  ): IVaultLoginAccountOperations = {
    val __obj = js.Dynamic.literal(AddLoginAccount = js.Any.fromFunction2(AddLoginAccount), ForceLogout = js.Any.fromFunction1(ForceLogout), GetLoginAccount = js.Any.fromFunction1(GetLoginAccount), GetLoginAccounts = js.Any.fromFunction0(GetLoginAccounts), GetLoginAccountsWithSessions = js.Any.fromFunction0(GetLoginAccountsWithSessions), GetPersonalInformationFromDomain = js.Any.fromFunction1(GetPersonalInformationFromDomain), ModifyLoginAccount = js.Any.fromFunction1(ModifyLoginAccount), RemoveLoginAccount = js.Any.fromFunction1(RemoveLoginAccount), UpdateLoginPassword = js.Any.fromFunction2(UpdateLoginPassword))
  
    __obj.asInstanceOf[IVaultLoginAccountOperations]
  }
}

