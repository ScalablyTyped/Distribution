package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenTextsMod.texts.Text
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SearchField")
@js.native
abstract class SearchField protected () extends ControlBarItem {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  var caption: Text = js.native
  /**
    * In version 7.21.0: introduced
    */
  var customDateFormat: String = js.native
  var defaultValue: String = js.native
  /**
    * In version 7.21.0: introduced
    */
  var placeholder: Text = js.native
  var `type`: SearchFieldType = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SearchField")
@js.native
object SearchField extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

