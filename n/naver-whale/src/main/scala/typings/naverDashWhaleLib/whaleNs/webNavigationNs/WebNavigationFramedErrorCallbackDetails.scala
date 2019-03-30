package typings
package naverDashWhaleLib.whaleNs.webNavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebNavigationFramedErrorCallbackDetails
  extends chromeLib.chromeNs.webNavigationNs.WebNavigationFramedCallbackDetails {
  /** The error description. */
  var error: java.lang.String
}

object WebNavigationFramedErrorCallbackDetails {
  @scala.inline
  def apply(
    error: java.lang.String,
    frameId: scala.Double,
    processId: scala.Double,
    tabId: scala.Double,
    timeStamp: scala.Double,
    url: java.lang.String
  ): WebNavigationFramedErrorCallbackDetails = {
    val __obj = js.Dynamic.literal(error = error, frameId = frameId, processId = processId, tabId = tabId, timeStamp = timeStamp, url = url)
  
    __obj.asInstanceOf[WebNavigationFramedErrorCallbackDetails]
  }
}

