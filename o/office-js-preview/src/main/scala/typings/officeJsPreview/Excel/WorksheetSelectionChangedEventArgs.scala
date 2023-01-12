package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.WorksheetSelectionChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the worksheet that raised the selection changed event.
  *
  * @remarks
  * [Api set: ExcelApi 1.7]
  */
trait WorksheetSelectionChangedEventArgs extends StObject {
  
  /**
    * Gets the range address that represents the selected area of a specific worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var address: String
  
  /**
    * Gets the type of the event. See `Excel.EventType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var `type`: WorksheetSelectionChanged
  
  /**
    * Gets the ID of the worksheet in which the selection changed.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var worksheetId: String
}
object WorksheetSelectionChangedEventArgs {
  
  inline def apply(address: String, worksheetId: String): WorksheetSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WorksheetSelectionChanged")
    __obj.asInstanceOf[WorksheetSelectionChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorksheetSelectionChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setType(value: WorksheetSelectionChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
