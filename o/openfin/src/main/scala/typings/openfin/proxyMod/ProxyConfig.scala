package typings.openfin.proxyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyConfig extends js.Object {
  var proxyAddress: String = js.native
  var proxyPort: Double = js.native
  var `type`: String = js.native
}

object ProxyConfig {
  @scala.inline
  def apply(proxyAddress: String, proxyPort: Double, `type`: String): ProxyConfig = {
    val __obj = js.Dynamic.literal(proxyAddress = proxyAddress.asInstanceOf[js.Any], proxyPort = proxyPort.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyConfig]
  }
  @scala.inline
  implicit class ProxyConfigOps[Self <: ProxyConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProxyAddress(value: String): Self = this.set("proxyAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setProxyPort(value: Double): Self = this.set("proxyPort", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

