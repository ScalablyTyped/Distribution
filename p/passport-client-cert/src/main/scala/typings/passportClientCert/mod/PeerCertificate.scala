package typings.passportClientCert.mod

import typings.node.tlsMod.Certificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeerCertificate extends js.Object {
  var fingerprint: String
  var issuer: Certificate
  var issuerInfo: Certificate
  var raw: js.Any
  var serialNumber: String
  var subject: Certificate
  var valid_from: String
  var valid_to: String
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
}

