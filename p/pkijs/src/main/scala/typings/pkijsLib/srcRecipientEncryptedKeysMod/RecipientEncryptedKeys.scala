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

