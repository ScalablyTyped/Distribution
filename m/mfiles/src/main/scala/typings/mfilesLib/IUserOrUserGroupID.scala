package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserOrUserGroupID extends js.Object {
  var UserOrGroupID: scala.Double
  var UserOrGroupType: mfilesLib.MFilesNs.MFUserOrUserGroupType
  def Clone(): IUserOrUserGroupID
}

object IUserOrUserGroupID {
  @scala.inline
  def apply(
    Clone: () => IUserOrUserGroupID,
    UserOrGroupID: scala.Double,
    UserOrGroupType: mfilesLib.MFilesNs.MFUserOrUserGroupType
  ): IUserOrUserGroupID = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), UserOrGroupID = UserOrGroupID, UserOrGroupType = UserOrGroupType)
  
    __obj.asInstanceOf[IUserOrUserGroupID]
  }
}

