package typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCustomwidgetsMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativeLayout
import typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativeLayoutCallArgument
import typings.mendixmodelsdk.distGenPagesMod.pages.BuildingBlock
import typings.mendixmodelsdk.distGenPagesMod.pages.ClientTemplate
import typings.mendixmodelsdk.distGenPagesMod.pages.ConditionalEditabilitySettings
import typings.mendixmodelsdk.distGenPagesMod.pages.ConditionalVisibilitySettings
import typings.mendixmodelsdk.distGenPagesMod.pages.DataView
import typings.mendixmodelsdk.distGenPagesMod.pages.DivContainer
import typings.mendixmodelsdk.distGenPagesMod.pages.EditableEnum
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
import typings.mendixmodelsdk.distGenPagesMod.pages.Widget
import typings.mendixmodelsdk.distGenReportsMod.reports.ReportPane
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `CustomWidgets`.
  */
@JSImport("mendixmodelsdk/dist/gen/customwidgets", "customwidgets.CustomWidget")
@js.native
class CustomWidget protected () extends Widget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FCustomWidget: IModel = js.native
  /**
    * In version 8.1.0: introduced
    */
  def conditionalEditabilitySettings(): ConditionalEditabilitySettings | Null = js.native
  def conditionalEditabilitySettings(newValue: ConditionalEditabilitySettings): js.Any = js.native
  @JSName("conditionalEditabilitySettings")
  def conditionalEditabilitySettings_Any(): js.Any = js.native
  /**
    * In version 8.1.0: introduced
    */
  def conditionalVisibilitySettings(): ConditionalVisibilitySettings | Null = js.native
  def conditionalVisibilitySettings(newValue: ConditionalVisibilitySettings): js.Any = js.native
  @JSName("conditionalVisibilitySettings")
  def conditionalVisibilitySettings_Any(): js.Any = js.native
  /**
    * In version 8.1.0: introduced
    */
  def editable(): EditableEnum = js.native
  def editable(newValue: EditableEnum): js.Any = js.native
  /**
    * In version 8.1.0: introduced
    */
  def labelTemplate(): ClientTemplate | Null = js.native
  def labelTemplate(newValue: ClientTemplate): js.Any = js.native
  @JSName("labelTemplate")
  def labelTemplate_Any(): js.Any = js.native
  def `object`(): WidgetObject | Null = js.native
  def `object`(newValue: WidgetObject): js.Any = js.native
  @JSName("object")
  def object_Any(): js.Any = js.native
  def `type`(): CustomWidgetType | Null = js.native
  def `type`(newValue: CustomWidgetType): js.Any = js.native
  @JSName("type")
  def type_Any(): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/customwidgets", "customwidgets.CustomWidget")
@js.native
object CustomWidget extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widget' property
    * of the parent pages.BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  def createInBuildingBlockUnderWidget(container: BuildingBlock): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'footerWidget' property
    * of the parent pages.DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  def createInDataViewUnderFooterWidget(container: DataView): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'footerWidgets' property
    * of the parent pages.DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderFooterWidgets(container: DataView): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widget' property
    * of the parent pages.DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDataViewUnderWidget(container: DataView): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderWidgets(container: DataView): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widget' property
    * of the parent pages.DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDivContainerUnderWidget(container: DivContainer): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDivContainerUnderWidgets(container: DivContainer): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widget' property
    * of the parent pages.GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInGroupBoxUnderWidget(container: GroupBox): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInGroupBoxUnderWidgets(container: GroupBox): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'leftWidget' property
    * of the parent pages.Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderLeftWidget(container: Header): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'leftWidgets' property
    * of the parent pages.Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderLeftWidgets(container: Header): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'rightWidget' property
    * of the parent pages.Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderRightWidget(container: Header): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'rightWidgets' property
    * of the parent pages.Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderRightWidgets(container: Header): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widget' property
    * of the parent pages.LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widget' property
    * of the parent pages.LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widget' property
    * of the parent pages.Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutUnderWidget(container: Layout): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInLayoutUnderWidgets(container: Layout): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widget' property
    * of the parent pages.ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widget' property
    * of the parent pages.ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewUnderWidget(container: ListView): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewUnderWidgets(container: ListView): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widget' property
    * of the parent pages.MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'sidebarWidgets' property
    * of the parent pages.NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  def createInNativeLayoutUnderWidgets(container: NativeLayout): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widget' property
    * of the parent pages.NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInNavigationListItemUnderWidget(container: NavigationListItem): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderParameterWidget(container: ReportPane): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderReportWidget(container: ReportPane): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widget' property
    * of the parent pages.ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widget' property
    * of the parent pages.Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSnippetUnderWidget(container: Snippet): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInSnippetUnderWidgets(container: Snippet): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'firstWidget' property
    * of the parent pages.SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderFirstWidget(container: SplitPane): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'firstWidgets' property
    * of the parent pages.SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'secondWidget' property
    * of the parent pages.SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderSecondWidget(container: SplitPane): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'secondWidgets' property
    * of the parent pages.SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widget' property
    * of the parent pages.TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTabPageUnderWidget(container: TabPage): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTabPageUnderWidgets(container: TabPage): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widget' property
    * of the parent pages.TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTableCellUnderWidget(container: TableCell): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTableCellUnderWidgets(container: TableCell): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widget' property
    * of the parent pages.TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  def createInWidgetValueUnderWidgets(container: WidgetValue): CustomWidget = js.native
}

