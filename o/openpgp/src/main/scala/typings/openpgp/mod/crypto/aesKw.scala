package typings.openpgp.mod.crypto

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see module:crypto/public_key/elliptic/ecdh
  */
@JSImport("openpgp", "crypto.aes_kw")
@js.native
object aesKw extends js.Object {
  /**
    * AES key unwrap
    * @param key
    * @param data
    * @returns
    * @throws
    */
  def unwrap(key: String, data: String): Uint8Array = js.native
  /**
    * AES key wrap
    * @param key
    * @param data
    * @returns
    */
  def wrap(key: String, data: String): Uint8Array = js.native
}

