package typings.mendixmodelsdk.workflowsMod.workflows

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.workflowsMod.StructureVersionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 8.15.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.workflowsMod.workflows.IOutcome because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsExclusiveSplitActivity, containerAsParallelSplitActivity, containerAsWorkflowTask, flow */ @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.Outcome")
@js.native
abstract class Outcome protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsExclusiveSplitActivity: ExclusiveSplitActivity = js.native
  @JSName("containerAsExclusiveSplitActivity")
  val containerAsExclusiveSplitActivity_FOutcome: IExclusiveSplitActivity = js.native
  
  def containerAsParallelSplitActivity: ParallelSplitActivity = js.native
  @JSName("containerAsParallelSplitActivity")
  val containerAsParallelSplitActivity_FOutcome: IParallelSplitActivity = js.native
  
  def containerAsWorkflowTask: WorkflowTask = js.native
  @JSName("containerAsWorkflowTask")
  val containerAsWorkflowTask_FOutcome: IWorkflowTask = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    */
  def flow: Flow = js.native
  def flow_=(newValue: Flow): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    */
  @JSName("flow")
  val flow_FOutcome: IFlow = js.native
}
object Outcome {
  
  @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.Outcome")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.Outcome.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.Outcome.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
