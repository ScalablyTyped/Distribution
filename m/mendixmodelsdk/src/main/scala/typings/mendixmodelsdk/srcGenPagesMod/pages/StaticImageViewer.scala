package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.srcGenImagesMod.images.IImage
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
  * See: {@link https://docs.mendix.com/refguide/image relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/src/gen/pages", "pages.StaticImageViewer")
@js.native
open class StaticImageViewer protected () extends ConditionallyVisibleWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 8.6.0: introduced
    */
  def alternativeText: ClientTemplate = js.native
  def alternativeText_=(newValue: ClientTemplate): Unit = js.native
  
  def clickAction: ClientAction = js.native
  def clickAction_=(newValue: ClientAction): Unit = js.native
  
  def height: Double = js.native
  
  def heightUnit: ImageSizeUnit = js.native
  def heightUnit_=(newValue: ImageSizeUnit): Unit = js.native
  
  def height_=(newValue: Double): Unit = js.native
  
  def image: IImage | Null = js.native
  
  def imageQualifiedName: String | Null = js.native
  
  def image_=(newValue: IImage | Null): Unit = js.native
  
  def responsive: Boolean = js.native
  def responsive_=(newValue: Boolean): Unit = js.native
  
  def width: Double = js.native
  
  def widthUnit: ImageSizeUnit = js.native
  def widthUnit_=(newValue: ImageSizeUnit): Unit = js.native
  
  def width_=(newValue: Double): Unit = js.native
}
object StaticImageViewer {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.StaticImageViewer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  /* static member */
  inline def createInBuildingBlockUnderWidget(container: BuildingBlock): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInBuildingBlockUnderWidgets(container: BuildingBlock): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  /* static member */
  inline def createInDataViewUnderFooterWidget(container: DataView): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInDataViewUnderFooterWidgets(container: DataView): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInDataViewUnderWidget(container: DataView): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInDataViewUnderWidgets(container: DataView): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInDivContainerUnderWidget(container: DivContainer): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInDivContainerUnderWidgets(container: DivContainer): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInGroupBoxUnderWidget(container: GroupBox): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInGroupBoxUnderWidgets(container: GroupBox): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInHeaderUnderLeftWidget(container: Header): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidget")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInHeaderUnderLeftWidgets(container: Header): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInHeaderUnderRightWidget(container: Header): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidget")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInHeaderUnderRightWidgets(container: Header): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInLayoutUnderWidget(container: Layout): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  inline def createInLayoutUnderWidgets(container: Layout): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInListViewTemplateUnderWidget(container: ListViewTemplate): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInListViewTemplateUnderWidgets(container: ListViewTemplate): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInListViewUnderWidget(container: ListView): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInListViewUnderWidgets(container: ListView): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  inline def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMasterDetailRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  /* static member */
  inline def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  /* static member */
  inline def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderSidebarWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  /* static member */
  inline def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderHeaderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  /* static member */
  inline def createInNativeLayoutUnderWidgets(container: NativeLayout): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInNavigationListItemUnderWidget(container: NavigationListItem): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInNavigationListItemUnderWidgets(container: NavigationListItem): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  inline def createInReportPaneUnderParameterWidget(container: ReportPane): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderParameterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  inline def createInReportPaneUnderReportWidget(container: ReportPane): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderReportWidget")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInSnippetUnderWidget(container: Snippet): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInSnippetUnderWidgets(container: Snippet): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInSplitPaneUnderFirstWidget(container: SplitPane): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidget")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  inline def createInSplitPaneUnderFirstWidgets(container: SplitPane): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInSplitPaneUnderSecondWidget(container: SplitPane): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidget")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  inline def createInSplitPaneUnderSecondWidgets(container: SplitPane): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInTabPageUnderWidget(container: TabPage): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInTabPageUnderWidgets(container: TabPage): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInTableCellUnderWidget(container: TableCell): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInTableCellUnderWidgets(container: TableCell): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInVerticalFlowUnderWidgets(container: VerticalFlow): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInVerticalFlowUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  /* static member */
  inline def createInWidgetValueUnderWidgets(container: WidgetValue): StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[StaticImageViewer]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.StaticImageViewer.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.StaticImageViewer.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
