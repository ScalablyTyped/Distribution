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
import typings.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/login-id-text-box relevant section in reference guide}
  *
  * In version 7.0.2: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox")
@js.native
class LoginIdTextBox protected () extends LoginTextBox {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox")
@js.native
object LoginIdTextBox extends js.Object {
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  def createInBuildingBlockUnderWidget(container: BuildingBlock): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInDataViewUnderFooterWidget(container: DataView): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderFooterWidgets(container: DataView): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInDataViewUnderWidget(container: DataView): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderWidgets(container: DataView): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInDivContainerUnderWidget(container: DivContainer): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDivContainerUnderWidgets(container: DivContainer): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInGroupBoxUnderWidget(container: GroupBox): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInGroupBoxUnderWidgets(container: GroupBox): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInHeaderUnderLeftWidget(container: Header): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderLeftWidgets(container: Header): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInHeaderUnderRightWidget(container: Header): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderRightWidgets(container: Header): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInLayoutUnderWidget(container: Layout): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInLayoutUnderWidgets(container: Layout): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInListViewUnderWidget(container: ListView): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewUnderWidgets(container: ListView): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  def createInNativeLayoutUnderWidgets(container: NativeLayout): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInNavigationListItemUnderWidget(container: NavigationListItem): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInSnippetUnderWidget(container: Snippet): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInSnippetUnderWidgets(container: Snippet): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInSplitPaneUnderFirstWidget(container: SplitPane): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInSplitPaneUnderSecondWidget(container: SplitPane): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInTabPageUnderWidget(container: TabPage): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTabPageUnderWidgets(container: TabPage): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInTableCellUnderWidget(container: TableCell): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTableCellUnderWidgets(container: TableCell): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  def createInWidgetValueUnderWidgets(container: WidgetValue): LoginIdTextBox = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
