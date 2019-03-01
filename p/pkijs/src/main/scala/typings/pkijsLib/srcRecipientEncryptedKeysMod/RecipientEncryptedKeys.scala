package typings
package pkijsLib.srcRecipientEncryptedKeysMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecipientEncryptedKeys extends js.Object {
  var encryptedKeys: js.Array[pkijsLib.srcRecipientEncryptedKeyMod.default]
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object RecipientEncryptedKeys {
  @scala.inline
  def apply(
    encryptedKeys: js.Array[pkijsLib.srcRecipientEncryptedKeyMod.default],
    fromSchema: js.Function1[js.Any, scala.Unit],
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): RecipientEncryptedKeys = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("encryptedKeys")(encryptedKeys)
    __obj.updateDynamic("fromSchema")(fromSchema)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("toSchema")(toSchema)
    __obj.asInstanceOf[RecipientEncryptedKeys]
  }
}

