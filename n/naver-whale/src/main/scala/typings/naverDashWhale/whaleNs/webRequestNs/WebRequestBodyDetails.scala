package typings.naverDashWhale.whaleNs.webRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebRequestBodyDetails
  extends typings.chrome.chromeNs.webRequestNs.WebRequestDetails {
  /**
    * Contains the HTTP request body data. Only provided if extraInfoSpec contains 'requestBody'.
    * @since Chrome 23.
    */
  var requestBody: typings.chrome.chromeNs.webRequestNs.WebRequestBody
}

object WebRequestBodyDetails {
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
    initiator: String = null
  ): WebRequestBodyDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId, method = method, parentFrameId = parentFrameId, requestBody = requestBody, requestId = requestId, tabId = tabId, timeStamp = timeStamp, url = url)
    __obj.updateDynamic("type")(`type`)
    if (initiator != null) __obj.updateDynamic("initiator")(initiator)
    __obj.asInstanceOf[WebRequestBodyDetails]
  }
}

