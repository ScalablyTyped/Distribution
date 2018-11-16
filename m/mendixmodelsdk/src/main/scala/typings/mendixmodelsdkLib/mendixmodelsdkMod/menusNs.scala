package typings
package mendixmodelsdkLib.mendixmodelsdkMod

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
    extends mendixmodelsdkLib.distGenAllDashModelDashClassesMod.menusNs.MenuDocument {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/menu-item relevant section in reference guide}
       */
  @js.native
  class MenuItem protected ()
    extends mendixmodelsdkLib.distGenAllDashModelDashClassesMod.menusNs.MenuItem {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  @js.native
  class MenuItemCollection protected ()
    extends mendixmodelsdkLib.distGenAllDashModelDashClassesMod.menusNs.MenuItemCollection {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  @js.native
  abstract class MenuItemContainer protected ()
    extends mendixmodelsdkLib.distGenAllDashModelDashClassesMod.menusNs.MenuItemContainer {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/menu relevant section in reference guide}
       */
  @js.native
  object MenuDocument extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMenusMod.StructureVersionInfo = js.native
    /**
             * Creates a new MenuDocument unit in the SDK and on the server.
             * Expects one argument, the projects.IFolderBase in which this unit is contained.
             */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase): mendixmodelsdkLib.distGenMenusMod.menusNs.MenuDocument = js.native
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/menu-item relevant section in reference guide}
       */
  @js.native
  object MenuItem extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMenusMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new MenuItem instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMenusMod.menusNs.MenuItem = js.native
    /**
             * Creates and returns a new MenuItem instance in the SDK and on the server.
             * The new MenuItem will be automatically stored in the 'items' property
             * of the parent MenuItemContainer element passed as argument.
             */
    def createIn(container: mendixmodelsdkLib.distGenMenusMod.menusNs.MenuItemContainer): mendixmodelsdkLib.distGenMenusMod.menusNs.MenuItem = js.native
  }
  
  @js.native
  object MenuItemCollection extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMenusMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new MenuItemCollection instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMenusMod.menusNs.MenuItemCollection = js.native
    /**
             * Creates and returns a new MenuItemCollection instance in the SDK and on the server.
             * The new MenuItemCollection will be automatically stored in the 'itemCollection' property
             * of the parent MenuDocument element passed as argument.
             */
    def createInMenuDocumentUnderItemCollection(container: mendixmodelsdkLib.distGenMenusMod.menusNs.MenuDocument): mendixmodelsdkLib.distGenMenusMod.menusNs.MenuItemCollection = js.native
    /**
             * Creates and returns a new MenuItemCollection instance in the SDK and on the server.
             * The new MenuItemCollection will be automatically stored in the 'menuItemCollection' property
             * of the parent navigation.NavigationProfile element passed as argument.
             */
    def createInNavigationProfileUnderMenuItemCollection(container: mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationProfile): mendixmodelsdkLib.distGenMenusMod.menusNs.MenuItemCollection = js.native
  }
  
  @js.native
  object MenuItemContainer extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMenusMod.StructureVersionInfo = js.native
  }
  
}

