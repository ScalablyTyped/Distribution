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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ChangeVaultLanguage")(ChangeVaultLanguage)
    __obj.updateDynamic("GetSubstituteUsers")(GetSubstituteUsers)
    __obj.updateDynamic("GetVaultLanguage")(GetVaultLanguage)
    __obj.updateDynamic("GetVaultLanguageCode")(GetVaultLanguageCode)
    __obj.updateDynamic("SetSubstituteUsers")(SetSubstituteUsers)
    __obj.asInstanceOf[IVaultUserSettingOperations]
  }
}

