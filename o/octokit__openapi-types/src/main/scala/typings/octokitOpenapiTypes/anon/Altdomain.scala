package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Altdomain extends StObject {
  
  var alt_domain: js.UndefOr[Caaerror | Null] = js.undefined
  
  var domain: js.UndefOr[Caaerror] = js.undefined
}
object Altdomain {
  
  inline def apply(): Altdomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Altdomain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Altdomain] (val x: Self) extends AnyVal {
    
    inline def setAlt_domain(value: Caaerror): Self = StObject.set(x, "alt_domain", value.asInstanceOf[js.Any])
    
    inline def setAlt_domainNull: Self = StObject.set(x, "alt_domain", null)
    
    inline def setAlt_domainUndefined: Self = StObject.set(x, "alt_domain", js.undefined)
    
    inline def setDomain(value: Caaerror): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
  }
}
