package typings.pkijs.mod

import typings.asn1js.mod.IntegerJson
import typings.asn1js.mod.OctetStringJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorityKeyIdentifierJson extends StObject {
  
  var authorityCertIssuer: js.UndefOr[js.Array[GeneralNameJson]] = js.undefined
  
  var authorityCertSerialNumber: js.UndefOr[IntegerJson] = js.undefined
  
  var keyIdentifier: js.UndefOr[OctetStringJson] = js.undefined
}
object AuthorityKeyIdentifierJson {
  
  inline def apply(): AuthorityKeyIdentifierJson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorityKeyIdentifierJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthorityKeyIdentifierJson] (val x: Self) extends AnyVal {
    
    inline def setAuthorityCertIssuer(value: js.Array[GeneralNameJson]): Self = StObject.set(x, "authorityCertIssuer", value.asInstanceOf[js.Any])
    
    inline def setAuthorityCertIssuerUndefined: Self = StObject.set(x, "authorityCertIssuer", js.undefined)
    
    inline def setAuthorityCertIssuerVarargs(value: GeneralNameJson*): Self = StObject.set(x, "authorityCertIssuer", js.Array(value*))
    
    inline def setAuthorityCertSerialNumber(value: IntegerJson): Self = StObject.set(x, "authorityCertSerialNumber", value.asInstanceOf[js.Any])
    
    inline def setAuthorityCertSerialNumberUndefined: Self = StObject.set(x, "authorityCertSerialNumber", js.undefined)
    
    inline def setKeyIdentifier(value: OctetStringJson): Self = StObject.set(x, "keyIdentifier", value.asInstanceOf[js.Any])
    
    inline def setKeyIdentifierUndefined: Self = StObject.set(x, "keyIdentifier", js.undefined)
  }
}
