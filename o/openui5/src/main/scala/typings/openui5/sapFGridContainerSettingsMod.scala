package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.ManagedObjectSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapFGridContainerSettingsMod {
  
  @JSImport("sap/f/GridContainerSettings", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `sap.f.GridContainerSettings`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link https://ui5.sap.com/#/topic/32d4b9c2b981425dbc374d3e9d5d0c2e Grid Controls}
    */
  open class default () extends GridContainerSettings {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: GridContainerSettingsSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: GridContainerSettingsSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: GridContainerSettingsSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/f/GridContainerSettings", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.f.GridContainerSettings with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.ManagedObject.extend}.
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
    oClassInfo: ClassInfo[T, GridContainerSettings]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, GridContainerSettings],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.f.GridContainerSettings.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseManagedObjectMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseManagedObjectMetadataMod.default]
  }
  
  @js.native
  trait GridContainerSettings
    extends typings.openui5.sapUiBaseManagedObjectMod.default {
    
    /**
      * Gets current value of property {@link #getColumnSize columnSize}.
      *
      * The width of the columns. **Note:** Use only 'px' or 'rem'. Some features may not work as expected otherwise.
      *
      * Default value is `"80px"`.
      *
      * @returns Value of property `columnSize`
      */
    def getColumnSize(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getColumns columns}.
      *
      * How many columns to have on a row.
      *
      * If not defined, `sap.f.GridContainer` will position as many columns as they can fit in the container.
      *
      * @returns Value of property `columns`
      */
    def getColumns(): int = js.native
    
    /**
      * Gets current value of property {@link #getGap gap}.
      *
      * The size of the gap between columns and rows.
      *
      * **Note:** Use only 'px' or 'rem'. Some features may not work as expected otherwise.
      *
      * Default value is `"16px"`.
      *
      * @returns Value of property `gap`
      */
    def getGap(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getMaxColumnSize maxColumnSize}.
      *
      * Sets the maximum width of the columns. Setting this together with `minColumnSize` will allow the columns
      * to breath between those two values.
      *
      * **Note:** Will not work in combination with `columnSize`.
      *
      * @returns Value of property `maxColumnSize`
      */
    def getMaxColumnSize(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getMinColumnSize minColumnSize}.
      *
      * Sets the minimum width of the columns. Setting this together with `maxColumnSize` will allow the columns
      * to breath between those two values.
      *
      * **Note:** Will not work in combination with `columnSize`.
      *
      * @returns Value of property `minColumnSize`
      */
    def getMinColumnSize(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getRowSize rowSize}.
      *
      * The height of the rows.
      *
      * **Note:** Use only 'px' or 'rem'. Some features may not work as expected otherwise.
      *
      * Default value is `"80px"`.
      *
      * @returns Value of property `rowSize`
      */
    def getRowSize(): CSSSize = js.native
    
    /**
      * Sets a new value for property {@link #getColumnSize columnSize}.
      *
      * The width of the columns. **Note:** Use only 'px' or 'rem'. Some features may not work as expected otherwise.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"80px"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setColumnSize(): this.type = js.native
    def setColumnSize(/**
      * New value for property `columnSize`
      */
    sColumnSize: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getColumns columns}.
      *
      * How many columns to have on a row.
      *
      * If not defined, `sap.f.GridContainer` will position as many columns as they can fit in the container.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setColumns(/**
      * New value for property `columns`
      */
    iColumns: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getGap gap}.
      *
      * The size of the gap between columns and rows.
      *
      * **Note:** Use only 'px' or 'rem'. Some features may not work as expected otherwise.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"16px"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGap(): this.type = js.native
    def setGap(/**
      * New value for property `gap`
      */
    sGap: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMaxColumnSize maxColumnSize}.
      *
      * Sets the maximum width of the columns. Setting this together with `minColumnSize` will allow the columns
      * to breath between those two values.
      *
      * **Note:** Will not work in combination with `columnSize`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxColumnSize(/**
      * New value for property `maxColumnSize`
      */
    sMaxColumnSize: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMinColumnSize minColumnSize}.
      *
      * Sets the minimum width of the columns. Setting this together with `maxColumnSize` will allow the columns
      * to breath between those two values.
      *
      * **Note:** Will not work in combination with `columnSize`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMinColumnSize(/**
      * New value for property `minColumnSize`
      */
    sMinColumnSize: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getRowSize rowSize}.
      *
      * The height of the rows.
      *
      * **Note:** Use only 'px' or 'rem'. Some features may not work as expected otherwise.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"80px"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRowSize(): this.type = js.native
    def setRowSize(/**
      * New value for property `rowSize`
      */
    sRowSize: CSSSize): this.type = js.native
  }
  
  trait GridContainerSettingsSettings
    extends StObject
       with ManagedObjectSettings {
    
    /**
      * The width of the columns. **Note:** Use only 'px' or 'rem'. Some features may not work as expected otherwise.
      */
    var columnSize: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * How many columns to have on a row.
      *
      * If not defined, `sap.f.GridContainer` will position as many columns as they can fit in the container.
      */
    var columns: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The size of the gap between columns and rows.
      *
      * **Note:** Use only 'px' or 'rem'. Some features may not work as expected otherwise.
      */
    var gap: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Sets the maximum width of the columns. Setting this together with `minColumnSize` will allow the columns
      * to breath between those two values.
      *
      * **Note:** Will not work in combination with `columnSize`.
      */
    var maxColumnSize: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Sets the minimum width of the columns. Setting this together with `maxColumnSize` will allow the columns
      * to breath between those two values.
      *
      * **Note:** Will not work in combination with `columnSize`.
      */
    var minColumnSize: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The height of the rows.
      *
      * **Note:** Use only 'px' or 'rem'. Some features may not work as expected otherwise.
      */
    var rowSize: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object GridContainerSettingsSettings {
    
    inline def apply(): GridContainerSettingsSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridContainerSettingsSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridContainerSettingsSettings] (val x: Self) extends AnyVal {
      
      inline def setColumnSize(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "columnSize", value.asInstanceOf[js.Any])
      
      inline def setColumnSizeUndefined: Self = StObject.set(x, "columnSize", js.undefined)
      
      inline def setColumns(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setGap(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      inline def setMaxColumnSize(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxColumnSize", value.asInstanceOf[js.Any])
      
      inline def setMaxColumnSizeUndefined: Self = StObject.set(x, "maxColumnSize", js.undefined)
      
      inline def setMinColumnSize(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "minColumnSize", value.asInstanceOf[js.Any])
      
      inline def setMinColumnSizeUndefined: Self = StObject.set(x, "minColumnSize", js.undefined)
      
      inline def setRowSize(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "rowSize", value.asInstanceOf[js.Any])
      
      inline def setRowSizeUndefined: Self = StObject.set(x, "rowSize", js.undefined)
    }
  }
}
