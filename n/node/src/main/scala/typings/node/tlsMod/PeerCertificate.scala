package typings.node.tlsMod

import typings.node.Buffer
import typings.node.NodeJS.Dict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeerCertificate extends js.Object {
  
  var exponent: String = js.native
  
  var ext_key_usage: js.Array[String] = js.native
  
  var fingerprint: String = js.native
  
  var fingerprint256: String = js.native
  
  var infoAccess: Dict[js.Array[String]] = js.native
  
  var issuer: Certificate = js.native
  
  var modulus: String = js.native
  
  var raw: Buffer = js.native
  
  var serialNumber: String = js.native
  
  var subject: Certificate = js.native
  
  var subjectaltname: String = js.native
  
  var valid_from: String = js.native
  
  var valid_to: String = js.native
}
object PeerCertificate {
  
  @scala.inline
  def apply(
    exponent: String,
    ext_key_usage: js.Array[String],
    fingerprint: String,
    fingerprint256: String,
    infoAccess: Dict[js.Array[String]],
    issuer: Certificate,
    modulus: String,
    raw: Buffer,
    serialNumber: String,
    subject: Certificate,
    subjectaltname: String,
    valid_from: String,
    valid_to: String
  ): PeerCertificate = {
    val __obj = js.Dynamic.literal(exponent = exponent.asInstanceOf[js.Any], ext_key_usage = ext_key_usage.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], fingerprint256 = fingerprint256.asInstanceOf[js.Any], infoAccess = infoAccess.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], modulus = modulus.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], subjectaltname = subjectaltname.asInstanceOf[js.Any], valid_from = valid_from.asInstanceOf[js.Any], valid_to = valid_to.asInstanceOf[js.Any])
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
    def setExponent(value: String): Self = this.set("exponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExt_key_usageVarargs(value: String*): Self = this.set("ext_key_usage", js.Array(value :_*))
    
    @scala.inline
    def setExt_key_usage(value: js.Array[String]): Self = this.set("ext_key_usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprint256(value: String): Self = this.set("fingerprint256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoAccess(value: Dict[js.Array[String]]): Self = this.set("infoAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuer(value: Certificate): Self = this.set("issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModulus(value: String): Self = this.set("modulus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: Buffer): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNumber(value: String): Self = this.set("serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: Certificate): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectaltname(value: String): Self = this.set("subjectaltname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValid_from(value: String): Self = this.set("valid_from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValid_to(value: String): Self = this.set("valid_to", value.asInstanceOf[js.Any])
  }
}
