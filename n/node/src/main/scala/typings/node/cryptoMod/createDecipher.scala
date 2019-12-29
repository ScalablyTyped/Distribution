package typings.node.cryptoMod

import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "createDecipher")
@js.native
object createDecipher extends js.Object {
  /** @deprecated since v10.0.0 use createDecipheriv() */
  def apply(algorithm: String, password: BinaryLike): Decipher = js.native
  def apply(algorithm: String, password: BinaryLike, options: TransformOptions): Decipher = js.native
  /** @deprecated since v10.0.0 use createDecipheriv() */
  def apply(algorithm: CipherCCMTypes, password: BinaryLike, options: CipherCCMOptions): DecipherCCM = js.native
  /** @deprecated since v10.0.0 use createDecipheriv() */
  def apply(algorithm: CipherGCMTypes, password: BinaryLike): DecipherGCM = js.native
  def apply(algorithm: CipherGCMTypes, password: BinaryLike, options: CipherGCMOptions): DecipherGCM = js.native
}

