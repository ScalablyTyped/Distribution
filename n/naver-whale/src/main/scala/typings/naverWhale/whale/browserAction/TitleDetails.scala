package typings.naverWhale.whale.browserAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TitleDetails extends js.Object {
  /** Optional. Limits the change to when a particular tab is selected. Automatically resets when the tab is closed.  */
  var tabId: js.UndefOr[Double] = js.undefined
  /** The string the browser action should display when moused over. */
  var title: String
}

object TitleDetails {
  @scala.inline
  def apply(title: String, tabId: js.UndefOr[Double] = js.undefined): TitleDetails = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(tabId)) __obj.updateDynamic("tabId")(tabId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleDetails]
  }
}

