package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAssignmentClassInfo extends js.Object {
  var ApprovalAssignmentClassInfo: IApprovalAssignmentClassInfo
  val AssignmentType: mfilesLib.MFilesNs.MFAssignmentType
  var TaskAssignmentClassInfo: ITaskAssignmentClassInfo
  def Clone(): IAssignmentClassInfo
}

object IAssignmentClassInfo {
  @scala.inline
  def apply(
    ApprovalAssignmentClassInfo: IApprovalAssignmentClassInfo,
    AssignmentType: mfilesLib.MFilesNs.MFAssignmentType,
    Clone: js.Function0[IAssignmentClassInfo],
    TaskAssignmentClassInfo: ITaskAssignmentClassInfo
  ): IAssignmentClassInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ApprovalAssignmentClassInfo")(ApprovalAssignmentClassInfo)
    __obj.updateDynamic("AssignmentType")(AssignmentType)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("TaskAssignmentClassInfo")(TaskAssignmentClassInfo)
    __obj.asInstanceOf[IAssignmentClassInfo]
  }
}

