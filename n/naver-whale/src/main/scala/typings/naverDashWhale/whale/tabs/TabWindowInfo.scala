package typings.naverDashWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabWindowInfo extends js.Object {
  /** The ID of the window of where the tab is located. */
  var windowId: Double
}

object TabWindowInfo {
  @scala.inline
  def apply(windowId: Double): TabWindowInfo = {
    val __obj = js.Dynamic.literal(windowId = windowId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TabWindowInfo]
  }
}

