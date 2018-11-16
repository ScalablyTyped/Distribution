package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", JSImport.Namespace)
@js.native
object cryptoModMembers extends js.Object {
  val Certificate: nodeLib.Anon_Certificate = js.native
  /** @deprecated since v10.0.0 */
  val DEFAULT_ENCODING: java.lang.String = js.native
  /** @deprecated since v10.0.0 */
  val fips: scala.Boolean = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: java.lang.String, password: java.lang.String): Cipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(
    algorithm: java.lang.String,
    password: java.lang.String,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Cipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: java.lang.String, password: nodeLib.Buffer): Cipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(
    algorithm: java.lang.String,
    password: nodeLib.Buffer,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Cipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: java.lang.String, password: nodeLib.NodeJSNs.TypedArray): Cipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(
    algorithm: java.lang.String,
    password: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Cipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: java.lang.String, password: stdLib.DataView): Cipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(
    algorithm: java.lang.String,
    password: stdLib.DataView,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Cipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: CipherCCMTypes, password: java.lang.String, options: CipherCCMOptions): CipherCCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: CipherCCMTypes, password: nodeLib.Buffer, options: CipherCCMOptions): CipherCCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: CipherCCMTypes, password: nodeLib.NodeJSNs.TypedArray, options: CipherCCMOptions): CipherCCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: CipherCCMTypes, password: stdLib.DataView, options: CipherCCMOptions): CipherCCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: CipherGCMTypes, password: java.lang.String): CipherGCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: CipherGCMTypes, password: java.lang.String, options: CipherGCMOptions): CipherGCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: CipherGCMTypes, password: nodeLib.Buffer): CipherGCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: CipherGCMTypes, password: nodeLib.Buffer, options: CipherGCMOptions): CipherGCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: CipherGCMTypes, password: nodeLib.NodeJSNs.TypedArray): CipherGCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: CipherGCMTypes, password: nodeLib.NodeJSNs.TypedArray, options: CipherGCMOptions): CipherGCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: CipherGCMTypes, password: stdLib.DataView): CipherGCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: CipherGCMTypes, password: stdLib.DataView, options: CipherGCMOptions): CipherGCM = js.native
  def createCipheriv(algorithm: java.lang.String, key: java.lang.String, iv: java.lang.String): Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: java.lang.String,
    iv: java.lang.String,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: java.lang.String, iv: nodeLib.Buffer): Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: java.lang.String,
    iv: nodeLib.Buffer,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: java.lang.String, iv: nodeLib.NodeJSNs.TypedArray): Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: java.lang.String,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: java.lang.String, iv: stdLib.DataView): Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: java.lang.String,
    iv: stdLib.DataView,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: nodeLib.Buffer, iv: java.lang.String): Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: nodeLib.Buffer,
    iv: java.lang.String,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: nodeLib.Buffer, iv: nodeLib.Buffer): Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: nodeLib.Buffer,
    iv: nodeLib.Buffer,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: nodeLib.Buffer, iv: nodeLib.NodeJSNs.TypedArray): Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: nodeLib.Buffer,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: nodeLib.Buffer, iv: stdLib.DataView): Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: nodeLib.Buffer,
    iv: stdLib.DataView,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: nodeLib.NodeJSNs.TypedArray, iv: java.lang.String): Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: java.lang.String,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: nodeLib.NodeJSNs.TypedArray, iv: nodeLib.Buffer): Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: nodeLib.Buffer,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: nodeLib.NodeJSNs.TypedArray, iv: nodeLib.NodeJSNs.TypedArray): Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: nodeLib.NodeJSNs.TypedArray, iv: stdLib.DataView): Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: stdLib.DataView,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: stdLib.DataView, iv: java.lang.String): Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: stdLib.DataView,
    iv: java.lang.String,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: stdLib.DataView, iv: nodeLib.Buffer): Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: stdLib.DataView,
    iv: nodeLib.Buffer,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: stdLib.DataView, iv: nodeLib.NodeJSNs.TypedArray): Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: stdLib.DataView,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: stdLib.DataView, iv: stdLib.DataView): Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: stdLib.DataView,
    iv: stdLib.DataView,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Cipher = js.native
  def createCipheriv(algorithm: CipherCCMTypes, key: java.lang.String, iv: java.lang.String, options: CipherCCMOptions): CipherCCM = js.native
  def createCipheriv(algorithm: CipherCCMTypes, key: java.lang.String, iv: nodeLib.Buffer, options: CipherCCMOptions): CipherCCM = js.native
  def createCipheriv(
    algorithm: CipherCCMTypes,
    key: java.lang.String,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: CipherCCMOptions
  ): CipherCCM = js.native
  def createCipheriv(algorithm: CipherCCMTypes, key: java.lang.String, iv: stdLib.DataView, options: CipherCCMOptions): CipherCCM = js.native
  def createCipheriv(algorithm: CipherCCMTypes, key: nodeLib.Buffer, iv: java.lang.String, options: CipherCCMOptions): CipherCCM = js.native
  def createCipheriv(algorithm: CipherCCMTypes, key: nodeLib.Buffer, iv: nodeLib.Buffer, options: CipherCCMOptions): CipherCCM = js.native
  def createCipheriv(
    algorithm: CipherCCMTypes,
    key: nodeLib.Buffer,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: CipherCCMOptions
  ): CipherCCM = js.native
  def createCipheriv(algorithm: CipherCCMTypes, key: nodeLib.Buffer, iv: stdLib.DataView, options: CipherCCMOptions): CipherCCM = js.native
  def createCipheriv(
    algorithm: CipherCCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: java.lang.String,
    options: CipherCCMOptions
  ): CipherCCM = js.native
  def createCipheriv(
    algorithm: CipherCCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: nodeLib.Buffer,
    options: CipherCCMOptions
  ): CipherCCM = js.native
  def createCipheriv(
    algorithm: CipherCCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: CipherCCMOptions
  ): CipherCCM = js.native
  def createCipheriv(
    algorithm: CipherCCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: stdLib.DataView,
    options: CipherCCMOptions
  ): CipherCCM = js.native
  def createCipheriv(algorithm: CipherCCMTypes, key: stdLib.DataView, iv: java.lang.String, options: CipherCCMOptions): CipherCCM = js.native
  def createCipheriv(algorithm: CipherCCMTypes, key: stdLib.DataView, iv: nodeLib.Buffer, options: CipherCCMOptions): CipherCCM = js.native
  def createCipheriv(
    algorithm: CipherCCMTypes,
    key: stdLib.DataView,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: CipherCCMOptions
  ): CipherCCM = js.native
  def createCipheriv(algorithm: CipherCCMTypes, key: stdLib.DataView, iv: stdLib.DataView, options: CipherCCMOptions): CipherCCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: java.lang.String, iv: java.lang.String): CipherGCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: java.lang.String, iv: java.lang.String, options: CipherGCMOptions): CipherGCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: java.lang.String, iv: nodeLib.Buffer): CipherGCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: java.lang.String, iv: nodeLib.Buffer, options: CipherGCMOptions): CipherGCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: java.lang.String, iv: nodeLib.NodeJSNs.TypedArray): CipherGCM = js.native
  def createCipheriv(
    algorithm: CipherGCMTypes,
    key: java.lang.String,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: CipherGCMOptions
  ): CipherGCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: java.lang.String, iv: stdLib.DataView): CipherGCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: java.lang.String, iv: stdLib.DataView, options: CipherGCMOptions): CipherGCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: nodeLib.Buffer, iv: java.lang.String): CipherGCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: nodeLib.Buffer, iv: java.lang.String, options: CipherGCMOptions): CipherGCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: nodeLib.Buffer, iv: nodeLib.Buffer): CipherGCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: nodeLib.Buffer, iv: nodeLib.Buffer, options: CipherGCMOptions): CipherGCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: nodeLib.Buffer, iv: nodeLib.NodeJSNs.TypedArray): CipherGCM = js.native
  def createCipheriv(
    algorithm: CipherGCMTypes,
    key: nodeLib.Buffer,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: CipherGCMOptions
  ): CipherGCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: nodeLib.Buffer, iv: stdLib.DataView): CipherGCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: nodeLib.Buffer, iv: stdLib.DataView, options: CipherGCMOptions): CipherGCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: nodeLib.NodeJSNs.TypedArray, iv: java.lang.String): CipherGCM = js.native
  def createCipheriv(
    algorithm: CipherGCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: java.lang.String,
    options: CipherGCMOptions
  ): CipherGCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: nodeLib.NodeJSNs.TypedArray, iv: nodeLib.Buffer): CipherGCM = js.native
  def createCipheriv(
    algorithm: CipherGCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: nodeLib.Buffer,
    options: CipherGCMOptions
  ): CipherGCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: nodeLib.NodeJSNs.TypedArray, iv: nodeLib.NodeJSNs.TypedArray): CipherGCM = js.native
  def createCipheriv(
    algorithm: CipherGCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: CipherGCMOptions
  ): CipherGCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: nodeLib.NodeJSNs.TypedArray, iv: stdLib.DataView): CipherGCM = js.native
  def createCipheriv(
    algorithm: CipherGCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: stdLib.DataView,
    options: CipherGCMOptions
  ): CipherGCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: stdLib.DataView, iv: java.lang.String): CipherGCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: stdLib.DataView, iv: java.lang.String, options: CipherGCMOptions): CipherGCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: stdLib.DataView, iv: nodeLib.Buffer): CipherGCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: stdLib.DataView, iv: nodeLib.Buffer, options: CipherGCMOptions): CipherGCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: stdLib.DataView, iv: nodeLib.NodeJSNs.TypedArray): CipherGCM = js.native
  def createCipheriv(
    algorithm: CipherGCMTypes,
    key: stdLib.DataView,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: CipherGCMOptions
  ): CipherGCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: stdLib.DataView, iv: stdLib.DataView): CipherGCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: stdLib.DataView, iv: stdLib.DataView, options: CipherGCMOptions): CipherGCM = js.native
  def createCredentials(details: CredentialDetails): Credentials = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: java.lang.String, password: java.lang.String): Decipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(
    algorithm: java.lang.String,
    password: java.lang.String,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Decipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: java.lang.String, password: nodeLib.Buffer): Decipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(
    algorithm: java.lang.String,
    password: nodeLib.Buffer,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Decipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: java.lang.String, password: nodeLib.NodeJSNs.TypedArray): Decipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(
    algorithm: java.lang.String,
    password: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Decipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: java.lang.String, password: stdLib.DataView): Decipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(
    algorithm: java.lang.String,
    password: stdLib.DataView,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Decipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: CipherCCMTypes, password: java.lang.String, options: CipherCCMOptions): DecipherCCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: CipherCCMTypes, password: nodeLib.Buffer, options: CipherCCMOptions): DecipherCCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: CipherCCMTypes, password: nodeLib.NodeJSNs.TypedArray, options: CipherCCMOptions): DecipherCCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: CipherCCMTypes, password: stdLib.DataView, options: CipherCCMOptions): DecipherCCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: CipherGCMTypes, password: java.lang.String): DecipherGCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: CipherGCMTypes, password: java.lang.String, options: CipherGCMOptions): DecipherGCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: CipherGCMTypes, password: nodeLib.Buffer): DecipherGCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: CipherGCMTypes, password: nodeLib.Buffer, options: CipherGCMOptions): DecipherGCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: CipherGCMTypes, password: nodeLib.NodeJSNs.TypedArray): DecipherGCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: CipherGCMTypes, password: nodeLib.NodeJSNs.TypedArray, options: CipherGCMOptions): DecipherGCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: CipherGCMTypes, password: stdLib.DataView): DecipherGCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: CipherGCMTypes, password: stdLib.DataView, options: CipherGCMOptions): DecipherGCM = js.native
  def createDecipheriv(algorithm: java.lang.String, key: java.lang.String, iv: java.lang.String): Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: java.lang.String,
    iv: java.lang.String,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: java.lang.String, iv: nodeLib.Buffer): Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: java.lang.String,
    iv: nodeLib.Buffer,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: java.lang.String, iv: nodeLib.NodeJSNs.TypedArray): Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: java.lang.String,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: java.lang.String, iv: stdLib.DataView): Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: java.lang.String,
    iv: stdLib.DataView,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: nodeLib.Buffer, iv: java.lang.String): Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: nodeLib.Buffer,
    iv: java.lang.String,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: nodeLib.Buffer, iv: nodeLib.Buffer): Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: nodeLib.Buffer,
    iv: nodeLib.Buffer,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: nodeLib.Buffer, iv: nodeLib.NodeJSNs.TypedArray): Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: nodeLib.Buffer,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: nodeLib.Buffer, iv: stdLib.DataView): Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: nodeLib.Buffer,
    iv: stdLib.DataView,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: nodeLib.NodeJSNs.TypedArray, iv: java.lang.String): Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: java.lang.String,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: nodeLib.NodeJSNs.TypedArray, iv: nodeLib.Buffer): Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: nodeLib.Buffer,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: nodeLib.NodeJSNs.TypedArray, iv: nodeLib.NodeJSNs.TypedArray): Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: nodeLib.NodeJSNs.TypedArray, iv: stdLib.DataView): Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: stdLib.DataView,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: stdLib.DataView, iv: java.lang.String): Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: stdLib.DataView,
    iv: java.lang.String,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: stdLib.DataView, iv: nodeLib.Buffer): Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: stdLib.DataView,
    iv: nodeLib.Buffer,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: stdLib.DataView, iv: nodeLib.NodeJSNs.TypedArray): Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: stdLib.DataView,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: stdLib.DataView, iv: stdLib.DataView): Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: stdLib.DataView,
    iv: stdLib.DataView,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Decipher = js.native
  def createDecipheriv(algorithm: CipherCCMTypes, key: java.lang.String, iv: java.lang.String, options: CipherCCMOptions): DecipherCCM = js.native
  def createDecipheriv(algorithm: CipherCCMTypes, key: java.lang.String, iv: nodeLib.Buffer, options: CipherCCMOptions): DecipherCCM = js.native
  def createDecipheriv(
    algorithm: CipherCCMTypes,
    key: java.lang.String,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: CipherCCMOptions
  ): DecipherCCM = js.native
  def createDecipheriv(algorithm: CipherCCMTypes, key: java.lang.String, iv: stdLib.DataView, options: CipherCCMOptions): DecipherCCM = js.native
  def createDecipheriv(algorithm: CipherCCMTypes, key: nodeLib.Buffer, iv: java.lang.String, options: CipherCCMOptions): DecipherCCM = js.native
  def createDecipheriv(algorithm: CipherCCMTypes, key: nodeLib.Buffer, iv: nodeLib.Buffer, options: CipherCCMOptions): DecipherCCM = js.native
  def createDecipheriv(
    algorithm: CipherCCMTypes,
    key: nodeLib.Buffer,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: CipherCCMOptions
  ): DecipherCCM = js.native
  def createDecipheriv(algorithm: CipherCCMTypes, key: nodeLib.Buffer, iv: stdLib.DataView, options: CipherCCMOptions): DecipherCCM = js.native
  def createDecipheriv(
    algorithm: CipherCCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: java.lang.String,
    options: CipherCCMOptions
  ): DecipherCCM = js.native
  def createDecipheriv(
    algorithm: CipherCCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: nodeLib.Buffer,
    options: CipherCCMOptions
  ): DecipherCCM = js.native
  def createDecipheriv(
    algorithm: CipherCCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: CipherCCMOptions
  ): DecipherCCM = js.native
  def createDecipheriv(
    algorithm: CipherCCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: stdLib.DataView,
    options: CipherCCMOptions
  ): DecipherCCM = js.native
  def createDecipheriv(algorithm: CipherCCMTypes, key: stdLib.DataView, iv: java.lang.String, options: CipherCCMOptions): DecipherCCM = js.native
  def createDecipheriv(algorithm: CipherCCMTypes, key: stdLib.DataView, iv: nodeLib.Buffer, options: CipherCCMOptions): DecipherCCM = js.native
  def createDecipheriv(
    algorithm: CipherCCMTypes,
    key: stdLib.DataView,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: CipherCCMOptions
  ): DecipherCCM = js.native
  def createDecipheriv(algorithm: CipherCCMTypes, key: stdLib.DataView, iv: stdLib.DataView, options: CipherCCMOptions): DecipherCCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: java.lang.String, iv: java.lang.String): DecipherGCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: java.lang.String, iv: java.lang.String, options: CipherGCMOptions): DecipherGCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: java.lang.String, iv: nodeLib.Buffer): DecipherGCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: java.lang.String, iv: nodeLib.Buffer, options: CipherGCMOptions): DecipherGCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: java.lang.String, iv: nodeLib.NodeJSNs.TypedArray): DecipherGCM = js.native
  def createDecipheriv(
    algorithm: CipherGCMTypes,
    key: java.lang.String,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: CipherGCMOptions
  ): DecipherGCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: java.lang.String, iv: stdLib.DataView): DecipherGCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: java.lang.String, iv: stdLib.DataView, options: CipherGCMOptions): DecipherGCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: nodeLib.Buffer, iv: java.lang.String): DecipherGCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: nodeLib.Buffer, iv: java.lang.String, options: CipherGCMOptions): DecipherGCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: nodeLib.Buffer, iv: nodeLib.Buffer): DecipherGCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: nodeLib.Buffer, iv: nodeLib.Buffer, options: CipherGCMOptions): DecipherGCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: nodeLib.Buffer, iv: nodeLib.NodeJSNs.TypedArray): DecipherGCM = js.native
  def createDecipheriv(
    algorithm: CipherGCMTypes,
    key: nodeLib.Buffer,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: CipherGCMOptions
  ): DecipherGCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: nodeLib.Buffer, iv: stdLib.DataView): DecipherGCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: nodeLib.Buffer, iv: stdLib.DataView, options: CipherGCMOptions): DecipherGCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: nodeLib.NodeJSNs.TypedArray, iv: java.lang.String): DecipherGCM = js.native
  def createDecipheriv(
    algorithm: CipherGCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: java.lang.String,
    options: CipherGCMOptions
  ): DecipherGCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: nodeLib.NodeJSNs.TypedArray, iv: nodeLib.Buffer): DecipherGCM = js.native
  def createDecipheriv(
    algorithm: CipherGCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: nodeLib.Buffer,
    options: CipherGCMOptions
  ): DecipherGCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: nodeLib.NodeJSNs.TypedArray, iv: nodeLib.NodeJSNs.TypedArray): DecipherGCM = js.native
  def createDecipheriv(
    algorithm: CipherGCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: CipherGCMOptions
  ): DecipherGCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: nodeLib.NodeJSNs.TypedArray, iv: stdLib.DataView): DecipherGCM = js.native
  def createDecipheriv(
    algorithm: CipherGCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: stdLib.DataView,
    options: CipherGCMOptions
  ): DecipherGCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: stdLib.DataView, iv: java.lang.String): DecipherGCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: stdLib.DataView, iv: java.lang.String, options: CipherGCMOptions): DecipherGCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: stdLib.DataView, iv: nodeLib.Buffer): DecipherGCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: stdLib.DataView, iv: nodeLib.Buffer, options: CipherGCMOptions): DecipherGCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: stdLib.DataView, iv: nodeLib.NodeJSNs.TypedArray): DecipherGCM = js.native
  def createDecipheriv(
    algorithm: CipherGCMTypes,
    key: stdLib.DataView,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: CipherGCMOptions
  ): DecipherGCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: stdLib.DataView, iv: stdLib.DataView): DecipherGCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: stdLib.DataView, iv: stdLib.DataView, options: CipherGCMOptions): DecipherGCM = js.native
  def createDiffieHellman(prime_length: scala.Double): DiffieHellman = js.native
  def createDiffieHellman(prime_length: scala.Double, generator: nodeLib.Buffer): DiffieHellman = js.native
  def createDiffieHellman(prime_length: scala.Double, generator: nodeLib.NodeJSNs.TypedArray): DiffieHellman = js.native
  def createDiffieHellman(prime_length: scala.Double, generator: scala.Double): DiffieHellman = js.native
  def createDiffieHellman(prime_length: scala.Double, generator: stdLib.DataView): DiffieHellman = js.native
  def createDiffieHellman(prime: java.lang.String, prime_encoding: HexBase64Latin1Encoding): DiffieHellman = js.native
  def createDiffieHellman(
    prime: java.lang.String,
    prime_encoding: HexBase64Latin1Encoding,
    generator: java.lang.String,
    generator_encoding: HexBase64Latin1Encoding
  ): DiffieHellman = js.native
  def createDiffieHellman(prime: java.lang.String, prime_encoding: HexBase64Latin1Encoding, generator: nodeLib.Buffer): DiffieHellman = js.native
  def createDiffieHellman(
    prime: java.lang.String,
    prime_encoding: HexBase64Latin1Encoding,
    generator: nodeLib.NodeJSNs.TypedArray
  ): DiffieHellman = js.native
  def createDiffieHellman(prime: java.lang.String, prime_encoding: HexBase64Latin1Encoding, generator: scala.Double): DiffieHellman = js.native
  def createDiffieHellman(prime: java.lang.String, prime_encoding: HexBase64Latin1Encoding, generator: stdLib.DataView): DiffieHellman = js.native
  def createDiffieHellman(prime: nodeLib.Buffer): DiffieHellman = js.native
  def createDiffieHellman(prime: nodeLib.NodeJSNs.TypedArray): DiffieHellman = js.native
  def createDiffieHellman(prime: stdLib.DataView): DiffieHellman = js.native
  def createECDH(curve_name: java.lang.String): ECDH = js.native
  def createHash(algorithm: java.lang.String): Hash = js.native
  def createHash(algorithm: java.lang.String, options: nodeLib.streamMod.internalNs.TransformOptions): Hash = js.native
  def createHmac(algorithm: java.lang.String, key: java.lang.String): Hmac = js.native
  def createHmac(
    algorithm: java.lang.String,
    key: java.lang.String,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Hmac = js.native
  def createHmac(algorithm: java.lang.String, key: nodeLib.Buffer): Hmac = js.native
  def createHmac(
    algorithm: java.lang.String,
    key: nodeLib.Buffer,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Hmac = js.native
  def createHmac(algorithm: java.lang.String, key: nodeLib.NodeJSNs.TypedArray): Hmac = js.native
  def createHmac(
    algorithm: java.lang.String,
    key: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Hmac = js.native
  def createHmac(algorithm: java.lang.String, key: stdLib.DataView): Hmac = js.native
  def createHmac(
    algorithm: java.lang.String,
    key: stdLib.DataView,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): Hmac = js.native
  def createSign(algorithm: java.lang.String): Signer = js.native
  def createSign(algorithm: java.lang.String, options: nodeLib.streamMod.internalNs.WritableOptions): Signer = js.native
  def createVerify(algorith: java.lang.String): Verify = js.native
  def createVerify(algorith: java.lang.String, options: nodeLib.streamMod.internalNs.WritableOptions): Verify = js.native
  def generateKeyPair(
    `type`: nodeLib.nodeLibStrings.dsa,
    options: DSAKeyPairOptions[
      nodeLib.nodeLibStrings.der | nodeLib.nodeLibStrings.pem, 
      nodeLib.nodeLibStrings.der | nodeLib.nodeLibStrings.pem
    ],
    callback: js.Function3[
      /* err */ nodeLib.Error | scala.Null, 
      (/* publicKey */ java.lang.String) | (/* publicKey */ nodeLib.Buffer), 
      (/* privateKey */ java.lang.String) | (/* privateKey */ nodeLib.Buffer), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def generateKeyPair(
    `type`: nodeLib.nodeLibStrings.ec,
    options: ECKeyPairOptions[
      nodeLib.nodeLibStrings.der | nodeLib.nodeLibStrings.pem, 
      nodeLib.nodeLibStrings.der | nodeLib.nodeLibStrings.pem
    ],
    callback: js.Function3[
      /* err */ nodeLib.Error | scala.Null, 
      (/* publicKey */ java.lang.String) | (/* publicKey */ nodeLib.Buffer), 
      (/* privateKey */ java.lang.String) | (/* privateKey */ nodeLib.Buffer), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def generateKeyPair(
    `type`: nodeLib.nodeLibStrings.rsa,
    options: RSAKeyPairOptions[
      nodeLib.nodeLibStrings.der | nodeLib.nodeLibStrings.pem, 
      nodeLib.nodeLibStrings.der | nodeLib.nodeLibStrings.pem
    ],
    callback: js.Function3[
      /* err */ nodeLib.Error | scala.Null, 
      (/* publicKey */ java.lang.String) | (/* publicKey */ nodeLib.Buffer), 
      (/* privateKey */ java.lang.String) | (/* privateKey */ nodeLib.Buffer), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def generateKeyPairSync(
    `type`: nodeLib.nodeLibStrings.dsa,
    options: DSAKeyPairOptions[
      nodeLib.nodeLibStrings.der | nodeLib.nodeLibStrings.pem, 
      nodeLib.nodeLibStrings.der | nodeLib.nodeLibStrings.pem
    ]
  ): KeyPairSyncResult[java.lang.String, java.lang.String] = js.native
  def generateKeyPairSync(
    `type`: nodeLib.nodeLibStrings.ec,
    options: ECKeyPairOptions[
      nodeLib.nodeLibStrings.der | nodeLib.nodeLibStrings.pem, 
      nodeLib.nodeLibStrings.der | nodeLib.nodeLibStrings.pem
    ]
  ): KeyPairSyncResult[java.lang.String, java.lang.String] = js.native
  def generateKeyPairSync(
    `type`: nodeLib.nodeLibStrings.rsa,
    options: RSAKeyPairOptions[
      nodeLib.nodeLibStrings.der | nodeLib.nodeLibStrings.pem, 
      nodeLib.nodeLibStrings.der | nodeLib.nodeLibStrings.pem
    ]
  ): KeyPairSyncResult[java.lang.String, java.lang.String] = js.native
  def getCiphers(): js.Array[java.lang.String] = js.native
  def getCurves(): js.Array[java.lang.String] = js.native
  def getDiffieHellman(group_name: java.lang.String): DiffieHellman = js.native
  def getHashes(): js.Array[java.lang.String] = js.native
  def pbkdf2(
    password: java.lang.String,
    salt: java.lang.String,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: java.lang.String,
    salt: nodeLib.Buffer,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: java.lang.String,
    salt: nodeLib.NodeJSNs.TypedArray,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: java.lang.String,
    salt: stdLib.DataView,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: nodeLib.Buffer,
    salt: java.lang.String,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: nodeLib.Buffer,
    salt: nodeLib.Buffer,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: nodeLib.Buffer,
    salt: nodeLib.NodeJSNs.TypedArray,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: nodeLib.Buffer,
    salt: stdLib.DataView,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: java.lang.String,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: nodeLib.Buffer,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: nodeLib.NodeJSNs.TypedArray,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: stdLib.DataView,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: stdLib.DataView,
    salt: java.lang.String,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: stdLib.DataView,
    salt: nodeLib.Buffer,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: stdLib.DataView,
    salt: nodeLib.NodeJSNs.TypedArray,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: stdLib.DataView,
    salt: stdLib.DataView,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2Sync(
    password: java.lang.String,
    salt: java.lang.String,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def pbkdf2Sync(
    password: java.lang.String,
    salt: nodeLib.Buffer,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def pbkdf2Sync(
    password: java.lang.String,
    salt: nodeLib.NodeJSNs.TypedArray,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def pbkdf2Sync(
    password: java.lang.String,
    salt: stdLib.DataView,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def pbkdf2Sync(
    password: nodeLib.Buffer,
    salt: java.lang.String,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def pbkdf2Sync(
    password: nodeLib.Buffer,
    salt: nodeLib.Buffer,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def pbkdf2Sync(
    password: nodeLib.Buffer,
    salt: nodeLib.NodeJSNs.TypedArray,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def pbkdf2Sync(
    password: nodeLib.Buffer,
    salt: stdLib.DataView,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def pbkdf2Sync(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: java.lang.String,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def pbkdf2Sync(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: nodeLib.Buffer,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def pbkdf2Sync(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: nodeLib.NodeJSNs.TypedArray,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def pbkdf2Sync(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: stdLib.DataView,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def pbkdf2Sync(
    password: stdLib.DataView,
    salt: java.lang.String,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def pbkdf2Sync(
    password: stdLib.DataView,
    salt: nodeLib.Buffer,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def pbkdf2Sync(
    password: stdLib.DataView,
    salt: nodeLib.NodeJSNs.TypedArray,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def pbkdf2Sync(
    password: stdLib.DataView,
    salt: stdLib.DataView,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def privateDecrypt(private_key: java.lang.String, buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def privateDecrypt(private_key: java.lang.String, buffer: nodeLib.NodeJSNs.TypedArray): nodeLib.Buffer = js.native
  def privateDecrypt(private_key: java.lang.String, buffer: stdLib.DataView): nodeLib.Buffer = js.native
  def privateDecrypt(private_key: RsaPrivateKey, buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def privateDecrypt(private_key: RsaPrivateKey, buffer: nodeLib.NodeJSNs.TypedArray): nodeLib.Buffer = js.native
  def privateDecrypt(private_key: RsaPrivateKey, buffer: stdLib.DataView): nodeLib.Buffer = js.native
  def privateEncrypt(private_key: java.lang.String, buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def privateEncrypt(private_key: java.lang.String, buffer: nodeLib.NodeJSNs.TypedArray): nodeLib.Buffer = js.native
  def privateEncrypt(private_key: java.lang.String, buffer: stdLib.DataView): nodeLib.Buffer = js.native
  def privateEncrypt(private_key: RsaPrivateKey, buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def privateEncrypt(private_key: RsaPrivateKey, buffer: nodeLib.NodeJSNs.TypedArray): nodeLib.Buffer = js.native
  def privateEncrypt(private_key: RsaPrivateKey, buffer: stdLib.DataView): nodeLib.Buffer = js.native
  def pseudoRandomBytes(size: scala.Double): nodeLib.Buffer = js.native
  def pseudoRandomBytes(
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def publicDecrypt(public_key: java.lang.String, buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def publicDecrypt(public_key: java.lang.String, buffer: nodeLib.NodeJSNs.TypedArray): nodeLib.Buffer = js.native
  def publicDecrypt(public_key: java.lang.String, buffer: stdLib.DataView): nodeLib.Buffer = js.native
  def publicDecrypt(public_key: RsaPublicKey, buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def publicDecrypt(public_key: RsaPublicKey, buffer: nodeLib.NodeJSNs.TypedArray): nodeLib.Buffer = js.native
  def publicDecrypt(public_key: RsaPublicKey, buffer: stdLib.DataView): nodeLib.Buffer = js.native
  def publicEncrypt(public_key: java.lang.String, buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def publicEncrypt(public_key: java.lang.String, buffer: nodeLib.NodeJSNs.TypedArray): nodeLib.Buffer = js.native
  def publicEncrypt(public_key: java.lang.String, buffer: stdLib.DataView): nodeLib.Buffer = js.native
  def publicEncrypt(public_key: RsaPublicKey, buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def publicEncrypt(public_key: RsaPublicKey, buffer: nodeLib.NodeJSNs.TypedArray): nodeLib.Buffer = js.native
  def publicEncrypt(public_key: RsaPublicKey, buffer: stdLib.DataView): nodeLib.Buffer = js.native
  def randomBytes(size: scala.Double): nodeLib.Buffer = js.native
  def randomBytes(
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def randomFill[T /* <: nodeLib.Buffer | nodeLib.NodeJSNs.TypedArray | stdLib.DataView */](buffer: T, callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ T, scala.Unit]): scala.Unit = js.native
  def randomFill[T /* <: nodeLib.Buffer | nodeLib.NodeJSNs.TypedArray | stdLib.DataView */](
    buffer: T,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ T, scala.Unit]
  ): scala.Unit = js.native
  def randomFill[T /* <: nodeLib.Buffer | nodeLib.NodeJSNs.TypedArray | stdLib.DataView */](
    buffer: T,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ T, scala.Unit]
  ): scala.Unit = js.native
  def randomFillSync[T /* <: nodeLib.Buffer | nodeLib.NodeJSNs.TypedArray | stdLib.DataView */](buffer: T): T = js.native
  def randomFillSync[T /* <: nodeLib.Buffer | nodeLib.NodeJSNs.TypedArray | stdLib.DataView */](buffer: T, offset: scala.Double): T = js.native
  def randomFillSync[T /* <: nodeLib.Buffer | nodeLib.NodeJSNs.TypedArray | stdLib.DataView */](buffer: T, offset: scala.Double, size: scala.Double): T = js.native
  def scrypt(
    password: java.lang.String,
    salt: java.lang.String,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: java.lang.String,
    salt: java.lang.String,
    keylen: scala.Double,
    options: ScryptOptions,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: java.lang.String,
    salt: nodeLib.Buffer,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: java.lang.String,
    salt: nodeLib.Buffer,
    keylen: scala.Double,
    options: ScryptOptions,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: java.lang.String,
    salt: nodeLib.NodeJSNs.TypedArray,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: java.lang.String,
    salt: nodeLib.NodeJSNs.TypedArray,
    keylen: scala.Double,
    options: ScryptOptions,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: java.lang.String,
    salt: stdLib.DataView,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: java.lang.String,
    salt: stdLib.DataView,
    keylen: scala.Double,
    options: ScryptOptions,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: nodeLib.Buffer,
    salt: java.lang.String,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: nodeLib.Buffer,
    salt: java.lang.String,
    keylen: scala.Double,
    options: ScryptOptions,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: nodeLib.Buffer,
    salt: nodeLib.Buffer,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: nodeLib.Buffer,
    salt: nodeLib.Buffer,
    keylen: scala.Double,
    options: ScryptOptions,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: nodeLib.Buffer,
    salt: nodeLib.NodeJSNs.TypedArray,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: nodeLib.Buffer,
    salt: nodeLib.NodeJSNs.TypedArray,
    keylen: scala.Double,
    options: ScryptOptions,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: nodeLib.Buffer,
    salt: stdLib.DataView,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: nodeLib.Buffer,
    salt: stdLib.DataView,
    keylen: scala.Double,
    options: ScryptOptions,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: java.lang.String,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: java.lang.String,
    keylen: scala.Double,
    options: ScryptOptions,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: nodeLib.Buffer,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: nodeLib.Buffer,
    keylen: scala.Double,
    options: ScryptOptions,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: nodeLib.NodeJSNs.TypedArray,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: nodeLib.NodeJSNs.TypedArray,
    keylen: scala.Double,
    options: ScryptOptions,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: stdLib.DataView,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: stdLib.DataView,
    keylen: scala.Double,
    options: ScryptOptions,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: stdLib.DataView,
    salt: java.lang.String,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: stdLib.DataView,
    salt: java.lang.String,
    keylen: scala.Double,
    options: ScryptOptions,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: stdLib.DataView,
    salt: nodeLib.Buffer,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: stdLib.DataView,
    salt: nodeLib.Buffer,
    keylen: scala.Double,
    options: ScryptOptions,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: stdLib.DataView,
    salt: nodeLib.NodeJSNs.TypedArray,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: stdLib.DataView,
    salt: nodeLib.NodeJSNs.TypedArray,
    keylen: scala.Double,
    options: ScryptOptions,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: stdLib.DataView,
    salt: stdLib.DataView,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: stdLib.DataView,
    salt: stdLib.DataView,
    keylen: scala.Double,
    options: ScryptOptions,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scryptSync(password: java.lang.String, salt: java.lang.String, keylen: scala.Double): nodeLib.Buffer = js.native
  def scryptSync(password: java.lang.String, salt: java.lang.String, keylen: scala.Double, options: ScryptOptions): nodeLib.Buffer = js.native
  def scryptSync(password: java.lang.String, salt: nodeLib.Buffer, keylen: scala.Double): nodeLib.Buffer = js.native
  def scryptSync(password: java.lang.String, salt: nodeLib.Buffer, keylen: scala.Double, options: ScryptOptions): nodeLib.Buffer = js.native
  def scryptSync(password: java.lang.String, salt: nodeLib.NodeJSNs.TypedArray, keylen: scala.Double): nodeLib.Buffer = js.native
  def scryptSync(
    password: java.lang.String,
    salt: nodeLib.NodeJSNs.TypedArray,
    keylen: scala.Double,
    options: ScryptOptions
  ): nodeLib.Buffer = js.native
  def scryptSync(password: java.lang.String, salt: stdLib.DataView, keylen: scala.Double): nodeLib.Buffer = js.native
  def scryptSync(password: java.lang.String, salt: stdLib.DataView, keylen: scala.Double, options: ScryptOptions): nodeLib.Buffer = js.native
  def scryptSync(password: nodeLib.Buffer, salt: java.lang.String, keylen: scala.Double): nodeLib.Buffer = js.native
  def scryptSync(password: nodeLib.Buffer, salt: java.lang.String, keylen: scala.Double, options: ScryptOptions): nodeLib.Buffer = js.native
  def scryptSync(password: nodeLib.Buffer, salt: nodeLib.Buffer, keylen: scala.Double): nodeLib.Buffer = js.native
  def scryptSync(password: nodeLib.Buffer, salt: nodeLib.Buffer, keylen: scala.Double, options: ScryptOptions): nodeLib.Buffer = js.native
  def scryptSync(password: nodeLib.Buffer, salt: nodeLib.NodeJSNs.TypedArray, keylen: scala.Double): nodeLib.Buffer = js.native
  def scryptSync(
    password: nodeLib.Buffer,
    salt: nodeLib.NodeJSNs.TypedArray,
    keylen: scala.Double,
    options: ScryptOptions
  ): nodeLib.Buffer = js.native
  def scryptSync(password: nodeLib.Buffer, salt: stdLib.DataView, keylen: scala.Double): nodeLib.Buffer = js.native
  def scryptSync(password: nodeLib.Buffer, salt: stdLib.DataView, keylen: scala.Double, options: ScryptOptions): nodeLib.Buffer = js.native
  def scryptSync(password: nodeLib.NodeJSNs.TypedArray, salt: java.lang.String, keylen: scala.Double): nodeLib.Buffer = js.native
  def scryptSync(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: java.lang.String,
    keylen: scala.Double,
    options: ScryptOptions
  ): nodeLib.Buffer = js.native
  def scryptSync(password: nodeLib.NodeJSNs.TypedArray, salt: nodeLib.Buffer, keylen: scala.Double): nodeLib.Buffer = js.native
  def scryptSync(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: nodeLib.Buffer,
    keylen: scala.Double,
    options: ScryptOptions
  ): nodeLib.Buffer = js.native
  def scryptSync(password: nodeLib.NodeJSNs.TypedArray, salt: nodeLib.NodeJSNs.TypedArray, keylen: scala.Double): nodeLib.Buffer = js.native
  def scryptSync(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: nodeLib.NodeJSNs.TypedArray,
    keylen: scala.Double,
    options: ScryptOptions
  ): nodeLib.Buffer = js.native
  def scryptSync(password: nodeLib.NodeJSNs.TypedArray, salt: stdLib.DataView, keylen: scala.Double): nodeLib.Buffer = js.native
  def scryptSync(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: stdLib.DataView,
    keylen: scala.Double,
    options: ScryptOptions
  ): nodeLib.Buffer = js.native
  def scryptSync(password: stdLib.DataView, salt: java.lang.String, keylen: scala.Double): nodeLib.Buffer = js.native
  def scryptSync(password: stdLib.DataView, salt: java.lang.String, keylen: scala.Double, options: ScryptOptions): nodeLib.Buffer = js.native
  def scryptSync(password: stdLib.DataView, salt: nodeLib.Buffer, keylen: scala.Double): nodeLib.Buffer = js.native
  def scryptSync(password: stdLib.DataView, salt: nodeLib.Buffer, keylen: scala.Double, options: ScryptOptions): nodeLib.Buffer = js.native
  def scryptSync(password: stdLib.DataView, salt: nodeLib.NodeJSNs.TypedArray, keylen: scala.Double): nodeLib.Buffer = js.native
  def scryptSync(
    password: stdLib.DataView,
    salt: nodeLib.NodeJSNs.TypedArray,
    keylen: scala.Double,
    options: ScryptOptions
  ): nodeLib.Buffer = js.native
  def scryptSync(password: stdLib.DataView, salt: stdLib.DataView, keylen: scala.Double): nodeLib.Buffer = js.native
  def scryptSync(password: stdLib.DataView, salt: stdLib.DataView, keylen: scala.Double, options: ScryptOptions): nodeLib.Buffer = js.native
  def timingSafeEqual(a: nodeLib.Buffer, b: nodeLib.Buffer): scala.Boolean = js.native
  def timingSafeEqual(a: nodeLib.Buffer, b: nodeLib.NodeJSNs.TypedArray): scala.Boolean = js.native
  def timingSafeEqual(a: nodeLib.Buffer, b: stdLib.DataView): scala.Boolean = js.native
  def timingSafeEqual(a: nodeLib.NodeJSNs.TypedArray, b: nodeLib.Buffer): scala.Boolean = js.native
  def timingSafeEqual(a: nodeLib.NodeJSNs.TypedArray, b: nodeLib.NodeJSNs.TypedArray): scala.Boolean = js.native
  def timingSafeEqual(a: nodeLib.NodeJSNs.TypedArray, b: stdLib.DataView): scala.Boolean = js.native
  def timingSafeEqual(a: stdLib.DataView, b: nodeLib.Buffer): scala.Boolean = js.native
  def timingSafeEqual(a: stdLib.DataView, b: nodeLib.NodeJSNs.TypedArray): scala.Boolean = js.native
  def timingSafeEqual(a: stdLib.DataView, b: stdLib.DataView): scala.Boolean = js.native
}

