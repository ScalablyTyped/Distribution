package typings
package atPhosphorDatagridLib.libDatamodelMod

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
    - atPhosphorDatagridLib.atPhosphorDatagridLibStrings.body
    - atPhosphorDatagridLib.atPhosphorDatagridLibStrings.`row-header`
    - atPhosphorDatagridLib.atPhosphorDatagridLibStrings.`column-header`
    - atPhosphorDatagridLib.atPhosphorDatagridLibStrings.`corner-header`
  */
  trait CellRegion extends js.Object
  
  /**
    * A type alias for the args objects of the `changed` signal.
    */
  /* Rewritten from type alias, can be one of: 
    - IRowsChangedArgs
    - IColumnsChangedArgs
    - IRowsMovedArgs
    - IColumnsMovedArgs
    - ICellsChangedArgs
    - IModelResetArgs
  */
  trait ChangedArgs extends js.Object
  
  /**
    * A type alias for the data model column regions.
    */
  /* Rewritten from type alias, can be one of: 
    - atPhosphorDatagridLib.atPhosphorDatagridLibStrings.body
    - atPhosphorDatagridLib.atPhosphorDatagridLibStrings.`row-header`
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
    val columnIndex: scala.Double
    /**
      * The number of columns in the modified cell range.
      */
    val columnSpan: scala.Double
    /**
      * The region which contains the modified cells.
      */
    val region: CellRegion
    /**
      * The row index of the first modified cell.
      */
    val rowIndex: scala.Double
    /**
      * The number of rows in the modified cell range.
      */
    val rowSpan: scala.Double
    /**
      * The discriminated type of the args object.
      */
    val `type`: atPhosphorDatagridLib.atPhosphorDatagridLibStrings.`cells-changed`
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
    val index: scala.Double
    /**
      * The region which contains the modified columns.
      */
    val region: ColumnRegion
    /**
      * The number of modified columns.
      */
    val span: scala.Double
    /**
      * The discriminated type of the args object.
      */
    val `type`: atPhosphorDatagridLib.atPhosphorDatagridLibStrings.`columns-inserted` | atPhosphorDatagridLib.atPhosphorDatagridLibStrings.`columns-removed`
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
    val destination: scala.Double
    /**
      * The starting index of the first modified column.
      */
    val index: scala.Double
    /**
      * The region which contains the modified columns.
      */
    val region: ColumnRegion
    /**
      * The number of modified columns.
      */
    val span: scala.Double
    /**
      * The discriminated type of the args object.
      */
    val `type`: atPhosphorDatagridLib.atPhosphorDatagridLibStrings.`columns-moved`
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
    val `type`: atPhosphorDatagridLib.atPhosphorDatagridLibStrings.`model-reset`
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
    val index: scala.Double
    /**
      * The region which contains the modified rows.
      */
    val region: RowRegion
    /**
      * The number of modified rows.
      */
    val span: scala.Double
    /**
      * The discriminated type of the args object.
      */
    val `type`: atPhosphorDatagridLib.atPhosphorDatagridLibStrings.`rows-inserted` | atPhosphorDatagridLib.atPhosphorDatagridLibStrings.`rows-removed`
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
    val destination: scala.Double
    /**
      * The starting index of the first modified row.
      */
    val index: scala.Double
    /**
      * The region which contains the modified rows.
      */
    val region: RowRegion
    /**
      * The number of modified rows.
      */
    val span: scala.Double
    /**
      * The discriminated type of the args object.
      */
    val `type`: atPhosphorDatagridLib.atPhosphorDatagridLibStrings.`rows-moved`
  }
  
  /**
    * A type alias for the data model row regions.
    */
  /* Rewritten from type alias, can be one of: 
    - atPhosphorDatagridLib.atPhosphorDatagridLibStrings.body
    - atPhosphorDatagridLib.atPhosphorDatagridLibStrings.`column-header`
  */
  trait RowRegion extends js.Object
  
  /**
    * A singleton empty metadata object.
    */
  val emptyMetadata: Metadata = js.native
  /**
    * The metadata for a column in a data model.
    */
  type Metadata = org.scalablytyped.runtime.StringDictionary[js.Any]
}

