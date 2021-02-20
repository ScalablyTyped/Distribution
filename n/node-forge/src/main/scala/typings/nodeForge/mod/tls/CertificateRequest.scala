package typings.nodeForge.mod.tls

import typings.nodeForge.mod.util.ByteBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateRequest extends StObject {
  
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
  implicit class CertificateRequestMutableBuilder[Self <: CertificateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificate_authorities(value: ByteBuffer): Self = StObject.set(x, "certificate_authorities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificate_types(value: ByteBuffer): Self = StObject.set(x, "certificate_types", value.asInstanceOf[js.Any])
  }
}
