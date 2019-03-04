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
    val __obj = js.Dynamic.literal(crlEntryExtensions = crlEntryExtensions, fromSchema = fromSchema, revocationDate = revocationDate, toJSON = toJSON, toSchema = toSchema, userCertificate = userCertificate)
  
    __obj.asInstanceOf[RevokedCertificate]
  }
}

