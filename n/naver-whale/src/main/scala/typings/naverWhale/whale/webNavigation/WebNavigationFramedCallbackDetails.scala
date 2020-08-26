package typings.naverWhale.whale.webNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebNavigationFramedCallbackDetails
  extends typings.chrome.chrome.webNavigation.WebNavigationUrlCallbackDetails {
  /** 0 indicates the navigation happens in the tab content window; a positive value indicates navigation in a subframe. Frame IDs are unique for a given tab and process. */
  var frameId: Double = js.native
  /**
    * The ID of the process runs the renderer for this tab.
    * @since Chrome 22.
    */
  var processId: Double = js.native
}

object WebNavigationFramedCallbackDetails {
  @scala.inline
  def apply(frameId: Double, processId: Double, tabId: Double, timeStamp: Double, url: String): WebNavigationFramedCallbackDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebNavigationFramedCallbackDetails]
  }
  @scala.inline
  implicit class WebNavigationFramedCallbackDetailsOps[Self <: WebNavigationFramedCallbackDetails] (val x: Self) extends AnyVal {
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
    def setFrameId(value: Double): Self = this.set("frameId", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcessId(value: Double): Self = this.set("processId", value.asInstanceOf[js.Any])
  }
  
}

