package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateFingerprint extends js.Object {
  
  /** The SHA 256 hash, encoded in hexadecimal, of the DER x509 certificate. */
  var sha256Hash: js.UndefOr[String] = js.native
}
object CertificateFingerprint {
  
  @scala.inline
  def apply(): CertificateFingerprint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateFingerprint]
  }
  
  @scala.inline
  implicit class CertificateFingerprintOps[Self <: CertificateFingerprint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSha256Hash(value: String): Self = this.set("sha256Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSha256Hash: Self = this.set("sha256Hash", js.undefined)
  }
}
