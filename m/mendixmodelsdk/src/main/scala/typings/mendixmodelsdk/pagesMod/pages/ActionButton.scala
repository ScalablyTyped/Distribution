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
  * See: {@link https://docs.mendix.com/refguide/button-widgets relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton")
@js.native
class ActionButton protected () extends Button {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def action: ClientAction = js.native
  def action_=(newValue: ClientAction): Unit = js.native
  
  /**
    * In version 8.12.0: deleted
    */
  def disabledDuringAction: Boolean = js.native
  def disabledDuringAction_=(newValue: Boolean): Unit = js.native
}
object ActionButton {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.create")
  @js.native
  def create(model: IModel): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInBuildingBlockUnderWidget")
  @js.native
  def createInBuildingBlockUnderWidget(container: BuildingBlock): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInBuildingBlockUnderWidgets")
  @js.native
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInDataViewUnderFooterWidget")
  @js.native
  def createInDataViewUnderFooterWidget(container: DataView): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInDataViewUnderFooterWidgets")
  @js.native
  def createInDataViewUnderFooterWidgets(container: DataView): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInDataViewUnderWidget")
  @js.native
  def createInDataViewUnderWidget(container: DataView): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInDataViewUnderWidgets")
  @js.native
  def createInDataViewUnderWidgets(container: DataView): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInDivContainerUnderWidget")
  @js.native
  def createInDivContainerUnderWidget(container: DivContainer): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInDivContainerUnderWidgets")
  @js.native
  def createInDivContainerUnderWidgets(container: DivContainer): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInGroupBoxUnderWidget")
  @js.native
  def createInGroupBoxUnderWidget(container: GroupBox): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInGroupBoxUnderWidgets")
  @js.native
  def createInGroupBoxUnderWidgets(container: GroupBox): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInHeaderUnderLeftWidget")
  @js.native
  def createInHeaderUnderLeftWidget(container: Header): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInHeaderUnderLeftWidgets")
  @js.native
  def createInHeaderUnderLeftWidgets(container: Header): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInHeaderUnderRightWidget")
  @js.native
  def createInHeaderUnderRightWidget(container: Header): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInHeaderUnderRightWidgets")
  @js.native
  def createInHeaderUnderRightWidgets(container: Header): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInLayoutCallArgumentUnderWidget")
  @js.native
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInLayoutCallArgumentUnderWidgets")
  @js.native
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInLayoutGridColumnUnderWidget")
  @js.native
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInLayoutGridColumnUnderWidgets")
  @js.native
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInLayoutUnderWidget")
  @js.native
  def createInLayoutUnderWidget(container: Layout): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInLayoutUnderWidgets")
  @js.native
  def createInLayoutUnderWidgets(container: Layout): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInListViewTemplateUnderWidget")
  @js.native
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInListViewTemplateUnderWidgets")
  @js.native
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInListViewUnderWidget")
  @js.native
  def createInListViewUnderWidget(container: ListView): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInListViewUnderWidgets")
  @js.native
  def createInListViewUnderWidgets(container: ListView): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInMasterDetailRegionUnderWidget")
  @js.native
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInNativeLayoutCallArgumentUnderWidgets")
  @js.native
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInNativeLayoutContentUnderSidebarWidgets")
  @js.native
  def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInNativeLayoutContentUnderWidgets")
  @js.native
  def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInNativeLayoutUnderHeaderWidget")
  @js.native
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInNativeLayoutUnderWidgets")
  @js.native
  def createInNativeLayoutUnderWidgets(container: NativeLayout): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInNavigationListItemUnderWidget")
  @js.native
  def createInNavigationListItemUnderWidget(container: NavigationListItem): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInNavigationListItemUnderWidgets")
  @js.native
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInReportPaneUnderParameterWidget")
  @js.native
  def createInReportPaneUnderParameterWidget(container: ReportPane): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInReportPaneUnderReportWidget")
  @js.native
  def createInReportPaneUnderReportWidget(container: ReportPane): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInScrollContainerRegionUnderWidget")
  @js.native
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInScrollContainerRegionUnderWidgets")
  @js.native
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInSnippetUnderWidget")
  @js.native
  def createInSnippetUnderWidget(container: Snippet): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInSnippetUnderWidgets")
  @js.native
  def createInSnippetUnderWidgets(container: Snippet): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInSplitPaneUnderFirstWidget")
  @js.native
  def createInSplitPaneUnderFirstWidget(container: SplitPane): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInSplitPaneUnderFirstWidgets")
  @js.native
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInSplitPaneUnderSecondWidget")
  @js.native
  def createInSplitPaneUnderSecondWidget(container: SplitPane): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInSplitPaneUnderSecondWidgets")
  @js.native
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInTabPageUnderWidget")
  @js.native
  def createInTabPageUnderWidget(container: TabPage): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInTabPageUnderWidgets")
  @js.native
  def createInTabPageUnderWidgets(container: TabPage): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInTableCellUnderWidget")
  @js.native
  def createInTableCellUnderWidget(container: TableCell): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInTableCellUnderWidgets")
  @js.native
  def createInTableCellUnderWidgets(container: TableCell): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInTemplateGridContentsUnderWidget")
  @js.native
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInTemplateGridContentsUnderWidgets")
  @js.native
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInVerticalFlowUnderWidgets")
  @js.native
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInWebLayoutContentUnderWidgets")
  @js.native
  def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): ActionButton = js.native
  
  /**
    * Creates and returns a new ActionButton instance in the SDK and on the server.
    * The new ActionButton will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.createInWidgetValueUnderWidgets")
  @js.native
  def createInWidgetValueUnderWidgets(container: WidgetValue): ActionButton = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionButton.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
