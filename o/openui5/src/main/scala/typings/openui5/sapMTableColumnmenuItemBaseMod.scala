package typings.openui5

import typings.openui5.jQuery.Event
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMTableColumnmenuEntryMod.EntrySettings
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMTableColumnmenuItemBaseMod {
  
  @JSImport("sap/m/table/columnmenu/ItemBase", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `ItemBase`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    *
    * This class does not have its own settings, but all settings applicable to the base type {@link sap.m.table.columnmenu.Entry#constructor sap.m.table.columnmenu.Entry }
    * can be used.
    */
  open class default () extends ItemBase {
    def this(/**
      * Initial settings for the new `ItemBase`
      */
    mSettings: ItemBaseSettings) = this()
    def this(/**
      * ID for the new `ItemBase`, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new `ItemBase`, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new `ItemBase`
      */
    mSettings: ItemBaseSettings
    ) = this()
    def this(
      /**
      * ID for the new `ItemBase`, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new `ItemBase`
      */
    mSettings: ItemBaseSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/table/columnmenu/ItemBase", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.table.columnmenu.ItemBase with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.table.columnmenu.Entry.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ItemBase]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ItemBase],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.table.columnmenu.ItemBase.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ItemBase
    extends typings.openui5.sapMTableColumnmenuEntryMod.default {
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Changes the button settings of an item.
      */
    def changeButtonSettings(/**
      * Object containing button settings
      */
    oButtonSettings: js.Object): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Retrieves the button settings.
      *
      * @returns The button settings
      */
    def getButtonSettings(): js.Object = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Retrieves the effective items of the item.
      *
      * This method allows subclasses to return composition of other items, if they contain multiple items or
      * controls.
      *
      * @returns A composition of effective items
      */
    def getEffectiveItems(): js.Array[ItemBase] = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Retrieves the icon specified for an item.
      *
      * @returns The specified icon
      */
    def getIcon(): URI = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Event handler for a back event.
      */
    def onBack(/**
      * The event
      */
    oEvent: Event): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Event handler for a cancel event.
      */
    def onCancel(/**
      * The event
      */
    oEvent: Event): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Event handler for a confirm event.
      */
    def onConfirm(/**
      * The event
      */
    oEvent: Event): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Event handler for a press event.
      */
    def onPress(/**
      * The event
      */
    oEvent: Event): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Event handler for a reset event.
      */
    def onReset(/**
      * The event
      */
    oEvent: Event): Unit = js.native
  }
  
  type ItemBaseSettings = EntrySettings
}
