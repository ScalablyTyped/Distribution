package typings.openpgp.openpgpMod.crypto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "crypto.cfb")
@js.native
object cfb extends js.Object {
  def decrypt(algo: js.Any, key: js.Any, ciphertext: js.Any, iv: js.Any): js.Promise[_] = js.native
  def encrypt(algo: js.Any, key: js.Any, plaintext: js.Any, iv: js.Any): js.Any = js.native
}

