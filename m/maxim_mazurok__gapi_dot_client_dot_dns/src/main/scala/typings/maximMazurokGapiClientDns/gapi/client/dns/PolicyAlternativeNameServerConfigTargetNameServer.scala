package typings.maximMazurokGapiClientDns.gapi.client.dns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyAlternativeNameServerConfigTargetNameServer extends js.Object {
  
  /**
    * Forwarding path for this TargetNameServer. If unset or set to DEFAULT, Cloud DNS will make forwarding decision based on address ranges, i.e. RFC1918 addresses go to the VPC,
    * non-RFC1918 addresses go to the Internet. When set to PRIVATE, Cloud DNS will always send queries through VPC for this target.
    */
  var forwardingPath: js.UndefOr[String] = js.native
  
  /** IPv4 address to forward to. */
  var ipv4Address: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
}
object PolicyAlternativeNameServerConfigTargetNameServer {
  
  @scala.inline
  def apply(): PolicyAlternativeNameServerConfigTargetNameServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyAlternativeNameServerConfigTargetNameServer]
  }
  
  @scala.inline
  implicit class PolicyAlternativeNameServerConfigTargetNameServerOps[Self <: PolicyAlternativeNameServerConfigTargetNameServer] (val x: Self) extends AnyVal {
    
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
    def setForwardingPath(value: String): Self = this.set("forwardingPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForwardingPath: Self = this.set("forwardingPath", js.undefined)
    
    @scala.inline
    def setIpv4Address(value: String): Self = this.set("ipv4Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv4Address: Self = this.set("ipv4Address", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
