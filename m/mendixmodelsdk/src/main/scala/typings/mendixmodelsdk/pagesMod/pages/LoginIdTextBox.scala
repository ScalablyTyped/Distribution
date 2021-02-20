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
import org.scalablytyped.runtime.StObject
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
object LoginIdTextBox {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.create")
  @js.native
  def create(model: IModel): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInBuildingBlockUnderWidget")
  @js.native
  def createInBuildingBlockUnderWidget(container: BuildingBlock): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInBuildingBlockUnderWidgets")
  @js.native
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInDataViewUnderFooterWidget")
  @js.native
  def createInDataViewUnderFooterWidget(container: DataView): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInDataViewUnderFooterWidgets")
  @js.native
  def createInDataViewUnderFooterWidgets(container: DataView): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInDataViewUnderWidget")
  @js.native
  def createInDataViewUnderWidget(container: DataView): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInDataViewUnderWidgets")
  @js.native
  def createInDataViewUnderWidgets(container: DataView): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInDivContainerUnderWidget")
  @js.native
  def createInDivContainerUnderWidget(container: DivContainer): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInDivContainerUnderWidgets")
  @js.native
  def createInDivContainerUnderWidgets(container: DivContainer): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInGroupBoxUnderWidget")
  @js.native
  def createInGroupBoxUnderWidget(container: GroupBox): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInGroupBoxUnderWidgets")
  @js.native
  def createInGroupBoxUnderWidgets(container: GroupBox): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInHeaderUnderLeftWidget")
  @js.native
  def createInHeaderUnderLeftWidget(container: Header): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInHeaderUnderLeftWidgets")
  @js.native
  def createInHeaderUnderLeftWidgets(container: Header): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInHeaderUnderRightWidget")
  @js.native
  def createInHeaderUnderRightWidget(container: Header): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInHeaderUnderRightWidgets")
  @js.native
  def createInHeaderUnderRightWidgets(container: Header): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInLayoutCallArgumentUnderWidget")
  @js.native
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInLayoutCallArgumentUnderWidgets")
  @js.native
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInLayoutGridColumnUnderWidget")
  @js.native
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInLayoutGridColumnUnderWidgets")
  @js.native
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInLayoutUnderWidget")
  @js.native
  def createInLayoutUnderWidget(container: Layout): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInLayoutUnderWidgets")
  @js.native
  def createInLayoutUnderWidgets(container: Layout): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInListViewTemplateUnderWidget")
  @js.native
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInListViewTemplateUnderWidgets")
  @js.native
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInListViewUnderWidget")
  @js.native
  def createInListViewUnderWidget(container: ListView): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInListViewUnderWidgets")
  @js.native
  def createInListViewUnderWidgets(container: ListView): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInMasterDetailRegionUnderWidget")
  @js.native
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInNativeLayoutCallArgumentUnderWidgets")
  @js.native
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInNativeLayoutContentUnderSidebarWidgets")
  @js.native
  def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInNativeLayoutContentUnderWidgets")
  @js.native
  def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInNativeLayoutUnderHeaderWidget")
  @js.native
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInNativeLayoutUnderWidgets")
  @js.native
  def createInNativeLayoutUnderWidgets(container: NativeLayout): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInNavigationListItemUnderWidget")
  @js.native
  def createInNavigationListItemUnderWidget(container: NavigationListItem): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInNavigationListItemUnderWidgets")
  @js.native
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInScrollContainerRegionUnderWidget")
  @js.native
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInScrollContainerRegionUnderWidgets")
  @js.native
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInSnippetUnderWidget")
  @js.native
  def createInSnippetUnderWidget(container: Snippet): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInSnippetUnderWidgets")
  @js.native
  def createInSnippetUnderWidgets(container: Snippet): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInSplitPaneUnderFirstWidget")
  @js.native
  def createInSplitPaneUnderFirstWidget(container: SplitPane): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInSplitPaneUnderFirstWidgets")
  @js.native
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInSplitPaneUnderSecondWidget")
  @js.native
  def createInSplitPaneUnderSecondWidget(container: SplitPane): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInSplitPaneUnderSecondWidgets")
  @js.native
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInTabPageUnderWidget")
  @js.native
  def createInTabPageUnderWidget(container: TabPage): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInTabPageUnderWidgets")
  @js.native
  def createInTabPageUnderWidgets(container: TabPage): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInTableCellUnderWidget")
  @js.native
  def createInTableCellUnderWidget(container: TableCell): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInTableCellUnderWidgets")
  @js.native
  def createInTableCellUnderWidgets(container: TableCell): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInTemplateGridContentsUnderWidget")
  @js.native
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInTemplateGridContentsUnderWidgets")
  @js.native
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInVerticalFlowUnderWidgets")
  @js.native
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInWebLayoutContentUnderWidgets")
  @js.native
  def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): LoginIdTextBox = js.native
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.createInWidgetValueUnderWidgets")
  @js.native
  def createInWidgetValueUnderWidgets(container: WidgetValue): LoginIdTextBox = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginIdTextBox.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
