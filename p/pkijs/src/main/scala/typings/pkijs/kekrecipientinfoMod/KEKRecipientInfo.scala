package typings.pkijs.kekrecipientinfoMod

import typings.asn1js.mod.OctetString
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KEKRecipientInfo extends js.Object {
  var encryptedKey: OctetString
  var kekid: typings.pkijs.kekidentifierMod.default
  var keyEncryptionAlgorithm: typings.pkijs.algorithmIdentifierMod.default
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
    kekid: typings.pkijs.kekidentifierMod.default,
    keyEncryptionAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
    preDefinedKEK: ArrayBuffer,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    version: Double
  ): KEKRecipientInfo = {
    val __obj = js.Dynamic.literal(encryptedKey = encryptedKey.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), kekid = kekid.asInstanceOf[js.Any], keyEncryptionAlgorithm = keyEncryptionAlgorithm.asInstanceOf[js.Any], preDefinedKEK = preDefinedKEK.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[KEKRecipientInfo]
  }
}

