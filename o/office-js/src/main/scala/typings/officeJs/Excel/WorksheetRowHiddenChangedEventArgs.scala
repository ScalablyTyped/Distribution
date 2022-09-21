package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.Hidden
import typings.officeJs.officeJsStrings.Local
import typings.officeJs.officeJsStrings.Remote
import typings.officeJs.officeJsStrings.Unhidden
import typings.officeJs.officeJsStrings.WorksheetRowHiddenChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the worksheet's row hidden change event.
  *
  * @remarks
  * [Api set: ExcelApi 1.11]
  */
trait WorksheetRowHiddenChangedEventArgs extends StObject {
  
  /**
    * Gets the range address that represents the changed area of a specific worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.11]
    */
  var address: String
  
  /**
    * Gets the type of change that represents how the event was triggered. See `Excel.RowHiddenChangeType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.11]
    */
  var changeType: RowHiddenChangeType | Unhidden | Hidden
  
  /**
    * Gets the source of the event. See `Excel.EventSource` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.11]
    */
  var source: EventSource | Local | Remote
  
  /**
    * Gets the type of the event. See `Excel.EventType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.11]
    */
  var `type`: WorksheetRowHiddenChanged
  
  /**
    * Gets the ID of the worksheet in which the data changed.
    *
    * @remarks
    * [Api set: ExcelApi 1.11]
    */
  var worksheetId: String
}
object WorksheetRowHiddenChangedEventArgs {
  
  inline def apply(
    address: String,
    changeType: RowHiddenChangeType | Unhidden | Hidden,
    source: EventSource | Local | Remote,
    worksheetId: String
  ): WorksheetRowHiddenChangedEventArgs = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], changeType = changeType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WorksheetRowHiddenChanged")
    __obj.asInstanceOf[WorksheetRowHiddenChangedEventArgs]
  }
  
  extension [Self <: WorksheetRowHiddenChangedEventArgs](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setChangeType(value: RowHiddenChangeType | Unhidden | Hidden): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    inline def setSource(value: EventSource | Local | Remote): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: WorksheetRowHiddenChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
