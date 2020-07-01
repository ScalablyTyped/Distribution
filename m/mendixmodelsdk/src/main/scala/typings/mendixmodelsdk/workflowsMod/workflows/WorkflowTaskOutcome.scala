package typings.mendixmodelsdk.workflowsMod.workflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.workflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 8.10.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.workflowsMod.workflows.IWorkflowTaskOutcome because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsWorkflowTask, name, caption */ @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.WorkflowTaskOutcome")
@js.native
class WorkflowTaskOutcome protected ()
  extends Element
     with IByNameReferrable {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  /**
    * In version 8.11.0: introduced
    */
  @JSName("caption")
  val caption_FWorkflowTaskOutcome: String = js.native
  @JSName("containerAsWorkflowTask")
  val containerAsWorkflowTask_FWorkflowTaskOutcome: IWorkflowTask = js.native
  @JSName("model")
  var model_FWorkflowTaskOutcome: IModel = js.native
  @JSName("name")
  val name_FWorkflowTaskOutcome: String = js.native
  /**
    * Returns the qualified name of this element, or
    * null if this element is not a part of the model,
    * or if it or one of its namespace containers does not have a
    * valid name.
    */
  /* CompleteClass */
  override val qualifiedName: String | Null = js.native
  /**
    * In version 8.11.0: introduced
    */
  def caption: String = js.native
  def caption(newValue: String): js.Any = js.native
  def containerAsWorkflowTask: WorkflowTask = js.native
  def name: String = js.native
  def name(newValue: String): js.Any = js.native
  @JSName("qualifiedName")
  def qualifiedName_MWorkflowTaskOutcome: String | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.WorkflowTaskOutcome")
@js.native
object WorkflowTaskOutcome extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new WorkflowTaskOutcome instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): WorkflowTaskOutcome = js.native
  /**
    * Creates and returns a new WorkflowTaskOutcome instance in the SDK and on the server.
    * The new WorkflowTaskOutcome will be automatically stored in the 'possibleOutcomes' property
    * of the parent WorkflowTask element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.10.0 and higher
    */
  def createIn(container: WorkflowTask): WorkflowTaskOutcome = js.native
}

