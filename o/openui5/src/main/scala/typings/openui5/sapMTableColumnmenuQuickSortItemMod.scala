package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMTableColumnmenuQuickActionItemMod.QuickActionItemSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.SortOrder
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMTableColumnmenuQuickSortItemMod {
  
  @JSImport("sap/m/table/columnmenu/QuickSortItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `QuickSortItem`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends QuickSortItem {
    def this(/**
      * Initial settings for the new `QuickSortItem`
      */
    mSettings: QuickSortItemSettings) = this()
    def this(/**
      * ID for the new `QuickSortItem`, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new `QuickSortItem`, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new `QuickSortItem`
      */
    mSettings: QuickSortItemSettings
    ) = this()
    def this(
      /**
      * ID for the new `QuickSortItem`, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new `QuickSortItem`
      */
    mSettings: QuickSortItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/table/columnmenu/QuickSortItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.table.columnmenu.QuickSortItem with name `sClassName` and enriches
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
    oClassInfo: ClassInfo[T, QuickSortItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, QuickSortItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.table.columnmenu.QuickSortItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait QuickSortItem
    extends typings.openui5.sapMTableColumnmenuQuickActionItemMod.default {
    
    /**
      * Gets current value of property {@link #getSortOrder sortOrder}.
      *
      * Specifies the sort order that is applied for the respective column.
      *
      * Default value is `None`.
      *
      * @returns Value of property `sortOrder`
      */
    def getSortOrder(): SortOrder | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SortOrder * / any */ String) = js.native
    
    /**
      * Sets a new value for property {@link #getSortOrder sortOrder}.
      *
      * Specifies the sort order that is applied for the respective column.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSortOrder(): this.type = js.native
    def setSortOrder(
      /**
      * New value for property `sortOrder`
      */
    sSortOrder: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SortOrder * / any */ String
    ): this.type = js.native
    def setSortOrder(/**
      * New value for property `sortOrder`
      */
    sSortOrder: SortOrder): this.type = js.native
  }
  
  trait QuickSortItemSettings
    extends StObject
       with QuickActionItemSettings {
    
    /**
      * Specifies the sort order that is applied for the respective column.
      */
    var sortOrder: js.UndefOr[
        SortOrder | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SortOrder * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object QuickSortItemSettings {
    
    inline def apply(): QuickSortItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuickSortItemSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuickSortItemSettings] (val x: Self) extends AnyVal {
      
      inline def setSortOrder(
        value: SortOrder | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SortOrder * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    }
  }
}
