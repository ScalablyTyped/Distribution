package typings.pkijs.srcSignatureMod

import typings.asn1js.asn1jsMod.BitString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Signature extends js.Object {
  var certs: js.UndefOr[js.Array[typings.pkijs.srcCertificateMod.default]] = js.undefined
  var signature: BitString
  var signatureAlgorithm: typings.pkijs.srcAlgorithmIdentifierMod.default
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object Signature {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    signature: BitString,
    signatureAlgorithm: typings.pkijs.srcAlgorithmIdentifierMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    certs: js.Array[typings.pkijs.srcCertificateMod.default] = null
  ): Signature = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), signature = signature, signatureAlgorithm = signatureAlgorithm, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    if (certs != null) __obj.updateDynamic("certs")(certs)
    __obj.asInstanceOf[Signature]
  }
}

