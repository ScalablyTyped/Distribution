package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.reportsMod.reports.ReportPane
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide6/cancel-button relevant section in reference guide}
  *
  * In version 7.0.2: deleted
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.CancelButton")
@js.native
class CancelButton protected () extends Button {
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
}
object CancelButton {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.CancelButton")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.CancelButton.create")
  @js.native
  def create(model: IModel): CancelButton = js.native
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.CancelButton.createInDataViewUnderFooterWidget")
  @js.native
  def createInDataViewUnderFooterWidget(container: DataView): CancelButton = js.native
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.CancelButton.createInDataViewUnderWidget")
  @js.native
  def createInDataViewUnderWidget(container: DataView): CancelButton = js.native
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.CancelButton.createInDivContainerUnderWidget")
  @js.native
  def createInDivContainerUnderWidget(container: DivContainer): CancelButton = js.native
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.CancelButton.createInGroupBoxUnderWidget")
  @js.native
  def createInGroupBoxUnderWidget(container: GroupBox): CancelButton = js.native
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.CancelButton.createInHeaderUnderLeftWidget")
  @js.native
  def createInHeaderUnderLeftWidget(container: Header): CancelButton = js.native
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.CancelButton.createInHeaderUnderRightWidget")
  @js.native
  def createInHeaderUnderRightWidget(container: Header): CancelButton = js.native
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.CancelButton.createInLayoutCallArgumentUnderWidget")
  @js.native
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): CancelButton = js.native
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.CancelButton.createInLayoutGridColumnUnderWidget")
  @js.native
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): CancelButton = js.native
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.CancelButton.createInLayoutUnderWidget")
  @js.native
  def createInLayoutUnderWidget(container: Layout): CancelButton = js.native
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.CancelButton.createInListViewTemplateUnderWidget")
  @js.native
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): CancelButton = js.native
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.CancelButton.createInListViewUnderWidget")
  @js.native
  def createInListViewUnderWidget(container: ListView): CancelButton = js.native
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.CancelButton.createInNavigationListItemUnderWidget")
  @js.native
  def createInNavigationListItemUnderWidget(container: NavigationListItem): CancelButton = js.native
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.CancelButton.createInReportPaneUnderParameterWidget")
  @js.native
  def createInReportPaneUnderParameterWidget(container: ReportPane): CancelButton = js.native
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.CancelButton.createInReportPaneUnderReportWidget")
  @js.native
  def createInReportPaneUnderReportWidget(container: ReportPane): CancelButton = js.native
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.CancelButton.createInScrollContainerRegionUnderWidget")
  @js.native
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): CancelButton = js.native
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.CancelButton.createInSnippetUnderWidget")
  @js.native
  def createInSnippetUnderWidget(container: Snippet): CancelButton = js.native
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.CancelButton.createInSplitPaneUnderFirstWidget")
  @js.native
  def createInSplitPaneUnderFirstWidget(container: SplitPane): CancelButton = js.native
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.CancelButton.createInSplitPaneUnderSecondWidget")
  @js.native
  def createInSplitPaneUnderSecondWidget(container: SplitPane): CancelButton = js.native
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.CancelButton.createInTabPageUnderWidget")
  @js.native
  def createInTabPageUnderWidget(container: TabPage): CancelButton = js.native
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.CancelButton.createInTableCellUnderWidget")
  @js.native
  def createInTableCellUnderWidget(container: TableCell): CancelButton = js.native
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.CancelButton.createInTemplateGridContentsUnderWidget")
  @js.native
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): CancelButton = js.native
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.CancelButton.createInVerticalFlowUnderWidgets")
  @js.native
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): CancelButton = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.CancelButton.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.CancelButton.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
