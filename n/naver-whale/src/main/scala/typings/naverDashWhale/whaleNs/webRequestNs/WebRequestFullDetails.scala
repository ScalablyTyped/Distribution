package typings.naverDashWhale.whaleNs.webRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.chrome.chromeNs.webRequestNs.WebRequestBodyDetails because var conflicts: frameId, initiator, method, parentFrameId, requestId, tabId, timeStamp, `type`, url. Inlined requestBody */ trait WebRequestFullDetails
  extends typings.chrome.chromeNs.webRequestNs.WebRequestHeadersDetails {
  /**
    * Contains the HTTP request body data. Only provided if extraInfoSpec contains 'requestBody'.
    * @since Chrome 23.
    */
  var requestBody: typings.chrome.chromeNs.webRequestNs.WebRequestBody
}

object WebRequestFullDetails {
  @scala.inline
  def apply(
    frameId: Double,
    method: String,
    parentFrameId: Double,
    requestBody: typings.chrome.chromeNs.webRequestNs.WebRequestBody,
    requestId: String,
    tabId: Double,
    timeStamp: Double,
    `type`: typings.chrome.chromeNs.webRequestNs.ResourceType,
    url: String,
    initiator: String = null,
    requestHeaders: js.Array[typings.chrome.chromeNs.webRequestNs.HttpHeader] = null
  ): WebRequestFullDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId, method = method, parentFrameId = parentFrameId, requestBody = requestBody, requestId = requestId, tabId = tabId, timeStamp = timeStamp, url = url)
    __obj.updateDynamic("type")(`type`)
    if (initiator != null) __obj.updateDynamic("initiator")(initiator)
    if (requestHeaders != null) __obj.updateDynamic("requestHeaders")(requestHeaders)
    __obj.asInstanceOf[WebRequestFullDetails]
  }
}

