package typings.mz.cryptoMod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/crypto", "pseudoRandomBytes")
@js.native
object pseudoRandomBytes extends js.Object {
  def apply(size: Double): js.Promise[Buffer] = js.native
  def apply(size: Double, callback: js.Function2[/* err */ Error | Null, /* buf */ Buffer, Unit]): Unit = js.native
}

