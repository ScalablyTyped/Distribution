package typings.naverWhale.whale.webNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebNavigationFramedErrorCallbackDetails
  extends typings.chrome.chrome.webNavigation.WebNavigationFramedCallbackDetails {
  /** The error description. */
  var error: String = js.native
}

object WebNavigationFramedErrorCallbackDetails {
  @scala.inline
  def apply(error: String, frameId: Double, processId: Double, tabId: Double, timeStamp: Double, url: String): WebNavigationFramedErrorCallbackDetails = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], frameId = frameId.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebNavigationFramedErrorCallbackDetails]
  }
  @scala.inline
  implicit class WebNavigationFramedErrorCallbackDetailsOps[Self <: WebNavigationFramedErrorCallbackDetails] (val x: Self) extends AnyVal {
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
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
  }
  
}

