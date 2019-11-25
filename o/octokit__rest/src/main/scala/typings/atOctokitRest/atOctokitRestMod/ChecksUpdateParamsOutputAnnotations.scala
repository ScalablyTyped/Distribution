package typings.atOctokitRest.atOctokitRestMod

import typings.atOctokitRest.atOctokitRestStrings.failure
import typings.atOctokitRest.atOctokitRestStrings.notice
import typings.atOctokitRest.atOctokitRestStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksUpdateParamsOutputAnnotations extends js.Object {
  var annotation_level: notice | warning | failure
  var end_column: js.UndefOr[Double] = js.undefined
  var end_line: Double
  var message: String
  var path: String
  var raw_details: js.UndefOr[String] = js.undefined
  var start_column: js.UndefOr[Double] = js.undefined
  var start_line: Double
  var title: js.UndefOr[String] = js.undefined
}

object ChecksUpdateParamsOutputAnnotations {
  @scala.inline
  def apply(
    annotation_level: notice | warning | failure,
    end_line: Double,
    message: String,
    path: String,
    start_line: Double,
    end_column: Int | Double = null,
    raw_details: String = null,
    start_column: Int | Double = null,
    title: String = null
  ): ChecksUpdateParamsOutputAnnotations = {
    val __obj = js.Dynamic.literal(annotation_level = annotation_level.asInstanceOf[js.Any], end_line = end_line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], start_line = start_line.asInstanceOf[js.Any])
    if (end_column != null) __obj.updateDynamic("end_column")(end_column.asInstanceOf[js.Any])
    if (raw_details != null) __obj.updateDynamic("raw_details")(raw_details.asInstanceOf[js.Any])
    if (start_column != null) __obj.updateDynamic("start_column")(start_column.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksUpdateParamsOutputAnnotations]
  }
}

