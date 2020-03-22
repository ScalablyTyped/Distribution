package typings.openpgp.mod

import typings.openpgp.AnonKeyKey
import typings.openpgp.mod.key.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "encryptKey")
@js.native
object encryptKey extends js.Object {
  def apply(privateKey: Key, passphrase: String): js.Promise[AnonKeyKey] = js.native
  def apply(privateKey: Key, passphrase: js.Array[_]): js.Promise[AnonKeyKey] = js.native
}

