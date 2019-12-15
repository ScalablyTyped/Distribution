package typings.mendixmodelsdk.distGenJavaactionsMod.javaactions

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
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
- typings.mendixmodelsdk.distGenJavaactionsMod.javaactions.IPrimitiveType because Already inherited
- typings.mendixmodelsdk.distGenJavaactionsMod.javaactions.IStringType because var conflicts: containerAsBasicParameterType, containerAsJavaAction, containerAsJavaActionParameter, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.StringType")
@js.native
class StringType protected () extends PrimitiveType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FStringType: IModel = js.native
  @JSName("containerAsBasicParameterType")
  def containerAsBasicParameterType_MStringType(): BasicParameterType = js.native
  @JSName("containerAsJavaActionParameter")
  def containerAsJavaActionParameter_MStringType(): JavaActionParameter = js.native
  @JSName("containerAsJavaAction")
  def containerAsJavaAction_MStringType(): JavaAction = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.StringType")
@js.native
object StringType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new StringType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): StringType = js.native
  /**
    * Creates and returns a new StringType instance in the SDK and on the server.
    * The new StringType will be automatically stored in the 'type' property
    * of the parent BasicParameterType element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.20.0
    */
  def createInBasicParameterTypeUnderType(container: BasicParameterType): StringType = js.native
  /**
    * Creates and returns a new StringType instance in the SDK and on the server.
    * The new StringType will be automatically stored in the 'javaType' property
    * of the parent JavaActionParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 to 6.6.0
    */
  def createInJavaActionParameterUnderJavaType(container: JavaActionParameter): StringType = js.native
  /**
    * Creates and returns a new StringType instance in the SDK and on the server.
    * The new StringType will be automatically stored in the 'javaReturnType' property
    * of the parent JavaAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 to 7.20.0
    */
  def createInJavaActionUnderJavaReturnType(container: JavaAction): StringType = js.native
}

