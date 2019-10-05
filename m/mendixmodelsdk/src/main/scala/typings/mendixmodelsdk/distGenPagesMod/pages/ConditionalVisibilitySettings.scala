package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenSecurityMod.security.IModuleRole
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConditionalVisibilitySettings")
@js.native
class ConditionalVisibilitySettings protected () extends ConditionalSettings {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  var ignoreSecurity: Boolean = js.native
  val moduleRoles: IList[IModuleRole] = js.native
  val moduleRolesQualifiedNames: js.Array[String] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConditionalVisibilitySettings")
@js.native
object ConditionalVisibilitySettings extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ConditionalVisibilitySettings = js.native
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent ConditionallyVisibleWidget element passed as argument.
    */
  def createInConditionallyVisibleWidgetUnderConditionalVisibilitySettings(container: ConditionallyVisibleWidget): ConditionalVisibilitySettings = js.native
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent ControlBarButton element passed as argument.
    */
  def createInControlBarButtonUnderConditionalVisibilitySettings(container: ControlBarButton): ConditionalVisibilitySettings = js.native
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent customwidgets.CustomWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.1.0 and higher
    */
  def createInCustomWidgetUnderConditionalVisibilitySettings(container: CustomWidget): ConditionalVisibilitySettings = js.native
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent LayoutGridRow element passed as argument.
    */
  def createInLayoutGridRowUnderConditionalVisibilitySettings(container: LayoutGridRow): ConditionalVisibilitySettings = js.native
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent NavigationListItem element passed as argument.
    */
  def createInNavigationListItemUnderConditionalVisibilitySettings(container: NavigationListItem): ConditionalVisibilitySettings = js.native
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent TabPage element passed as argument.
    */
  def createInTabPageUnderConditionalVisibilitySettings(container: TabPage): ConditionalVisibilitySettings = js.native
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent TableRow element passed as argument.
    */
  def createInTableRowUnderConditionalVisibilitySettings(container: TableRow): ConditionalVisibilitySettings = js.native
}

