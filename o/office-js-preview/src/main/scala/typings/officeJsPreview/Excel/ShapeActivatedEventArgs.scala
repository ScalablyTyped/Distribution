package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.ShapeActivated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the shape that raised the Activated event.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait ShapeActivatedEventArgs extends js.Object {
  /**
    *
    * Gets the id of the activated shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var shapeId: String = js.native
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: ShapeActivated = js.native
  /**
    *
    * Gets the id of the worksheet in which the shape is activated.
    *
    * [Api set: ExcelApi 1.9]
    */
  var worksheetId: String = js.native
}

object ShapeActivatedEventArgs {
  @scala.inline
  def apply(shapeId: String, `type`: ShapeActivated, worksheetId: String): ShapeActivatedEventArgs = {
    val __obj = js.Dynamic.literal(shapeId = shapeId.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeActivatedEventArgs]
  }
  @scala.inline
  implicit class ShapeActivatedEventArgsOps[Self <: ShapeActivatedEventArgs] (val x: Self) extends AnyVal {
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
    def setShapeId(value: String): Self = this.set("shapeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ShapeActivated): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorksheetId(value: String): Self = this.set("worksheetId", value.asInstanceOf[js.Any])
  }
  
}

