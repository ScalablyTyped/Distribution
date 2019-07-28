package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultUserSettingOperations extends js.Object {
  def ChangeVaultLanguage(Language: Double): Unit
  def GetSubstituteUsers(): IUserOrUserGroupIDs
  def GetVaultLanguage(): Double
  def GetVaultLanguageCode(): String
  def SetSubstituteUsers(UserOrUserGroupIDs: IUserOrUserGroupIDs): Unit
}

object IVaultUserSettingOperations {
  @scala.inline
  def apply(
    ChangeVaultLanguage: Double => Unit,
    GetSubstituteUsers: () => IUserOrUserGroupIDs,
    GetVaultLanguage: () => Double,
    GetVaultLanguageCode: () => String,
    SetSubstituteUsers: IUserOrUserGroupIDs => Unit
  ): IVaultUserSettingOperations = {
    val __obj = js.Dynamic.literal(ChangeVaultLanguage = js.Any.fromFunction1(ChangeVaultLanguage), GetSubstituteUsers = js.Any.fromFunction0(GetSubstituteUsers), GetVaultLanguage = js.Any.fromFunction0(GetVaultLanguage), GetVaultLanguageCode = js.Any.fromFunction0(GetVaultLanguageCode), SetSubstituteUsers = js.Any.fromFunction1(SetSubstituteUsers))
  
    __obj.asInstanceOf[IVaultUserSettingOperations]
  }
}

