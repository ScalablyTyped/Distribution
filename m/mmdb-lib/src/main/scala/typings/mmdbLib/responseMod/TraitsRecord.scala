package typings.mmdbLib.responseMod

import typings.mmdbLib.mmdbLibStrings.business
import typings.mmdbLib.mmdbLibStrings.cafe
import typings.mmdbLib.mmdbLibStrings.cellular
import typings.mmdbLib.mmdbLibStrings.college
import typings.mmdbLib.mmdbLibStrings.content_delivery_network
import typings.mmdbLib.mmdbLibStrings.dialup
import typings.mmdbLib.mmdbLibStrings.government
import typings.mmdbLib.mmdbLibStrings.hosting
import typings.mmdbLib.mmdbLibStrings.library
import typings.mmdbLib.mmdbLibStrings.military
import typings.mmdbLib.mmdbLibStrings.residential
import typings.mmdbLib.mmdbLibStrings.router
import typings.mmdbLib.mmdbLibStrings.school
import typings.mmdbLib.mmdbLibStrings.search_engine_spider
import typings.mmdbLib.mmdbLibStrings.traveler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TraitsRecord extends StObject {
  
  val autonomous_system_number: js.UndefOr[Double] = js.undefined
  
  val autonomous_system_organization: js.UndefOr[String] = js.undefined
  
  val connection_type: js.UndefOr[String] = js.undefined
  
  val domain: js.UndefOr[String] = js.undefined
  
  var ip_address: js.UndefOr[String] = js.undefined
  
  val is_anonymous: js.UndefOr[Boolean] = js.undefined
  
  val is_anonymous_proxy: js.UndefOr[Boolean] = js.undefined
  
  val is_anonymous_vpn: js.UndefOr[Boolean] = js.undefined
  
  val is_hosting_provider: js.UndefOr[Boolean] = js.undefined
  
  val is_legitimate_proxy: js.UndefOr[Boolean] = js.undefined
  
  val is_public_proxy: js.UndefOr[Boolean] = js.undefined
  
  val is_satellite_provider: js.UndefOr[Boolean] = js.undefined
  
  val is_tor_exit_node: js.UndefOr[Boolean] = js.undefined
  
  val isp: js.UndefOr[String] = js.undefined
  
  val organization: js.UndefOr[String] = js.undefined
  
  val user_type: js.UndefOr[
    business | cafe | cellular | college | content_delivery_network | dialup | government | hosting | library | military | residential | router | school | search_engine_spider | traveler
  ] = js.undefined
}
object TraitsRecord {
  
  @scala.inline
  def apply(): TraitsRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraitsRecord]
  }
  
  @scala.inline
  implicit class TraitsRecordMutableBuilder[Self <: TraitsRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutonomous_system_number(value: Double): Self = StObject.set(x, "autonomous_system_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutonomous_system_numberUndefined: Self = StObject.set(x, "autonomous_system_number", js.undefined)
    
    @scala.inline
    def setAutonomous_system_organization(value: String): Self = StObject.set(x, "autonomous_system_organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutonomous_system_organizationUndefined: Self = StObject.set(x, "autonomous_system_organization", js.undefined)
    
    @scala.inline
    def setConnection_type(value: String): Self = StObject.set(x, "connection_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnection_typeUndefined: Self = StObject.set(x, "connection_type", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
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
    def setIs_legitimate_proxy(value: Boolean): Self = StObject.set(x, "is_legitimate_proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_legitimate_proxyUndefined: Self = StObject.set(x, "is_legitimate_proxy", js.undefined)
    
    @scala.inline
    def setIs_public_proxy(value: Boolean): Self = StObject.set(x, "is_public_proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_public_proxyUndefined: Self = StObject.set(x, "is_public_proxy", js.undefined)
    
    @scala.inline
    def setIs_satellite_provider(value: Boolean): Self = StObject.set(x, "is_satellite_provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_satellite_providerUndefined: Self = StObject.set(x, "is_satellite_provider", js.undefined)
    
    @scala.inline
    def setIs_tor_exit_node(value: Boolean): Self = StObject.set(x, "is_tor_exit_node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_tor_exit_nodeUndefined: Self = StObject.set(x, "is_tor_exit_node", js.undefined)
    
    @scala.inline
    def setIsp(value: String): Self = StObject.set(x, "isp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIspUndefined: Self = StObject.set(x, "isp", js.undefined)
    
    @scala.inline
    def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    @scala.inline
    def setUser_type(
      value: business | cafe | cellular | college | content_delivery_network | dialup | government | hosting | library | military | residential | router | school | search_engine_spider | traveler
    ): Self = StObject.set(x, "user_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_typeUndefined: Self = StObject.set(x, "user_type", js.undefined)
  }
}
