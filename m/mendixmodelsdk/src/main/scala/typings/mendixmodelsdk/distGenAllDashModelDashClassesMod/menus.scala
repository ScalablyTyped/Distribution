package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenNavigationMod.navigation.NavigationProfile
import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "menus")
@js.native
object menus extends js.Object {
  /**
    * See: {@link https://docs.mendix.com/refguide7/menu relevant section in reference guide}
    */
  @js.native
  class MenuDocument protected ()
    extends typings.mendixmodelsdk.distGenMenusMod.menus.MenuDocument {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/menu-item relevant section in reference guide}
    */
  @js.native
  class MenuItem protected ()
    extends typings.mendixmodelsdk.distGenMenusMod.menus.MenuItem {
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
  class MenuItemCollection protected ()
    extends typings.mendixmodelsdk.distGenMenusMod.menus.MenuItemCollection {
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
  abstract class MenuItemContainer protected ()
    extends typings.mendixmodelsdk.distGenMenusMod.menus.MenuItemContainer {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /* static members */
  @js.native
  object MenuDocument extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenMenusMod.StructureVersionInfo = js.native
    /**
      * Creates a new MenuDocument unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typings.mendixmodelsdk.distGenMenusMod.menus.MenuDocument = js.native
  }
  
  /* static members */
  @js.native
  object MenuItem extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenMenusMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MenuItem instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenMenusMod.menus.MenuItem = js.native
    /**
      * Creates and returns a new MenuItem instance in the SDK and on the server.
      * The new MenuItem will be automatically stored in the 'items' property
      * of the parent MenuItemContainer element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenMenusMod.menus.MenuItemContainer): typings.mendixmodelsdk.distGenMenusMod.menus.MenuItem = js.native
  }
  
  /* static members */
  @js.native
  object MenuItemCollection extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenMenusMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MenuItemCollection instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenMenusMod.menus.MenuItemCollection = js.native
    /**
      * Creates and returns a new MenuItemCollection instance in the SDK and on the server.
      * The new MenuItemCollection will be automatically stored in the 'itemCollection' property
      * of the parent MenuDocument element passed as argument.
      */
    def createInMenuDocumentUnderItemCollection(container: typings.mendixmodelsdk.distGenMenusMod.menus.MenuDocument): typings.mendixmodelsdk.distGenMenusMod.menus.MenuItemCollection = js.native
    /**
      * Creates and returns a new MenuItemCollection instance in the SDK and on the server.
      * The new MenuItemCollection will be automatically stored in the 'menuItemCollection' property
      * of the parent navigation.NavigationProfile element passed as argument.
      */
    def createInNavigationProfileUnderMenuItemCollection(container: NavigationProfile): typings.mendixmodelsdk.distGenMenusMod.menus.MenuItemCollection = js.native
  }
  
  /* static members */
  @js.native
  object MenuItemContainer extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenMenusMod.StructureVersionInfo = js.native
  }
  
}

