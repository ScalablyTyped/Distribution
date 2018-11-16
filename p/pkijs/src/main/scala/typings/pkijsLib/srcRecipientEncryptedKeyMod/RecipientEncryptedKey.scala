package typings
package pkijsLib.srcRecipientEncryptedKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RecipientEncryptedKey extends js.Object {
  var encryptedKey: asn1jsLib.asn1jsMod.OctetString
  var rid: pkijsLib.srcKeyAgreeRecipientIdentifierMod.default
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

