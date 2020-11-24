package typings.mz.mod.crypto

import typings.node.cryptoMod.HashOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mz", "crypto.createHash")
@js.native
object createHash extends js.Object {
  
  def apply(algorithm: String): typings.node.cryptoMod.Hash = js.native
  def apply(algorithm: String, options: HashOptions): typings.node.cryptoMod.Hash = js.native
}
