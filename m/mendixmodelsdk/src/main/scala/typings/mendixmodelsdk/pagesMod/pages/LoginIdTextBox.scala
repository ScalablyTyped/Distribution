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
  @scala.inline
  def create(model: IModel): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInBuildingBlockUnderWidget(container: BuildingBlock): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInDataViewUnderFooterWidget(container: DataView): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInDataViewUnderFooterWidgets(container: DataView): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInDataViewUnderWidget(container: DataView): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInDataViewUnderWidgets(container: DataView): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInDivContainerUnderWidget(container: DivContainer): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInDivContainerUnderWidgets(container: DivContainer): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInGroupBoxUnderWidget(container: GroupBox): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInGroupBoxUnderWidgets(container: GroupBox): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInHeaderUnderLeftWidget(container: Header): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInHeaderUnderLeftWidgets(container: Header): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInHeaderUnderRightWidget(container: Header): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInHeaderUnderRightWidgets(container: Header): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInLayoutUnderWidget(container: Layout): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @scala.inline
  def createInLayoutUnderWidgets(container: Layout): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInListViewUnderWidget(container: ListView): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInListViewUnderWidgets(container: ListView): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMasterDetailRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  /* static member */
  @scala.inline
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  /* static member */
  @scala.inline
  def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderSidebarWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @scala.inline
  def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  /* static member */
  @scala.inline
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderHeaderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  /* static member */
  @scala.inline
  def createInNativeLayoutUnderWidgets(container: NativeLayout): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInNavigationListItemUnderWidget(container: NavigationListItem): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInSnippetUnderWidget(container: Snippet): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInSnippetUnderWidgets(container: Snippet): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInSplitPaneUnderFirstWidget(container: SplitPane): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @scala.inline
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInSplitPaneUnderSecondWidget(container: SplitPane): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @scala.inline
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInTabPageUnderWidget(container: TabPage): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInTabPageUnderWidgets(container: TabPage): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInTableCellUnderWidget(container: TableCell): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInTableCellUnderWidgets(container: TableCell): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @scala.inline
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInVerticalFlowUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @scala.inline
  def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
  /**
    * Creates and returns a new LoginIdTextBox instance in the SDK and on the server.
    * The new LoginIdTextBox will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  /* static member */
  @scala.inline
  def createInWidgetValueUnderWidgets(container: WidgetValue): LoginIdTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[LoginIdTextBox]
  
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
