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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exponent")(exponent)
    __obj.updateDynamic("ext_key_usage")(ext_key_usage)
    __obj.updateDynamic("fingerprint")(fingerprint)
    __obj.updateDynamic("infoAccess")(infoAccess)
    __obj.updateDynamic("issuer")(issuer)
    __obj.updateDynamic("issuerCertificate")(issuerCertificate)
    __obj.updateDynamic("modulus")(modulus)
    __obj.updateDynamic("raw")(raw)
    __obj.updateDynamic("serialNumber")(serialNumber)
    __obj.updateDynamic("subject")(subject)
    __obj.updateDynamic("subjectaltname")(subjectaltname)
    __obj.updateDynamic("valid_from")(valid_from)
    __obj.updateDynamic("valid_to")(valid_to)
    __obj.asInstanceOf[DetailedPeerCertificate]
  }
}

