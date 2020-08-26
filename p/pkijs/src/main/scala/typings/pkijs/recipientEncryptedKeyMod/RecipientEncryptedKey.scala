package typings.pkijs.recipientEncryptedKeyMod

import typings.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecipientEncryptedKey extends js.Object {
  var encryptedKey: OctetString = js.native
  var rid: typings.pkijs.keyAgreeRecipientIdentifierMod.default = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object RecipientEncryptedKey {
  @scala.inline
  def apply(
    encryptedKey: OctetString,
    fromSchema: js.Any => Unit,
    rid: typings.pkijs.keyAgreeRecipientIdentifierMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): RecipientEncryptedKey = {
    val __obj = js.Dynamic.literal(encryptedKey = encryptedKey.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), rid = rid.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[RecipientEncryptedKey]
  }
  @scala.inline
  implicit class RecipientEncryptedKeyOps[Self <: RecipientEncryptedKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEncryptedKey(value: OctetString): Self = this.set("encryptedKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    @scala.inline
    def setRid(value: typings.pkijs.keyAgreeRecipientIdentifierMod.default): Self = this.set("rid", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
  }
  
}

