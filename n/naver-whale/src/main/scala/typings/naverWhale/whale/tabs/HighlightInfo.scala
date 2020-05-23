package typings.naverWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightInfo extends js.Object {
  /** One or more tab indices to highlight. */
  var tabs: Double | js.Array[Double]
  /** Optional. The window that contains the tabs. */
  var windowId: js.UndefOr[Double] = js.undefined
}

object HighlightInfo {
  @scala.inline
  def apply(tabs: Double | js.Array[Double], windowId: js.UndefOr[Double] = js.undefined): HighlightInfo = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    if (!js.isUndefined(windowId)) __obj.updateDynamic("windowId")(windowId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightInfo]
  }
}

