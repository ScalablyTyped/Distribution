package typings.mendixmodelsdk.mendixmodelsdkMod.reports

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenPagesMod.pages.DataView
import typings.mendixmodelsdk.distGenPagesMod.pages.DivContainer
import typings.mendixmodelsdk.distGenPagesMod.pages.GroupBox
import typings.mendixmodelsdk.distGenPagesMod.pages.Header
import typings.mendixmodelsdk.distGenPagesMod.pages.Layout
import typings.mendixmodelsdk.distGenPagesMod.pages.LayoutCallArgument
import typings.mendixmodelsdk.distGenPagesMod.pages.LayoutGridColumn
import typings.mendixmodelsdk.distGenPagesMod.pages.ListView
import typings.mendixmodelsdk.distGenPagesMod.pages.ListViewTemplate
import typings.mendixmodelsdk.distGenPagesMod.pages.NavigationListItem
import typings.mendixmodelsdk.distGenPagesMod.pages.ScrollContainerRegion
import typings.mendixmodelsdk.distGenPagesMod.pages.Snippet
import typings.mendixmodelsdk.distGenPagesMod.pages.SplitPane
import typings.mendixmodelsdk.distGenPagesMod.pages.TabPage
import typings.mendixmodelsdk.distGenPagesMod.pages.TableCell
import typings.mendixmodelsdk.distGenPagesMod.pages.TemplateGridContents
import typings.mendixmodelsdk.distGenPagesMod.pages.VerticalFlow
import typings.mendixmodelsdk.distGenReportsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/report-pane relevant section in reference guide}
  *
  * In version 6.10.0: deleted
  */
@JSImport("mendixmodelsdk", "reports.ReportPane")
@js.native
class ReportPane protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.reports.ReportPane {
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
@JSImport("mendixmodelsdk", "reports.ReportPane")
@js.native
object ReportPane extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenReportsMod.reports.ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'footerWidget' property
    * of the parent pages.DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 6.9.0
    */
  def createInDataViewUnderFooterWidget(container: DataView): typings.mendixmodelsdk.distGenReportsMod.reports.ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInDataViewUnderWidget(container: DataView): typings.mendixmodelsdk.distGenReportsMod.reports.ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInDivContainerUnderWidget(container: DivContainer): typings.mendixmodelsdk.distGenReportsMod.reports.ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInGroupBoxUnderWidget(container: GroupBox): typings.mendixmodelsdk.distGenReportsMod.reports.ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'leftWidget' property
    * of the parent pages.Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInHeaderUnderLeftWidget(container: Header): typings.mendixmodelsdk.distGenReportsMod.reports.ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'rightWidget' property
    * of the parent pages.Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInHeaderUnderRightWidget(container: Header): typings.mendixmodelsdk.distGenReportsMod.reports.ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): typings.mendixmodelsdk.distGenReportsMod.reports.ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): typings.mendixmodelsdk.distGenReportsMod.reports.ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInLayoutUnderWidget(container: Layout): typings.mendixmodelsdk.distGenReportsMod.reports.ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): typings.mendixmodelsdk.distGenReportsMod.reports.ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInListViewUnderWidget(container: ListView): typings.mendixmodelsdk.distGenReportsMod.reports.ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInNavigationListItemUnderWidget(container: NavigationListItem): typings.mendixmodelsdk.distGenReportsMod.reports.ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'parameterWidget' property
    * of the parent ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderParameterWidget(container: typings.mendixmodelsdk.distGenReportsMod.reports.ReportPane): typings.mendixmodelsdk.distGenReportsMod.reports.ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'reportWidget' property
    * of the parent ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderReportWidget(container: typings.mendixmodelsdk.distGenReportsMod.reports.ReportPane): typings.mendixmodelsdk.distGenReportsMod.reports.ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): typings.mendixmodelsdk.distGenReportsMod.reports.ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInSnippetUnderWidget(container: Snippet): typings.mendixmodelsdk.distGenReportsMod.reports.ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'firstWidget' property
    * of the parent pages.SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInSplitPaneUnderFirstWidget(container: SplitPane): typings.mendixmodelsdk.distGenReportsMod.reports.ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'secondWidget' property
    * of the parent pages.SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInSplitPaneUnderSecondWidget(container: SplitPane): typings.mendixmodelsdk.distGenReportsMod.reports.ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInTabPageUnderWidget(container: TabPage): typings.mendixmodelsdk.distGenReportsMod.reports.ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInTableCellUnderWidget(container: TableCell): typings.mendixmodelsdk.distGenReportsMod.reports.ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): typings.mendixmodelsdk.distGenReportsMod.reports.ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widgets' property
    * of the parent pages.VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): typings.mendixmodelsdk.distGenReportsMod.reports.ReportPane = js.native
}

