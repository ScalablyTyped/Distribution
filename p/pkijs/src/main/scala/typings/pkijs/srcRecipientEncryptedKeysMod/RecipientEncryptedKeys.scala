package typings.pkijs.srcRecipientEncryptedKeysMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecipientEncryptedKeys extends js.Object {
  var encryptedKeys: js.Array[typings.pkijs.srcRecipientEncryptedKeyMod.default]
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object RecipientEncryptedKeys {
  @scala.inline
  def apply(
    encryptedKeys: js.Array[typings.pkijs.srcRecipientEncryptedKeyMod.default],
    fromSchema: js.Any => Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): RecipientEncryptedKeys = {
    val __obj = js.Dynamic.literal(encryptedKeys = encryptedKeys.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[RecipientEncryptedKeys]
  }
}

