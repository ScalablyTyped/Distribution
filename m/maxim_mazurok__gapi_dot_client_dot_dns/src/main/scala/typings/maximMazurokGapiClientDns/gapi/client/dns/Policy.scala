package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Policy extends StObject {
  
  /**
    * Sets an alternative name server for the associated networks. When specified, all DNS queries are forwarded to a name server that you choose. Names such as .internal are not
    * available when an alternative name server is specified.
    */
  var alternativeNameServerConfig: js.UndefOr[PolicyAlternativeNameServerConfig] = js.undefined
  
  /** A mutable string of at most 1024 characters associated with this resource for the user's convenience. Has no effect on the policy's function. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Allows networks bound to this policy to receive DNS queries sent by VMs or applications over VPN connections. When enabled, a virtual IP address is allocated from each of the
    * subnetworks that are bound to this policy.
    */
  var enableInboundForwarding: js.UndefOr[Boolean] = js.undefined
  
  /** Controls whether logging is enabled for the networks bound to this policy. Defaults to no logging if not set. */
  var enableLogging: js.UndefOr[Boolean] = js.undefined
  
  /** Unique identifier for the resource; defined by the server (output only). */
  var id: js.UndefOr[String] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  /** User-assigned name for this policy. */
  var name: js.UndefOr[String] = js.undefined
  
  /** List of network names specifying networks to which this policy is applied. */
  var networks: js.UndefOr[js.Array[PolicyNetwork]] = js.undefined
}
object Policy {
  
  inline def apply(): Policy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Policy]
  }
  
  extension [Self <: Policy](x: Self) {
    
    inline def setAlternativeNameServerConfig(value: PolicyAlternativeNameServerConfig): Self = StObject.set(x, "alternativeNameServerConfig", value.asInstanceOf[js.Any])
    
    inline def setAlternativeNameServerConfigUndefined: Self = StObject.set(x, "alternativeNameServerConfig", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnableInboundForwarding(value: Boolean): Self = StObject.set(x, "enableInboundForwarding", value.asInstanceOf[js.Any])
    
    inline def setEnableInboundForwardingUndefined: Self = StObject.set(x, "enableInboundForwarding", js.undefined)
    
    inline def setEnableLogging(value: Boolean): Self = StObject.set(x, "enableLogging", value.asInstanceOf[js.Any])
    
    inline def setEnableLoggingUndefined: Self = StObject.set(x, "enableLogging", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetworks(value: js.Array[PolicyNetwork]): Self = StObject.set(x, "networks", value.asInstanceOf[js.Any])
    
    inline def setNetworksUndefined: Self = StObject.set(x, "networks", js.undefined)
    
    inline def setNetworksVarargs(value: PolicyNetwork*): Self = StObject.set(x, "networks", js.Array(value*))
  }
}
