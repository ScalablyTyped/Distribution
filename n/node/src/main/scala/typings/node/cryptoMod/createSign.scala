package typings.node.cryptoMod

import typings.node.streamMod.WritableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "createSign")
@js.native
object createSign extends js.Object {
  def apply(algorithm: String): Signer = js.native
  def apply(algorithm: String, options: WritableOptions): Signer = js.native
}

