package typings.naverWhale.whale.browserAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupDetails extends js.Object {
  /** The html file to show in a popup. If set to the empty string (''), no popup is shown. */
  var popup: String = js.native
  /** Optional. Limits the change to when a particular tab is selected. Automatically resets when the tab is closed.  */
  var tabId: js.UndefOr[Double] = js.native
}

object PopupDetails {
  @scala.inline
  def apply(popup: String): PopupDetails = {
    val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupDetails]
  }
  @scala.inline
  implicit class PopupDetailsOps[Self <: PopupDetails] (val x: Self) extends AnyVal {
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
    def setPopup(value: String): Self = this.set("popup", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabId(value: Double): Self = this.set("tabId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabId: Self = this.set("tabId", js.undefined)
  }
  
}

