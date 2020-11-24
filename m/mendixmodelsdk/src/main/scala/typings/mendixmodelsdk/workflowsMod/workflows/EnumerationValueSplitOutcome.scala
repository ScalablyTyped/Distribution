package typings.mendixmodelsdk.workflowsMod.workflows

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.enumerationsMod.enumerations.IEnumerationValue
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.workflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
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
- typings.mendixmodelsdk.workflowsMod.workflows.IOutcome because Already inherited
- typings.mendixmodelsdk.workflowsMod.workflows.IExclusiveSplitOutcome because Already inherited
- typings.mendixmodelsdk.workflowsMod.workflows.IEnumerationValueSplitOutcome because var conflicts: containerAsExclusiveSplitActivity, id, isLoaded, model, structureTypeName, unit. Inlined value, valueQualifiedName */ @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.EnumerationValueSplitOutcome")
@js.native
class EnumerationValueSplitOutcome protected () extends ExclusiveSplitOutcome {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsExclusiveSplitActivity")
  def containerAsExclusiveSplitActivity_MEnumerationValueSplitOutcome: ExclusiveSplitActivity = js.native
  
  def value: IEnumerationValue = js.native
  
  def valueQualifiedName: String = js.native
  @JSName("valueQualifiedName")
  val valueQualifiedName_FEnumerationValueSplitOutcome: String = js.native
  
  def value_=(newValue: IEnumerationValue): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("value")
  val value_FEnumerationValueSplitOutcome: IEnumerationValue = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.EnumerationValueSplitOutcome")
@js.native
object EnumerationValueSplitOutcome extends js.Object {
  
  /**
    * Creates and returns a new EnumerationValueSplitOutcome instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): EnumerationValueSplitOutcome = js.native
  
  /**
    * Creates and returns a new EnumerationValueSplitOutcome instance in the SDK and on the server.
    * The new EnumerationValueSplitOutcome will be automatically stored in the 'outcomes' property
    * of the parent ExclusiveSplitActivity element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createIn(container: ExclusiveSplitActivity): EnumerationValueSplitOutcome = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
