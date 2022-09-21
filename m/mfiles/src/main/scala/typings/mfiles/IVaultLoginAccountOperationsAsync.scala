package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultLoginAccountOperationsAsync extends StObject {
  
  def AddLoginAccount(LoginAccount: ILoginAccount, Password: String): Unit = js.native
  def AddLoginAccount(LoginAccount: ILoginAccount, Password: String, successCallback: js.Function0[Unit]): Unit = js.native
  def AddLoginAccount(
    LoginAccount: ILoginAccount,
    Password: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def AddLoginAccount(
    LoginAccount: ILoginAccount,
    Password: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddLoginAccount(
    LoginAccount: ILoginAccount,
    Password: String,
    successCallback: js.Function0[Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddLoginAccount(
    LoginAccount: ILoginAccount,
    Password: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def AddLoginAccount(
    LoginAccount: ILoginAccount,
    Password: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddLoginAccount(
    LoginAccount: ILoginAccount,
    Password: String,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def ForceLogout(AccountNames: IStrings): Unit = js.native
  def ForceLogout(AccountNames: IStrings, successCallback: js.Function0[Unit]): Unit = js.native
  def ForceLogout(
    AccountNames: IStrings,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def ForceLogout(
    AccountNames: IStrings,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ForceLogout(
    AccountNames: IStrings,
    successCallback: js.Function0[Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ForceLogout(
    AccountNames: IStrings,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def ForceLogout(
    AccountNames: IStrings,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ForceLogout(
    AccountNames: IStrings,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetLoginAccount(AccountName: String): Unit = js.native
  def GetLoginAccount(AccountName: String, successCallback: js.Function1[/* result */ ILoginAccount, Unit]): Unit = js.native
  def GetLoginAccount(
    AccountName: String,
    successCallback: js.Function1[/* result */ ILoginAccount, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def GetLoginAccount(
    AccountName: String,
    successCallback: js.Function1[/* result */ ILoginAccount, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetLoginAccount(
    AccountName: String,
    successCallback: js.Function1[/* result */ ILoginAccount, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetLoginAccount(
    AccountName: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def GetLoginAccount(
    AccountName: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetLoginAccount(
    AccountName: String,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetLoginAccounts(): Unit = js.native
  def GetLoginAccounts(successCallback: js.Function1[/* result */ ILoginAccounts, Unit]): Unit = js.native
  def GetLoginAccounts(
    successCallback: js.Function1[/* result */ ILoginAccounts, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def GetLoginAccounts(
    successCallback: js.Function1[/* result */ ILoginAccounts, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetLoginAccounts(
    successCallback: js.Function1[/* result */ ILoginAccounts, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetLoginAccounts(
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def GetLoginAccounts(
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetLoginAccounts(successCallback: Unit, errorCallback: Unit, finallyCallback: js.Function0[Unit]): Unit = js.native
  
  def GetLoginAccountsWithSessions(): Unit = js.native
  def GetLoginAccountsWithSessions(successCallback: js.Function1[/* result */ ILoginAccounts, Unit]): Unit = js.native
  def GetLoginAccountsWithSessions(
    successCallback: js.Function1[/* result */ ILoginAccounts, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def GetLoginAccountsWithSessions(
    successCallback: js.Function1[/* result */ ILoginAccounts, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetLoginAccountsWithSessions(
    successCallback: js.Function1[/* result */ ILoginAccounts, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetLoginAccountsWithSessions(
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def GetLoginAccountsWithSessions(
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetLoginAccountsWithSessions(successCallback: Unit, errorCallback: Unit, finallyCallback: js.Function0[Unit]): Unit = js.native
  
  def GetPersonalInformationFromDomain(AccountName: String): Unit = js.native
  def GetPersonalInformationFromDomain(
    AccountName: String,
    successCallback: js.Function1[/* result */ ILoginAccountPersonalInformation, Unit]
  ): Unit = js.native
  def GetPersonalInformationFromDomain(
    AccountName: String,
    successCallback: js.Function1[/* result */ ILoginAccountPersonalInformation, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def GetPersonalInformationFromDomain(
    AccountName: String,
    successCallback: js.Function1[/* result */ ILoginAccountPersonalInformation, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetPersonalInformationFromDomain(
    AccountName: String,
    successCallback: js.Function1[/* result */ ILoginAccountPersonalInformation, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetPersonalInformationFromDomain(
    AccountName: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def GetPersonalInformationFromDomain(
    AccountName: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetPersonalInformationFromDomain(
    AccountName: String,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def ModifyLoginAccount(LoginAccount: ILoginAccount): Unit = js.native
  def ModifyLoginAccount(LoginAccount: ILoginAccount, successCallback: js.Function0[Unit]): Unit = js.native
  def ModifyLoginAccount(
    LoginAccount: ILoginAccount,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def ModifyLoginAccount(
    LoginAccount: ILoginAccount,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ModifyLoginAccount(
    LoginAccount: ILoginAccount,
    successCallback: js.Function0[Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ModifyLoginAccount(
    LoginAccount: ILoginAccount,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def ModifyLoginAccount(
    LoginAccount: ILoginAccount,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ModifyLoginAccount(
    LoginAccount: ILoginAccount,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def RemoveLoginAccount(AccountName: String): Unit = js.native
  def RemoveLoginAccount(AccountName: String, successCallback: js.Function0[Unit]): Unit = js.native
  def RemoveLoginAccount(
    AccountName: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def RemoveLoginAccount(
    AccountName: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveLoginAccount(
    AccountName: String,
    successCallback: js.Function0[Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveLoginAccount(
    AccountName: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def RemoveLoginAccount(
    AccountName: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveLoginAccount(
    AccountName: String,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def UpdateLoginPassword(AccountName: String, NewPassword: String): Unit = js.native
  def UpdateLoginPassword(AccountName: String, NewPassword: String, successCallback: js.Function0[Unit]): Unit = js.native
  def UpdateLoginPassword(
    AccountName: String,
    NewPassword: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def UpdateLoginPassword(
    AccountName: String,
    NewPassword: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UpdateLoginPassword(
    AccountName: String,
    NewPassword: String,
    successCallback: js.Function0[Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UpdateLoginPassword(
    AccountName: String,
    NewPassword: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def UpdateLoginPassword(
    AccountName: String,
    NewPassword: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UpdateLoginPassword(
    AccountName: String,
    NewPassword: String,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
}
