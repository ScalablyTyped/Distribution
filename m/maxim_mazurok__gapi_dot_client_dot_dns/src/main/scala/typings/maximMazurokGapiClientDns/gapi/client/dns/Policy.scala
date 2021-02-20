package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Policy extends StObject {
  
  /**
    * Sets an alternative name server for the associated networks. When specified, all DNS queries are forwarded to a name server that you choose. Names such as .internal are not
    * available when an alternative name server is specified.
    */
  var alternativeNameServerConfig: js.UndefOr[PolicyAlternativeNameServerConfig] = js.native
  
  /** A mutable string of at most 1024 characters associated with this resource for the user's convenience. Has no effect on the policy's function. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Allows networks bound to this policy to receive DNS queries sent by VMs or applications over VPN connections. When enabled, a virtual IP address will be allocated from each of the
    * sub-networks that are bound to this policy.
    */
  var enableInboundForwarding: js.UndefOr[Boolean] = js.native
  
  /** Controls whether logging is enabled for the networks bound to this policy. Defaults to no logging if not set. */
  var enableLogging: js.UndefOr[Boolean] = js.native
  
  /** Unique identifier for the resource; defined by the server (output only). */
  var id: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  /** User assigned name for this policy. */
  var name: js.UndefOr[String] = js.native
  
  /** List of network names specifying networks to which this policy is applied. */
  var networks: js.UndefOr[js.Array[PolicyNetwork]] = js.native
}
object Policy {
  
  @scala.inline
  def apply(): Policy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Policy]
  }
  
  @scala.inline
  implicit class PolicyMutableBuilder[Self <: Policy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternativeNameServerConfig(value: PolicyAlternativeNameServerConfig): Self = StObject.set(x, "alternativeNameServerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternativeNameServerConfigUndefined: Self = StObject.set(x, "alternativeNameServerConfig", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEnableInboundForwarding(value: Boolean): Self = StObject.set(x, "enableInboundForwarding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableInboundForwardingUndefined: Self = StObject.set(x, "enableInboundForwarding", js.undefined)
    
    @scala.inline
    def setEnableLogging(value: Boolean): Self = StObject.set(x, "enableLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableLoggingUndefined: Self = StObject.set(x, "enableLogging", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNetworks(value: js.Array[PolicyNetwork]): Self = StObject.set(x, "networks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworksUndefined: Self = StObject.set(x, "networks", js.undefined)
    
    @scala.inline
    def setNetworksVarargs(value: PolicyNetwork*): Self = StObject.set(x, "networks", js.Array(value :_*))
  }
}
