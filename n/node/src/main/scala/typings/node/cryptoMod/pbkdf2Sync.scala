package typings.node.cryptoMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "pbkdf2Sync")
@js.native
object pbkdf2Sync extends js.Object {
  def apply(password: BinaryLike, salt: BinaryLike, iterations: Double, keylen: Double, digest: String): Buffer = js.native
}

