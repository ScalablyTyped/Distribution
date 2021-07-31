package typings.maximMazurokGapiClientDomains.gapi.client.domains

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlueRecord extends StObject {
  
  /** Required. Domain name of the host in Punycode format. */
  var hostName: js.UndefOr[String] = js.undefined
  
  /** List of IPv4 addresses corresponding to this host in the standard decimal format (e.g. `198.51.100.1`). At least one of `ipv4_address` and `ipv6_address` must be set. */
  var ipv4Addresses: js.UndefOr[js.Array[String]] = js.undefined
  
  /** List of IPv6 addresses corresponding to this host in the standard hexadecimal format (e.g. `2001:db8::`). At least one of `ipv4_address` and `ipv6_address` must be set. */
  var ipv6Addresses: js.UndefOr[js.Array[String]] = js.undefined
}
object GlueRecord {
  
  @scala.inline
  def apply(): GlueRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlueRecord]
  }
  
  @scala.inline
  implicit class GlueRecordMutableBuilder[Self <: GlueRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostName(value: String): Self = StObject.set(x, "hostName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostNameUndefined: Self = StObject.set(x, "hostName", js.undefined)
    
    @scala.inline
    def setIpv4Addresses(value: js.Array[String]): Self = StObject.set(x, "ipv4Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv4AddressesUndefined: Self = StObject.set(x, "ipv4Addresses", js.undefined)
    
    @scala.inline
    def setIpv4AddressesVarargs(value: String*): Self = StObject.set(x, "ipv4Addresses", js.Array(value :_*))
    
    @scala.inline
    def setIpv6Addresses(value: js.Array[String]): Self = StObject.set(x, "ipv6Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6AddressesUndefined: Self = StObject.set(x, "ipv6Addresses", js.undefined)
    
    @scala.inline
    def setIpv6AddressesVarargs(value: String*): Self = StObject.set(x, "ipv6Addresses", js.Array(value :_*))
  }
}
