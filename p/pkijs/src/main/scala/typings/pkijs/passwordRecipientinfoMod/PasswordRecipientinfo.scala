package typings.pkijs.passwordRecipientinfoMod

import typings.asn1js.mod.OctetString
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordRecipientinfo extends js.Object {
  var encryptedKey: OctetString
  var keyDerivationAlgorithm: js.UndefOr[typings.pkijs.algorithmIdentifierMod.default] = js.undefined
  var keyEncryptionAlgorithm: typings.pkijs.algorithmIdentifierMod.default
  var password: ArrayBuffer
  var version: Double
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object PasswordRecipientinfo {
  @scala.inline
  def apply(
    encryptedKey: OctetString,
    fromSchema: js.Any => Unit,
    keyEncryptionAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
    password: ArrayBuffer,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    version: Double,
    keyDerivationAlgorithm: typings.pkijs.algorithmIdentifierMod.default = null
  ): PasswordRecipientinfo = {
    val __obj = js.Dynamic.literal(encryptedKey = encryptedKey.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), keyEncryptionAlgorithm = keyEncryptionAlgorithm.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
    if (keyDerivationAlgorithm != null) __obj.updateDynamic("keyDerivationAlgorithm")(keyDerivationAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordRecipientinfo]
  }
}

