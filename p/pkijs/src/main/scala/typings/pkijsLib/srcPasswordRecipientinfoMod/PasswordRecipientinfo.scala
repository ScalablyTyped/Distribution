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
    fromSchema: js.Function1[js.Any, scala.Unit],
    keyEncryptionAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default,
    password: stdLib.ArrayBuffer,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    version: scala.Double,
    keyDerivationAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default = null
  ): PasswordRecipientinfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("encryptedKey")(encryptedKey)
    __obj.updateDynamic("fromSchema")(fromSchema)
    __obj.updateDynamic("keyEncryptionAlgorithm")(keyEncryptionAlgorithm)
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("toSchema")(toSchema)
    __obj.updateDynamic("version")(version)
    if (keyDerivationAlgorithm != null) __obj.updateDynamic("keyDerivationAlgorithm")(keyDerivationAlgorithm)
    __obj.asInstanceOf[PasswordRecipientinfo]
  }
}

