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
- typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.IBooleanConditionOutcome because var conflicts: containerAsConditionOutcomeActivity, id, isLoaded, model, structureTypeName, unit. Inlined value */ @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.BooleanConditionOutcome")
@js.native
open class BooleanConditionOutcome protected () extends ConditionOutcome {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsConditionOutcomeActivity")
  def containerAsConditionOutcomeActivity_MBooleanConditionOutcome: ConditionOutcomeActivity = js.native
  
  def value: Boolean = js.native
  def value_=(newValue: Boolean): Unit = js.native
  @JSName("value")
  val value_FBooleanConditionOutcome: Boolean = js.native
}
object BooleanConditionOutcome {
  
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.BooleanConditionOutcome")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new BooleanConditionOutcome instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): BooleanConditionOutcome = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[BooleanConditionOutcome]
  
  /**
    * Creates and returns a new BooleanConditionOutcome instance in the SDK and on the server.
    * The new BooleanConditionOutcome will be automatically stored in the 'outcomes' property
    * of the parent ConditionOutcomeActivity element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createIn(container: ConditionOutcomeActivity): BooleanConditionOutcome = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[BooleanConditionOutcome]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.BooleanConditionOutcome.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.BooleanConditionOutcome.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
