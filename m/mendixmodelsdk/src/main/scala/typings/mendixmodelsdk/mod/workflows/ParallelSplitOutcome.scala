package typings.mendixmodelsdk.mod.workflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenWorkflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 9.0.5: removed experimental
  * In version 9.0.2: introduced
  */
@JSImport("mendixmodelsdk", "workflows.ParallelSplitOutcome")
@js.native
open class ParallelSplitOutcome protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.workflows.ParallelSplitOutcome {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object ParallelSplitOutcome {
  
  @JSImport("mendixmodelsdk", "workflows.ParallelSplitOutcome")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ParallelSplitOutcome instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.ParallelSplitOutcome = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.ParallelSplitOutcome]
  
  /**
    * Creates and returns a new ParallelSplitOutcome instance in the SDK and on the server.
    * The new ParallelSplitOutcome will be automatically stored in the 'outcomes' property
    * of the parent ParallelSplitActivity element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createIn(container: typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.ParallelSplitActivity): typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.ParallelSplitOutcome = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.ParallelSplitOutcome]
  
  /* static member */
  @JSImport("mendixmodelsdk", "workflows.ParallelSplitOutcome.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "workflows.ParallelSplitOutcome.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
