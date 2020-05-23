package typings.mz.cryptoMod

import typings.node.Buffer
import typings.node.cryptoMod.PrivateKeyInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/crypto", "createPrivateKey")
@js.native
object createPrivateKey extends js.Object {
  def apply(key: String): typings.node.cryptoMod.KeyObject = js.native
  def apply(key: Buffer): typings.node.cryptoMod.KeyObject = js.native
  def apply(key: PrivateKeyInput): typings.node.cryptoMod.KeyObject = js.native
}

