package typings.naverDashWhale.whaleNs.webRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.webRequest")
@js.native
object ^ extends js.Object {
  var MAX_HANDLER_BEHAVIOR_CHANGED_CALLS_PER_10_MINUTES: Double = js.native
  var onAuthRequired: typings.chrome.chromeNs.webRequestNs.WebAuthenticationChallengeEvent = js.native
  var onBeforeRedirect: typings.chrome.chromeNs.webRequestNs.WebRedirectionResponseEvent = js.native
  var onBeforeRequest: typings.chrome.chromeNs.webRequestNs.WebRequestBodyEvent = js.native
  var onBeforeSendHeaders: typings.chrome.chromeNs.webRequestNs.WebRequestHeadersEvent = js.native
  var onCompleted: typings.chrome.chromeNs.webRequestNs.WebResponseCacheEvent = js.native
  var onErrorOccurred: typings.chrome.chromeNs.webRequestNs.WebResponseErrorEvent = js.native
  var onHeadersReceived: typings.chrome.chromeNs.webRequestNs.WebResponseHeadersEvent = js.native
  var onResponseStarted: typings.chrome.chromeNs.webRequestNs.WebResponseCacheEvent = js.native
  var onSendHeaders: typings.chrome.chromeNs.webRequestNs.WebRequestHeadersEvent = js.native
  def handlerBehaviorChanged(): Unit = js.native
  def handlerBehaviorChanged(callback: js.Function): Unit = js.native
}

