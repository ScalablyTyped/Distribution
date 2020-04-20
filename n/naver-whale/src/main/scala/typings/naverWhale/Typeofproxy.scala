package typings.naverWhale

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
    val __obj = js.Dynamic.literal(onProxyError = onProxyError.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofproxy]
  }
}

