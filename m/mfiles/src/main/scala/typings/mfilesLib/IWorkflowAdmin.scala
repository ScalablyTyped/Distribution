package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWorkflowAdmin extends js.Object {
  var Description: java.lang.String
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
    Clone: js.Function0[IWorkflowAdmin],
    Description: java.lang.String,
    Permissions: IAccessControlList,
    SemanticAliases: ISemanticAliases,
    StateTransitions: IStateTransitions,
    States: IStatesAdmin,
    Workflow: IWorkflow
  ): IWorkflowAdmin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("Description")(Description)
    __obj.updateDynamic("Permissions")(Permissions)
    __obj.updateDynamic("SemanticAliases")(SemanticAliases)
    __obj.updateDynamic("StateTransitions")(StateTransitions)
    __obj.updateDynamic("States")(States)
    __obj.updateDynamic("Workflow")(Workflow)
    __obj.asInstanceOf[IWorkflowAdmin]
  }
}

