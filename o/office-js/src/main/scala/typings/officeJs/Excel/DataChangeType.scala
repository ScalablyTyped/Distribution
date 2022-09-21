package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataChangeType extends StObject
/**
  * @remarks
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.DataChangeType")
@js.native
object DataChangeType extends StObject {
  
  /**
    * `CellDeleted` indicates that the data change event is triggered by deleting cells.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait cellDeleted
    extends StObject
       with DataChangeType
  
  /**
    * `CellInserted` indicates that the data change event is triggered by inserting new cells.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait cellInserted
    extends StObject
       with DataChangeType
  
  /**
    * `ColumnDeleted` indicates that the data change event is triggered by deleting columns.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait columnDeleted
    extends StObject
       with DataChangeType
  
  /**
    * `ColumnInserted` indicates that the data change event is triggered by inserting new columns.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait columnInserted
    extends StObject
       with DataChangeType
  
  /**
    * `RangeEdited` indicates that the data change event is triggered by a range being edited.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait rangeEdited
    extends StObject
       with DataChangeType
  
  /**
    * `RowDeleted` indicates that the data change event is triggered by deleting rows.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait rowDeleted
    extends StObject
       with DataChangeType
  
  /**
    * `RowInserted` indicates that the data change event is triggered by inserting new rows.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait rowInserted
    extends StObject
       with DataChangeType
  
  /**
    * `Unknown` indicates that the type of data change is not one of the listed types.
    * @remarks
    * [Api set: ExcelApi 1.8. The name of this value was 'Others' in ExcelApi 1.7]
    */
  @js.native
  sealed trait unknown
    extends StObject
       with DataChangeType
}
