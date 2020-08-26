package typings.naverWhale.whale.webNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebNavigationParentedCallbackDetails
  extends typings.chrome.chrome.webNavigation.WebNavigationFramedCallbackDetails {
  /**
    * ID of frame that wraps the frame. Set to -1 of no parent frame exists.
    * @since Chrome 24.
    */
  var parentFrameId: Double = js.native
}

object WebNavigationParentedCallbackDetails {
  @scala.inline
  def apply(
    frameId: Double,
    parentFrameId: Double,
    processId: Double,
    tabId: Double,
    timeStamp: Double,
    url: String
  ): WebNavigationParentedCallbackDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebNavigationParentedCallbackDetails]
  }
  @scala.inline
  implicit class WebNavigationParentedCallbackDetailsOps[Self <: WebNavigationParentedCallbackDetails] (val x: Self) extends AnyVal {
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
    def setParentFrameId(value: Double): Self = this.set("parentFrameId", value.asInstanceOf[js.Any])
  }
  
}

