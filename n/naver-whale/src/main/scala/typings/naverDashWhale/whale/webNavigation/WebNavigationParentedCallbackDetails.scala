package typings.naverDashWhale.whale.webNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebNavigationParentedCallbackDetails
  extends typings.chrome.chrome.webNavigation.WebNavigationFramedCallbackDetails {
  /**
    * ID of frame that wraps the frame. Set to -1 of no parent frame exists.
    * @since Chrome 24.
    */
  var parentFrameId: Double
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
    val __obj = js.Dynamic.literal(frameId = frameId, parentFrameId = parentFrameId, processId = processId, tabId = tabId, timeStamp = timeStamp, url = url)
  
    __obj.asInstanceOf[WebNavigationParentedCallbackDetails]
  }
}

