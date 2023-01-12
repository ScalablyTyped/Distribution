package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pkcs12CertificateInformation extends StObject {
  
  /**
    * Represents whether the certificate is the active certificate to be used for calling the API connector. The active
    * certificate is the most recently uploaded certificate which is not yet expired but whose notBefore time is in the past.
    */
  var isActive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The certificate's expiry. This value is a NumericDate as defined in RFC 7519 (A JSON numeric value representing the
    * number of seconds from 1970-01-01T00:00:00Z UTC until the specified UTC date/time, ignoring leap seconds.)
    */
  var notAfter: js.UndefOr[Double] = js.undefined
  
  /**
    * The certificate's issue time (not before). This value is a NumericDate as defined in RFC 7519 (A JSON numeric value
    * representing the number of seconds from 1970-01-01T00:00:00Z UTC until the specified UTC date/time, ignoring leap
    * seconds.)
    */
  var notBefore: js.UndefOr[Double] = js.undefined
  
  // The certificate thumbprint.
  var thumbprint: js.UndefOr[NullableOption[String]] = js.undefined
}
object Pkcs12CertificateInformation {
  
  inline def apply(): Pkcs12CertificateInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pkcs12CertificateInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pkcs12CertificateInformation] (val x: Self) extends AnyVal {
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    inline def setNotAfter(value: Double): Self = StObject.set(x, "notAfter", value.asInstanceOf[js.Any])
    
    inline def setNotAfterUndefined: Self = StObject.set(x, "notAfter", js.undefined)
    
    inline def setNotBefore(value: Double): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
    
    inline def setNotBeforeUndefined: Self = StObject.set(x, "notBefore", js.undefined)
    
    inline def setThumbprint(value: NullableOption[String]): Self = StObject.set(x, "thumbprint", value.asInstanceOf[js.Any])
    
    inline def setThumbprintNull: Self = StObject.set(x, "thumbprint", null)
    
    inline def setThumbprintUndefined: Self = StObject.set(x, "thumbprint", js.undefined)
  }
}
