package typings.node.cryptoMod

import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "createCipheriv")
@js.native
object createCipheriv extends js.Object {
  def apply(algorithm: String, key: CipherKey): Cipher = js.native
  def apply(algorithm: String, key: CipherKey, iv: Null, options: TransformOptions): Cipher = js.native
  def apply(algorithm: String, key: CipherKey, iv: BinaryLike): Cipher = js.native
  def apply(algorithm: String, key: CipherKey, iv: BinaryLike, options: TransformOptions): Cipher = js.native
  def apply(algorithm: CipherCCMTypes, key: CipherKey, iv: Null, options: CipherCCMOptions): CipherCCM = js.native
  def apply(algorithm: CipherCCMTypes, key: CipherKey, iv: BinaryLike, options: CipherCCMOptions): CipherCCM = js.native
  def apply(algorithm: CipherGCMTypes, key: CipherKey): CipherGCM = js.native
  def apply(algorithm: CipherGCMTypes, key: CipherKey, iv: Null, options: CipherGCMOptions): CipherGCM = js.native
  def apply(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike): CipherGCM = js.native
  def apply(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike, options: CipherGCMOptions): CipherGCM = js.native
}

