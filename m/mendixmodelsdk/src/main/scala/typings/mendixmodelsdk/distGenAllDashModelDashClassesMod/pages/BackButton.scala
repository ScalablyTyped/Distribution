package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages

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
  * See: {@link https://docs.mendix.com/refguide7/close-page-button relevant section in reference guide}
  *
  * In version 7.0.2: deleted
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.BackButton")
@js.native
class BackButton protected ()
  extends typings.mendixmodelsdk.distGenPagesMod.pages.BackButton {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.BackButton")
@js.native
object BackButton extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new BackButton instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenPagesMod.pages.BackButton = js.native
  /**
    * Creates and returns a new BackButton instance in the SDK and on the server.
    * The new BackButton will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.0.1
    */
  def createInDataViewUnderFooterWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.DataView): typings.mendixmodelsdk.distGenPagesMod.pages.BackButton = js.native
  /**
    * Creates and returns a new BackButton instance in the SDK and on the server.
    * The new BackButton will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInDataViewUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.DataView): typings.mendixmodelsdk.distGenPagesMod.pages.BackButton = js.native
  /**
    * Creates and returns a new BackButton instance in the SDK and on the server.
    * The new BackButton will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInDivContainerUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.DivContainer): typings.mendixmodelsdk.distGenPagesMod.pages.BackButton = js.native
  /**
    * Creates and returns a new BackButton instance in the SDK and on the server.
    * The new BackButton will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInGroupBoxUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.GroupBox): typings.mendixmodelsdk.distGenPagesMod.pages.BackButton = js.native
  /**
    * Creates and returns a new BackButton instance in the SDK and on the server.
    * The new BackButton will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInHeaderUnderLeftWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.Header): typings.mendixmodelsdk.distGenPagesMod.pages.BackButton = js.native
  /**
    * Creates and returns a new BackButton instance in the SDK and on the server.
    * The new BackButton will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInHeaderUnderRightWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.Header): typings.mendixmodelsdk.distGenPagesMod.pages.BackButton = js.native
  /**
    * Creates and returns a new BackButton instance in the SDK and on the server.
    * The new BackButton will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInLayoutCallArgumentUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.LayoutCallArgument): typings.mendixmodelsdk.distGenPagesMod.pages.BackButton = js.native
  /**
    * Creates and returns a new BackButton instance in the SDK and on the server.
    * The new BackButton will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInLayoutGridColumnUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.LayoutGridColumn): typings.mendixmodelsdk.distGenPagesMod.pages.BackButton = js.native
  /**
    * Creates and returns a new BackButton instance in the SDK and on the server.
    * The new BackButton will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInLayoutUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.Layout): typings.mendixmodelsdk.distGenPagesMod.pages.BackButton = js.native
  /**
    * Creates and returns a new BackButton instance in the SDK and on the server.
    * The new BackButton will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInListViewTemplateUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.ListViewTemplate): typings.mendixmodelsdk.distGenPagesMod.pages.BackButton = js.native
  /**
    * Creates and returns a new BackButton instance in the SDK and on the server.
    * The new BackButton will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInListViewUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.ListView): typings.mendixmodelsdk.distGenPagesMod.pages.BackButton = js.native
  /**
    * Creates and returns a new BackButton instance in the SDK and on the server.
    * The new BackButton will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInNavigationListItemUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.NavigationListItem): typings.mendixmodelsdk.distGenPagesMod.pages.BackButton = js.native
  /**
    * Creates and returns a new BackButton instance in the SDK and on the server.
    * The new BackButton will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderParameterWidget(container: ReportPane): typings.mendixmodelsdk.distGenPagesMod.pages.BackButton = js.native
  /**
    * Creates and returns a new BackButton instance in the SDK and on the server.
    * The new BackButton will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderReportWidget(container: ReportPane): typings.mendixmodelsdk.distGenPagesMod.pages.BackButton = js.native
  /**
    * Creates and returns a new BackButton instance in the SDK and on the server.
    * The new BackButton will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInScrollContainerRegionUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.ScrollContainerRegion): typings.mendixmodelsdk.distGenPagesMod.pages.BackButton = js.native
  /**
    * Creates and returns a new BackButton instance in the SDK and on the server.
    * The new BackButton will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInSnippetUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.Snippet): typings.mendixmodelsdk.distGenPagesMod.pages.BackButton = js.native
  /**
    * Creates and returns a new BackButton instance in the SDK and on the server.
    * The new BackButton will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInSplitPaneUnderFirstWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.SplitPane): typings.mendixmodelsdk.distGenPagesMod.pages.BackButton = js.native
  /**
    * Creates and returns a new BackButton instance in the SDK and on the server.
    * The new BackButton will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInSplitPaneUnderSecondWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.SplitPane): typings.mendixmodelsdk.distGenPagesMod.pages.BackButton = js.native
  /**
    * Creates and returns a new BackButton instance in the SDK and on the server.
    * The new BackButton will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInTabPageUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.TabPage): typings.mendixmodelsdk.distGenPagesMod.pages.BackButton = js.native
  /**
    * Creates and returns a new BackButton instance in the SDK and on the server.
    * The new BackButton will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInTableCellUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.TableCell): typings.mendixmodelsdk.distGenPagesMod.pages.BackButton = js.native
  /**
    * Creates and returns a new BackButton instance in the SDK and on the server.
    * The new BackButton will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInTemplateGridContentsUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.TemplateGridContents): typings.mendixmodelsdk.distGenPagesMod.pages.BackButton = js.native
  /**
    * Creates and returns a new BackButton instance in the SDK and on the server.
    * The new BackButton will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInVerticalFlowUnderWidgets(container: typings.mendixmodelsdk.distGenPagesMod.pages.VerticalFlow): typings.mendixmodelsdk.distGenPagesMod.pages.BackButton = js.native
}

