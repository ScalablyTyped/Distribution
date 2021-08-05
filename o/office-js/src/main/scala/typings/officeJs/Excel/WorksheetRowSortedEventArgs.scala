package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.Local
import typings.officeJs.officeJsStrings.Remote
import typings.officeJs.officeJsStrings.WorksheetRowSorted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the row-sorted event and its related worksheet.
  *
  * [Api set: ExcelApi 1.10]
  */
trait WorksheetRowSortedEventArgs extends StObject {
  
  /**
    *
    * Gets the range address that represents the sorted areas of a specific worksheet. Only rows changed as a result of the sort operation are returned.
    *
    * [Api set: ExcelApi 1.10]
    */
  var address: String
  
  /**
    *
    * Gets the source of the event. See Excel.EventSource for details.
    *
    * [Api set: ExcelApi 1.10]
    */
  var source: EventSource | Local | Remote
  
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.10]
    */
  var `type`: WorksheetRowSorted
  
  /**
    *
    * Gets the id of the worksheet where the sorting happened.
    *
    * [Api set: ExcelApi 1.10]
    */
  var worksheetId: String
}
object WorksheetRowSortedEventArgs {
  
  inline def apply(address: String, source: EventSource | Local | Remote, worksheetId: String): WorksheetRowSortedEventArgs = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WorksheetRowSorted")
    __obj.asInstanceOf[WorksheetRowSortedEventArgs]
  }
  
  extension [Self <: WorksheetRowSortedEventArgs](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setSource(value: EventSource | Local | Remote): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: WorksheetRowSorted): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
