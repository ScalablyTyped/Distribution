package typings.pkijs.mod

import typings.std.Crypto
import typings.std.SubtleCrypto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pkijs/src/common", "setEngine")
@js.native
object setEngine extends js.Object {
  
  def apply(name: String, crypto: Crypto, subtle: SubtleCrypto): Unit = js.native
}
