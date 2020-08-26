package typings.mendixmodelsdk.workflowsMod.workflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.commonMod.common.IPoint
import typings.mendixmodelsdk.commonMod.common.ISize
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
- typings.mendixmodelsdk.workflowsMod.workflows.IWorkflowActivity because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsWorkflow, caption */ @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.WorkflowActivity")
@js.native
abstract class WorkflowActivity protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  /**
    * In version 8.12.0: added public
    */
  @JSName("caption")
  val caption_FWorkflowActivity: String = js.native
  @JSName("containerAsWorkflow")
  val containerAsWorkflow_FWorkflowActivity: IWorkflow = js.native
  @JSName("model")
  var model_FWorkflowActivity: IModel = js.native
  /**
    * In version 8.12.0: added public
    */
  def caption: String = js.native
  def caption_=(newValue: String): Unit = js.native
  def containerAsWorkflow: Workflow = js.native
  def location: IPoint = js.native
  def location_=(newValue: IPoint): Unit = js.native
  def size: ISize = js.native
  def size_=(newValue: ISize): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.WorkflowActivity")
@js.native
object WorkflowActivity extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

