package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.WorksheetSingleClicked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the left-clicked/tapped event and its related worksheet.
  *
  * [Api set: ExcelApi 1.10]
  */
@js.native
trait WorksheetSingleClickedEventArgs extends StObject {
  
  /**
    *
    * Gets the address that represents the cell which was left-clicked/tapped for a specific worksheet.
    *
    * [Api set: ExcelApi 1.10]
    */
  var address: String = js.native
  
  /**
    *
    * The distance, in points, from the left-clicked/tapped point to the left (or right for right-to-left languages) gridline edge of the left-clicked/tapped cell.
    *
    * [Api set: ExcelApi 1.10]
    */
  var offsetX: Double = js.native
  
  /**
    *
    * The distance, in points, from the left-clicked/tapped point to the top gridline edge of the left-clicked/tapped cell.
    *
    * [Api set: ExcelApi 1.10]
    */
  var offsetY: Double = js.native
  
  /**
    *
    * Gets the type of the event.
    *
    * [Api set: ExcelApi 1.10]
    */
  var `type`: WorksheetSingleClicked = js.native
  
  /**
    *
    * Gets the id of the worksheet in which the cell was left-clicked/tapped.
    *
    * [Api set: ExcelApi 1.10]
    */
  var worksheetId: String = js.native
}
object WorksheetSingleClickedEventArgs {
  
  @scala.inline
  def apply(
    address: String,
    offsetX: Double,
    offsetY: Double,
    `type`: WorksheetSingleClicked,
    worksheetId: String
  ): WorksheetSingleClickedEventArgs = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetSingleClickedEventArgs]
  }
  
  @scala.inline
  implicit class WorksheetSingleClickedEventArgsMutableBuilder[Self <: WorksheetSingleClickedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: WorksheetSingleClicked): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
