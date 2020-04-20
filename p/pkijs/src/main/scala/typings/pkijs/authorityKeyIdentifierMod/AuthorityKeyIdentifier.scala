package typings.pkijs.authorityKeyIdentifierMod

import typings.asn1js.mod.Integer
import typings.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorityKeyIdentifier extends js.Object {
  var authorityCertIssuer: js.Array[typings.pkijs.accessDescriptionMod.default]
  var authorityCertSerialNumber: Integer
  var keyIdentifier: OctetString
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object AuthorityKeyIdentifier {
  @scala.inline
  def apply(
    authorityCertIssuer: js.Array[typings.pkijs.accessDescriptionMod.default],
    authorityCertSerialNumber: Integer,
    fromSchema: js.Any => Unit,
    keyIdentifier: OctetString,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): AuthorityKeyIdentifier = {
    val __obj = js.Dynamic.literal(authorityCertIssuer = authorityCertIssuer.asInstanceOf[js.Any], authorityCertSerialNumber = authorityCertSerialNumber.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), keyIdentifier = keyIdentifier.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[AuthorityKeyIdentifier]
  }
}

