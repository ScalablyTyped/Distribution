package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenTextsMod.texts.Text
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputWidget")
@js.native
abstract class InputWidget protected () extends ConditionallyEditableWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FInputWidget: IModel = js.native
  /**
    * In version 7.18.0: deleted
    */
  def label(): Text | Null = js.native
  def label(newValue: Text): js.Any = js.native
  /**
    * In version 7.18.0: introduced
    */
  def labelTemplate(): ClientTemplate | Null = js.native
  def labelTemplate(newValue: ClientTemplate): js.Any = js.native
  @JSName("labelTemplate")
  def labelTemplate_Any(): js.Any = js.native
  @JSName("label")
  def label_Any(): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputWidget")
@js.native
object InputWidget extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

