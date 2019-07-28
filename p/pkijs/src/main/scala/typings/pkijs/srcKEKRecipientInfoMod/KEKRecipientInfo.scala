package typings.pkijs.srcKEKRecipientInfoMod

import typings.asn1js.asn1jsMod.OctetString
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KEKRecipientInfo extends js.Object {
  var encryptedKey: OctetString
  var kekid: typings.pkijs.srcKEKIdentifierMod.default
  var keyEncryptionAlgorithm: typings.pkijs.srcAlgorithmIdentifierMod.default
  var preDefinedKEK: ArrayBuffer
  var version: Double
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object KEKRecipientInfo {
  @scala.inline
  def apply(
    encryptedKey: OctetString,
    fromSchema: js.Any => Unit,
    kekid: typings.pkijs.srcKEKIdentifierMod.default,
    keyEncryptionAlgorithm: typings.pkijs.srcAlgorithmIdentifierMod.default,
    preDefinedKEK: ArrayBuffer,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    version: Double
  ): KEKRecipientInfo = {
    val __obj = js.Dynamic.literal(encryptedKey = encryptedKey, fromSchema = js.Any.fromFunction1(fromSchema), kekid = kekid, keyEncryptionAlgorithm = keyEncryptionAlgorithm, preDefinedKEK = preDefinedKEK, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version)
  
    __obj.asInstanceOf[KEKRecipientInfo]
  }
}

