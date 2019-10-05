package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativeLayout
import typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativeLayoutCallArgument
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenReportsMod.reports.ReportPane
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Pages`.
  */
/**
  * See: {@link https://docs.mendix.com/refguide7/pages relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.Widget")
@js.native
abstract class Widget protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  /**
    * In version 8.0.0: introduced
    */
  var appearance: Appearance = js.native
  /**
    * In version 8.0.0: deleted
    */
  var `class`: String = js.native
  val containerAsBuildingBlock: BuildingBlock = js.native
  val containerAsDataView: DataView = js.native
  val containerAsDivContainer: DivContainer = js.native
  val containerAsGroupBox: GroupBox = js.native
  val containerAsHeader: Header = js.native
  val containerAsLayout: Layout = js.native
  val containerAsLayoutCallArgument: LayoutCallArgument = js.native
  val containerAsLayoutGridColumn: LayoutGridColumn = js.native
  val containerAsListView: ListView = js.native
  val containerAsListViewTemplate: ListViewTemplate = js.native
  val containerAsMasterDetailRegion: MasterDetailRegion = js.native
  val containerAsNativeLayout: NativeLayout = js.native
  val containerAsNativeLayoutCallArgument: NativeLayoutCallArgument = js.native
  val containerAsNativeLayoutContent: NativeLayoutContent = js.native
  val containerAsNavigationListItem: NavigationListItem = js.native
  val containerAsReportPane: ReportPane = js.native
  val containerAsScrollContainerRegion: ScrollContainerRegion = js.native
  val containerAsSnippet: Snippet = js.native
  val containerAsSplitPane: SplitPane = js.native
  val containerAsTabPage: TabPage = js.native
  val containerAsTableCell: TableCell = js.native
  val containerAsTemplateGridContents: TemplateGridContents = js.native
  val containerAsVerticalFlow: VerticalFlow = js.native
  val containerAsWebLayoutContent: WebLayoutContent = js.native
  val containerAsWidgetValue: WidgetValue = js.native
  @JSName("model")
  var model_Widget: IModel = js.native
  var name: String = js.native
  /**
    * In version 8.0.0: deleted
    */
  var style: String = js.native
  var tabIndex: Double = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.Widget")
@js.native
object Widget extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

