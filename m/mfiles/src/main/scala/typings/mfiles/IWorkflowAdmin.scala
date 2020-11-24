package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWorkflowAdmin extends js.Object {
  
  def Clone(): IWorkflowAdmin = js.native
  
  var Description: String = js.native
  
  var Permissions: IAccessControlList = js.native
  
  var SemanticAliases: ISemanticAliases = js.native
  
  var StateTransitions: IStateTransitions = js.native
  
  var States: IStatesAdmin = js.native
  
  var Workflow: IWorkflow = js.native
}
object IWorkflowAdmin {
  
  @scala.inline
  def apply(
    Clone: () => IWorkflowAdmin,
    Description: String,
    Permissions: IAccessControlList,
    SemanticAliases: ISemanticAliases,
    StateTransitions: IStateTransitions,
    States: IStatesAdmin,
    Workflow: IWorkflow
  ): IWorkflowAdmin = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Description = Description.asInstanceOf[js.Any], Permissions = Permissions.asInstanceOf[js.Any], SemanticAliases = SemanticAliases.asInstanceOf[js.Any], StateTransitions = StateTransitions.asInstanceOf[js.Any], States = States.asInstanceOf[js.Any], Workflow = Workflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkflowAdmin]
  }
  
  @scala.inline
  implicit class IWorkflowAdminOps[Self <: IWorkflowAdmin] (val x: Self) extends AnyVal {
    
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
    def setClone(value: () => IWorkflowAdmin): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissions(value: IAccessControlList): Self = this.set("Permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemanticAliases(value: ISemanticAliases): Self = this.set("SemanticAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateTransitions(value: IStateTransitions): Self = this.set("StateTransitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStates(value: IStatesAdmin): Self = this.set("States", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflow(value: IWorkflow): Self = this.set("Workflow", value.asInstanceOf[js.Any])
  }
}
