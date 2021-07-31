package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.WorksheetDeactivated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the worksheet that raised the Deactivated event.
  *
  * [Api set: ExcelApi 1.7]
  */
trait WorksheetDeactivatedEventArgs extends StObject {
  
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: WorksheetDeactivated
  
  /**
    *
    * Gets the id of the worksheet that is deactivated.
    *
    * [Api set: ExcelApi 1.7]
    */
  var worksheetId: String
}
object WorksheetDeactivatedEventArgs {
  
  @scala.inline
  def apply(worksheetId: String): WorksheetDeactivatedEventArgs = {
    val __obj = js.Dynamic.literal(worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WorksheetDeactivated")
    __obj.asInstanceOf[WorksheetDeactivatedEventArgs]
  }
  
  @scala.inline
  implicit class WorksheetDeactivatedEventArgsMutableBuilder[Self <: WorksheetDeactivatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: WorksheetDeactivated): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
