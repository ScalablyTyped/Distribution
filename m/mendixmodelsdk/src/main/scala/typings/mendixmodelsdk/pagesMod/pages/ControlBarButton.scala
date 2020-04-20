package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.textsMod.texts.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ControlBarButton")
@js.native
abstract class ControlBarButton protected () extends ControlBarItem {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FControlBarButton: IModel = js.native
  /**
    * In version 8.0.0: introduced
    */
  def appearance: Appearance = js.native
  def appearance(newValue: Appearance): js.Any = js.native
  def buttonStyle: ButtonStyle = js.native
  def buttonStyle(newValue: ButtonStyle): js.Any = js.native
  def caption: ClientTemplate = js.native
  def caption(newValue: ClientTemplate): js.Any = js.native
  /**
    * In version 8.0.0: deleted
    */
  def `class`: String = js.native
  def `class`(newValue: String): js.Any = js.native
  def conditionalVisibilitySettings(): js.Any = js.native
  def conditionalVisibilitySettings(newValue: ConditionalVisibilitySettings): js.Any = js.native
  @JSName("conditionalVisibilitySettings")
  def conditionalVisibilitySettings_Union: ConditionalVisibilitySettings | Null = js.native
  def icon(): js.Any = js.native
  def icon(newValue: Icon): js.Any = js.native
  @JSName("icon")
  def icon_Union: Icon | Null = js.native
  /**
    * In version 8.0.0: deleted
    */
  def style: String = js.native
  def style(newValue: String): js.Any = js.native
  def tooltip: Text = js.native
  def tooltip(newValue: Text): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ControlBarButton")
@js.native
object ControlBarButton extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

