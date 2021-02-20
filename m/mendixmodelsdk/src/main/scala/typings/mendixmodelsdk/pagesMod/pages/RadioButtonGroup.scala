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
  * See: {@link https://docs.mendix.com/refguide/radio-buttons relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup")
@js.native
class RadioButtonGroup protected () extends AttributeWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def renderHorizontal: Boolean = js.native
  def renderHorizontal_=(newValue: Boolean): Unit = js.native
}
object RadioButtonGroup {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.create")
  @js.native
  def create(model: IModel): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInBuildingBlockUnderWidget")
  @js.native
  def createInBuildingBlockUnderWidget(container: BuildingBlock): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInBuildingBlockUnderWidgets")
  @js.native
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInDataViewUnderFooterWidget")
  @js.native
  def createInDataViewUnderFooterWidget(container: DataView): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInDataViewUnderFooterWidgets")
  @js.native
  def createInDataViewUnderFooterWidgets(container: DataView): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInDataViewUnderWidget")
  @js.native
  def createInDataViewUnderWidget(container: DataView): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInDataViewUnderWidgets")
  @js.native
  def createInDataViewUnderWidgets(container: DataView): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInDivContainerUnderWidget")
  @js.native
  def createInDivContainerUnderWidget(container: DivContainer): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInDivContainerUnderWidgets")
  @js.native
  def createInDivContainerUnderWidgets(container: DivContainer): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInGroupBoxUnderWidget")
  @js.native
  def createInGroupBoxUnderWidget(container: GroupBox): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInGroupBoxUnderWidgets")
  @js.native
  def createInGroupBoxUnderWidgets(container: GroupBox): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInHeaderUnderLeftWidget")
  @js.native
  def createInHeaderUnderLeftWidget(container: Header): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInHeaderUnderLeftWidgets")
  @js.native
  def createInHeaderUnderLeftWidgets(container: Header): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInHeaderUnderRightWidget")
  @js.native
  def createInHeaderUnderRightWidget(container: Header): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInHeaderUnderRightWidgets")
  @js.native
  def createInHeaderUnderRightWidgets(container: Header): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInLayoutCallArgumentUnderWidget")
  @js.native
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInLayoutCallArgumentUnderWidgets")
  @js.native
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInLayoutGridColumnUnderWidget")
  @js.native
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInLayoutGridColumnUnderWidgets")
  @js.native
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInLayoutUnderWidget")
  @js.native
  def createInLayoutUnderWidget(container: Layout): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInLayoutUnderWidgets")
  @js.native
  def createInLayoutUnderWidgets(container: Layout): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInListViewTemplateUnderWidget")
  @js.native
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInListViewTemplateUnderWidgets")
  @js.native
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInListViewUnderWidget")
  @js.native
  def createInListViewUnderWidget(container: ListView): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInListViewUnderWidgets")
  @js.native
  def createInListViewUnderWidgets(container: ListView): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInMasterDetailRegionUnderWidget")
  @js.native
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInNativeLayoutCallArgumentUnderWidgets")
  @js.native
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInNativeLayoutContentUnderSidebarWidgets")
  @js.native
  def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInNativeLayoutContentUnderWidgets")
  @js.native
  def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInNativeLayoutUnderHeaderWidget")
  @js.native
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInNativeLayoutUnderWidgets")
  @js.native
  def createInNativeLayoutUnderWidgets(container: NativeLayout): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInNavigationListItemUnderWidget")
  @js.native
  def createInNavigationListItemUnderWidget(container: NavigationListItem): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInNavigationListItemUnderWidgets")
  @js.native
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInReportPaneUnderParameterWidget")
  @js.native
  def createInReportPaneUnderParameterWidget(container: ReportPane): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInReportPaneUnderReportWidget")
  @js.native
  def createInReportPaneUnderReportWidget(container: ReportPane): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInScrollContainerRegionUnderWidget")
  @js.native
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInScrollContainerRegionUnderWidgets")
  @js.native
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInSnippetUnderWidget")
  @js.native
  def createInSnippetUnderWidget(container: Snippet): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInSnippetUnderWidgets")
  @js.native
  def createInSnippetUnderWidgets(container: Snippet): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInSplitPaneUnderFirstWidget")
  @js.native
  def createInSplitPaneUnderFirstWidget(container: SplitPane): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInSplitPaneUnderFirstWidgets")
  @js.native
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInSplitPaneUnderSecondWidget")
  @js.native
  def createInSplitPaneUnderSecondWidget(container: SplitPane): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInSplitPaneUnderSecondWidgets")
  @js.native
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInTabPageUnderWidget")
  @js.native
  def createInTabPageUnderWidget(container: TabPage): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInTabPageUnderWidgets")
  @js.native
  def createInTabPageUnderWidgets(container: TabPage): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInTableCellUnderWidget")
  @js.native
  def createInTableCellUnderWidget(container: TableCell): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInTableCellUnderWidgets")
  @js.native
  def createInTableCellUnderWidgets(container: TableCell): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInTemplateGridContentsUnderWidget")
  @js.native
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInTemplateGridContentsUnderWidgets")
  @js.native
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInVerticalFlowUnderWidgets")
  @js.native
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInWebLayoutContentUnderWidgets")
  @js.native
  def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): RadioButtonGroup = js.native
  
  /**
    * Creates and returns a new RadioButtonGroup instance in the SDK and on the server.
    * The new RadioButtonGroup will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.createInWidgetValueUnderWidgets")
  @js.native
  def createInWidgetValueUnderWidgets(container: WidgetValue): RadioButtonGroup = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.RadioButtonGroup.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
