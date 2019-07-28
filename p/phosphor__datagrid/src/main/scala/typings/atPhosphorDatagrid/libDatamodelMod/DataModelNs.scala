package typings.atPhosphorDatagrid.libDatamodelMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPhosphorDatagrid.atPhosphorDatagridStrings.`cells-changed`
import typings.atPhosphorDatagrid.atPhosphorDatagridStrings.`columns-inserted`
import typings.atPhosphorDatagrid.atPhosphorDatagridStrings.`columns-moved`
import typings.atPhosphorDatagrid.atPhosphorDatagridStrings.`columns-removed`
import typings.atPhosphorDatagrid.atPhosphorDatagridStrings.`model-reset`
import typings.atPhosphorDatagrid.atPhosphorDatagridStrings.`rows-inserted`
import typings.atPhosphorDatagrid.atPhosphorDatagridStrings.`rows-moved`
import typings.atPhosphorDatagrid.atPhosphorDatagridStrings.`rows-removed`
import typings.atPhosphorDatagrid.libDatamodelMod.DataModelNs.CellRegion
import typings.atPhosphorDatagrid.libDatamodelMod.DataModelNs.ChangedArgs
import typings.atPhosphorDatagrid.libDatamodelMod.DataModelNs.ColumnRegion
import typings.atPhosphorDatagrid.libDatamodelMod.DataModelNs.Metadata
import typings.atPhosphorDatagrid.libDatamodelMod.DataModelNs.RowRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/datagrid/lib/datamodel", "DataModel")
@js.native
object DataModelNs extends js.Object {
  /**
    * A type alias for the data model cell regions.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.atPhosphorDatagrid.atPhosphorDatagridStrings.body
    - typings.atPhosphorDatagrid.atPhosphorDatagridStrings.`row-header`
    - typings.atPhosphorDatagrid.atPhosphorDatagridStrings.`column-header`
    - typings.atPhosphorDatagrid.atPhosphorDatagridStrings.`corner-header`
  */
  trait CellRegion extends js.Object
  
  /**
    * A type alias for the args objects of the `changed` signal.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.atPhosphorDatagrid.libDatamodelMod.DataModelNs.IRowsChangedArgs
    - typings.atPhosphorDatagrid.libDatamodelMod.DataModelNs.IColumnsChangedArgs
    - typings.atPhosphorDatagrid.libDatamodelMod.DataModelNs.IRowsMovedArgs
    - typings.atPhosphorDatagrid.libDatamodelMod.DataModelNs.IColumnsMovedArgs
    - typings.atPhosphorDatagrid.libDatamodelMod.DataModelNs.ICellsChangedArgs
    - typings.atPhosphorDatagrid.libDatamodelMod.DataModelNs.IModelResetArgs
  */
  trait ChangedArgs extends js.Object
  
  /**
    * A type alias for the data model column regions.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.atPhosphorDatagrid.atPhosphorDatagridStrings.body
    - typings.atPhosphorDatagrid.atPhosphorDatagridStrings.`row-header`
  */
  trait ColumnRegion extends js.Object
  
  /**
    * An arguments object for the `changed` signal.
    *
    * #### Notes
    * Data models should emit the `changed` signal with this args object
    * type when cells are changed in-place.
    */
  trait ICellsChangedArgs extends ChangedArgs {
    /**
      * The column index of the first modified cell.
      */
    val columnIndex: Double
    /**
      * The number of columns in the modified cell range.
      */
    val columnSpan: Double
    /**
      * The region which contains the modified cells.
      */
    val region: CellRegion
    /**
      * The row index of the first modified cell.
      */
    val rowIndex: Double
    /**
      * The number of rows in the modified cell range.
      */
    val rowSpan: Double
    /**
      * The discriminated type of the args object.
      */
    val `type`: `cells-changed`
  }
  
  /**
    * An arguments object for the `changed` signal.
    *
    * #### Notes
    * Data models should emit the `changed` signal with this args object
    * type when columns are inserted or removed.
    */
  trait IColumnsChangedArgs extends ChangedArgs {
    /**
      * The index of the first modified column.
      */
    val index: Double
    /**
      * The region which contains the modified columns.
      */
    val region: ColumnRegion
    /**
      * The number of modified columns.
      */
    val span: Double
    /**
      * The discriminated type of the args object.
      */
    val `type`: `columns-inserted` | `columns-removed`
  }
  
  /**
    * An arguments object for the `changed` signal.
    *
    * #### Notes
    * Data models should emit the `changed` signal with this args object
    * type when columns are moved.
    */
  trait IColumnsMovedArgs extends ChangedArgs {
    /**
      * The ending index of the first modified column.
      */
    val destination: Double
    /**
      * The starting index of the first modified column.
      */
    val index: Double
    /**
      * The region which contains the modified columns.
      */
    val region: ColumnRegion
    /**
      * The number of modified columns.
      */
    val span: Double
    /**
      * The discriminated type of the args object.
      */
    val `type`: `columns-moved`
  }
  
  /**
    * An arguments object for the `changed` signal.
    *
    * #### Notes
    * Data models should emit the `changed` signal with this args object
    * type when the model has changed in a fashion that cannot be easily
    * expressed by the other args object types.
    *
    * This is the "big hammer" approach, and will cause any associated
    * data grid to perform a full reset. The other changed args types
    * should be used whenever possible.
    */
  trait IModelResetArgs extends ChangedArgs {
    /**
      * The discriminated type of the args object.
      */
    val `type`: `model-reset`
  }
  
  /**
    * An arguments object for the `changed` signal.
    *
    * #### Notes
    * Data models should emit the `changed` signal with this args object
    * type when rows are inserted or removed.
    */
  trait IRowsChangedArgs extends ChangedArgs {
    /**
      * The index of the first modified row.
      */
    val index: Double
    /**
      * The region which contains the modified rows.
      */
    val region: RowRegion
    /**
      * The number of modified rows.
      */
    val span: Double
    /**
      * The discriminated type of the args object.
      */
    val `type`: `rows-inserted` | `rows-removed`
  }
  
  /**
    * An arguments object for the `changed` signal.
    *
    * #### Notes
    * Data models should emit the `changed` signal with this args object
    * type when rows are moved.
    */
  trait IRowsMovedArgs extends ChangedArgs {
    /**
      * The ending index of the first modified row.
      */
    val destination: Double
    /**
      * The starting index of the first modified row.
      */
    val index: Double
    /**
      * The region which contains the modified rows.
      */
    val region: RowRegion
    /**
      * The number of modified rows.
      */
    val span: Double
    /**
      * The discriminated type of the args object.
      */
    val `type`: `rows-moved`
  }
  
  /**
    * A type alias for the data model row regions.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.atPhosphorDatagrid.atPhosphorDatagridStrings.body
    - typings.atPhosphorDatagrid.atPhosphorDatagridStrings.`column-header`
  */
  trait RowRegion extends js.Object
  
  /**
    * A singleton empty metadata object.
    */
  val emptyMetadata: Metadata = js.native
  /**
    * The metadata for a column in a data model.
    */
  type Metadata = StringDictionary[js.Any]
}

