package typings.naverDashWhale

import typings.chrome.chromeNs.proxyNs.ProxyErrorEvent
import typings.chrome.chromeNs.typesNs.ChromeSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofproxy extends js.Object {
  var onProxyError: ProxyErrorEvent
  var settings: ChromeSetting
}

object Typeofproxy {
  @scala.inline
  def apply(onProxyError: ProxyErrorEvent, settings: ChromeSetting): Typeofproxy = {
    val __obj = js.Dynamic.literal(onProxyError = onProxyError, settings = settings)
  
    __obj.asInstanceOf[Typeofproxy]
  }
}

