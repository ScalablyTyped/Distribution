package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.WorksheetSingleClicked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the left-clicked/tapped event and its related worksheet.
  *
  * @remarks
  * [Api set: ExcelApi 1.10]
  */
trait WorksheetSingleClickedEventArgs extends StObject {
  
  /**
    * Gets the address that represents the cell which was left-clicked/tapped for a specific worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var address: String
  
  /**
    * The distance, in points, from the left-clicked/tapped point to the left (or right for right-to-left languages) gridline edge of the left-clicked/tapped cell.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var offsetX: Double
  
  /**
    * The distance, in points, from the left-clicked/tapped point to the top gridline edge of the left-clicked/tapped cell.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var offsetY: Double
  
  /**
    * Gets the type of the event.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var `type`: WorksheetSingleClicked
  
  /**
    * Gets the ID of the worksheet in which the cell was left-clicked/tapped.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var worksheetId: String
}
object WorksheetSingleClickedEventArgs {
  
  inline def apply(address: String, offsetX: Double, offsetY: Double, worksheetId: String): WorksheetSingleClickedEventArgs = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WorksheetSingleClicked")
    __obj.asInstanceOf[WorksheetSingleClickedEventArgs]
  }
  
  extension [Self <: WorksheetSingleClickedEventArgs](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setType(value: WorksheetSingleClicked): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
