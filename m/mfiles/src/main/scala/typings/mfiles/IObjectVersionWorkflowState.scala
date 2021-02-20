package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObjectVersionWorkflowState extends StObject {
  
  var State: IPropertyValue = js.native
  
  var VersionComment: IPropertyValue = js.native
  
  var Workflow: IPropertyValue = js.native
}
object IObjectVersionWorkflowState {
  
  @scala.inline
  def apply(State: IPropertyValue, VersionComment: IPropertyValue, Workflow: IPropertyValue): IObjectVersionWorkflowState = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], VersionComment = VersionComment.asInstanceOf[js.Any], Workflow = Workflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectVersionWorkflowState]
  }
  
  @scala.inline
  implicit class IObjectVersionWorkflowStateMutableBuilder[Self <: IObjectVersionWorkflowState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: IPropertyValue): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionComment(value: IPropertyValue): Self = StObject.set(x, "VersionComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflow(value: IPropertyValue): Self = StObject.set(x, "Workflow", value.asInstanceOf[js.Any])
  }
}
