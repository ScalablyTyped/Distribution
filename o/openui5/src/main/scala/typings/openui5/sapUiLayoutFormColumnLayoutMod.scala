package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiLayoutFormFormLayoutMod.FormLayoutSettings
import typings.openui5.sapUiLayoutLibraryMod.form.ColumnCells
import typings.openui5.sapUiLayoutLibraryMod.form.ColumnsL
import typings.openui5.sapUiLayoutLibraryMod.form.ColumnsM
import typings.openui5.sapUiLayoutLibraryMod.form.ColumnsXL
import typings.openui5.sapUiLayoutLibraryMod.form.EmptyCells
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiLayoutFormColumnLayoutMod {
  
  @JSImport("sap/ui/layout/form/ColumnLayout", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `sap.ui.layout.form.ColumnLayout`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ColumnLayout {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ColumnLayoutSettings) = this()
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
    mSettings: ColumnLayoutSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ColumnLayoutSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/layout/form/ColumnLayout", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.layout.form.ColumnLayout with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.layout.form.FormLayout.extend}.
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
    oClassInfo: ClassInfo[T, ColumnLayout]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ColumnLayout],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.layout.form.ColumnLayout.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ColumnLayout
    extends typings.openui5.sapUiLayoutFormFormLayoutMod.default {
    
    /**
      * Gets current value of property {@link #getColumnsL columnsL}.
      *
      * Number of columns for large size.
      *
      * The number of columns for large size must not be smaller than the number of columns for medium size.
      *
      * Default value is `2`.
      *
      * @returns Value of property `columnsL`
      */
    def getColumnsL(): ColumnsL = js.native
    
    /**
      * Gets current value of property {@link #getColumnsM columnsM}.
      *
      * Number of columns for medium size.
      *
      * Default value is `1`.
      *
      * @returns Value of property `columnsM`
      */
    def getColumnsM(): ColumnsM = js.native
    
    /**
      * Gets current value of property {@link #getColumnsXL columnsXL}.
      *
      * Number of columns for extra-large size.
      *
      * The number of columns for extra-large size must not be smaller than the number of columns for large size.
      *
      * Default value is `2`.
      *
      * @returns Value of property `columnsXL`
      */
    def getColumnsXL(): ColumnsXL = js.native
    
    /**
      * Gets current value of property {@link #getEmptyCellsLarge emptyCellsLarge}.
      *
      * Defines how many cells are empty at the end of a row. This could be used to keep the fields small on
      * large screens.
      *
      * Default value is `0`.
      *
      * @returns Value of property `emptyCellsLarge`
      */
    def getEmptyCellsLarge(): EmptyCells = js.native
    
    /**
      * Gets current value of property {@link #getLabelCellsLarge labelCellsLarge}.
      *
      * Defines how many cells a label uses if the column is large.
      *
      * Default value is `4`.
      *
      * @returns Value of property `labelCellsLarge`
      */
    def getLabelCellsLarge(): ColumnCells = js.native
    
    /**
      * Sets a new value for property {@link #getColumnsL columnsL}.
      *
      * Number of columns for large size.
      *
      * The number of columns for large size must not be smaller than the number of columns for medium size.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `2`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setColumnsL(): this.type = js.native
    def setColumnsL(/**
      * New value for property `columnsL`
      */
    sColumnsL: ColumnsL): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getColumnsM columnsM}.
      *
      * Number of columns for medium size.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setColumnsM(): this.type = js.native
    def setColumnsM(/**
      * New value for property `columnsM`
      */
    sColumnsM: ColumnsM): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getColumnsXL columnsXL}.
      *
      * Number of columns for extra-large size.
      *
      * The number of columns for extra-large size must not be smaller than the number of columns for large size.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `2`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setColumnsXL(): this.type = js.native
    def setColumnsXL(/**
      * New value for property `columnsXL`
      */
    sColumnsXL: ColumnsXL): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEmptyCellsLarge emptyCellsLarge}.
      *
      * Defines how many cells are empty at the end of a row. This could be used to keep the fields small on
      * large screens.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEmptyCellsLarge(): this.type = js.native
    def setEmptyCellsLarge(/**
      * New value for property `emptyCellsLarge`
      */
    sEmptyCellsLarge: EmptyCells): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLabelCellsLarge labelCellsLarge}.
      *
      * Defines how many cells a label uses if the column is large.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `4`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLabelCellsLarge(): this.type = js.native
    def setLabelCellsLarge(/**
      * New value for property `labelCellsLarge`
      */
    sLabelCellsLarge: ColumnCells): this.type = js.native
  }
  
  trait ColumnLayoutSettings
    extends StObject
       with FormLayoutSettings {
    
    /**
      * Number of columns for large size.
      *
      * The number of columns for large size must not be smaller than the number of columns for medium size.
      */
    var columnsL: js.UndefOr[
        ColumnsL | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Number of columns for medium size.
      */
    var columnsM: js.UndefOr[
        ColumnsM | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Number of columns for extra-large size.
      *
      * The number of columns for extra-large size must not be smaller than the number of columns for large size.
      */
    var columnsXL: js.UndefOr[
        ColumnsXL | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines how many cells are empty at the end of a row. This could be used to keep the fields small on
      * large screens.
      */
    var emptyCellsLarge: js.UndefOr[
        EmptyCells | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines how many cells a label uses if the column is large.
      */
    var labelCellsLarge: js.UndefOr[
        ColumnCells | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ColumnLayoutSettings {
    
    inline def apply(): ColumnLayoutSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnLayoutSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnLayoutSettings] (val x: Self) extends AnyVal {
      
      inline def setColumnsL(value: ColumnsL | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "columnsL", value.asInstanceOf[js.Any])
      
      inline def setColumnsLUndefined: Self = StObject.set(x, "columnsL", js.undefined)
      
      inline def setColumnsM(value: ColumnsM | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "columnsM", value.asInstanceOf[js.Any])
      
      inline def setColumnsMUndefined: Self = StObject.set(x, "columnsM", js.undefined)
      
      inline def setColumnsXL(value: ColumnsXL | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "columnsXL", value.asInstanceOf[js.Any])
      
      inline def setColumnsXLUndefined: Self = StObject.set(x, "columnsXL", js.undefined)
      
      inline def setEmptyCellsLarge(value: EmptyCells | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "emptyCellsLarge", value.asInstanceOf[js.Any])
      
      inline def setEmptyCellsLargeUndefined: Self = StObject.set(x, "emptyCellsLarge", js.undefined)
      
      inline def setLabelCellsLarge(value: ColumnCells | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "labelCellsLarge", value.asInstanceOf[js.Any])
      
      inline def setLabelCellsLargeUndefined: Self = StObject.set(x, "labelCellsLarge", js.undefined)
    }
  }
}
