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
  @JSName("model")
  var model_FSearchField: IModel = js.native
  def caption(): Text = js.native
  def caption(newValue: Text): js.Any = js.native
  /**
    * In version 7.21.0: introduced
    */
  def customDateFormat(): String = js.native
  def customDateFormat(newValue: String): js.Any = js.native
  def defaultValue(): String = js.native
  def defaultValue(newValue: String): js.Any = js.native
  /**
    * In version 7.21.0: introduced
    */
  def placeholder(): Text = js.native
  def placeholder(newValue: Text): js.Any = js.native
  def `type`(): SearchFieldType = js.native
  def `type`(newValue: SearchFieldType): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SearchField")
@js.native
object SearchField extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

