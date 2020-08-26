package typings.naverWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabRemoveInfo extends js.Object {
  /** True when the tab is being closed because its window is being closed. */
  var isWindowClosing: Boolean = js.native
  /**
    * The window whose tab is closed.
    * @since Chrome 25.
    */
  var windowId: Double = js.native
}

object TabRemoveInfo {
  @scala.inline
  def apply(isWindowClosing: Boolean, windowId: Double): TabRemoveInfo = {
    val __obj = js.Dynamic.literal(isWindowClosing = isWindowClosing.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabRemoveInfo]
  }
  @scala.inline
  implicit class TabRemoveInfoOps[Self <: TabRemoveInfo] (val x: Self) extends AnyVal {
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
    def setIsWindowClosing(value: Boolean): Self = this.set("isWindowClosing", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindowId(value: Double): Self = this.set("windowId", value.asInstanceOf[js.Any])
  }
  
}

