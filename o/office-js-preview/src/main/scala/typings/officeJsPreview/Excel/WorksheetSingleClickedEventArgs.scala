package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.WorksheetSingleClicked
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
trait WorksheetSingleClickedEventArgs extends js.Object {
  
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
  implicit class WorksheetSingleClickedEventArgsOps[Self <: WorksheetSingleClickedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: WorksheetSingleClicked): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorksheetId(value: String): Self = this.set("worksheetId", value.asInstanceOf[js.Any])
  }
}
