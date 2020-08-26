package typings.mfiles

import typings.mfiles.MFiles.MFUserOrUserGroupType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUserOrUserGroupID extends js.Object {
  var UserOrGroupID: Double = js.native
  var UserOrGroupType: MFUserOrUserGroupType = js.native
  def Clone(): IUserOrUserGroupID = js.native
}

object IUserOrUserGroupID {
  @scala.inline
  def apply(Clone: () => IUserOrUserGroupID, UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): IUserOrUserGroupID = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), UserOrGroupID = UserOrGroupID.asInstanceOf[js.Any], UserOrGroupType = UserOrGroupType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUserOrUserGroupID]
  }
  @scala.inline
  implicit class IUserOrUserGroupIDOps[Self <: IUserOrUserGroupID] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClone(value: () => IUserOrUserGroupID): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setUserOrGroupID(value: Double): Self = this.set("UserOrGroupID", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserOrGroupType(value: MFUserOrUserGroupType): Self = this.set("UserOrGroupType", value.asInstanceOf[js.Any])
  }
  
}

