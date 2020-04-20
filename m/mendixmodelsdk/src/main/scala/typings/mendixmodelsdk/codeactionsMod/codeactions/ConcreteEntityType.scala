package typings.mendixmodelsdk.codeactionsMod.codeactions

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.codeactionsMod.StructureVersionInfo
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
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
- typings.mendixmodelsdk.codeactionsMod.codeactions.IConcreteEntityType because var conflicts: containerAsBasicParameterType, containerAsCodeAction, containerAsListType, id, isLoaded, model, structureTypeName, unit. Inlined entity, entityQualifiedName */ @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.ConcreteEntityType")
@js.native
class ConcreteEntityType protected () extends EntityType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("entityQualifiedName")
  val entityQualifiedName_FConcreteEntityType: String = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("entity")
  val entity_FConcreteEntityType: IEntity = js.native
  @JSName("model")
  var model_FConcreteEntityType: IModel = js.native
  @JSName("containerAsBasicParameterType")
  def containerAsBasicParameterType_MConcreteEntityType: BasicParameterType = js.native
  @JSName("containerAsCodeAction")
  def containerAsCodeAction_MConcreteEntityType: CodeAction = js.native
  @JSName("containerAsListType")
  def containerAsListType_MConcreteEntityType: ListType = js.native
  def entity: IEntity = js.native
  def entity(newValue: IEntity): js.Any = js.native
  def entityQualifiedName: String = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.ConcreteEntityType")
@js.native
object ConcreteEntityType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ConcreteEntityType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ConcreteEntityType = js.native
  /**
    * Creates and returns a new ConcreteEntityType instance in the SDK and on the server.
    * The new ConcreteEntityType will be automatically stored in the 'type' property
    * of the parent BasicParameterType element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInBasicParameterTypeUnderType(container: BasicParameterType): ConcreteEntityType = js.native
  /**
    * Creates and returns a new ConcreteEntityType instance in the SDK and on the server.
    * The new ConcreteEntityType will be automatically stored in the 'actionReturnType' property
    * of the parent CodeAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInCodeActionUnderActionReturnType(container: CodeAction): ConcreteEntityType = js.native
  /**
    * Creates and returns a new ConcreteEntityType instance in the SDK and on the server.
    * The new ConcreteEntityType will be automatically stored in the 'parameter' property
    * of the parent ListType element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInListTypeUnderParameter(container: ListType): ConcreteEntityType = js.native
}

