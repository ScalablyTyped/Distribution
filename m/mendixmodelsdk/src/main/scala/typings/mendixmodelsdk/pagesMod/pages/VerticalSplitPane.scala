package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout
import typings.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.reportsMod.reports.ReportPane
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/scroll-container relevant section in reference guide}
  *
  * In version 8.0.0: deleted
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane")
@js.native
class VerticalSplitPane protected () extends SplitPane {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object VerticalSplitPane {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.create")
  @js.native
  def create(model: IModel): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInBuildingBlockUnderWidget")
  @js.native
  def createInBuildingBlockUnderWidget(container: BuildingBlock): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInBuildingBlockUnderWidgets")
  @js.native
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInDataViewUnderFooterWidget")
  @js.native
  def createInDataViewUnderFooterWidget(container: DataView): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInDataViewUnderFooterWidgets")
  @js.native
  def createInDataViewUnderFooterWidgets(container: DataView): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInDataViewUnderWidget")
  @js.native
  def createInDataViewUnderWidget(container: DataView): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInDataViewUnderWidgets")
  @js.native
  def createInDataViewUnderWidgets(container: DataView): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInDivContainerUnderWidget")
  @js.native
  def createInDivContainerUnderWidget(container: DivContainer): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInDivContainerUnderWidgets")
  @js.native
  def createInDivContainerUnderWidgets(container: DivContainer): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInGroupBoxUnderWidget")
  @js.native
  def createInGroupBoxUnderWidget(container: GroupBox): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInGroupBoxUnderWidgets")
  @js.native
  def createInGroupBoxUnderWidgets(container: GroupBox): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInHeaderUnderLeftWidget")
  @js.native
  def createInHeaderUnderLeftWidget(container: Header): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInHeaderUnderLeftWidgets")
  @js.native
  def createInHeaderUnderLeftWidgets(container: Header): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInHeaderUnderRightWidget")
  @js.native
  def createInHeaderUnderRightWidget(container: Header): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInHeaderUnderRightWidgets")
  @js.native
  def createInHeaderUnderRightWidgets(container: Header): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInLayoutCallArgumentUnderWidget")
  @js.native
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInLayoutCallArgumentUnderWidgets")
  @js.native
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInLayoutGridColumnUnderWidget")
  @js.native
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInLayoutGridColumnUnderWidgets")
  @js.native
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInLayoutUnderWidget")
  @js.native
  def createInLayoutUnderWidget(container: Layout): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInLayoutUnderWidgets")
  @js.native
  def createInLayoutUnderWidgets(container: Layout): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInListViewTemplateUnderWidget")
  @js.native
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInListViewTemplateUnderWidgets")
  @js.native
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInListViewUnderWidget")
  @js.native
  def createInListViewUnderWidget(container: ListView): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInListViewUnderWidgets")
  @js.native
  def createInListViewUnderWidgets(container: ListView): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInMasterDetailRegionUnderWidget")
  @js.native
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInNativeLayoutCallArgumentUnderWidgets")
  @js.native
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInNativeLayoutUnderHeaderWidget")
  @js.native
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInNativeLayoutUnderWidgets")
  @js.native
  def createInNativeLayoutUnderWidgets(container: NativeLayout): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInNavigationListItemUnderWidget")
  @js.native
  def createInNavigationListItemUnderWidget(container: NavigationListItem): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInNavigationListItemUnderWidgets")
  @js.native
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInReportPaneUnderParameterWidget")
  @js.native
  def createInReportPaneUnderParameterWidget(container: ReportPane): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInReportPaneUnderReportWidget")
  @js.native
  def createInReportPaneUnderReportWidget(container: ReportPane): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInScrollContainerRegionUnderWidget")
  @js.native
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInScrollContainerRegionUnderWidgets")
  @js.native
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInSnippetUnderWidget")
  @js.native
  def createInSnippetUnderWidget(container: Snippet): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInSnippetUnderWidgets")
  @js.native
  def createInSnippetUnderWidgets(container: Snippet): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInSplitPaneUnderFirstWidget")
  @js.native
  def createInSplitPaneUnderFirstWidget(container: SplitPane): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInSplitPaneUnderFirstWidgets")
  @js.native
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInSplitPaneUnderSecondWidget")
  @js.native
  def createInSplitPaneUnderSecondWidget(container: SplitPane): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInSplitPaneUnderSecondWidgets")
  @js.native
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInTabPageUnderWidget")
  @js.native
  def createInTabPageUnderWidget(container: TabPage): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInTabPageUnderWidgets")
  @js.native
  def createInTabPageUnderWidgets(container: TabPage): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInTableCellUnderWidget")
  @js.native
  def createInTableCellUnderWidget(container: TableCell): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInTableCellUnderWidgets")
  @js.native
  def createInTableCellUnderWidgets(container: TableCell): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInTemplateGridContentsUnderWidget")
  @js.native
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInTemplateGridContentsUnderWidgets")
  @js.native
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): VerticalSplitPane = js.native
  
  /**
    * Creates and returns a new VerticalSplitPane instance in the SDK and on the server.
    * The new VerticalSplitPane will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.createInVerticalFlowUnderWidgets")
  @js.native
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): VerticalSplitPane = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.VerticalSplitPane.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
