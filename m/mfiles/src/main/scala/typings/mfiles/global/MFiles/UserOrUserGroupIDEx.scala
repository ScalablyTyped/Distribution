package typings.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IIndirectPropertyID
import typings.mfiles.IUserOrUserGroupIDEx
import typings.mfiles.MFiles.MFUserOrUserGroupType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.UserOrUserGroupIDEx")
@js.native
class UserOrUserGroupIDEx () extends IUserOrUserGroupIDEx {
  /* CompleteClass */
  override val IndirectProperty: IIndirectPropertyID = js.native
  /* CompleteClass */
  override val UserOrGroupID: Double = js.native
  /* CompleteClass */
  override val UserOrGroupType: MFUserOrUserGroupType = js.native
  /* CompleteClass */
  override val WorkflowState: Double = js.native
  /* CompleteClass */
  override def Clone(): IUserOrUserGroupIDEx = js.native
  /* CompleteClass */
  override def SetIndirectPropertyPseudoUser(PseudoUserID: IIndirectPropertyID): Unit = js.native
  /* CompleteClass */
  override def SetUserAccount(UserAccount: Double): Unit = js.native
  /* CompleteClass */
  override def SetUserGroup(UserGroup: Double): Unit = js.native
  /* CompleteClass */
  override def SetWorkflowStatePseudoUser(WorkflowState: Double): Unit = js.native
}

@JSGlobal("MFiles.UserOrUserGroupIDEx")
@js.native
object UserOrUserGroupIDEx extends Instantiable0[IUserOrUserGroupIDEx]

