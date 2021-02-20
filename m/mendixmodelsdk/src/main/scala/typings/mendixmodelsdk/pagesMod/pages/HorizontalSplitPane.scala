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
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane")
@js.native
class HorizontalSplitPane protected () extends SplitPane {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object HorizontalSplitPane {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.create")
  @js.native
  def create(model: IModel): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInBuildingBlockUnderWidget")
  @js.native
  def createInBuildingBlockUnderWidget(container: BuildingBlock): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInBuildingBlockUnderWidgets")
  @js.native
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInDataViewUnderFooterWidget")
  @js.native
  def createInDataViewUnderFooterWidget(container: DataView): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInDataViewUnderFooterWidgets")
  @js.native
  def createInDataViewUnderFooterWidgets(container: DataView): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInDataViewUnderWidget")
  @js.native
  def createInDataViewUnderWidget(container: DataView): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInDataViewUnderWidgets")
  @js.native
  def createInDataViewUnderWidgets(container: DataView): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInDivContainerUnderWidget")
  @js.native
  def createInDivContainerUnderWidget(container: DivContainer): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInDivContainerUnderWidgets")
  @js.native
  def createInDivContainerUnderWidgets(container: DivContainer): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInGroupBoxUnderWidget")
  @js.native
  def createInGroupBoxUnderWidget(container: GroupBox): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInGroupBoxUnderWidgets")
  @js.native
  def createInGroupBoxUnderWidgets(container: GroupBox): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInHeaderUnderLeftWidget")
  @js.native
  def createInHeaderUnderLeftWidget(container: Header): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInHeaderUnderLeftWidgets")
  @js.native
  def createInHeaderUnderLeftWidgets(container: Header): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInHeaderUnderRightWidget")
  @js.native
  def createInHeaderUnderRightWidget(container: Header): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInHeaderUnderRightWidgets")
  @js.native
  def createInHeaderUnderRightWidgets(container: Header): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInLayoutCallArgumentUnderWidget")
  @js.native
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInLayoutCallArgumentUnderWidgets")
  @js.native
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInLayoutGridColumnUnderWidget")
  @js.native
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInLayoutGridColumnUnderWidgets")
  @js.native
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInLayoutUnderWidget")
  @js.native
  def createInLayoutUnderWidget(container: Layout): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInLayoutUnderWidgets")
  @js.native
  def createInLayoutUnderWidgets(container: Layout): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInListViewTemplateUnderWidget")
  @js.native
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInListViewTemplateUnderWidgets")
  @js.native
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInListViewUnderWidget")
  @js.native
  def createInListViewUnderWidget(container: ListView): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInListViewUnderWidgets")
  @js.native
  def createInListViewUnderWidgets(container: ListView): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInMasterDetailRegionUnderWidget")
  @js.native
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInNativeLayoutCallArgumentUnderWidgets")
  @js.native
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInNativeLayoutUnderHeaderWidget")
  @js.native
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInNativeLayoutUnderWidgets")
  @js.native
  def createInNativeLayoutUnderWidgets(container: NativeLayout): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInNavigationListItemUnderWidget")
  @js.native
  def createInNavigationListItemUnderWidget(container: NavigationListItem): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInNavigationListItemUnderWidgets")
  @js.native
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInReportPaneUnderParameterWidget")
  @js.native
  def createInReportPaneUnderParameterWidget(container: ReportPane): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInReportPaneUnderReportWidget")
  @js.native
  def createInReportPaneUnderReportWidget(container: ReportPane): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInScrollContainerRegionUnderWidget")
  @js.native
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInScrollContainerRegionUnderWidgets")
  @js.native
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInSnippetUnderWidget")
  @js.native
  def createInSnippetUnderWidget(container: Snippet): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInSnippetUnderWidgets")
  @js.native
  def createInSnippetUnderWidgets(container: Snippet): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInSplitPaneUnderFirstWidget")
  @js.native
  def createInSplitPaneUnderFirstWidget(container: SplitPane): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInSplitPaneUnderFirstWidgets")
  @js.native
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInSplitPaneUnderSecondWidget")
  @js.native
  def createInSplitPaneUnderSecondWidget(container: SplitPane): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInSplitPaneUnderSecondWidgets")
  @js.native
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInTabPageUnderWidget")
  @js.native
  def createInTabPageUnderWidget(container: TabPage): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInTabPageUnderWidgets")
  @js.native
  def createInTabPageUnderWidgets(container: TabPage): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInTableCellUnderWidget")
  @js.native
  def createInTableCellUnderWidget(container: TableCell): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInTableCellUnderWidgets")
  @js.native
  def createInTableCellUnderWidgets(container: TableCell): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInTemplateGridContentsUnderWidget")
  @js.native
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInTemplateGridContentsUnderWidgets")
  @js.native
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.createInVerticalFlowUnderWidgets")
  @js.native
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): HorizontalSplitPane = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
