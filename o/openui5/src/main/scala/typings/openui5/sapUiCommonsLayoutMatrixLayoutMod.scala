package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsLayoutMatrixLayoutMod {
  
  @JSImport("sap/ui/commons/layout/MatrixLayout", JSImport.Default)
  @js.native
  /**
    * Constructor for a new layout/MatrixLayout.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends MatrixLayout {
    def this(/**
      * initial settings for the new control
      */
    mSettings: MatrixLayoutSettings) = this()
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
    mSettings: MatrixLayoutSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: MatrixLayoutSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/layout/MatrixLayout", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.layout.MatrixLayout with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, MatrixLayout]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, MatrixLayout],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.layout.MatrixLayout.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait MatrixLayout
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some row to the aggregation {@link #getRows rows}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addRow(
      /**
      * The row to add; if empty, nothing is inserted
      */
    oRow: typings.openui5.sapUiCommonsLayoutMatrixLayoutRowMod.default
    ): this.type = js.native
    
    /**
      * Creates a new matrix layout row and appends it to this matrix layout.
      *
      * Each argument must be either a matrix layout cell, which is added to the row "as is", or an arbitrary
      * content control, which is wrapped with a new (default) matrix layout cell first and then added to the
      * row.
      *
      * @returns `this` to allow method chaining
      */
    def createRow(): this.type = js.native
    
    /**
      * Destroys all the rows in the aggregation {@link #getRows rows}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyRows(): this.type = js.native
    
    /**
      * Gets current value of property {@link #getColumns columns}.
      *
      * Number of columns. If not specified, the number of columns will be determined from the given cells.
      *
      * @returns Value of property `columns`
      */
    def getColumns(): int = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * CSS height of the matrix layout.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getLayoutFixed layoutFixed}.
      *
      * Sets the table layout. If fixed the width parameter of a column has priority, if not the width of the
      * content of the colums has priority. The default is "fixed". If the fixed layout is used an adequate width
      * of the MatrixLayout should be provided. Otherwise the column width displayed could be different than
      * the given ones because of browser dependend optimazations.
      *
      * Default value is `true`.
      *
      * @returns Value of property `layoutFixed`
      */
    def getLayoutFixed(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getRows rows}.
      *
      * The matrix layout's individual rows.
      */
    def getRows(): js.Array[typings.openui5.sapUiCommonsLayoutMatrixLayoutRowMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * CSS width of the matrix layout. If the LayoutFixed = true an adequate width should be provided.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getWidths widths}.
      *
      * Widths of the columns. Use an array to define the widths of the columns. If a column shall have an automatical
      * sizing enter "auto" for this column width.
      *
      * @returns Value of property `widths`
      */
    def getWidths(): js.Array[CSSSize] = js.native
    
    /**
      * Checks for the provided `sap.ui.commons.layout.MatrixLayoutRow` in the aggregation {@link #getRows rows}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfRow(
      /**
      * The row whose index is looked for
      */
    oRow: typings.openui5.sapUiCommonsLayoutMatrixLayoutRowMod.default
    ): int = js.native
    
    /**
      * Inserts a row into the aggregation {@link #getRows rows}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertRow(
      /**
      * The row to insert; if empty, nothing is inserted
      */
    oRow: typings.openui5.sapUiCommonsLayoutMatrixLayoutRowMod.default,
      /**
      * The `0`-based index the row should be inserted at; for a negative value of `iIndex`, the row is inserted
      * at position 0; for a value greater than the current size of the aggregation, the row is inserted at the
      * last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getRows rows}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllRows(): js.Array[typings.openui5.sapUiCommonsLayoutMatrixLayoutRowMod.default] = js.native
    
    def removeRow(/**
      * The row to remove or its index or id
      */
    vRow: String): typings.openui5.sapUiCommonsLayoutMatrixLayoutRowMod.default | Null = js.native
    /**
      * Removes a row from the aggregation {@link #getRows rows}.
      *
      * @returns The removed row or `null`
      */
    def removeRow(/**
      * The row to remove or its index or id
      */
    vRow: int): typings.openui5.sapUiCommonsLayoutMatrixLayoutRowMod.default | Null = js.native
    def removeRow(
      /**
      * The row to remove or its index or id
      */
    vRow: typings.openui5.sapUiCommonsLayoutMatrixLayoutRowMod.default
    ): typings.openui5.sapUiCommonsLayoutMatrixLayoutRowMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getColumns columns}.
      *
      * Number of columns. If not specified, the number of columns will be determined from the given cells.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setColumns(): this.type = js.native
    def setColumns(/**
      * New value for property `columns`
      */
    iColumns: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * CSS height of the matrix layout.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLayoutFixed layoutFixed}.
      *
      * Sets the table layout. If fixed the width parameter of a column has priority, if not the width of the
      * content of the colums has priority. The default is "fixed". If the fixed layout is used an adequate width
      * of the MatrixLayout should be provided. Otherwise the column width displayed could be different than
      * the given ones because of browser dependend optimazations.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLayoutFixed(): this.type = js.native
    def setLayoutFixed(/**
      * New value for property `layoutFixed`
      */
    bLayoutFixed: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * CSS width of the matrix layout. If the LayoutFixed = true an adequate width should be provided.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidths widths}.
      *
      * Widths of the columns. Use an array to define the widths of the columns. If a column shall have an automatical
      * sizing enter "auto" for this column width.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidths(): this.type = js.native
    def setWidths(/**
      * New value for property `widths`
      */
    sWidths: js.Array[CSSSize]): this.type = js.native
  }
  
  trait MatrixLayoutSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Number of columns. If not specified, the number of columns will be determined from the given cells.
      */
    var columns: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * CSS height of the matrix layout.
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Sets the table layout. If fixed the width parameter of a column has priority, if not the width of the
      * content of the colums has priority. The default is "fixed". If the fixed layout is used an adequate width
      * of the MatrixLayout should be provided. Otherwise the column width displayed could be different than
      * the given ones because of browser dependend optimazations.
      */
    var layoutFixed: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The matrix layout's individual rows.
      */
    var rows: js.UndefOr[
        js.Array[typings.openui5.sapUiCommonsLayoutMatrixLayoutRowMod.default] | typings.openui5.sapUiCommonsLayoutMatrixLayoutRowMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * CSS width of the matrix layout. If the LayoutFixed = true an adequate width should be provided.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Widths of the columns. Use an array to define the widths of the columns. If a column shall have an automatical
      * sizing enter "auto" for this column width.
      */
    var widths: js.UndefOr[
        js.Array[CSSSize] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object MatrixLayoutSettings {
    
    inline def apply(): MatrixLayoutSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MatrixLayoutSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MatrixLayoutSettings] (val x: Self) extends AnyVal {
      
      inline def setColumns(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLayoutFixed(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "layoutFixed", value.asInstanceOf[js.Any])
      
      inline def setLayoutFixedUndefined: Self = StObject.set(x, "layoutFixed", js.undefined)
      
      inline def setRows(
        value: js.Array[typings.openui5.sapUiCommonsLayoutMatrixLayoutRowMod.default] | typings.openui5.sapUiCommonsLayoutMatrixLayoutRowMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setRowsVarargs(value: typings.openui5.sapUiCommonsLayoutMatrixLayoutRowMod.default*): Self = StObject.set(x, "rows", js.Array(value*))
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWidths(
        value: js.Array[CSSSize] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
      
      inline def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
      
      inline def setWidthsVarargs(value: CSSSize*): Self = StObject.set(x, "widths", js.Array(value*))
    }
  }
}
