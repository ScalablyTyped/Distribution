package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWorkflowAdmin extends js.Object {
  var Description: String
  var Permissions: IAccessControlList
  var SemanticAliases: ISemanticAliases
  var StateTransitions: IStateTransitions
  var States: IStatesAdmin
  var Workflow: IWorkflow
  def Clone(): IWorkflowAdmin
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
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Description = Description, Permissions = Permissions, SemanticAliases = SemanticAliases, StateTransitions = StateTransitions, States = States, Workflow = Workflow)
  
    __obj.asInstanceOf[IWorkflowAdmin]
  }
}

