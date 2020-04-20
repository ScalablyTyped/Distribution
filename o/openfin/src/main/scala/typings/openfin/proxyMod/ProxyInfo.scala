package typings.openfin.proxyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyInfo extends js.Object {
  var config: ProxyConfig
  var system: ProxySystemInfo
}

object ProxyInfo {
  @scala.inline
  def apply(config: ProxyConfig, system: ProxySystemInfo): ProxyInfo = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyInfo]
  }
}

