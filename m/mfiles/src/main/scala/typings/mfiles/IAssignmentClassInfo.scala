package typings.mfiles

import typings.mfiles.MFiles.MFAssignmentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAssignmentClassInfo extends js.Object {
  
  var ApprovalAssignmentClassInfo: IApprovalAssignmentClassInfo = js.native
  
  val AssignmentType: MFAssignmentType = js.native
  
  def Clone(): IAssignmentClassInfo = js.native
  
  var TaskAssignmentClassInfo: ITaskAssignmentClassInfo = js.native
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
  
  @scala.inline
  implicit class IAssignmentClassInfoOps[Self <: IAssignmentClassInfo] (val x: Self) extends AnyVal {
    
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
    def setApprovalAssignmentClassInfo(value: IApprovalAssignmentClassInfo): Self = this.set("ApprovalAssignmentClassInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentType(value: MFAssignmentType): Self = this.set("AssignmentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IAssignmentClassInfo): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTaskAssignmentClassInfo(value: ITaskAssignmentClassInfo): Self = this.set("TaskAssignmentClassInfo", value.asInstanceOf[js.Any])
  }
}
