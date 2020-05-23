package typings.naverWhale.whale.browserAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeBackgroundColorDetails extends js.Object {
  /** An array of four integers in the range [0,255] that make up the RGBA color of the badge. For example, opaque red is [255, 0, 0, 255]. Can also be a string with a CSS value, with opaque red being #FF0000 or #F00. */
  var color: String | typings.chrome.chrome.browserAction.ColorArray
  /** Optional. Limits the change to when a particular tab is selected. Automatically resets when the tab is closed.  */
  var tabId: js.UndefOr[Double] = js.undefined
}

object BadgeBackgroundColorDetails {
  @scala.inline
  def apply(
    color: String | typings.chrome.chrome.browserAction.ColorArray,
    tabId: js.UndefOr[Double] = js.undefined
  ): BadgeBackgroundColorDetails = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    if (!js.isUndefined(tabId)) __obj.updateDynamic("tabId")(tabId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeBackgroundColorDetails]
  }
}

