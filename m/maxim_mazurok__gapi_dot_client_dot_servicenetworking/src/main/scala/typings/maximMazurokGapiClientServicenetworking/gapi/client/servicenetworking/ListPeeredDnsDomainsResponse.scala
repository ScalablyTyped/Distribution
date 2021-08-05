package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPeeredDnsDomainsResponse extends StObject {
  
  /** The list of peered DNS domains. */
  var peeredDnsDomains: js.UndefOr[js.Array[PeeredDnsDomain]] = js.undefined
}
object ListPeeredDnsDomainsResponse {
  
  inline def apply(): ListPeeredDnsDomainsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPeeredDnsDomainsResponse]
  }
  
  extension [Self <: ListPeeredDnsDomainsResponse](x: Self) {
    
    inline def setPeeredDnsDomains(value: js.Array[PeeredDnsDomain]): Self = StObject.set(x, "peeredDnsDomains", value.asInstanceOf[js.Any])
    
    inline def setPeeredDnsDomainsUndefined: Self = StObject.set(x, "peeredDnsDomains", js.undefined)
    
    inline def setPeeredDnsDomainsVarargs(value: PeeredDnsDomain*): Self = StObject.set(x, "peeredDnsDomains", js.Array(value :_*))
  }
}
