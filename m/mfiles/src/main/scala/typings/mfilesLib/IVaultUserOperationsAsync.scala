package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultUserOperationsAsync extends js.Object {
  def AddOrUndeleteUserAccount(User: IUserAccount): scala.Unit = js.native
  def AddOrUndeleteUserAccount(User: IUserAccount, successCallback: js.Function1[/* result */ IUserAccount, scala.Unit]): scala.Unit = js.native
  def AddOrUndeleteUserAccount(
    User: IUserAccount,
    successCallback: js.Function1[/* result */ IUserAccount, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def AddOrUndeleteUserAccount(
    User: IUserAccount,
    successCallback: js.Function1[/* result */ IUserAccount, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def AddUserAccount(User: IUserAccount): scala.Unit = js.native
  def AddUserAccount(User: IUserAccount, successCallback: js.Function1[/* result */ IUserAccount, scala.Unit]): scala.Unit = js.native
  def AddUserAccount(
    User: IUserAccount,
    successCallback: js.Function1[/* result */ IUserAccount, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def AddUserAccount(
    User: IUserAccount,
    successCallback: js.Function1[/* result */ IUserAccount, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetLoginAccountOfUser(UserID: scala.Double): scala.Unit = js.native
  def GetLoginAccountOfUser(UserID: scala.Double, successCallback: js.Function1[/* result */ ILoginAccount, scala.Unit]): scala.Unit = js.native
  def GetLoginAccountOfUser(
    UserID: scala.Double,
    successCallback: js.Function1[/* result */ ILoginAccount, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetLoginAccountOfUser(
    UserID: scala.Double,
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
  def GetUserAccount(UserID: scala.Double): scala.Unit = js.native
  def GetUserAccount(UserID: scala.Double, successCallback: js.Function1[/* result */ IUserAccount, scala.Unit]): scala.Unit = js.native
  def GetUserAccount(
    UserID: scala.Double,
    successCallback: js.Function1[/* result */ IUserAccount, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetUserAccount(
    UserID: scala.Double,
    successCallback: js.Function1[/* result */ IUserAccount, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetUserAccounts(): scala.Unit = js.native
  def GetUserAccounts(successCallback: js.Function1[/* result */ IUserAccounts, scala.Unit]): scala.Unit = js.native
  def GetUserAccounts(
    successCallback: js.Function1[/* result */ IUserAccounts, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetUserAccounts(
    successCallback: js.Function1[/* result */ IUserAccounts, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetUserIDByGUID(UserGUID: java.lang.String): scala.Unit = js.native
  def GetUserIDByGUID(UserGUID: java.lang.String, successCallback: js.Function1[/* result */ scala.Double, scala.Unit]): scala.Unit = js.native
  def GetUserIDByGUID(
    UserGUID: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetUserIDByGUID(
    UserGUID: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetUserList(): scala.Unit = js.native
  def GetUserList(successCallback: js.Function1[/* result */ IKeyNamePairs, scala.Unit]): scala.Unit = js.native
  def GetUserList(
    successCallback: js.Function1[/* result */ IKeyNamePairs, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetUserList(
    successCallback: js.Function1[/* result */ IKeyNamePairs, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ModifyUserAccount(User: IUserAccount): scala.Unit = js.native
  def ModifyUserAccount(User: IUserAccount, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def ModifyUserAccount(
    User: IUserAccount,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ModifyUserAccount(
    User: IUserAccount,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def RemoveUserAccount(UserID: scala.Double): scala.Unit = js.native
  def RemoveUserAccount(UserID: scala.Double, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def RemoveUserAccount(
    UserID: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def RemoveUserAccount(
    UserID: scala.Double,
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

