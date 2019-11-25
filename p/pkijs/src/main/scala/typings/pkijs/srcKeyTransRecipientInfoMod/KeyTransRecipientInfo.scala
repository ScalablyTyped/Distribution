package typings.pkijs.srcKeyTransRecipientInfoMod

import typings.asn1js.asn1jsMod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyTransRecipientInfo extends js.Object {
  var encryptedKey: OctetString
  var keyEncryptionAlgorithm: typings.pkijs.srcAlgorithmIdentifierMod.default
  /**
    * For some reasons we need to store recipient's certificate here
    * 
    * @type {Certificate}
    * @memberOf KeyTransRecipientInfo
    */
  var recipientCertificate: typings.pkijs.srcCertificateMod.default
  var rid: typings.pkijs.srcRecipientIdentifierMod.default
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
    keyEncryptionAlgorithm: typings.pkijs.srcAlgorithmIdentifierMod.default,
    recipientCertificate: typings.pkijs.srcCertificateMod.default,
    rid: typings.pkijs.srcRecipientIdentifierMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    version: Double
  ): KeyTransRecipientInfo = {
    val __obj = js.Dynamic.literal(encryptedKey = encryptedKey.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), keyEncryptionAlgorithm = keyEncryptionAlgorithm.asInstanceOf[js.Any], recipientCertificate = recipientCertificate.asInstanceOf[js.Any], rid = rid.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KeyTransRecipientInfo]
  }
}

