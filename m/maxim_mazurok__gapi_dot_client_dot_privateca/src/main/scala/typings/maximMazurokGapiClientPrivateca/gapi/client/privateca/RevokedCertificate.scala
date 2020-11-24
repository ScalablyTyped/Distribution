package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokedCertificate extends js.Object {
  
  /** The resource path for the Certificate in the format `projects/∗/locations/∗/certificateAuthorities/∗/certificates/ *`. */
  var certificate: js.UndefOr[String] = js.native
  
  /** The serial number of the Certificate. */
  var hexSerialNumber: js.UndefOr[String] = js.native
  
  /** The reason the Certificate was revoked. */
  var revocationReason: js.UndefOr[String] = js.native
}
object RevokedCertificate {
  
  @scala.inline
  def apply(): RevokedCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevokedCertificate]
  }
  
  @scala.inline
  implicit class RevokedCertificateOps[Self <: RevokedCertificate] (val x: Self) extends AnyVal {
    
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
    def setCertificate(value: String): Self = this.set("certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificate: Self = this.set("certificate", js.undefined)
    
    @scala.inline
    def setHexSerialNumber(value: String): Self = this.set("hexSerialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHexSerialNumber: Self = this.set("hexSerialNumber", js.undefined)
    
    @scala.inline
    def setRevocationReason(value: String): Self = this.set("revocationReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevocationReason: Self = this.set("revocationReason", js.undefined)
  }
}
