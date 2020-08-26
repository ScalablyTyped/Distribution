package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.reportsMod.reports.ReportPane
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/button-widgets relevant section in reference guide}
  *
  * In version 7.1.0: deleted
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.LogoutButton")
@js.native
class LogoutButton protected () extends Button {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FLogoutButton: IModel = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.LogoutButton")
@js.native
object LogoutButton extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.0.2
    */
  def createInDataViewUnderFooterWidget(container: DataView): LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInDataViewUnderWidget(container: DataView): LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInDivContainerUnderWidget(container: DivContainer): LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInGroupBoxUnderWidget(container: GroupBox): LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInHeaderUnderLeftWidget(container: Header): LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInHeaderUnderRightWidget(container: Header): LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInLayoutUnderWidget(container: Layout): LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInListViewUnderWidget(container: ListView): LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInNavigationListItemUnderWidget(container: NavigationListItem): LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderParameterWidget(container: ReportPane): LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderReportWidget(container: ReportPane): LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInSnippetUnderWidget(container: Snippet): LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInSplitPaneUnderFirstWidget(container: SplitPane): LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInSplitPaneUnderSecondWidget(container: SplitPane): LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInTabPageUnderWidget(container: TabPage): LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInTableCellUnderWidget(container: TableCell): LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): LogoutButton = js.native
}

