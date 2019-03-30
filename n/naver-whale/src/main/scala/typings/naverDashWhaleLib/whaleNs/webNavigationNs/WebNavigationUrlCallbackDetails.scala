package typings
package naverDashWhaleLib.whaleNs.webNavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebNavigationUrlCallbackDetails
  extends chromeLib.chromeNs.webNavigationNs.WebNavigationCallbackDetails {
  var url: java.lang.String
}

object WebNavigationUrlCallbackDetails {
  @scala.inline
  def apply(tabId: scala.Double, timeStamp: scala.Double, url: java.lang.String): WebNavigationUrlCallbackDetails = {
    val __obj = js.Dynamic.literal(tabId = tabId, timeStamp = timeStamp, url = url)
  
    __obj.asInstanceOf[WebNavigationUrlCallbackDetails]
  }
}

