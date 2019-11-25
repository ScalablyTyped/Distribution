package typings.muiDashDatatables

import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColIndex extends js.Object {
  var colIndex: Double
  var dataIndex: Double
  var event: MouseEvent[Element, NativeMouseEvent]
  var rowIndex: Double
}

object Anon_ColIndex {
  @scala.inline
  def apply(
    colIndex: Double,
    dataIndex: Double,
    event: MouseEvent[Element, NativeMouseEvent],
    rowIndex: Double
  ): Anon_ColIndex = {
    val __obj = js.Dynamic.literal(colIndex = colIndex.asInstanceOf[js.Any], dataIndex = dataIndex.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ColIndex]
  }
}

