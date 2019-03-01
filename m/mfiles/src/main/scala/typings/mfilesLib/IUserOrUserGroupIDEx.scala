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
    Clone: js.Function0[IUserOrUserGroupIDEx],
    IndirectProperty: IIndirectPropertyID,
    SetIndirectPropertyPseudoUser: js.Function1[IIndirectPropertyID, scala.Unit],
    SetUserAccount: js.Function1[scala.Double, scala.Unit],
    SetUserGroup: js.Function1[scala.Double, scala.Unit],
    SetWorkflowStatePseudoUser: js.Function1[scala.Double, scala.Unit],
    UserOrGroupID: scala.Double,
    UserOrGroupType: mfilesLib.MFilesNs.MFUserOrUserGroupType,
    WorkflowState: scala.Double
  ): IUserOrUserGroupIDEx = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("IndirectProperty")(IndirectProperty)
    __obj.updateDynamic("SetIndirectPropertyPseudoUser")(SetIndirectPropertyPseudoUser)
    __obj.updateDynamic("SetUserAccount")(SetUserAccount)
    __obj.updateDynamic("SetUserGroup")(SetUserGroup)
    __obj.updateDynamic("SetWorkflowStatePseudoUser")(SetWorkflowStatePseudoUser)
    __obj.updateDynamic("UserOrGroupID")(UserOrGroupID)
    __obj.updateDynamic("UserOrGroupType")(UserOrGroupType)
    __obj.updateDynamic("WorkflowState")(WorkflowState)
    __obj.asInstanceOf[IUserOrUserGroupIDEx]
  }
}

