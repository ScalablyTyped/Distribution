package typings.pkijs.signatureMod

import typings.asn1js.mod.BitString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Signature extends js.Object {
  var certs: js.UndefOr[js.Array[typings.pkijs.certificateMod.default]] = js.undefined
  var signature: BitString
  var signatureAlgorithm: typings.pkijs.algorithmIdentifierMod.default
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object Signature {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    signature: BitString,
    signatureAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    certs: js.Array[typings.pkijs.certificateMod.default] = null
  ): Signature = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), signature = signature.asInstanceOf[js.Any], signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    if (certs != null) __obj.updateDynamic("certs")(certs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Signature]
  }
}

