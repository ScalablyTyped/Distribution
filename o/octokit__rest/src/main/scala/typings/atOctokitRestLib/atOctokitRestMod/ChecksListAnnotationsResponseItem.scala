package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksListAnnotationsResponseItem extends js.Object {
  var annotation_level: java.lang.String
  var end_column: scala.Double
  var end_line: scala.Double
  var message: java.lang.String
  var path: java.lang.String
  var raw_details: java.lang.String
  var start_column: scala.Double
  var start_line: scala.Double
  var title: java.lang.String
}

object ChecksListAnnotationsResponseItem {
  @scala.inline
  def apply(
    annotation_level: java.lang.String,
    end_column: scala.Double,
    end_line: scala.Double,
    message: java.lang.String,
    path: java.lang.String,
    raw_details: java.lang.String,
    start_column: scala.Double,
    start_line: scala.Double,
    title: java.lang.String
  ): ChecksListAnnotationsResponseItem = {
    val __obj = js.Dynamic.literal(annotation_level = annotation_level, end_column = end_column, end_line = end_line, message = message, path = path, raw_details = raw_details, start_column = start_column, start_line = start_line, title = title)
  
    __obj.asInstanceOf[ChecksListAnnotationsResponseItem]
  }
}

