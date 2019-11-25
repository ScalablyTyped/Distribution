package typings.naverDashWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabRemoveInfo extends js.Object {
  /** True when the tab is being closed because its window is being closed. */
  var isWindowClosing: Boolean
  /**
    * The window whose tab is closed.
    * @since Chrome 25.
    */
  var windowId: Double
}

object TabRemoveInfo {
  @scala.inline
  def apply(isWindowClosing: Boolean, windowId: Double): TabRemoveInfo = {
    val __obj = js.Dynamic.literal(isWindowClosing = isWindowClosing.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TabRemoveInfo]
  }
}

