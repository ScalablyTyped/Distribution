package typings.openfin.proxyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxyInfo extends js.Object {
  
  var config: ProxyConfig = js.native
  
  var system: ProxySystemInfo = js.native
}
object ProxyInfo {
  
  @scala.inline
  def apply(config: ProxyConfig, system: ProxySystemInfo): ProxyInfo = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyInfo]
  }
  
  @scala.inline
  implicit class ProxyInfoOps[Self <: ProxyInfo] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: ProxyConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystem(value: ProxySystemInfo): Self = this.set("system", value.asInstanceOf[js.Any])
  }
}
