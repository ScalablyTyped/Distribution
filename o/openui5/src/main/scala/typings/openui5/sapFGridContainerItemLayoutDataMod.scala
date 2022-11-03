package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapFGridContainerItemLayoutDataMod {
  
  @JSImport("sap/f/GridContainerItemLayoutData", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `sap.f.GridContainerItemLayoutData`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link topic:32d4b9c2b981425dbc374d3e9d5d0c2e Grid Controls}
    */
  open class default () extends GridContainerItemLayoutData {
    def this(/**
      * Initial settings for the new element.
      */
    mSettings: GridContainerItemLayoutDataSettings) = this()
    def this(/**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new element.
      */
    mSettings: GridContainerItemLayoutDataSettings
    ) = this()
    def this(
      /**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new element.
      */
    mSettings: GridContainerItemLayoutDataSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/f/GridContainerItemLayoutData", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.f.GridContainerItemLayoutData with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.LayoutData.extend}.
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
    oClassInfo: ClassInfo[T, GridContainerItemLayoutData]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, GridContainerItemLayoutData],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.f.GridContainerItemLayoutData.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait GridContainerItemLayoutData
    extends typings.openui5.sapUiCoreLayoutDataMod.default {
    
    /**
      * Gets current value of property {@link #getColumns columns}.
      *
      * Specifies the number of columns, which the item should take
      *
      * **Note:** Make sure that the item does not have more columns than the total columns in the grid. Use
      * {@link sap.f.GridContainer#attachLayoutChange} or a resize listener to handle when columns count is changed
      * for the grid. If item has more columns at some point, they will be automatically reduced to the total
      * grid columns. This is done to prevent broken layout (grid blowout) that affects all items.
      *
      * Default value is `1`.
      *
      * @returns Value of property `columns`
      */
    def getColumns(): int = js.native
    
    /**
      * Gets current value of property {@link #getMinRows minRows}.
      *
      * Specifies the minimum number of rows, which the item should take.
      *
      * @returns Value of property `minRows`
      */
    def getMinRows(): int = js.native
    
    /**
      * @EXPERIMENTAL (since 1.65) - this property may soon be removed, use minRows instead
      *
      * Gets current value of property {@link #getRows rows}.
      *
      * Specifies the number of rows, which the item should take.
      *
      * @returns Value of property `rows`
      */
    def getRows(): int = js.native
    
    /**
      * Sets a new value for property {@link #getColumns columns}.
      *
      * Specifies the number of columns, which the item should take
      *
      * **Note:** Make sure that the item does not have more columns than the total columns in the grid. Use
      * {@link sap.f.GridContainer#attachLayoutChange} or a resize listener to handle when columns count is changed
      * for the grid. If item has more columns at some point, they will be automatically reduced to the total
      * grid columns. This is done to prevent broken layout (grid blowout) that affects all items.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setColumns(): this.type = js.native
    def setColumns(/**
      * New value for property `columns`
      */
    iColumns: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMinRows minRows}.
      *
      * Specifies the minimum number of rows, which the item should take.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMinRows(/**
      * New value for property `minRows`
      */
    iMinRows: int): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.65) - this property may soon be removed, use minRows instead
      *
      * Sets a new value for property {@link #getRows rows}.
      *
      * Specifies the number of rows, which the item should take.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRows(/**
      * New value for property `rows`
      */
    iRows: int): this.type = js.native
  }
  
  trait GridContainerItemLayoutDataSettings
    extends StObject
       with ElementSettings {
    
    /**
      * Specifies the number of columns, which the item should take
      *
      * **Note:** Make sure that the item does not have more columns than the total columns in the grid. Use
      * {@link sap.f.GridContainer#attachLayoutChange} or a resize listener to handle when columns count is changed
      * for the grid. If item has more columns at some point, they will be automatically reduced to the total
      * grid columns. This is done to prevent broken layout (grid blowout) that affects all items.
      */
    var columns: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Specifies the minimum number of rows, which the item should take.
      */
    var minRows: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @EXPERIMENTAL (since 1.65) - this property may soon be removed, use minRows instead
      *
      * Specifies the number of rows, which the item should take.
      */
    var rows: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  }
  object GridContainerItemLayoutDataSettings {
    
    inline def apply(): GridContainerItemLayoutDataSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridContainerItemLayoutDataSettings]
    }
    
    extension [Self <: GridContainerItemLayoutDataSettings](x: Self) {
      
      inline def setColumns(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setMinRows(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "minRows", value.asInstanceOf[js.Any])
      
      inline def setMinRowsUndefined: Self = StObject.set(x, "minRows", js.undefined)
      
      inline def setRows(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    }
  }
}
