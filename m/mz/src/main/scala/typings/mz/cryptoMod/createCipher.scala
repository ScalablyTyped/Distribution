package typings.mz.cryptoMod

import typings.node.cryptoMod.BinaryLike
import typings.node.cryptoMod.CipherCCM
import typings.node.cryptoMod.CipherCCMOptions
import typings.node.cryptoMod.CipherCCMTypes
import typings.node.cryptoMod.CipherGCM
import typings.node.cryptoMod.CipherGCMOptions
import typings.node.cryptoMod.CipherGCMTypes
import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mz/crypto", "createCipher")
@js.native
object createCipher extends js.Object {
  
  /** @deprecated since v10.0.0 use `createCipheriv()` */
  def apply(algorithm: String, password: BinaryLike): typings.node.cryptoMod.Cipher = js.native
  def apply(algorithm: String, password: BinaryLike, options: TransformOptions): typings.node.cryptoMod.Cipher = js.native
  /** @deprecated since v10.0.0 use `createCipheriv()` */
  def apply(algorithm: CipherCCMTypes, password: BinaryLike, options: CipherCCMOptions): CipherCCM = js.native
  /** @deprecated since v10.0.0 use `createCipheriv()` */
  def apply(algorithm: CipherGCMTypes, password: BinaryLike): CipherGCM = js.native
  def apply(algorithm: CipherGCMTypes, password: BinaryLike, options: CipherGCMOptions): CipherGCM = js.native
}
