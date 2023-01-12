package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateFingerprint extends StObject {
  
  /** The SHA 256 hash, encoded in hexadecimal, of the DER x509 certificate. */
  var sha256Hash: js.UndefOr[String] = js.undefined
}
object CertificateFingerprint {
  
  inline def apply(): CertificateFingerprint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateFingerprint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CertificateFingerprint] (val x: Self) extends AnyVal {
    
    inline def setSha256Hash(value: String): Self = StObject.set(x, "sha256Hash", value.asInstanceOf[js.Any])
    
    inline def setSha256HashUndefined: Self = StObject.set(x, "sha256Hash", js.undefined)
  }
}
