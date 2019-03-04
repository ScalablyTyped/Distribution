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
    fromSchema: js.Function1[js.Any, scala.Unit],
    signature: asn1jsLib.asn1jsMod.BitString,
    signatureAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    certs: js.Array[pkijsLib.srcCertificateMod.default] = null
  ): Signature = {
    val __obj = js.Dynamic.literal(fromSchema = fromSchema, signature = signature, signatureAlgorithm = signatureAlgorithm, toJSON = toJSON, toSchema = toSchema)
    if (certs != null) __obj.updateDynamic("certs")(certs)
    __obj.asInstanceOf[Signature]
  }
}

