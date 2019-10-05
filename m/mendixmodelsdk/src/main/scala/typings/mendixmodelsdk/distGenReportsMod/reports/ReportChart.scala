package typings.mendixmodelsdk.distGenReportsMod.reports

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativeLayout
import typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativeLayoutCallArgument
import typings.mendixmodelsdk.distGenPagesMod.pages.BuildingBlock
import typings.mendixmodelsdk.distGenPagesMod.pages.DataView
import typings.mendixmodelsdk.distGenPagesMod.pages.DivContainer
import typings.mendixmodelsdk.distGenPagesMod.pages.GroupBox
import typings.mendixmodelsdk.distGenPagesMod.pages.Header
import typings.mendixmodelsdk.distGenPagesMod.pages.Layout
import typings.mendixmodelsdk.distGenPagesMod.pages.LayoutCallArgument
import typings.mendixmodelsdk.distGenPagesMod.pages.LayoutGridColumn
import typings.mendixmodelsdk.distGenPagesMod.pages.ListView
import typings.mendixmodelsdk.distGenPagesMod.pages.ListViewTemplate
import typings.mendixmodelsdk.distGenPagesMod.pages.MasterDetailRegion
import typings.mendixmodelsdk.distGenPagesMod.pages.NativeLayoutContent
import typings.mendixmodelsdk.distGenPagesMod.pages.NavigationListItem
import typings.mendixmodelsdk.distGenPagesMod.pages.ScrollContainerRegion
import typings.mendixmodelsdk.distGenPagesMod.pages.Snippet
import typings.mendixmodelsdk.distGenPagesMod.pages.SplitPane
import typings.mendixmodelsdk.distGenPagesMod.pages.TabPage
import typings.mendixmodelsdk.distGenPagesMod.pages.TableCell
import typings.mendixmodelsdk.distGenPagesMod.pages.TemplateGridContents
import typings.mendixmodelsdk.distGenPagesMod.pages.VerticalFlow
import typings.mendixmodelsdk.distGenPagesMod.pages.WebLayoutContent
import typings.mendixmodelsdk.distGenReportsMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenTextsMod.texts.Text
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/report-chart relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart")
@js.native
class ReportChart protected () extends ReportWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  var aspectRatio: AspectRatio = js.native
  val seriess: IList[ReportChartSeries] = js.native
  var `type`: ChartType = js.native
  var xAxisCaption: Text = js.native
  var xAxisColumn: String = js.native
  var xAxisFormat: ColumnFormat = js.native
  var yAxisCaption: Text = js.native
  var yAxisMaximum: Double = js.native
  var yAxisMinimum: Double = js.native
  var yAxisPrecision: Double = js.native
  var yAxisUseMinMax: Boolean = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart")
@js.native
object ReportChart extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widget' property
    * of the parent pages.BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  def createInBuildingBlockUnderWidget(container: BuildingBlock): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widgets' property
    * of the parent pages.BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'footerWidget' property
    * of the parent pages.DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  def createInDataViewUnderFooterWidget(container: DataView): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'footerWidgets' property
    * of the parent pages.DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderFooterWidgets(container: DataView): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widget' property
    * of the parent pages.DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDataViewUnderWidget(container: DataView): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widgets' property
    * of the parent pages.DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderWidgets(container: DataView): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widget' property
    * of the parent pages.DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDivContainerUnderWidget(container: DivContainer): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widgets' property
    * of the parent pages.DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDivContainerUnderWidgets(container: DivContainer): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widget' property
    * of the parent pages.GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInGroupBoxUnderWidget(container: GroupBox): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widgets' property
    * of the parent pages.GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInGroupBoxUnderWidgets(container: GroupBox): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'leftWidget' property
    * of the parent pages.Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderLeftWidget(container: Header): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'leftWidgets' property
    * of the parent pages.Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderLeftWidgets(container: Header): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'rightWidget' property
    * of the parent pages.Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderRightWidget(container: Header): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'rightWidgets' property
    * of the parent pages.Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderRightWidgets(container: Header): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widget' property
    * of the parent pages.LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widgets' property
    * of the parent pages.LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widget' property
    * of the parent pages.LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widgets' property
    * of the parent pages.LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widget' property
    * of the parent pages.Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutUnderWidget(container: Layout): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widgets' property
    * of the parent pages.Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInLayoutUnderWidgets(container: Layout): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widget' property
    * of the parent pages.ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widgets' property
    * of the parent pages.ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widget' property
    * of the parent pages.ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewUnderWidget(container: ListView): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widgets' property
    * of the parent pages.ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewUnderWidgets(container: ListView): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widget' property
    * of the parent pages.MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widgets' property
    * of the parent pages.NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  def createInNativeLayoutUnderWidgets(container: NativeLayout): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widget' property
    * of the parent pages.NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInNavigationListItemUnderWidget(container: NavigationListItem): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widgets' property
    * of the parent pages.NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'parameterWidget' property
    * of the parent ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderParameterWidget(container: ReportPane): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'reportWidget' property
    * of the parent ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderReportWidget(container: ReportPane): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widget' property
    * of the parent pages.ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widgets' property
    * of the parent pages.ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widget' property
    * of the parent pages.Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSnippetUnderWidget(container: Snippet): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widgets' property
    * of the parent pages.Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInSnippetUnderWidgets(container: Snippet): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'firstWidget' property
    * of the parent pages.SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderFirstWidget(container: SplitPane): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'firstWidgets' property
    * of the parent pages.SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'secondWidget' property
    * of the parent pages.SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderSecondWidget(container: SplitPane): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'secondWidgets' property
    * of the parent pages.SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widget' property
    * of the parent pages.TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTabPageUnderWidget(container: TabPage): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widgets' property
    * of the parent pages.TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTabPageUnderWidgets(container: TabPage): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widget' property
    * of the parent pages.TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTableCellUnderWidget(container: TableCell): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widgets' property
    * of the parent pages.TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTableCellUnderWidgets(container: TableCell): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widget' property
    * of the parent pages.TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widgets' property
    * of the parent pages.TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widgets' property
    * of the parent pages.VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widgets' property
    * of the parent pages.WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): ReportChart = js.native
  /**
    * Creates and returns a new ReportChart instance in the SDK and on the server.
    * The new ReportChart will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  def createInWidgetValueUnderWidgets(container: WidgetValue): ReportChart = js.native
}

