package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationProfile
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menus {
  
  /**
    * See: {@link https://docs.mendix.com/refguide/menu relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "menus.MenuDocument")
  @js.native
  open class MenuDocument protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.menus.MenuDocument {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object MenuDocument {
    
    @JSImport("mendixmodelsdk", "menus.MenuDocument")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new MenuDocument unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IFolderBase): typings.mendixmodelsdk.srcGenMenusMod.menus.MenuDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMenusMod.menus.MenuDocument]
    
    /* static member */
    @JSImport("mendixmodelsdk", "menus.MenuDocument.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "menus.MenuDocument.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenMenusMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenMenusMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/menu relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "menus.MenuItem")
  @js.native
  open class MenuItem protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.menus.MenuItem {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MenuItem {
    
    @JSImport("mendixmodelsdk", "menus.MenuItem")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new MenuItem instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenMenusMod.menus.MenuItem = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMenusMod.menus.MenuItem]
    
    /**
      * Creates and returns a new MenuItem instance in the SDK and on the server.
      * The new MenuItem will be automatically stored in the 'items' property
      * of the parent MenuItemContainer element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenMenusMod.menus.MenuItemContainer): typings.mendixmodelsdk.srcGenMenusMod.menus.MenuItem = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMenusMod.menus.MenuItem]
    
    /* static member */
    @JSImport("mendixmodelsdk", "menus.MenuItem.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "menus.MenuItem.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenMenusMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenMenusMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "menus.MenuItemCollection")
  @js.native
  open class MenuItemCollection protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.menus.MenuItemCollection {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MenuItemCollection {
    
    @JSImport("mendixmodelsdk", "menus.MenuItemCollection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new MenuItemCollection instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenMenusMod.menus.MenuItemCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMenusMod.menus.MenuItemCollection]
    
    /**
      * Creates and returns a new MenuItemCollection instance in the SDK and on the server.
      * The new MenuItemCollection will be automatically stored in the 'itemCollection' property
      * of the parent MenuDocument element passed as argument.
      */
    /* static member */
    inline def createInMenuDocumentUnderItemCollection(container: typings.mendixmodelsdk.srcGenMenusMod.menus.MenuDocument): typings.mendixmodelsdk.srcGenMenusMod.menus.MenuItemCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMenuDocumentUnderItemCollection")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMenusMod.menus.MenuItemCollection]
    
    /**
      * Creates and returns a new MenuItemCollection instance in the SDK and on the server.
      * The new MenuItemCollection will be automatically stored in the 'menuItemCollection' property
      * of the parent navigation.NavigationProfile element passed as argument.
      */
    /* static member */
    inline def createInNavigationProfileUnderMenuItemCollection(container: NavigationProfile): typings.mendixmodelsdk.srcGenMenusMod.menus.MenuItemCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationProfileUnderMenuItemCollection")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMenusMod.menus.MenuItemCollection]
    
    /* static member */
    @JSImport("mendixmodelsdk", "menus.MenuItemCollection.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "menus.MenuItemCollection.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenMenusMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenMenusMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /* note: abstract class */ @JSImport("mendixmodelsdk", "menus.MenuItemContainer")
  @js.native
  open class MenuItemContainer protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.menus.MenuItemContainer {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MenuItemContainer {
    
    @JSImport("mendixmodelsdk", "menus.MenuItemContainer")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "menus.MenuItemContainer.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "menus.MenuItemContainer.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenMenusMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenMenusMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
