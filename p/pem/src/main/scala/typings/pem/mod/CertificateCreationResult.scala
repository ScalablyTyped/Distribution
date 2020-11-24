package typings.pem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateCreationResult extends js.Object {
  
  var certificate: js.Any = js.native
  
  var clientKey: String = js.native
  
  var csr: String = js.native
  
  var serviceKey: String = js.native
}
object CertificateCreationResult {
  
  @scala.inline
  def apply(certificate: js.Any, clientKey: String, csr: String, serviceKey: String): CertificateCreationResult = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], clientKey = clientKey.asInstanceOf[js.Any], csr = csr.asInstanceOf[js.Any], serviceKey = serviceKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateCreationResult]
  }
  
  @scala.inline
  implicit class CertificateCreationResultOps[Self <: CertificateCreationResult] (val x: Self) extends AnyVal {
    
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
    def setCertificate(value: js.Any): Self = this.set("certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientKey(value: String): Self = this.set("clientKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsr(value: String): Self = this.set("csr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceKey(value: String): Self = this.set("serviceKey", value.asInstanceOf[js.Any])
  }
}
