package typings.mfiles

import typings.mfiles.MFiles.MFAssignmentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAssignmentClassInfo extends StObject {
  
  var ApprovalAssignmentClassInfo: IApprovalAssignmentClassInfo
  
  val AssignmentType: MFAssignmentType
  
  def Clone(): IAssignmentClassInfo
  
  var TaskAssignmentClassInfo: ITaskAssignmentClassInfo
}
object IAssignmentClassInfo {
  
  inline def apply(
    ApprovalAssignmentClassInfo: IApprovalAssignmentClassInfo,
    AssignmentType: MFAssignmentType,
    Clone: () => IAssignmentClassInfo,
    TaskAssignmentClassInfo: ITaskAssignmentClassInfo
  ): IAssignmentClassInfo = {
    val __obj = js.Dynamic.literal(ApprovalAssignmentClassInfo = ApprovalAssignmentClassInfo.asInstanceOf[js.Any], AssignmentType = AssignmentType.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), TaskAssignmentClassInfo = TaskAssignmentClassInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAssignmentClassInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAssignmentClassInfo] (val x: Self) extends AnyVal {
    
    inline def setApprovalAssignmentClassInfo(value: IApprovalAssignmentClassInfo): Self = StObject.set(x, "ApprovalAssignmentClassInfo", value.asInstanceOf[js.Any])
    
    inline def setAssignmentType(value: MFAssignmentType): Self = StObject.set(x, "AssignmentType", value.asInstanceOf[js.Any])
    
    inline def setClone(value: () => IAssignmentClassInfo): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setTaskAssignmentClassInfo(value: ITaskAssignmentClassInfo): Self = StObject.set(x, "TaskAssignmentClassInfo", value.asInstanceOf[js.Any])
  }
}
