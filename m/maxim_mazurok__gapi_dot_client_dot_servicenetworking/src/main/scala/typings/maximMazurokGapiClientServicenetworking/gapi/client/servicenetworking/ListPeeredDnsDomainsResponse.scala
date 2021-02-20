package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPeeredDnsDomainsResponse extends StObject {
  
  /** The list of peered DNS domains. */
  var peeredDnsDomains: js.UndefOr[js.Array[PeeredDnsDomain]] = js.native
}
object ListPeeredDnsDomainsResponse {
  
  @scala.inline
  def apply(): ListPeeredDnsDomainsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPeeredDnsDomainsResponse]
  }
  
  @scala.inline
  implicit class ListPeeredDnsDomainsResponseMutableBuilder[Self <: ListPeeredDnsDomainsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPeeredDnsDomains(value: js.Array[PeeredDnsDomain]): Self = StObject.set(x, "peeredDnsDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeeredDnsDomainsUndefined: Self = StObject.set(x, "peeredDnsDomains", js.undefined)
    
    @scala.inline
    def setPeeredDnsDomainsVarargs(value: PeeredDnsDomain*): Self = StObject.set(x, "peeredDnsDomains", js.Array(value :_*))
  }
}
