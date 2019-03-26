package typings
package mendixmodelsdkLib.distGenMenusMod

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
  trait IMenuDocument
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.IDocument
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/menu relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenMenusMod.menusNs.IMenuDocument because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class MenuDocument protected ()
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.Document {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
    var itemCollection: MenuItemCollection = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/menu-item relevant section in reference guide}
    */
  @js.native
  class MenuItem protected () extends MenuItemContainer {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var action: mendixmodelsdkLib.distGenPagesMod.pagesNs.ClientAction = js.native
    var caption: mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    var icon: mendixmodelsdkLib.distGenPagesMod.pagesNs.Icon | scala.Null = js.native
  }
  
  @js.native
  class MenuItemCollection protected () extends MenuItemContainer {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  @js.native
  abstract class MenuItemContainer protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsMenuDocument: MenuDocument = js.native
    val containerAsMenuItemContainer: MenuItemContainer = js.native
    val containerAsNavigationProfile: mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationProfile = js.native
    val items: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[MenuItem] = js.native
    @JSName("model")
    var model_MenuItemContainer: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /* static members */
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
  
  /* static members */
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
  
  /* static members */
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
  
  /* static members */
  @js.native
  object MenuItemContainer extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMenusMod.StructureVersionInfo = js.native
  }
  
}

