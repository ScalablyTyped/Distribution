package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativeLayout
import typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativeLayoutCallArgument
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenReportsMod.reports.ReportPane
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/scroll-container relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer")
@js.native
class ScrollContainer protected () extends Widget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FScrollContainer: IModel = js.native
  def alignment(): AlignmentEnum = js.native
  def alignment(newValue: AlignmentEnum): js.Any = js.native
  def bottom(): ScrollContainerRegion | Null = js.native
  def bottom(newValue: ScrollContainerRegion): js.Any = js.native
  @JSName("bottom")
  def bottom_Any(): js.Any = js.native
  def center(): ScrollContainerRegion = js.native
  def center(newValue: ScrollContainerRegion): js.Any = js.native
  def layoutMode(): LayoutModeType = js.native
  def layoutMode(newValue: LayoutModeType): js.Any = js.native
  def left(): ScrollContainerRegion | Null = js.native
  def left(newValue: ScrollContainerRegion): js.Any = js.native
  @JSName("left")
  def left_Any(): js.Any = js.native
  def right(): ScrollContainerRegion | Null = js.native
  def right(newValue: ScrollContainerRegion): js.Any = js.native
  @JSName("right")
  def right_Any(): js.Any = js.native
  def scrollBehavior(): ScrollBehavior = js.native
  def scrollBehavior(newValue: ScrollBehavior): js.Any = js.native
  def top(): ScrollContainerRegion | Null = js.native
  def top(newValue: ScrollContainerRegion): js.Any = js.native
  @JSName("top")
  def top_Any(): js.Any = js.native
  def width(): Double = js.native
  def width(newValue: Double): js.Any = js.native
  def widthMode(): SizeMode = js.native
  def widthMode(newValue: SizeMode): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer")
@js.native
object ScrollContainer extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  def createInBuildingBlockUnderWidget(container: BuildingBlock): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  def createInDataViewUnderFooterWidget(container: DataView): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderFooterWidgets(container: DataView): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDataViewUnderWidget(container: DataView): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderWidgets(container: DataView): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDivContainerUnderWidget(container: DivContainer): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDivContainerUnderWidgets(container: DivContainer): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInGroupBoxUnderWidget(container: GroupBox): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInGroupBoxUnderWidgets(container: GroupBox): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderLeftWidget(container: Header): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderLeftWidgets(container: Header): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderRightWidget(container: Header): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderRightWidgets(container: Header): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutUnderWidget(container: Layout): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInLayoutUnderWidgets(container: Layout): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewUnderWidget(container: ListView): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewUnderWidgets(container: ListView): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  def createInNativeLayoutUnderWidgets(container: NativeLayout): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInNavigationListItemUnderWidget(container: NavigationListItem): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderParameterWidget(container: ReportPane): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderReportWidget(container: ReportPane): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSnippetUnderWidget(container: Snippet): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInSnippetUnderWidgets(container: Snippet): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderFirstWidget(container: SplitPane): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderSecondWidget(container: SplitPane): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTabPageUnderWidget(container: TabPage): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTabPageUnderWidgets(container: TabPage): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTableCellUnderWidget(container: TableCell): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTableCellUnderWidgets(container: TableCell): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): ScrollContainer = js.native
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  def createInWidgetValueUnderWidgets(container: WidgetValue): ScrollContainer = js.native
}

