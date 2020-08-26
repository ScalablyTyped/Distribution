package typings.naverWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabMoveInfo extends js.Object {
  var fromIndex: Double = js.native
  var toIndex: Double = js.native
  var windowId: Double = js.native
}

object TabMoveInfo {
  @scala.inline
  def apply(fromIndex: Double, toIndex: Double, windowId: Double): TabMoveInfo = {
    val __obj = js.Dynamic.literal(fromIndex = fromIndex.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabMoveInfo]
  }
  @scala.inline
  implicit class TabMoveInfoOps[Self <: TabMoveInfo] (val x: Self) extends AnyVal {
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
    def setFromIndex(value: Double): Self = this.set("fromIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setToIndex(value: Double): Self = this.set("toIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindowId(value: Double): Self = this.set("windowId", value.asInstanceOf[js.Any])
  }
  
}

