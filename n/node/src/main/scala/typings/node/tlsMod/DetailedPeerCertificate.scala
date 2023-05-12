package typings.node.tlsMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetailedPeerCertificate
  extends StObject
     with PeerCertificate {
  
  /**
    * The issuer certificate object.
    * For self-signed certificates, this may be a circular reference.
    */
  var issuerCertificate: DetailedPeerCertificate
}
object DetailedPeerCertificate {
  
  inline def apply(
    ca: Boolean,
    fingerprint: String,
    fingerprint256: String,
    fingerprint512: String,
    issuer: Certificate,
    issuerCertificate: DetailedPeerCertificate,
    raw: Buffer,
    serialNumber: String,
    subject: Certificate,
    valid_from: String,
    valid_to: String
  ): DetailedPeerCertificate = {
    val __obj = js.Dynamic.literal(ca = ca.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], fingerprint256 = fingerprint256.asInstanceOf[js.Any], fingerprint512 = fingerprint512.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], issuerCertificate = issuerCertificate.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], valid_from = valid_from.asInstanceOf[js.Any], valid_to = valid_to.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedPeerCertificate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetailedPeerCertificate] (val x: Self) extends AnyVal {
    
    inline def setIssuerCertificate(value: DetailedPeerCertificate): Self = StObject.set(x, "issuerCertificate", value.asInstanceOf[js.Any])
  }
}
