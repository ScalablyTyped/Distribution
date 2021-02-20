package typings.node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object cryptoMod {
  
  type BinaryLike = java.lang.String | typings.node.NodeJS.ArrayBufferView
  
  type CipherKey = typings.node.cryptoMod.BinaryLike | typings.node.cryptoMod.KeyObject
  
  /** @deprecated since v10.0.0 */
  @scala.inline
  def DEFAULT_ENCODING: typings.node.BufferEncoding = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_ENCODING").asInstanceOf[typings.node.BufferEncoding]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.node.Buffer
    - typings.node.cryptoMod.KeyObject
  */
  type KeyLike = typings.node.cryptoMod._KeyLike | java.lang.String
  
  /** @deprecated since v10.0.0 use `createCipheriv()` */
  @scala.inline
  def createCipher(algorithm: java.lang.String, password: typings.node.cryptoMod.BinaryLike): typings.node.cryptoMod.Cipher = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Cipher]
  @scala.inline
  def createCipher(
    algorithm: java.lang.String,
    password: typings.node.cryptoMod.BinaryLike,
    options: typings.node.streamMod.TransformOptions
  ): typings.node.cryptoMod.Cipher = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Cipher]
  /** @deprecated since v10.0.0 use `createCipheriv()` */
  @scala.inline
  def createCipher(
    algorithm: typings.node.cryptoMod.CipherCCMTypes,
    password: typings.node.cryptoMod.BinaryLike,
    options: typings.node.cryptoMod.CipherCCMOptions
  ): typings.node.cryptoMod.CipherCCM = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.CipherCCM]
  /** @deprecated since v10.0.0 use `createCipheriv()` */
  @scala.inline
  def createCipher(algorithm: typings.node.cryptoMod.CipherGCMTypes, password: typings.node.cryptoMod.BinaryLike): typings.node.cryptoMod.CipherGCM = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.CipherGCM]
  @scala.inline
  def createCipher(
    algorithm: typings.node.cryptoMod.CipherGCMTypes,
    password: typings.node.cryptoMod.BinaryLike,
    options: typings.node.cryptoMod.CipherGCMOptions
  ): typings.node.cryptoMod.CipherGCM = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.CipherGCM]
  
  @scala.inline
  def createCipheriv(algorithm: java.lang.String, key: typings.node.cryptoMod.CipherKey): typings.node.cryptoMod.Cipher = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Cipher]
  @scala.inline
  def createCipheriv(
    algorithm: java.lang.String,
    key: typings.node.cryptoMod.CipherKey,
    iv: scala.Null,
    options: typings.node.streamMod.TransformOptions
  ): typings.node.cryptoMod.Cipher = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Cipher]
  @scala.inline
  def createCipheriv(
    algorithm: java.lang.String,
    key: typings.node.cryptoMod.CipherKey,
    iv: typings.node.cryptoMod.BinaryLike
  ): typings.node.cryptoMod.Cipher = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Cipher]
  @scala.inline
  def createCipheriv(
    algorithm: java.lang.String,
    key: typings.node.cryptoMod.CipherKey,
    iv: typings.node.cryptoMod.BinaryLike,
    options: typings.node.streamMod.TransformOptions
  ): typings.node.cryptoMod.Cipher = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Cipher]
  @scala.inline
  def createCipheriv(
    algorithm: typings.node.cryptoMod.CipherCCMTypes,
    key: typings.node.cryptoMod.CipherKey,
    iv: scala.Null,
    options: typings.node.cryptoMod.CipherCCMOptions
  ): typings.node.cryptoMod.CipherCCM = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.CipherCCM]
  @scala.inline
  def createCipheriv(
    algorithm: typings.node.cryptoMod.CipherCCMTypes,
    key: typings.node.cryptoMod.CipherKey,
    iv: typings.node.cryptoMod.BinaryLike,
    options: typings.node.cryptoMod.CipherCCMOptions
  ): typings.node.cryptoMod.CipherCCM = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.CipherCCM]
  @scala.inline
  def createCipheriv(algorithm: typings.node.cryptoMod.CipherGCMTypes, key: typings.node.cryptoMod.CipherKey): typings.node.cryptoMod.CipherGCM = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.CipherGCM]
  @scala.inline
  def createCipheriv(
    algorithm: typings.node.cryptoMod.CipherGCMTypes,
    key: typings.node.cryptoMod.CipherKey,
    iv: scala.Null,
    options: typings.node.cryptoMod.CipherGCMOptions
  ): typings.node.cryptoMod.CipherGCM = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.CipherGCM]
  @scala.inline
  def createCipheriv(
    algorithm: typings.node.cryptoMod.CipherGCMTypes,
    key: typings.node.cryptoMod.CipherKey,
    iv: typings.node.cryptoMod.BinaryLike
  ): typings.node.cryptoMod.CipherGCM = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.CipherGCM]
  @scala.inline
  def createCipheriv(
    algorithm: typings.node.cryptoMod.CipherGCMTypes,
    key: typings.node.cryptoMod.CipherKey,
    iv: typings.node.cryptoMod.BinaryLike,
    options: typings.node.cryptoMod.CipherGCMOptions
  ): typings.node.cryptoMod.CipherGCM = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.CipherGCM]
  
  /** @deprecated since v10.0.0 use `createDecipheriv()` */
  @scala.inline
  def createDecipher(algorithm: java.lang.String, password: typings.node.cryptoMod.BinaryLike): typings.node.cryptoMod.Decipher = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Decipher]
  @scala.inline
  def createDecipher(
    algorithm: java.lang.String,
    password: typings.node.cryptoMod.BinaryLike,
    options: typings.node.streamMod.TransformOptions
  ): typings.node.cryptoMod.Decipher = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Decipher]
  /** @deprecated since v10.0.0 use `createDecipheriv()` */
  @scala.inline
  def createDecipher(
    algorithm: typings.node.cryptoMod.CipherCCMTypes,
    password: typings.node.cryptoMod.BinaryLike,
    options: typings.node.cryptoMod.CipherCCMOptions
  ): typings.node.cryptoMod.DecipherCCM = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.DecipherCCM]
  /** @deprecated since v10.0.0 use `createDecipheriv()` */
  @scala.inline
  def createDecipher(algorithm: typings.node.cryptoMod.CipherGCMTypes, password: typings.node.cryptoMod.BinaryLike): typings.node.cryptoMod.DecipherGCM = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.DecipherGCM]
  @scala.inline
  def createDecipher(
    algorithm: typings.node.cryptoMod.CipherGCMTypes,
    password: typings.node.cryptoMod.BinaryLike,
    options: typings.node.cryptoMod.CipherGCMOptions
  ): typings.node.cryptoMod.DecipherGCM = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.DecipherGCM]
  
  @scala.inline
  def createDecipheriv(algorithm: java.lang.String, key: typings.node.cryptoMod.CipherKey): typings.node.cryptoMod.Decipher = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Decipher]
  @scala.inline
  def createDecipheriv(
    algorithm: java.lang.String,
    key: typings.node.cryptoMod.CipherKey,
    iv: scala.Null,
    options: typings.node.streamMod.TransformOptions
  ): typings.node.cryptoMod.Decipher = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Decipher]
  @scala.inline
  def createDecipheriv(
    algorithm: java.lang.String,
    key: typings.node.cryptoMod.CipherKey,
    iv: typings.node.cryptoMod.BinaryLike
  ): typings.node.cryptoMod.Decipher = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Decipher]
  @scala.inline
  def createDecipheriv(
    algorithm: java.lang.String,
    key: typings.node.cryptoMod.CipherKey,
    iv: typings.node.cryptoMod.BinaryLike,
    options: typings.node.streamMod.TransformOptions
  ): typings.node.cryptoMod.Decipher = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Decipher]
  @scala.inline
  def createDecipheriv(
    algorithm: typings.node.cryptoMod.CipherCCMTypes,
    key: typings.node.cryptoMod.CipherKey,
    iv: scala.Null,
    options: typings.node.cryptoMod.CipherCCMOptions
  ): typings.node.cryptoMod.DecipherCCM = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.DecipherCCM]
  @scala.inline
  def createDecipheriv(
    algorithm: typings.node.cryptoMod.CipherCCMTypes,
    key: typings.node.cryptoMod.CipherKey,
    iv: typings.node.cryptoMod.BinaryLike,
    options: typings.node.cryptoMod.CipherCCMOptions
  ): typings.node.cryptoMod.DecipherCCM = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.DecipherCCM]
  @scala.inline
  def createDecipheriv(algorithm: typings.node.cryptoMod.CipherGCMTypes, key: typings.node.cryptoMod.CipherKey): typings.node.cryptoMod.DecipherGCM = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.DecipherGCM]
  @scala.inline
  def createDecipheriv(
    algorithm: typings.node.cryptoMod.CipherGCMTypes,
    key: typings.node.cryptoMod.CipherKey,
    iv: scala.Null,
    options: typings.node.cryptoMod.CipherGCMOptions
  ): typings.node.cryptoMod.DecipherGCM = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.DecipherGCM]
  @scala.inline
  def createDecipheriv(
    algorithm: typings.node.cryptoMod.CipherGCMTypes,
    key: typings.node.cryptoMod.CipherKey,
    iv: typings.node.cryptoMod.BinaryLike
  ): typings.node.cryptoMod.DecipherGCM = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.DecipherGCM]
  @scala.inline
  def createDecipheriv(
    algorithm: typings.node.cryptoMod.CipherGCMTypes,
    key: typings.node.cryptoMod.CipherKey,
    iv: typings.node.cryptoMod.BinaryLike,
    options: typings.node.cryptoMod.CipherGCMOptions
  ): typings.node.cryptoMod.DecipherGCM = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.DecipherGCM]
  
  @scala.inline
  def createDiffieHellman(prime_length: scala.Double): typings.node.cryptoMod.DiffieHellman_ = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime_length.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.DiffieHellman_]
  @scala.inline
  def createDiffieHellman(prime_length: scala.Double, generator: scala.Double): typings.node.cryptoMod.DiffieHellman_ = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime_length.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.DiffieHellman_]
  @scala.inline
  def createDiffieHellman(prime_length: scala.Double, generator: typings.node.NodeJS.ArrayBufferView): typings.node.cryptoMod.DiffieHellman_ = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime_length.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.DiffieHellman_]
  @scala.inline
  def createDiffieHellman(prime: java.lang.String, prime_encoding: typings.node.cryptoMod.HexBase64Latin1Encoding): typings.node.cryptoMod.DiffieHellman_ = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], prime_encoding.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.DiffieHellman_]
  @scala.inline
  def createDiffieHellman(
    prime: java.lang.String,
    prime_encoding: typings.node.cryptoMod.HexBase64Latin1Encoding,
    generator: java.lang.String,
    generator_encoding: typings.node.cryptoMod.HexBase64Latin1Encoding
  ): typings.node.cryptoMod.DiffieHellman_ = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], prime_encoding.asInstanceOf[js.Any], generator.asInstanceOf[js.Any], generator_encoding.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.DiffieHellman_]
  @scala.inline
  def createDiffieHellman(
    prime: java.lang.String,
    prime_encoding: typings.node.cryptoMod.HexBase64Latin1Encoding,
    generator: scala.Double
  ): typings.node.cryptoMod.DiffieHellman_ = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], prime_encoding.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.DiffieHellman_]
  @scala.inline
  def createDiffieHellman(
    prime: java.lang.String,
    prime_encoding: typings.node.cryptoMod.HexBase64Latin1Encoding,
    generator: typings.node.NodeJS.ArrayBufferView
  ): typings.node.cryptoMod.DiffieHellman_ = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], prime_encoding.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.DiffieHellman_]
  @scala.inline
  def createDiffieHellman(prime: typings.node.NodeJS.ArrayBufferView): typings.node.cryptoMod.DiffieHellman_ = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.DiffieHellman_]
  
  @scala.inline
  def createECDH(curve_name: java.lang.String): typings.node.cryptoMod.ECDH = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createECDH")(curve_name.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.ECDH]
  
  @scala.inline
  def createHash(algorithm: java.lang.String): typings.node.cryptoMod.Hash = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createHash")(algorithm.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.Hash]
  @scala.inline
  def createHash(algorithm: java.lang.String, options: typings.node.cryptoMod.HashOptions): typings.node.cryptoMod.Hash = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createHash")(algorithm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Hash]
  
  @scala.inline
  def createHmac(algorithm: java.lang.String, key: typings.node.cryptoMod.BinaryLike): typings.node.cryptoMod.Hmac = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Hmac]
  @scala.inline
  def createHmac(
    algorithm: java.lang.String,
    key: typings.node.cryptoMod.BinaryLike,
    options: typings.node.streamMod.TransformOptions
  ): typings.node.cryptoMod.Hmac = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Hmac]
  @scala.inline
  def createHmac(algorithm: java.lang.String, key: typings.node.cryptoMod.KeyObject): typings.node.cryptoMod.Hmac = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Hmac]
  @scala.inline
  def createHmac(
    algorithm: java.lang.String,
    key: typings.node.cryptoMod.KeyObject,
    options: typings.node.streamMod.TransformOptions
  ): typings.node.cryptoMod.Hmac = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Hmac]
  
  @scala.inline
  def createPrivateKey(key: java.lang.String): typings.node.cryptoMod.KeyObject = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKey")(key.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.KeyObject]
  @scala.inline
  def createPrivateKey(key: typings.node.Buffer): typings.node.cryptoMod.KeyObject = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKey")(key.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.KeyObject]
  @scala.inline
  def createPrivateKey(key: typings.node.cryptoMod.PrivateKeyInput): typings.node.cryptoMod.KeyObject = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKey")(key.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.KeyObject]
  
  @scala.inline
  def createPublicKey(key: java.lang.String): typings.node.cryptoMod.KeyObject = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.KeyObject]
  @scala.inline
  def createPublicKey(key: typings.node.Buffer): typings.node.cryptoMod.KeyObject = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.KeyObject]
  @scala.inline
  def createPublicKey(key: typings.node.cryptoMod.KeyObject): typings.node.cryptoMod.KeyObject = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.KeyObject]
  @scala.inline
  def createPublicKey(key: typings.node.cryptoMod.PublicKeyInput): typings.node.cryptoMod.KeyObject = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.KeyObject]
  
  @scala.inline
  def createSecretKey(key: typings.node.NodeJS.ArrayBufferView): typings.node.cryptoMod.KeyObject = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecretKey")(key.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.KeyObject]
  
  @scala.inline
  def createSign(algorithm: java.lang.String): typings.node.cryptoMod.Signer = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSign")(algorithm.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.Signer]
  @scala.inline
  def createSign(algorithm: java.lang.String, options: typings.node.streamMod.WritableOptions): typings.node.cryptoMod.Signer = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSign")(algorithm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Signer]
  
  @scala.inline
  def createVerify(algorithm: java.lang.String): typings.node.cryptoMod.Verify_ = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createVerify")(algorithm.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.Verify_]
  @scala.inline
  def createVerify(algorithm: java.lang.String, options: typings.node.streamMod.WritableOptions): typings.node.cryptoMod.Verify_ = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createVerify")(algorithm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Verify_]
  
  /**
    * Computes the Diffie-Hellman secret based on a privateKey and a publicKey.
    * Both keys must have the same asymmetricKeyType, which must be one of
    * 'dh' (for Diffie-Hellman), 'ec' (for ECDH), 'x448', or 'x25519' (for ECDH-ES).
    */
  @scala.inline
  def diffieHellman(options: typings.node.anon.PrivateKey): typings.node.Buffer = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("diffieHellman")(options.asInstanceOf[js.Any]).asInstanceOf[typings.node.Buffer]
  
  /** @deprecated since v10.0.0 */
  @scala.inline
  def fips: scala.Boolean = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].selectDynamic("fips").asInstanceOf[scala.Boolean]
  
  @scala.inline
  def generateKeyPair(
    `type`: typings.node.nodeStrings.dsa,
    options: typings.node.cryptoMod.DSAKeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ typings.std.Error | scala.Null, 
      /* publicKey */ typings.node.cryptoMod.KeyObject, 
      /* privateKey */ typings.node.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: typings.node.nodeStrings.dsa,
    options: typings.node.cryptoMod.DSAKeyPairOptions[
      typings.node.nodeStrings.der | typings.node.nodeStrings.pem, 
      typings.node.nodeStrings.der | typings.node.nodeStrings.pem
    ],
    callback: js.Function3[
      typings.std.Error | scala.Null, 
      (/* publicKey */ typings.node.Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ typings.node.Buffer) | (/* privateKey */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: typings.node.nodeStrings.ec,
    options: typings.node.cryptoMod.ECKeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ typings.std.Error | scala.Null, 
      /* publicKey */ typings.node.cryptoMod.KeyObject, 
      /* privateKey */ typings.node.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: typings.node.nodeStrings.ec,
    options: typings.node.cryptoMod.ECKeyPairOptions[
      typings.node.nodeStrings.der | typings.node.nodeStrings.pem, 
      typings.node.nodeStrings.der | typings.node.nodeStrings.pem
    ],
    callback: js.Function3[
      typings.std.Error | scala.Null, 
      (/* publicKey */ typings.node.Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ typings.node.Buffer) | (/* privateKey */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: typings.node.nodeStrings.ed25519,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.std.Error | scala.Null, 
      /* publicKey */ typings.node.cryptoMod.KeyObject, 
      /* privateKey */ typings.node.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: typings.node.nodeStrings.ed25519,
    options: typings.node.cryptoMod.ED25519KeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ typings.std.Error | scala.Null, 
      /* publicKey */ typings.node.cryptoMod.KeyObject, 
      /* privateKey */ typings.node.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: typings.node.nodeStrings.ed25519,
    options: typings.node.cryptoMod.ED25519KeyPairOptions[
      typings.node.nodeStrings.der | typings.node.nodeStrings.pem, 
      typings.node.nodeStrings.der | typings.node.nodeStrings.pem
    ],
    callback: js.Function3[
      typings.std.Error | scala.Null, 
      (/* publicKey */ typings.node.Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ typings.node.Buffer) | (/* privateKey */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: typings.node.nodeStrings.ed448,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.std.Error | scala.Null, 
      /* publicKey */ typings.node.cryptoMod.KeyObject, 
      /* privateKey */ typings.node.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: typings.node.nodeStrings.ed448,
    options: typings.node.cryptoMod.ED448KeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ typings.std.Error | scala.Null, 
      /* publicKey */ typings.node.cryptoMod.KeyObject, 
      /* privateKey */ typings.node.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: typings.node.nodeStrings.ed448,
    options: typings.node.cryptoMod.ED448KeyPairOptions[
      typings.node.nodeStrings.der | typings.node.nodeStrings.pem, 
      typings.node.nodeStrings.der | typings.node.nodeStrings.pem
    ],
    callback: js.Function3[
      typings.std.Error | scala.Null, 
      (/* publicKey */ typings.node.Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ typings.node.Buffer) | (/* privateKey */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: typings.node.nodeStrings.rsa,
    options: typings.node.cryptoMod.RSAKeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ typings.std.Error | scala.Null, 
      /* publicKey */ typings.node.cryptoMod.KeyObject, 
      /* privateKey */ typings.node.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: typings.node.nodeStrings.rsa,
    options: typings.node.cryptoMod.RSAKeyPairOptions[
      typings.node.nodeStrings.der | typings.node.nodeStrings.pem, 
      typings.node.nodeStrings.der | typings.node.nodeStrings.pem
    ],
    callback: js.Function3[
      typings.std.Error | scala.Null, 
      (/* publicKey */ typings.node.Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ typings.node.Buffer) | (/* privateKey */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: typings.node.nodeStrings.x25519,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.std.Error | scala.Null, 
      /* publicKey */ typings.node.cryptoMod.KeyObject, 
      /* privateKey */ typings.node.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: typings.node.nodeStrings.x25519,
    options: typings.node.cryptoMod.X25519KeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ typings.std.Error | scala.Null, 
      /* publicKey */ typings.node.cryptoMod.KeyObject, 
      /* privateKey */ typings.node.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: typings.node.nodeStrings.x25519,
    options: typings.node.cryptoMod.X25519KeyPairOptions[
      typings.node.nodeStrings.der | typings.node.nodeStrings.pem, 
      typings.node.nodeStrings.der | typings.node.nodeStrings.pem
    ],
    callback: js.Function3[
      typings.std.Error | scala.Null, 
      (/* publicKey */ typings.node.Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ typings.node.Buffer) | (/* privateKey */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: typings.node.nodeStrings.x448,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.std.Error | scala.Null, 
      /* publicKey */ typings.node.cryptoMod.KeyObject, 
      /* privateKey */ typings.node.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: typings.node.nodeStrings.x448,
    options: typings.node.cryptoMod.X448KeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ typings.std.Error | scala.Null, 
      /* publicKey */ typings.node.cryptoMod.KeyObject, 
      /* privateKey */ typings.node.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: typings.node.nodeStrings.x448,
    options: typings.node.cryptoMod.X448KeyPairOptions[
      typings.node.nodeStrings.der | typings.node.nodeStrings.pem, 
      typings.node.nodeStrings.der | typings.node.nodeStrings.pem
    ],
    callback: js.Function3[
      typings.std.Error | scala.Null, 
      (/* publicKey */ typings.node.Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ typings.node.Buffer) | (/* privateKey */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def generateKeyPairSync(
    `type`: typings.node.nodeStrings.dsa,
    options: typings.node.cryptoMod.DSAKeyPairOptions[
      typings.node.nodeStrings.der | typings.node.nodeStrings.pem, 
      typings.node.nodeStrings.der | typings.node.nodeStrings.pem
    ]
  ): typings.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String] = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String]]
  @scala.inline
  def generateKeyPairSync(
    `type`: typings.node.nodeStrings.ec,
    options: typings.node.cryptoMod.ECKeyPairOptions[
      typings.node.nodeStrings.der | typings.node.nodeStrings.pem, 
      typings.node.nodeStrings.der | typings.node.nodeStrings.pem
    ]
  ): typings.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String] = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String]]
  @scala.inline
  def generateKeyPairSync(
    `type`: typings.node.nodeStrings.ed25519,
    options: typings.node.cryptoMod.ED25519KeyPairOptions[
      typings.node.nodeStrings.der | typings.node.nodeStrings.pem, 
      typings.node.nodeStrings.der | typings.node.nodeStrings.pem
    ]
  ): typings.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String] = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String]]
  @scala.inline
  def generateKeyPairSync(
    `type`: typings.node.nodeStrings.ed448,
    options: typings.node.cryptoMod.ED448KeyPairOptions[
      typings.node.nodeStrings.der | typings.node.nodeStrings.pem, 
      typings.node.nodeStrings.der | typings.node.nodeStrings.pem
    ]
  ): typings.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String] = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String]]
  @scala.inline
  def generateKeyPairSync(
    `type`: typings.node.nodeStrings.rsa,
    options: typings.node.cryptoMod.RSAKeyPairOptions[
      typings.node.nodeStrings.der | typings.node.nodeStrings.pem, 
      typings.node.nodeStrings.der | typings.node.nodeStrings.pem
    ]
  ): typings.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String] = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String]]
  @scala.inline
  def generateKeyPairSync(
    `type`: typings.node.nodeStrings.x25519,
    options: typings.node.cryptoMod.X25519KeyPairOptions[
      typings.node.nodeStrings.der | typings.node.nodeStrings.pem, 
      typings.node.nodeStrings.der | typings.node.nodeStrings.pem
    ]
  ): typings.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String] = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String]]
  @scala.inline
  def generateKeyPairSync(
    `type`: typings.node.nodeStrings.x448,
    options: typings.node.cryptoMod.X448KeyPairOptions[
      typings.node.nodeStrings.der | typings.node.nodeStrings.pem, 
      typings.node.nodeStrings.der | typings.node.nodeStrings.pem
    ]
  ): typings.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String] = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String]]
  
  @scala.inline
  def generateKeyPairSync_dsa(`type`: typings.node.nodeStrings.dsa, options: typings.node.cryptoMod.DSAKeyPairKeyObjectOptions): typings.node.cryptoMod.KeyPairKeyObjectResult = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.KeyPairKeyObjectResult]
  
  @scala.inline
  def generateKeyPairSync_ec(`type`: typings.node.nodeStrings.ec, options: typings.node.cryptoMod.ECKeyPairKeyObjectOptions): typings.node.cryptoMod.KeyPairKeyObjectResult = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.KeyPairKeyObjectResult]
  
  @scala.inline
  def generateKeyPairSync_ed25519(`type`: typings.node.nodeStrings.ed25519): typings.node.cryptoMod.KeyPairKeyObjectResult = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.KeyPairKeyObjectResult]
  @scala.inline
  def generateKeyPairSync_ed25519(
    `type`: typings.node.nodeStrings.ed25519,
    options: typings.node.cryptoMod.ED25519KeyPairKeyObjectOptions
  ): typings.node.cryptoMod.KeyPairKeyObjectResult = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.KeyPairKeyObjectResult]
  
  @scala.inline
  def generateKeyPairSync_ed448(`type`: typings.node.nodeStrings.ed448): typings.node.cryptoMod.KeyPairKeyObjectResult = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.KeyPairKeyObjectResult]
  @scala.inline
  def generateKeyPairSync_ed448(
    `type`: typings.node.nodeStrings.ed448,
    options: typings.node.cryptoMod.ED448KeyPairKeyObjectOptions
  ): typings.node.cryptoMod.KeyPairKeyObjectResult = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.KeyPairKeyObjectResult]
  
  @scala.inline
  def generateKeyPairSync_rsa(`type`: typings.node.nodeStrings.rsa, options: typings.node.cryptoMod.RSAKeyPairKeyObjectOptions): typings.node.cryptoMod.KeyPairKeyObjectResult = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.KeyPairKeyObjectResult]
  
  @scala.inline
  def generateKeyPairSync_x25519(`type`: typings.node.nodeStrings.x25519): typings.node.cryptoMod.KeyPairKeyObjectResult = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.KeyPairKeyObjectResult]
  @scala.inline
  def generateKeyPairSync_x25519(
    `type`: typings.node.nodeStrings.x25519,
    options: typings.node.cryptoMod.X25519KeyPairKeyObjectOptions
  ): typings.node.cryptoMod.KeyPairKeyObjectResult = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.KeyPairKeyObjectResult]
  
  @scala.inline
  def generateKeyPairSync_x448(`type`: typings.node.nodeStrings.x448): typings.node.cryptoMod.KeyPairKeyObjectResult = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.KeyPairKeyObjectResult]
  @scala.inline
  def generateKeyPairSync_x448(`type`: typings.node.nodeStrings.x448, options: typings.node.cryptoMod.X448KeyPairKeyObjectOptions): typings.node.cryptoMod.KeyPairKeyObjectResult = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.KeyPairKeyObjectResult]
  
  @scala.inline
  def getCiphers(): js.Array[java.lang.String] = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("getCiphers")().asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def getCurves(): js.Array[java.lang.String] = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("getCurves")().asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def getDiffieHellman(group_name: java.lang.String): typings.node.cryptoMod.DiffieHellman_ = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("getDiffieHellman")(group_name.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.DiffieHellman_]
  
  @scala.inline
  def getFips(): typings.node.nodeNumbers.`1` | typings.node.nodeNumbers.`0` = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("getFips")().asInstanceOf[typings.node.nodeNumbers.`1` | typings.node.nodeNumbers.`0`]
  
  @scala.inline
  def getHashes(): js.Array[java.lang.String] = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("getHashes")().asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def pbkdf2(
    password: typings.node.cryptoMod.BinaryLike,
    salt: typings.node.cryptoMod.BinaryLike,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ typings.std.Error | scala.Null, /* derivedKey */ typings.node.Buffer, _]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def pbkdf2Sync(
    password: typings.node.cryptoMod.BinaryLike,
    salt: typings.node.cryptoMod.BinaryLike,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): typings.node.Buffer = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
  
  @scala.inline
  def privateDecrypt(private_key: typings.node.cryptoMod.KeyLike, buffer: typings.node.NodeJS.ArrayBufferView): typings.node.Buffer = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("privateDecrypt")(private_key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
  @scala.inline
  def privateDecrypt(private_key: typings.node.cryptoMod.RsaPrivateKey, buffer: typings.node.NodeJS.ArrayBufferView): typings.node.Buffer = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("privateDecrypt")(private_key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
  
  @scala.inline
  def privateEncrypt(private_key: typings.node.cryptoMod.KeyLike, buffer: typings.node.NodeJS.ArrayBufferView): typings.node.Buffer = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("privateEncrypt")(private_key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
  @scala.inline
  def privateEncrypt(private_key: typings.node.cryptoMod.RsaPrivateKey, buffer: typings.node.NodeJS.ArrayBufferView): typings.node.Buffer = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("privateEncrypt")(private_key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
  
  @scala.inline
  def pseudoRandomBytes(size: scala.Double): typings.node.Buffer = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("pseudoRandomBytes")(size.asInstanceOf[js.Any]).asInstanceOf[typings.node.Buffer]
  @scala.inline
  def pseudoRandomBytes(
    size: scala.Double,
    callback: js.Function2[/* err */ typings.std.Error | scala.Null, /* buf */ typings.node.Buffer, scala.Unit]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("pseudoRandomBytes")(size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def publicDecrypt(key: typings.node.cryptoMod.KeyLike, buffer: typings.node.NodeJS.ArrayBufferView): typings.node.Buffer = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("publicDecrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
  @scala.inline
  def publicDecrypt(key: typings.node.cryptoMod.RsaPrivateKey, buffer: typings.node.NodeJS.ArrayBufferView): typings.node.Buffer = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("publicDecrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
  @scala.inline
  def publicDecrypt(key: typings.node.cryptoMod.RsaPublicKey, buffer: typings.node.NodeJS.ArrayBufferView): typings.node.Buffer = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("publicDecrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
  
  @scala.inline
  def publicEncrypt(key: typings.node.cryptoMod.KeyLike, buffer: typings.node.NodeJS.ArrayBufferView): typings.node.Buffer = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("publicEncrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
  @scala.inline
  def publicEncrypt(key: typings.node.cryptoMod.RsaPrivateKey, buffer: typings.node.NodeJS.ArrayBufferView): typings.node.Buffer = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("publicEncrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
  @scala.inline
  def publicEncrypt(key: typings.node.cryptoMod.RsaPublicKey, buffer: typings.node.NodeJS.ArrayBufferView): typings.node.Buffer = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("publicEncrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
  
  @scala.inline
  def randomBytes(size: scala.Double): typings.node.Buffer = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(size.asInstanceOf[js.Any]).asInstanceOf[typings.node.Buffer]
  @scala.inline
  def randomBytes(
    size: scala.Double,
    callback: js.Function2[/* err */ typings.std.Error | scala.Null, /* buf */ typings.node.Buffer, scala.Unit]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def randomFill(
    buffer: typings.std.DataView,
    callback: js.Function2[/* err */ typings.std.Error | scala.Null, /* buf */ typings.std.DataView, scala.Unit]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: typings.std.DataView,
    offset: scala.Double,
    callback: js.Function2[/* err */ typings.std.Error | scala.Null, /* buf */ typings.std.DataView, scala.Unit]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: typings.std.DataView,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ typings.std.Error | scala.Null, /* buf */ typings.std.DataView, scala.Unit]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: typings.std.Float32Array,
    callback: js.Function2[
      /* err */ typings.std.Error | scala.Null, 
      /* buf */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: typings.std.Float32Array,
    offset: scala.Double,
    callback: js.Function2[
      /* err */ typings.std.Error | scala.Null, 
      /* buf */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: typings.std.Float32Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[
      /* err */ typings.std.Error | scala.Null, 
      /* buf */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: typings.std.Float64Array,
    callback: js.Function2[
      /* err */ typings.std.Error | scala.Null, 
      /* buf */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: typings.std.Float64Array,
    offset: scala.Double,
    callback: js.Function2[
      /* err */ typings.std.Error | scala.Null, 
      /* buf */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: typings.std.Float64Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[
      /* err */ typings.std.Error | scala.Null, 
      /* buf */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: typings.std.Int16Array,
    callback: js.Function2[
      /* err */ typings.std.Error | scala.Null, 
      /* buf */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: typings.std.Int16Array,
    offset: scala.Double,
    callback: js.Function2[
      /* err */ typings.std.Error | scala.Null, 
      /* buf */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: typings.std.Int16Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[
      /* err */ typings.std.Error | scala.Null, 
      /* buf */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: typings.std.Int32Array,
    callback: js.Function2[
      /* err */ typings.std.Error | scala.Null, 
      /* buf */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: typings.std.Int32Array,
    offset: scala.Double,
    callback: js.Function2[
      /* err */ typings.std.Error | scala.Null, 
      /* buf */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: typings.std.Int32Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[
      /* err */ typings.std.Error | scala.Null, 
      /* buf */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: typings.std.Int8Array,
    callback: js.Function2[
      /* err */ typings.std.Error | scala.Null, 
      /* buf */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: typings.std.Int8Array,
    offset: scala.Double,
    callback: js.Function2[
      /* err */ typings.std.Error | scala.Null, 
      /* buf */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: typings.std.Int8Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[
      /* err */ typings.std.Error | scala.Null, 
      /* buf */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: typings.std.Uint16Array,
    callback: js.Function2[
      /* err */ typings.std.Error | scala.Null, 
      /* buf */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: typings.std.Uint16Array,
    offset: scala.Double,
    callback: js.Function2[
      /* err */ typings.std.Error | scala.Null, 
      /* buf */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: typings.std.Uint16Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[
      /* err */ typings.std.Error | scala.Null, 
      /* buf */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: typings.std.Uint32Array,
    callback: js.Function2[
      /* err */ typings.std.Error | scala.Null, 
      /* buf */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: typings.std.Uint32Array,
    offset: scala.Double,
    callback: js.Function2[
      /* err */ typings.std.Error | scala.Null, 
      /* buf */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: typings.std.Uint32Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[
      /* err */ typings.std.Error | scala.Null, 
      /* buf */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: typings.std.Uint8Array,
    callback: js.Function2[
      /* err */ typings.std.Error | scala.Null, 
      /* buf */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: typings.std.Uint8Array,
    offset: scala.Double,
    callback: js.Function2[
      /* err */ typings.std.Error | scala.Null, 
      /* buf */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: typings.std.Uint8Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[
      /* err */ typings.std.Error | scala.Null, 
      /* buf */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: typings.std.Uint8ClampedArray,
    callback: js.Function2[
      /* err */ typings.std.Error | scala.Null, 
      /* buf */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: typings.std.Uint8ClampedArray,
    offset: scala.Double,
    callback: js.Function2[
      /* err */ typings.std.Error | scala.Null, 
      /* buf */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: typings.std.Uint8ClampedArray,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[
      /* err */ typings.std.Error | scala.Null, 
      /* buf */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def randomFillSync(buffer: typings.std.DataView): typings.std.DataView = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[typings.std.DataView]
  @scala.inline
  def randomFillSync(buffer: typings.std.DataView, offset: js.UndefOr[scala.Nothing], size: scala.Double): typings.std.DataView = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.std.DataView]
  @scala.inline
  def randomFillSync(buffer: typings.std.DataView, offset: scala.Double): typings.std.DataView = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typings.std.DataView]
  @scala.inline
  def randomFillSync(buffer: typings.std.DataView, offset: scala.Double, size: scala.Double): typings.std.DataView = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.std.DataView]
  @scala.inline
  def randomFillSync(buffer: typings.std.Float32Array): typings.std.Float32Array = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[typings.std.Float32Array]
  @scala.inline
  def randomFillSync(buffer: typings.std.Float32Array, offset: js.UndefOr[scala.Nothing], size: scala.Double): typings.std.Float32Array = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.std.Float32Array]
  @scala.inline
  def randomFillSync(buffer: typings.std.Float32Array, offset: scala.Double): typings.std.Float32Array = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typings.std.Float32Array]
  @scala.inline
  def randomFillSync(buffer: typings.std.Float32Array, offset: scala.Double, size: scala.Double): typings.std.Float32Array = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.std.Float32Array]
  @scala.inline
  def randomFillSync(buffer: typings.std.Float64Array): typings.std.Float64Array = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[typings.std.Float64Array]
  @scala.inline
  def randomFillSync(buffer: typings.std.Float64Array, offset: js.UndefOr[scala.Nothing], size: scala.Double): typings.std.Float64Array = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.std.Float64Array]
  @scala.inline
  def randomFillSync(buffer: typings.std.Float64Array, offset: scala.Double): typings.std.Float64Array = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typings.std.Float64Array]
  @scala.inline
  def randomFillSync(buffer: typings.std.Float64Array, offset: scala.Double, size: scala.Double): typings.std.Float64Array = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.std.Float64Array]
  @scala.inline
  def randomFillSync(buffer: typings.std.Int16Array): typings.std.Int16Array = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[typings.std.Int16Array]
  @scala.inline
  def randomFillSync(buffer: typings.std.Int16Array, offset: js.UndefOr[scala.Nothing], size: scala.Double): typings.std.Int16Array = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.std.Int16Array]
  @scala.inline
  def randomFillSync(buffer: typings.std.Int16Array, offset: scala.Double): typings.std.Int16Array = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typings.std.Int16Array]
  @scala.inline
  def randomFillSync(buffer: typings.std.Int16Array, offset: scala.Double, size: scala.Double): typings.std.Int16Array = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.std.Int16Array]
  @scala.inline
  def randomFillSync(buffer: typings.std.Int32Array): typings.std.Int32Array = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[typings.std.Int32Array]
  @scala.inline
  def randomFillSync(buffer: typings.std.Int32Array, offset: js.UndefOr[scala.Nothing], size: scala.Double): typings.std.Int32Array = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.std.Int32Array]
  @scala.inline
  def randomFillSync(buffer: typings.std.Int32Array, offset: scala.Double): typings.std.Int32Array = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typings.std.Int32Array]
  @scala.inline
  def randomFillSync(buffer: typings.std.Int32Array, offset: scala.Double, size: scala.Double): typings.std.Int32Array = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.std.Int32Array]
  @scala.inline
  def randomFillSync(buffer: typings.std.Int8Array): typings.std.Int8Array = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[typings.std.Int8Array]
  @scala.inline
  def randomFillSync(buffer: typings.std.Int8Array, offset: js.UndefOr[scala.Nothing], size: scala.Double): typings.std.Int8Array = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.std.Int8Array]
  @scala.inline
  def randomFillSync(buffer: typings.std.Int8Array, offset: scala.Double): typings.std.Int8Array = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typings.std.Int8Array]
  @scala.inline
  def randomFillSync(buffer: typings.std.Int8Array, offset: scala.Double, size: scala.Double): typings.std.Int8Array = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.std.Int8Array]
  @scala.inline
  def randomFillSync(buffer: typings.std.Uint16Array): typings.std.Uint16Array = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint16Array]
  @scala.inline
  def randomFillSync(buffer: typings.std.Uint16Array, offset: js.UndefOr[scala.Nothing], size: scala.Double): typings.std.Uint16Array = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint16Array]
  @scala.inline
  def randomFillSync(buffer: typings.std.Uint16Array, offset: scala.Double): typings.std.Uint16Array = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint16Array]
  @scala.inline
  def randomFillSync(buffer: typings.std.Uint16Array, offset: scala.Double, size: scala.Double): typings.std.Uint16Array = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint16Array]
  @scala.inline
  def randomFillSync(buffer: typings.std.Uint32Array): typings.std.Uint32Array = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint32Array]
  @scala.inline
  def randomFillSync(buffer: typings.std.Uint32Array, offset: js.UndefOr[scala.Nothing], size: scala.Double): typings.std.Uint32Array = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint32Array]
  @scala.inline
  def randomFillSync(buffer: typings.std.Uint32Array, offset: scala.Double): typings.std.Uint32Array = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint32Array]
  @scala.inline
  def randomFillSync(buffer: typings.std.Uint32Array, offset: scala.Double, size: scala.Double): typings.std.Uint32Array = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint32Array]
  @scala.inline
  def randomFillSync(buffer: typings.std.Uint8Array): typings.std.Uint8Array = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]
  @scala.inline
  def randomFillSync(buffer: typings.std.Uint8Array, offset: js.UndefOr[scala.Nothing], size: scala.Double): typings.std.Uint8Array = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
  @scala.inline
  def randomFillSync(buffer: typings.std.Uint8Array, offset: scala.Double): typings.std.Uint8Array = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
  @scala.inline
  def randomFillSync(buffer: typings.std.Uint8Array, offset: scala.Double, size: scala.Double): typings.std.Uint8Array = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
  @scala.inline
  def randomFillSync(buffer: typings.std.Uint8ClampedArray): typings.std.Uint8ClampedArray = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8ClampedArray]
  @scala.inline
  def randomFillSync(buffer: typings.std.Uint8ClampedArray, offset: js.UndefOr[scala.Nothing], size: scala.Double): typings.std.Uint8ClampedArray = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8ClampedArray]
  @scala.inline
  def randomFillSync(buffer: typings.std.Uint8ClampedArray, offset: scala.Double): typings.std.Uint8ClampedArray = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8ClampedArray]
  @scala.inline
  def randomFillSync(buffer: typings.std.Uint8ClampedArray, offset: scala.Double, size: scala.Double): typings.std.Uint8ClampedArray = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8ClampedArray]
  
  @scala.inline
  def randomInt(max: scala.Double): scala.Double = typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomInt")(max.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  @scala.inline
  def randomInt(
    max: scala.Double,
    callback: js.Function2[/* err */ typings.std.Error | scala.Null, /* value */ scala.Double, scala.Unit]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomInt")(max.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomInt(min: scala.Double, max: scala.Double): scala.Double = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomInt")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def randomInt(
    min: scala.Double,
    max: scala.Double,
    callback: js.Function2[/* err */ typings.std.Error | scala.Null, /* value */ scala.Double, scala.Unit]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomInt")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def scrypt(
    password: typings.node.cryptoMod.BinaryLike,
    salt: typings.node.cryptoMod.BinaryLike,
    keylen: scala.Double,
    callback: js.Function2[
      /* err */ typings.std.Error | scala.Null, 
      /* derivedKey */ typings.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("scrypt")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def scrypt(
    password: typings.node.cryptoMod.BinaryLike,
    salt: typings.node.cryptoMod.BinaryLike,
    keylen: scala.Double,
    options: typings.node.cryptoMod.ScryptOptions,
    callback: js.Function2[
      /* err */ typings.std.Error | scala.Null, 
      /* derivedKey */ typings.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("scrypt")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def scryptSync(
    password: typings.node.cryptoMod.BinaryLike,
    salt: typings.node.cryptoMod.BinaryLike,
    keylen: scala.Double
  ): typings.node.Buffer = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("scryptSync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
  @scala.inline
  def scryptSync(
    password: typings.node.cryptoMod.BinaryLike,
    salt: typings.node.cryptoMod.BinaryLike,
    keylen: scala.Double,
    options: typings.node.cryptoMod.ScryptOptions
  ): typings.node.Buffer = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("scryptSync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
  
  @scala.inline
  def sign(
    algorithm: js.UndefOr[scala.Nothing],
    data: typings.node.NodeJS.ArrayBufferView,
    key: typings.node.cryptoMod.KeyLike
  ): typings.node.Buffer = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
  @scala.inline
  def sign(
    algorithm: js.UndefOr[scala.Nothing],
    data: typings.node.NodeJS.ArrayBufferView,
    key: typings.node.cryptoMod.SignKeyObjectInput
  ): typings.node.Buffer = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
  @scala.inline
  def sign(
    algorithm: js.UndefOr[scala.Nothing],
    data: typings.node.NodeJS.ArrayBufferView,
    key: typings.node.cryptoMod.SignPrivateKeyInput
  ): typings.node.Buffer = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
  /**
    * Calculates and returns the signature for `data` using the given private key and
    * algorithm. If `algorithm` is `null` or `undefined`, then the algorithm is
    * dependent upon the key type (especially Ed25519 and Ed448).
    *
    * If `key` is not a [`KeyObject`][], this function behaves as if `key` had been
    * passed to [`crypto.createPrivateKey()`][].
    */
  @scala.inline
  def sign(
    algorithm: java.lang.String,
    data: typings.node.NodeJS.ArrayBufferView,
    key: typings.node.cryptoMod.KeyLike
  ): typings.node.Buffer = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
  @scala.inline
  def sign(
    algorithm: java.lang.String,
    data: typings.node.NodeJS.ArrayBufferView,
    key: typings.node.cryptoMod.SignKeyObjectInput
  ): typings.node.Buffer = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
  @scala.inline
  def sign(
    algorithm: java.lang.String,
    data: typings.node.NodeJS.ArrayBufferView,
    key: typings.node.cryptoMod.SignPrivateKeyInput
  ): typings.node.Buffer = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
  @scala.inline
  def sign(
    algorithm: scala.Null,
    data: typings.node.NodeJS.ArrayBufferView,
    key: typings.node.cryptoMod.KeyLike
  ): typings.node.Buffer = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
  @scala.inline
  def sign(
    algorithm: scala.Null,
    data: typings.node.NodeJS.ArrayBufferView,
    key: typings.node.cryptoMod.SignKeyObjectInput
  ): typings.node.Buffer = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
  @scala.inline
  def sign(
    algorithm: scala.Null,
    data: typings.node.NodeJS.ArrayBufferView,
    key: typings.node.cryptoMod.SignPrivateKeyInput
  ): typings.node.Buffer = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
  
  @scala.inline
  def timingSafeEqual(a: typings.node.NodeJS.ArrayBufferView, b: typings.node.NodeJS.ArrayBufferView): scala.Boolean = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("timingSafeEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def verify(
    algorithm: js.UndefOr[scala.Nothing],
    data: typings.node.NodeJS.ArrayBufferView,
    key: typings.node.cryptoMod.KeyLike,
    signature: typings.node.NodeJS.ArrayBufferView
  ): scala.Boolean = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def verify(
    algorithm: js.UndefOr[scala.Nothing],
    data: typings.node.NodeJS.ArrayBufferView,
    key: typings.node.cryptoMod.VerifyKeyObjectInput,
    signature: typings.node.NodeJS.ArrayBufferView
  ): scala.Boolean = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def verify(
    algorithm: js.UndefOr[scala.Nothing],
    data: typings.node.NodeJS.ArrayBufferView,
    key: typings.node.cryptoMod.VerifyPublicKeyInput,
    signature: typings.node.NodeJS.ArrayBufferView
  ): scala.Boolean = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  /**
    * Calculates and returns the signature for `data` using the given private key and
    * algorithm. If `algorithm` is `null` or `undefined`, then the algorithm is
    * dependent upon the key type (especially Ed25519 and Ed448).
    *
    * If `key` is not a [`KeyObject`][], this function behaves as if `key` had been
    * passed to [`crypto.createPublicKey()`][].
    */
  @scala.inline
  def verify(
    algorithm: java.lang.String,
    data: typings.node.NodeJS.ArrayBufferView,
    key: typings.node.cryptoMod.KeyLike,
    signature: typings.node.NodeJS.ArrayBufferView
  ): scala.Boolean = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def verify(
    algorithm: java.lang.String,
    data: typings.node.NodeJS.ArrayBufferView,
    key: typings.node.cryptoMod.VerifyKeyObjectInput,
    signature: typings.node.NodeJS.ArrayBufferView
  ): scala.Boolean = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def verify(
    algorithm: java.lang.String,
    data: typings.node.NodeJS.ArrayBufferView,
    key: typings.node.cryptoMod.VerifyPublicKeyInput,
    signature: typings.node.NodeJS.ArrayBufferView
  ): scala.Boolean = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def verify(
    algorithm: scala.Null,
    data: typings.node.NodeJS.ArrayBufferView,
    key: typings.node.cryptoMod.KeyLike,
    signature: typings.node.NodeJS.ArrayBufferView
  ): scala.Boolean = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def verify(
    algorithm: scala.Null,
    data: typings.node.NodeJS.ArrayBufferView,
    key: typings.node.cryptoMod.VerifyKeyObjectInput,
    signature: typings.node.NodeJS.ArrayBufferView
  ): scala.Boolean = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def verify(
    algorithm: scala.Null,
    data: typings.node.NodeJS.ArrayBufferView,
    key: typings.node.cryptoMod.VerifyPublicKeyInput,
    signature: typings.node.NodeJS.ArrayBufferView
  ): scala.Boolean = (typings.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
}
