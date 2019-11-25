package typings.naverDashWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveProperties extends js.Object {
  /** The position to move the window to. -1 will place the tab at the end of the window. */
  var index: Double
  /** Optional. Defaults to the window the tab is currently in. */
  var windowId: js.UndefOr[Double] = js.undefined
}

object MoveProperties {
  @scala.inline
  def apply(index: Double, windowId: Int | Double = null): MoveProperties = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveProperties]
  }
}

