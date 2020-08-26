package typings.mfiles

import typings.mfiles.MFiles.MFUserOrUserGroupType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUserOrUserGroupIDEx extends js.Object {
  val IndirectProperty: IIndirectPropertyID = js.native
  val UserOrGroupID: Double = js.native
  val UserOrGroupType: MFUserOrUserGroupType = js.native
  val WorkflowState: Double = js.native
  def Clone(): IUserOrUserGroupIDEx = js.native
  def SetIndirectPropertyPseudoUser(PseudoUserID: IIndirectPropertyID): Unit = js.native
  def SetUserAccount(UserAccount: Double): Unit = js.native
  def SetUserGroup(UserGroup: Double): Unit = js.native
  def SetWorkflowStatePseudoUser(WorkflowState: Double): Unit = js.native
}

object IUserOrUserGroupIDEx {
  @scala.inline
  def apply(
    Clone: () => IUserOrUserGroupIDEx,
    IndirectProperty: IIndirectPropertyID,
    SetIndirectPropertyPseudoUser: IIndirectPropertyID => Unit,
    SetUserAccount: Double => Unit,
    SetUserGroup: Double => Unit,
    SetWorkflowStatePseudoUser: Double => Unit,
    UserOrGroupID: Double,
    UserOrGroupType: MFUserOrUserGroupType,
    WorkflowState: Double
  ): IUserOrUserGroupIDEx = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), IndirectProperty = IndirectProperty.asInstanceOf[js.Any], SetIndirectPropertyPseudoUser = js.Any.fromFunction1(SetIndirectPropertyPseudoUser), SetUserAccount = js.Any.fromFunction1(SetUserAccount), SetUserGroup = js.Any.fromFunction1(SetUserGroup), SetWorkflowStatePseudoUser = js.Any.fromFunction1(SetWorkflowStatePseudoUser), UserOrGroupID = UserOrGroupID.asInstanceOf[js.Any], UserOrGroupType = UserOrGroupType.asInstanceOf[js.Any], WorkflowState = WorkflowState.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUserOrUserGroupIDEx]
  }
  @scala.inline
  implicit class IUserOrUserGroupIDExOps[Self <: IUserOrUserGroupIDEx] (val x: Self) extends AnyVal {
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
    def setClone(value: () => IUserOrUserGroupIDEx): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setIndirectProperty(value: IIndirectPropertyID): Self = this.set("IndirectProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetIndirectPropertyPseudoUser(value: IIndirectPropertyID => Unit): Self = this.set("SetIndirectPropertyPseudoUser", js.Any.fromFunction1(value))
    @scala.inline
    def setSetUserAccount(value: Double => Unit): Self = this.set("SetUserAccount", js.Any.fromFunction1(value))
    @scala.inline
    def setSetUserGroup(value: Double => Unit): Self = this.set("SetUserGroup", js.Any.fromFunction1(value))
    @scala.inline
    def setSetWorkflowStatePseudoUser(value: Double => Unit): Self = this.set("SetWorkflowStatePseudoUser", js.Any.fromFunction1(value))
    @scala.inline
    def setUserOrGroupID(value: Double): Self = this.set("UserOrGroupID", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserOrGroupType(value: MFUserOrUserGroupType): Self = this.set("UserOrGroupType", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkflowState(value: Double): Self = this.set("WorkflowState", value.asInstanceOf[js.Any])
  }
  
}

