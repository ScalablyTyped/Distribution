package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.CellDeleted
import typings.officeJs.officeJsStrings.CellInserted
import typings.officeJs.officeJsStrings.ColumnDeleted
import typings.officeJs.officeJsStrings.ColumnInserted
import typings.officeJs.officeJsStrings.Local
import typings.officeJs.officeJsStrings.RangeEdited
import typings.officeJs.officeJsStrings.Remote
import typings.officeJs.officeJsStrings.RowDeleted
import typings.officeJs.officeJsStrings.RowInserted
import typings.officeJs.officeJsStrings.TableChanged
import typings.officeJs.officeJsStrings.Unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the table that raised the Changed event.
  *
  * [Api set: ExcelApi 1.7]
  */
trait TableChangedEventArgs extends StObject {
  
  /**
    *
    * Gets the address that represents the changed area of a table on a specific worksheet.
    *
    * [Api set: ExcelApi 1.7]
    */
  var address: String
  
  /**
    *
    * Gets the change type that represents how the Changed event is triggered. See Excel.DataChangeType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var changeType: DataChangeType | Unknown_ | RangeEdited | RowInserted | RowDeleted | ColumnInserted | ColumnDeleted | CellInserted | CellDeleted
  
  /**
    *
    * Gets the information about the change detail. This property can be retrieved when the Changed event is triggered on a single cell. If the Changed event is triggered on multiple cells, this property cannot be retrieved.
    *
    * [Api set: ExcelApi 1.9]
    */
  var details: ChangedEventDetail
  
  /**
    *
    * Gets the range that represents the changed area of a table on a specific worksheet.
    *
    * [Api set: ExcelApi 1.8]
    */
  def getRange(ctx: RequestContext): Range
  
  /**
    *
    * Gets the range that represents the changed area of a table on a specific worksheet. It might return null object.
    *
    * [Api set: ExcelApi 1.8]
    */
  def getRangeOrNullObject(ctx: RequestContext): Range
  
  /**
    *
    * Gets the source of the event. See Excel.EventSource for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var source: EventSource | Local | Remote
  
  /**
    *
    * Gets the id of the table in which the data changed.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tableId: String
  
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: TableChanged
  
  /**
    *
    * Gets the id of the worksheet in which the data changed.
    *
    * [Api set: ExcelApi 1.7]
    */
  var worksheetId: String
}
object TableChangedEventArgs {
  
  inline def apply(
    address: String,
    changeType: DataChangeType | Unknown_ | RangeEdited | RowInserted | RowDeleted | ColumnInserted | ColumnDeleted | CellInserted | CellDeleted,
    details: ChangedEventDetail,
    getRange: RequestContext => Range,
    getRangeOrNullObject: RequestContext => Range,
    source: EventSource | Local | Remote,
    tableId: String,
    worksheetId: String
  ): TableChangedEventArgs = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], changeType = changeType.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], getRange = js.Any.fromFunction1(getRange), getRangeOrNullObject = js.Any.fromFunction1(getRangeOrNullObject), source = source.asInstanceOf[js.Any], tableId = tableId.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TableChanged")
    __obj.asInstanceOf[TableChangedEventArgs]
  }
  
  extension [Self <: TableChangedEventArgs](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setChangeType(
      value: DataChangeType | Unknown_ | RangeEdited | RowInserted | RowDeleted | ColumnInserted | ColumnDeleted | CellInserted | CellDeleted
    ): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: ChangedEventDetail): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setGetRange(value: RequestContext => Range): Self = StObject.set(x, "getRange", js.Any.fromFunction1(value))
    
    inline def setGetRangeOrNullObject(value: RequestContext => Range): Self = StObject.set(x, "getRangeOrNullObject", js.Any.fromFunction1(value))
    
    inline def setSource(value: EventSource | Local | Remote): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setType(value: TableChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
