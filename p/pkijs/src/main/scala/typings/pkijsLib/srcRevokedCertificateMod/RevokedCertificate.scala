package typings
package pkijsLib.srcRevokedCertificateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevokedCertificate extends js.Object {
  var crlEntryExtensions: pkijsLib.srcExtensionsMod.default
  var revocationDate: pkijsLib.srcTimeMod.default
  var userCertificate: asn1jsLib.asn1jsMod.Integer
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object RevokedCertificate {
  @scala.inline
  def apply(
    crlEntryExtensions: pkijsLib.srcExtensionsMod.default,
    fromSchema: js.Function1[js.Any, scala.Unit],
    revocationDate: pkijsLib.srcTimeMod.default,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    userCertificate: asn1jsLib.asn1jsMod.Integer
  ): RevokedCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("crlEntryExtensions")(crlEntryExtensions)
    __obj.updateDynamic("fromSchema")(fromSchema)
    __obj.updateDynamic("revocationDate")(revocationDate)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("toSchema")(toSchema)
    __obj.updateDynamic("userCertificate")(userCertificate)
    __obj.asInstanceOf[RevokedCertificate]
  }
}

