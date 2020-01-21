package typings.mendixmodelsdk.mod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "pages.ConditionalVisibilitySettings")
@js.native
class ConditionalVisibilitySettings protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.pages.ConditionalVisibilitySettings {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "pages.ConditionalVisibilitySettings")
@js.native
object ConditionalVisibilitySettings extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.pagesMod.pages.ConditionalVisibilitySettings = js.native
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent ConditionallyVisibleWidget element passed as argument.
    */
  def createInConditionallyVisibleWidgetUnderConditionalVisibilitySettings(container: typings.mendixmodelsdk.pagesMod.pages.ConditionallyVisibleWidget): typings.mendixmodelsdk.pagesMod.pages.ConditionalVisibilitySettings = js.native
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent ControlBarButton element passed as argument.
    */
  def createInControlBarButtonUnderConditionalVisibilitySettings(container: typings.mendixmodelsdk.pagesMod.pages.ControlBarButton): typings.mendixmodelsdk.pagesMod.pages.ConditionalVisibilitySettings = js.native
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent customwidgets.CustomWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.1.0 and higher
    */
  def createInCustomWidgetUnderConditionalVisibilitySettings(container: CustomWidget): typings.mendixmodelsdk.pagesMod.pages.ConditionalVisibilitySettings = js.native
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent LayoutGridRow element passed as argument.
    */
  def createInLayoutGridRowUnderConditionalVisibilitySettings(container: typings.mendixmodelsdk.pagesMod.pages.LayoutGridRow): typings.mendixmodelsdk.pagesMod.pages.ConditionalVisibilitySettings = js.native
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent NavigationListItem element passed as argument.
    */
  def createInNavigationListItemUnderConditionalVisibilitySettings(container: typings.mendixmodelsdk.pagesMod.pages.NavigationListItem): typings.mendixmodelsdk.pagesMod.pages.ConditionalVisibilitySettings = js.native
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent TabPage element passed as argument.
    */
  def createInTabPageUnderConditionalVisibilitySettings(container: typings.mendixmodelsdk.pagesMod.pages.TabPage): typings.mendixmodelsdk.pagesMod.pages.ConditionalVisibilitySettings = js.native
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent TableRow element passed as argument.
    */
  def createInTableRowUnderConditionalVisibilitySettings(container: typings.mendixmodelsdk.pagesMod.pages.TableRow): typings.mendixmodelsdk.pagesMod.pages.ConditionalVisibilitySettings = js.native
}

