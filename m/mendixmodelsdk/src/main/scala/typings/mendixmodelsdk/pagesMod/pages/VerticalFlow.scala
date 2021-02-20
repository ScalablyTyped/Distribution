package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
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
  * In version 7.15.0: deleted
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalFlow")
@js.native
class VerticalFlow protected () extends Widget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def widgets: IList[Widget] = js.native
}
object VerticalFlow {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalFlow")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalFlow.create")
  @js.native
  def create(model: IModel): VerticalFlow = js.native
  
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalFlow.createInBuildingBlockUnderWidget")
  @js.native
  def createInBuildingBlockUnderWidget(container: BuildingBlock): VerticalFlow = js.native
  
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalFlow.createInDataViewUnderFooterWidget")
  @js.native
  def createInDataViewUnderFooterWidget(container: DataView): VerticalFlow = js.native
  
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalFlow.createInDataViewUnderWidget")
  @js.native
  def createInDataViewUnderWidget(container: DataView): VerticalFlow = js.native
  
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalFlow.createInDivContainerUnderWidget")
  @js.native
  def createInDivContainerUnderWidget(container: DivContainer): VerticalFlow = js.native
  
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalFlow.createInGroupBoxUnderWidget")
  @js.native
  def createInGroupBoxUnderWidget(container: GroupBox): VerticalFlow = js.native
  
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalFlow.createInHeaderUnderLeftWidget")
  @js.native
  def createInHeaderUnderLeftWidget(container: Header): VerticalFlow = js.native
  
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalFlow.createInHeaderUnderRightWidget")
  @js.native
  def createInHeaderUnderRightWidget(container: Header): VerticalFlow = js.native
  
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalFlow.createInLayoutCallArgumentUnderWidget")
  @js.native
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): VerticalFlow = js.native
  
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalFlow.createInLayoutGridColumnUnderWidget")
  @js.native
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): VerticalFlow = js.native
  
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalFlow.createInLayoutUnderWidget")
  @js.native
  def createInLayoutUnderWidget(container: Layout): VerticalFlow = js.native
  
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalFlow.createInListViewTemplateUnderWidget")
  @js.native
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): VerticalFlow = js.native
  
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalFlow.createInListViewUnderWidget")
  @js.native
  def createInListViewUnderWidget(container: ListView): VerticalFlow = js.native
  
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalFlow.createInMasterDetailRegionUnderWidget")
  @js.native
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): VerticalFlow = js.native
  
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalFlow.createInNavigationListItemUnderWidget")
  @js.native
  def createInNavigationListItemUnderWidget(container: NavigationListItem): VerticalFlow = js.native
  
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalFlow.createInReportPaneUnderParameterWidget")
  @js.native
  def createInReportPaneUnderParameterWidget(container: ReportPane): VerticalFlow = js.native
  
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalFlow.createInReportPaneUnderReportWidget")
  @js.native
  def createInReportPaneUnderReportWidget(container: ReportPane): VerticalFlow = js.native
  
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalFlow.createInScrollContainerRegionUnderWidget")
  @js.native
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): VerticalFlow = js.native
  
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalFlow.createInSnippetUnderWidget")
  @js.native
  def createInSnippetUnderWidget(container: Snippet): VerticalFlow = js.native
  
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalFlow.createInSplitPaneUnderFirstWidget")
  @js.native
  def createInSplitPaneUnderFirstWidget(container: SplitPane): VerticalFlow = js.native
  
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalFlow.createInSplitPaneUnderSecondWidget")
  @js.native
  def createInSplitPaneUnderSecondWidget(container: SplitPane): VerticalFlow = js.native
  
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalFlow.createInTabPageUnderWidget")
  @js.native
  def createInTabPageUnderWidget(container: TabPage): VerticalFlow = js.native
  
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalFlow.createInTableCellUnderWidget")
  @js.native
  def createInTableCellUnderWidget(container: TableCell): VerticalFlow = js.native
  
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalFlow.createInTemplateGridContentsUnderWidget")
  @js.native
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): VerticalFlow = js.native
  
  /**
    * Creates and returns a new VerticalFlow instance in the SDK and on the server.
    * The new VerticalFlow will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalFlow.createInVerticalFlowUnderWidgets")
  @js.native
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): VerticalFlow = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalFlow.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalFlow.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
