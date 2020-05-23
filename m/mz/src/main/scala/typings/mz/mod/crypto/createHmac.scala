package typings.mz.mod.crypto

import typings.node.cryptoMod.BinaryLike
import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz", "crypto.createHmac")
@js.native
object createHmac extends js.Object {
  def apply(algorithm: String, key: BinaryLike): typings.node.cryptoMod.Hmac = js.native
  def apply(algorithm: String, key: BinaryLike, options: TransformOptions): typings.node.cryptoMod.Hmac = js.native
  def apply(algorithm: String, key: typings.node.cryptoMod.KeyObject): typings.node.cryptoMod.Hmac = js.native
  def apply(algorithm: String, key: typings.node.cryptoMod.KeyObject, options: TransformOptions): typings.node.cryptoMod.Hmac = js.native
}

