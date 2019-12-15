package typings.mendixmodelsdk.distGenMicroflowsMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.Template")
@js.native
abstract class Template protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FTemplate: IModel = js.native
  def arguments(): IList[TemplateArgument] = js.native
  def containerAsCustomRequestHandling(): CustomRequestHandling = js.native
  def containerAsHttpConfiguration(): HttpConfiguration = js.native
  def containerAsLogMessageAction(): LogMessageAction = js.native
  def containerAsShowMessageAction(): ShowMessageAction = js.native
  def containerAsStringTemplateParameterValue(): StringTemplateParameterValue = js.native
  def containerAsValidationFeedbackAction(): ValidationFeedbackAction = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.Template")
@js.native
object Template extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

