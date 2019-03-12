package typings
package pkijsLib.srcSignatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Signature extends js.Object {
  var certs: js.UndefOr[js.Array[pkijsLib.srcCertificateMod.default]] = js.undefined
  var signature: asn1jsLib.asn1jsMod.BitString
  var signatureAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object Signature {
  @scala.inline
  def apply(
    fromSchema: js.Any => scala.Unit,
    signature: asn1jsLib.asn1jsMod.BitString,
    signatureAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    certs: js.Array[pkijsLib.srcCertificateMod.default] = null
  ): Signature = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), signature = signature, signatureAlgorithm = signatureAlgorithm, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    if (certs != null) __obj.updateDynamic("certs")(certs)
    __obj.asInstanceOf[Signature]
  }
}

