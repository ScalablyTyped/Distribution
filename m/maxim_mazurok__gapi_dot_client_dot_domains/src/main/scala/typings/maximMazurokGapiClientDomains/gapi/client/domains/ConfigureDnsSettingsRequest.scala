package typings.maximMazurokGapiClientDomains.gapi.client.domains

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigureDnsSettingsRequest extends StObject {
  
  /** Fields of the `DnsSettings` to update. */
  var dnsSettings: js.UndefOr[DnsSettings] = js.native
  
  /**
    * Required. The field mask describing which fields to update as a comma-separated list. For example, if only the name servers are being updated for an existing Custom DNS
    * configuration, the `update_mask` would be `"custom_dns.name_servers"`. When changing the DNS provider from one type to another, pass the new provider's field name as part of the
    * field mask. For example, when changing from a Google Domains DNS configuration to a Custom DNS configuration, the `update_mask` would be `"custom_dns"`. //
    */
  var updateMask: js.UndefOr[String] = js.native
  
  /** Validate the request without actually updating the DNS settings. */
  var validateOnly: js.UndefOr[Boolean] = js.native
}
object ConfigureDnsSettingsRequest {
  
  @scala.inline
  def apply(): ConfigureDnsSettingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigureDnsSettingsRequest]
  }
  
  @scala.inline
  implicit class ConfigureDnsSettingsRequestMutableBuilder[Self <: ConfigureDnsSettingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDnsSettings(value: DnsSettings): Self = StObject.set(x, "dnsSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsSettingsUndefined: Self = StObject.set(x, "dnsSettings", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
    
    @scala.inline
    def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
