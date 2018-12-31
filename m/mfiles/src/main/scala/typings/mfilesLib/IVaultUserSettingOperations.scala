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

