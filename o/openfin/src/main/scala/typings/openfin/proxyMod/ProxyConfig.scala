package typings.openfin.proxyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyConfig extends js.Object {
  var proxyAddress: String
  var proxyPort: Double
  var `type`: String
}

object ProxyConfig {
  @scala.inline
  def apply(proxyAddress: String, proxyPort: Double, `type`: String): ProxyConfig = {
    val __obj = js.Dynamic.literal(proxyAddress = proxyAddress.asInstanceOf[js.Any], proxyPort = proxyPort.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyConfig]
  }
}

