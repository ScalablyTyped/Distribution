package typings.nodeForge.mod.tls

import typings.nodeForge.mod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateRequest extends js.Object {
  var certificate_authorities: ByteBuffer
  var certificate_types: ByteBuffer
}

object CertificateRequest {
  @scala.inline
  def apply(certificate_authorities: ByteBuffer, certificate_types: ByteBuffer): CertificateRequest = {
    val __obj = js.Dynamic.literal(certificate_authorities = certificate_authorities.asInstanceOf[js.Any], certificate_types = certificate_types.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CertificateRequest]
  }
}

