package typings.octokitPluginRestEndpointMethods.typesMod

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.failure
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.notice
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksUpdateParamsOutputAnnotations extends js.Object {
  /**
    * The level of the annotation. Can be one of `notice`, `warning`, or `failure`.
    */
  var annotation_level: notice | warning | failure
  /**
    * The end column of the annotation. Annotations only support `start_column` and `end_column` on the same line. Omit this parameter if `start_line` and `end_line` have different values.
    */
  var end_column: js.UndefOr[Double] = js.undefined
  /**
    * The end line of the annotation.
    */
  var end_line: Double
  /**
    * A short description of the feedback for these lines of code. The maximum size is 64 KB.
    */
  var message: String
  /**
    * The path of the file to add an annotation to. For example, `assets/css/main.css`.
    */
  var path: String
  /**
    * Details about this annotation. The maximum size is 64 KB.
    */
  var raw_details: js.UndefOr[String] = js.undefined
  /**
    * The start column of the annotation. Annotations only support `start_column` and `end_column` on the same line. Omit this parameter if `start_line` and `end_line` have different values.
    */
  var start_column: js.UndefOr[Double] = js.undefined
  /**
    * The start line of the annotation.
    */
  var start_line: Double
  /**
    * The title that represents the annotation. The maximum size is 255 characters.
    */
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

