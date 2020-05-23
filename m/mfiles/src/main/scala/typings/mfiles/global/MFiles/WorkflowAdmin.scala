package typings.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IAccessControlList
import typings.mfiles.ISemanticAliases
import typings.mfiles.IStateTransitions
import typings.mfiles.IStatesAdmin
import typings.mfiles.IWorkflow
import typings.mfiles.IWorkflowAdmin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.WorkflowAdmin")
@js.native
class WorkflowAdmin () extends IWorkflowAdmin {
  /* CompleteClass */
  override var Description: String = js.native
  /* CompleteClass */
  override var Permissions: IAccessControlList = js.native
  /* CompleteClass */
  override var SemanticAliases: ISemanticAliases = js.native
  /* CompleteClass */
  override var StateTransitions: IStateTransitions = js.native
  /* CompleteClass */
  override var States: IStatesAdmin = js.native
  /* CompleteClass */
  override var Workflow: IWorkflow = js.native
  /* CompleteClass */
  override def Clone(): IWorkflowAdmin = js.native
}

@JSGlobal("MFiles.WorkflowAdmin")
@js.native
object WorkflowAdmin extends Instantiable0[IWorkflowAdmin]

