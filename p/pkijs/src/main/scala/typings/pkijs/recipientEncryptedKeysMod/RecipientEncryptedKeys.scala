package typings.pkijs.recipientEncryptedKeysMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecipientEncryptedKeys extends js.Object {
  var encryptedKeys: js.Array[typings.pkijs.recipientEncryptedKeyMod.default] = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object RecipientEncryptedKeys {
  @scala.inline
  def apply(
    encryptedKeys: js.Array[typings.pkijs.recipientEncryptedKeyMod.default],
    fromSchema: js.Any => Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): RecipientEncryptedKeys = {
    val __obj = js.Dynamic.literal(encryptedKeys = encryptedKeys.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[RecipientEncryptedKeys]
  }
  @scala.inline
  implicit class RecipientEncryptedKeysOps[Self <: RecipientEncryptedKeys] (val x: Self) extends AnyVal {
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
    def setEncryptedKeysVarargs(value: typings.pkijs.recipientEncryptedKeyMod.default*): Self = this.set("encryptedKeys", js.Array(value :_*))
    @scala.inline
    def setEncryptedKeys(value: js.Array[typings.pkijs.recipientEncryptedKeyMod.default]): Self = this.set("encryptedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
  }
  
}

