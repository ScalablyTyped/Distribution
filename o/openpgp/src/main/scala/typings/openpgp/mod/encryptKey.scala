package typings.openpgp.mod

import typings.openpgp.AnonKey378300062
import typings.openpgp.mod.key.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "encryptKey")
@js.native
object encryptKey extends js.Object {
  def apply(privateKey: Key, passphrase: String): js.Promise[AnonKey378300062] = js.native
  def apply(privateKey: Key, passphrase: js.Array[_]): js.Promise[AnonKey378300062] = js.native
}

