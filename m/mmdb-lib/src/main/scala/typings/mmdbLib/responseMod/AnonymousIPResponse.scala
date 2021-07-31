package typings.mmdbLib.responseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnonymousIPResponse
  extends StObject
     with Response {
  
  var ip_address: js.UndefOr[String] = js.undefined
  
  val is_anonymous: js.UndefOr[Boolean] = js.undefined
  
  val is_anonymous_proxy: js.UndefOr[Boolean] = js.undefined
  
  val is_anonymous_vpn: js.UndefOr[Boolean] = js.undefined
  
  val is_hosting_provider: js.UndefOr[Boolean] = js.undefined
  
  val is_public_proxy: js.UndefOr[Boolean] = js.undefined
  
  val is_residential_proxy: js.UndefOr[Boolean] = js.undefined
  
  val is_tor_exit_node: js.UndefOr[Boolean] = js.undefined
}
object AnonymousIPResponse {
  
  @scala.inline
  def apply(): AnonymousIPResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonymousIPResponse]
  }
  
  @scala.inline
  implicit class AnonymousIPResponseMutableBuilder[Self <: AnonymousIPResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIp_address(value: String): Self = StObject.set(x, "ip_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp_addressUndefined: Self = StObject.set(x, "ip_address", js.undefined)
    
    @scala.inline
    def setIs_anonymous(value: Boolean): Self = StObject.set(x, "is_anonymous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_anonymousUndefined: Self = StObject.set(x, "is_anonymous", js.undefined)
    
    @scala.inline
    def setIs_anonymous_proxy(value: Boolean): Self = StObject.set(x, "is_anonymous_proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_anonymous_proxyUndefined: Self = StObject.set(x, "is_anonymous_proxy", js.undefined)
    
    @scala.inline
    def setIs_anonymous_vpn(value: Boolean): Self = StObject.set(x, "is_anonymous_vpn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_anonymous_vpnUndefined: Self = StObject.set(x, "is_anonymous_vpn", js.undefined)
    
    @scala.inline
    def setIs_hosting_provider(value: Boolean): Self = StObject.set(x, "is_hosting_provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_hosting_providerUndefined: Self = StObject.set(x, "is_hosting_provider", js.undefined)
    
    @scala.inline
    def setIs_public_proxy(value: Boolean): Self = StObject.set(x, "is_public_proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_public_proxyUndefined: Self = StObject.set(x, "is_public_proxy", js.undefined)
    
    @scala.inline
    def setIs_residential_proxy(value: Boolean): Self = StObject.set(x, "is_residential_proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_residential_proxyUndefined: Self = StObject.set(x, "is_residential_proxy", js.undefined)
    
    @scala.inline
    def setIs_tor_exit_node(value: Boolean): Self = StObject.set(x, "is_tor_exit_node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_tor_exit_nodeUndefined: Self = StObject.set(x, "is_tor_exit_node", js.undefined)
  }
}
