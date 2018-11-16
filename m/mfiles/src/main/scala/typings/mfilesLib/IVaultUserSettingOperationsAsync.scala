package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultUserSettingOperationsAsync extends js.Object {
  def ChangeVaultLanguage(Language: scala.Double): scala.Unit = js.native
  def ChangeVaultLanguage(Language: scala.Double, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def ChangeVaultLanguage(
    Language: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ChangeVaultLanguage(
    Language: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetSubstituteUsers(): scala.Unit = js.native
  def GetSubstituteUsers(successCallback: js.Function1[/* result */ IUserOrUserGroupIDs, scala.Unit]): scala.Unit = js.native
  def GetSubstituteUsers(
    successCallback: js.Function1[/* result */ IUserOrUserGroupIDs, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetSubstituteUsers(
    successCallback: js.Function1[/* result */ IUserOrUserGroupIDs, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetVaultLanguage(): scala.Unit = js.native
  def GetVaultLanguage(successCallback: js.Function1[/* result */ scala.Double, scala.Unit]): scala.Unit = js.native
  def GetVaultLanguage(
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetVaultLanguage(
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetVaultLanguageCode(): scala.Unit = js.native
  def GetVaultLanguageCode(successCallback: js.Function1[/* result */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def GetVaultLanguageCode(
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetVaultLanguageCode(
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SetSubstituteUsers(UserOrUserGroupIDs: IUserOrUserGroupIDs): scala.Unit = js.native
  def SetSubstituteUsers(UserOrUserGroupIDs: IUserOrUserGroupIDs, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def SetSubstituteUsers(
    UserOrUserGroupIDs: IUserOrUserGroupIDs,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SetSubstituteUsers(
    UserOrUserGroupIDs: IUserOrUserGroupIDs,
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

