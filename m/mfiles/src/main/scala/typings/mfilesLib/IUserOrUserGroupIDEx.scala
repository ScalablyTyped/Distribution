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

