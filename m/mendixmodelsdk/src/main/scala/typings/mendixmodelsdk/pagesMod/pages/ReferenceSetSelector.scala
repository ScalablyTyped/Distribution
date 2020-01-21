package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.EntityRef
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout
import typings.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.reportsMod.reports.ReportPane
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/reference-set-selector relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector")
@js.native
class ReferenceSetSelector protected () extends ColumnGrid {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FReferenceSetSelector: IModel = js.native
  /**
    * The value of this property is conceptually of type paths.LegacyEntityPath.
    *
    * In version 7.11.0: deleted
    */
  def constrainedBy(): IList[String] = js.native
  /**
    * In version 7.11.0: introduced
    */
  def constrainedByRefs(): IList[EntityRef] = js.native
  /**
    * In version 7.13.0: introduced
    */
  def onChangeAction(): ClientAction = js.native
  def onChangeAction(newValue: ClientAction): js.Any = js.native
  /**
    * In version 7.13.0: deleted
    */
  def onChangeMicroflowSettings(): MicroflowSettings = js.native
  def onChangeMicroflowSettings(newValue: MicroflowSettings): js.Any = js.native
  /**
    * In version 8.0.0: deleted
    */
  def removeAllFromContext(): Boolean = js.native
  def removeAllFromContext(newValue: Boolean): js.Any = js.native
  /**
    * In version 8.0.0: deleted
    */
  def removeFromContextEntities(): IList[IEntity] = js.native
  def removeFromContextEntitiesQualifiedNames(): js.Array[String] = js.native
  /**
    * The value of this property is conceptually of type xPathConstraints.XPathConstraint.
    */
  def xPathConstraint(): String = js.native
  def xPathConstraint(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector")
@js.native
object ReferenceSetSelector extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  def createInBuildingBlockUnderWidget(container: BuildingBlock): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  def createInDataViewUnderFooterWidget(container: DataView): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderFooterWidgets(container: DataView): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDataViewUnderWidget(container: DataView): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderWidgets(container: DataView): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDivContainerUnderWidget(container: DivContainer): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDivContainerUnderWidgets(container: DivContainer): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInGroupBoxUnderWidget(container: GroupBox): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInGroupBoxUnderWidgets(container: GroupBox): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderLeftWidget(container: Header): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderLeftWidgets(container: Header): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderRightWidget(container: Header): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderRightWidgets(container: Header): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutUnderWidget(container: Layout): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInLayoutUnderWidgets(container: Layout): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewUnderWidget(container: ListView): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewUnderWidgets(container: ListView): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  def createInNativeLayoutUnderWidgets(container: NativeLayout): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInNavigationListItemUnderWidget(container: NavigationListItem): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderParameterWidget(container: ReportPane): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderReportWidget(container: ReportPane): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSnippetUnderWidget(container: Snippet): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInSnippetUnderWidgets(container: Snippet): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderFirstWidget(container: SplitPane): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderSecondWidget(container: SplitPane): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTabPageUnderWidget(container: TabPage): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTabPageUnderWidgets(container: TabPage): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTableCellUnderWidget(container: TableCell): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTableCellUnderWidgets(container: TableCell): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): ReferenceSetSelector = js.native
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  def createInWidgetValueUnderWidgets(container: WidgetValue): ReferenceSetSelector = js.native
}

