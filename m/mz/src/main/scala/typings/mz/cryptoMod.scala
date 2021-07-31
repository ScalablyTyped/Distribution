package typings.mz

import typings.mz.mzNumbers.`0`
import typings.mz.mzNumbers.`1`
import typings.mz.mzStrings.base64
import typings.mz.mzStrings.compressed
import typings.mz.mzStrings.der
import typings.mz.mzStrings.dsa
import typings.mz.mzStrings.ec
import typings.mz.mzStrings.ed25519
import typings.mz.mzStrings.ed448
import typings.mz.mzStrings.hex
import typings.mz.mzStrings.hybrid
import typings.mz.mzStrings.latin1
import typings.mz.mzStrings.pem
import typings.mz.mzStrings.rsa
import typings.mz.mzStrings.uncompressed
import typings.mz.mzStrings.x25519
import typings.mz.mzStrings.x448
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJS.ArrayBufferView
import typings.node.anon.PrivateKey
import typings.node.cryptoMod.BinaryLike
import typings.node.cryptoMod.CipherCCM
import typings.node.cryptoMod.CipherCCMOptions
import typings.node.cryptoMod.CipherCCMTypes
import typings.node.cryptoMod.CipherGCM
import typings.node.cryptoMod.CipherGCMOptions
import typings.node.cryptoMod.CipherGCMTypes
import typings.node.cryptoMod.CipherKey
import typings.node.cryptoMod.DSAKeyPairKeyObjectOptions
import typings.node.cryptoMod.DSAKeyPairOptions
import typings.node.cryptoMod.DecipherCCM
import typings.node.cryptoMod.DecipherGCM
import typings.node.cryptoMod.ECKeyPairKeyObjectOptions
import typings.node.cryptoMod.ECKeyPairOptions
import typings.node.cryptoMod.ED25519KeyPairKeyObjectOptions
import typings.node.cryptoMod.ED25519KeyPairOptions
import typings.node.cryptoMod.ED448KeyPairKeyObjectOptions
import typings.node.cryptoMod.ED448KeyPairOptions
import typings.node.cryptoMod.HashOptions
import typings.node.cryptoMod.HexBase64Latin1Encoding
import typings.node.cryptoMod.KeyLike
import typings.node.cryptoMod.KeyPairKeyObjectResult
import typings.node.cryptoMod.KeyPairSyncResult
import typings.node.cryptoMod.PrivateKeyInput
import typings.node.cryptoMod.PublicKeyInput
import typings.node.cryptoMod.RSAKeyPairKeyObjectOptions
import typings.node.cryptoMod.RSAKeyPairOptions
import typings.node.cryptoMod.RsaPrivateKey
import typings.node.cryptoMod.RsaPublicKey
import typings.node.cryptoMod.ScryptOptions
import typings.node.cryptoMod.SignKeyObjectInput
import typings.node.cryptoMod.SignPrivateKeyInput
import typings.node.cryptoMod.VerifyKeyObjectInput
import typings.node.cryptoMod.VerifyPublicKeyInput
import typings.node.cryptoMod.X25519KeyPairKeyObjectOptions
import typings.node.cryptoMod.X25519KeyPairOptions
import typings.node.cryptoMod.X448KeyPairKeyObjectOptions
import typings.node.cryptoMod.X448KeyPairOptions
import typings.node.streamMod.TransformOptions
import typings.node.streamMod.WritableOptions
import typings.std.DataView
import typings.std.Error
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cryptoMod {
  
  @JSImport("mz/crypto", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def Certificate(): typings.node.cryptoMod.Certificate = ^.asInstanceOf[js.Dynamic].applyDynamic("Certificate")().asInstanceOf[typings.node.cryptoMod.Certificate]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("mz/crypto", "CertificateCls")
  @js.native
  class CertificateCls ()
    extends typings.node.cryptoMod.CertificateCls
  
  @JSImport("mz/crypto", "Cipher")
  @js.native
  class Cipher protected ()
    extends typings.node.cryptoMod.Cipher
  
  /** @deprecated since v10.0.0 */
  @JSImport("mz/crypto", "DEFAULT_ENCODING")
  @js.native
  val DEFAULT_ENCODING: BufferEncoding = js.native
  
  @JSImport("mz/crypto", "Decipher")
  @js.native
  class Decipher protected ()
    extends typings.node.cryptoMod.Decipher
  
  @JSImport("mz/crypto", "DiffieHellman")
  @js.native
  class DiffieHellman_ protected ()
    extends typings.node.cryptoMod.DiffieHellman_
  
  @JSImport("mz/crypto", "ECDH")
  @js.native
  class ECDH protected ()
    extends typings.node.cryptoMod.ECDH
  object ECDH {
    
    @JSImport("mz/crypto", "ECDH")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def convertKey(key: BinaryLike, curve: String): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
    @scala.inline
    def convertKey(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: base64, format: compressed): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
    @scala.inline
    def convertKey(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: base64, format: hybrid): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
    @scala.inline
    def convertKey(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: base64, format: uncompressed): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
    @scala.inline
    def convertKey(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: hex, format: compressed): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
    @scala.inline
    def convertKey(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: hex, format: hybrid): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
    @scala.inline
    def convertKey(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: hex, format: uncompressed): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
    @scala.inline
    def convertKey(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: latin1, format: compressed): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
    @scala.inline
    def convertKey(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: latin1, format: hybrid): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
    @scala.inline
    def convertKey(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: latin1, format: uncompressed): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
    @scala.inline
    def convertKey(key: BinaryLike, curve: String, inputEncoding: HexBase64Latin1Encoding): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
    @scala.inline
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: HexBase64Latin1Encoding,
      outputEncoding: base64,
      format: compressed
    ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
    @scala.inline
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: HexBase64Latin1Encoding,
      outputEncoding: base64,
      format: hybrid
    ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
    @scala.inline
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: HexBase64Latin1Encoding,
      outputEncoding: base64,
      format: uncompressed
    ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
    @scala.inline
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: HexBase64Latin1Encoding,
      outputEncoding: hex,
      format: compressed
    ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
    @scala.inline
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: HexBase64Latin1Encoding,
      outputEncoding: hex,
      format: hybrid
    ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
    @scala.inline
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: HexBase64Latin1Encoding,
      outputEncoding: hex,
      format: uncompressed
    ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
    @scala.inline
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: HexBase64Latin1Encoding,
      outputEncoding: latin1,
      format: compressed
    ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
    @scala.inline
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: HexBase64Latin1Encoding,
      outputEncoding: latin1,
      format: hybrid
    ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
    @scala.inline
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: HexBase64Latin1Encoding,
      outputEncoding: latin1,
      format: uncompressed
    ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
    
    @scala.inline
    def convertKey_base64(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: base64): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
    @scala.inline
    def convertKey_base64(key: BinaryLike, curve: String, inputEncoding: HexBase64Latin1Encoding, outputEncoding: base64): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
    
    @scala.inline
    def convertKey_compressed(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: Unit, format: compressed): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
    @scala.inline
    def convertKey_compressed(
      key: BinaryLike,
      curve: String,
      inputEncoding: HexBase64Latin1Encoding,
      outputEncoding: Unit,
      format: compressed
    ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
    
    @scala.inline
    def convertKey_hex(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: hex): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
    @scala.inline
    def convertKey_hex(key: BinaryLike, curve: String, inputEncoding: HexBase64Latin1Encoding, outputEncoding: hex): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
    
    @scala.inline
    def convertKey_hybrid(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: Unit, format: hybrid): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
    @scala.inline
    def convertKey_hybrid(
      key: BinaryLike,
      curve: String,
      inputEncoding: HexBase64Latin1Encoding,
      outputEncoding: Unit,
      format: hybrid
    ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
    
    @scala.inline
    def convertKey_latin1(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: latin1): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
    @scala.inline
    def convertKey_latin1(key: BinaryLike, curve: String, inputEncoding: HexBase64Latin1Encoding, outputEncoding: latin1): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
    
    @scala.inline
    def convertKey_uncompressed(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: Unit, format: uncompressed): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
    @scala.inline
    def convertKey_uncompressed(
      key: BinaryLike,
      curve: String,
      inputEncoding: HexBase64Latin1Encoding,
      outputEncoding: Unit,
      format: uncompressed
    ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  }
  
  @JSImport("mz/crypto", "Hash")
  @js.native
  class Hash protected ()
    extends typings.node.cryptoMod.Hash
  
  @JSImport("mz/crypto", "Hmac")
  @js.native
  class Hmac protected ()
    extends typings.node.cryptoMod.Hmac
  
  @JSImport("mz/crypto", "KeyObject")
  @js.native
  class KeyObject protected ()
    extends typings.node.cryptoMod.KeyObject
  
  @JSImport("mz/crypto", "Signer")
  @js.native
  class Signer protected ()
    extends typings.node.cryptoMod.Signer
  
  @JSImport("mz/crypto", "Verify")
  @js.native
  class Verify_ protected ()
    extends typings.node.cryptoMod.Verify_
  
  object constants {
    
    @JSImport("mz/crypto", "constants.ALPN_ENABLED")
    @js.native
    val ALPN_ENABLED: Double = js.native
    
    @JSImport("mz/crypto", "constants.DH_CHECK_P_NOT_PRIME")
    @js.native
    val DH_CHECK_P_NOT_PRIME: Double = js.native
    
    @JSImport("mz/crypto", "constants.DH_CHECK_P_NOT_SAFE_PRIME")
    @js.native
    val DH_CHECK_P_NOT_SAFE_PRIME: Double = js.native
    
    @JSImport("mz/crypto", "constants.DH_NOT_SUITABLE_GENERATOR")
    @js.native
    val DH_NOT_SUITABLE_GENERATOR: Double = js.native
    
    @JSImport("mz/crypto", "constants.DH_UNABLE_TO_CHECK_GENERATOR")
    @js.native
    val DH_UNABLE_TO_CHECK_GENERATOR: Double = js.native
    
    @JSImport("mz/crypto", "constants.ENGINE_METHOD_ALL")
    @js.native
    val ENGINE_METHOD_ALL: Double = js.native
    
    @JSImport("mz/crypto", "constants.ENGINE_METHOD_CIPHERS")
    @js.native
    val ENGINE_METHOD_CIPHERS: Double = js.native
    
    @JSImport("mz/crypto", "constants.ENGINE_METHOD_DH")
    @js.native
    val ENGINE_METHOD_DH: Double = js.native
    
    @JSImport("mz/crypto", "constants.ENGINE_METHOD_DIGESTS")
    @js.native
    val ENGINE_METHOD_DIGESTS: Double = js.native
    
    @JSImport("mz/crypto", "constants.ENGINE_METHOD_DSA")
    @js.native
    val ENGINE_METHOD_DSA: Double = js.native
    
    @JSImport("mz/crypto", "constants.ENGINE_METHOD_EC")
    @js.native
    val ENGINE_METHOD_EC: Double = js.native
    
    @JSImport("mz/crypto", "constants.ENGINE_METHOD_NONE")
    @js.native
    val ENGINE_METHOD_NONE: Double = js.native
    
    @JSImport("mz/crypto", "constants.ENGINE_METHOD_PKEY_ASN1_METHS")
    @js.native
    val ENGINE_METHOD_PKEY_ASN1_METHS: Double = js.native
    
    @JSImport("mz/crypto", "constants.ENGINE_METHOD_PKEY_METHS")
    @js.native
    val ENGINE_METHOD_PKEY_METHS: Double = js.native
    
    @JSImport("mz/crypto", "constants.ENGINE_METHOD_RAND")
    @js.native
    val ENGINE_METHOD_RAND: Double = js.native
    
    @JSImport("mz/crypto", "constants.ENGINE_METHOD_RSA")
    @js.native
    val ENGINE_METHOD_RSA: Double = js.native
    
    // https://nodejs.org/dist/latest-v10.x/docs/api/crypto.html#crypto_crypto_constants
    @JSImport("mz/crypto", "constants.OPENSSL_VERSION_NUMBER")
    @js.native
    val OPENSSL_VERSION_NUMBER: Double = js.native
    
    @JSImport("mz/crypto", "constants.POINT_CONVERSION_COMPRESSED")
    @js.native
    val POINT_CONVERSION_COMPRESSED: Double = js.native
    
    @JSImport("mz/crypto", "constants.POINT_CONVERSION_HYBRID")
    @js.native
    val POINT_CONVERSION_HYBRID: Double = js.native
    
    @JSImport("mz/crypto", "constants.POINT_CONVERSION_UNCOMPRESSED")
    @js.native
    val POINT_CONVERSION_UNCOMPRESSED: Double = js.native
    
    @JSImport("mz/crypto", "constants.RSA_NO_PADDING")
    @js.native
    val RSA_NO_PADDING: Double = js.native
    
    @JSImport("mz/crypto", "constants.RSA_PKCS1_OAEP_PADDING")
    @js.native
    val RSA_PKCS1_OAEP_PADDING: Double = js.native
    
    @JSImport("mz/crypto", "constants.RSA_PKCS1_PADDING")
    @js.native
    val RSA_PKCS1_PADDING: Double = js.native
    
    @JSImport("mz/crypto", "constants.RSA_PKCS1_PSS_PADDING")
    @js.native
    val RSA_PKCS1_PSS_PADDING: Double = js.native
    
    /** Causes the salt length for RSA_PKCS1_PSS_PADDING to be determined automatically when verifying a signature. */
    @JSImport("mz/crypto", "constants.RSA_PSS_SALTLEN_AUTO")
    @js.native
    val RSA_PSS_SALTLEN_AUTO: Double = js.native
    
    /** Sets the salt length for RSA_PKCS1_PSS_PADDING to the digest size when signing or verifying. */
    @JSImport("mz/crypto", "constants.RSA_PSS_SALTLEN_DIGEST")
    @js.native
    val RSA_PSS_SALTLEN_DIGEST: Double = js.native
    
    /** Sets the salt length for RSA_PKCS1_PSS_PADDING to the maximum permissible value when signing data. */
    @JSImport("mz/crypto", "constants.RSA_PSS_SALTLEN_MAX_SIGN")
    @js.native
    val RSA_PSS_SALTLEN_MAX_SIGN: Double = js.native
    
    @JSImport("mz/crypto", "constants.RSA_SSLV23_PADDING")
    @js.native
    val RSA_SSLV23_PADDING: Double = js.native
    
    @JSImport("mz/crypto", "constants.RSA_X931_PADDING")
    @js.native
    val RSA_X931_PADDING: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_NO_SSLv2")
    @js.native
    val SSLOPNOSSLv2: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_NO_SSLv3")
    @js.native
    val SSLOPNOSSLv3: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_NO_TLSv1")
    @js.native
    val SSLOPNOTLSv1: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_NO_TLSv1_1")
    @js.native
    val SSLOPNOTLSv11: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_NO_TLSv1_2")
    @js.native
    val SSLOPNOTLSv12: Double = js.native
    
    /** Applies multiple bug workarounds within OpenSSL. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html for detail. */
    @JSImport("mz/crypto", "constants.SSL_OP_ALL")
    @js.native
    val SSL_OP_ALL: Double = js.native
    
    /** Allows legacy insecure renegotiation between OpenSSL and unpatched clients or servers. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html. */
    @JSImport("mz/crypto", "constants.SSL_OP_ALLOW_UNSAFE_LEGACY_RENEGOTIATION")
    @js.native
    val SSL_OP_ALLOW_UNSAFE_LEGACY_RENEGOTIATION: Double = js.native
    
    /** Attempts to use the server's preferences instead of the client's when selecting a cipher. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html. */
    @JSImport("mz/crypto", "constants.SSL_OP_CIPHER_SERVER_PREFERENCE")
    @js.native
    val SSL_OP_CIPHER_SERVER_PREFERENCE: Double = js.native
    
    /** Instructs OpenSSL to use Cisco's "speshul" version of DTLS_BAD_VER. */
    @JSImport("mz/crypto", "constants.SSL_OP_CISCO_ANYCONNECT")
    @js.native
    val SSL_OP_CISCO_ANYCONNECT: Double = js.native
    
    /** Instructs OpenSSL to turn on cookie exchange. */
    @JSImport("mz/crypto", "constants.SSL_OP_COOKIE_EXCHANGE")
    @js.native
    val SSL_OP_COOKIE_EXCHANGE: Double = js.native
    
    /** Instructs OpenSSL to add server-hello extension from an early version of the cryptopro draft. */
    @JSImport("mz/crypto", "constants.SSL_OP_CRYPTOPRO_TLSEXT_BUG")
    @js.native
    val SSL_OP_CRYPTOPRO_TLSEXT_BUG: Double = js.native
    
    /** Instructs OpenSSL to disable a SSL 3.0/TLS 1.0 vulnerability workaround added in OpenSSL 0.9.6d. */
    @JSImport("mz/crypto", "constants.SSL_OP_DONT_INSERT_EMPTY_FRAGMENTS")
    @js.native
    val SSL_OP_DONT_INSERT_EMPTY_FRAGMENTS: Double = js.native
    
    /** Instructs OpenSSL to always use the tmp_rsa key when performing RSA operations. */
    @JSImport("mz/crypto", "constants.SSL_OP_EPHEMERAL_RSA")
    @js.native
    val SSL_OP_EPHEMERAL_RSA: Double = js.native
    
    /** Allows initial connection to servers that do not support RI. */
    @JSImport("mz/crypto", "constants.SSL_OP_LEGACY_SERVER_CONNECT")
    @js.native
    val SSL_OP_LEGACY_SERVER_CONNECT: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_MICROSOFT_BIG_SSLV3_BUFFER")
    @js.native
    val SSL_OP_MICROSOFT_BIG_SSLV3_BUFFER: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_MICROSOFT_SESS_ID_BUG")
    @js.native
    val SSL_OP_MICROSOFT_SESS_ID_BUG: Double = js.native
    
    /** Instructs OpenSSL to disable the workaround for a man-in-the-middle protocol-version vulnerability in the SSL 2.0 server implementation. */
    @JSImport("mz/crypto", "constants.SSL_OP_MSIE_SSLV2_RSA_PADDING")
    @js.native
    val SSL_OP_MSIE_SSLV2_RSA_PADDING: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_NETSCAPE_CA_DN_BUG")
    @js.native
    val SSL_OP_NETSCAPE_CA_DN_BUG: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_NETSCAPE_CHALLENGE_BUG")
    @js.native
    val SSL_OP_NETSCAPE_CHALLENGE_BUG: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_NETSCAPE_DEMO_CIPHER_CHANGE_BUG")
    @js.native
    val SSL_OP_NETSCAPE_DEMO_CIPHER_CHANGE_BUG: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_NETSCAPE_REUSE_CIPHER_CHANGE_BUG")
    @js.native
    val SSL_OP_NETSCAPE_REUSE_CIPHER_CHANGE_BUG: Double = js.native
    
    /** Instructs OpenSSL to disable support for SSL/TLS compression. */
    @JSImport("mz/crypto", "constants.SSL_OP_NO_COMPRESSION")
    @js.native
    val SSL_OP_NO_COMPRESSION: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_NO_QUERY_MTU")
    @js.native
    val SSL_OP_NO_QUERY_MTU: Double = js.native
    
    /** Instructs OpenSSL to always start a new session when performing renegotiation. */
    @JSImport("mz/crypto", "constants.SSL_OP_NO_SESSION_RESUMPTION_ON_RENEGOTIATION")
    @js.native
    val SSL_OP_NO_SESSION_RESUMPTION_ON_RENEGOTIATION: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_NO_TICKET")
    @js.native
    val SSL_OP_NO_TICKET: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_PKCS1_CHECK_1")
    @js.native
    val SSL_OP_PKCS1_CHECK_1: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_PKCS1_CHECK_2")
    @js.native
    val SSL_OP_PKCS1_CHECK_2: Double = js.native
    
    /** Instructs OpenSSL to always create a new key when using temporary/ephemeral DH parameters. */
    @JSImport("mz/crypto", "constants.SSL_OP_SINGLE_DH_USE")
    @js.native
    val SSL_OP_SINGLE_DH_USE: Double = js.native
    
    /** Instructs OpenSSL to always create a new key when using temporary/ephemeral ECDH parameters. */
    @JSImport("mz/crypto", "constants.SSL_OP_SINGLE_ECDH_USE")
    @js.native
    val SSL_OP_SINGLE_ECDH_USE: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_SSLEAY_080_CLIENT_DH_BUG")
    @js.native
    val SSL_OP_SSLEAY_080_CLIENT_DH_BUG: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_SSLREF2_REUSE_CERT_TYPE_BUG")
    @js.native
    val SSL_OP_SSLREF2_REUSE_CERT_TYPE_BUG: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_TLS_BLOCK_PADDING_BUG")
    @js.native
    val SSL_OP_TLS_BLOCK_PADDING_BUG: Double = js.native
    
    @JSImport("mz/crypto", "constants.SSL_OP_TLS_D5_BUG")
    @js.native
    val SSL_OP_TLS_D5_BUG: Double = js.native
    
    /** Instructs OpenSSL to disable version rollback attack detection. */
    @JSImport("mz/crypto", "constants.SSL_OP_TLS_ROLLBACK_BUG")
    @js.native
    val SSL_OP_TLS_ROLLBACK_BUG: Double = js.native
    
    /** Specifies the active default cipher list used by the current Node.js process  (colon-separated values). */
    @JSImport("mz/crypto", "constants.defaultCipherList")
    @js.native
    val defaultCipherList: String = js.native
    
    /** Specifies the built-in default cipher list used by Node.js (colon-separated values). */
    @JSImport("mz/crypto", "constants.defaultCoreCipherList")
    @js.native
    val defaultCoreCipherList: String = js.native
  }
  
  /** @deprecated since v10.0.0 use `createCipheriv()` */
  @scala.inline
  def createCipher(algorithm: String, password: BinaryLike): typings.node.cryptoMod.Cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Cipher]
  @scala.inline
  def createCipher(algorithm: String, password: BinaryLike, options: TransformOptions): typings.node.cryptoMod.Cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Cipher]
  /** @deprecated since v10.0.0 use `createCipheriv()` */
  @scala.inline
  def createCipher(algorithm: CipherCCMTypes, password: BinaryLike, options: CipherCCMOptions): CipherCCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CipherCCM]
  /** @deprecated since v10.0.0 use `createCipheriv()` */
  @scala.inline
  def createCipher(algorithm: CipherGCMTypes, password: BinaryLike): CipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[CipherGCM]
  @scala.inline
  def createCipher(algorithm: CipherGCMTypes, password: BinaryLike, options: CipherGCMOptions): CipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CipherGCM]
  
  @scala.inline
  def createCipheriv(algorithm: String, key: CipherKey): typings.node.cryptoMod.Cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Cipher]
  @scala.inline
  def createCipheriv(algorithm: String, key: CipherKey, iv: Null, options: TransformOptions): typings.node.cryptoMod.Cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Cipher]
  @scala.inline
  def createCipheriv(algorithm: String, key: CipherKey, iv: BinaryLike): typings.node.cryptoMod.Cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Cipher]
  @scala.inline
  def createCipheriv(algorithm: String, key: CipherKey, iv: BinaryLike, options: TransformOptions): typings.node.cryptoMod.Cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Cipher]
  @scala.inline
  def createCipheriv(algorithm: CipherCCMTypes, key: CipherKey, iv: Null, options: CipherCCMOptions): CipherCCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CipherCCM]
  @scala.inline
  def createCipheriv(algorithm: CipherCCMTypes, key: CipherKey, iv: BinaryLike, options: CipherCCMOptions): CipherCCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CipherCCM]
  @scala.inline
  def createCipheriv(algorithm: CipherGCMTypes, key: CipherKey): CipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[CipherGCM]
  @scala.inline
  def createCipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: Null, options: CipherGCMOptions): CipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CipherGCM]
  @scala.inline
  def createCipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike): CipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[CipherGCM]
  @scala.inline
  def createCipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike, options: CipherGCMOptions): CipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CipherGCM]
  
  /** @deprecated since v10.0.0 use `createDecipheriv()` */
  @scala.inline
  def createDecipher(algorithm: String, password: BinaryLike): typings.node.cryptoMod.Decipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Decipher]
  @scala.inline
  def createDecipher(algorithm: String, password: BinaryLike, options: TransformOptions): typings.node.cryptoMod.Decipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Decipher]
  /** @deprecated since v10.0.0 use `createDecipheriv()` */
  @scala.inline
  def createDecipher(algorithm: CipherCCMTypes, password: BinaryLike, options: CipherCCMOptions): DecipherCCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DecipherCCM]
  /** @deprecated since v10.0.0 use `createDecipheriv()` */
  @scala.inline
  def createDecipher(algorithm: CipherGCMTypes, password: BinaryLike): DecipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[DecipherGCM]
  @scala.inline
  def createDecipher(algorithm: CipherGCMTypes, password: BinaryLike, options: CipherGCMOptions): DecipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DecipherGCM]
  
  @scala.inline
  def createDecipheriv(algorithm: String, key: CipherKey): typings.node.cryptoMod.Decipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Decipher]
  @scala.inline
  def createDecipheriv(algorithm: String, key: CipherKey, iv: Null, options: TransformOptions): typings.node.cryptoMod.Decipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Decipher]
  @scala.inline
  def createDecipheriv(algorithm: String, key: CipherKey, iv: BinaryLike): typings.node.cryptoMod.Decipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Decipher]
  @scala.inline
  def createDecipheriv(algorithm: String, key: CipherKey, iv: BinaryLike, options: TransformOptions): typings.node.cryptoMod.Decipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Decipher]
  @scala.inline
  def createDecipheriv(algorithm: CipherCCMTypes, key: CipherKey, iv: Null, options: CipherCCMOptions): DecipherCCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DecipherCCM]
  @scala.inline
  def createDecipheriv(algorithm: CipherCCMTypes, key: CipherKey, iv: BinaryLike, options: CipherCCMOptions): DecipherCCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DecipherCCM]
  @scala.inline
  def createDecipheriv(algorithm: CipherGCMTypes, key: CipherKey): DecipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[DecipherGCM]
  @scala.inline
  def createDecipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: Null, options: CipherGCMOptions): DecipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DecipherGCM]
  @scala.inline
  def createDecipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike): DecipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[DecipherGCM]
  @scala.inline
  def createDecipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike, options: CipherGCMOptions): DecipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DecipherGCM]
  
  @scala.inline
  def createDiffieHellman(prime_length: Double): typings.node.cryptoMod.DiffieHellman_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime_length.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.DiffieHellman_]
  @scala.inline
  def createDiffieHellman(prime_length: Double, generator: Double): typings.node.cryptoMod.DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime_length.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.DiffieHellman_]
  @scala.inline
  def createDiffieHellman(prime_length: Double, generator: ArrayBufferView): typings.node.cryptoMod.DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime_length.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.DiffieHellman_]
  @scala.inline
  def createDiffieHellman(prime: String, prime_encoding: HexBase64Latin1Encoding): typings.node.cryptoMod.DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], prime_encoding.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.DiffieHellman_]
  @scala.inline
  def createDiffieHellman(
    prime: String,
    prime_encoding: HexBase64Latin1Encoding,
    generator: String,
    generator_encoding: HexBase64Latin1Encoding
  ): typings.node.cryptoMod.DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], prime_encoding.asInstanceOf[js.Any], generator.asInstanceOf[js.Any], generator_encoding.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.DiffieHellman_]
  @scala.inline
  def createDiffieHellman(prime: String, prime_encoding: HexBase64Latin1Encoding, generator: Double): typings.node.cryptoMod.DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], prime_encoding.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.DiffieHellman_]
  @scala.inline
  def createDiffieHellman(prime: String, prime_encoding: HexBase64Latin1Encoding, generator: ArrayBufferView): typings.node.cryptoMod.DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], prime_encoding.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.DiffieHellman_]
  @scala.inline
  def createDiffieHellman(prime: ArrayBufferView): typings.node.cryptoMod.DiffieHellman_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.DiffieHellman_]
  
  @scala.inline
  def createECDH(curve_name: String): typings.node.cryptoMod.ECDH = ^.asInstanceOf[js.Dynamic].applyDynamic("createECDH")(curve_name.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.ECDH]
  
  @scala.inline
  def createHash(algorithm: String): typings.node.cryptoMod.Hash = ^.asInstanceOf[js.Dynamic].applyDynamic("createHash")(algorithm.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.Hash]
  @scala.inline
  def createHash(algorithm: String, options: HashOptions): typings.node.cryptoMod.Hash = (^.asInstanceOf[js.Dynamic].applyDynamic("createHash")(algorithm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Hash]
  
  @scala.inline
  def createHmac(algorithm: String, key: BinaryLike): typings.node.cryptoMod.Hmac = (^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Hmac]
  @scala.inline
  def createHmac(algorithm: String, key: BinaryLike, options: TransformOptions): typings.node.cryptoMod.Hmac = (^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Hmac]
  @scala.inline
  def createHmac(algorithm: String, key: typings.node.cryptoMod.KeyObject): typings.node.cryptoMod.Hmac = (^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Hmac]
  @scala.inline
  def createHmac(algorithm: String, key: typings.node.cryptoMod.KeyObject, options: TransformOptions): typings.node.cryptoMod.Hmac = (^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Hmac]
  
  @scala.inline
  def createPrivateKey(key: String): typings.node.cryptoMod.KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKey")(key.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.KeyObject]
  @scala.inline
  def createPrivateKey(key: Buffer): typings.node.cryptoMod.KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKey")(key.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.KeyObject]
  @scala.inline
  def createPrivateKey(key: PrivateKeyInput): typings.node.cryptoMod.KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKey")(key.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.KeyObject]
  
  @scala.inline
  def createPublicKey(key: String): typings.node.cryptoMod.KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.KeyObject]
  @scala.inline
  def createPublicKey(key: Buffer): typings.node.cryptoMod.KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.KeyObject]
  @scala.inline
  def createPublicKey(key: typings.node.cryptoMod.KeyObject): typings.node.cryptoMod.KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.KeyObject]
  @scala.inline
  def createPublicKey(key: PublicKeyInput): typings.node.cryptoMod.KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.KeyObject]
  
  @scala.inline
  def createSecretKey(key: ArrayBufferView): typings.node.cryptoMod.KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecretKey")(key.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.KeyObject]
  
  @scala.inline
  def createSign(algorithm: String): typings.node.cryptoMod.Signer = ^.asInstanceOf[js.Dynamic].applyDynamic("createSign")(algorithm.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.Signer]
  @scala.inline
  def createSign(algorithm: String, options: WritableOptions): typings.node.cryptoMod.Signer = (^.asInstanceOf[js.Dynamic].applyDynamic("createSign")(algorithm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Signer]
  
  @scala.inline
  def createVerify(algorithm: String): typings.node.cryptoMod.Verify_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createVerify")(algorithm.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.Verify_]
  @scala.inline
  def createVerify(algorithm: String, options: WritableOptions): typings.node.cryptoMod.Verify_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createVerify")(algorithm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Verify_]
  
  /**
    * Computes the Diffie-Hellman secret based on a privateKey and a publicKey.
    * Both keys must have the same asymmetricKeyType, which must be one of
    * 'dh' (for Diffie-Hellman), 'ec' (for ECDH), 'x448', or 'x25519' (for ECDH-ES).
    */
  @scala.inline
  def diffieHellman(options: PrivateKey): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("diffieHellman")(options.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  /** @deprecated since v10.0.0 */
  @JSImport("mz/crypto", "fips")
  @js.native
  val fips: Boolean = js.native
  
  @scala.inline
  def generateKeyPair(
    `type`: dsa,
    options: DSAKeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ Error | Null, 
      /* publicKey */ typings.node.cryptoMod.KeyObject, 
      /* privateKey */ typings.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generateKeyPair(
    `type`: dsa,
    options: DSAKeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ String), 
      (/* privateKey */ Buffer) | (/* privateKey */ String), 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generateKeyPair(
    `type`: ec,
    options: ECKeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ Error | Null, 
      /* publicKey */ typings.node.cryptoMod.KeyObject, 
      /* privateKey */ typings.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generateKeyPair(
    `type`: ec,
    options: ECKeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ String), 
      (/* privateKey */ Buffer) | (/* privateKey */ String), 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generateKeyPair(
    `type`: ed25519,
    options: Unit,
    callback: js.Function3[
      /* err */ Error | Null, 
      /* publicKey */ typings.node.cryptoMod.KeyObject, 
      /* privateKey */ typings.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generateKeyPair(
    `type`: ed25519,
    options: ED25519KeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ Error | Null, 
      /* publicKey */ typings.node.cryptoMod.KeyObject, 
      /* privateKey */ typings.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generateKeyPair(
    `type`: ed25519,
    options: ED25519KeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ String), 
      (/* privateKey */ Buffer) | (/* privateKey */ String), 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generateKeyPair(
    `type`: ed448,
    options: Unit,
    callback: js.Function3[
      /* err */ Error | Null, 
      /* publicKey */ typings.node.cryptoMod.KeyObject, 
      /* privateKey */ typings.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generateKeyPair(
    `type`: ed448,
    options: ED448KeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ Error | Null, 
      /* publicKey */ typings.node.cryptoMod.KeyObject, 
      /* privateKey */ typings.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generateKeyPair(
    `type`: ed448,
    options: ED448KeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ String), 
      (/* privateKey */ Buffer) | (/* privateKey */ String), 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generateKeyPair(
    `type`: rsa,
    options: RSAKeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ Error | Null, 
      /* publicKey */ typings.node.cryptoMod.KeyObject, 
      /* privateKey */ typings.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generateKeyPair(
    `type`: rsa,
    options: RSAKeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ String), 
      (/* privateKey */ Buffer) | (/* privateKey */ String), 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generateKeyPair(
    `type`: x25519,
    options: Unit,
    callback: js.Function3[
      /* err */ Error | Null, 
      /* publicKey */ typings.node.cryptoMod.KeyObject, 
      /* privateKey */ typings.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generateKeyPair(
    `type`: x25519,
    options: X25519KeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ Error | Null, 
      /* publicKey */ typings.node.cryptoMod.KeyObject, 
      /* privateKey */ typings.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generateKeyPair(
    `type`: x25519,
    options: X25519KeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ String), 
      (/* privateKey */ Buffer) | (/* privateKey */ String), 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generateKeyPair(
    `type`: x448,
    options: Unit,
    callback: js.Function3[
      /* err */ Error | Null, 
      /* publicKey */ typings.node.cryptoMod.KeyObject, 
      /* privateKey */ typings.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generateKeyPair(
    `type`: x448,
    options: X448KeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ Error | Null, 
      /* publicKey */ typings.node.cryptoMod.KeyObject, 
      /* privateKey */ typings.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generateKeyPair(
    `type`: x448,
    options: X448KeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ String), 
      (/* privateKey */ Buffer) | (/* privateKey */ String), 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def generateKeyPairSync(`type`: dsa, options: DSAKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairSyncResult[String, String]]
  @scala.inline
  def generateKeyPairSync(`type`: ec, options: ECKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairSyncResult[String, String]]
  @scala.inline
  def generateKeyPairSync(`type`: ed25519, options: ED25519KeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairSyncResult[String, String]]
  @scala.inline
  def generateKeyPairSync(`type`: ed448, options: ED448KeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairSyncResult[String, String]]
  @scala.inline
  def generateKeyPairSync(`type`: rsa, options: RSAKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairSyncResult[String, String]]
  @scala.inline
  def generateKeyPairSync(`type`: x25519, options: X25519KeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairSyncResult[String, String]]
  @scala.inline
  def generateKeyPairSync(`type`: x448, options: X448KeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairSyncResult[String, String]]
  
  @scala.inline
  def generateKeyPairSync_dsa(`type`: dsa, options: DSAKeyPairKeyObjectOptions): KeyPairKeyObjectResult = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairKeyObjectResult]
  
  @scala.inline
  def generateKeyPairSync_ec(`type`: ec, options: ECKeyPairKeyObjectOptions): KeyPairKeyObjectResult = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairKeyObjectResult]
  
  @scala.inline
  def generateKeyPairSync_ed25519(`type`: ed25519): KeyPairKeyObjectResult = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any]).asInstanceOf[KeyPairKeyObjectResult]
  @scala.inline
  def generateKeyPairSync_ed25519(`type`: ed25519, options: ED25519KeyPairKeyObjectOptions): KeyPairKeyObjectResult = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairKeyObjectResult]
  
  @scala.inline
  def generateKeyPairSync_ed448(`type`: ed448): KeyPairKeyObjectResult = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any]).asInstanceOf[KeyPairKeyObjectResult]
  @scala.inline
  def generateKeyPairSync_ed448(`type`: ed448, options: ED448KeyPairKeyObjectOptions): KeyPairKeyObjectResult = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairKeyObjectResult]
  
  @scala.inline
  def generateKeyPairSync_rsa(`type`: rsa, options: RSAKeyPairKeyObjectOptions): KeyPairKeyObjectResult = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairKeyObjectResult]
  
  @scala.inline
  def generateKeyPairSync_x25519(`type`: x25519): KeyPairKeyObjectResult = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any]).asInstanceOf[KeyPairKeyObjectResult]
  @scala.inline
  def generateKeyPairSync_x25519(`type`: x25519, options: X25519KeyPairKeyObjectOptions): KeyPairKeyObjectResult = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairKeyObjectResult]
  
  @scala.inline
  def generateKeyPairSync_x448(`type`: x448): KeyPairKeyObjectResult = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any]).asInstanceOf[KeyPairKeyObjectResult]
  @scala.inline
  def generateKeyPairSync_x448(`type`: x448, options: X448KeyPairKeyObjectOptions): KeyPairKeyObjectResult = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairKeyObjectResult]
  
  @scala.inline
  def getCiphers(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCiphers")().asInstanceOf[js.Array[String]]
  
  @scala.inline
  def getCurves(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurves")().asInstanceOf[js.Array[String]]
  
  @scala.inline
  def getDiffieHellman(group_name: String): typings.node.cryptoMod.DiffieHellman_ = ^.asInstanceOf[js.Dynamic].applyDynamic("getDiffieHellman")(group_name.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.DiffieHellman_]
  
  @scala.inline
  def getFips(): `1` | `0` = ^.asInstanceOf[js.Dynamic].applyDynamic("getFips")().asInstanceOf[`1` | `0`]
  
  @scala.inline
  def getHashes(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHashes")().asInstanceOf[js.Array[String]]
  
  @scala.inline
  def pbkdf2(password: BinaryLike, salt: BinaryLike, iterations: Double, keylen: Double, digest: String): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  @scala.inline
  def pbkdf2(
    password: BinaryLike,
    salt: BinaryLike,
    iterations: Double,
    keylen: Double,
    digest: String,
    callback: js.Function2[/* err */ Error | Null, /* derivedKey */ Buffer, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def pbkdf2Sync(password: BinaryLike, salt: BinaryLike, iterations: Double, keylen: Double, digest: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def privateDecrypt(private_key: KeyLike, buffer: ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("privateDecrypt")(private_key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def privateDecrypt(private_key: RsaPrivateKey, buffer: ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("privateDecrypt")(private_key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def privateEncrypt(private_key: KeyLike, buffer: ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("privateEncrypt")(private_key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def privateEncrypt(private_key: RsaPrivateKey, buffer: ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("privateEncrypt")(private_key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def pseudoRandomBytes(size: Double): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("pseudoRandomBytes")(size.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  @scala.inline
  def pseudoRandomBytes(size: Double, callback: js.Function2[/* err */ Error | Null, /* buf */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pseudoRandomBytes")(size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def publicDecrypt(key: KeyLike, buffer: ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("publicDecrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def publicDecrypt(key: RsaPrivateKey, buffer: ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("publicDecrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def publicDecrypt(key: RsaPublicKey, buffer: ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("publicDecrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def publicEncrypt(key: KeyLike, buffer: ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("publicEncrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def publicEncrypt(key: RsaPrivateKey, buffer: ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("publicEncrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def publicEncrypt(key: RsaPublicKey, buffer: ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("publicEncrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def randomBytes(size: Double): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(size.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  @scala.inline
  def randomBytes(size: Double, callback: js.Function2[/* err */ Error | Null, /* buf */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def randomFill(buffer: DataView, callback: js.Function2[/* err */ Error | Null, /* buf */ DataView, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: DataView,
    offset: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ DataView, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: DataView,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ DataView, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(buffer: Float32Array, callback: js.Function2[/* err */ Error | Null, /* buf */ Float32Array, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: Float32Array,
    offset: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Float32Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: Float32Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Float32Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(buffer: Float64Array, callback: js.Function2[/* err */ Error | Null, /* buf */ Float64Array, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: Float64Array,
    offset: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Float64Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: Float64Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Float64Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(buffer: Int16Array, callback: js.Function2[/* err */ Error | Null, /* buf */ Int16Array, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: Int16Array,
    offset: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Int16Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: Int16Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Int16Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(buffer: Int32Array, callback: js.Function2[/* err */ Error | Null, /* buf */ Int32Array, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: Int32Array,
    offset: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Int32Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: Int32Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Int32Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(buffer: Int8Array, callback: js.Function2[/* err */ Error | Null, /* buf */ Int8Array, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: Int8Array,
    offset: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Int8Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: Int8Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Int8Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(buffer: Uint16Array, callback: js.Function2[/* err */ Error | Null, /* buf */ Uint16Array, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: Uint16Array,
    offset: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Uint16Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: Uint16Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Uint16Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(buffer: Uint32Array, callback: js.Function2[/* err */ Error | Null, /* buf */ Uint32Array, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: Uint32Array,
    offset: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Uint32Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: Uint32Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Uint32Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(buffer: Uint8Array, callback: js.Function2[/* err */ Error | Null, /* buf */ Uint8Array, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: Uint8Array,
    offset: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Uint8Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: Uint8Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Uint8Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: Uint8ClampedArray,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Uint8ClampedArray, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: Uint8ClampedArray,
    offset: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Uint8ClampedArray, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: Uint8ClampedArray,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Uint8ClampedArray, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def randomFillSync(buffer: DataView): DataView = ^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[DataView]
  @scala.inline
  def randomFillSync(buffer: DataView, offset: Double): DataView = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[DataView]
  @scala.inline
  def randomFillSync(buffer: DataView, offset: Double, size: Double): DataView = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[DataView]
  @scala.inline
  def randomFillSync(buffer: DataView, offset: Unit, size: Double): DataView = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[DataView]
  @scala.inline
  def randomFillSync(buffer: Float32Array): Float32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[Float32Array]
  @scala.inline
  def randomFillSync(buffer: Float32Array, offset: Double): Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Float32Array]
  @scala.inline
  def randomFillSync(buffer: Float32Array, offset: Double, size: Double): Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Float32Array]
  @scala.inline
  def randomFillSync(buffer: Float32Array, offset: Unit, size: Double): Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Float32Array]
  @scala.inline
  def randomFillSync(buffer: Float64Array): Float64Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[Float64Array]
  @scala.inline
  def randomFillSync(buffer: Float64Array, offset: Double): Float64Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Float64Array]
  @scala.inline
  def randomFillSync(buffer: Float64Array, offset: Double, size: Double): Float64Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Float64Array]
  @scala.inline
  def randomFillSync(buffer: Float64Array, offset: Unit, size: Double): Float64Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Float64Array]
  @scala.inline
  def randomFillSync(buffer: Int16Array): Int16Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[Int16Array]
  @scala.inline
  def randomFillSync(buffer: Int16Array, offset: Double): Int16Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Int16Array]
  @scala.inline
  def randomFillSync(buffer: Int16Array, offset: Double, size: Double): Int16Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Int16Array]
  @scala.inline
  def randomFillSync(buffer: Int16Array, offset: Unit, size: Double): Int16Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Int16Array]
  @scala.inline
  def randomFillSync(buffer: Int32Array): Int32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[Int32Array]
  @scala.inline
  def randomFillSync(buffer: Int32Array, offset: Double): Int32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Int32Array]
  @scala.inline
  def randomFillSync(buffer: Int32Array, offset: Double, size: Double): Int32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Int32Array]
  @scala.inline
  def randomFillSync(buffer: Int32Array, offset: Unit, size: Double): Int32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Int32Array]
  @scala.inline
  def randomFillSync(buffer: Int8Array): Int8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[Int8Array]
  @scala.inline
  def randomFillSync(buffer: Int8Array, offset: Double): Int8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Int8Array]
  @scala.inline
  def randomFillSync(buffer: Int8Array, offset: Double, size: Double): Int8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Int8Array]
  @scala.inline
  def randomFillSync(buffer: Int8Array, offset: Unit, size: Double): Int8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Int8Array]
  @scala.inline
  def randomFillSync(buffer: Uint16Array): Uint16Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[Uint16Array]
  @scala.inline
  def randomFillSync(buffer: Uint16Array, offset: Double): Uint16Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Uint16Array]
  @scala.inline
  def randomFillSync(buffer: Uint16Array, offset: Double, size: Double): Uint16Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Uint16Array]
  @scala.inline
  def randomFillSync(buffer: Uint16Array, offset: Unit, size: Double): Uint16Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Uint16Array]
  @scala.inline
  def randomFillSync(buffer: Uint32Array): Uint32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[Uint32Array]
  @scala.inline
  def randomFillSync(buffer: Uint32Array, offset: Double): Uint32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Uint32Array]
  @scala.inline
  def randomFillSync(buffer: Uint32Array, offset: Double, size: Double): Uint32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Uint32Array]
  @scala.inline
  def randomFillSync(buffer: Uint32Array, offset: Unit, size: Double): Uint32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Uint32Array]
  @scala.inline
  def randomFillSync(buffer: Uint8Array): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  @scala.inline
  def randomFillSync(buffer: Uint8Array, offset: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  @scala.inline
  def randomFillSync(buffer: Uint8Array, offset: Double, size: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  @scala.inline
  def randomFillSync(buffer: Uint8Array, offset: Unit, size: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  @scala.inline
  def randomFillSync(buffer: Uint8ClampedArray): Uint8ClampedArray = ^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[Uint8ClampedArray]
  @scala.inline
  def randomFillSync(buffer: Uint8ClampedArray, offset: Double): Uint8ClampedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Uint8ClampedArray]
  @scala.inline
  def randomFillSync(buffer: Uint8ClampedArray, offset: Double, size: Double): Uint8ClampedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Uint8ClampedArray]
  @scala.inline
  def randomFillSync(buffer: Uint8ClampedArray, offset: Unit, size: Double): Uint8ClampedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Uint8ClampedArray]
  
  @scala.inline
  def randomInt(max: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("randomInt")(max.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def randomInt(max: Double, callback: js.Function2[/* err */ Error | Null, /* value */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomInt")(max.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomInt(min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("randomInt")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def randomInt(min: Double, max: Double, callback: js.Function2[/* err */ Error | Null, /* value */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomInt")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def scrypt(
    password: BinaryLike,
    salt: BinaryLike,
    keylen: Double,
    callback: js.Function2[/* err */ Error | Null, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrypt")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def scrypt(
    password: BinaryLike,
    salt: BinaryLike,
    keylen: Double,
    options: ScryptOptions,
    callback: js.Function2[/* err */ Error | Null, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrypt")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def scryptSync(password: BinaryLike, salt: BinaryLike, keylen: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("scryptSync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def scryptSync(password: BinaryLike, salt: BinaryLike, keylen: Double, options: ScryptOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("scryptSync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  /**
    * Calculates and returns the signature for `data` using the given private key and
    * algorithm. If `algorithm` is `null` or `undefined`, then the algorithm is
    * dependent upon the key type (especially Ed25519 and Ed448).
    *
    * If `key` is not a [`KeyObject`][], this function behaves as if `key` had been
    * passed to [`crypto.createPrivateKey()`][].
    */
  @scala.inline
  def sign(algorithm: String, data: ArrayBufferView, key: KeyLike): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def sign(algorithm: String, data: ArrayBufferView, key: SignKeyObjectInput): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def sign(algorithm: String, data: ArrayBufferView, key: SignPrivateKeyInput): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def sign(algorithm: Null, data: ArrayBufferView, key: KeyLike): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def sign(algorithm: Null, data: ArrayBufferView, key: SignKeyObjectInput): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def sign(algorithm: Null, data: ArrayBufferView, key: SignPrivateKeyInput): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def sign(algorithm: Unit, data: ArrayBufferView, key: KeyLike): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def sign(algorithm: Unit, data: ArrayBufferView, key: SignKeyObjectInput): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def sign(algorithm: Unit, data: ArrayBufferView, key: SignPrivateKeyInput): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def timingSafeEqual(a: ArrayBufferView, b: ArrayBufferView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("timingSafeEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Calculates and returns the signature for `data` using the given private key and
    * algorithm. If `algorithm` is `null` or `undefined`, then the algorithm is
    * dependent upon the key type (especially Ed25519 and Ed448).
    *
    * If `key` is not a [`KeyObject`][], this function behaves as if `key` had been
    * passed to [`crypto.createPublicKey()`][].
    */
  @scala.inline
  def verify(algorithm: String, data: ArrayBufferView, key: KeyLike, signature: ArrayBufferView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def verify(algorithm: String, data: ArrayBufferView, key: VerifyKeyObjectInput, signature: ArrayBufferView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def verify(algorithm: String, data: ArrayBufferView, key: VerifyPublicKeyInput, signature: ArrayBufferView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def verify(algorithm: Null, data: ArrayBufferView, key: KeyLike, signature: ArrayBufferView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def verify(algorithm: Null, data: ArrayBufferView, key: VerifyKeyObjectInput, signature: ArrayBufferView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def verify(algorithm: Null, data: ArrayBufferView, key: VerifyPublicKeyInput, signature: ArrayBufferView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def verify(algorithm: Unit, data: ArrayBufferView, key: KeyLike, signature: ArrayBufferView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def verify(algorithm: Unit, data: ArrayBufferView, key: VerifyKeyObjectInput, signature: ArrayBufferView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def verify(algorithm: Unit, data: ArrayBufferView, key: VerifyPublicKeyInput, signature: ArrayBufferView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
