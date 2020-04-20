package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultLoginAccountOperations extends js.Object {
  def AddLoginAccount(LoginAccount: ILoginAccount, Password: String): Unit
  def ForceLogout(AccountNames: IStrings): Unit
  def GetLoginAccount(AccountName: String): ILoginAccount
  def GetLoginAccounts(): ILoginAccounts
  def GetLoginAccountsWithSessions(): ILoginAccounts
  def GetPersonalInformationFromDomain(AccountName: String): ILoginAccountPersonalInformation
  def ModifyLoginAccount(LoginAccount: ILoginAccount): Unit
  def RemoveLoginAccount(AccountName: String): Unit
  def UpdateLoginPassword(AccountName: String, NewPassword: String): Unit
}

object IVaultLoginAccountOperations {
  @scala.inline
  def apply(
    AddLoginAccount: (ILoginAccount, String) => Unit,
    ForceLogout: IStrings => Unit,
    GetLoginAccount: String => ILoginAccount,
    GetLoginAccounts: () => ILoginAccounts,
    GetLoginAccountsWithSessions: () => ILoginAccounts,
    GetPersonalInformationFromDomain: String => ILoginAccountPersonalInformation,
    ModifyLoginAccount: ILoginAccount => Unit,
    RemoveLoginAccount: String => Unit,
    UpdateLoginPassword: (String, String) => Unit
  ): IVaultLoginAccountOperations = {
    val __obj = js.Dynamic.literal(AddLoginAccount = js.Any.fromFunction2(AddLoginAccount), ForceLogout = js.Any.fromFunction1(ForceLogout), GetLoginAccount = js.Any.fromFunction1(GetLoginAccount), GetLoginAccounts = js.Any.fromFunction0(GetLoginAccounts), GetLoginAccountsWithSessions = js.Any.fromFunction0(GetLoginAccountsWithSessions), GetPersonalInformationFromDomain = js.Any.fromFunction1(GetPersonalInformationFromDomain), ModifyLoginAccount = js.Any.fromFunction1(ModifyLoginAccount), RemoveLoginAccount = js.Any.fromFunction1(RemoveLoginAccount), UpdateLoginPassword = js.Any.fromFunction2(UpdateLoginPassword))
    __obj.asInstanceOf[IVaultLoginAccountOperations]
  }
}

