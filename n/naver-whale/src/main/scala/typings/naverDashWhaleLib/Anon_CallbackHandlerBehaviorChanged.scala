package typings
package naverDashWhaleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackHandlerBehaviorChanged extends js.Object {
  var MAX_HANDLER_BEHAVIOR_CHANGED_CALLS_PER_10_MINUTES: scala.Double = js.native
  var onAuthRequired: chromeLib.chromeNs.webRequestNs.WebAuthenticationChallengeEvent = js.native
  var onBeforeRedirect: chromeLib.chromeNs.webRequestNs.WebRedirectionResponseEvent = js.native
  var onBeforeRequest: chromeLib.chromeNs.webRequestNs.WebRequestBodyEvent = js.native
  var onBeforeSendHeaders: chromeLib.chromeNs.webRequestNs.WebRequestHeadersEvent = js.native
  var onCompleted: chromeLib.chromeNs.webRequestNs.WebResponseCacheEvent = js.native
  var onErrorOccurred: chromeLib.chromeNs.webRequestNs.WebResponseErrorEvent = js.native
  var onHeadersReceived: chromeLib.chromeNs.webRequestNs.WebResponseHeadersEvent = js.native
  var onResponseStarted: chromeLib.chromeNs.webRequestNs.WebResponseCacheEvent = js.native
  var onSendHeaders: chromeLib.chromeNs.webRequestNs.WebRequestHeadersEvent = js.native
  def handlerBehaviorChanged(): scala.Unit = js.native
  def handlerBehaviorChanged(callback: js.Function): scala.Unit = js.native
}

