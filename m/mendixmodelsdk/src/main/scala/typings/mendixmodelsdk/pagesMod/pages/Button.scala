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

/**
  * See: {@link https://docs.mendix.com/refguide7/button-widgets relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.Button")
@js.native
abstract class Button protected () extends ConditionallyVisibleWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FButton: IModel = js.native
  def buttonStyle(): ButtonStyle = js.native
  def buttonStyle(newValue: ButtonStyle): js.Any = js.native
  def caption(): ClientTemplate = js.native
  def caption(newValue: ClientTemplate): js.Any = js.native
  def icon(): js.Any = js.native
  def icon(newValue: Icon): js.Any = js.native
  @JSName("icon")
  def icon_Union(): Icon | Null = js.native
  def renderType(): RenderType = js.native
  def renderType(newValue: RenderType): js.Any = js.native
  def tooltip(): Text = js.native
  def tooltip(newValue: Text): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.Button")
@js.native
object Button extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

