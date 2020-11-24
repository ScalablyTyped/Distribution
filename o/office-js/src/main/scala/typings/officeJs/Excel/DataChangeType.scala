package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataChangeType extends js.Object
/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.DataChangeType")
@js.native
object DataChangeType extends js.Object {
  
  /**
    * CellDeleted represents the data change event is triggered by deleting cells.
    * [Api set: ExcelApi 1.7]
    *
    */
  @js.native
  sealed trait cellDeleted extends DataChangeType
  
  /**
    * CellInserted represents the data change event is triggered by inserting new cells.
    * [Api set: ExcelApi 1.7]
    *
    */
  @js.native
  sealed trait cellInserted extends DataChangeType
  
  /**
    * ColumnDeleted represents the data change event is triggered by deleting columns.
    * [Api set: ExcelApi 1.7]
    *
    */
  @js.native
  sealed trait columnDeleted extends DataChangeType
  
  /**
    * ColumnInserted represents the data change event is triggered by inserting new columns.
    * [Api set: ExcelApi 1.7]
    *
    */
  @js.native
  sealed trait columnInserted extends DataChangeType
  
  /**
    * RangeEdited represents the data change event is triggered by range being edited.
    * [Api set: ExcelApi 1.7]
    *
    */
  @js.native
  sealed trait rangeEdited extends DataChangeType
  
  /**
    * RowDeleted represents the data change event is triggered by deleting rows.
    * [Api set: ExcelApi 1.7]
    *
    */
  @js.native
  sealed trait rowDeleted extends DataChangeType
  
  /**
    * RowInserted represents the data change event is triggered by inserting new rows.
    * [Api set: ExcelApi 1.7]
    *
    */
  @js.native
  sealed trait rowInserted extends DataChangeType
  
  /**
    * Unknown represents the type of data change is not the listed types.
    * [Api set: ExcelApi The name of this value was 'Others' in ExcelApi 1.7]
    *
    */
  @js.native
  sealed trait unknown extends DataChangeType
}
