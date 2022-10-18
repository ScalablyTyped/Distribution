package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiWebcMainLibraryMod.ITableCell
import typings.openui5.sapUiWebcMainLibraryMod.ITableRow
import typings.openui5.sapUiWebcMainLibraryMod.TableRowType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcMainTableRowMod {
  
  @JSImport("sap/ui/webc/main/TableRow", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `TableRow`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends TableRow {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: TableRowSettings) = this()
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
    mSettings: TableRowSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: TableRowSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_webc_main_ITableRow: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/main/TableRow", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.main.TableRow with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.webc.common.WebComponent.extend}.
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
    oClassInfo: ClassInfo[T, TableRow]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, TableRow],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.main.TableRow.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait TableRow
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default
       with ITableRow {
    
    /**
      * Adds some cell to the aggregation {@link #getCells cells}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addCell(/**
      * The cell to add; if empty, nothing is inserted
      */
    oCell: ITableCell): this.type = js.native
    
    /**
      * Destroys all the cells in the aggregation {@link #getCells cells}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyCells(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getCells cells}.
      *
      * Defines the cells of the component.
      *
      *  **Note:** Use `sap.ui.webc.main.TableCell` for the intended design.
      */
    def getCells(): js.Array[ITableCell] = js.native
    
    /**
      * Gets current value of property {@link #getSelected selected}.
      *
      * Defines the row's selected state.
      *
      * Default value is `false`.
      *
      * @returns Value of property `selected`
      */
    def getSelected(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getType type}.
      *
      * Defines the visual indication and behavior of the component.
      *
      *  Available options are:
      * 	 - `Active`
      * 	 - `Inactive`
      *
      *  **Note:** When set to `Active`, the item will provide visual response upon press, while with type `Inactive`
      * - will not.
      *
      * Default value is `Inactive`.
      *
      * @returns Value of property `type`
      */
    def getType(): TableRowType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableRowType * / any */ String) = js.native
    
    /**
      * Checks for the provided `sap.ui.webc.main.ITableCell` in the aggregation {@link #getCells cells}. and
      * returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfCell(/**
      * The cell whose index is looked for
      */
    oCell: ITableCell): int = js.native
    
    /**
      * Inserts a cell into the aggregation {@link #getCells cells}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertCell(
      /**
      * The cell to insert; if empty, nothing is inserted
      */
    oCell: ITableCell,
      /**
      * The `0`-based index the cell should be inserted at; for a negative value of `iIndex`, the cell is inserted
      * at position 0; for a value greater than the current size of the aggregation, the cell is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getCells cells}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllCells(): js.Array[ITableCell] = js.native
    
    def removeCell(/**
      * The cell to remove or its index or id
      */
    vCell: String): ITableCell | Null = js.native
    /**
      * Removes a cell from the aggregation {@link #getCells cells}.
      *
      * @returns The removed cell or `null`
      */
    def removeCell(/**
      * The cell to remove or its index or id
      */
    vCell: int): ITableCell | Null = js.native
    def removeCell(/**
      * The cell to remove or its index or id
      */
    vCell: ITableCell): ITableCell | Null = js.native
    
    /**
      * Sets a new value for property {@link #getSelected selected}.
      *
      * Defines the row's selected state.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSelected(): this.type = js.native
    def setSelected(/**
      * New value for property `selected`
      */
    bSelected: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getType type}.
      *
      * Defines the visual indication and behavior of the component.
      *
      *  Available options are:
      * 	 - `Active`
      * 	 - `Inactive`
      *
      *  **Note:** When set to `Active`, the item will provide visual response upon press, while with type `Inactive`
      * - will not.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Inactive`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setType(): this.type = js.native
    def setType(
      /**
      * New value for property `type`
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableRowType * / any */ String
    ): this.type = js.native
    def setType(/**
      * New value for property `type`
      */
    sType: TableRowType): this.type = js.native
  }
  
  trait TableRowSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines the cells of the component.
      *
      *  **Note:** Use `sap.ui.webc.main.TableCell` for the intended design.
      */
    var cells: js.UndefOr[
        js.Array[ITableCell] | ITableCell | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the row's selected state.
      */
    var selected: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the visual indication and behavior of the component.
      *
      *  Available options are:
      * 	 - `Active`
      * 	 - `Inactive`
      *
      *  **Note:** When set to `Active`, the item will provide visual response upon press, while with type `Inactive`
      * - will not.
      */
    var `type`: js.UndefOr[
        TableRowType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableRowType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object TableRowSettings {
    
    inline def apply(): TableRowSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableRowSettings]
    }
    
    extension [Self <: TableRowSettings](x: Self) {
      
      inline def setCells(
        value: js.Array[ITableCell] | ITableCell | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
      
      inline def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
      
      inline def setCellsVarargs(value: ITableCell*): Self = StObject.set(x, "cells", js.Array(value*))
      
      inline def setSelected(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setType(
        value: TableRowType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableRowType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
