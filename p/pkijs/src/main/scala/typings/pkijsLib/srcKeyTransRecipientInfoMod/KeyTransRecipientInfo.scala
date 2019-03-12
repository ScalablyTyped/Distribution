package typings
package pkijsLib.srcKeyTransRecipientInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyTransRecipientInfo extends js.Object {
  var encryptedKey: asn1jsLib.asn1jsMod.OctetString
  var keyEncryptionAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default
  /**
    * For some reasons we need to store recipient's certificate here
    * 
    * @type {Certificate}
    * @memberOf KeyTransRecipientInfo
    */
  var recipientCertificate: pkijsLib.srcCertificateMod.default
  var rid: pkijsLib.srcRecipientIdentifierMod.default
  var version: scala.Double
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object KeyTransRecipientInfo {
  @scala.inline
  def apply(
    encryptedKey: asn1jsLib.asn1jsMod.OctetString,
    fromSchema: js.Any => scala.Unit,
    keyEncryptionAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default,
    recipientCertificate: pkijsLib.srcCertificateMod.default,
    rid: pkijsLib.srcRecipientIdentifierMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    version: scala.Double
  ): KeyTransRecipientInfo = {
    val __obj = js.Dynamic.literal(encryptedKey = encryptedKey, fromSchema = js.Any.fromFunction1(fromSchema), keyEncryptionAlgorithm = keyEncryptionAlgorithm, recipientCertificate = recipientCertificate, rid = rid, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version)
  
    __obj.asInstanceOf[KeyTransRecipientInfo]
  }
}

