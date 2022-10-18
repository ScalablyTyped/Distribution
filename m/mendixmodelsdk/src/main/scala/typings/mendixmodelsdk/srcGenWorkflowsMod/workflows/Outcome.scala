package typings.mendixmodelsdk.srcGenWorkflowsMod.workflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenWorkflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/workflows relevant section in reference guide}
  *
  * In version 9.0.5: removed experimental
  * In version 9.0.2: introduced
  */
/* note: abstract class */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.IOutcome because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsConditionOutcomeActivity, containerAsParallelSplitActivity, containerAsUserTask, flow */ @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.Outcome")
@js.native
open class Outcome protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsConditionOutcomeActivity: ConditionOutcomeActivity = js.native
  @JSName("containerAsConditionOutcomeActivity")
  val containerAsConditionOutcomeActivity_FOutcome: IConditionOutcomeActivity = js.native
  
  def containerAsParallelSplitActivity: ParallelSplitActivity = js.native
  @JSName("containerAsParallelSplitActivity")
  val containerAsParallelSplitActivity_FOutcome: IParallelSplitActivity = js.native
  
  def containerAsUserTask: UserTask = js.native
  @JSName("containerAsUserTask")
  val containerAsUserTask_FOutcome: IUserTask = js.native
  
  def flow: Flow = js.native
  def flow_=(newValue: Flow): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("flow")
  val flow_FOutcome: IFlow = js.native
}
object Outcome {
  
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.Outcome")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.Outcome.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.Outcome.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
