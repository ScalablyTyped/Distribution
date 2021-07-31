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
  
  @scala.inline
  def apply(): ExtendedKeyUsageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendedKeyUsageOptions]
  }
  
  @scala.inline
  implicit class ExtendedKeyUsageOptionsMutableBuilder[Self <: ExtendedKeyUsageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientAuth(value: Boolean): Self = StObject.set(x, "clientAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientAuthUndefined: Self = StObject.set(x, "clientAuth", js.undefined)
    
    @scala.inline
    def setCodeSigning(value: Boolean): Self = StObject.set(x, "codeSigning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeSigningUndefined: Self = StObject.set(x, "codeSigning", js.undefined)
    
    @scala.inline
    def setEmailProtection(value: Boolean): Self = StObject.set(x, "emailProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailProtectionUndefined: Self = StObject.set(x, "emailProtection", js.undefined)
    
    @scala.inline
    def setOcspSigning(value: Boolean): Self = StObject.set(x, "ocspSigning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOcspSigningUndefined: Self = StObject.set(x, "ocspSigning", js.undefined)
    
    @scala.inline
    def setServerAuth(value: Boolean): Self = StObject.set(x, "serverAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerAuthUndefined: Self = StObject.set(x, "serverAuth", js.undefined)
    
    @scala.inline
    def setTimeStamping(value: Boolean): Self = StObject.set(x, "timeStamping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStampingUndefined: Self = StObject.set(x, "timeStamping", js.undefined)
  }
}
