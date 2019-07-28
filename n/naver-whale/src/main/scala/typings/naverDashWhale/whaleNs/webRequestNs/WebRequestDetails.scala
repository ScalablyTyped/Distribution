package typings.naverDashWhale.whaleNs.webRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebRequestDetails
  extends typings.chrome.chromeNs.webRequestNs.ResourceRequest {
  /** Standard HTTP method. */
  var method: String
}

object WebRequestDetails {
  @scala.inline
  def apply(
    frameId: Double,
    method: String,
    parentFrameId: Double,
    requestId: String,
    tabId: Double,
    timeStamp: Double,
    `type`: typings.chrome.chromeNs.webRequestNs.ResourceType,
    url: String,
    initiator: String = null
  ): WebRequestDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId, method = method, parentFrameId = parentFrameId, requestId = requestId, tabId = tabId, timeStamp = timeStamp, url = url)
    __obj.updateDynamic("type")(`type`)
    if (initiator != null) __obj.updateDynamic("initiator")(initiator)
    __obj.asInstanceOf[WebRequestDetails]
  }
}

