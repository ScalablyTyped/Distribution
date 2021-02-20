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
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object SyncButton {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SyncButton")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SyncButton.create")
  @js.native
  def create(model: IModel): SyncButton = js.native
  
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SyncButton.createInDataViewUnderFooterWidget")
  @js.native
  def createInDataViewUnderFooterWidget(container: DataView): SyncButton = js.native
  
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SyncButton.createInDataViewUnderWidget")
  @js.native
  def createInDataViewUnderWidget(container: DataView): SyncButton = js.native
  
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SyncButton.createInDivContainerUnderWidget")
  @js.native
  def createInDivContainerUnderWidget(container: DivContainer): SyncButton = js.native
  
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SyncButton.createInGroupBoxUnderWidget")
  @js.native
  def createInGroupBoxUnderWidget(container: GroupBox): SyncButton = js.native
  
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SyncButton.createInHeaderUnderLeftWidget")
  @js.native
  def createInHeaderUnderLeftWidget(container: Header): SyncButton = js.native
  
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SyncButton.createInHeaderUnderRightWidget")
  @js.native
  def createInHeaderUnderRightWidget(container: Header): SyncButton = js.native
  
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SyncButton.createInLayoutCallArgumentUnderWidget")
  @js.native
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): SyncButton = js.native
  
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SyncButton.createInLayoutGridColumnUnderWidget")
  @js.native
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): SyncButton = js.native
  
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SyncButton.createInLayoutUnderWidget")
  @js.native
  def createInLayoutUnderWidget(container: Layout): SyncButton = js.native
  
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SyncButton.createInListViewTemplateUnderWidget")
  @js.native
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): SyncButton = js.native
  
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SyncButton.createInListViewUnderWidget")
  @js.native
  def createInListViewUnderWidget(container: ListView): SyncButton = js.native
  
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SyncButton.createInNavigationListItemUnderWidget")
  @js.native
  def createInNavigationListItemUnderWidget(container: NavigationListItem): SyncButton = js.native
  
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SyncButton.createInReportPaneUnderParameterWidget")
  @js.native
  def createInReportPaneUnderParameterWidget(container: ReportPane): SyncButton = js.native
  
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SyncButton.createInReportPaneUnderReportWidget")
  @js.native
  def createInReportPaneUnderReportWidget(container: ReportPane): SyncButton = js.native
  
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SyncButton.createInScrollContainerRegionUnderWidget")
  @js.native
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): SyncButton = js.native
  
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SyncButton.createInSnippetUnderWidget")
  @js.native
  def createInSnippetUnderWidget(container: Snippet): SyncButton = js.native
  
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SyncButton.createInSplitPaneUnderFirstWidget")
  @js.native
  def createInSplitPaneUnderFirstWidget(container: SplitPane): SyncButton = js.native
  
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SyncButton.createInSplitPaneUnderSecondWidget")
  @js.native
  def createInSplitPaneUnderSecondWidget(container: SplitPane): SyncButton = js.native
  
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SyncButton.createInTabPageUnderWidget")
  @js.native
  def createInTabPageUnderWidget(container: TabPage): SyncButton = js.native
  
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SyncButton.createInTableCellUnderWidget")
  @js.native
  def createInTableCellUnderWidget(container: TableCell): SyncButton = js.native
  
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SyncButton.createInTemplateGridContentsUnderWidget")
  @js.native
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): SyncButton = js.native
  
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SyncButton.createInVerticalFlowUnderWidgets")
  @js.native
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): SyncButton = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SyncButton.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SyncButton.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
