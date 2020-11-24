package typings.mz.cryptoMod

import typings.node.streamMod.WritableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mz/crypto", "createSign")
@js.native
object createSign extends js.Object {
  
  def apply(algorithm: String): typings.node.cryptoMod.Signer = js.native
  def apply(algorithm: String, options: WritableOptions): typings.node.cryptoMod.Signer = js.native
}
