package typings.pkijs.srcKeyAgreeRecipientInfoMod

import typings.asn1js.asn1jsMod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyAgreeRecipientInfo extends js.Object {
  var keyEncryptionAlgorithm: typings.pkijs.srcAlgorithmIdentifierMod.default
  var originator: typings.pkijs.srcOriginatorIdentifierOrKeyMod.default
  var recipientCertificate: typings.pkijs.srcCertificateMod.default
  var recipientEncryptedKeys: typings.pkijs.srcRecipientEncryptedKeysMod.default
  var ukm: js.UndefOr[OctetString] = js.undefined
  var version: Double
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object KeyAgreeRecipientInfo {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    keyEncryptionAlgorithm: typings.pkijs.srcAlgorithmIdentifierMod.default,
    originator: typings.pkijs.srcOriginatorIdentifierOrKeyMod.default,
    recipientCertificate: typings.pkijs.srcCertificateMod.default,
    recipientEncryptedKeys: typings.pkijs.srcRecipientEncryptedKeysMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    version: Double,
    ukm: OctetString = null
  ): KeyAgreeRecipientInfo = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), keyEncryptionAlgorithm = keyEncryptionAlgorithm.asInstanceOf[js.Any], originator = originator.asInstanceOf[js.Any], recipientCertificate = recipientCertificate.asInstanceOf[js.Any], recipientEncryptedKeys = recipientEncryptedKeys.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
    if (ukm != null) __obj.updateDynamic("ukm")(ukm.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyAgreeRecipientInfo]
  }
}

