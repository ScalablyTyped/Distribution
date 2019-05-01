package typings
package officeDashJsDashPreviewLib.ExcelNs

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
  var shapeId: java.lang.String
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ShapeDeactivated
  /**
    *
    * Gets the id of the worksheet in which the shape is deactivated.
    *
    * [Api set: ExcelApi 1.9]
    */
  var worksheetId: java.lang.String
}

object ShapeDeactivatedEventArgs {
  @scala.inline
  def apply(
    shapeId: java.lang.String,
    `type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ShapeDeactivated,
    worksheetId: java.lang.String
  ): ShapeDeactivatedEventArgs = {
    val __obj = js.Dynamic.literal(shapeId = shapeId, worksheetId = worksheetId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ShapeDeactivatedEventArgs]
  }
}

