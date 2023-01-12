package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SamlOrWsFedExternalDomainFederation
  extends StObject
     with SamlOrWsFedProvider {
  
  // Collection of domain names of the external organizations that the tenant is federating with. Supports $filter (eq).
  var domains: js.UndefOr[NullableOption[js.Array[ExternalDomainName]]] = js.undefined
}
object SamlOrWsFedExternalDomainFederation {
  
  inline def apply(): SamlOrWsFedExternalDomainFederation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SamlOrWsFedExternalDomainFederation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SamlOrWsFedExternalDomainFederation] (val x: Self) extends AnyVal {
    
    inline def setDomains(value: NullableOption[js.Array[ExternalDomainName]]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    inline def setDomainsNull: Self = StObject.set(x, "domains", null)
    
    inline def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
    
    inline def setDomainsVarargs(value: ExternalDomainName*): Self = StObject.set(x, "domains", js.Array(value*))
  }
}
