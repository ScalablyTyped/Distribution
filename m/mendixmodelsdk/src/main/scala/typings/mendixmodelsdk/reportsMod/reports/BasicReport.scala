package typings.mendixmodelsdk.reportsMod.reports

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout
import typings.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument
import typings.mendixmodelsdk.pagesMod.pages.BuildingBlock
import typings.mendixmodelsdk.pagesMod.pages.DataView
import typings.mendixmodelsdk.pagesMod.pages.DivContainer
import typings.mendixmodelsdk.pagesMod.pages.GroupBox
import typings.mendixmodelsdk.pagesMod.pages.Header
import typings.mendixmodelsdk.pagesMod.pages.Layout
import typings.mendixmodelsdk.pagesMod.pages.LayoutCallArgument
import typings.mendixmodelsdk.pagesMod.pages.LayoutGridColumn
import typings.mendixmodelsdk.pagesMod.pages.ListView
import typings.mendixmodelsdk.pagesMod.pages.ListViewTemplate
import typings.mendixmodelsdk.pagesMod.pages.MasterDetailRegion
import typings.mendixmodelsdk.pagesMod.pages.NativeLayoutContent
import typings.mendixmodelsdk.pagesMod.pages.NavigationListItem
import typings.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion
import typings.mendixmodelsdk.pagesMod.pages.Snippet
import typings.mendixmodelsdk.pagesMod.pages.SplitPane
import typings.mendixmodelsdk.pagesMod.pages.TabPage
import typings.mendixmodelsdk.pagesMod.pages.TableCell
import typings.mendixmodelsdk.pagesMod.pages.TemplateGridContents
import typings.mendixmodelsdk.pagesMod.pages.VerticalFlow
import typings.mendixmodelsdk.pagesMod.pages.WebLayoutContent
import typings.mendixmodelsdk.reportsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/report-grid relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport")
@js.native
class BasicReport protected () extends ReportWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FBasicReport: IModel = js.native
  def aggregates: IList[BasicReportAggregate] = js.native
  def columns: IList[BasicReportColumn] = js.native
  def isPagingEnabled: Boolean = js.native
  def isPagingEnabled(newValue: Boolean): js.Any = js.native
  def pageSize: Double = js.native
  def pageSize(newValue: Double): js.Any = js.native
  def showExportButton: Boolean = js.native
  def showExportButton(newValue: Boolean): js.Any = js.native
  def zoomInfo: ReportZoomInfo = js.native
  def zoomInfo(newValue: ReportZoomInfo): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport")
@js.native
object BasicReport extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widget' property
    * of the parent pages.BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  def createInBuildingBlockUnderWidget(container: BuildingBlock): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widgets' property
    * of the parent pages.BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'footerWidget' property
    * of the parent pages.DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  def createInDataViewUnderFooterWidget(container: DataView): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'footerWidgets' property
    * of the parent pages.DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderFooterWidgets(container: DataView): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widget' property
    * of the parent pages.DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDataViewUnderWidget(container: DataView): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widgets' property
    * of the parent pages.DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderWidgets(container: DataView): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widget' property
    * of the parent pages.DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDivContainerUnderWidget(container: DivContainer): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widgets' property
    * of the parent pages.DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDivContainerUnderWidgets(container: DivContainer): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widget' property
    * of the parent pages.GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInGroupBoxUnderWidget(container: GroupBox): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widgets' property
    * of the parent pages.GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInGroupBoxUnderWidgets(container: GroupBox): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'leftWidget' property
    * of the parent pages.Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderLeftWidget(container: Header): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'leftWidgets' property
    * of the parent pages.Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderLeftWidgets(container: Header): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'rightWidget' property
    * of the parent pages.Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderRightWidget(container: Header): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'rightWidgets' property
    * of the parent pages.Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderRightWidgets(container: Header): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widget' property
    * of the parent pages.LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widgets' property
    * of the parent pages.LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widget' property
    * of the parent pages.LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widgets' property
    * of the parent pages.LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widget' property
    * of the parent pages.Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutUnderWidget(container: Layout): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widgets' property
    * of the parent pages.Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInLayoutUnderWidgets(container: Layout): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widget' property
    * of the parent pages.ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widgets' property
    * of the parent pages.ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widget' property
    * of the parent pages.ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewUnderWidget(container: ListView): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widgets' property
    * of the parent pages.ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewUnderWidgets(container: ListView): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widget' property
    * of the parent pages.MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'sidebarWidgets' property
    * of the parent pages.NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widgets' property
    * of the parent pages.NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  def createInNativeLayoutUnderWidgets(container: NativeLayout): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widget' property
    * of the parent pages.NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInNavigationListItemUnderWidget(container: NavigationListItem): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widgets' property
    * of the parent pages.NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'parameterWidget' property
    * of the parent ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderParameterWidget(container: ReportPane): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'reportWidget' property
    * of the parent ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderReportWidget(container: ReportPane): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widget' property
    * of the parent pages.ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widgets' property
    * of the parent pages.ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widget' property
    * of the parent pages.Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSnippetUnderWidget(container: Snippet): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widgets' property
    * of the parent pages.Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInSnippetUnderWidgets(container: Snippet): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'firstWidget' property
    * of the parent pages.SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderFirstWidget(container: SplitPane): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'firstWidgets' property
    * of the parent pages.SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'secondWidget' property
    * of the parent pages.SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderSecondWidget(container: SplitPane): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'secondWidgets' property
    * of the parent pages.SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widget' property
    * of the parent pages.TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTabPageUnderWidget(container: TabPage): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widgets' property
    * of the parent pages.TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTabPageUnderWidgets(container: TabPage): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widget' property
    * of the parent pages.TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTableCellUnderWidget(container: TableCell): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widgets' property
    * of the parent pages.TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTableCellUnderWidgets(container: TableCell): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widget' property
    * of the parent pages.TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widgets' property
    * of the parent pages.TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widgets' property
    * of the parent pages.VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widgets' property
    * of the parent pages.WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): BasicReport = js.native
  /**
    * Creates and returns a new BasicReport instance in the SDK and on the server.
    * The new BasicReport will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  def createInWidgetValueUnderWidgets(container: WidgetValue): BasicReport = js.native
}

