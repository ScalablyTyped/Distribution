package typings.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReconfigureTrustRequest extends js.Object {
  
  /** Required. The target DNS server IP addresses to resolve the remote domain involved in the trust. */
  var targetDnsIpAddresses: js.UndefOr[js.Array[String]] = js.native
  
  /** Required. The fully-qualified target domain name which will be in trust with current domain. */
  var targetDomainName: js.UndefOr[String] = js.native
}
object ReconfigureTrustRequest {
  
  @scala.inline
  def apply(): ReconfigureTrustRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReconfigureTrustRequest]
  }
  
  @scala.inline
  implicit class ReconfigureTrustRequestOps[Self <: ReconfigureTrustRequest] (val x: Self) extends AnyVal {
    
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
    def setTargetDnsIpAddressesVarargs(value: String*): Self = this.set("targetDnsIpAddresses", js.Array(value :_*))
    
    @scala.inline
    def setTargetDnsIpAddresses(value: js.Array[String]): Self = this.set("targetDnsIpAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetDnsIpAddresses: Self = this.set("targetDnsIpAddresses", js.undefined)
    
    @scala.inline
    def setTargetDomainName(value: String): Self = this.set("targetDomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetDomainName: Self = this.set("targetDomainName", js.undefined)
  }
}
