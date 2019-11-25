package typings.naverDashWhale.whale.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebResponseDetails
  extends typings.chrome.chrome.webRequest.ResourceRequest {
  /**
    * Standard HTTP status code returned by the server.
    * @since Chrome 43.
    */
  var statusCode: Double
  /** HTTP status line of the response or the 'HTTP/0.9 200 OK' string for HTTP/0.9 responses (i.e., responses that lack a status line). */
  var statusLine: String
}

object WebResponseDetails {
  @scala.inline
  def apply(
    frameId: Double,
    parentFrameId: Double,
    requestId: String,
    statusCode: Double,
    statusLine: String,
    tabId: Double,
    timeStamp: Double,
    `type`: typings.chrome.chrome.webRequest.ResourceType,
    url: String,
    initiator: String = null
  ): WebResponseDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusLine = statusLine.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (initiator != null) __obj.updateDynamic("initiator")(initiator.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebResponseDetails]
  }
}

