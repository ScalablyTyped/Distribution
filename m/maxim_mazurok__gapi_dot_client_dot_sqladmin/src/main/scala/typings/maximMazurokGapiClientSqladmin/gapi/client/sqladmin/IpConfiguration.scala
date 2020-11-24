package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpConfiguration extends js.Object {
  
  /** The list of external networks that are allowed to connect to the instance using the IP. In 'CIDR' notation, also known as 'slash' notation (for example: *192.168.100.0/24*). */
  var authorizedNetworks: js.UndefOr[js.Array[AclEntry]] = js.native
  
  /** Whether the instance is assigned a public IP address or not. */
  var ipv4Enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The resource link for the VPC network from which the Cloud SQL instance is accessible for private IP. For example, ∗/projects/myProject/global/networks/default*. This setting can be
    * updated, but it cannot be removed after it is set.
    */
  var privateNetwork: js.UndefOr[String] = js.native
  
  /** Whether SSL connections over IP are enforced or not. */
  var requireSsl: js.UndefOr[Boolean] = js.native
}
object IpConfiguration {
  
  @scala.inline
  def apply(): IpConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpConfiguration]
  }
  
  @scala.inline
  implicit class IpConfigurationOps[Self <: IpConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAuthorizedNetworksVarargs(value: AclEntry*): Self = this.set("authorizedNetworks", js.Array(value :_*))
    
    @scala.inline
    def setAuthorizedNetworks(value: js.Array[AclEntry]): Self = this.set("authorizedNetworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizedNetworks: Self = this.set("authorizedNetworks", js.undefined)
    
    @scala.inline
    def setIpv4Enabled(value: Boolean): Self = this.set("ipv4Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv4Enabled: Self = this.set("ipv4Enabled", js.undefined)
    
    @scala.inline
    def setPrivateNetwork(value: String): Self = this.set("privateNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateNetwork: Self = this.set("privateNetwork", js.undefined)
    
    @scala.inline
    def setRequireSsl(value: Boolean): Self = this.set("requireSsl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireSsl: Self = this.set("requireSsl", js.undefined)
  }
}
