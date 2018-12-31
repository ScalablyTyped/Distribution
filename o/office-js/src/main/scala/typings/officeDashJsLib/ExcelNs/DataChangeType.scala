package typings
package officeDashJsLib.ExcelNs

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
  sealed trait cellDeleted
    extends officeDashJsLib.ExcelNs.DataChangeType
  
  /**
    *
    * CellInserted represents the data change event is triggered by inserting new cells.
    *
    */
  @js.native
  sealed trait cellInserted
    extends officeDashJsLib.ExcelNs.DataChangeType
  
  /**
    *
    * ColumnDeleted represents the data change event is triggered by deleting columns.
    *
    */
  @js.native
  sealed trait columnDeleted
    extends officeDashJsLib.ExcelNs.DataChangeType
  
  /**
    *
    * ColumnInserted represents the data change event is triggered by inserting new columns.
    *
    */
  @js.native
  sealed trait columnInserted
    extends officeDashJsLib.ExcelNs.DataChangeType
  
  /**
    *
    * RangeEdited represents the data change event is triggered by range being edited.
    *
    */
  @js.native
  sealed trait rangeEdited
    extends officeDashJsLib.ExcelNs.DataChangeType
  
  /**
    *
    * RowDeleted represents the data change event is triggered by deleting rows.
    *
    */
  @js.native
  sealed trait rowDeleted
    extends officeDashJsLib.ExcelNs.DataChangeType
  
  /**
    *
    * RowInserted represents the data change event is triggered by inserting new rows.
    *
    */
  @js.native
  sealed trait rowInserted
    extends officeDashJsLib.ExcelNs.DataChangeType
  
  /**
    *
    * Unknown represents the type of data change is not the listed types.
    *
    */
  @js.native
  sealed trait unknown
    extends officeDashJsLib.ExcelNs.DataChangeType
  
  /* "CellDeleted" */ val cellDeleted: cellDeleted with java.lang.String = js.native
  /* "CellInserted" */ val cellInserted: cellInserted with java.lang.String = js.native
  /* "ColumnDeleted" */ val columnDeleted: columnDeleted with java.lang.String = js.native
  /* "ColumnInserted" */ val columnInserted: columnInserted with java.lang.String = js.native
  /* "RangeEdited" */ val rangeEdited: rangeEdited with java.lang.String = js.native
  /* "RowDeleted" */ val rowDeleted: rowDeleted with java.lang.String = js.native
  /* "RowInserted" */ val rowInserted: rowInserted with java.lang.String = js.native
  /* "Unknown" */ val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.DataChangeType with java.lang.String] = js.native
}

