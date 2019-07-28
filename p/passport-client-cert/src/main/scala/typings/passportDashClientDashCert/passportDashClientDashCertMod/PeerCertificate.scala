package typings.passportDashClientDashCert.passportDashClientDashCertMod

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
    val __obj = js.Dynamic.literal(fingerprint = fingerprint, issuer = issuer, issuerInfo = issuerInfo, raw = raw, serialNumber = serialNumber, subject = subject, valid_from = valid_from, valid_to = valid_to)
  
    __obj.asInstanceOf[PeerCertificate]
  }
}

