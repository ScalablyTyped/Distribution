package typings.mendixmodelsdk.workflowsMod.workflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
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
- typings.mendixmodelsdk.workflowsMod.workflows.IWorkflowActivity because Already inherited
- typings.mendixmodelsdk.workflowsMod.workflows.IWorkflowTask because var conflicts: caption, containerAsWorkflow, id, isLoaded, model, structureTypeName, unit. Inlined name, possibleOutcomes */ @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.WorkflowTask")
@js.native
abstract class WorkflowTask protected ()
  extends WorkflowActivity
     with IByNameReferrable {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FWorkflowTask: IModel = js.native
  @JSName("name")
  val name_FWorkflowTask: String = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    */
  @JSName("possibleOutcomes")
  val possibleOutcomes_FWorkflowTask: IList[IWorkflowTaskOutcome] = js.native
  @JSName("containerAsWorkflow")
  def containerAsWorkflow_MWorkflowTask: Workflow = js.native
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    */
  def possibleOutcomes: IList[WorkflowTaskOutcome] = js.native
  @JSName("qualifiedName")
  def qualifiedName_MWorkflowTask: String | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.WorkflowTask")
@js.native
object WorkflowTask extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

