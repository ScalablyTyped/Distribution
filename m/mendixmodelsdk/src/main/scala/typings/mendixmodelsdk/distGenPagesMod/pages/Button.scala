package typings.mendixmodelsdk.distGenPagesMod.pages

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
  var buttonStyle: ButtonStyle = js.native
  var caption: ClientTemplate = js.native
  var icon: Icon | Null = js.native
  var renderType: RenderType = js.native
  var tooltip: Text = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.Button")
@js.native
object Button extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

