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
  * See: {@link https://docs.mendix.com/refguide/simple-menu-bar relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar")
@js.native
class SimpleMenuBar protected () extends MenuWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def orientation: SimpleMenuBarOrientation = js.native
  def orientation_=(newValue: SimpleMenuBarOrientation): Unit = js.native
}
object SimpleMenuBar {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.create")
  @js.native
  def create(model: IModel): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInBuildingBlockUnderWidget")
  @js.native
  def createInBuildingBlockUnderWidget(container: BuildingBlock): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInBuildingBlockUnderWidgets")
  @js.native
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInDataViewUnderFooterWidget")
  @js.native
  def createInDataViewUnderFooterWidget(container: DataView): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInDataViewUnderFooterWidgets")
  @js.native
  def createInDataViewUnderFooterWidgets(container: DataView): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInDataViewUnderWidget")
  @js.native
  def createInDataViewUnderWidget(container: DataView): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInDataViewUnderWidgets")
  @js.native
  def createInDataViewUnderWidgets(container: DataView): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInDivContainerUnderWidget")
  @js.native
  def createInDivContainerUnderWidget(container: DivContainer): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInDivContainerUnderWidgets")
  @js.native
  def createInDivContainerUnderWidgets(container: DivContainer): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInGroupBoxUnderWidget")
  @js.native
  def createInGroupBoxUnderWidget(container: GroupBox): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInGroupBoxUnderWidgets")
  @js.native
  def createInGroupBoxUnderWidgets(container: GroupBox): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInHeaderUnderLeftWidget")
  @js.native
  def createInHeaderUnderLeftWidget(container: Header): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInHeaderUnderLeftWidgets")
  @js.native
  def createInHeaderUnderLeftWidgets(container: Header): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInHeaderUnderRightWidget")
  @js.native
  def createInHeaderUnderRightWidget(container: Header): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInHeaderUnderRightWidgets")
  @js.native
  def createInHeaderUnderRightWidgets(container: Header): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInLayoutCallArgumentUnderWidget")
  @js.native
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInLayoutCallArgumentUnderWidgets")
  @js.native
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInLayoutGridColumnUnderWidget")
  @js.native
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInLayoutGridColumnUnderWidgets")
  @js.native
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInLayoutUnderWidget")
  @js.native
  def createInLayoutUnderWidget(container: Layout): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInLayoutUnderWidgets")
  @js.native
  def createInLayoutUnderWidgets(container: Layout): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInListViewTemplateUnderWidget")
  @js.native
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInListViewTemplateUnderWidgets")
  @js.native
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInListViewUnderWidget")
  @js.native
  def createInListViewUnderWidget(container: ListView): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInListViewUnderWidgets")
  @js.native
  def createInListViewUnderWidgets(container: ListView): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInMasterDetailRegionUnderWidget")
  @js.native
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInNativeLayoutCallArgumentUnderWidgets")
  @js.native
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInNativeLayoutContentUnderSidebarWidgets")
  @js.native
  def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInNativeLayoutContentUnderWidgets")
  @js.native
  def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInNativeLayoutUnderHeaderWidget")
  @js.native
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInNativeLayoutUnderWidgets")
  @js.native
  def createInNativeLayoutUnderWidgets(container: NativeLayout): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInNavigationListItemUnderWidget")
  @js.native
  def createInNavigationListItemUnderWidget(container: NavigationListItem): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInNavigationListItemUnderWidgets")
  @js.native
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInReportPaneUnderParameterWidget")
  @js.native
  def createInReportPaneUnderParameterWidget(container: ReportPane): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInReportPaneUnderReportWidget")
  @js.native
  def createInReportPaneUnderReportWidget(container: ReportPane): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInScrollContainerRegionUnderWidget")
  @js.native
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInScrollContainerRegionUnderWidgets")
  @js.native
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInSnippetUnderWidget")
  @js.native
  def createInSnippetUnderWidget(container: Snippet): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInSnippetUnderWidgets")
  @js.native
  def createInSnippetUnderWidgets(container: Snippet): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInSplitPaneUnderFirstWidget")
  @js.native
  def createInSplitPaneUnderFirstWidget(container: SplitPane): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInSplitPaneUnderFirstWidgets")
  @js.native
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInSplitPaneUnderSecondWidget")
  @js.native
  def createInSplitPaneUnderSecondWidget(container: SplitPane): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInSplitPaneUnderSecondWidgets")
  @js.native
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInTabPageUnderWidget")
  @js.native
  def createInTabPageUnderWidget(container: TabPage): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInTabPageUnderWidgets")
  @js.native
  def createInTabPageUnderWidgets(container: TabPage): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInTableCellUnderWidget")
  @js.native
  def createInTableCellUnderWidget(container: TableCell): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInTableCellUnderWidgets")
  @js.native
  def createInTableCellUnderWidgets(container: TableCell): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInTemplateGridContentsUnderWidget")
  @js.native
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInTemplateGridContentsUnderWidgets")
  @js.native
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInVerticalFlowUnderWidgets")
  @js.native
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInWebLayoutContentUnderWidgets")
  @js.native
  def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): SimpleMenuBar = js.native
  
  /**
    * Creates and returns a new SimpleMenuBar instance in the SDK and on the server.
    * The new SimpleMenuBar will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.createInWidgetValueUnderWidgets")
  @js.native
  def createInWidgetValueUnderWidgets(container: WidgetValue): SimpleMenuBar = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SimpleMenuBar.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
