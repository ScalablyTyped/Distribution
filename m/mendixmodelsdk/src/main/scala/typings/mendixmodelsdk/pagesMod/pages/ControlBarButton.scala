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
  def appearance_=(newValue: Appearance): Unit = js.native
  def buttonStyle: ButtonStyle = js.native
  def buttonStyle_=(newValue: ButtonStyle): Unit = js.native
  def caption: ClientTemplate = js.native
  def caption_=(newValue: ClientTemplate): Unit = js.native
  /**
    * In version 8.0.0: deleted
    */
  def `class`: String = js.native
  def class_=(newValue: String): Unit = js.native
  def conditionalVisibilitySettings: ConditionalVisibilitySettings | Null = js.native
  def conditionalVisibilitySettings_=(newValue: ConditionalVisibilitySettings | Null): Unit = js.native
  def icon: Icon | Null = js.native
  def icon_=(newValue: Icon | Null): Unit = js.native
  /**
    * In version 8.0.0: deleted
    */
  def style: String = js.native
  def style_=(newValue: String): Unit = js.native
  def tooltip: Text = js.native
  def tooltip_=(newValue: Text): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ControlBarButton")
@js.native
object ControlBarButton extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

