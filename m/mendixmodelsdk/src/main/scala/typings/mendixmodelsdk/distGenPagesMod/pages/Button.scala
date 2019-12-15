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
  def icon(): Icon | Null = js.native
  def icon(newValue: Icon): js.Any = js.native
  @JSName("icon")
  def icon_Any(): js.Any = js.native
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

