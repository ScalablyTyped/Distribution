package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.WorksheetCalculated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the worksheet that raised the calculated event.
  *
  * @remarks
  * [Api set: ExcelApi 1.8]
  */
trait WorksheetCalculatedEventArgs extends StObject {
  
  /**
    * The address of the range that completed calculation.
    If multiple ranges completed calculation, the string is a comma-separated list of those range addresses.
    *
    * @remarks
    * [Api set: ExcelApi 1.11]
    */
  var address: String
  
  /**
    * Gets the type of the event. See `Excel.EventType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var `type`: WorksheetCalculated
  
  /**
    * Gets the ID of the worksheet in which the calculation occurred.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var worksheetId: String
}
object WorksheetCalculatedEventArgs {
  
  inline def apply(address: String, worksheetId: String): WorksheetCalculatedEventArgs = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WorksheetCalculated")
    __obj.asInstanceOf[WorksheetCalculatedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorksheetCalculatedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setType(value: WorksheetCalculated): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
