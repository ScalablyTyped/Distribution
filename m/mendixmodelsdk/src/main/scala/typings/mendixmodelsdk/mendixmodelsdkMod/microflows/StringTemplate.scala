package typings.mendixmodelsdk.mendixmodelsdkMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "microflows.StringTemplate")
@js.native
class StringTemplate protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.microflows.StringTemplate {
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
@JSImport("mendixmodelsdk", "microflows.StringTemplate")
@js.native
object StringTemplate extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.StringTemplate = js.native
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'template' property
    * of the parent CustomRequestHandling element passed as argument.
    */
  def createInCustomRequestHandlingUnderTemplate(container: typings.mendixmodelsdk.distGenMicroflowsMod.microflows.CustomRequestHandling): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.StringTemplate = js.native
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'customLocationTemplate' property
    * of the parent HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 and higher
    */
  def createInHttpConfigurationUnderCustomLocationTemplate(container: typings.mendixmodelsdk.distGenMicroflowsMod.microflows.HttpConfiguration): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.StringTemplate = js.native
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'messageTemplate' property
    * of the parent LogMessageAction element passed as argument.
    */
  def createInLogMessageActionUnderMessageTemplate(container: typings.mendixmodelsdk.distGenMicroflowsMod.microflows.LogMessageAction): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.StringTemplate = js.native
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'template' property
    * of the parent StringTemplateParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.4.0 and higher
    */
  def createInStringTemplateParameterValueUnderTemplate(container: typings.mendixmodelsdk.distGenMicroflowsMod.microflows.StringTemplateParameterValue): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.StringTemplate = js.native
}

