package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObjectVersionWorkflowState extends js.Object {
  
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
  implicit class IObjectVersionWorkflowStateOps[Self <: IObjectVersionWorkflowState] (val x: Self) extends AnyVal {
    
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
    def setState(value: IPropertyValue): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionComment(value: IPropertyValue): Self = this.set("VersionComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflow(value: IPropertyValue): Self = this.set("Workflow", value.asInstanceOf[js.Any])
  }
}
