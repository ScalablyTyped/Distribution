package typings.mz.mod.crypto

import typings.node.Buffer
import typings.node.cryptoMod.BinaryLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz", "crypto.pbkdf2Sync")
@js.native
object pbkdf2Sync extends js.Object {
  def apply(password: BinaryLike, salt: BinaryLike, iterations: Double, keylen: Double, digest: String): Buffer = js.native
}

