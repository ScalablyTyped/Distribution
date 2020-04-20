package typings.mendixmodelsdk.codeactionsMod.codeactions

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.codeactionsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.21.0: introduced
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.codeactionsMod.codeactions.IType because Already inherited
- typings.mendixmodelsdk.codeactionsMod.codeactions.IEntityType because Already inherited
- typings.mendixmodelsdk.codeactionsMod.codeactions.IParameterizedEntityType because var conflicts: containerAsBasicParameterType, containerAsCodeAction, containerAsListType, id, isLoaded, model, structureTypeName, unit. Inlined typeParameter */ @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.ParameterizedEntityType")
@js.native
class ParameterizedEntityType protected () extends EntityType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FParameterizedEntityType: IModel = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("typeParameter")
  val typeParameter_FParameterizedEntityType: ITypeParameter = js.native
  @JSName("containerAsBasicParameterType")
  def containerAsBasicParameterType_MParameterizedEntityType: BasicParameterType = js.native
  @JSName("containerAsCodeAction")
  def containerAsCodeAction_MParameterizedEntityType: CodeAction = js.native
  @JSName("containerAsListType")
  def containerAsListType_MParameterizedEntityType: ListType = js.native
  def typeParameter: TypeParameter = js.native
  def typeParameter(newValue: TypeParameter): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.ParameterizedEntityType")
@js.native
object ParameterizedEntityType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ParameterizedEntityType = js.native
  /**
    * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
    * The new ParameterizedEntityType will be automatically stored in the 'type' property
    * of the parent BasicParameterType element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInBasicParameterTypeUnderType(container: BasicParameterType): ParameterizedEntityType = js.native
  /**
    * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
    * The new ParameterizedEntityType will be automatically stored in the 'actionReturnType' property
    * of the parent CodeAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInCodeActionUnderActionReturnType(container: CodeAction): ParameterizedEntityType = js.native
  /**
    * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
    * The new ParameterizedEntityType will be automatically stored in the 'parameter' property
    * of the parent ListType element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInListTypeUnderParameter(container: ListType): ParameterizedEntityType = js.native
}

