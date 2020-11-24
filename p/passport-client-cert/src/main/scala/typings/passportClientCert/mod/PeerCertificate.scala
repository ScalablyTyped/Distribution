package typings.passportClientCert.mod

import typings.node.tlsMod.Certificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeerCertificate extends js.Object {
  
  var fingerprint: String = js.native
  
  var issuer: Certificate = js.native
  
  var issuerInfo: Certificate = js.native
  
  var raw: js.Any = js.native
  
  var serialNumber: String = js.native
  
  var subject: Certificate = js.native
  
  var valid_from: String = js.native
  
  var valid_to: String = js.native
}
object PeerCertificate {
  
  @scala.inline
  def apply(
    fingerprint: String,
    issuer: Certificate,
    issuerInfo: Certificate,
    raw: js.Any,
    serialNumber: String,
    subject: Certificate,
    valid_from: String,
    valid_to: String
  ): PeerCertificate = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], issuerInfo = issuerInfo.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], valid_from = valid_from.asInstanceOf[js.Any], valid_to = valid_to.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerCertificate]
  }
  
  @scala.inline
  implicit class PeerCertificateOps[Self <: PeerCertificate] (val x: Self) extends AnyVal {
    
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
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuer(value: Certificate): Self = this.set("issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuerInfo(value: Certificate): Self = this.set("issuerInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: js.Any): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNumber(value: String): Self = this.set("serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: Certificate): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValid_from(value: String): Self = this.set("valid_from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValid_to(value: String): Self = this.set("valid_to", value.asInstanceOf[js.Any])
  }
}
