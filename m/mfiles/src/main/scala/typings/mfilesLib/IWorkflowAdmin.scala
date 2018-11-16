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

