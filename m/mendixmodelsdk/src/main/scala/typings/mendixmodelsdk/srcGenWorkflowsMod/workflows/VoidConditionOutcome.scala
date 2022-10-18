package typings.mendixmodelsdk.srcGenWorkflowsMod.workflows

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
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.IOutcome because Already inherited
- typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.IConditionOutcome because Already inherited
- typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.IVoidConditionOutcome because var conflicts: containerAsConditionOutcomeActivity, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.VoidConditionOutcome")
@js.native
open class VoidConditionOutcome protected () extends ConditionOutcome {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsConditionOutcomeActivity")
  def containerAsConditionOutcomeActivity_MVoidConditionOutcome: ConditionOutcomeActivity = js.native
}
object VoidConditionOutcome {
  
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.VoidConditionOutcome")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new VoidConditionOutcome instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): VoidConditionOutcome = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[VoidConditionOutcome]
  
  /**
    * Creates and returns a new VoidConditionOutcome instance in the SDK and on the server.
    * The new VoidConditionOutcome will be automatically stored in the 'outcomes' property
    * of the parent ConditionOutcomeActivity element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createIn(container: ConditionOutcomeActivity): VoidConditionOutcome = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[VoidConditionOutcome]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.VoidConditionOutcome.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.VoidConditionOutcome.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
