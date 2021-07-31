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
  @scala.inline
  def create(model: IModel): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInBuildingBlockUnderWidget(container: BuildingBlock): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInDataViewUnderFooterWidget(container: DataView): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInDataViewUnderFooterWidgets(container: DataView): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInDataViewUnderWidget(container: DataView): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInDataViewUnderWidgets(container: DataView): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInDivContainerUnderWidget(container: DivContainer): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInDivContainerUnderWidgets(container: DivContainer): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInGroupBoxUnderWidget(container: GroupBox): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInGroupBoxUnderWidgets(container: GroupBox): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInHeaderUnderLeftWidget(container: Header): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInHeaderUnderLeftWidgets(container: Header): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInHeaderUnderRightWidget(container: Header): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInHeaderUnderRightWidgets(container: Header): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInLayoutUnderWidget(container: Layout): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @scala.inline
  def createInLayoutUnderWidgets(container: Layout): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInListViewUnderWidget(container: ListView): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInListViewUnderWidgets(container: ListView): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMasterDetailRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  /* static member */
  @scala.inline
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  /* static member */
  @scala.inline
  def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderSidebarWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @scala.inline
  def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  /* static member */
  @scala.inline
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderHeaderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  /* static member */
  @scala.inline
  def createInNativeLayoutUnderWidgets(container: NativeLayout): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInNavigationListItemUnderWidget(container: NavigationListItem): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @scala.inline
  def createInReportPaneUnderParameterWidget(container: ReportPane): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderParameterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @scala.inline
  def createInReportPaneUnderReportWidget(container: ReportPane): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderReportWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInSnippetUnderWidget(container: Snippet): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInSnippetUnderWidgets(container: Snippet): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInSplitPaneUnderFirstWidget(container: SplitPane): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @scala.inline
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInSplitPaneUnderSecondWidget(container: SplitPane): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @scala.inline
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInTabPageUnderWidget(container: TabPage): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInTabPageUnderWidgets(container: TabPage): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInTableCellUnderWidget(container: TableCell): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInTableCellUnderWidgets(container: TableCell): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInVerticalFlowUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @scala.inline
  def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
  /**
    * Creates and returns a new ScrollContainer instance in the SDK and on the server.
    * The new ScrollContainer will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  /* static member */
  @scala.inline
  def createInWidgetValueUnderWidgets(container: WidgetValue): ScrollContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ScrollContainer]
  
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
