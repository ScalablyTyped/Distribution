package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 8.5.0: removed experimental
  * In version 8.4.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.StringTemplateParameterValue")
@js.native
class StringTemplateParameterValue protected ()
  extends typings.mendixmodelsdk.distGenMicroflowsMod.microflows.StringTemplateParameterValue {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.StringTemplateParameterValue")
@js.native
object StringTemplateParameterValue extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new StringTemplateParameterValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.StringTemplateParameterValue = js.native
  /**
    * Creates and returns a new StringTemplateParameterValue instance in the SDK and on the server.
    * The new StringTemplateParameterValue will be automatically stored in the 'parameterValue' property
    * of the parent JavaActionParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.4.0 and higher
    */
  def createInJavaActionParameterMappingUnderParameterValue(container: typings.mendixmodelsdk.distGenMicroflowsMod.microflows.JavaActionParameterMapping): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.StringTemplateParameterValue = js.native
  /**
    * Creates and returns a new StringTemplateParameterValue instance in the SDK and on the server.
    * The new StringTemplateParameterValue will be automatically stored in the 'parameterValue' property
    * of the parent JavaScriptActionParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.4.0 and higher
    */
  def createInJavaScriptActionParameterMappingUnderParameterValue(container: typings.mendixmodelsdk.distGenMicroflowsMod.microflows.JavaScriptActionParameterMapping): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.StringTemplateParameterValue = js.native
}

