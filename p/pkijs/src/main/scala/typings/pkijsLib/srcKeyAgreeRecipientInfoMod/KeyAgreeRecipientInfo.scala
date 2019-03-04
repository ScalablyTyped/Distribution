package typings
package pkijsLib.srcKeyAgreeRecipientInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyAgreeRecipientInfo extends js.Object {
  var keyEncryptionAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default
  var originator: pkijsLib.srcOriginatorIdentifierOrKeyMod.default
  var recipientCertificate: pkijsLib.srcCertificateMod.default
  var recipientEncryptedKeys: pkijsLib.srcRecipientEncryptedKeysMod.default
  var ukm: js.UndefOr[asn1jsLib.asn1jsMod.OctetString] = js.undefined
  var version: scala.Double
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object KeyAgreeRecipientInfo {
  @scala.inline
  def apply(
    fromSchema: js.Function1[js.Any, scala.Unit],
    keyEncryptionAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default,
    originator: pkijsLib.srcOriginatorIdentifierOrKeyMod.default,
    recipientCertificate: pkijsLib.srcCertificateMod.default,
    recipientEncryptedKeys: pkijsLib.srcRecipientEncryptedKeysMod.default,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    version: scala.Double,
    ukm: asn1jsLib.asn1jsMod.OctetString = null
  ): KeyAgreeRecipientInfo = {
    val __obj = js.Dynamic.literal(fromSchema = fromSchema, keyEncryptionAlgorithm = keyEncryptionAlgorithm, originator = originator, recipientCertificate = recipientCertificate, recipientEncryptedKeys = recipientEncryptedKeys, toJSON = toJSON, toSchema = toSchema, version = version)
    if (ukm != null) __obj.updateDynamic("ukm")(ukm)
    __obj.asInstanceOf[KeyAgreeRecipientInfo]
  }
}

