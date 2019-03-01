package typings
package nodeLib.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeerCertificate extends js.Object {
  var exponent: java.lang.String
  var ext_key_usage: js.Array[java.lang.String]
  var fingerprint: java.lang.String
  var infoAccess: org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Array[java.lang.String]]]
  var issuer: Certificate
  var modulus: java.lang.String
  var raw: nodeLib.Buffer
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
    infoAccess: org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Array[java.lang.String]]],
    issuer: Certificate,
    modulus: java.lang.String,
    raw: nodeLib.Buffer,
    serialNumber: java.lang.String,
    subject: Certificate,
    subjectaltname: java.lang.String,
    valid_from: java.lang.String,
    valid_to: java.lang.String
  ): PeerCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exponent")(exponent)
    __obj.updateDynamic("ext_key_usage")(ext_key_usage)
    __obj.updateDynamic("fingerprint")(fingerprint)
    __obj.updateDynamic("infoAccess")(infoAccess)
    __obj.updateDynamic("issuer")(issuer)
    __obj.updateDynamic("modulus")(modulus)
    __obj.updateDynamic("raw")(raw)
    __obj.updateDynamic("serialNumber")(serialNumber)
    __obj.updateDynamic("subject")(subject)
    __obj.updateDynamic("subjectaltname")(subjectaltname)
    __obj.updateDynamic("valid_from")(valid_from)
    __obj.updateDynamic("valid_to")(valid_to)
    __obj.asInstanceOf[PeerCertificate]
  }
}

