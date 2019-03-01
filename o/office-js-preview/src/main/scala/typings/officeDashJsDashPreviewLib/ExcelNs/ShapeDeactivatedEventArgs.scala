package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the shape that raised the Deactivated event.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait ShapeDeactivatedEventArgs extends js.Object {
  /**
    *
    * Gets the id of the shape that is deactivated.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var shapeId: java.lang.String
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var `type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ShapeDeactivated
  /**
    *
    * Gets the id of the worksheet in which the shape is deactivated.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("shapeId")(shapeId)
    __obj.updateDynamic("worksheetId")(worksheetId)
    __obj.asInstanceOf[ShapeDeactivatedEventArgs]
  }
}

