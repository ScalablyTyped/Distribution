package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWorkflowAssignment extends StObject {
  
  var AssignedTo_DEPRECATED: IPropertyValue
  
  def Clone_DEPRECATED(): IWorkflowAssignment
  
  var CompletedBy_DEPRECATED: IPropertyValue
  
  var Deadline_DEPRECATED: IPropertyValue
  
  var Description_DEPRECATED: IPropertyValue
  
  var MonitoredBy_DEPRECATED: IPropertyValue
}
object IWorkflowAssignment {
  
  inline def apply(
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
  
  extension [Self <: IWorkflowAssignment](x: Self) {
    
    inline def setAssignedTo_DEPRECATED(value: IPropertyValue): Self = StObject.set(x, "AssignedTo_DEPRECATED", value.asInstanceOf[js.Any])
    
    inline def setClone_DEPRECATED(value: () => IWorkflowAssignment): Self = StObject.set(x, "Clone_DEPRECATED", js.Any.fromFunction0(value))
    
    inline def setCompletedBy_DEPRECATED(value: IPropertyValue): Self = StObject.set(x, "CompletedBy_DEPRECATED", value.asInstanceOf[js.Any])
    
    inline def setDeadline_DEPRECATED(value: IPropertyValue): Self = StObject.set(x, "Deadline_DEPRECATED", value.asInstanceOf[js.Any])
    
    inline def setDescription_DEPRECATED(value: IPropertyValue): Self = StObject.set(x, "Description_DEPRECATED", value.asInstanceOf[js.Any])
    
    inline def setMonitoredBy_DEPRECATED(value: IPropertyValue): Self = StObject.set(x, "MonitoredBy_DEPRECATED", value.asInstanceOf[js.Any])
  }
}
