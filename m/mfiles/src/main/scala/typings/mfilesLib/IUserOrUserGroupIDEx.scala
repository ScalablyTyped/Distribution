package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserOrUserGroupIDEx extends js.Object {
  val IndirectProperty: IIndirectPropertyID
  val UserOrGroupID: scala.Double
  val UserOrGroupType: mfilesLib.MFilesNs.MFUserOrUserGroupType
  val WorkflowState: scala.Double
  def Clone(): IUserOrUserGroupIDEx
  def SetIndirectPropertyPseudoUser(PseudoUserID: IIndirectPropertyID): scala.Unit
  def SetUserAccount(UserAccount: scala.Double): scala.Unit
  def SetUserGroup(UserGroup: scala.Double): scala.Unit
  def SetWorkflowStatePseudoUser(WorkflowState: scala.Double): scala.Unit
}

object IUserOrUserGroupIDEx {
  @scala.inline
  def apply(
    Clone: () => IUserOrUserGroupIDEx,
    IndirectProperty: IIndirectPropertyID,
    SetIndirectPropertyPseudoUser: IIndirectPropertyID => scala.Unit,
    SetUserAccount: scala.Double => scala.Unit,
    SetUserGroup: scala.Double => scala.Unit,
    SetWorkflowStatePseudoUser: scala.Double => scala.Unit,
    UserOrGroupID: scala.Double,
    UserOrGroupType: mfilesLib.MFilesNs.MFUserOrUserGroupType,
    WorkflowState: scala.Double
  ): IUserOrUserGroupIDEx = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), IndirectProperty = IndirectProperty, SetIndirectPropertyPseudoUser = js.Any.fromFunction1(SetIndirectPropertyPseudoUser), SetUserAccount = js.Any.fromFunction1(SetUserAccount), SetUserGroup = js.Any.fromFunction1(SetUserGroup), SetWorkflowStatePseudoUser = js.Any.fromFunction1(SetWorkflowStatePseudoUser), UserOrGroupID = UserOrGroupID, UserOrGroupType = UserOrGroupType, WorkflowState = WorkflowState)
  
    __obj.asInstanceOf[IUserOrUserGroupIDEx]
  }
}

