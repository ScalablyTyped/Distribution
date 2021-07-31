package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyAlternativeNameServerConfigTargetNameServer extends StObject {
  
  /**
    * Forwarding path for this TargetNameServer. If unset or set to DEFAULT, Cloud DNS will make forwarding decision based on address ranges, i.e. RFC1918 addresses go to the VPC,
    * non-RFC1918 addresses go to the Internet. When set to PRIVATE, Cloud DNS will always send queries through VPC for this target.
    */
  var forwardingPath: js.UndefOr[String] = js.undefined
  
  /** IPv4 address to forward to. */
  var ipv4Address: js.UndefOr[String] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
}
object PolicyAlternativeNameServerConfigTargetNameServer {
  
  @scala.inline
  def apply(): PolicyAlternativeNameServerConfigTargetNameServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyAlternativeNameServerConfigTargetNameServer]
  }
  
  @scala.inline
  implicit class PolicyAlternativeNameServerConfigTargetNameServerMutableBuilder[Self <: PolicyAlternativeNameServerConfigTargetNameServer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForwardingPath(value: String): Self = StObject.set(x, "forwardingPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardingPathUndefined: Self = StObject.set(x, "forwardingPath", js.undefined)
    
    @scala.inline
    def setIpv4Address(value: String): Self = StObject.set(x, "ipv4Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv4AddressUndefined: Self = StObject.set(x, "ipv4Address", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
