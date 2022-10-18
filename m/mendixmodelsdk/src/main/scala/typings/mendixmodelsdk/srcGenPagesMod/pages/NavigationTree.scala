package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativeLayout
import typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativeLayoutCallArgument
import typings.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenReportsMod.reports.ReportPane
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/navigation-tree relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/src/gen/pages", "pages.NavigationTree")
@js.native
open class NavigationTree protected () extends MenuWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object NavigationTree {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.NavigationTree")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  /* static member */
  inline def createInBuildingBlockUnderWidget(container: BuildingBlock): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInBuildingBlockUnderWidgets(container: BuildingBlock): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  /* static member */
  inline def createInDataViewUnderFooterWidget(container: DataView): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInDataViewUnderFooterWidgets(container: DataView): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInDataViewUnderWidget(container: DataView): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInDataViewUnderWidgets(container: DataView): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInDivContainerUnderWidget(container: DivContainer): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInDivContainerUnderWidgets(container: DivContainer): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInGroupBoxUnderWidget(container: GroupBox): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInGroupBoxUnderWidgets(container: GroupBox): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInHeaderUnderLeftWidget(container: Header): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidget")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInHeaderUnderLeftWidgets(container: Header): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInHeaderUnderRightWidget(container: Header): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidget")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInHeaderUnderRightWidgets(container: Header): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInLayoutUnderWidget(container: Layout): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  inline def createInLayoutUnderWidgets(container: Layout): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInListViewTemplateUnderWidget(container: ListViewTemplate): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInListViewTemplateUnderWidgets(container: ListViewTemplate): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInListViewUnderWidget(container: ListView): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInListViewUnderWidgets(container: ListView): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  inline def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMasterDetailRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  /* static member */
  inline def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  /* static member */
  inline def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderSidebarWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  /* static member */
  inline def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderHeaderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  /* static member */
  inline def createInNativeLayoutUnderWidgets(container: NativeLayout): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInNavigationListItemUnderWidget(container: NavigationListItem): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInNavigationListItemUnderWidgets(container: NavigationListItem): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  inline def createInReportPaneUnderParameterWidget(container: ReportPane): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderParameterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  inline def createInReportPaneUnderReportWidget(container: ReportPane): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderReportWidget")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInSnippetUnderWidget(container: Snippet): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInSnippetUnderWidgets(container: Snippet): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInSplitPaneUnderFirstWidget(container: SplitPane): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidget")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  inline def createInSplitPaneUnderFirstWidgets(container: SplitPane): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInSplitPaneUnderSecondWidget(container: SplitPane): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidget")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  inline def createInSplitPaneUnderSecondWidgets(container: SplitPane): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInTabPageUnderWidget(container: TabPage): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInTabPageUnderWidgets(container: TabPage): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInTableCellUnderWidget(container: TableCell): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInTableCellUnderWidgets(container: TableCell): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInVerticalFlowUnderWidgets(container: VerticalFlow): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInVerticalFlowUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  /* static member */
  inline def createInWidgetValueUnderWidgets(container: WidgetValue): NavigationTree = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationTree]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.NavigationTree.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.NavigationTree.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
