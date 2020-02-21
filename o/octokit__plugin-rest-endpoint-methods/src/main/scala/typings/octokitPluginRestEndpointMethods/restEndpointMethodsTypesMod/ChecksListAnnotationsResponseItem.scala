package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksListAnnotationsResponseItem extends js.Object {
  var annotation_level: String
  var end_column: Double
  var end_line: Double
  var message: String
  var path: String
  var raw_details: String
  var start_column: Double
  var start_line: Double
  var title: String
}

object ChecksListAnnotationsResponseItem {
  @scala.inline
  def apply(
    annotation_level: String,
    end_column: Double,
    end_line: Double,
    message: String,
    path: String,
    raw_details: String,
    start_column: Double,
    start_line: Double,
    title: String
  ): ChecksListAnnotationsResponseItem = {
    val __obj = js.Dynamic.literal(annotation_level = annotation_level.asInstanceOf[js.Any], end_column = end_column.asInstanceOf[js.Any], end_line = end_line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], raw_details = raw_details.asInstanceOf[js.Any], start_column = start_column.asInstanceOf[js.Any], start_line = start_line.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChecksListAnnotationsResponseItem]
  }
}

