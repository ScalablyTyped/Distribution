package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 8.0.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.Appearance")
@js.native
class Appearance protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  var `class`: String = js.native
  val containerAsControlBarButton: ControlBarButton = js.native
  val containerAsGridColumn: GridColumn = js.native
  val containerAsLayout: Layout = js.native
  val containerAsLayoutGridColumn: LayoutGridColumn = js.native
  val containerAsLayoutGridRow: LayoutGridRow = js.native
  val containerAsNavigationListItem: NavigationListItem = js.native
  val containerAsPage: Page = js.native
  val containerAsPageTemplate: PageTemplate = js.native
  val containerAsScrollContainerRegion: ScrollContainerRegion = js.native
  val containerAsTableCell: TableCell = js.native
  val containerAsTableRow: TableRow = js.native
  val containerAsWidget: Widget = js.native
  val designProperties: IList[DesignPropertyValue] = js.native
  @JSName("model")
  var model_Appearance: IModel = js.native
  var style: String = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.Appearance")
@js.native
object Appearance extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent ControlBarButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInControlBarButtonUnderAppearance(container: ControlBarButton): Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent GridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInGridColumnUnderAppearance(container: GridColumn): Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInLayoutGridColumnUnderAppearance(container: LayoutGridColumn): Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent LayoutGridRow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInLayoutGridRowUnderAppearance(container: LayoutGridRow): Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInLayoutUnderAppearance(container: Layout): Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInNavigationListItemUnderAppearance(container: NavigationListItem): Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent PageTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInPageTemplateUnderAppearance(container: PageTemplate): Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent Page element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInPageUnderAppearance(container: Page): Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInScrollContainerRegionUnderAppearance(container: ScrollContainerRegion): Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInTableCellUnderAppearance(container: TableCell): Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent TableRow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInTableRowUnderAppearance(container: TableRow): Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent Widget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInWidgetUnderAppearance(container: Widget): Appearance = js.native
}

