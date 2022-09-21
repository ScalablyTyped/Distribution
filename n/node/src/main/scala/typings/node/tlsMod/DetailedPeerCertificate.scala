package typings.node.tlsMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetailedPeerCertificate
  extends StObject
     with PeerCertificate {
  
  var issuerCertificate: DetailedPeerCertificate
}
object DetailedPeerCertificate {
  
  inline def apply(
    exponent: String,
    ext_key_usage: js.Array[String],
    fingerprint: String,
    fingerprint256: String,
    infoAccess: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.Dict<Array<string>> */ Any,
    issuer: Certificate,
    issuerCertificate: DetailedPeerCertificate,
    modulus: String,
    raw: Buffer,
    serialNumber: String,
    subject: Certificate,
    subjectaltname: String,
    valid_from: String,
    valid_to: String
  ): DetailedPeerCertificate = {
    val __obj = js.Dynamic.literal(exponent = exponent.asInstanceOf[js.Any], ext_key_usage = ext_key_usage.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], fingerprint256 = fingerprint256.asInstanceOf[js.Any], infoAccess = infoAccess.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], issuerCertificate = issuerCertificate.asInstanceOf[js.Any], modulus = modulus.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], subjectaltname = subjectaltname.asInstanceOf[js.Any], valid_from = valid_from.asInstanceOf[js.Any], valid_to = valid_to.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedPeerCertificate]
  }
  
  extension [Self <: DetailedPeerCertificate](x: Self) {
    
    inline def setIssuerCertificate(value: DetailedPeerCertificate): Self = StObject.set(x, "issuerCertificate", value.asInstanceOf[js.Any])
  }
}
