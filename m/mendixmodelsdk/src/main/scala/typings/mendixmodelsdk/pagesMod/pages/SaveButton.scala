package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.reportsMod.reports.ReportPane
import typings.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide6/save-button relevant section in reference guide}
  *
  * In version 7.0.2: deleted
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SaveButton")
@js.native
class SaveButton protected () extends Button {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 6.7.0: introduced
    */
  def closePage: Boolean = js.native
  def closePage_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 6.6.0: introduced
    */
  def syncAutomatically: Boolean = js.native
  def syncAutomatically_=(newValue: Boolean): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SaveButton")
@js.native
object SaveButton extends js.Object {
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.0.1
    */
  def createInDataViewUnderFooterWidget(container: DataView): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInDataViewUnderWidget(container: DataView): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInDivContainerUnderWidget(container: DivContainer): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInGroupBoxUnderWidget(container: GroupBox): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInHeaderUnderLeftWidget(container: Header): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInHeaderUnderRightWidget(container: Header): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInLayoutUnderWidget(container: Layout): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInListViewUnderWidget(container: ListView): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInNavigationListItemUnderWidget(container: NavigationListItem): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderParameterWidget(container: ReportPane): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderReportWidget(container: ReportPane): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInSnippetUnderWidget(container: Snippet): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInSplitPaneUnderFirstWidget(container: SplitPane): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInSplitPaneUnderSecondWidget(container: SplitPane): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInTabPageUnderWidget(container: TabPage): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInTableCellUnderWidget(container: TableCell): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): SaveButton = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
