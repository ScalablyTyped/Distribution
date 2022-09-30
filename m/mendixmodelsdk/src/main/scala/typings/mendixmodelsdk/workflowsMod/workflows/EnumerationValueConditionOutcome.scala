package typings.mendixmodelsdk.workflowsMod.workflows

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.enumerationsMod.enumerations.IEnumerationValue
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.workflowsMod.StructureVersionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 9.0.5: removed experimental
  * In version 9.0.2: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.workflowsMod.workflows.IOutcome because Already inherited
- typings.mendixmodelsdk.workflowsMod.workflows.IConditionOutcome because Already inherited
- typings.mendixmodelsdk.workflowsMod.workflows.IEnumerationValueConditionOutcome because var conflicts: containerAsConditionOutcomeActivity, id, isLoaded, model, structureTypeName, unit. Inlined value, valueQualifiedName */ @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.EnumerationValueConditionOutcome")
@js.native
open class EnumerationValueConditionOutcome protected () extends ConditionOutcome {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsConditionOutcomeActivity")
  def containerAsConditionOutcomeActivity_MEnumerationValueConditionOutcome: ConditionOutcomeActivity = js.native
  
  def value: IEnumerationValue | Null = js.native
  
  def valueQualifiedName: String | Null = js.native
  @JSName("valueQualifiedName")
  val valueQualifiedName_FEnumerationValueConditionOutcome: String | Null = js.native
  
  def value_=(newValue: IEnumerationValue | Null): Unit = js.native
  @JSName("value")
  val value_FEnumerationValueConditionOutcome: IEnumerationValue | Null = js.native
}
object EnumerationValueConditionOutcome {
  
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.EnumerationValueConditionOutcome")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new EnumerationValueConditionOutcome instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): EnumerationValueConditionOutcome = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[EnumerationValueConditionOutcome]
  
  /**
    * Creates and returns a new EnumerationValueConditionOutcome instance in the SDK and on the server.
    * The new EnumerationValueConditionOutcome will be automatically stored in the 'outcomes' property
    * of the parent ConditionOutcomeActivity element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createIn(container: ConditionOutcomeActivity): EnumerationValueConditionOutcome = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[EnumerationValueConditionOutcome]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.EnumerationValueConditionOutcome.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.EnumerationValueConditionOutcome.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
