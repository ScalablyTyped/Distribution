package typings.officeDashJs.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataChangeType extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.DataChangeType")
@js.native
object DataChangeType extends js.Object {
  /**
    *
    * CellDeleted represents the data change event is triggered by deleting cells.
    *
    */
  @js.native
  sealed trait cellDeleted extends DataChangeType
  
  /**
    *
    * CellInserted represents the data change event is triggered by inserting new cells.
    *
    */
  @js.native
  sealed trait cellInserted extends DataChangeType
  
  /**
    *
    * ColumnDeleted represents the data change event is triggered by deleting columns.
    *
    */
  @js.native
  sealed trait columnDeleted extends DataChangeType
  
  /**
    *
    * ColumnInserted represents the data change event is triggered by inserting new columns.
    *
    */
  @js.native
  sealed trait columnInserted extends DataChangeType
  
  /**
    *
    * RangeEdited represents the data change event is triggered by range being edited.
    *
    */
  @js.native
  sealed trait rangeEdited extends DataChangeType
  
  /**
    *
    * RowDeleted represents the data change event is triggered by deleting rows.
    *
    */
  @js.native
  sealed trait rowDeleted extends DataChangeType
  
  /**
    *
    * RowInserted represents the data change event is triggered by inserting new rows.
    *
    */
  @js.native
  sealed trait rowInserted extends DataChangeType
  
  /**
    *
    * Unknown represents the type of data change is not the listed types.
    *
    */
  @js.native
  sealed trait unknown extends DataChangeType
  
  /* "CellDeleted" */ val cellDeleted: typings.officeDashJs.ExcelNs.DataChangeType.cellDeleted with String = js.native
  /* "CellInserted" */ val cellInserted: typings.officeDashJs.ExcelNs.DataChangeType.cellInserted with String = js.native
  /* "ColumnDeleted" */ val columnDeleted: typings.officeDashJs.ExcelNs.DataChangeType.columnDeleted with String = js.native
  /* "ColumnInserted" */ val columnInserted: typings.officeDashJs.ExcelNs.DataChangeType.columnInserted with String = js.native
  /* "RangeEdited" */ val rangeEdited: typings.officeDashJs.ExcelNs.DataChangeType.rangeEdited with String = js.native
  /* "RowDeleted" */ val rowDeleted: typings.officeDashJs.ExcelNs.DataChangeType.rowDeleted with String = js.native
  /* "RowInserted" */ val rowInserted: typings.officeDashJs.ExcelNs.DataChangeType.rowInserted with String = js.native
  /* "Unknown" */ val unknown: typings.officeDashJs.ExcelNs.DataChangeType.unknown with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DataChangeType with String] = js.native
}

