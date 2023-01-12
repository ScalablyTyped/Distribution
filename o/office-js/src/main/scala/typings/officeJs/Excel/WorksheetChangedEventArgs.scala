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
import typings.officeJs.officeJsStrings.ThisLocalAddin
import typings.officeJs.officeJsStrings.Unknown_
import typings.officeJs.officeJsStrings.WorksheetChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the worksheet that raised the changed event.
  *
  * @remarks
  * [Api set: ExcelApi 1.7]
  */
trait WorksheetChangedEventArgs extends StObject {
  
  /**
    * Gets the range address that represents the changed area of a specific worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var address: String
  
  /**
    * Represents a change to the direction that the cells in a worksheet will shift when a cell or cells are deleted or inserted. This includes the following two scenarios.
    1. The direction (such as down or to the right) that existing cells will shift when a new cell or cells are inserted into a worksheet.
    2. The direction (such as up or to the left) that the remaining cells will shift when a cell or cells are deleted from a worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var changeDirectionState: ChangeDirectionState
  
  /**
    * Gets the change type that represents how the changed event is triggered. See `Excel.DataChangeType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var changeType: DataChangeType | Unknown_ | RangeEdited | RowInserted | RowDeleted | ColumnInserted | ColumnDeleted | CellInserted | CellDeleted
  
  /**
    * Represents the information about the change detail. This property can be retrieved when the changed event is triggered on a single cell. If the changed event is triggered on multiple cells, this property cannot be retrieved.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var details: ChangedEventDetail
  
  /**
    *
    * Gets the range that represents the changed area of a specific worksheet.
    *
    * [Api set: ExcelApi 1.8]
    */
  def getRange(ctx: RequestContext): Range
  
  /**
    *
    * Gets the range that represents the changed area of a specific worksheet. It might return null object.
    *
    * [Api set: ExcelApi 1.8]
    */
  def getRangeOrNullObject(ctx: RequestContext): Range
  
  /**
    * Gets the source of the event. See `Excel.EventSource` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var source: EventSource | Local | Remote
  
  /**
    * Represents the trigger source of the event. For example, identifies whether this local add-in triggers the event.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var triggerSource: EventTriggerSource | Unknown_ | ThisLocalAddin
  
  /**
    * Gets the type of the event. See `Excel.EventType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var `type`: WorksheetChanged
  
  /**
    * Gets the ID of the worksheet in which the data changed.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var worksheetId: String
}
object WorksheetChangedEventArgs {
  
  inline def apply(
    address: String,
    changeDirectionState: ChangeDirectionState,
    changeType: DataChangeType | Unknown_ | RangeEdited | RowInserted | RowDeleted | ColumnInserted | ColumnDeleted | CellInserted | CellDeleted,
    details: ChangedEventDetail,
    getRange: RequestContext => Range,
    getRangeOrNullObject: RequestContext => Range,
    source: EventSource | Local | Remote,
    triggerSource: EventTriggerSource | Unknown_ | ThisLocalAddin,
    worksheetId: String
  ): WorksheetChangedEventArgs = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], changeDirectionState = changeDirectionState.asInstanceOf[js.Any], changeType = changeType.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], getRange = js.Any.fromFunction1(getRange), getRangeOrNullObject = js.Any.fromFunction1(getRangeOrNullObject), source = source.asInstanceOf[js.Any], triggerSource = triggerSource.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WorksheetChanged")
    __obj.asInstanceOf[WorksheetChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorksheetChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setChangeDirectionState(value: ChangeDirectionState): Self = StObject.set(x, "changeDirectionState", value.asInstanceOf[js.Any])
    
    inline def setChangeType(
      value: DataChangeType | Unknown_ | RangeEdited | RowInserted | RowDeleted | ColumnInserted | ColumnDeleted | CellInserted | CellDeleted
    ): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: ChangedEventDetail): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setGetRange(value: RequestContext => Range): Self = StObject.set(x, "getRange", js.Any.fromFunction1(value))
    
    inline def setGetRangeOrNullObject(value: RequestContext => Range): Self = StObject.set(x, "getRangeOrNullObject", js.Any.fromFunction1(value))
    
    inline def setSource(value: EventSource | Local | Remote): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTriggerSource(value: EventTriggerSource | Unknown_ | ThisLocalAddin): Self = StObject.set(x, "triggerSource", value.asInstanceOf[js.Any])
    
    inline def setType(value: WorksheetChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
