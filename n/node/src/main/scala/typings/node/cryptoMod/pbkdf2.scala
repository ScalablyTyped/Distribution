package typings.node.cryptoMod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crypto", "pbkdf2")
@js.native
object pbkdf2 extends js.Object {
  
  def apply(
    password: BinaryLike,
    salt: BinaryLike,
    iterations: Double,
    keylen: Double,
    digest: String,
    callback: js.Function2[/* err */ Error | Null, /* derivedKey */ Buffer, _]
  ): Unit = js.native
}
