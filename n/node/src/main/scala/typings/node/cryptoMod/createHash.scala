package typings.node.cryptoMod

import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "createHash")
@js.native
object createHash extends js.Object {
  def apply(algorithm: java.lang.String): Hash = js.native
  def apply(algorithm: java.lang.String, options: TransformOptions): Hash = js.native
}

