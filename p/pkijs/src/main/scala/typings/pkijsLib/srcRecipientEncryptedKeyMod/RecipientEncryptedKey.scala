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

object RecipientEncryptedKey {
  @scala.inline
  def apply(
    encryptedKey: asn1jsLib.asn1jsMod.OctetString,
    fromSchema: js.Any => scala.Unit,
    rid: pkijsLib.srcKeyAgreeRecipientIdentifierMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): RecipientEncryptedKey = {
    val __obj = js.Dynamic.literal(encryptedKey = encryptedKey, fromSchema = js.Any.fromFunction1(fromSchema), rid = rid, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[RecipientEncryptedKey]
  }
}

