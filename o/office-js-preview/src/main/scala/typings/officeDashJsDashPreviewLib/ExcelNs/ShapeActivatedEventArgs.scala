package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the shape that raised the Activated event.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait ShapeActivatedEventArgs extends js.Object {
  /**
    *
    * Gets the id of the shape that is activated.
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
  var `type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ShapeActivated
  /**
    *
    * Gets the id of the worksheet in which the shape is activated.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var worksheetId: java.lang.String
}

object ShapeActivatedEventArgs {
  @scala.inline
  def apply(
    shapeId: java.lang.String,
    `type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ShapeActivated,
    worksheetId: java.lang.String
  ): ShapeActivatedEventArgs = {
    val __obj = js.Dynamic.literal(shapeId = shapeId, worksheetId = worksheetId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ShapeActivatedEventArgs]
  }
}

