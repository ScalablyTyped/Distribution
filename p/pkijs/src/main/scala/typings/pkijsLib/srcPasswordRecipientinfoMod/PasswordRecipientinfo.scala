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

