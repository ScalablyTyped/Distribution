package typings.node.cryptoMod

import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "createCipher")
@js.native
object createCipher extends js.Object {
  /** @deprecated since v10.0.0 use createCipheriv() */
  def apply(algorithm: String, password: BinaryLike): Cipher = js.native
  def apply(algorithm: String, password: BinaryLike, options: TransformOptions): Cipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def apply(algorithm: CipherCCMTypes, password: BinaryLike, options: CipherCCMOptions): CipherCCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def apply(algorithm: CipherGCMTypes, password: BinaryLike): CipherGCM = js.native
  def apply(algorithm: CipherGCMTypes, password: BinaryLike, options: CipherGCMOptions): CipherGCM = js.native
}

