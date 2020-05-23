package typings.openpgp.mod

import typings.openpgp.anon.KeyKey
import typings.openpgp.mod.key.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "encryptKey")
@js.native
object encryptKey extends js.Object {
  def apply(privateKey: Key, passphrase: String): js.Promise[KeyKey] = js.native
  def apply(privateKey: Key, passphrase: js.Array[_]): js.Promise[KeyKey] = js.native
}

