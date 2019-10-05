package typings.openpgp.openpgpMod.crypto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "crypto.cipher")
@js.native
object cipher extends js.Object {
  /**
    * AES-128 encryption and decryption (ID 7)
    * @param key 128-bit key
    * @see
    * @see
    * @returns
    */
  def aes128(key: String): js.Object = js.native
  /**
    * AES-128 Block Cipher (ID 8)
    * @param key 192-bit key
    * @see
    * @see
    * @returns
    */
  def aes192(key: String): js.Object = js.native
  /**
    * AES-128 Block Cipher (ID 9)
    * @param key 256-bit key
    * @see
    * @see
    * @returns
    */
  def aes256(key: String): js.Object = js.native
  /**
    * Blowfish Block Cipher (ID 4)
    * @param key 128-bit key
    * @see
    * @returns
    */
  def blowfish(key: String): js.Object = js.native
  /**
    * CAST-128 Block Cipher (ID 3)
    * @param key 128-bit key
    * @see
    * @returns
    */
  def cast5(key: String): js.Object = js.native
  /**
    * Not implemented
    * @throws
    */
  def idea(): Unit = js.native
  /**
    * Triple DES Block Cipher (ID 2)
    * @param key 192-bit key
    * @see
    * @returns
    */
  def tripledes(key: String): js.Object = js.native
  /**
    * Twofish Block Cipher (ID 10)
    * @param key 256-bit key
    * @see
    * @returns
    */
  def twofish(key: String): js.Object = js.native
}

