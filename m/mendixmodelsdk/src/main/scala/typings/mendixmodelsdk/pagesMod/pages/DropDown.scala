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
import typings.mendixmodelsdk.textsMod.texts.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/drop-down relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown")
@js.native
class DropDown protected () extends AttributeWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 7.2.0: introduced
    */
  def emptyOptionCaption: Text = js.native
  def emptyOptionCaption_=(newValue: Text): Unit = js.native
}
object DropDown {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.create")
  @js.native
  def create(model: IModel): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInBuildingBlockUnderWidget")
  @js.native
  def createInBuildingBlockUnderWidget(container: BuildingBlock): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInBuildingBlockUnderWidgets")
  @js.native
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInDataViewUnderFooterWidget")
  @js.native
  def createInDataViewUnderFooterWidget(container: DataView): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInDataViewUnderFooterWidgets")
  @js.native
  def createInDataViewUnderFooterWidgets(container: DataView): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInDataViewUnderWidget")
  @js.native
  def createInDataViewUnderWidget(container: DataView): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInDataViewUnderWidgets")
  @js.native
  def createInDataViewUnderWidgets(container: DataView): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInDivContainerUnderWidget")
  @js.native
  def createInDivContainerUnderWidget(container: DivContainer): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInDivContainerUnderWidgets")
  @js.native
  def createInDivContainerUnderWidgets(container: DivContainer): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInGroupBoxUnderWidget")
  @js.native
  def createInGroupBoxUnderWidget(container: GroupBox): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInGroupBoxUnderWidgets")
  @js.native
  def createInGroupBoxUnderWidgets(container: GroupBox): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInHeaderUnderLeftWidget")
  @js.native
  def createInHeaderUnderLeftWidget(container: Header): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInHeaderUnderLeftWidgets")
  @js.native
  def createInHeaderUnderLeftWidgets(container: Header): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInHeaderUnderRightWidget")
  @js.native
  def createInHeaderUnderRightWidget(container: Header): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInHeaderUnderRightWidgets")
  @js.native
  def createInHeaderUnderRightWidgets(container: Header): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInLayoutCallArgumentUnderWidget")
  @js.native
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInLayoutCallArgumentUnderWidgets")
  @js.native
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInLayoutGridColumnUnderWidget")
  @js.native
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInLayoutGridColumnUnderWidgets")
  @js.native
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInLayoutUnderWidget")
  @js.native
  def createInLayoutUnderWidget(container: Layout): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInLayoutUnderWidgets")
  @js.native
  def createInLayoutUnderWidgets(container: Layout): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInListViewTemplateUnderWidget")
  @js.native
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInListViewTemplateUnderWidgets")
  @js.native
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInListViewUnderWidget")
  @js.native
  def createInListViewUnderWidget(container: ListView): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInListViewUnderWidgets")
  @js.native
  def createInListViewUnderWidgets(container: ListView): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInMasterDetailRegionUnderWidget")
  @js.native
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInNativeLayoutCallArgumentUnderWidgets")
  @js.native
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInNativeLayoutContentUnderSidebarWidgets")
  @js.native
  def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInNativeLayoutContentUnderWidgets")
  @js.native
  def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInNativeLayoutUnderHeaderWidget")
  @js.native
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInNativeLayoutUnderWidgets")
  @js.native
  def createInNativeLayoutUnderWidgets(container: NativeLayout): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInNavigationListItemUnderWidget")
  @js.native
  def createInNavigationListItemUnderWidget(container: NavigationListItem): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInNavigationListItemUnderWidgets")
  @js.native
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInReportPaneUnderParameterWidget")
  @js.native
  def createInReportPaneUnderParameterWidget(container: ReportPane): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInReportPaneUnderReportWidget")
  @js.native
  def createInReportPaneUnderReportWidget(container: ReportPane): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInScrollContainerRegionUnderWidget")
  @js.native
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInScrollContainerRegionUnderWidgets")
  @js.native
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInSnippetUnderWidget")
  @js.native
  def createInSnippetUnderWidget(container: Snippet): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInSnippetUnderWidgets")
  @js.native
  def createInSnippetUnderWidgets(container: Snippet): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInSplitPaneUnderFirstWidget")
  @js.native
  def createInSplitPaneUnderFirstWidget(container: SplitPane): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInSplitPaneUnderFirstWidgets")
  @js.native
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInSplitPaneUnderSecondWidget")
  @js.native
  def createInSplitPaneUnderSecondWidget(container: SplitPane): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInSplitPaneUnderSecondWidgets")
  @js.native
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInTabPageUnderWidget")
  @js.native
  def createInTabPageUnderWidget(container: TabPage): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInTabPageUnderWidgets")
  @js.native
  def createInTabPageUnderWidgets(container: TabPage): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInTableCellUnderWidget")
  @js.native
  def createInTableCellUnderWidget(container: TableCell): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInTableCellUnderWidgets")
  @js.native
  def createInTableCellUnderWidgets(container: TableCell): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInTemplateGridContentsUnderWidget")
  @js.native
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInTemplateGridContentsUnderWidgets")
  @js.native
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInVerticalFlowUnderWidgets")
  @js.native
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInWebLayoutContentUnderWidgets")
  @js.native
  def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.createInWidgetValueUnderWidgets")
  @js.native
  def createInWidgetValueUnderWidgets(container: WidgetValue): DropDown = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
