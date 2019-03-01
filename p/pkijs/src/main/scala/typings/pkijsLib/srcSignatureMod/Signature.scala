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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromSchema")(fromSchema)
    __obj.updateDynamic("signature")(signature)
    __obj.updateDynamic("signatureAlgorithm")(signatureAlgorithm)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("toSchema")(toSchema)
    if (certs != null) __obj.updateDynamic("certs")(certs)
    __obj.asInstanceOf[Signature]
  }
}

