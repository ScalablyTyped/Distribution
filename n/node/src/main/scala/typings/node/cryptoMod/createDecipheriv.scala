package typings.node.cryptoMod

import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "createDecipheriv")
@js.native
object createDecipheriv extends js.Object {
  def apply(algorithm: java.lang.String, key: BinaryLike): Decipher = js.native
  def apply(algorithm: java.lang.String, key: BinaryLike, iv: Null, options: TransformOptions): Decipher = js.native
  def apply(algorithm: java.lang.String, key: BinaryLike, iv: BinaryLike): Decipher = js.native
  def apply(algorithm: java.lang.String, key: BinaryLike, iv: BinaryLike, options: TransformOptions): Decipher = js.native
  def apply(algorithm: CipherCCMTypes, key: BinaryLike, iv: Null, options: CipherCCMOptions): DecipherCCM = js.native
  def apply(algorithm: CipherCCMTypes, key: BinaryLike, iv: BinaryLike, options: CipherCCMOptions): DecipherCCM = js.native
  def apply(algorithm: CipherGCMTypes, key: BinaryLike): DecipherGCM = js.native
  def apply(algorithm: CipherGCMTypes, key: BinaryLike, iv: Null, options: CipherGCMOptions): DecipherGCM = js.native
  def apply(algorithm: CipherGCMTypes, key: BinaryLike, iv: BinaryLike): DecipherGCM = js.native
  def apply(algorithm: CipherGCMTypes, key: BinaryLike, iv: BinaryLike, options: CipherGCMOptions): DecipherGCM = js.native
}

