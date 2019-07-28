package typings.officeDashJsDashPreview.ExcelNs

import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ShapeDeactivated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the shape that raised the Deactivated event.
  *
  * [Api set: ExcelApi 1.9]
  */
trait ShapeDeactivatedEventArgs extends js.Object {
  /**
    *
    * Gets the id of the shape deactivated shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var shapeId: String
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: ShapeDeactivated
  /**
    *
    * Gets the id of the worksheet in which the shape is deactivated.
    *
    * [Api set: ExcelApi 1.9]
    */
  var worksheetId: String
}

object ShapeDeactivatedEventArgs {
  @scala.inline
  def apply(shapeId: String, `type`: ShapeDeactivated, worksheetId: String): ShapeDeactivatedEventArgs = {
    val __obj = js.Dynamic.literal(shapeId = shapeId, worksheetId = worksheetId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ShapeDeactivatedEventArgs]
  }
}

