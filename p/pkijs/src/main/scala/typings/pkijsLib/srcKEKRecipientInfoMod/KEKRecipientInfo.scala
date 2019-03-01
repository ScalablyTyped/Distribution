package typings
package pkijsLib.srcKEKRecipientInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KEKRecipientInfo extends js.Object {
  var encryptedKey: asn1jsLib.asn1jsMod.OctetString
  var kekid: pkijsLib.srcKEKIdentifierMod.default
  var keyEncryptionAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default
  var preDefinedKEK: stdLib.ArrayBuffer
  var version: scala.Double
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object KEKRecipientInfo {
  @scala.inline
  def apply(
    encryptedKey: asn1jsLib.asn1jsMod.OctetString,
    fromSchema: js.Function1[js.Any, scala.Unit],
    kekid: pkijsLib.srcKEKIdentifierMod.default,
    keyEncryptionAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default,
    preDefinedKEK: stdLib.ArrayBuffer,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    version: scala.Double
  ): KEKRecipientInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("encryptedKey")(encryptedKey)
    __obj.updateDynamic("fromSchema")(fromSchema)
    __obj.updateDynamic("kekid")(kekid)
    __obj.updateDynamic("keyEncryptionAlgorithm")(keyEncryptionAlgorithm)
    __obj.updateDynamic("preDefinedKEK")(preDefinedKEK)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("toSchema")(toSchema)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[KEKRecipientInfo]
  }
}

