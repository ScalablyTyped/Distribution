package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevokedCertificate extends StObject {
  
  /** The resource path for the Certificate in the format `projects/∗/locations/∗/certificateAuthorities/∗/certificates/ *`. */
  var certificate: js.UndefOr[String] = js.undefined
  
  /** The serial number of the Certificate. */
  var hexSerialNumber: js.UndefOr[String] = js.undefined
  
  /** The reason the Certificate was revoked. */
  var revocationReason: js.UndefOr[String] = js.undefined
}
object RevokedCertificate {
  
  @scala.inline
  def apply(): RevokedCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevokedCertificate]
  }
  
  @scala.inline
  implicit class RevokedCertificateMutableBuilder[Self <: RevokedCertificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificate(value: String): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
    
    @scala.inline
    def setHexSerialNumber(value: String): Self = StObject.set(x, "hexSerialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHexSerialNumberUndefined: Self = StObject.set(x, "hexSerialNumber", js.undefined)
    
    @scala.inline
    def setRevocationReason(value: String): Self = StObject.set(x, "revocationReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevocationReasonUndefined: Self = StObject.set(x, "revocationReason", js.undefined)
  }
}
