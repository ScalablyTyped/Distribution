package typings.mfiles

import typings.mfiles.MFiles.MFAssignmentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAssignmentClassInfo extends js.Object {
  var ApprovalAssignmentClassInfo: IApprovalAssignmentClassInfo
  val AssignmentType: MFAssignmentType
  var TaskAssignmentClassInfo: ITaskAssignmentClassInfo
  def Clone(): IAssignmentClassInfo
}

object IAssignmentClassInfo {
  @scala.inline
  def apply(
    ApprovalAssignmentClassInfo: IApprovalAssignmentClassInfo,
    AssignmentType: MFAssignmentType,
    Clone: () => IAssignmentClassInfo,
    TaskAssignmentClassInfo: ITaskAssignmentClassInfo
  ): IAssignmentClassInfo = {
    val __obj = js.Dynamic.literal(ApprovalAssignmentClassInfo = ApprovalAssignmentClassInfo.asInstanceOf[js.Any], AssignmentType = AssignmentType.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), TaskAssignmentClassInfo = TaskAssignmentClassInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAssignmentClassInfo]
  }
}

