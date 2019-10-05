package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.distGenMenusMod.menus.MenuItem
import typings.mendixmodelsdk.distGenNativepagesMod.nativepages.BottomBarItem
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientAction")
@js.native
abstract class ClientAction protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  val containerAsActionButton: ActionButton = js.native
  val containerAsActionItem: ActionItem = js.native
  val containerAsAssociationWidget: AssociationWidget = js.native
  val containerAsAttributeWidget: AttributeWidget = js.native
  val containerAsBottomBarItem: BottomBarItem = js.native
  val containerAsDataViewActionButton: DataViewActionButton = js.native
  val containerAsDynamicImageViewer: DynamicImageViewer = js.native
  val containerAsGridActionButton: GridActionButton = js.native
  val containerAsListView: ListView = js.native
  val containerAsMenuItem: MenuItem = js.native
  val containerAsReferenceSetSelector: ReferenceSetSelector = js.native
  val containerAsStaticImageViewer: StaticImageViewer = js.native
  val containerAsWidgetValue: WidgetValue = js.native
  @JSName("model")
  var model_ClientAction: IModel = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientAction")
@js.native
object ClientAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

