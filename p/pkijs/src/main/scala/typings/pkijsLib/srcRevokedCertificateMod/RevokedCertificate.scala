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
    fromSchema: js.Any => scala.Unit,
    revocationDate: pkijsLib.srcTimeMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    userCertificate: asn1jsLib.asn1jsMod.Integer
  ): RevokedCertificate = {
    val __obj = js.Dynamic.literal(crlEntryExtensions = crlEntryExtensions, fromSchema = js.Any.fromFunction1(fromSchema), revocationDate = revocationDate, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), userCertificate = userCertificate)
  
    __obj.asInstanceOf[RevokedCertificate]
  }
}

