package typings.openpgp.mod.crypto

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openpgp", "crypto.gcm")
@js.native
object gcm extends js.Object {
  
  /**
    * Class to en/decrypt using GCM mode.
    * @param cipher The symmetric cipher algorithm to use e.g. 'aes128'
    * @param key The encryption key
    */
  def GCM(cipher: String, key: Uint8Array): Unit = js.native
}
