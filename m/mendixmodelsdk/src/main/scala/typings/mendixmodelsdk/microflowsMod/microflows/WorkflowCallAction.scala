package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.workflowsMod.workflows.IWorkflow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 8.10.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.WorkflowCallAction")
@js.native
class WorkflowCallAction protected () extends MicroflowAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FWorkflowCallAction: IModel = js.native
  def outputVariableName: String = js.native
  def outputVariableName(newValue: String): js.Any = js.native
  def useReturnVariable: Boolean = js.native
  def useReturnVariable(newValue: Boolean): js.Any = js.native
  def workflow(): js.Any = js.native
  def workflow(newValue: IWorkflow): js.Any = js.native
  def workflowContextVariable: String = js.native
  def workflowContextVariable(newValue: String): js.Any = js.native
  def workflowQualifiedName: String | Null = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    */
  @JSName("workflow")
  def workflow_Union: IWorkflow | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.WorkflowCallAction")
@js.native
object WorkflowCallAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new WorkflowCallAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): WorkflowCallAction = js.native
  /**
    * Creates and returns a new WorkflowCallAction instance in the SDK and on the server.
    * The new WorkflowCallAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.10.0 and higher
    */
  def createIn(container: ActionActivity): WorkflowCallAction = js.native
}

