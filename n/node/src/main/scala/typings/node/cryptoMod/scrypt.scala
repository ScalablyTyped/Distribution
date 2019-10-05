package typings.node.cryptoMod

import typings.node.Buffer
import typings.node.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "scrypt")
@js.native
object scrypt extends js.Object {
  def apply(
    password: BinaryLike,
    salt: BinaryLike,
    keylen: Double,
    callback: js.Function2[/* err */ Error | Null, /* derivedKey */ Buffer, Unit]
  ): Unit = js.native
  def apply(
    password: BinaryLike,
    salt: BinaryLike,
    keylen: Double,
    options: ScryptOptions,
    callback: js.Function2[/* err */ Error | Null, /* derivedKey */ Buffer, Unit]
  ): Unit = js.native
}

