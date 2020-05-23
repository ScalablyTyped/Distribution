package typings.mz.cryptoMod

import typings.node.cryptoMod.BinaryLike
import typings.node.cryptoMod.CipherCCMOptions
import typings.node.cryptoMod.CipherCCMTypes
import typings.node.cryptoMod.CipherGCMOptions
import typings.node.cryptoMod.CipherGCMTypes
import typings.node.cryptoMod.CipherKey
import typings.node.cryptoMod.DecipherCCM
import typings.node.cryptoMod.DecipherGCM
import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/crypto", "createDecipheriv")
@js.native
object createDecipheriv extends js.Object {
  def apply(algorithm: String, key: CipherKey): typings.node.cryptoMod.Decipher = js.native
  def apply(algorithm: String, key: CipherKey, iv: Null, options: TransformOptions): typings.node.cryptoMod.Decipher = js.native
  def apply(algorithm: String, key: CipherKey, iv: BinaryLike): typings.node.cryptoMod.Decipher = js.native
  def apply(algorithm: String, key: CipherKey, iv: BinaryLike, options: TransformOptions): typings.node.cryptoMod.Decipher = js.native
  def apply(algorithm: CipherCCMTypes, key: CipherKey, iv: Null, options: CipherCCMOptions): DecipherCCM = js.native
  def apply(algorithm: CipherCCMTypes, key: CipherKey, iv: BinaryLike, options: CipherCCMOptions): DecipherCCM = js.native
  def apply(algorithm: CipherGCMTypes, key: CipherKey): DecipherGCM = js.native
  def apply(algorithm: CipherGCMTypes, key: CipherKey, iv: Null, options: CipherGCMOptions): DecipherGCM = js.native
  def apply(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike): DecipherGCM = js.native
  def apply(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike, options: CipherGCMOptions): DecipherGCM = js.native
}

