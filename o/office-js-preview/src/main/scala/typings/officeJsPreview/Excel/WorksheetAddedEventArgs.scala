package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.Local
import typings.officeJsPreview.officeJsPreviewStrings.Remote
import typings.officeJsPreview.officeJsPreviewStrings.WorksheetAdded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the worksheet that raised the added event.
  *
  * @remarks
  * [Api set: ExcelApi 1.7]
  */
trait WorksheetAddedEventArgs extends StObject {
  
  /**
    * Gets the source of the event. See `Excel.EventSource` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var source: EventSource | Local | Remote
  
  /**
    * Gets the type of the event. See `Excel.EventType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var `type`: WorksheetAdded
  
  /**
    * Gets the ID of the worksheet that is added to the workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var worksheetId: String
}
object WorksheetAddedEventArgs {
  
  inline def apply(source: EventSource | Local | Remote, worksheetId: String): WorksheetAddedEventArgs = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WorksheetAdded")
    __obj.asInstanceOf[WorksheetAddedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorksheetAddedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setSource(value: EventSource | Local | Remote): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: WorksheetAdded): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
