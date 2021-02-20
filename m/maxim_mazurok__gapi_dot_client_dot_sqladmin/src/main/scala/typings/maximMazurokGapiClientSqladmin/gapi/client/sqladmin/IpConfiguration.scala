package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpConfiguration extends StObject {
  
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
  implicit class IpConfigurationMutableBuilder[Self <: IpConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizedNetworks(value: js.Array[AclEntry]): Self = StObject.set(x, "authorizedNetworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizedNetworksUndefined: Self = StObject.set(x, "authorizedNetworks", js.undefined)
    
    @scala.inline
    def setAuthorizedNetworksVarargs(value: AclEntry*): Self = StObject.set(x, "authorizedNetworks", js.Array(value :_*))
    
    @scala.inline
    def setIpv4Enabled(value: Boolean): Self = StObject.set(x, "ipv4Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv4EnabledUndefined: Self = StObject.set(x, "ipv4Enabled", js.undefined)
    
    @scala.inline
    def setPrivateNetwork(value: String): Self = StObject.set(x, "privateNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateNetworkUndefined: Self = StObject.set(x, "privateNetwork", js.undefined)
    
    @scala.inline
    def setRequireSsl(value: Boolean): Self = StObject.set(x, "requireSsl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireSslUndefined: Self = StObject.set(x, "requireSsl", js.undefined)
  }
}
