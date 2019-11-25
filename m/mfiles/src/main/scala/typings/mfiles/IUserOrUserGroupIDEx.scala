package typings.mfiles

import typings.mfiles.MFiles.MFUserOrUserGroupType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserOrUserGroupIDEx extends js.Object {
  val IndirectProperty: IIndirectPropertyID
  val UserOrGroupID: Double
  val UserOrGroupType: MFUserOrUserGroupType
  val WorkflowState: Double
  def Clone(): IUserOrUserGroupIDEx
  def SetIndirectPropertyPseudoUser(PseudoUserID: IIndirectPropertyID): Unit
  def SetUserAccount(UserAccount: Double): Unit
  def SetUserGroup(UserGroup: Double): Unit
  def SetWorkflowStatePseudoUser(WorkflowState: Double): Unit
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
}

