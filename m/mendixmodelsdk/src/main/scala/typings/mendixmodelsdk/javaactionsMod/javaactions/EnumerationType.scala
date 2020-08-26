package typings.mendixmodelsdk.javaactionsMod.javaactions

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.enumerationsMod.enumerations.IEnumeration
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.javaactionsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.21.0: deleted
  * In version 6.6.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.javaactionsMod.javaactions.IType because Already inherited
- typings.mendixmodelsdk.javaactionsMod.javaactions.IEnumerationType because var conflicts: containerAsBasicParameterType, containerAsJavaAction, containerAsJavaActionParameter, containerAsListType, id, isLoaded, model, structureTypeName, unit. Inlined enumeration, enumerationQualifiedName */ @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.EnumerationType")
@js.native
class EnumerationType protected () extends Type {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("enumerationQualifiedName")
  val enumerationQualifiedName_FEnumerationType: String = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("enumeration")
  val enumeration_FEnumerationType: IEnumeration = js.native
  @JSName("model")
  var model_FEnumerationType: IModel = js.native
  @JSName("containerAsBasicParameterType")
  def containerAsBasicParameterType_MEnumerationType: BasicParameterType = js.native
  @JSName("containerAsJavaActionParameter")
  def containerAsJavaActionParameter_MEnumerationType: JavaActionParameter = js.native
  @JSName("containerAsJavaAction")
  def containerAsJavaAction_MEnumerationType: JavaAction = js.native
  def enumeration: IEnumeration = js.native
  def enumerationQualifiedName: String = js.native
  def enumeration_=(newValue: IEnumeration): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.EnumerationType")
@js.native
object EnumerationType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new EnumerationType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): EnumerationType = js.native
  /**
    * Creates and returns a new EnumerationType instance in the SDK and on the server.
    * The new EnumerationType will be automatically stored in the 'type' property
    * of the parent BasicParameterType element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.20.0
    */
  def createInBasicParameterTypeUnderType(container: BasicParameterType): EnumerationType = js.native
  /**
    * Creates and returns a new EnumerationType instance in the SDK and on the server.
    * The new EnumerationType will be automatically stored in the 'javaType' property
    * of the parent JavaActionParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 to 6.6.0
    */
  def createInJavaActionParameterUnderJavaType(container: JavaActionParameter): EnumerationType = js.native
  /**
    * Creates and returns a new EnumerationType instance in the SDK and on the server.
    * The new EnumerationType will be automatically stored in the 'javaReturnType' property
    * of the parent JavaAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 to 7.20.0
    */
  def createInJavaActionUnderJavaReturnType(container: JavaAction): EnumerationType = js.native
}

