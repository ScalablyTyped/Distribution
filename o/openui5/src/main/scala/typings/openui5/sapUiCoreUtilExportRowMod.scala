package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.ManagedObjectSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreUtilExportRowMod {
  
  @JSImport("sap/ui/core/util/ExportRow", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ExportRow.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ExportRow {
    def this(/**
      * initial settings for the new control
      */
    mSettings: ExportRowSettings) = this()
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
    mSettings: ExportRowSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: ExportRowSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/util/ExportRow", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.util.ExportRow with name `sClassName` and enriches it with
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
    oClassInfo: ClassInfo[T, ExportRow]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ExportRow],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.util.ExportRow.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseManagedObjectMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseManagedObjectMetadataMod.default]
  }
  
  @js.native
  trait ExportRow
    extends typings.openui5.sapUiBaseManagedObjectMod.default {
    
    /**
      * Adds some cell to the aggregation {@link #getCells cells}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addCell(
      /**
      * The cell to add; if empty, nothing is inserted
      */
    oCell: typings.openui5.sapUiCoreUtilExportCellMod.default
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
      * Cells for the Export.
      */
    def getCells(): js.Array[typings.openui5.sapUiCoreUtilExportCellMod.default] = js.native
    
    /**
      * Checks for the provided `sap.ui.core.util.ExportCell` in the aggregation {@link #getCells cells}. and
      * returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfCell(
      /**
      * The cell whose index is looked for
      */
    oCell: typings.openui5.sapUiCoreUtilExportCellMod.default
    ): int = js.native
    
    /**
      * Inserts a cell into the aggregation {@link #getCells cells}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertCell(
      /**
      * The cell to insert; if empty, nothing is inserted
      */
    oCell: typings.openui5.sapUiCoreUtilExportCellMod.default,
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
    def removeAllCells(): js.Array[typings.openui5.sapUiCoreUtilExportCellMod.default] = js.native
    
    def removeCell(/**
      * The cell to remove or its index or id
      */
    vCell: String): typings.openui5.sapUiCoreUtilExportCellMod.default | Null = js.native
    /**
      * Removes a cell from the aggregation {@link #getCells cells}.
      *
      * @returns The removed cell or `null`
      */
    def removeCell(/**
      * The cell to remove or its index or id
      */
    vCell: int): typings.openui5.sapUiCoreUtilExportCellMod.default | Null = js.native
    def removeCell(
      /**
      * The cell to remove or its index or id
      */
    vCell: typings.openui5.sapUiCoreUtilExportCellMod.default
    ): typings.openui5.sapUiCoreUtilExportCellMod.default | Null = js.native
  }
  
  trait ExportRowSettings
    extends StObject
       with ManagedObjectSettings {
    
    /**
      * Cells for the Export.
      */
    var cells: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreUtilExportCellMod.default] | typings.openui5.sapUiCoreUtilExportCellMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ExportRowSettings {
    
    inline def apply(): ExportRowSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportRowSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExportRowSettings] (val x: Self) extends AnyVal {
      
      inline def setCells(
        value: js.Array[typings.openui5.sapUiCoreUtilExportCellMod.default] | typings.openui5.sapUiCoreUtilExportCellMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
      
      inline def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
      
      inline def setCellsVarargs(value: typings.openui5.sapUiCoreUtilExportCellMod.default*): Self = StObject.set(x, "cells", js.Array(value*))
    }
  }
}
