package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.codeactions

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCodeactionsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.21.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "codeactions.DecimalType")
@js.native
class DecimalType protected ()
  extends typings.mendixmodelsdk.distGenCodeactionsMod.codeactions.DecimalType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "codeactions.DecimalType")
@js.native
object DecimalType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DecimalType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenCodeactionsMod.codeactions.DecimalType = js.native
  /**
    * Creates and returns a new DecimalType instance in the SDK and on the server.
    * The new DecimalType will be automatically stored in the 'type' property
    * of the parent BasicParameterType element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInBasicParameterTypeUnderType(container: typings.mendixmodelsdk.distGenCodeactionsMod.codeactions.BasicParameterType): typings.mendixmodelsdk.distGenCodeactionsMod.codeactions.DecimalType = js.native
  /**
    * Creates and returns a new DecimalType instance in the SDK and on the server.
    * The new DecimalType will be automatically stored in the 'actionReturnType' property
    * of the parent CodeAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInCodeActionUnderActionReturnType(container: typings.mendixmodelsdk.distGenCodeactionsMod.codeactions.CodeAction): typings.mendixmodelsdk.distGenCodeactionsMod.codeactions.DecimalType = js.native
}

