package typings
package pkijsLib.srcPasswordRecipientinfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordRecipientinfo extends js.Object {
  var encryptedKey: asn1jsLib.asn1jsMod.OctetString
  var keyDerivationAlgorithm: js.UndefOr[pkijsLib.srcAlgorithmIdentifierMod.default] = js.undefined
  var keyEncryptionAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default
  var password: stdLib.ArrayBuffer
  var version: scala.Double
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object PasswordRecipientinfo {
  @scala.inline
  def apply(
    encryptedKey: asn1jsLib.asn1jsMod.OctetString,
    fromSchema: js.Any => scala.Unit,
    keyEncryptionAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default,
    password: stdLib.ArrayBuffer,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    version: scala.Double,
    keyDerivationAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default = null
  ): PasswordRecipientinfo = {
    val __obj = js.Dynamic.literal(encryptedKey = encryptedKey, fromSchema = js.Any.fromFunction1(fromSchema), keyEncryptionAlgorithm = keyEncryptionAlgorithm, password = password, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version)
    if (keyDerivationAlgorithm != null) __obj.updateDynamic("keyDerivationAlgorithm")(keyDerivationAlgorithm)
    __obj.asInstanceOf[PasswordRecipientinfo]
  }
}

