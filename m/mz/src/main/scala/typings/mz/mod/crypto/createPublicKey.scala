package typings.mz.mod.crypto

import typings.node.Buffer
import typings.node.cryptoMod.PublicKeyInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mz", "crypto.createPublicKey")
@js.native
object createPublicKey extends js.Object {
  
  def apply(key: String): typings.node.cryptoMod.KeyObject = js.native
  def apply(key: Buffer): typings.node.cryptoMod.KeyObject = js.native
  def apply(key: typings.node.cryptoMod.KeyObject): typings.node.cryptoMod.KeyObject = js.native
  def apply(key: PublicKeyInput): typings.node.cryptoMod.KeyObject = js.native
}
