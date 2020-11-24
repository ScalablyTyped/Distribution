package typings.openpgp.mod.crypto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see module:packet.PublicKeyEncryptedSessionKey
  */
@JSImport("openpgp", "crypto.pkcs5")
@js.native
object pkcs5 extends js.Object {
  
  /**
    * Remove pkcs5 padding from a string.
    * @param msg Text to remove padding from
    * @returns Text with padding removed
    */
  def decode(msg: String): String = js.native
  
  /**
    * Add pkcs5 padding to a text.
    * @param msg Text to add padding
    * @returns Text with padding added
    */
  def encode(msg: String): String = js.native
}
