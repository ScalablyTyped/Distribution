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
  * See: {@link https://docs.mendix.com/refguide/snippet-call relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget")
@js.native
class SnippetCallWidget protected () extends Widget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def snippetCall: SnippetCall = js.native
  def snippetCall_=(newValue: SnippetCall): Unit = js.native
}
object SnippetCallWidget {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.create")
  @js.native
  def create(model: IModel): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInBuildingBlockUnderWidget")
  @js.native
  def createInBuildingBlockUnderWidget(container: BuildingBlock): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInBuildingBlockUnderWidgets")
  @js.native
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInDataViewUnderFooterWidget")
  @js.native
  def createInDataViewUnderFooterWidget(container: DataView): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInDataViewUnderFooterWidgets")
  @js.native
  def createInDataViewUnderFooterWidgets(container: DataView): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInDataViewUnderWidget")
  @js.native
  def createInDataViewUnderWidget(container: DataView): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInDataViewUnderWidgets")
  @js.native
  def createInDataViewUnderWidgets(container: DataView): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInDivContainerUnderWidget")
  @js.native
  def createInDivContainerUnderWidget(container: DivContainer): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInDivContainerUnderWidgets")
  @js.native
  def createInDivContainerUnderWidgets(container: DivContainer): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInGroupBoxUnderWidget")
  @js.native
  def createInGroupBoxUnderWidget(container: GroupBox): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInGroupBoxUnderWidgets")
  @js.native
  def createInGroupBoxUnderWidgets(container: GroupBox): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInHeaderUnderLeftWidget")
  @js.native
  def createInHeaderUnderLeftWidget(container: Header): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInHeaderUnderLeftWidgets")
  @js.native
  def createInHeaderUnderLeftWidgets(container: Header): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInHeaderUnderRightWidget")
  @js.native
  def createInHeaderUnderRightWidget(container: Header): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInHeaderUnderRightWidgets")
  @js.native
  def createInHeaderUnderRightWidgets(container: Header): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInLayoutCallArgumentUnderWidget")
  @js.native
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInLayoutCallArgumentUnderWidgets")
  @js.native
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInLayoutGridColumnUnderWidget")
  @js.native
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInLayoutGridColumnUnderWidgets")
  @js.native
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInLayoutUnderWidget")
  @js.native
  def createInLayoutUnderWidget(container: Layout): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInLayoutUnderWidgets")
  @js.native
  def createInLayoutUnderWidgets(container: Layout): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInListViewTemplateUnderWidget")
  @js.native
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInListViewTemplateUnderWidgets")
  @js.native
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInListViewUnderWidget")
  @js.native
  def createInListViewUnderWidget(container: ListView): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInListViewUnderWidgets")
  @js.native
  def createInListViewUnderWidgets(container: ListView): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInMasterDetailRegionUnderWidget")
  @js.native
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInNativeLayoutCallArgumentUnderWidgets")
  @js.native
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInNativeLayoutContentUnderSidebarWidgets")
  @js.native
  def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInNativeLayoutContentUnderWidgets")
  @js.native
  def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInNativeLayoutUnderHeaderWidget")
  @js.native
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInNativeLayoutUnderWidgets")
  @js.native
  def createInNativeLayoutUnderWidgets(container: NativeLayout): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInNavigationListItemUnderWidget")
  @js.native
  def createInNavigationListItemUnderWidget(container: NavigationListItem): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInNavigationListItemUnderWidgets")
  @js.native
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInReportPaneUnderParameterWidget")
  @js.native
  def createInReportPaneUnderParameterWidget(container: ReportPane): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInReportPaneUnderReportWidget")
  @js.native
  def createInReportPaneUnderReportWidget(container: ReportPane): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInScrollContainerRegionUnderWidget")
  @js.native
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInScrollContainerRegionUnderWidgets")
  @js.native
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInSnippetUnderWidget")
  @js.native
  def createInSnippetUnderWidget(container: Snippet): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInSnippetUnderWidgets")
  @js.native
  def createInSnippetUnderWidgets(container: Snippet): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInSplitPaneUnderFirstWidget")
  @js.native
  def createInSplitPaneUnderFirstWidget(container: SplitPane): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInSplitPaneUnderFirstWidgets")
  @js.native
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInSplitPaneUnderSecondWidget")
  @js.native
  def createInSplitPaneUnderSecondWidget(container: SplitPane): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInSplitPaneUnderSecondWidgets")
  @js.native
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInTabPageUnderWidget")
  @js.native
  def createInTabPageUnderWidget(container: TabPage): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInTabPageUnderWidgets")
  @js.native
  def createInTabPageUnderWidgets(container: TabPage): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInTableCellUnderWidget")
  @js.native
  def createInTableCellUnderWidget(container: TableCell): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInTableCellUnderWidgets")
  @js.native
  def createInTableCellUnderWidgets(container: TableCell): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInTemplateGridContentsUnderWidget")
  @js.native
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInTemplateGridContentsUnderWidgets")
  @js.native
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInVerticalFlowUnderWidgets")
  @js.native
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInWebLayoutContentUnderWidgets")
  @js.native
  def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): SnippetCallWidget = js.native
  
  /**
    * Creates and returns a new SnippetCallWidget instance in the SDK and on the server.
    * The new SnippetCallWidget will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.createInWidgetValueUnderWidgets")
  @js.native
  def createInWidgetValueUnderWidgets(container: WidgetValue): SnippetCallWidget = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCallWidget.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
