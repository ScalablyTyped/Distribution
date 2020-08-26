package typings.muiDatatables.anon

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColIndex extends js.Object {
  var colIndex: Double = js.native
  var dataIndex: Double = js.native
  var event: MouseEvent[Element, NativeMouseEvent] = js.native
  var rowIndex: Double = js.native
}

object ColIndex {
  @scala.inline
  def apply(
    colIndex: Double,
    dataIndex: Double,
    event: MouseEvent[Element, NativeMouseEvent],
    rowIndex: Double
  ): ColIndex = {
    val __obj = js.Dynamic.literal(colIndex = colIndex.asInstanceOf[js.Any], dataIndex = dataIndex.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColIndex]
  }
  @scala.inline
  implicit class ColIndexOps[Self <: ColIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColIndex(value: Double): Self = this.set("colIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataIndex(value: Double): Self = this.set("dataIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: MouseEvent[Element, NativeMouseEvent]): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
  }
  
}

