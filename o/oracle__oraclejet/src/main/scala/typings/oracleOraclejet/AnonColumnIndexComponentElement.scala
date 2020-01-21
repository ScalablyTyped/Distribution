package typings.oracleOraclejet

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnIndexComponentElement extends js.Object {
  var columnIndex: Double
  var componentElement: Element
  var data: js.Object
  var index: Double
  var key: js.Any
  var mode: String
  var row: js.Object
}

object AnonColumnIndexComponentElement {
  @scala.inline
  def apply(
    columnIndex: Double,
    componentElement: Element,
    data: js.Object,
    index: Double,
    key: js.Any,
    mode: String,
    row: js.Object
  ): AnonColumnIndexComponentElement = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColumnIndexComponentElement]
  }
}

