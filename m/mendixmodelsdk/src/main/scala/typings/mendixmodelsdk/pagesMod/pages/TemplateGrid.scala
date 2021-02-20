package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
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
  * See: {@link https://docs.mendix.com/refguide/template-grid relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid")
@js.native
class TemplateGrid protected () extends Grid {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def contents: TemplateGridContents = js.native
  def contents_=(newValue: TemplateGridContents): Unit = js.native
  
  def numberOfColumns: Double = js.native
  def numberOfColumns_=(newValue: Double): Unit = js.native
  
  def numberOfRows: Double = js.native
  def numberOfRows_=(newValue: Double): Unit = js.native
}
object TemplateGrid {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.create")
  @js.native
  def create(model: IModel): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInBuildingBlockUnderWidget")
  @js.native
  def createInBuildingBlockUnderWidget(container: BuildingBlock): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInBuildingBlockUnderWidgets")
  @js.native
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInDataViewUnderFooterWidget")
  @js.native
  def createInDataViewUnderFooterWidget(container: DataView): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInDataViewUnderFooterWidgets")
  @js.native
  def createInDataViewUnderFooterWidgets(container: DataView): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInDataViewUnderWidget")
  @js.native
  def createInDataViewUnderWidget(container: DataView): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInDataViewUnderWidgets")
  @js.native
  def createInDataViewUnderWidgets(container: DataView): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInDivContainerUnderWidget")
  @js.native
  def createInDivContainerUnderWidget(container: DivContainer): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInDivContainerUnderWidgets")
  @js.native
  def createInDivContainerUnderWidgets(container: DivContainer): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInGroupBoxUnderWidget")
  @js.native
  def createInGroupBoxUnderWidget(container: GroupBox): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInGroupBoxUnderWidgets")
  @js.native
  def createInGroupBoxUnderWidgets(container: GroupBox): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInHeaderUnderLeftWidget")
  @js.native
  def createInHeaderUnderLeftWidget(container: Header): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInHeaderUnderLeftWidgets")
  @js.native
  def createInHeaderUnderLeftWidgets(container: Header): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInHeaderUnderRightWidget")
  @js.native
  def createInHeaderUnderRightWidget(container: Header): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInHeaderUnderRightWidgets")
  @js.native
  def createInHeaderUnderRightWidgets(container: Header): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInLayoutCallArgumentUnderWidget")
  @js.native
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInLayoutCallArgumentUnderWidgets")
  @js.native
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInLayoutGridColumnUnderWidget")
  @js.native
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInLayoutGridColumnUnderWidgets")
  @js.native
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInLayoutUnderWidget")
  @js.native
  def createInLayoutUnderWidget(container: Layout): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInLayoutUnderWidgets")
  @js.native
  def createInLayoutUnderWidgets(container: Layout): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInListViewTemplateUnderWidget")
  @js.native
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInListViewTemplateUnderWidgets")
  @js.native
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInListViewUnderWidget")
  @js.native
  def createInListViewUnderWidget(container: ListView): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInListViewUnderWidgets")
  @js.native
  def createInListViewUnderWidgets(container: ListView): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInMasterDetailRegionUnderWidget")
  @js.native
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInNativeLayoutCallArgumentUnderWidgets")
  @js.native
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInNativeLayoutContentUnderSidebarWidgets")
  @js.native
  def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInNativeLayoutContentUnderWidgets")
  @js.native
  def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInNativeLayoutUnderHeaderWidget")
  @js.native
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInNativeLayoutUnderWidgets")
  @js.native
  def createInNativeLayoutUnderWidgets(container: NativeLayout): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInNavigationListItemUnderWidget")
  @js.native
  def createInNavigationListItemUnderWidget(container: NavigationListItem): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInNavigationListItemUnderWidgets")
  @js.native
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInReportPaneUnderParameterWidget")
  @js.native
  def createInReportPaneUnderParameterWidget(container: ReportPane): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInReportPaneUnderReportWidget")
  @js.native
  def createInReportPaneUnderReportWidget(container: ReportPane): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInScrollContainerRegionUnderWidget")
  @js.native
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInScrollContainerRegionUnderWidgets")
  @js.native
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInSnippetUnderWidget")
  @js.native
  def createInSnippetUnderWidget(container: Snippet): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInSnippetUnderWidgets")
  @js.native
  def createInSnippetUnderWidgets(container: Snippet): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInSplitPaneUnderFirstWidget")
  @js.native
  def createInSplitPaneUnderFirstWidget(container: SplitPane): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInSplitPaneUnderFirstWidgets")
  @js.native
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInSplitPaneUnderSecondWidget")
  @js.native
  def createInSplitPaneUnderSecondWidget(container: SplitPane): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInSplitPaneUnderSecondWidgets")
  @js.native
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInTabPageUnderWidget")
  @js.native
  def createInTabPageUnderWidget(container: TabPage): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInTabPageUnderWidgets")
  @js.native
  def createInTabPageUnderWidgets(container: TabPage): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInTableCellUnderWidget")
  @js.native
  def createInTableCellUnderWidget(container: TableCell): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInTableCellUnderWidgets")
  @js.native
  def createInTableCellUnderWidgets(container: TableCell): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInTemplateGridContentsUnderWidget")
  @js.native
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInTemplateGridContentsUnderWidgets")
  @js.native
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInVerticalFlowUnderWidgets")
  @js.native
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInWebLayoutContentUnderWidgets")
  @js.native
  def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.createInWidgetValueUnderWidgets")
  @js.native
  def createInWidgetValueUnderWidgets(container: WidgetValue): TemplateGrid = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGrid.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
