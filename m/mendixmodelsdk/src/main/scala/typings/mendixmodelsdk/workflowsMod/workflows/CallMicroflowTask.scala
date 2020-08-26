package typings.mendixmodelsdk.workflowsMod.workflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.workflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 8.11.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.workflowsMod.workflows.IWorkflowActivity because Already inherited
- typings.mendixmodelsdk.workflowsMod.workflows.IWorkflowTask because Already inherited
- typings.mendixmodelsdk.workflowsMod.workflows.ICallMicroflowTask because var conflicts: containerAsWorkflow, id, isLoaded, model, name, possibleOutcomes, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.CallMicroflowTask")
@js.native
class CallMicroflowTask protected () extends WorkflowTask {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FCallMicroflowTask: IModel = js.native
  @JSName("containerAsWorkflow")
  def containerAsWorkflow_MCallMicroflowTask: Workflow = js.native
  def microflow: IMicroflow | Null = js.native
  def microflowQualifiedName: String | Null = js.native
  def microflow_=(newValue: IMicroflow | Null): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.CallMicroflowTask")
@js.native
object CallMicroflowTask extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new CallMicroflowTask instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): CallMicroflowTask = js.native
  /**
    * Creates and returns a new CallMicroflowTask instance in the SDK and on the server.
    * The new CallMicroflowTask will be automatically stored in the 'activities' property
    * of the parent Workflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.11.0 and higher
    */
  def createIn(container: Workflow): CallMicroflowTask = js.native
}

