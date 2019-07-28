package typings.mendixmodelsdk.distGenMenusMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMenusMod.menusNs.MenuDocument
import typings.mendixmodelsdk.distGenMenusMod.menusNs.MenuItem
import typings.mendixmodelsdk.distGenMenusMod.menusNs.MenuItemCollection
import typings.mendixmodelsdk.distGenMenusMod.menusNs.MenuItemContainer
import typings.mendixmodelsdk.distGenNavigationMod.navigationNs.NavigationProfile
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ClientAction
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.Icon
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.Document
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IDocument
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IFolderBase
import typings.mendixmodelsdk.distGenTextsMod.textsNs.Text
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/menus", "menus")
@js.native
object menusNs extends js.Object {
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Menus`.
    */
  /**
    * See: {@link https://docs.mendix.com/refguide7/menu relevant section in reference guide}
    */
  @js.native
  trait IMenuDocument extends IDocument
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/menu relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenMenusMod.menusNs.IMenuDocument because var conflicts: id, isLoaded, model, name, structureTypeName, unit. Inlined  */ @js.native
  class MenuDocument protected () extends Document {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    var itemCollection: MenuItemCollection = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/menu-item relevant section in reference guide}
    */
  @js.native
  class MenuItem protected () extends MenuItemContainer {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var action: ClientAction = js.native
    var caption: Text = js.native
    var icon: Icon | Null = js.native
  }
  
  @js.native
  class MenuItemCollection protected () extends MenuItemContainer {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  @js.native
  abstract class MenuItemContainer protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsMenuDocument: MenuDocument = js.native
    val containerAsMenuItemContainer: MenuItemContainer = js.native
    val containerAsNavigationProfile: NavigationProfile = js.native
    val items: IList[MenuItem] = js.native
    @JSName("model")
    var model_MenuItemContainer: IModel = js.native
  }
  
  /* static members */
  @js.native
  object MenuDocument extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates a new MenuDocument unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): MenuDocument = js.native
  }
  
  /* static members */
  @js.native
  object MenuItem extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new MenuItem instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): MenuItem = js.native
    /**
      * Creates and returns a new MenuItem instance in the SDK and on the server.
      * The new MenuItem will be automatically stored in the 'items' property
      * of the parent MenuItemContainer element passed as argument.
      */
    def createIn(container: MenuItemContainer): MenuItem = js.native
  }
  
  /* static members */
  @js.native
  object MenuItemCollection extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new MenuItemCollection instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): MenuItemCollection = js.native
    /**
      * Creates and returns a new MenuItemCollection instance in the SDK and on the server.
      * The new MenuItemCollection will be automatically stored in the 'itemCollection' property
      * of the parent MenuDocument element passed as argument.
      */
    def createInMenuDocumentUnderItemCollection(container: MenuDocument): MenuItemCollection = js.native
    /**
      * Creates and returns a new MenuItemCollection instance in the SDK and on the server.
      * The new MenuItemCollection will be automatically stored in the 'menuItemCollection' property
      * of the parent navigation.NavigationProfile element passed as argument.
      */
    def createInNavigationProfileUnderMenuItemCollection(container: NavigationProfile): MenuItemCollection = js.native
  }
  
  /* static members */
  @js.native
  object MenuItemContainer extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
}

