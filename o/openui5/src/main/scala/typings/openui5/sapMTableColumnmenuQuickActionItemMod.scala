package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMTableColumnmenuEntryMod.EntrySettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMTableColumnmenuQuickActionItemMod {
  
  @JSImport("sap/m/table/columnmenu/QuickActionItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `>QuickActionItem`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends QuickActionItem {
    def this(/**
      * Initial settings for the new `QuickActionItem`
      */
    mSettings: QuickActionItemSettings) = this()
    def this(/**
      * ID for the new `QuickActionItem`, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new `QuickActionItem`, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new `QuickActionItem`
      */
    mSettings: QuickActionItemSettings
    ) = this()
    def this(
      /**
      * ID for the new `QuickActionItem`, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new `QuickActionItem`
      */
    mSettings: QuickActionItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/table/columnmenu/QuickActionItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.table.columnmenu.QuickActionItem with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, QuickActionItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, QuickActionItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.table.columnmenu.QuickActionItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait QuickActionItem
    extends typings.openui5.sapMTableColumnmenuEntryMod.default {
    
    /**
      * Gets current value of property {@link #getKey key}.
      *
      * The property name
      *
      * @returns Value of property `key`
      */
    def getKey(): String = js.native
    
    /**
      * Gets current value of property {@link #getLabel label}.
      *
      * Defines the text for the label.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `label`
      */
    def getLabel(): String = js.native
    
    /**
      * Sets a new value for property {@link #getKey key}.
      *
      * The property name
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setKey(/**
      * New value for property `key`
      */
    sKey: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLabel label}.
      *
      * Defines the text for the label.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLabel(): this.type = js.native
    def setLabel(/**
      * New value for property `label`
      */
    sLabel: String): this.type = js.native
  }
  
  trait QuickActionItemSettings
    extends StObject
       with EntrySettings {
    
    /**
      * The property name
      */
    var key: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the text for the label.
      */
    var label: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object QuickActionItemSettings {
    
    inline def apply(): QuickActionItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuickActionItemSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuickActionItemSettings] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String | PropertyBindingInfo): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLabel(value: String | PropertyBindingInfo): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
}
