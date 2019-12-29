package typings.mendixmodelsdk

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenNavigationMod.navigation.NavigationProfile
import typings.mendixmodelsdk.distGenPagesMod.pages.ClientAction
import typings.mendixmodelsdk.distGenPagesMod.pages.Icon
import typings.mendixmodelsdk.distGenProjectsMod.projects.Document
import typings.mendixmodelsdk.distGenProjectsMod.projects.FolderBase
import typings.mendixmodelsdk.distGenProjectsMod.projects.IDocument
import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.distGenTextsMod.texts.Text
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.distSdkInternalVersionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalVersionChecksMod.StructureType
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
    - typings.mendixmodelsdk.distGenMenusMod.menus.IMenuDocument because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @js.native
    class MenuDocument protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      @JSName("model")
      var model_FMenuDocument: IModel = js.native
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MMenuDocument(): FolderBase = js.native
      def itemCollection(): MenuItemCollection = js.native
      def itemCollection(newValue: MenuItemCollection): js.Any = js.native
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
      @JSName("model")
      var model_FMenuItem: IModel = js.native
      def action(): ClientAction = js.native
      def action(newValue: ClientAction): js.Any = js.native
      def caption(): Text = js.native
      def caption(newValue: Text): js.Any = js.native
      def icon(): Icon | Null = js.native
      def icon(newValue: Icon): js.Any = js.native
      @JSName("icon")
      def icon_Any(): js.Any = js.native
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
      @JSName("model")
      var model_FMenuItemCollection: IModel = js.native
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
      @JSName("model")
      var model_FMenuItemContainer: IModel = js.native
      def containerAsMenuDocument(): MenuDocument = js.native
      def containerAsMenuItemContainer(): MenuItemContainer = js.native
      def containerAsNavigationProfile(): NavigationProfile = js.native
      def items(): IList[MenuItem] = js.native
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

