package typings.officeDashJs.Excel

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DataChangeType with String] = js.native
  /* "CellDeleted" */ @js.native
  object cellDeleted extends TopLevel[cellDeleted with String]
  
  /* "CellInserted" */ @js.native
  object cellInserted extends TopLevel[cellInserted with String]
  
  /* "ColumnDeleted" */ @js.native
  object columnDeleted extends TopLevel[columnDeleted with String]
  
  /* "ColumnInserted" */ @js.native
  object columnInserted extends TopLevel[columnInserted with String]
  
  /* "RangeEdited" */ @js.native
  object rangeEdited extends TopLevel[rangeEdited with String]
  
  /* "RowDeleted" */ @js.native
  object rowDeleted extends TopLevel[rowDeleted with String]
  
  /* "RowInserted" */ @js.native
  object rowInserted extends TopLevel[rowInserted with String]
  
  /* "Unknown" */ @js.native
  object unknown extends TopLevel[unknown with String]
  
}

