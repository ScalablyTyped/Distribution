package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMTableColumnmenuQuickActionItemMod.QuickActionItemSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMTableColumnmenuQuickGroupItemMod {
  
  @JSImport("sap/m/table/columnmenu/QuickGroupItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `QuickGroupItem`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends QuickGroupItem {
    def this(/**
      * Initial settings for the new `QuickGroupItem`
      */
    mSettings: QuickGroupItemSettings) = this()
    def this(/**
      * ID for the new `QuickGroupItem`, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new `QuickGroupItem`, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new `QuickGroupItem`
      */
    mSettings: QuickGroupItemSettings
    ) = this()
    def this(
      /**
      * ID for the new `QuickGroupItem`, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new `QuickGroupItem`
      */
    mSettings: QuickGroupItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/table/columnmenu/QuickGroupItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.table.columnmenu.QuickGroupItem with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.table.columnmenu.QuickActionItem.extend}.
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
    oClassInfo: ClassInfo[T, QuickGroupItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, QuickGroupItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.table.columnmenu.QuickGroupItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait QuickGroupItem
    extends typings.openui5.sapMTableColumnmenuQuickActionItemMod.default {
    
    /**
      * Gets current value of property {@link #getGrouped grouped}.
      *
      * Specifies whether the respective column is grouped.
      *
      * Default value is `false`.
      *
      * @returns Value of property `grouped`
      */
    def getGrouped(): Boolean = js.native
    
    /**
      * Sets a new value for property {@link #getGrouped grouped}.
      *
      * Specifies whether the respective column is grouped.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGrouped(): this.type = js.native
    def setGrouped(/**
      * New value for property `grouped`
      */
    bGrouped: Boolean): this.type = js.native
  }
  
  trait QuickGroupItemSettings
    extends StObject
       with QuickActionItemSettings {
    
    /**
      * Specifies whether the respective column is grouped.
      */
    var grouped: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object QuickGroupItemSettings {
    
    inline def apply(): QuickGroupItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuickGroupItemSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuickGroupItemSettings] (val x: Self) extends AnyVal {
      
      inline def setGrouped(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "grouped", value.asInstanceOf[js.Any])
      
      inline def setGroupedUndefined: Self = StObject.set(x, "grouped", js.undefined)
    }
  }
}
