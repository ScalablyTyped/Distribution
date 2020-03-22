package typings.openfin.proxyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxySystemInfo extends js.Object {
  var autoConfigUrl: String
  var bypass: String
  var enabled: Boolean
  var proxy: String
}

object ProxySystemInfo {
  @scala.inline
  def apply(autoConfigUrl: String, bypass: String, enabled: Boolean, proxy: String): ProxySystemInfo = {
    val __obj = js.Dynamic.literal(autoConfigUrl = autoConfigUrl.asInstanceOf[js.Any], bypass = bypass.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProxySystemInfo]
  }
}

