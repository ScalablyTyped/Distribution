package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.workflowsMod.workflows.UserTask
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
  def arguments: IList[TemplateArgument] = js.native
  def containerAsCustomRequestHandling: CustomRequestHandling = js.native
  def containerAsHttpConfiguration: HttpConfiguration = js.native
  def containerAsLogMessageAction: LogMessageAction = js.native
  def containerAsShowMessageAction: ShowMessageAction = js.native
  def containerAsStringTemplateParameterValue: StringTemplateParameterValue = js.native
  def containerAsUserTask: UserTask = js.native
  def containerAsValidationFeedbackAction: ValidationFeedbackAction = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.Template")
@js.native
object Template extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

