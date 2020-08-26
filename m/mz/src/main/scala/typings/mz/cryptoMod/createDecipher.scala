package typings.mz.cryptoMod

import typings.node.cryptoMod.BinaryLike
import typings.node.cryptoMod.CipherCCMOptions
import typings.node.cryptoMod.CipherCCMTypes
import typings.node.cryptoMod.CipherGCMOptions
import typings.node.cryptoMod.CipherGCMTypes
import typings.node.cryptoMod.DecipherCCM
import typings.node.cryptoMod.DecipherGCM
import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/crypto", "createDecipher")
@js.native
object createDecipher extends js.Object {
  /** @deprecated since v10.0.0 use `createDecipheriv()` */
  def apply(algorithm: String, password: BinaryLike): typings.node.cryptoMod.Decipher = js.native
  def apply(algorithm: String, password: BinaryLike, options: TransformOptions): typings.node.cryptoMod.Decipher = js.native
  /** @deprecated since v10.0.0 use `createDecipheriv()` */
  def apply(algorithm: CipherCCMTypes, password: BinaryLike, options: CipherCCMOptions): DecipherCCM = js.native
  /** @deprecated since v10.0.0 use `createDecipheriv()` */
  def apply(algorithm: CipherGCMTypes, password: BinaryLike): DecipherGCM = js.native
  def apply(algorithm: CipherGCMTypes, password: BinaryLike, options: CipherGCMOptions): DecipherGCM = js.native
}

