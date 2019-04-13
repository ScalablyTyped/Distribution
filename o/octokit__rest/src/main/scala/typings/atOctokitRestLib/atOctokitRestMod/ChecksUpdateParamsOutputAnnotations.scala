package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksUpdateParamsOutputAnnotations extends js.Object {
  var annotation_level: atOctokitRestLib.atOctokitRestLibStrings.notice | atOctokitRestLib.atOctokitRestLibStrings.warning | atOctokitRestLib.atOctokitRestLibStrings.failure
  var end_column: js.UndefOr[scala.Double] = js.undefined
  var end_line: scala.Double
  var message: java.lang.String
  var path: java.lang.String
  var raw_details: js.UndefOr[java.lang.String] = js.undefined
  var start_column: js.UndefOr[scala.Double] = js.undefined
  var start_line: scala.Double
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object ChecksUpdateParamsOutputAnnotations {
  @scala.inline
  def apply(
    annotation_level: atOctokitRestLib.atOctokitRestLibStrings.notice | atOctokitRestLib.atOctokitRestLibStrings.warning | atOctokitRestLib.atOctokitRestLibStrings.failure,
    end_line: scala.Double,
    message: java.lang.String,
    path: java.lang.String,
    start_line: scala.Double,
    end_column: scala.Int | scala.Double = null,
    raw_details: java.lang.String = null,
    start_column: scala.Int | scala.Double = null,
    title: java.lang.String = null
  ): ChecksUpdateParamsOutputAnnotations = {
    val __obj = js.Dynamic.literal(annotation_level = annotation_level.asInstanceOf[js.Any], end_line = end_line, message = message, path = path, start_line = start_line)
    if (end_column != null) __obj.updateDynamic("end_column")(end_column.asInstanceOf[js.Any])
    if (raw_details != null) __obj.updateDynamic("raw_details")(raw_details)
    if (start_column != null) __obj.updateDynamic("start_column")(start_column.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ChecksUpdateParamsOutputAnnotations]
  }
}

