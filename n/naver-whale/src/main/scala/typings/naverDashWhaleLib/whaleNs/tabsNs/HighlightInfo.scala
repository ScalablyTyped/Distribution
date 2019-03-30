package typings
package naverDashWhaleLib.whaleNs.tabsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightInfo extends js.Object {
  /** One or more tab indices to highlight. */
  var tabs: scala.Double | js.Array[scala.Double]
  /** Optional. The window that contains the tabs. */
  var windowId: js.UndefOr[scala.Double] = js.undefined
}

object HighlightInfo {
  @scala.inline
  def apply(tabs: scala.Double | js.Array[scala.Double], windowId: scala.Int | scala.Double = null): HighlightInfo = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightInfo]
  }
}

