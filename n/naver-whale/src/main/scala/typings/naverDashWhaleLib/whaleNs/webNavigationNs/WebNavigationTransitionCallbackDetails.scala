package typings
package naverDashWhaleLib.whaleNs.webNavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebNavigationTransitionCallbackDetails
  extends chromeLib.chromeNs.webNavigationNs.WebNavigationFramedCallbackDetails {
  /**
    * A list of transition qualifiers.
    * Each element one of: "client_redirect", "server_redirect", "forward_back", or "from_address_bar"
    */
  var transitionQualifiers: js.Array[java.lang.String]
  /**
    * Cause of the navigation.
    * One of: "link", "typed", "auto_bookmark", "auto_subframe", "manual_subframe", "generated", "start_page", "form_submit", "reload", "keyword", or "keyword_generated"
    */
  var transitionType: java.lang.String
}

object WebNavigationTransitionCallbackDetails {
  @scala.inline
  def apply(
    frameId: scala.Double,
    processId: scala.Double,
    tabId: scala.Double,
    timeStamp: scala.Double,
    transitionQualifiers: js.Array[java.lang.String],
    transitionType: java.lang.String,
    url: java.lang.String
  ): WebNavigationTransitionCallbackDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId, processId = processId, tabId = tabId, timeStamp = timeStamp, transitionQualifiers = transitionQualifiers, transitionType = transitionType, url = url)
  
    __obj.asInstanceOf[WebNavigationTransitionCallbackDetails]
  }
}

