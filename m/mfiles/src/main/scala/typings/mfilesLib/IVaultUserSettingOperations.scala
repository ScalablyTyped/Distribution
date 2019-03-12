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
    ChangeVaultLanguage: scala.Double => scala.Unit,
    GetSubstituteUsers: () => IUserOrUserGroupIDs,
    GetVaultLanguage: () => scala.Double,
    GetVaultLanguageCode: () => java.lang.String,
    SetSubstituteUsers: IUserOrUserGroupIDs => scala.Unit
  ): IVaultUserSettingOperations = {
    val __obj = js.Dynamic.literal(ChangeVaultLanguage = js.Any.fromFunction1(ChangeVaultLanguage), GetSubstituteUsers = js.Any.fromFunction0(GetSubstituteUsers), GetVaultLanguage = js.Any.fromFunction0(GetVaultLanguage), GetVaultLanguageCode = js.Any.fromFunction0(GetVaultLanguageCode), SetSubstituteUsers = js.Any.fromFunction1(SetSubstituteUsers))
  
    __obj.asInstanceOf[IVaultUserSettingOperations]
  }
}

