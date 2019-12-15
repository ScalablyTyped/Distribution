package typings.mendixmodelsdk.distGenJavaactionsMod.javaactions

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.distGenJavaactionsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.21.0: deleted
  * In version 6.6.0: introduced
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.distGenJavaactionsMod.javaactions.IType because Already inherited
- typings.mendixmodelsdk.distGenJavaactionsMod.javaactions.IEntityType because Already inherited
- typings.mendixmodelsdk.distGenJavaactionsMod.javaactions.IConcreteEntityType because var conflicts: containerAsBasicParameterType, containerAsJavaAction, containerAsJavaActionParameter, containerAsListType, id, isLoaded, model, structureTypeName, unit. Inlined entity, entityQualifiedName */ @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.ConcreteEntityType")
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
  def containerAsBasicParameterType_MConcreteEntityType(): BasicParameterType = js.native
  @JSName("containerAsJavaActionParameter")
  def containerAsJavaActionParameter_MConcreteEntityType(): JavaActionParameter = js.native
  @JSName("containerAsJavaAction")
  def containerAsJavaAction_MConcreteEntityType(): JavaAction = js.native
  @JSName("containerAsListType")
  def containerAsListType_MConcreteEntityType(): ListType = js.native
  def entity(): IEntity = js.native
  def entity(newValue: IEntity): js.Any = js.native
  def entityQualifiedName(): String = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.ConcreteEntityType")
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
    *  6.7.0 to 7.20.0
    */
  def createInBasicParameterTypeUnderType(container: BasicParameterType): ConcreteEntityType = js.native
  /**
    * Creates and returns a new ConcreteEntityType instance in the SDK and on the server.
    * The new ConcreteEntityType will be automatically stored in the 'javaType' property
    * of the parent JavaActionParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 to 6.6.0
    */
  def createInJavaActionParameterUnderJavaType(container: JavaActionParameter): ConcreteEntityType = js.native
  /**
    * Creates and returns a new ConcreteEntityType instance in the SDK and on the server.
    * The new ConcreteEntityType will be automatically stored in the 'javaReturnType' property
    * of the parent JavaAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 to 7.20.0
    */
  def createInJavaActionUnderJavaReturnType(container: JavaAction): ConcreteEntityType = js.native
  /**
    * Creates and returns a new ConcreteEntityType instance in the SDK and on the server.
    * The new ConcreteEntityType will be automatically stored in the 'parameter' property
    * of the parent ListType element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 to 7.20.0
    */
  def createInListTypeUnderParameter(container: ListType): ConcreteEntityType = js.native
}

