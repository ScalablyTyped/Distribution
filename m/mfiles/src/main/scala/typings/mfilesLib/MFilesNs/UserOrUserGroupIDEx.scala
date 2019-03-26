package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.UserOrUserGroupIDEx")
@js.native
class UserOrUserGroupIDEx ()
  extends mfilesLib.IUserOrUserGroupIDEx {
  /* CompleteClass */
  override val IndirectProperty: mfilesLib.IIndirectPropertyID = js.native
  /* CompleteClass */
  override val UserOrGroupID: scala.Double = js.native
  /* CompleteClass */
  override val UserOrGroupType: MFUserOrUserGroupType = js.native
  /* CompleteClass */
  override val WorkflowState: scala.Double = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IUserOrUserGroupIDEx = js.native
  /* CompleteClass */
  override def SetIndirectPropertyPseudoUser(PseudoUserID: mfilesLib.IIndirectPropertyID): scala.Unit = js.native
  /* CompleteClass */
  override def SetUserAccount(UserAccount: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def SetUserGroup(UserGroup: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def SetWorkflowStatePseudoUser(WorkflowState: scala.Double): scala.Unit = js.native
}

