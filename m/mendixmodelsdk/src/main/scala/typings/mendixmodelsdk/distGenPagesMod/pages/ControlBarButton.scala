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
  def appearance(): Appearance = js.native
  def appearance(newValue: Appearance): js.Any = js.native
  def buttonStyle(): ButtonStyle = js.native
  def buttonStyle(newValue: ButtonStyle): js.Any = js.native
  def caption(): ClientTemplate = js.native
  def caption(newValue: ClientTemplate): js.Any = js.native
  /**
    * In version 8.0.0: deleted
    */
  def `class`(): String = js.native
  def `class`(newValue: String): js.Any = js.native
  def conditionalVisibilitySettings(): ConditionalVisibilitySettings | Null = js.native
  def conditionalVisibilitySettings(newValue: ConditionalVisibilitySettings): js.Any = js.native
  @JSName("conditionalVisibilitySettings")
  def conditionalVisibilitySettings_Any(): js.Any = js.native
  def icon(): Icon | Null = js.native
  def icon(newValue: Icon): js.Any = js.native
  @JSName("icon")
  def icon_Any(): js.Any = js.native
  /**
    * In version 8.0.0: deleted
    */
  def style(): String = js.native
  def style(newValue: String): js.Any = js.native
  def tooltip(): Text = js.native
  def tooltip(newValue: Text): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ControlBarButton")
@js.native
object ControlBarButton extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

