package typings.mendixmodelsdk.customwidgetsMod.customwidgets

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout
import typings.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument
import typings.mendixmodelsdk.pagesMod.pages.BuildingBlock
import typings.mendixmodelsdk.pagesMod.pages.ClientTemplate
import typings.mendixmodelsdk.pagesMod.pages.ConditionalEditabilitySettings
import typings.mendixmodelsdk.pagesMod.pages.ConditionalVisibilitySettings
import typings.mendixmodelsdk.pagesMod.pages.DataView
import typings.mendixmodelsdk.pagesMod.pages.DivContainer
import typings.mendixmodelsdk.pagesMod.pages.EditableEnum
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
import typings.mendixmodelsdk.pagesMod.pages.Widget
import typings.mendixmodelsdk.reportsMod.reports.ReportPane
import typings.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 8.1.0: introduced
    */
  def conditionalEditabilitySettings: ConditionalEditabilitySettings | Null = js.native
  def conditionalEditabilitySettings_=(newValue: ConditionalEditabilitySettings | Null): Unit = js.native
  
  /**
    * In version 8.1.0: introduced
    */
  def conditionalVisibilitySettings: ConditionalVisibilitySettings | Null = js.native
  def conditionalVisibilitySettings_=(newValue: ConditionalVisibilitySettings | Null): Unit = js.native
  
  /**
    * In version 8.1.0: introduced
    */
  def editable: EditableEnum = js.native
  def editable_=(newValue: EditableEnum): Unit = js.native
  
  /**
    * In version 8.1.0: introduced
    */
  def labelTemplate: ClientTemplate | Null = js.native
  def labelTemplate_=(newValue: ClientTemplate | Null): Unit = js.native
  
  def `object`: WidgetObject | Null = js.native
  def object_=(newValue: WidgetObject | Null): Unit = js.native
  
  def `type`: CustomWidgetType | Null = js.native
  def type_=(newValue: CustomWidgetType | Null): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/customwidgets", "customwidgets.CustomWidget")
@js.native
object CustomWidget extends js.Object {
  
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
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
