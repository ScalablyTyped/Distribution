package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendedKeyUsageOptions extends StObject {
  
  /** Corresponds to OID 1.3.6.1.5.5.7.3.2. Officially described as "TLS WWW client authentication", though regularly used for non-WWW TLS. */
  var clientAuth: js.UndefOr[Boolean] = js.undefined
  
  /** Corresponds to OID 1.3.6.1.5.5.7.3.3. Officially described as "Signing of downloadable executable code client authentication". */
  var codeSigning: js.UndefOr[Boolean] = js.undefined
  
  /** Corresponds to OID 1.3.6.1.5.5.7.3.4. Officially described as "Email protection". */
  var emailProtection: js.UndefOr[Boolean] = js.undefined
  
  /** Corresponds to OID 1.3.6.1.5.5.7.3.9. Officially described as "Signing OCSP responses". */
  var ocspSigning: js.UndefOr[Boolean] = js.undefined
  
  /** Corresponds to OID 1.3.6.1.5.5.7.3.1. Officially described as "TLS WWW server authentication", though regularly used for non-WWW TLS. */
  var serverAuth: js.UndefOr[Boolean] = js.undefined
  
  /** Corresponds to OID 1.3.6.1.5.5.7.3.8. Officially described as "Binding the hash of an object to a time". */
  var timeStamping: js.UndefOr[Boolean] = js.undefined
}
object ExtendedKeyUsageOptions {
  
  inline def apply(): ExtendedKeyUsageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendedKeyUsageOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtendedKeyUsageOptions] (val x: Self) extends AnyVal {
    
    inline def setClientAuth(value: Boolean): Self = StObject.set(x, "clientAuth", value.asInstanceOf[js.Any])
    
    inline def setClientAuthUndefined: Self = StObject.set(x, "clientAuth", js.undefined)
    
    inline def setCodeSigning(value: Boolean): Self = StObject.set(x, "codeSigning", value.asInstanceOf[js.Any])
    
    inline def setCodeSigningUndefined: Self = StObject.set(x, "codeSigning", js.undefined)
    
    inline def setEmailProtection(value: Boolean): Self = StObject.set(x, "emailProtection", value.asInstanceOf[js.Any])
    
    inline def setEmailProtectionUndefined: Self = StObject.set(x, "emailProtection", js.undefined)
    
    inline def setOcspSigning(value: Boolean): Self = StObject.set(x, "ocspSigning", value.asInstanceOf[js.Any])
    
    inline def setOcspSigningUndefined: Self = StObject.set(x, "ocspSigning", js.undefined)
    
    inline def setServerAuth(value: Boolean): Self = StObject.set(x, "serverAuth", value.asInstanceOf[js.Any])
    
    inline def setServerAuthUndefined: Self = StObject.set(x, "serverAuth", js.undefined)
    
    inline def setTimeStamping(value: Boolean): Self = StObject.set(x, "timeStamping", value.asInstanceOf[js.Any])
    
    inline def setTimeStampingUndefined: Self = StObject.set(x, "timeStamping", js.undefined)
  }
}
