package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWorkflowAdmin extends StObject {
  
  def Clone(): IWorkflowAdmin
  
  var Description: String
  
  var Permissions: IAccessControlList
  
  var SemanticAliases: ISemanticAliases
  
  var StateTransitions: IStateTransitions
  
  var States: IStatesAdmin
  
  var Workflow: IWorkflow
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
  implicit class IWorkflowAdminMutableBuilder[Self <: IWorkflowAdmin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IWorkflowAdmin): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissions(value: IAccessControlList): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemanticAliases(value: ISemanticAliases): Self = StObject.set(x, "SemanticAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateTransitions(value: IStateTransitions): Self = StObject.set(x, "StateTransitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStates(value: IStatesAdmin): Self = StObject.set(x, "States", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflow(value: IWorkflow): Self = StObject.set(x, "Workflow", value.asInstanceOf[js.Any])
  }
}
