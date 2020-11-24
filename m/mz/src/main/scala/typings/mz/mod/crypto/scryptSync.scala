package typings.mz.mod.crypto

import typings.node.Buffer
import typings.node.cryptoMod.BinaryLike
import typings.node.cryptoMod.ScryptOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mz", "crypto.scryptSync")
@js.native
object scryptSync extends js.Object {
  
  def apply(password: BinaryLike, salt: BinaryLike, keylen: Double): Buffer = js.native
  def apply(password: BinaryLike, salt: BinaryLike, keylen: Double, options: ScryptOptions): Buffer = js.native
}
