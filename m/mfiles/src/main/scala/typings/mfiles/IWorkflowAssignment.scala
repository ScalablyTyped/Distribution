package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWorkflowAssignment extends js.Object {
  
  var AssignedTo_DEPRECATED: IPropertyValue = js.native
  
  def Clone_DEPRECATED(): IWorkflowAssignment = js.native
  
  var CompletedBy_DEPRECATED: IPropertyValue = js.native
  
  var Deadline_DEPRECATED: IPropertyValue = js.native
  
  var Description_DEPRECATED: IPropertyValue = js.native
  
  var MonitoredBy_DEPRECATED: IPropertyValue = js.native
}
object IWorkflowAssignment {
  
  @scala.inline
  def apply(
    AssignedTo_DEPRECATED: IPropertyValue,
    Clone_DEPRECATED: () => IWorkflowAssignment,
    CompletedBy_DEPRECATED: IPropertyValue,
    Deadline_DEPRECATED: IPropertyValue,
    Description_DEPRECATED: IPropertyValue,
    MonitoredBy_DEPRECATED: IPropertyValue
  ): IWorkflowAssignment = {
    val __obj = js.Dynamic.literal(AssignedTo_DEPRECATED = AssignedTo_DEPRECATED.asInstanceOf[js.Any], Clone_DEPRECATED = js.Any.fromFunction0(Clone_DEPRECATED), CompletedBy_DEPRECATED = CompletedBy_DEPRECATED.asInstanceOf[js.Any], Deadline_DEPRECATED = Deadline_DEPRECATED.asInstanceOf[js.Any], Description_DEPRECATED = Description_DEPRECATED.asInstanceOf[js.Any], MonitoredBy_DEPRECATED = MonitoredBy_DEPRECATED.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkflowAssignment]
  }
  
  @scala.inline
  implicit class IWorkflowAssignmentOps[Self <: IWorkflowAssignment] (val x: Self) extends AnyVal {
    
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
    def setAssignedTo_DEPRECATED(value: IPropertyValue): Self = this.set("AssignedTo_DEPRECATED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone_DEPRECATED(value: () => IWorkflowAssignment): Self = this.set("Clone_DEPRECATED", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompletedBy_DEPRECATED(value: IPropertyValue): Self = this.set("CompletedBy_DEPRECATED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeadline_DEPRECATED(value: IPropertyValue): Self = this.set("Deadline_DEPRECATED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription_DEPRECATED(value: IPropertyValue): Self = this.set("Description_DEPRECATED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoredBy_DEPRECATED(value: IPropertyValue): Self = this.set("MonitoredBy_DEPRECATED", value.asInstanceOf[js.Any])
  }
}
