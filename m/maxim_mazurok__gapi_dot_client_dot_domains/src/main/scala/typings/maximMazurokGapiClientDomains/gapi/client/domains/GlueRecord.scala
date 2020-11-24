package typings.maximMazurokGapiClientDomains.gapi.client.domains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlueRecord extends js.Object {
  
  /** Required. Domain name of the host in Punycode format. */
  var hostName: js.UndefOr[String] = js.native
  
  /** List of IPv4 addresses corresponding to this host in the standard decimal format (e.g. `198.51.100.1`). At least one of `ipv4_address` and `ipv6_address` must be set. */
  var ipv4Addresses: js.UndefOr[js.Array[String]] = js.native
  
  /** List of IPv6 addresses corresponding to this host in the standard hexadecimal format (e.g. `2001:db8::`). At least one of `ipv4_address` and `ipv6_address` must be set. */
  var ipv6Addresses: js.UndefOr[js.Array[String]] = js.native
}
object GlueRecord {
  
  @scala.inline
  def apply(): GlueRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlueRecord]
  }
  
  @scala.inline
  implicit class GlueRecordOps[Self <: GlueRecord] (val x: Self) extends AnyVal {
    
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
    def setHostName(value: String): Self = this.set("hostName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostName: Self = this.set("hostName", js.undefined)
    
    @scala.inline
    def setIpv4AddressesVarargs(value: String*): Self = this.set("ipv4Addresses", js.Array(value :_*))
    
    @scala.inline
    def setIpv4Addresses(value: js.Array[String]): Self = this.set("ipv4Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv4Addresses: Self = this.set("ipv4Addresses", js.undefined)
    
    @scala.inline
    def setIpv6AddressesVarargs(value: String*): Self = this.set("ipv6Addresses", js.Array(value :_*))
    
    @scala.inline
    def setIpv6Addresses(value: js.Array[String]): Self = this.set("ipv6Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv6Addresses: Self = this.set("ipv6Addresses", js.undefined)
  }
}
