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
  * See: {@link https://docs.mendix.com/refguide/sidebar-toggle-button relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton")
@js.native
class SidebarToggleButton protected () extends Button {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 6.10.0: deleted
    */
  def initiallyOpen: Boolean = js.native
  def initiallyOpen_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 6.10.0: deleted
    */
  def mode: SidebarToggleMode = js.native
  def mode_=(newValue: SidebarToggleMode): Unit = js.native
  
  /**
    * In version 6.10.0: deleted
    */
  def region: SidebarToggleRegion = js.native
  def region_=(newValue: SidebarToggleRegion): Unit = js.native
}
object SidebarToggleButton {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.create")
  @js.native
  def create(model: IModel): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInBuildingBlockUnderWidget")
  @js.native
  def createInBuildingBlockUnderWidget(container: BuildingBlock): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInBuildingBlockUnderWidgets")
  @js.native
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInDataViewUnderFooterWidget")
  @js.native
  def createInDataViewUnderFooterWidget(container: DataView): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInDataViewUnderFooterWidgets")
  @js.native
  def createInDataViewUnderFooterWidgets(container: DataView): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInDataViewUnderWidget")
  @js.native
  def createInDataViewUnderWidget(container: DataView): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInDataViewUnderWidgets")
  @js.native
  def createInDataViewUnderWidgets(container: DataView): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInDivContainerUnderWidget")
  @js.native
  def createInDivContainerUnderWidget(container: DivContainer): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInDivContainerUnderWidgets")
  @js.native
  def createInDivContainerUnderWidgets(container: DivContainer): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInGroupBoxUnderWidget")
  @js.native
  def createInGroupBoxUnderWidget(container: GroupBox): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInGroupBoxUnderWidgets")
  @js.native
  def createInGroupBoxUnderWidgets(container: GroupBox): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInHeaderUnderLeftWidget")
  @js.native
  def createInHeaderUnderLeftWidget(container: Header): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInHeaderUnderLeftWidgets")
  @js.native
  def createInHeaderUnderLeftWidgets(container: Header): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInHeaderUnderRightWidget")
  @js.native
  def createInHeaderUnderRightWidget(container: Header): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInHeaderUnderRightWidgets")
  @js.native
  def createInHeaderUnderRightWidgets(container: Header): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInLayoutCallArgumentUnderWidget")
  @js.native
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInLayoutCallArgumentUnderWidgets")
  @js.native
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInLayoutGridColumnUnderWidget")
  @js.native
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInLayoutGridColumnUnderWidgets")
  @js.native
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInLayoutUnderWidget")
  @js.native
  def createInLayoutUnderWidget(container: Layout): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInLayoutUnderWidgets")
  @js.native
  def createInLayoutUnderWidgets(container: Layout): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInListViewTemplateUnderWidget")
  @js.native
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInListViewTemplateUnderWidgets")
  @js.native
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInListViewUnderWidget")
  @js.native
  def createInListViewUnderWidget(container: ListView): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInListViewUnderWidgets")
  @js.native
  def createInListViewUnderWidgets(container: ListView): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInMasterDetailRegionUnderWidget")
  @js.native
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInNativeLayoutCallArgumentUnderWidgets")
  @js.native
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInNativeLayoutContentUnderSidebarWidgets")
  @js.native
  def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInNativeLayoutContentUnderWidgets")
  @js.native
  def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInNativeLayoutUnderHeaderWidget")
  @js.native
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInNativeLayoutUnderWidgets")
  @js.native
  def createInNativeLayoutUnderWidgets(container: NativeLayout): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInNavigationListItemUnderWidget")
  @js.native
  def createInNavigationListItemUnderWidget(container: NavigationListItem): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInNavigationListItemUnderWidgets")
  @js.native
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInReportPaneUnderParameterWidget")
  @js.native
  def createInReportPaneUnderParameterWidget(container: ReportPane): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInReportPaneUnderReportWidget")
  @js.native
  def createInReportPaneUnderReportWidget(container: ReportPane): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInScrollContainerRegionUnderWidget")
  @js.native
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInScrollContainerRegionUnderWidgets")
  @js.native
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInSnippetUnderWidget")
  @js.native
  def createInSnippetUnderWidget(container: Snippet): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInSnippetUnderWidgets")
  @js.native
  def createInSnippetUnderWidgets(container: Snippet): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInSplitPaneUnderFirstWidget")
  @js.native
  def createInSplitPaneUnderFirstWidget(container: SplitPane): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInSplitPaneUnderFirstWidgets")
  @js.native
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInSplitPaneUnderSecondWidget")
  @js.native
  def createInSplitPaneUnderSecondWidget(container: SplitPane): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInSplitPaneUnderSecondWidgets")
  @js.native
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInTabPageUnderWidget")
  @js.native
  def createInTabPageUnderWidget(container: TabPage): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInTabPageUnderWidgets")
  @js.native
  def createInTabPageUnderWidgets(container: TabPage): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInTableCellUnderWidget")
  @js.native
  def createInTableCellUnderWidget(container: TableCell): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInTableCellUnderWidgets")
  @js.native
  def createInTableCellUnderWidgets(container: TableCell): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInTemplateGridContentsUnderWidget")
  @js.native
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInTemplateGridContentsUnderWidgets")
  @js.native
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInVerticalFlowUnderWidgets")
  @js.native
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInWebLayoutContentUnderWidgets")
  @js.native
  def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): SidebarToggleButton = js.native
  
  /**
    * Creates and returns a new SidebarToggleButton instance in the SDK and on the server.
    * The new SidebarToggleButton will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.createInWidgetValueUnderWidgets")
  @js.native
  def createInWidgetValueUnderWidgets(container: WidgetValue): SidebarToggleButton = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleButton.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
