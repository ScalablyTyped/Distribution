package typings.mendixmodelsdk.mendixmodelsdkMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenNavigationMod.navigationNs.NavigationProfile
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "menus")
@js.native
object menusNs extends js.Object {
  /**
    * See: {@link https://docs.mendix.com/refguide7/menu relevant section in reference guide}
    */
  @js.native
  class MenuDocument protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.menusNs.MenuDocument {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
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
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.menusNs.MenuItem {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class MenuItemCollection protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.menusNs.MenuItemCollection {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  abstract class MenuItemContainer protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.menusNs.MenuItemContainer {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
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
    def createIn(container: IFolderBase): typings.mendixmodelsdk.distGenMenusMod.menusNs.MenuDocument = js.native
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
    def create(model: IModel): typings.mendixmodelsdk.distGenMenusMod.menusNs.MenuItem = js.native
    /**
      * Creates and returns a new MenuItem instance in the SDK and on the server.
      * The new MenuItem will be automatically stored in the 'items' property
      * of the parent MenuItemContainer element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenMenusMod.menusNs.MenuItemContainer): typings.mendixmodelsdk.distGenMenusMod.menusNs.MenuItem = js.native
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
    def create(model: IModel): typings.mendixmodelsdk.distGenMenusMod.menusNs.MenuItemCollection = js.native
    /**
      * Creates and returns a new MenuItemCollection instance in the SDK and on the server.
      * The new MenuItemCollection will be automatically stored in the 'itemCollection' property
      * of the parent MenuDocument element passed as argument.
      */
    def createInMenuDocumentUnderItemCollection(container: typings.mendixmodelsdk.distGenMenusMod.menusNs.MenuDocument): typings.mendixmodelsdk.distGenMenusMod.menusNs.MenuItemCollection = js.native
    /**
      * Creates and returns a new MenuItemCollection instance in the SDK and on the server.
      * The new MenuItemCollection will be automatically stored in the 'menuItemCollection' property
      * of the parent navigation.NavigationProfile element passed as argument.
      */
    def createInNavigationProfileUnderMenuItemCollection(container: NavigationProfile): typings.mendixmodelsdk.distGenMenusMod.menusNs.MenuItemCollection = js.native
  }
  
  /* static members */
  @js.native
  object MenuItemContainer extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenMenusMod.StructureVersionInfo = js.native
  }
  
}

