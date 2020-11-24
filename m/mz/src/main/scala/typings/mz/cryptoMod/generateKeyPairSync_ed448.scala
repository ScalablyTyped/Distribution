package typings.mz.cryptoMod

import typings.mz.mzStrings.ed448
import typings.node.cryptoMod.ED448KeyPairKeyObjectOptions
import typings.node.cryptoMod.KeyPairKeyObjectResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mz/crypto", "generateKeyPairSync")
@js.native
object generateKeyPairSync_ed448 extends js.Object {
  
  def apply(`type`: ed448): KeyPairKeyObjectResult = js.native
  def apply(`type`: ed448, options: ED448KeyPairKeyObjectOptions): KeyPairKeyObjectResult = js.native
}
