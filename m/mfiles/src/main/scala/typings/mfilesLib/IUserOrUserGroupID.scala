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
    Clone: js.Function0[IUserOrUserGroupID],
    UserOrGroupID: scala.Double,
    UserOrGroupType: mfilesLib.MFilesNs.MFUserOrUserGroupType
  ): IUserOrUserGroupID = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("UserOrGroupID")(UserOrGroupID)
    __obj.updateDynamic("UserOrGroupType")(UserOrGroupType)
    __obj.asInstanceOf[IUserOrUserGroupID]
  }
}

