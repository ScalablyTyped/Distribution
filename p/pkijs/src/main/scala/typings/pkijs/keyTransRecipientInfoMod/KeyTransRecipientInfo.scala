package typings.pkijs.keyTransRecipientInfoMod

import typings.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyTransRecipientInfo extends js.Object {
  var encryptedKey: OctetString
  var keyEncryptionAlgorithm: typings.pkijs.algorithmIdentifierMod.default
  /**
    * For some reasons we need to store recipient's certificate here
    *
    * @type {Certificate}
    * @memberOf KeyTransRecipientInfo
    */
  var recipientCertificate: typings.pkijs.certificateMod.default
  var rid: typings.pkijs.recipientIdentifierMod.default
  var version: Double
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object KeyTransRecipientInfo {
  @scala.inline
  def apply(
    encryptedKey: OctetString,
    fromSchema: js.Any => Unit,
    keyEncryptionAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
    recipientCertificate: typings.pkijs.certificateMod.default,
    rid: typings.pkijs.recipientIdentifierMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    version: Double
  ): KeyTransRecipientInfo = {
    val __obj = js.Dynamic.literal(encryptedKey = encryptedKey.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), keyEncryptionAlgorithm = keyEncryptionAlgorithm.asInstanceOf[js.Any], recipientCertificate = recipientCertificate.asInstanceOf[js.Any], rid = rid.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyTransRecipientInfo]
  }
}

