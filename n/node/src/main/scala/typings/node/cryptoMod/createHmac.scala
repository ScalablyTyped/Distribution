package typings.node.cryptoMod

import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "createHmac")
@js.native
object createHmac extends js.Object {
  def apply(algorithm: java.lang.String, key: BinaryLike): Hmac = js.native
  def apply(algorithm: java.lang.String, key: BinaryLike, options: TransformOptions): Hmac = js.native
}

