package typings.node.cryptoMod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "pseudoRandomBytes")
@js.native
object pseudoRandomBytes extends js.Object {
  def apply(size: Double): Buffer = js.native
  def apply(size: Double, callback: js.Function2[/* err */ Error | Null, /* buf */ Buffer, Unit]): Unit = js.native
}

