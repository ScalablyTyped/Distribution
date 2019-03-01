package typings
package pkijsLib.srcEncryptedContentInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptedContentInfo extends js.Object {
  var contentEncryptionAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default
  var eContentType: java.lang.String
  var encryptedContent: asn1jsLib.asn1jsMod.OctetString
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object EncryptedContentInfo {
  @scala.inline
  def apply(
    contentEncryptionAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default,
    eContentType: java.lang.String,
    encryptedContent: asn1jsLib.asn1jsMod.OctetString,
    fromSchema: js.Function1[js.Any, scala.Unit],
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): EncryptedContentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contentEncryptionAlgorithm")(contentEncryptionAlgorithm)
    __obj.updateDynamic("eContentType")(eContentType)
    __obj.updateDynamic("encryptedContent")(encryptedContent)
    __obj.updateDynamic("fromSchema")(fromSchema)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("toSchema")(toSchema)
    __obj.asInstanceOf[EncryptedContentInfo]
  }
}

