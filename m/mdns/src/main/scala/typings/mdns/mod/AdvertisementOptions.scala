package typings.mdns.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// --- Ads ---
@js.native
trait AdvertisementOptions extends js.Object {
  
  var context: js.UndefOr[js.Any] = js.native
  
  var domain: js.UndefOr[js.Any] = js.native
  
  var flags: js.UndefOr[js.Any] = js.native
  
  var host: js.UndefOr[js.Any] = js.native
  
  var interfaceIndex: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var networkInterface: js.UndefOr[String] = js.native
  
  var txtRecord: js.UndefOr[js.Any] = js.native
}
object AdvertisementOptions {
  
  @scala.inline
  def apply(): AdvertisementOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvertisementOptions]
  }
  
  @scala.inline
  implicit class AdvertisementOptionsOps[Self <: AdvertisementOptions] (val x: Self) extends AnyVal {
    
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
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setDomain(value: js.Any): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setFlags(value: js.Any): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    
    @scala.inline
    def setHost(value: js.Any): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setInterfaceIndex(value: Double): Self = this.set("interfaceIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterfaceIndex: Self = this.set("interfaceIndex", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNetworkInterface(value: String): Self = this.set("networkInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInterface: Self = this.set("networkInterface", js.undefined)
    
    @scala.inline
    def setTxtRecord(value: js.Any): Self = this.set("txtRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTxtRecord: Self = this.set("txtRecord", js.undefined)
  }
}
