package typings.node.tlsMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeerCertificate extends js.Object {
  var exponent: java.lang.String
  var ext_key_usage: js.Array[java.lang.String]
  var fingerprint: java.lang.String
  var infoAccess: StringDictionary[js.UndefOr[js.Array[java.lang.String]]]
  var issuer: Certificate
  var modulus: java.lang.String
  var raw: Buffer
  var serialNumber: java.lang.String
  var subject: Certificate
  var subjectaltname: java.lang.String
  var valid_from: java.lang.String
  var valid_to: java.lang.String
}

object PeerCertificate {
  @scala.inline
  def apply(
    exponent: java.lang.String,
    ext_key_usage: js.Array[java.lang.String],
    fingerprint: java.lang.String,
    infoAccess: StringDictionary[js.UndefOr[js.Array[java.lang.String]]],
    issuer: Certificate,
    modulus: java.lang.String,
    raw: Buffer,
    serialNumber: java.lang.String,
    subject: Certificate,
    subjectaltname: java.lang.String,
    valid_from: java.lang.String,
    valid_to: java.lang.String
  ): PeerCertificate = {
    val __obj = js.Dynamic.literal(exponent = exponent.asInstanceOf[js.Any], ext_key_usage = ext_key_usage.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], infoAccess = infoAccess.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], modulus = modulus.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], subjectaltname = subjectaltname.asInstanceOf[js.Any], valid_from = valid_from.asInstanceOf[js.Any], valid_to = valid_to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PeerCertificate]
  }
}

