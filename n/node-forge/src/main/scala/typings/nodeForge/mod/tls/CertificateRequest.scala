package typings.nodeForge.mod.tls

import typings.nodeForge.mod.util.ByteBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateRequest extends StObject {
  
  var certificate_authorities: ByteBuffer
  
  var certificate_types: ByteBuffer
}
object CertificateRequest {
  
  inline def apply(certificate_authorities: ByteBuffer, certificate_types: ByteBuffer): CertificateRequest = {
    val __obj = js.Dynamic.literal(certificate_authorities = certificate_authorities.asInstanceOf[js.Any], certificate_types = certificate_types.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateRequest]
  }
  
  extension [Self <: CertificateRequest](x: Self) {
    
    inline def setCertificate_authorities(value: ByteBuffer): Self = StObject.set(x, "certificate_authorities", value.asInstanceOf[js.Any])
    
    inline def setCertificate_types(value: ByteBuffer): Self = StObject.set(x, "certificate_types", value.asInstanceOf[js.Any])
  }
}
