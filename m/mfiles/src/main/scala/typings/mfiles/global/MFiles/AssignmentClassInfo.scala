package typings.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IApprovalAssignmentClassInfo
import typings.mfiles.IAssignmentClassInfo
import typings.mfiles.ITaskAssignmentClassInfo
import typings.mfiles.MFiles.MFAssignmentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.AssignmentClassInfo")
@js.native
class AssignmentClassInfo () extends IAssignmentClassInfo {
  /* CompleteClass */
  override var ApprovalAssignmentClassInfo: IApprovalAssignmentClassInfo = js.native
  /* CompleteClass */
  override val AssignmentType: MFAssignmentType = js.native
  /* CompleteClass */
  override var TaskAssignmentClassInfo: ITaskAssignmentClassInfo = js.native
  /* CompleteClass */
  override def Clone(): IAssignmentClassInfo = js.native
}

@JSGlobal("MFiles.AssignmentClassInfo")
@js.native
object AssignmentClassInfo extends Instantiable0[IAssignmentClassInfo]

