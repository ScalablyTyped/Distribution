package typings.node.cryptoMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "scryptSync")
@js.native
object scryptSync extends js.Object {
  def apply(password: BinaryLike, salt: BinaryLike, keylen: Double): Buffer = js.native
  def apply(password: BinaryLike, salt: BinaryLike, keylen: Double, options: ScryptOptions): Buffer = js.native
}

