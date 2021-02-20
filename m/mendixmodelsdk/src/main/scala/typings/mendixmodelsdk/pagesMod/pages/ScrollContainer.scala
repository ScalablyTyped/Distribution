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
  * See: {@link https://docs.mendix.com/refguide/scroll-container relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer")
@js.native
class ScrollContainer protected () extends Widget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def alignment: AlignmentEnum = js.native
  def alignment_=(newValue: AlignmentEnum): Unit = js.native
  
  def bottom: ScrollContainerRegion | Null = js.native
  def bottom_=(newValue: ScrollContainerRegion | Null): Unit = js.native
  
  def center: ScrollContainerRegion = js.native
  def center_=(newValue: ScrollContainerRegion): Unit = js.native
  
  def layoutMode: LayoutModeType = js.native
  def layoutMode_=(newValue: LayoutModeType): Unit = js.native
  
  def left: ScrollContainerRegion | Null = js.native
  def left_=(newValue: ScrollContainerRegion | Null): Unit = js.native
  
  def right: ScrollContainerRegion | Null = js.native
  def right_=(newValue: ScrollContainerRegion | Null): Unit = js.native
  
  def scrollBehavior: ScrollBehavior = js.native
  def scrollBehavior_=(newValue: ScrollBehavior): Unit = js.native
  
  def top: ScrollContainerRegion | Null = js.native
  def top_=(newValue: ScrollContainerRegion | Null): Unit = js.native
  
  def width: Double = js.native
  
  def widthMode: SizeMode = js.native
  def widthMode_=(newValue: SizeMode): Unit = js.native
  
  def width_=(newValue: Double): Unit = js.native
}
object ScrollContainer {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.create")
  @js.native
  def create(model: IModel): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInBuildingBlockUnderWidget")
  @js.native
  def createInBuildingBlockUnderWidget(container: BuildingBlock): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInBuildingBlockUnderWidgets")
  @js.native
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInDataViewUnderFooterWidget")
  @js.native
  def createInDataViewUnderFooterWidget(container: DataView): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInDataViewUnderFooterWidgets")
  @js.native
  def createInDataViewUnderFooterWidgets(container: DataView): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInDataViewUnderWidget")
  @js.native
  def createInDataViewUnderWidget(container: DataView): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInDataViewUnderWidgets")
  @js.native
  def createInDataViewUnderWidgets(container: DataView): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInDivContainerUnderWidget")
  @js.native
  def createInDivContainerUnderWidget(container: DivContainer): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInDivContainerUnderWidgets")
  @js.native
  def createInDivContainerUnderWidgets(container: DivContainer): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInGroupBoxUnderWidget")
  @js.native
  def createInGroupBoxUnderWidget(container: GroupBox): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInGroupBoxUnderWidgets")
  @js.native
  def createInGroupBoxUnderWidgets(container: GroupBox): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInHeaderUnderLeftWidget")
  @js.native
  def createInHeaderUnderLeftWidget(container: Header): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInHeaderUnderLeftWidgets")
  @js.native
  def createInHeaderUnderLeftWidgets(container: Header): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInHeaderUnderRightWidget")
  @js.native
  def createInHeaderUnderRightWidget(container: Header): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInHeaderUnderRightWidgets")
  @js.native
  def createInHeaderUnderRightWidgets(container: Header): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInLayoutCallArgumentUnderWidget")
  @js.native
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInLayoutCallArgumentUnderWidgets")
  @js.native
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInLayoutGridColumnUnderWidget")
  @js.native
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInLayoutGridColumnUnderWidgets")
  @js.native
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInLayoutUnderWidget")
  @js.native
  def createInLayoutUnderWidget(container: Layout): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInLayoutUnderWidgets")
  @js.native
  def createInLayoutUnderWidgets(container: Layout): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInListViewTemplateUnderWidget")
  @js.native
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInListViewTemplateUnderWidgets")
  @js.native
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInListViewUnderWidget")
  @js.native
  def createInListViewUnderWidget(container: ListView): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInListViewUnderWidgets")
  @js.native
  def createInListViewUnderWidgets(container: ListView): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInMasterDetailRegionUnderWidget")
  @js.native
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInNativeLayoutCallArgumentUnderWidgets")
  @js.native
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInNativeLayoutContentUnderSidebarWidgets")
  @js.native
  def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInNativeLayoutContentUnderWidgets")
  @js.native
  def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInNativeLayoutUnderHeaderWidget")
  @js.native
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInNativeLayoutUnderWidgets")
  @js.native
  def createInNativeLayoutUnderWidgets(container: NativeLayout): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInNavigationListItemUnderWidget")
  @js.native
  def createInNavigationListItemUnderWidget(container: NavigationListItem): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInNavigationListItemUnderWidgets")
  @js.native
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInReportPaneUnderParameterWidget")
  @js.native
  def createInReportPaneUnderParameterWidget(container: ReportPane): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInReportPaneUnderReportWidget")
  @js.native
  def createInReportPaneUnderReportWidget(container: ReportPane): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInScrollContainerRegionUnderWidget")
  @js.native
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInScrollContainerRegionUnderWidgets")
  @js.native
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInSnippetUnderWidget")
  @js.native
  def createInSnippetUnderWidget(container: Snippet): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInSnippetUnderWidgets")
  @js.native
  def createInSnippetUnderWidgets(container: Snippet): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInSplitPaneUnderFirstWidget")
  @js.native
  def createInSplitPaneUnderFirstWidget(container: SplitPane): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInSplitPaneUnderFirstWidgets")
  @js.native
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInSplitPaneUnderSecondWidget")
  @js.native
  def createInSplitPaneUnderSecondWidget(container: SplitPane): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInSplitPaneUnderSecondWidgets")
  @js.native
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInTabPageUnderWidget")
  @js.native
  def createInTabPageUnderWidget(container: TabPage): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInTabPageUnderWidgets")
  @js.native
  def createInTabPageUnderWidgets(container: TabPage): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInTableCellUnderWidget")
  @js.native
  def createInTableCellUnderWidget(container: TableCell): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInTableCellUnderWidgets")
  @js.native
  def createInTableCellUnderWidgets(container: TableCell): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInTemplateGridContentsUnderWidget")
  @js.native
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInTemplateGridContentsUnderWidgets")
  @js.native
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInVerticalFlowUnderWidgets")
  @js.native
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInWebLayoutContentUnderWidgets")
  @js.native
  def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): ScrollContainer = js.native
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.createInWidgetValueUnderWidgets")
  @js.native
  def createInWidgetValueUnderWidgets(container: WidgetValue): ScrollContainer = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainer.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
