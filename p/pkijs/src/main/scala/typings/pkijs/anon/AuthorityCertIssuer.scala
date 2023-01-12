package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorityCertIssuer extends StObject {
  
  var authorityCertIssuer: js.UndefOr[String] = js.undefined
  
  var authorityCertSerialNumber: js.UndefOr[String] = js.undefined
  
  var keyIdentifier: js.UndefOr[String] = js.undefined
}
object AuthorityCertIssuer {
  
  inline def apply(): AuthorityCertIssuer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorityCertIssuer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthorityCertIssuer] (val x: Self) extends AnyVal {
    
    inline def setAuthorityCertIssuer(value: String): Self = StObject.set(x, "authorityCertIssuer", value.asInstanceOf[js.Any])
    
    inline def setAuthorityCertIssuerUndefined: Self = StObject.set(x, "authorityCertIssuer", js.undefined)
    
    inline def setAuthorityCertSerialNumber(value: String): Self = StObject.set(x, "authorityCertSerialNumber", value.asInstanceOf[js.Any])
    
    inline def setAuthorityCertSerialNumberUndefined: Self = StObject.set(x, "authorityCertSerialNumber", js.undefined)
    
    inline def setKeyIdentifier(value: String): Self = StObject.set(x, "keyIdentifier", value.asInstanceOf[js.Any])
    
    inline def setKeyIdentifierUndefined: Self = StObject.set(x, "keyIdentifier", js.undefined)
  }
}
