package typings.mfiles

import typings.mfiles.MFilesNs.MFUserOrUserGroupType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserOrUserGroupID extends js.Object {
  var UserOrGroupID: Double
  var UserOrGroupType: MFUserOrUserGroupType
  def Clone(): IUserOrUserGroupID
}

object IUserOrUserGroupID {
  @scala.inline
  def apply(Clone: () => IUserOrUserGroupID, UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): IUserOrUserGroupID = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), UserOrGroupID = UserOrGroupID, UserOrGroupType = UserOrGroupType)
  
    __obj.asInstanceOf[IUserOrUserGroupID]
  }
}

