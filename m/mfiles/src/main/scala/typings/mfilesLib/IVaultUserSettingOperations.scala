package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultUserSettingOperations extends js.Object {
  def ChangeVaultLanguage(Language: scala.Double): scala.Unit
  def GetSubstituteUsers(): IUserOrUserGroupIDs
  def GetVaultLanguage(): scala.Double
  def GetVaultLanguageCode(): java.lang.String
  def SetSubstituteUsers(UserOrUserGroupIDs: IUserOrUserGroupIDs): scala.Unit
}

object IVaultUserSettingOperations {
  @scala.inline
  def apply(
    ChangeVaultLanguage: js.Function1[scala.Double, scala.Unit],
    GetSubstituteUsers: js.Function0[IUserOrUserGroupIDs],
    GetVaultLanguage: js.Function0[scala.Double],
    GetVaultLanguageCode: js.Function0[java.lang.String],
    SetSubstituteUsers: js.Function1[IUserOrUserGroupIDs, scala.Unit]
  ): IVaultUserSettingOperations = {
    val __obj = js.Dynamic.literal(ChangeVaultLanguage = ChangeVaultLanguage, GetSubstituteUsers = GetSubstituteUsers, GetVaultLanguage = GetVaultLanguage, GetVaultLanguageCode = GetVaultLanguageCode, SetSubstituteUsers = SetSubstituteUsers)
  
    __obj.asInstanceOf[IVaultUserSettingOperations]
  }
}

