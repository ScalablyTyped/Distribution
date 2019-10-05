package typings.mendixmodelsdk.mendixmodelsdkMod.javaactions

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.21.0: deleted
  * In version 6.6.0: introduced
  */
@JSImport("mendixmodelsdk", "javaactions.ParameterizedEntityType")
@js.native
class ParameterizedEntityType protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.javaactions.ParameterizedEntityType {
  def this(
    model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
    container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "javaactions.ParameterizedEntityType")
@js.native
object ParameterizedEntityType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenJavaactionsMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenJavaactionsMod.javaactions.ParameterizedEntityType = js.native
  /**
    * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
    * The new ParameterizedEntityType will be automatically stored in the 'type' property
    * of the parent BasicParameterType element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.20.0
    */
  def createInBasicParameterTypeUnderType(container: typings.mendixmodelsdk.distGenJavaactionsMod.javaactions.BasicParameterType): typings.mendixmodelsdk.distGenJavaactionsMod.javaactions.ParameterizedEntityType = js.native
  /**
    * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
    * The new ParameterizedEntityType will be automatically stored in the 'javaType' property
    * of the parent JavaActionParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 to 6.6.0
    */
  def createInJavaActionParameterUnderJavaType(container: typings.mendixmodelsdk.distGenJavaactionsMod.javaactions.JavaActionParameter): typings.mendixmodelsdk.distGenJavaactionsMod.javaactions.ParameterizedEntityType = js.native
  /**
    * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
    * The new ParameterizedEntityType will be automatically stored in the 'javaReturnType' property
    * of the parent JavaAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 to 7.20.0
    */
  def createInJavaActionUnderJavaReturnType(container: typings.mendixmodelsdk.distGenJavaactionsMod.javaactions.JavaAction): typings.mendixmodelsdk.distGenJavaactionsMod.javaactions.ParameterizedEntityType = js.native
  /**
    * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
    * The new ParameterizedEntityType will be automatically stored in the 'parameter' property
    * of the parent ListType element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 to 7.20.0
    */
  def createInListTypeUnderParameter(container: typings.mendixmodelsdk.distGenJavaactionsMod.javaactions.ListType): typings.mendixmodelsdk.distGenJavaactionsMod.javaactions.ParameterizedEntityType = js.native
}

