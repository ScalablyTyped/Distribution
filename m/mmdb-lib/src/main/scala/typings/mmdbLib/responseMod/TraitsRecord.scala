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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TraitsRecord extends js.Object {
  
  val autonomous_system_number: js.UndefOr[Double] = js.native
  
  val autonomous_system_organization: js.UndefOr[String] = js.native
  
  val connection_type: js.UndefOr[String] = js.native
  
  val domain: js.UndefOr[String] = js.native
  
  var ip_address: js.UndefOr[String] = js.native
  
  val is_anonymous: js.UndefOr[Boolean] = js.native
  
  val is_anonymous_proxy: js.UndefOr[Boolean] = js.native
  
  val is_anonymous_vpn: js.UndefOr[Boolean] = js.native
  
  val is_hosting_provider: js.UndefOr[Boolean] = js.native
  
  val is_legitimate_proxy: js.UndefOr[Boolean] = js.native
  
  val is_public_proxy: js.UndefOr[Boolean] = js.native
  
  val is_satellite_provider: js.UndefOr[Boolean] = js.native
  
  val is_tor_exit_node: js.UndefOr[Boolean] = js.native
  
  val isp: js.UndefOr[String] = js.native
  
  val organization: js.UndefOr[String] = js.native
  
  val user_type: js.UndefOr[
    business | cafe | cellular | college | content_delivery_network | dialup | government | hosting | library | military | residential | router | school | search_engine_spider | traveler
  ] = js.native
}
object TraitsRecord {
  
  @scala.inline
  def apply(): TraitsRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraitsRecord]
  }
  
  @scala.inline
  implicit class TraitsRecordOps[Self <: TraitsRecord] (val x: Self) extends AnyVal {
    
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
    def setAutonomous_system_number(value: Double): Self = this.set("autonomous_system_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutonomous_system_number: Self = this.set("autonomous_system_number", js.undefined)
    
    @scala.inline
    def setAutonomous_system_organization(value: String): Self = this.set("autonomous_system_organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutonomous_system_organization: Self = this.set("autonomous_system_organization", js.undefined)
    
    @scala.inline
    def setConnection_type(value: String): Self = this.set("connection_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnection_type: Self = this.set("connection_type", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
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
    def setIs_legitimate_proxy(value: Boolean): Self = this.set("is_legitimate_proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_legitimate_proxy: Self = this.set("is_legitimate_proxy", js.undefined)
    
    @scala.inline
    def setIs_public_proxy(value: Boolean): Self = this.set("is_public_proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_public_proxy: Self = this.set("is_public_proxy", js.undefined)
    
    @scala.inline
    def setIs_satellite_provider(value: Boolean): Self = this.set("is_satellite_provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_satellite_provider: Self = this.set("is_satellite_provider", js.undefined)
    
    @scala.inline
    def setIs_tor_exit_node(value: Boolean): Self = this.set("is_tor_exit_node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_tor_exit_node: Self = this.set("is_tor_exit_node", js.undefined)
    
    @scala.inline
    def setIsp(value: String): Self = this.set("isp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsp: Self = this.set("isp", js.undefined)
    
    @scala.inline
    def setOrganization(value: String): Self = this.set("organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganization: Self = this.set("organization", js.undefined)
    
    @scala.inline
    def setUser_type(
      value: business | cafe | cellular | college | content_delivery_network | dialup | government | hosting | library | military | residential | router | school | search_engine_spider | traveler
    ): Self = this.set("user_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser_type: Self = this.set("user_type", js.undefined)
  }
}
