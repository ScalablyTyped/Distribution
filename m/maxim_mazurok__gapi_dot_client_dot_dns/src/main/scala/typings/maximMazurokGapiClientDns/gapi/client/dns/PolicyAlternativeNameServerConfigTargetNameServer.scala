package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyAlternativeNameServerConfigTargetNameServer extends StObject {
  
  /**
    * Forwarding path for this TargetNameServer. If unset or set to DEFAULT, Cloud DNS makes forwarding decisions based on address ranges; that is, RFC1918 addresses go to the VPC
    * network, non-RFC1918 addresses go to the internet. When set to PRIVATE, Cloud DNS always sends queries through the VPC network for this target.
    */
  var forwardingPath: js.UndefOr[String] = js.undefined
  
  /** IPv4 address to forward to. */
  var ipv4Address: js.UndefOr[String] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
}
object PolicyAlternativeNameServerConfigTargetNameServer {
  
  inline def apply(): PolicyAlternativeNameServerConfigTargetNameServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyAlternativeNameServerConfigTargetNameServer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolicyAlternativeNameServerConfigTargetNameServer] (val x: Self) extends AnyVal {
    
    inline def setForwardingPath(value: String): Self = StObject.set(x, "forwardingPath", value.asInstanceOf[js.Any])
    
    inline def setForwardingPathUndefined: Self = StObject.set(x, "forwardingPath", js.undefined)
    
    inline def setIpv4Address(value: String): Self = StObject.set(x, "ipv4Address", value.asInstanceOf[js.Any])
    
    inline def setIpv4AddressUndefined: Self = StObject.set(x, "ipv4Address", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
