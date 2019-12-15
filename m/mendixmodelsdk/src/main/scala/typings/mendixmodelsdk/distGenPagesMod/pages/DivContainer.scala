package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativeLayout
import typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativeLayoutCallArgument
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenReportsMod.reports.ReportPane
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/container relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.DivContainer")
@js.native
class DivContainer protected () extends ConditionallyVisibleWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FDivContainer: IModel = js.native
  /**
    * In version 8.3.0: introduced
    */
  def onClickAction(): ClientAction = js.native
  def onClickAction(newValue: ClientAction): js.Any = js.native
  /**
    * In version 7.23.0: introduced
    */
  def renderMode(): ContainerRenderMode = js.native
  def renderMode(newValue: ContainerRenderMode): js.Any = js.native
  /**
    * In version 7.15.0: deleted
    */
  def widget(): Widget | Null = js.native
  def widget(newValue: Widget): js.Any = js.native
  @JSName("widget")
  def widget_Any(): js.Any = js.native
  /**
    * In version 7.15.0: introduced
    */
  def widgets(): IList[Widget] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.DivContainer")
@js.native
object DivContainer extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  def createInBuildingBlockUnderWidget(container: BuildingBlock): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  def createInDataViewUnderFooterWidget(container: DataView): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderFooterWidgets(container: DataView): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDataViewUnderWidget(container: DataView): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderWidgets(container: DataView): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDivContainerUnderWidget(container: DivContainer): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDivContainerUnderWidgets(container: DivContainer): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInGroupBoxUnderWidget(container: GroupBox): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInGroupBoxUnderWidgets(container: GroupBox): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderLeftWidget(container: Header): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderLeftWidgets(container: Header): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderRightWidget(container: Header): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderRightWidgets(container: Header): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutUnderWidget(container: Layout): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInLayoutUnderWidgets(container: Layout): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewUnderWidget(container: ListView): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewUnderWidgets(container: ListView): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  def createInNativeLayoutUnderWidgets(container: NativeLayout): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInNavigationListItemUnderWidget(container: NavigationListItem): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderParameterWidget(container: ReportPane): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderReportWidget(container: ReportPane): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSnippetUnderWidget(container: Snippet): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInSnippetUnderWidgets(container: Snippet): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderFirstWidget(container: SplitPane): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderSecondWidget(container: SplitPane): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTabPageUnderWidget(container: TabPage): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTabPageUnderWidgets(container: TabPage): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTableCellUnderWidget(container: TableCell): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTableCellUnderWidgets(container: TableCell): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): DivContainer = js.native
  /**
    * Creates and returns a new DivContainer instance in the SDK and on the server.
    * The new DivContainer will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  def createInWidgetValueUnderWidgets(container: WidgetValue): DivContainer = js.native
}

