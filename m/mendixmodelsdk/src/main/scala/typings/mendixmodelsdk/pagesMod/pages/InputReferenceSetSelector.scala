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
  * See: {@link https://docs.mendix.com/refguide/input-reference-set-selector relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector")
@js.native
class InputReferenceSetSelector protected () extends AssociationWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object InputReferenceSetSelector {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.create")
  @js.native
  def create(model: IModel): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInBuildingBlockUnderWidget")
  @js.native
  def createInBuildingBlockUnderWidget(container: BuildingBlock): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInBuildingBlockUnderWidgets")
  @js.native
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInDataViewUnderFooterWidget")
  @js.native
  def createInDataViewUnderFooterWidget(container: DataView): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInDataViewUnderFooterWidgets")
  @js.native
  def createInDataViewUnderFooterWidgets(container: DataView): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInDataViewUnderWidget")
  @js.native
  def createInDataViewUnderWidget(container: DataView): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInDataViewUnderWidgets")
  @js.native
  def createInDataViewUnderWidgets(container: DataView): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInDivContainerUnderWidget")
  @js.native
  def createInDivContainerUnderWidget(container: DivContainer): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInDivContainerUnderWidgets")
  @js.native
  def createInDivContainerUnderWidgets(container: DivContainer): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInGroupBoxUnderWidget")
  @js.native
  def createInGroupBoxUnderWidget(container: GroupBox): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInGroupBoxUnderWidgets")
  @js.native
  def createInGroupBoxUnderWidgets(container: GroupBox): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInHeaderUnderLeftWidget")
  @js.native
  def createInHeaderUnderLeftWidget(container: Header): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInHeaderUnderLeftWidgets")
  @js.native
  def createInHeaderUnderLeftWidgets(container: Header): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInHeaderUnderRightWidget")
  @js.native
  def createInHeaderUnderRightWidget(container: Header): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInHeaderUnderRightWidgets")
  @js.native
  def createInHeaderUnderRightWidgets(container: Header): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInLayoutCallArgumentUnderWidget")
  @js.native
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInLayoutCallArgumentUnderWidgets")
  @js.native
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInLayoutGridColumnUnderWidget")
  @js.native
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInLayoutGridColumnUnderWidgets")
  @js.native
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInLayoutUnderWidget")
  @js.native
  def createInLayoutUnderWidget(container: Layout): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInLayoutUnderWidgets")
  @js.native
  def createInLayoutUnderWidgets(container: Layout): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInListViewTemplateUnderWidget")
  @js.native
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInListViewTemplateUnderWidgets")
  @js.native
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInListViewUnderWidget")
  @js.native
  def createInListViewUnderWidget(container: ListView): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInListViewUnderWidgets")
  @js.native
  def createInListViewUnderWidgets(container: ListView): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInMasterDetailRegionUnderWidget")
  @js.native
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInNativeLayoutCallArgumentUnderWidgets")
  @js.native
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInNativeLayoutContentUnderSidebarWidgets")
  @js.native
  def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInNativeLayoutContentUnderWidgets")
  @js.native
  def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInNativeLayoutUnderHeaderWidget")
  @js.native
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInNativeLayoutUnderWidgets")
  @js.native
  def createInNativeLayoutUnderWidgets(container: NativeLayout): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInNavigationListItemUnderWidget")
  @js.native
  def createInNavigationListItemUnderWidget(container: NavigationListItem): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInNavigationListItemUnderWidgets")
  @js.native
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInReportPaneUnderParameterWidget")
  @js.native
  def createInReportPaneUnderParameterWidget(container: ReportPane): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInReportPaneUnderReportWidget")
  @js.native
  def createInReportPaneUnderReportWidget(container: ReportPane): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInScrollContainerRegionUnderWidget")
  @js.native
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInScrollContainerRegionUnderWidgets")
  @js.native
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInSnippetUnderWidget")
  @js.native
  def createInSnippetUnderWidget(container: Snippet): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInSnippetUnderWidgets")
  @js.native
  def createInSnippetUnderWidgets(container: Snippet): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInSplitPaneUnderFirstWidget")
  @js.native
  def createInSplitPaneUnderFirstWidget(container: SplitPane): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInSplitPaneUnderFirstWidgets")
  @js.native
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInSplitPaneUnderSecondWidget")
  @js.native
  def createInSplitPaneUnderSecondWidget(container: SplitPane): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInSplitPaneUnderSecondWidgets")
  @js.native
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInTabPageUnderWidget")
  @js.native
  def createInTabPageUnderWidget(container: TabPage): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInTabPageUnderWidgets")
  @js.native
  def createInTabPageUnderWidgets(container: TabPage): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInTableCellUnderWidget")
  @js.native
  def createInTableCellUnderWidget(container: TableCell): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInTableCellUnderWidgets")
  @js.native
  def createInTableCellUnderWidgets(container: TableCell): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInTemplateGridContentsUnderWidget")
  @js.native
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInTemplateGridContentsUnderWidgets")
  @js.native
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInVerticalFlowUnderWidgets")
  @js.native
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInWebLayoutContentUnderWidgets")
  @js.native
  def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): InputReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new InputReferenceSetSelector instance in the SDK and on the server.
    * The new InputReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.createInWidgetValueUnderWidgets")
  @js.native
  def createInWidgetValueUnderWidgets(container: WidgetValue): InputReferenceSetSelector = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputReferenceSetSelector.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
