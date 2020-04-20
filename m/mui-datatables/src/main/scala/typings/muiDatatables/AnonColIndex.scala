package typings.muiDatatables

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColIndex extends js.Object {
  var colIndex: Double
  var dataIndex: Double
  var event: MouseEvent[Element, NativeMouseEvent]
  var rowIndex: Double
}

object AnonColIndex {
  @scala.inline
  def apply(
    colIndex: Double,
    dataIndex: Double,
    event: MouseEvent[Element, NativeMouseEvent],
    rowIndex: Double
  ): AnonColIndex = {
    val __obj = js.Dynamic.literal(colIndex = colIndex.asInstanceOf[js.Any], dataIndex = dataIndex.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColIndex]
  }
}

