package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativeLayout
import typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativeLayoutCallArgument
import typings.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenReportsMod.reports.ReportPane
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/pages relevant section in reference guide}
  */
/* note: abstract class */ @JSImport("mendixmodelsdk/src/gen/pages", "pages.Widget")
@js.native
open class Widget protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 8.0.0: introduced
    */
  def appearance: Appearance = js.native
  def appearance_=(newValue: Appearance): Unit = js.native
  
  /**
    * In version 8.0.0: deleted
    */
  def `class`: String = js.native
  def class_=(newValue: String): Unit = js.native
  
  def containerAsBuildingBlock: BuildingBlock = js.native
  
  def containerAsDataView: DataView = js.native
  
  def containerAsDivContainer: DivContainer = js.native
  
  def containerAsGroupBox: GroupBox = js.native
  
  def containerAsHeader: Header = js.native
  
  def containerAsLayout: Layout = js.native
  
  def containerAsLayoutCallArgument: LayoutCallArgument = js.native
  
  def containerAsLayoutGridColumn: LayoutGridColumn = js.native
  
  def containerAsListView: ListView = js.native
  
  def containerAsListViewTemplate: ListViewTemplate = js.native
  
  def containerAsMasterDetailRegion: MasterDetailRegion = js.native
  
  def containerAsNativeLayout: NativeLayout = js.native
  
  def containerAsNativeLayoutCallArgument: NativeLayoutCallArgument = js.native
  
  def containerAsNativeLayoutContent: NativeLayoutContent = js.native
  
  def containerAsNavigationListItem: NavigationListItem = js.native
  
  def containerAsReportPane: ReportPane = js.native
  
  def containerAsScrollContainerRegion: ScrollContainerRegion = js.native
  
  def containerAsSnippet: Snippet = js.native
  
  def containerAsSplitPane: SplitPane = js.native
  
  def containerAsTabPage: TabPage = js.native
  
  def containerAsTableCell: TableCell = js.native
  
  def containerAsTemplateGridContents: TemplateGridContents = js.native
  
  def containerAsVerticalFlow: VerticalFlow = js.native
  
  def containerAsWebLayoutContent: WebLayoutContent = js.native
  
  def containerAsWidgetValue: WidgetValue = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  
  /**
    * In version 8.0.0: deleted
    */
  def style: String = js.native
  def style_=(newValue: String): Unit = js.native
  
  def tabIndex: Double = js.native
  def tabIndex_=(newValue: Double): Unit = js.native
}
object Widget {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.Widget")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.Widget.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.Widget.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
