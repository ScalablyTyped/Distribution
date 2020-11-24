package typings.node.cryptoMod

import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crypto", "createDecipheriv")
@js.native
object createDecipheriv extends js.Object {
  
  def apply(algorithm: String, key: CipherKey): Decipher = js.native
  def apply(algorithm: String, key: CipherKey, iv: Null, options: TransformOptions): Decipher = js.native
  def apply(algorithm: String, key: CipherKey, iv: BinaryLike): Decipher = js.native
  def apply(algorithm: String, key: CipherKey, iv: BinaryLike, options: TransformOptions): Decipher = js.native
  def apply(algorithm: CipherCCMTypes, key: CipherKey, iv: Null, options: CipherCCMOptions): DecipherCCM = js.native
  def apply(algorithm: CipherCCMTypes, key: CipherKey, iv: BinaryLike, options: CipherCCMOptions): DecipherCCM = js.native
  def apply(algorithm: CipherGCMTypes, key: CipherKey): DecipherGCM = js.native
  def apply(algorithm: CipherGCMTypes, key: CipherKey, iv: Null, options: CipherGCMOptions): DecipherGCM = js.native
  def apply(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike): DecipherGCM = js.native
  def apply(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike, options: CipherGCMOptions): DecipherGCM = js.native
}
