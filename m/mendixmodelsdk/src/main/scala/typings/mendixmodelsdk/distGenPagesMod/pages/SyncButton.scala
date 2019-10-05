package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenReportsMod.reports.ReportPane
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.0.2: deleted
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SyncButton")
@js.native
class SyncButton protected () extends Button {
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
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SyncButton")
@js.native
object SyncButton extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.0.1
    */
  def createInDataViewUnderFooterWidget(container: DataView): SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInDataViewUnderWidget(container: DataView): SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInDivContainerUnderWidget(container: DivContainer): SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInGroupBoxUnderWidget(container: GroupBox): SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInHeaderUnderLeftWidget(container: Header): SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInHeaderUnderRightWidget(container: Header): SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInLayoutUnderWidget(container: Layout): SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInListViewUnderWidget(container: ListView): SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInNavigationListItemUnderWidget(container: NavigationListItem): SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderParameterWidget(container: ReportPane): SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderReportWidget(container: ReportPane): SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInSnippetUnderWidget(container: Snippet): SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInSplitPaneUnderFirstWidget(container: SplitPane): SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInSplitPaneUnderSecondWidget(container: SplitPane): SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInTabPageUnderWidget(container: TabPage): SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInTableCellUnderWidget(container: TableCell): SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): SyncButton = js.native
}

