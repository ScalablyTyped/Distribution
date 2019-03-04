package typings
package passportDashClientDashCertLib.passportDashClientDashCertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeerCertificate extends js.Object {
  var fingerprint: java.lang.String
  var issuer: nodeLib.tlsMod.Certificate
  var issuerInfo: nodeLib.tlsMod.Certificate
  var raw: js.Any
  var serialNumber: java.lang.String
  var subject: nodeLib.tlsMod.Certificate
  var valid_from: java.lang.String
  var valid_to: java.lang.String
}

object PeerCertificate {
  @scala.inline
  def apply(
    fingerprint: java.lang.String,
    issuer: nodeLib.tlsMod.Certificate,
    issuerInfo: nodeLib.tlsMod.Certificate,
    raw: js.Any,
    serialNumber: java.lang.String,
    subject: nodeLib.tlsMod.Certificate,
    valid_from: java.lang.String,
    valid_to: java.lang.String
  ): PeerCertificate = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint, issuer = issuer, issuerInfo = issuerInfo, raw = raw, serialNumber = serialNumber, subject = subject, valid_from = valid_from, valid_to = valid_to)
  
    __obj.asInstanceOf[PeerCertificate]
  }
}

