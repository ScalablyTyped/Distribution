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
    fromSchema: js.Function1[js.Any, scala.Unit],
    rid: pkijsLib.srcKeyAgreeRecipientIdentifierMod.default,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): RecipientEncryptedKey = {
    val __obj = js.Dynamic.literal(encryptedKey = encryptedKey, fromSchema = fromSchema, rid = rid, toJSON = toJSON, toSchema = toSchema)
  
    __obj.asInstanceOf[RecipientEncryptedKey]
  }
}

