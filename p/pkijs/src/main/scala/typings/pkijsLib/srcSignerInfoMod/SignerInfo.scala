package typings
package pkijsLib.srcSignerInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignerInfo extends js.Object {
  var digestAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default
  var sid: js.Any
  var signature: asn1jsLib.asn1jsMod.OctetString
  var signatureAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default
  var signedAttrs: js.UndefOr[pkijsLib.srcSignedAndUnsignedAttributesMod.default] = js.undefined
  var unsignedAttrs: js.UndefOr[pkijsLib.srcSignedAndUnsignedAttributesMod.default] = js.undefined
  var version: scala.Double
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object SignerInfo {
  @scala.inline
  def apply(
    digestAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default,
    fromSchema: js.Function1[js.Any, scala.Unit],
    sid: js.Any,
    signature: asn1jsLib.asn1jsMod.OctetString,
    signatureAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    version: scala.Double,
    signedAttrs: pkijsLib.srcSignedAndUnsignedAttributesMod.default = null,
    unsignedAttrs: pkijsLib.srcSignedAndUnsignedAttributesMod.default = null
  ): SignerInfo = {
    val __obj = js.Dynamic.literal(digestAlgorithm = digestAlgorithm, fromSchema = fromSchema, sid = sid, signature = signature, signatureAlgorithm = signatureAlgorithm, toJSON = toJSON, toSchema = toSchema, version = version)
    if (signedAttrs != null) __obj.updateDynamic("signedAttrs")(signedAttrs)
    if (unsignedAttrs != null) __obj.updateDynamic("unsignedAttrs")(unsignedAttrs)
    __obj.asInstanceOf[SignerInfo]
  }
}

