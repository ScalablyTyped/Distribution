package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages

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
  * See: {@link https://docs.mendix.com/refguide7/data-view relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.DataView")
@js.native
class DataView protected ()
  extends typings.mendixmodelsdk.distGenPagesMod.pages.DataView {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.DataView")
@js.native
object DataView extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  def createInBuildingBlockUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.BuildingBlock): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInBuildingBlockUnderWidgets(container: typings.mendixmodelsdk.distGenPagesMod.pages.BuildingBlock): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  def createInDataViewUnderFooterWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.DataView): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderFooterWidgets(container: typings.mendixmodelsdk.distGenPagesMod.pages.DataView): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDataViewUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.DataView): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderWidgets(container: typings.mendixmodelsdk.distGenPagesMod.pages.DataView): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDivContainerUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.DivContainer): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDivContainerUnderWidgets(container: typings.mendixmodelsdk.distGenPagesMod.pages.DivContainer): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInGroupBoxUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.GroupBox): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInGroupBoxUnderWidgets(container: typings.mendixmodelsdk.distGenPagesMod.pages.GroupBox): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderLeftWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.Header): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderLeftWidgets(container: typings.mendixmodelsdk.distGenPagesMod.pages.Header): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderRightWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.Header): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderRightWidgets(container: typings.mendixmodelsdk.distGenPagesMod.pages.Header): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutCallArgumentUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.LayoutCallArgument): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutCallArgumentUnderWidgets(container: typings.mendixmodelsdk.distGenPagesMod.pages.LayoutCallArgument): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutGridColumnUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.LayoutGridColumn): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutGridColumnUnderWidgets(container: typings.mendixmodelsdk.distGenPagesMod.pages.LayoutGridColumn): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.Layout): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInLayoutUnderWidgets(container: typings.mendixmodelsdk.distGenPagesMod.pages.Layout): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewTemplateUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.ListViewTemplate): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewTemplateUnderWidgets(container: typings.mendixmodelsdk.distGenPagesMod.pages.ListViewTemplate): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.ListView): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewUnderWidgets(container: typings.mendixmodelsdk.distGenPagesMod.pages.ListView): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  def createInMasterDetailRegionUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.MasterDetailRegion): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  def createInNativeLayoutContentUnderSidebarWidgets(container: typings.mendixmodelsdk.distGenPagesMod.pages.NativeLayoutContent): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInNativeLayoutContentUnderWidgets(container: typings.mendixmodelsdk.distGenPagesMod.pages.NativeLayoutContent): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  def createInNativeLayoutUnderWidgets(container: NativeLayout): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInNavigationListItemUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.NavigationListItem): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInNavigationListItemUnderWidgets(container: typings.mendixmodelsdk.distGenPagesMod.pages.NavigationListItem): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderParameterWidget(container: ReportPane): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderReportWidget(container: ReportPane): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInScrollContainerRegionUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.ScrollContainerRegion): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInScrollContainerRegionUnderWidgets(container: typings.mendixmodelsdk.distGenPagesMod.pages.ScrollContainerRegion): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSnippetUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.Snippet): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInSnippetUnderWidgets(container: typings.mendixmodelsdk.distGenPagesMod.pages.Snippet): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderFirstWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.SplitPane): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderFirstWidgets(container: typings.mendixmodelsdk.distGenPagesMod.pages.SplitPane): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderSecondWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.SplitPane): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderSecondWidgets(container: typings.mendixmodelsdk.distGenPagesMod.pages.SplitPane): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTabPageUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.TabPage): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTabPageUnderWidgets(container: typings.mendixmodelsdk.distGenPagesMod.pages.TabPage): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTableCellUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.TableCell): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTableCellUnderWidgets(container: typings.mendixmodelsdk.distGenPagesMod.pages.TableCell): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTemplateGridContentsUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.TemplateGridContents): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTemplateGridContentsUnderWidgets(container: typings.mendixmodelsdk.distGenPagesMod.pages.TemplateGridContents): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInVerticalFlowUnderWidgets(container: typings.mendixmodelsdk.distGenPagesMod.pages.VerticalFlow): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInWebLayoutContentUnderWidgets(container: typings.mendixmodelsdk.distGenPagesMod.pages.WebLayoutContent): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  def createInWidgetValueUnderWidgets(container: WidgetValue): typings.mendixmodelsdk.distGenPagesMod.pages.DataView = js.native
}

