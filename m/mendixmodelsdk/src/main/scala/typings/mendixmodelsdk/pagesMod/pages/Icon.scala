package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.menusMod.menus.MenuItem
import typings.mendixmodelsdk.nativepagesMod.nativepages.BottomBarItem
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/image relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.Icon")
@js.native
abstract class Icon protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FIcon: IModel = js.native
  def containerAsBottomBarItem: BottomBarItem = js.native
  def containerAsButton: Button = js.native
  def containerAsControlBarButton: ControlBarButton = js.native
  def containerAsMenuItem: MenuItem = js.native
  def containerAsWidgetValue: WidgetValue = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.Icon")
@js.native
object Icon extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

