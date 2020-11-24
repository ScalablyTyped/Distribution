package typings.mmdbLib.responseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnonymousIPResponse extends Response {
  
  var ip_address: js.UndefOr[String] = js.native
  
  val is_anonymous: js.UndefOr[Boolean] = js.native
  
  val is_anonymous_proxy: js.UndefOr[Boolean] = js.native
  
  val is_anonymous_vpn: js.UndefOr[Boolean] = js.native
  
  val is_hosting_provider: js.UndefOr[Boolean] = js.native
  
  val is_public_proxy: js.UndefOr[Boolean] = js.native
  
  val is_residential_proxy: js.UndefOr[Boolean] = js.native
  
  val is_tor_exit_node: js.UndefOr[Boolean] = js.native
}
object AnonymousIPResponse {
  
  @scala.inline
  def apply(): AnonymousIPResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonymousIPResponse]
  }
  
  @scala.inline
  implicit class AnonymousIPResponseOps[Self <: AnonymousIPResponse] (val x: Self) extends AnyVal {
    
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
    def setIp_address(value: String): Self = this.set("ip_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIp_address: Self = this.set("ip_address", js.undefined)
    
    @scala.inline
    def setIs_anonymous(value: Boolean): Self = this.set("is_anonymous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_anonymous: Self = this.set("is_anonymous", js.undefined)
    
    @scala.inline
    def setIs_anonymous_proxy(value: Boolean): Self = this.set("is_anonymous_proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_anonymous_proxy: Self = this.set("is_anonymous_proxy", js.undefined)
    
    @scala.inline
    def setIs_anonymous_vpn(value: Boolean): Self = this.set("is_anonymous_vpn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_anonymous_vpn: Self = this.set("is_anonymous_vpn", js.undefined)
    
    @scala.inline
    def setIs_hosting_provider(value: Boolean): Self = this.set("is_hosting_provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_hosting_provider: Self = this.set("is_hosting_provider", js.undefined)
    
    @scala.inline
    def setIs_public_proxy(value: Boolean): Self = this.set("is_public_proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_public_proxy: Self = this.set("is_public_proxy", js.undefined)
    
    @scala.inline
    def setIs_residential_proxy(value: Boolean): Self = this.set("is_residential_proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_residential_proxy: Self = this.set("is_residential_proxy", js.undefined)
    
    @scala.inline
    def setIs_tor_exit_node(value: Boolean): Self = this.set("is_tor_exit_node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_tor_exit_node: Self = this.set("is_tor_exit_node", js.undefined)
  }
}
