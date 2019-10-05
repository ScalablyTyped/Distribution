package typings.naverDashWhale

import typings.chrome.chrome.proxy.ProxyErrorEvent
import typings.chrome.chrome.types.ChromeSetting
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

