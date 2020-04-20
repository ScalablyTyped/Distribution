package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout
import typings.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.reportsMod.reports.ReportPane
import typings.mendixmodelsdk.textsMod.texts.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/reference-selector relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector")
@js.native
class ReferenceSelector protected () extends AssociationWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FReferenceSelector: IModel = js.native
  /**
    * In version 7.2.0: introduced
    */
  def emptyOptionCaption: Text = js.native
  def emptyOptionCaption(newValue: Text): js.Any = js.native
  def formattingInfo: FormattingInfo = js.native
  def formattingInfo(newValue: FormattingInfo): js.Any = js.native
  def gotoPageSettings: PageSettings = js.native
  def gotoPageSettings(newValue: PageSettings): js.Any = js.native
  def renderMode: ReferenceSelectorRenderModeType = js.native
  def renderMode(newValue: ReferenceSelectorRenderModeType): js.Any = js.native
  /**
    * In version 7.6.0: deleted
    */
  def required: Boolean = js.native
  def required(newValue: Boolean): js.Any = js.native
  /**
    * In version 7.6.0: deleted
    */
  def requiredMessage: Text = js.native
  def requiredMessage(newValue: Text): js.Any = js.native
  /**
    * In version 7.6.0: introduced
    */
  def validation: WidgetValidation = js.native
  def validation(newValue: WidgetValidation): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector")
@js.native
object ReferenceSelector extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  def createInBuildingBlockUnderWidget(container: BuildingBlock): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  def createInDataViewUnderFooterWidget(container: DataView): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderFooterWidgets(container: DataView): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDataViewUnderWidget(container: DataView): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderWidgets(container: DataView): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDivContainerUnderWidget(container: DivContainer): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDivContainerUnderWidgets(container: DivContainer): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInGroupBoxUnderWidget(container: GroupBox): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInGroupBoxUnderWidgets(container: GroupBox): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderLeftWidget(container: Header): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderLeftWidgets(container: Header): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderRightWidget(container: Header): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderRightWidgets(container: Header): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutUnderWidget(container: Layout): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInLayoutUnderWidgets(container: Layout): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewUnderWidget(container: ListView): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewUnderWidgets(container: ListView): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  def createInNativeLayoutUnderWidgets(container: NativeLayout): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInNavigationListItemUnderWidget(container: NavigationListItem): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderParameterWidget(container: ReportPane): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderReportWidget(container: ReportPane): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSnippetUnderWidget(container: Snippet): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInSnippetUnderWidgets(container: Snippet): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderFirstWidget(container: SplitPane): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderSecondWidget(container: SplitPane): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTabPageUnderWidget(container: TabPage): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTabPageUnderWidgets(container: TabPage): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTableCellUnderWidget(container: TableCell): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTableCellUnderWidgets(container: TableCell): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): ReferenceSelector = js.native
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  def createInWidgetValueUnderWidgets(container: WidgetValue): ReferenceSelector = js.native
}

