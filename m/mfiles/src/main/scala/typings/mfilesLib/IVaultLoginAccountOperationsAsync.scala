package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultLoginAccountOperationsAsync extends js.Object {
  def AddLoginAccount(LoginAccount: ILoginAccount, Password: java.lang.String): scala.Unit = js.native
  def AddLoginAccount(LoginAccount: ILoginAccount, Password: java.lang.String, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def AddLoginAccount(
    LoginAccount: ILoginAccount,
    Password: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def AddLoginAccount(
    LoginAccount: ILoginAccount,
    Password: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ForceLogout(AccountNames: IStrings): scala.Unit = js.native
  def ForceLogout(AccountNames: IStrings, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def ForceLogout(
    AccountNames: IStrings,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ForceLogout(
    AccountNames: IStrings,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetLoginAccount(AccountName: java.lang.String): scala.Unit = js.native
  def GetLoginAccount(
    AccountName: java.lang.String,
    successCallback: js.Function1[/* result */ ILoginAccount, scala.Unit]
  ): scala.Unit = js.native
  def GetLoginAccount(
    AccountName: java.lang.String,
    successCallback: js.Function1[/* result */ ILoginAccount, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetLoginAccount(
    AccountName: java.lang.String,
    successCallback: js.Function1[/* result */ ILoginAccount, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetLoginAccounts(): scala.Unit = js.native
  def GetLoginAccounts(successCallback: js.Function1[/* result */ ILoginAccounts, scala.Unit]): scala.Unit = js.native
  def GetLoginAccounts(
    successCallback: js.Function1[/* result */ ILoginAccounts, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetLoginAccounts(
    successCallback: js.Function1[/* result */ ILoginAccounts, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetLoginAccountsWithSessions(): scala.Unit = js.native
  def GetLoginAccountsWithSessions(successCallback: js.Function1[/* result */ ILoginAccounts, scala.Unit]): scala.Unit = js.native
  def GetLoginAccountsWithSessions(
    successCallback: js.Function1[/* result */ ILoginAccounts, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetLoginAccountsWithSessions(
    successCallback: js.Function1[/* result */ ILoginAccounts, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetPersonalInformationFromDomain(AccountName: java.lang.String): scala.Unit = js.native
  def GetPersonalInformationFromDomain(
    AccountName: java.lang.String,
    successCallback: js.Function1[/* result */ ILoginAccountPersonalInformation, scala.Unit]
  ): scala.Unit = js.native
  def GetPersonalInformationFromDomain(
    AccountName: java.lang.String,
    successCallback: js.Function1[/* result */ ILoginAccountPersonalInformation, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetPersonalInformationFromDomain(
    AccountName: java.lang.String,
    successCallback: js.Function1[/* result */ ILoginAccountPersonalInformation, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ModifyLoginAccount(LoginAccount: ILoginAccount): scala.Unit = js.native
  def ModifyLoginAccount(LoginAccount: ILoginAccount, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def ModifyLoginAccount(
    LoginAccount: ILoginAccount,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ModifyLoginAccount(
    LoginAccount: ILoginAccount,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def RemoveLoginAccount(AccountName: java.lang.String): scala.Unit = js.native
  def RemoveLoginAccount(AccountName: java.lang.String, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def RemoveLoginAccount(
    AccountName: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def RemoveLoginAccount(
    AccountName: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UpdateLoginPassword(AccountName: java.lang.String, NewPassword: java.lang.String): scala.Unit = js.native
  def UpdateLoginPassword(
    AccountName: java.lang.String,
    NewPassword: java.lang.String,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UpdateLoginPassword(
    AccountName: java.lang.String,
    NewPassword: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def UpdateLoginPassword(
    AccountName: java.lang.String,
    NewPassword: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

