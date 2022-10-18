package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiTableRowMod {
  
  @JSImport("sap/ui/table/Row", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Row.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Row {
    def this(/**
      * initial settings for the new control
      */
    mSettings: RowSettings) = this()
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
    mSettings: RowSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: RowSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/table/Row", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.table.Row with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Element.extend}.
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
    oClassInfo: ClassInfo[T, Row]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Row],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.table.Row.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Row
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Adds some cell to the aggregation {@link #getCells cells}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addCell(
      /**
      * The cell to add; if empty, nothing is inserted
      */
    oCell: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the cells in the aggregation {@link #getCells cells}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyCells(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getCells cells}.
      *
      * The actual cells are a table-internal construct. The controls in this aggregation are the content of
      * the cells. This aggregation is managed by the table and must not be manipulated. Only read access is
      * allowed.
      */
    def getCells(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Returns the index of the row in the table or -1 if not added to a table. This function considers the
      * scroll position of the table and also takes fixed rows and fixed bottom rows into account.
      *
      * @returns index of the row (considers scroll position and fixed rows)
      */
    def getIndex(): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getCells cells}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfCell(/**
      * The cell whose index is looked for
      */
    oCell: typings.openui5.sapUiCoreControlMod.default): int = js.native
    
    /**
      * Inserts a cell into the aggregation {@link #getCells cells}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertCell(
      /**
      * The cell to insert; if empty, nothing is inserted
      */
    oCell: typings.openui5.sapUiCoreControlMod.default,
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
    def removeAllCells(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeCell(/**
      * The cell to remove or its index or id
      */
    vCell: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a cell from the aggregation {@link #getCells cells}.
      *
      * @returns The removed cell or `null`
      */
    def removeCell(/**
      * The cell to remove or its index or id
      */
    vCell: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeCell(
      /**
      * The cell to remove or its index or id
      */
    vCell: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
  }
  
  trait RowSettings
    extends StObject
       with ElementSettings {
    
    /**
      * The actual cells are a table-internal construct. The controls in this aggregation are the content of
      * the cells. This aggregation is managed by the table and must not be manipulated. Only read access is
      * allowed.
      */
    var cells: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object RowSettings {
    
    inline def apply(): RowSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowSettings]
    }
    
    extension [Self <: RowSettings](x: Self) {
      
      inline def setCells(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
      
      inline def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
      
      inline def setCellsVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "cells", js.Array(value*))
    }
  }
}
