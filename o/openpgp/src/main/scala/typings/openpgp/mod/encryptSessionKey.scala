package typings.openpgp.mod

import typings.openpgp.mod.key.Key
import typings.openpgp.mod.message.Message
import typings.std.Date
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "encryptSessionKey")
@js.native
object encryptSessionKey extends js.Object {
  def apply(
    data: Uint8Array,
    algorithm: String,
    aeadAlgorithm: js.UndefOr[String],
    publicKeys: js.UndefOr[Key | js.Array[Key]],
    passwords: js.UndefOr[String | js.Array[String]],
    wildcard: js.UndefOr[Boolean],
    date: js.UndefOr[Date],
    toUserIds: js.UndefOr[js.Array[_]]
  ): js.Promise[Message] = js.native
}

