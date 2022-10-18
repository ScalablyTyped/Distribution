package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreUtilExportMod {
  
  @JSImport("sap/ui/core/util/Export", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Export.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Export {
    def this(/**
      * initial settings for the new control
      */
    mSettings: ExportSettings) = this()
    def this(/**
      * id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: ExportSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: ExportSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/util/Export", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.util.Export with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Control.extend}.
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
    oClassInfo: ClassInfo[T, Export]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Export],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.util.Export.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Export
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some column to the aggregation {@link #getColumns columns}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addColumn(
      /**
      * The column to add; if empty, nothing is inserted
      */
    oColumn: typings.openui5.sapUiCoreUtilExportColumnMod.default
    ): this.type = js.native
    
    /**
      * Adds some row to the aggregation {@link #getRows rows}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addRow(
      /**
      * The row to add; if empty, nothing is inserted
      */
    oRow: typings.openui5.sapUiCoreUtilExportRowMod.default
    ): this.type = js.native
    
    /**
      * Binds aggregation {@link #getColumns columns} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindColumns(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * Binds aggregation {@link #getRows rows} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindRows(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * Destroys all the columns in the aggregation {@link #getColumns columns}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyColumns(): this.type = js.native
    
    /**
      * Destroys the exportType in the aggregation {@link #getExportType exportType}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyExportType(): this.type = js.native
    
    /**
      * Destroys all the rows in the aggregation {@link #getRows rows}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyRows(): this.type = js.native
    
    /**
      * Generates the file content and returns a Promise with the instance as context (this).
      *  The promise will be resolved with the generated content as a string.
      *
      * **Please note: The return value was changed from jQuery Promises to standard ES6 Promises. jQuery
      * specific Promise methods ('done', 'fail', 'always', 'pipe' and 'state') are still available but should
      * not be used. Please use only the standard methods 'then' and 'catch'!**
      *
      * @returns Promise object
      */
    def generate(): js.Promise[Any] = js.native
    
    /**
      * Gets content of aggregation {@link #getColumns columns}.
      *
      * Columns for the Export.
      */
    def getColumns(): js.Array[typings.openui5.sapUiCoreUtilExportColumnMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getExportType exportType}.
      *
      * Type that generates the content.
      */
    def getExportType(): typings.openui5.sapUiCoreUtilExportTypeMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getRows rows}.
      *
      * Rows of the Export.
      */
    def getRows(): js.Array[typings.openui5.sapUiCoreUtilExportRowMod.default] = js.native
    
    /**
      * Checks for the provided `sap.ui.core.util.ExportColumn` in the aggregation {@link #getColumns columns}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfColumn(
      /**
      * The column whose index is looked for
      */
    oColumn: typings.openui5.sapUiCoreUtilExportColumnMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.util.ExportRow` in the aggregation {@link #getRows rows}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfRow(
      /**
      * The row whose index is looked for
      */
    oRow: typings.openui5.sapUiCoreUtilExportRowMod.default
    ): int = js.native
    
    /**
      * Inserts a column into the aggregation {@link #getColumns columns}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertColumn(
      /**
      * The column to insert; if empty, nothing is inserted
      */
    oColumn: typings.openui5.sapUiCoreUtilExportColumnMod.default,
      /**
      * The `0`-based index the column should be inserted at; for a negative value of `iIndex`, the column is
      * inserted at position 0; for a value greater than the current size of the aggregation, the column is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a row into the aggregation {@link #getRows rows}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertRow(
      /**
      * The row to insert; if empty, nothing is inserted
      */
    oRow: typings.openui5.sapUiCoreUtilExportRowMod.default,
      /**
      * The `0`-based index the row should be inserted at; for a negative value of `iIndex`, the row is inserted
      * at position 0; for a value greater than the current size of the aggregation, the row is inserted at the
      * last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getColumns columns}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllColumns(): js.Array[typings.openui5.sapUiCoreUtilExportColumnMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getRows rows}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllRows(): js.Array[typings.openui5.sapUiCoreUtilExportRowMod.default] = js.native
    
    def removeColumn(/**
      * The column to remove or its index or id
      */
    vColumn: String): typings.openui5.sapUiCoreUtilExportColumnMod.default | Null = js.native
    /**
      * Removes a column from the aggregation {@link #getColumns columns}.
      *
      * @returns The removed column or `null`
      */
    def removeColumn(/**
      * The column to remove or its index or id
      */
    vColumn: int): typings.openui5.sapUiCoreUtilExportColumnMod.default | Null = js.native
    def removeColumn(
      /**
      * The column to remove or its index or id
      */
    vColumn: typings.openui5.sapUiCoreUtilExportColumnMod.default
    ): typings.openui5.sapUiCoreUtilExportColumnMod.default | Null = js.native
    
    def removeRow(/**
      * The row to remove or its index or id
      */
    vRow: String): typings.openui5.sapUiCoreUtilExportRowMod.default | Null = js.native
    /**
      * Removes a row from the aggregation {@link #getRows rows}.
      *
      * @returns The removed row or `null`
      */
    def removeRow(/**
      * The row to remove or its index or id
      */
    vRow: int): typings.openui5.sapUiCoreUtilExportRowMod.default | Null = js.native
    def removeRow(
      /**
      * The row to remove or its index or id
      */
    vRow: typings.openui5.sapUiCoreUtilExportRowMod.default
    ): typings.openui5.sapUiCoreUtilExportRowMod.default | Null = js.native
    
    /**
      * Generates the file content, triggers a download / save action and returns a Promise with the instance
      * as context (this).
      *  The promise will be resolved with the generated content as a string. **For information about browser
      * support, see `sap.ui.core.util.File.save`**
      *
      * **Please note: The return value was changed from jQuery Promises to standard ES6 Promises. jQuery
      * specific Promise methods ('done', 'fail', 'always', 'pipe' and 'state') are still available but should
      * not be used. Please use only the standard methods 'then' and 'catch'!**
      *
      * @returns Promise object
      */
    def saveFile(): js.Promise[Any] = js.native
    def saveFile(/**
      * The file name
      */
    sFileName: String): js.Promise[Any] = js.native
    
    /**
      * Sets the aggregated {@link #getExportType exportType}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setExportType(/**
      * The exportType to set
      */
    oExportType: typings.openui5.sapUiCoreUtilExportTypeMod.default): this.type = js.native
    
    /**
      * Unbinds aggregation {@link #getColumns columns} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindColumns(): this.type = js.native
    
    /**
      * Unbinds aggregation {@link #getRows rows} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindRows(): this.type = js.native
  }
  
  trait ExportSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Columns for the Export.
      */
    var columns: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreUtilExportColumnMod.default] | typings.openui5.sapUiCoreUtilExportColumnMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Type that generates the content.
      */
    var exportType: js.UndefOr[typings.openui5.sapUiCoreUtilExportTypeMod.default] = js.undefined
    
    /**
      * Rows of the Export.
      */
    var rows: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreUtilExportRowMod.default] | typings.openui5.sapUiCoreUtilExportRowMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ExportSettings {
    
    inline def apply(): ExportSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportSettings]
    }
    
    extension [Self <: ExportSettings](x: Self) {
      
      inline def setColumns(
        value: js.Array[typings.openui5.sapUiCoreUtilExportColumnMod.default] | typings.openui5.sapUiCoreUtilExportColumnMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: typings.openui5.sapUiCoreUtilExportColumnMod.default*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setExportType(value: typings.openui5.sapUiCoreUtilExportTypeMod.default): Self = StObject.set(x, "exportType", value.asInstanceOf[js.Any])
      
      inline def setExportTypeUndefined: Self = StObject.set(x, "exportType", js.undefined)
      
      inline def setRows(
        value: js.Array[typings.openui5.sapUiCoreUtilExportRowMod.default] | typings.openui5.sapUiCoreUtilExportRowMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setRowsVarargs(value: typings.openui5.sapUiCoreUtilExportRowMod.default*): Self = StObject.set(x, "rows", js.Array(value*))
    }
  }
}
