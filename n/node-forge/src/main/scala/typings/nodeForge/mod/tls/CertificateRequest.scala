package typings.nodeForge.mod.tls

import typings.nodeForge.mod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateRequest extends js.Object {
  
  var certificate_authorities: ByteBuffer = js.native
  
  var certificate_types: ByteBuffer = js.native
}
object CertificateRequest {
  
  @scala.inline
  def apply(certificate_authorities: ByteBuffer, certificate_types: ByteBuffer): CertificateRequest = {
    val __obj = js.Dynamic.literal(certificate_authorities = certificate_authorities.asInstanceOf[js.Any], certificate_types = certificate_types.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateRequest]
  }
  
  @scala.inline
  implicit class CertificateRequestOps[Self <: CertificateRequest] (val x: Self) extends AnyVal {
    
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
    def setCertificate_authorities(value: ByteBuffer): Self = this.set("certificate_authorities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificate_types(value: ByteBuffer): Self = this.set("certificate_types", value.asInstanceOf[js.Any])
  }
}
