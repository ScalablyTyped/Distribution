package typings.mendixmodelsdk.allModelClassesMod.pages

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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.LogoutButton")
@js.native
class LogoutButton protected ()
  extends typings.mendixmodelsdk.pagesMod.pages.LogoutButton {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.LogoutButton")
@js.native
object LogoutButton extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.pagesMod.pages.LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.0.2
    */
  def createInDataViewUnderFooterWidget(container: typings.mendixmodelsdk.pagesMod.pages.DataView): typings.mendixmodelsdk.pagesMod.pages.LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInDataViewUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.DataView): typings.mendixmodelsdk.pagesMod.pages.LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInDivContainerUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.DivContainer): typings.mendixmodelsdk.pagesMod.pages.LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInGroupBoxUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.GroupBox): typings.mendixmodelsdk.pagesMod.pages.LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInHeaderUnderLeftWidget(container: typings.mendixmodelsdk.pagesMod.pages.Header): typings.mendixmodelsdk.pagesMod.pages.LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInHeaderUnderRightWidget(container: typings.mendixmodelsdk.pagesMod.pages.Header): typings.mendixmodelsdk.pagesMod.pages.LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInLayoutCallArgumentUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.LayoutCallArgument): typings.mendixmodelsdk.pagesMod.pages.LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInLayoutGridColumnUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.LayoutGridColumn): typings.mendixmodelsdk.pagesMod.pages.LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInLayoutUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.Layout): typings.mendixmodelsdk.pagesMod.pages.LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInListViewTemplateUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.ListViewTemplate): typings.mendixmodelsdk.pagesMod.pages.LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInListViewUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.ListView): typings.mendixmodelsdk.pagesMod.pages.LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInNavigationListItemUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.NavigationListItem): typings.mendixmodelsdk.pagesMod.pages.LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderParameterWidget(container: ReportPane): typings.mendixmodelsdk.pagesMod.pages.LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderReportWidget(container: ReportPane): typings.mendixmodelsdk.pagesMod.pages.LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInScrollContainerRegionUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion): typings.mendixmodelsdk.pagesMod.pages.LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInSnippetUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.Snippet): typings.mendixmodelsdk.pagesMod.pages.LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInSplitPaneUnderFirstWidget(container: typings.mendixmodelsdk.pagesMod.pages.SplitPane): typings.mendixmodelsdk.pagesMod.pages.LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInSplitPaneUnderSecondWidget(container: typings.mendixmodelsdk.pagesMod.pages.SplitPane): typings.mendixmodelsdk.pagesMod.pages.LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInTabPageUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.TabPage): typings.mendixmodelsdk.pagesMod.pages.LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInTableCellUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.TableCell): typings.mendixmodelsdk.pagesMod.pages.LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInTemplateGridContentsUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.TemplateGridContents): typings.mendixmodelsdk.pagesMod.pages.LogoutButton = js.native
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  def createInVerticalFlowUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.VerticalFlow): typings.mendixmodelsdk.pagesMod.pages.LogoutButton = js.native
}

