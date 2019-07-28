package typings.pkijs.srcSignerInfoMod

import typings.asn1js.asn1jsMod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignerInfo extends js.Object {
  var digestAlgorithm: typings.pkijs.srcAlgorithmIdentifierMod.default
  var sid: js.Any
  var signature: OctetString
  var signatureAlgorithm: typings.pkijs.srcAlgorithmIdentifierMod.default
  var signedAttrs: js.UndefOr[typings.pkijs.srcSignedAndUnsignedAttributesMod.default] = js.undefined
  var unsignedAttrs: js.UndefOr[typings.pkijs.srcSignedAndUnsignedAttributesMod.default] = js.undefined
  var version: Double
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object SignerInfo {
  @scala.inline
  def apply(
    digestAlgorithm: typings.pkijs.srcAlgorithmIdentifierMod.default,
    fromSchema: js.Any => Unit,
    sid: js.Any,
    signature: OctetString,
    signatureAlgorithm: typings.pkijs.srcAlgorithmIdentifierMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    version: Double,
    signedAttrs: typings.pkijs.srcSignedAndUnsignedAttributesMod.default = null,
    unsignedAttrs: typings.pkijs.srcSignedAndUnsignedAttributesMod.default = null
  ): SignerInfo = {
    val __obj = js.Dynamic.literal(digestAlgorithm = digestAlgorithm, fromSchema = js.Any.fromFunction1(fromSchema), sid = sid, signature = signature, signatureAlgorithm = signatureAlgorithm, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version)
    if (signedAttrs != null) __obj.updateDynamic("signedAttrs")(signedAttrs)
    if (unsignedAttrs != null) __obj.updateDynamic("unsignedAttrs")(unsignedAttrs)
    __obj.asInstanceOf[SignerInfo]
  }
}

