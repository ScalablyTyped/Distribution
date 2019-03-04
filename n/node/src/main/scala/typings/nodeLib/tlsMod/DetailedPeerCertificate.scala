package typings
package nodeLib.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailedPeerCertificate extends PeerCertificate {
  var issuerCertificate: DetailedPeerCertificate
}

object DetailedPeerCertificate {
  @scala.inline
  def apply(
    exponent: java.lang.String,
    ext_key_usage: js.Array[java.lang.String],
    fingerprint: java.lang.String,
    infoAccess: org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Array[java.lang.String]]],
    issuer: Certificate,
    issuerCertificate: DetailedPeerCertificate,
    modulus: java.lang.String,
    raw: nodeLib.Buffer,
    serialNumber: java.lang.String,
    subject: Certificate,
    subjectaltname: java.lang.String,
    valid_from: java.lang.String,
    valid_to: java.lang.String
  ): DetailedPeerCertificate = {
    val __obj = js.Dynamic.literal(exponent = exponent, ext_key_usage = ext_key_usage, fingerprint = fingerprint, infoAccess = infoAccess, issuer = issuer, issuerCertificate = issuerCertificate, modulus = modulus, raw = raw, serialNumber = serialNumber, subject = subject, subjectaltname = subjectaltname, valid_from = valid_from, valid_to = valid_to)
  
    __obj.asInstanceOf[DetailedPeerCertificate]
  }
}

