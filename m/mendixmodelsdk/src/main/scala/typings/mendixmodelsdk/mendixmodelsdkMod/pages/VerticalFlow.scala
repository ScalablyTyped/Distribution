package typings.mendixmodelsdk.mendixmodelsdkMod.pages

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
  * In version 7.15.0: deleted
  */
@JSImport("mendixmodelsdk", "pages.VerticalFlow")
@js.native
class VerticalFlow protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages.VerticalFlow {
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
@JSImport("mendixmodelsdk", "pages.VerticalFlow")
@js.native
object VerticalFlow extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenPagesMod.pages.VerticalFlow = js.native
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  def createInBuildingBlockUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.BuildingBlock): typings.mendixmodelsdk.distGenPagesMod.pages.VerticalFlow = js.native
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  def createInDataViewUnderFooterWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.DataView): typings.mendixmodelsdk.distGenPagesMod.pages.VerticalFlow = js.native
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDataViewUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.DataView): typings.mendixmodelsdk.distGenPagesMod.pages.VerticalFlow = js.native
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDivContainerUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.DivContainer): typings.mendixmodelsdk.distGenPagesMod.pages.VerticalFlow = js.native
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInGroupBoxUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.GroupBox): typings.mendixmodelsdk.distGenPagesMod.pages.VerticalFlow = js.native
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderLeftWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.Header): typings.mendixmodelsdk.distGenPagesMod.pages.VerticalFlow = js.native
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderRightWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.Header): typings.mendixmodelsdk.distGenPagesMod.pages.VerticalFlow = js.native
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutCallArgumentUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.LayoutCallArgument): typings.mendixmodelsdk.distGenPagesMod.pages.VerticalFlow = js.native
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutGridColumnUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.LayoutGridColumn): typings.mendixmodelsdk.distGenPagesMod.pages.VerticalFlow = js.native
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.Layout): typings.mendixmodelsdk.distGenPagesMod.pages.VerticalFlow = js.native
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewTemplateUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.ListViewTemplate): typings.mendixmodelsdk.distGenPagesMod.pages.VerticalFlow = js.native
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.ListView): typings.mendixmodelsdk.distGenPagesMod.pages.VerticalFlow = js.native
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  def createInMasterDetailRegionUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.MasterDetailRegion): typings.mendixmodelsdk.distGenPagesMod.pages.VerticalFlow = js.native
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInNavigationListItemUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.NavigationListItem): typings.mendixmodelsdk.distGenPagesMod.pages.VerticalFlow = js.native
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderParameterWidget(container: ReportPane): typings.mendixmodelsdk.distGenPagesMod.pages.VerticalFlow = js.native
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderReportWidget(container: ReportPane): typings.mendixmodelsdk.distGenPagesMod.pages.VerticalFlow = js.native
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInScrollContainerRegionUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.ScrollContainerRegion): typings.mendixmodelsdk.distGenPagesMod.pages.VerticalFlow = js.native
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSnippetUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.Snippet): typings.mendixmodelsdk.distGenPagesMod.pages.VerticalFlow = js.native
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderFirstWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.SplitPane): typings.mendixmodelsdk.distGenPagesMod.pages.VerticalFlow = js.native
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderSecondWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.SplitPane): typings.mendixmodelsdk.distGenPagesMod.pages.VerticalFlow = js.native
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTabPageUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.TabPage): typings.mendixmodelsdk.distGenPagesMod.pages.VerticalFlow = js.native
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTableCellUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.TableCell): typings.mendixmodelsdk.distGenPagesMod.pages.VerticalFlow = js.native
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTemplateGridContentsUnderWidget(container: typings.mendixmodelsdk.distGenPagesMod.pages.TemplateGridContents): typings.mendixmodelsdk.distGenPagesMod.pages.VerticalFlow = js.native
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInVerticalFlowUnderWidgets(container: typings.mendixmodelsdk.distGenPagesMod.pages.VerticalFlow): typings.mendixmodelsdk.distGenPagesMod.pages.VerticalFlow = js.native
}

