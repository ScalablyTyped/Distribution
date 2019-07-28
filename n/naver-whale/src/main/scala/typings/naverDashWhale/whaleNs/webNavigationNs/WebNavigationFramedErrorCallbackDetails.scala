package typings.naverDashWhale.whaleNs.webNavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebNavigationFramedErrorCallbackDetails
  extends typings.chrome.chromeNs.webNavigationNs.WebNavigationFramedCallbackDetails {
  /** The error description. */
  var error: String
}

object WebNavigationFramedErrorCallbackDetails {
  @scala.inline
  def apply(error: String, frameId: Double, processId: Double, tabId: Double, timeStamp: Double, url: String): WebNavigationFramedErrorCallbackDetails = {
    val __obj = js.Dynamic.literal(error = error, frameId = frameId, processId = processId, tabId = tabId, timeStamp = timeStamp, url = url)
  
    __obj.asInstanceOf[WebNavigationFramedErrorCallbackDetails]
  }
}

