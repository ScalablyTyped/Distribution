package typings.naverWhale.whale.pageAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupDetails extends js.Object {
  /** The html file to show in a popup. If set to the empty string (''), no popup is shown. */
  var popup: String
  /** The id of the tab for which you want to modify the page action. */
  var tabId: Double
}

object PopupDetails {
  @scala.inline
  def apply(popup: String, tabId: Double): PopupDetails = {
    val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupDetails]
  }
}

