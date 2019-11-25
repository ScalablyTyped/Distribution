package typings.pkijs.srcRecipientEncryptedKeyMod

import typings.asn1js.asn1jsMod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecipientEncryptedKey extends js.Object {
  var encryptedKey: OctetString
  var rid: typings.pkijs.srcKeyAgreeRecipientIdentifierMod.default
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object RecipientEncryptedKey {
  @scala.inline
  def apply(
    encryptedKey: OctetString,
    fromSchema: js.Any => Unit,
    rid: typings.pkijs.srcKeyAgreeRecipientIdentifierMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): RecipientEncryptedKey = {
    val __obj = js.Dynamic.literal(encryptedKey = encryptedKey.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), rid = rid.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[RecipientEncryptedKey]
  }
}

