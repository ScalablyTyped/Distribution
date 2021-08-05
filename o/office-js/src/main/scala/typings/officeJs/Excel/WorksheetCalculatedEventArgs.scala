package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.WorksheetCalculated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the worksheet that raised the Calculated event.
  *
  * [Api set: ExcelApi 1.8]
  */
trait WorksheetCalculatedEventArgs extends StObject {
  
  /**
    *
    * The address of the range that completed calculation.
    If multiple ranges completed calculation, the string is a comma-separated list of those range addresses.
    *
    * [Api set: ExcelApi 1.11]
    */
  var address: String
  
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var `type`: WorksheetCalculated
  
  /**
    *
    * Gets the id of the worksheet in which the calculation occurred.
    *
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
  
  extension [Self <: WorksheetCalculatedEventArgs](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setType(value: WorksheetCalculated): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
