package typings.openfin.proxyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxySystemInfo extends js.Object {
  
  var autoConfigUrl: String = js.native
  
  var bypass: String = js.native
  
  var enabled: Boolean = js.native
  
  var proxy: String = js.native
}
object ProxySystemInfo {
  
  @scala.inline
  def apply(autoConfigUrl: String, bypass: String, enabled: Boolean, proxy: String): ProxySystemInfo = {
    val __obj = js.Dynamic.literal(autoConfigUrl = autoConfigUrl.asInstanceOf[js.Any], bypass = bypass.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxySystemInfo]
  }
  
  @scala.inline
  implicit class ProxySystemInfoOps[Self <: ProxySystemInfo] (val x: Self) extends AnyVal {
    
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
    def setAutoConfigUrl(value: String): Self = this.set("autoConfigUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBypass(value: String): Self = this.set("bypass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxy(value: String): Self = this.set("proxy", value.asInstanceOf[js.Any])
  }
}
