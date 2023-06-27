package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiMdcEnumsTableRowCountModeMod.TableRowCountMode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcTableGridTableTypeMod {
  
  @JSImport("sap/ui/mdc/table/GridTableType", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `GridTableType`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends GridTableType {
    def this(/**
      * Initial settings for the new object
      */
    mSettings: GridTableTypeSettings) = this()
    def this(/**
      * Optional ID for the new object; generated automatically if no non-empty ID is given
      */
    sId: String) = this()
    def this(
      /**
      * Optional ID for the new object; generated automatically if no non-empty ID is given
      */
    sId: String,
      /**
      * Initial settings for the new object
      */
    mSettings: GridTableTypeSettings
    ) = this()
    def this(
      /**
      * Optional ID for the new object; generated automatically if no non-empty ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new object
      */
    mSettings: GridTableTypeSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/table/GridTableType", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.table.GridTableType with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.mdc.table.TableTypeBase.extend}.
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
    oClassInfo: ClassInfo[T, GridTableType]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, GridTableType],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.table.GridTableType.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait GridTableType
    extends typings.openui5.sapUiMdcTableTableTypeBaseMod.default {
    
    /**
      * Gets current value of property {@link #getFixedColumnCount fixedColumnCount}.
      *
      * Defines the number of fixed columns in the inner table.
      *
      * Default value is `0`.
      *
      * @returns Value of property `fixedColumnCount`
      */
    def getFixedColumnCount(): int = js.native
    
    /**
      * Gets current value of property {@link #getRowCount rowCount}.
      *
      * Row count of the inner table.
      *  This property specifies the minimum row count if `sap.ui.mdc.enums.TableRowCountMode.Auto` is used.
      *  This property specifies the row count if `sap.ui.mdc.enums.TableRowCountMode.Fixed` is used.
      *
      * Default value is `10`.
      *
      * @returns Value of property `rowCount`
      */
    def getRowCount(): int = js.native
    
    /**
      * Gets current value of property {@link #getRowCountMode rowCountMode}.
      *
      * Defines how the table handles the row count.
      *
      * Default value is `Auto`.
      *
      * @returns Value of property `rowCountMode`
      */
    def getRowCountMode(): TableRowCountMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableRowCountMode * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getSelectionLimit selectionLimit}.
      *
      * Number of indices which can be selected in a range. Accepts positive integer values. If set to 0, the
      * selection limit is disabled, and the Select All checkbox appears instead of the Deselect All button.
      *
      * **Note:** To avoid severe performance problems, the limit should only be set to 0 in the following cases:
      *
      * 	 - With client-side models
      * 	 - With server-side models if they are used in client mode
      * 	 - If the entity set is small
      *
      * In other cases, we recommend to set the limit to at least double the value of the {@link sap.ui.mdc.Table#getThreshold threshold }
      * property of the table.
      *
      * Default value is `200`.
      *
      * @returns Value of property `selectionLimit`
      */
    def getSelectionLimit(): int = js.native
    
    /**
      * Gets current value of property {@link #getShowHeaderSelector showHeaderSelector}.
      *
      * Determines whether the header selector is shown.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showHeaderSelector`
      */
    def getShowHeaderSelector(): Boolean = js.native
    
    /**
      * Sets a new value for property {@link #getFixedColumnCount fixedColumnCount}.
      *
      * Defines the number of fixed columns in the inner table.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFixedColumnCount(): this.type = js.native
    def setFixedColumnCount(/**
      * New value for property `fixedColumnCount`
      */
    iFixedColumnCount: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getRowCount rowCount}.
      *
      * Row count of the inner table.
      *  This property specifies the minimum row count if `sap.ui.mdc.enums.TableRowCountMode.Auto` is used.
      *  This property specifies the row count if `sap.ui.mdc.enums.TableRowCountMode.Fixed` is used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `10`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRowCount(): this.type = js.native
    def setRowCount(/**
      * New value for property `rowCount`
      */
    iRowCount: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getRowCountMode rowCountMode}.
      *
      * Defines how the table handles the row count.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Auto`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRowCountMode(): this.type = js.native
    def setRowCountMode(
      /**
      * New value for property `rowCountMode`
      */
    sRowCountMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableRowCountMode * / any */ String
    ): this.type = js.native
    def setRowCountMode(/**
      * New value for property `rowCountMode`
      */
    sRowCountMode: TableRowCountMode): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSelectionLimit selectionLimit}.
      *
      * Number of indices which can be selected in a range. Accepts positive integer values. If set to 0, the
      * selection limit is disabled, and the Select All checkbox appears instead of the Deselect All button.
      *
      * **Note:** To avoid severe performance problems, the limit should only be set to 0 in the following cases:
      *
      * 	 - With client-side models
      * 	 - With server-side models if they are used in client mode
      * 	 - If the entity set is small
      *
      * In other cases, we recommend to set the limit to at least double the value of the {@link sap.ui.mdc.Table#getThreshold threshold }
      * property of the table.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `200`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSelectionLimit(): this.type = js.native
    def setSelectionLimit(/**
      * New value for property `selectionLimit`
      */
    iSelectionLimit: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowHeaderSelector showHeaderSelector}.
      *
      * Determines whether the header selector is shown.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowHeaderSelector(): this.type = js.native
    def setShowHeaderSelector(/**
      * New value for property `showHeaderSelector`
      */
    bShowHeaderSelector: Boolean): this.type = js.native
  }
  
  trait GridTableTypeSettings
    extends StObject
       with ElementSettings {
    
    /**
      * Defines the number of fixed columns in the inner table.
      */
    var fixedColumnCount: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Row count of the inner table.
      *  This property specifies the minimum row count if `sap.ui.mdc.enums.TableRowCountMode.Auto` is used.
      *  This property specifies the row count if `sap.ui.mdc.enums.TableRowCountMode.Fixed` is used.
      */
    var rowCount: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Defines how the table handles the row count.
      */
    var rowCountMode: js.UndefOr[
        TableRowCountMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableRowCountMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Number of indices which can be selected in a range. Accepts positive integer values. If set to 0, the
      * selection limit is disabled, and the Select All checkbox appears instead of the Deselect All button.
      *
      * **Note:** To avoid severe performance problems, the limit should only be set to 0 in the following cases:
      *
      * 	 - With client-side models
      * 	 - With server-side models if they are used in client mode
      * 	 - If the entity set is small
      *
      * In other cases, we recommend to set the limit to at least double the value of the {@link sap.ui.mdc.Table#getThreshold threshold }
      * property of the table.
      */
    var selectionLimit: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Determines whether the header selector is shown.
      */
    var showHeaderSelector: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object GridTableTypeSettings {
    
    inline def apply(): GridTableTypeSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridTableTypeSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridTableTypeSettings] (val x: Self) extends AnyVal {
      
      inline def setFixedColumnCount(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "fixedColumnCount", value.asInstanceOf[js.Any])
      
      inline def setFixedColumnCountUndefined: Self = StObject.set(x, "fixedColumnCount", js.undefined)
      
      inline def setRowCount(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
      
      inline def setRowCountMode(
        value: TableRowCountMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableRowCountMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "rowCountMode", value.asInstanceOf[js.Any])
      
      inline def setRowCountModeUndefined: Self = StObject.set(x, "rowCountMode", js.undefined)
      
      inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
      
      inline def setSelectionLimit(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "selectionLimit", value.asInstanceOf[js.Any])
      
      inline def setSelectionLimitUndefined: Self = StObject.set(x, "selectionLimit", js.undefined)
      
      inline def setShowHeaderSelector(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showHeaderSelector", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderSelectorUndefined: Self = StObject.set(x, "showHeaderSelector", js.undefined)
    }
  }
}
