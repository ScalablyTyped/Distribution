package typings.mendixmodelsdk.mod.pages

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
  * See: {@link https://docs.mendix.com/refguide/sign-in-button relevant section in reference guide}
  *
  * In version 7.0.2: introduced
  */
@JSImport("mendixmodelsdk", "pages.LoginButton")
@js.native
class LoginButton protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.pages.LoginButton {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object LoginButton {
  
  @JSImport("mendixmodelsdk", "pages.LoginButton")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.create")
  @js.native
  def create(model: IModel): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInBuildingBlockUnderWidget")
  @js.native
  def createInBuildingBlockUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.BuildingBlock): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInBuildingBlockUnderWidgets")
  @js.native
  def createInBuildingBlockUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.BuildingBlock): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInDataViewUnderFooterWidget")
  @js.native
  def createInDataViewUnderFooterWidget(container: typings.mendixmodelsdk.pagesMod.pages.DataView): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInDataViewUnderFooterWidgets")
  @js.native
  def createInDataViewUnderFooterWidgets(container: typings.mendixmodelsdk.pagesMod.pages.DataView): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInDataViewUnderWidget")
  @js.native
  def createInDataViewUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.DataView): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInDataViewUnderWidgets")
  @js.native
  def createInDataViewUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.DataView): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInDivContainerUnderWidget")
  @js.native
  def createInDivContainerUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.DivContainer): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInDivContainerUnderWidgets")
  @js.native
  def createInDivContainerUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.DivContainer): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInGroupBoxUnderWidget")
  @js.native
  def createInGroupBoxUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.GroupBox): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInGroupBoxUnderWidgets")
  @js.native
  def createInGroupBoxUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.GroupBox): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInHeaderUnderLeftWidget")
  @js.native
  def createInHeaderUnderLeftWidget(container: typings.mendixmodelsdk.pagesMod.pages.Header): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInHeaderUnderLeftWidgets")
  @js.native
  def createInHeaderUnderLeftWidgets(container: typings.mendixmodelsdk.pagesMod.pages.Header): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInHeaderUnderRightWidget")
  @js.native
  def createInHeaderUnderRightWidget(container: typings.mendixmodelsdk.pagesMod.pages.Header): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInHeaderUnderRightWidgets")
  @js.native
  def createInHeaderUnderRightWidgets(container: typings.mendixmodelsdk.pagesMod.pages.Header): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInLayoutCallArgumentUnderWidget")
  @js.native
  def createInLayoutCallArgumentUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.LayoutCallArgument): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInLayoutCallArgumentUnderWidgets")
  @js.native
  def createInLayoutCallArgumentUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.LayoutCallArgument): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInLayoutGridColumnUnderWidget")
  @js.native
  def createInLayoutGridColumnUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.LayoutGridColumn): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInLayoutGridColumnUnderWidgets")
  @js.native
  def createInLayoutGridColumnUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.LayoutGridColumn): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInLayoutUnderWidget")
  @js.native
  def createInLayoutUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.Layout): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInLayoutUnderWidgets")
  @js.native
  def createInLayoutUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.Layout): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInListViewTemplateUnderWidget")
  @js.native
  def createInListViewTemplateUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.ListViewTemplate): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInListViewTemplateUnderWidgets")
  @js.native
  def createInListViewTemplateUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.ListViewTemplate): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInListViewUnderWidget")
  @js.native
  def createInListViewUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.ListView): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInListViewUnderWidgets")
  @js.native
  def createInListViewUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.ListView): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInMasterDetailRegionUnderWidget")
  @js.native
  def createInMasterDetailRegionUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.MasterDetailRegion): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInNativeLayoutCallArgumentUnderWidgets")
  @js.native
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInNativeLayoutContentUnderSidebarWidgets")
  @js.native
  def createInNativeLayoutContentUnderSidebarWidgets(container: typings.mendixmodelsdk.pagesMod.pages.NativeLayoutContent): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInNativeLayoutContentUnderWidgets")
  @js.native
  def createInNativeLayoutContentUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.NativeLayoutContent): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInNativeLayoutUnderHeaderWidget")
  @js.native
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInNativeLayoutUnderWidgets")
  @js.native
  def createInNativeLayoutUnderWidgets(container: NativeLayout): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInNavigationListItemUnderWidget")
  @js.native
  def createInNavigationListItemUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.NavigationListItem): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInNavigationListItemUnderWidgets")
  @js.native
  def createInNavigationListItemUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.NavigationListItem): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInScrollContainerRegionUnderWidget")
  @js.native
  def createInScrollContainerRegionUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInScrollContainerRegionUnderWidgets")
  @js.native
  def createInScrollContainerRegionUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInSnippetUnderWidget")
  @js.native
  def createInSnippetUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.Snippet): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInSnippetUnderWidgets")
  @js.native
  def createInSnippetUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.Snippet): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInSplitPaneUnderFirstWidget")
  @js.native
  def createInSplitPaneUnderFirstWidget(container: typings.mendixmodelsdk.pagesMod.pages.SplitPane): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInSplitPaneUnderFirstWidgets")
  @js.native
  def createInSplitPaneUnderFirstWidgets(container: typings.mendixmodelsdk.pagesMod.pages.SplitPane): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInSplitPaneUnderSecondWidget")
  @js.native
  def createInSplitPaneUnderSecondWidget(container: typings.mendixmodelsdk.pagesMod.pages.SplitPane): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInSplitPaneUnderSecondWidgets")
  @js.native
  def createInSplitPaneUnderSecondWidgets(container: typings.mendixmodelsdk.pagesMod.pages.SplitPane): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInTabPageUnderWidget")
  @js.native
  def createInTabPageUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.TabPage): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInTabPageUnderWidgets")
  @js.native
  def createInTabPageUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.TabPage): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInTableCellUnderWidget")
  @js.native
  def createInTableCellUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.TableCell): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInTableCellUnderWidgets")
  @js.native
  def createInTableCellUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.TableCell): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInTemplateGridContentsUnderWidget")
  @js.native
  def createInTemplateGridContentsUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.TemplateGridContents): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInTemplateGridContentsUnderWidgets")
  @js.native
  def createInTemplateGridContentsUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.TemplateGridContents): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInVerticalFlowUnderWidgets")
  @js.native
  def createInVerticalFlowUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.VerticalFlow): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInWebLayoutContentUnderWidgets")
  @js.native
  def createInWebLayoutContentUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.WebLayoutContent): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /**
    * Creates and returns a new LoginButton instance in the SDK and on the server.
    * The new LoginButton will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.createInWidgetValueUnderWidgets")
  @js.native
  def createInWidgetValueUnderWidgets(container: WidgetValue): typings.mendixmodelsdk.pagesMod.pages.LoginButton = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LoginButton.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
