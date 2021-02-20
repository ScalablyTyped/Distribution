package typings.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReconfigureTrustRequest extends StObject {
  
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
  implicit class ReconfigureTrustRequestMutableBuilder[Self <: ReconfigureTrustRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetDnsIpAddresses(value: js.Array[String]): Self = StObject.set(x, "targetDnsIpAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDnsIpAddressesUndefined: Self = StObject.set(x, "targetDnsIpAddresses", js.undefined)
    
    @scala.inline
    def setTargetDnsIpAddressesVarargs(value: String*): Self = StObject.set(x, "targetDnsIpAddresses", js.Array(value :_*))
    
    @scala.inline
    def setTargetDomainName(value: String): Self = StObject.set(x, "targetDomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDomainNameUndefined: Self = StObject.set(x, "targetDomainName", js.undefined)
  }
}
