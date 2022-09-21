package typings.maximMazurokGapiClientDomains.gapi.client.domains

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Domain extends StObject {
  
  /** The domain name. Unicode domain names are expressed in Punycode format. */
  var domainName: js.UndefOr[String] = js.undefined
  
  /** The state of this domain as a `Registration` resource. */
  var resourceState: js.UndefOr[String] = js.undefined
  
  /** Price to renew the domain for one year. Only set when `resource_state` is `IMPORTABLE`. */
  var yearlyPrice: js.UndefOr[Money] = js.undefined
}
object Domain {
  
  inline def apply(): Domain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Domain]
  }
  
  extension [Self <: Domain](x: Self) {
    
    inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    inline def setResourceState(value: String): Self = StObject.set(x, "resourceState", value.asInstanceOf[js.Any])
    
    inline def setResourceStateUndefined: Self = StObject.set(x, "resourceState", js.undefined)
    
    inline def setYearlyPrice(value: Money): Self = StObject.set(x, "yearlyPrice", value.asInstanceOf[js.Any])
    
    inline def setYearlyPriceUndefined: Self = StObject.set(x, "yearlyPrice", js.undefined)
  }
}
