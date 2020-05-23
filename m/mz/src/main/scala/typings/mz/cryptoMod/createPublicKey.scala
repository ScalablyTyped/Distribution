package typings.mz.cryptoMod

import typings.node.Buffer
import typings.node.cryptoMod.PublicKeyInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/crypto", "createPublicKey")
@js.native
object createPublicKey extends js.Object {
  def apply(key: String): typings.node.cryptoMod.KeyObject = js.native
  def apply(key: Buffer): typings.node.cryptoMod.KeyObject = js.native
  def apply(key: typings.node.cryptoMod.KeyObject): typings.node.cryptoMod.KeyObject = js.native
  def apply(key: PublicKeyInput): typings.node.cryptoMod.KeyObject = js.native
}

