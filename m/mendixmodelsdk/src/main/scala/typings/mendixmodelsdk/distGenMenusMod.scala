package typings.mendixmodelsdk

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMenusMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenMenusMod.menus.MenuDocument
import typings.mendixmodelsdk.distGenMenusMod.menus.MenuItem
import typings.mendixmodelsdk.distGenMenusMod.menus.MenuItemCollection
import typings.mendixmodelsdk.distGenMenusMod.menus.MenuItemContainer
import typings.mendixmodelsdk.distGenNavigationMod.navigation.NavigationProfile
import typings.mendixmodelsdk.distGenPagesMod.pages.ClientAction
import typings.mendixmodelsdk.distGenPagesMod.pages.Icon
import typings.mendixmodelsdk.distGenProjectsMod.projects.Document
import typings.mendixmodelsdk.distGenProjectsMod.projects.IDocument
import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.distGenTextsMod.texts.Text
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.distSdkInternalVersionDashChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalVersionDashChecksMod.StructureType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/menus", JSImport.Namespace)
@js.native
object distGenMenusMod extends js.Object {
  @js.native
  class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.distSdkInternalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  @js.native
  object menus extends js.Object {
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
    - typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.distGenProjectsMod.projects.IModuleDocument because Already inherited
    - typings.mendixmodelsdk.distGenProjectsMod.projects.IDocument because Already inherited
    - typings.mendixmodelsdk.distGenMenusMod.menus.IMenuDocument because var conflicts: id, isLoaded, model, name, structureTypeName, unit. Inlined  */ @js.native
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
  
}

