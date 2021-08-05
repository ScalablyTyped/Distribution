package typings.openpgp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object config {
  
  @JSImport("openpgp", "config")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Chunk Size Byte for Authenticated Encryption with Additional Data (AEAD) mode
    * Only has an effect when aead_protect is set to true.
    * Must be an integer value from 0 to 56.
    */
  @JSImport("openpgp", "config.aead_chunk_size_byte")
  @js.native
  def aeadChunkSizeByte: js.Any = js.native
  
  inline def aeadChunkSizeByte_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aead_chunk_size_byte")(x.asInstanceOf[js.Any])
  
  /**
    * Default Authenticated Encryption with Additional Data (AEAD) encryption mode
    * Only has an effect when aead_protect is set to true.
    */
  @JSImport("openpgp", "config.aead_mode")
  @js.native
  def aeadMode: js.Any = js.native
  
  inline def aeadMode_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aead_mode")(x.asInstanceOf[js.Any])
  
  /**
    * Use Authenticated Encryption with Additional Data (AEAD) protection for symmetric encryption.
    * **NOT INTEROPERABLE WITH OTHER OPENPGP IMPLEMENTATIONS**
    * **FUTURE OPENPGP.JS VERSIONS MAY BREAK COMPATIBILITY WHEN USING THIS OPTION**
    */
  @JSImport("openpgp", "config.aead_protect")
  @js.native
  def aeadProtect: js.Any = js.native
  
  /**
    * Use Authenticated Encryption with Additional Data (AEAD) protection for symmetric encryption.
    * 0 means we implement a variant of {@link https://tools.ietf.org/html/draft-ford-openpgp-format-00|this IETF draft}.
    * 4 means we implement {@link https://tools.ietf.org/html/draft-ietf-openpgp-rfc4880bis-04|RFC4880bis-04}.
    * Note that this determines how AEAD packets are parsed even when aead_protect is set to false
    */
  @JSImport("openpgp", "config.aead_protect_version")
  @js.native
  def aeadProtectVersion: js.Any = js.native
  
  inline def aeadProtectVersion_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aead_protect_version")(x.asInstanceOf[js.Any])
  
  inline def aeadProtect_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aead_protect")(x.asInstanceOf[js.Any])
  
  @JSImport("openpgp", "config.allow_unauthenticated_stream")
  @js.native
  def allowUnauthenticatedStream: js.Any = js.native
  
  inline def allowUnauthenticatedStream_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allow_unauthenticated_stream")(x.asInstanceOf[js.Any])
  
  @JSImport("openpgp", "config.checksum_required")
  @js.native
  def checksumRequired: js.Any = js.native
  
  inline def checksumRequired_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("checksum_required")(x.asInstanceOf[js.Any])
  
  @JSImport("openpgp", "config.commentstring")
  @js.native
  def commentstring: js.Any = js.native
  inline def commentstring_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("commentstring")(x.asInstanceOf[js.Any])
  
  @JSImport("openpgp", "config.compression")
  @js.native
  def compression: js.Any = js.native
  inline def compression_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compression")(x.asInstanceOf[js.Any])
  
  @JSImport("openpgp", "config.debug")
  @js.native
  def debug: js.Any = js.native
  inline def debug_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debug")(x.asInstanceOf[js.Any])
  
  @JSImport("openpgp", "config.deflate_level")
  @js.native
  def deflateLevel: js.Any = js.native
  
  inline def deflateLevel_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deflate_level")(x.asInstanceOf[js.Any])
  
  @JSImport("openpgp", "config.encryption_cipher")
  @js.native
  def encryptionCipher: js.Any = js.native
  
  inline def encryptionCipher_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encryption_cipher")(x.asInstanceOf[js.Any])
  
  @JSImport("openpgp", "config.ignore_mdc_error")
  @js.native
  def ignoreMdcError: js.Any = js.native
  
  inline def ignoreMdcError_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignore_mdc_error")(x.asInstanceOf[js.Any])
  
  /**
    * Use integrity protection for symmetric encryption
    */
  @JSImport("openpgp", "config.integrity_protect")
  @js.native
  def integrityProtect: js.Any = js.native
  
  inline def integrityProtect_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("integrity_protect")(x.asInstanceOf[js.Any])
  
  @JSImport("openpgp", "config.keyserver")
  @js.native
  def keyserver: js.Any = js.native
  inline def keyserver_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keyserver")(x.asInstanceOf[js.Any])
  
  object localStorage {
    
    @JSImport("openpgp", "config.localStorage.LocalStorage")
    @js.native
    /**
      * This object is used for storing and retrieving configuration from HTML5 local storage.
      */
    class LocalStorage () extends StObject {
      
      /**
        * Reads the config out of the HTML5 local storage
        * and initializes the object config.
        * if config is null the default config will be used
        */
      def read(): Unit = js.native
      
      /**
        * Writes the config to HTML5 local storage
        */
      def write(): Unit = js.native
    }
  }
  
  /**
    * Max userid string length (used for parsing)
    */
  @JSImport("openpgp", "config.max_userid_length")
  @js.native
  def maxUseridLength: js.Any = js.native
  
  inline def maxUseridLength_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("max_userid_length")(x.asInstanceOf[js.Any])
  
  @JSImport("openpgp", "config.min_bytes_for_web_crypto")
  @js.native
  def minBytesForWebCrypto: js.Any = js.native
  
  inline def minBytesForWebCrypto_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("min_bytes_for_web_crypto")(x.asInstanceOf[js.Any])
  
  @JSImport("openpgp", "config.node_store")
  @js.native
  def nodeStore: js.Any = js.native
  
  inline def nodeStore_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("node_store")(x.asInstanceOf[js.Any])
  
  /**
    * Work-around for rare GPG decryption bug when encrypting with multiple passwords.
    * **Slower and slightly less secure**
    */
  @JSImport("openpgp", "config.password_collision_check")
  @js.native
  def passwordCollisionCheck: js.Any = js.native
  
  inline def passwordCollisionCheck_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("password_collision_check")(x.asInstanceOf[js.Any])
  
  @JSImport("openpgp", "config.prefer_hash_algorithm")
  @js.native
  def preferHashAlgorithm: js.Any = js.native
  
  inline def preferHashAlgorithm_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefer_hash_algorithm")(x.asInstanceOf[js.Any])
  
  @JSImport("openpgp", "config.revocations_expire")
  @js.native
  def revocationsExpire: js.Any = js.native
  
  inline def revocationsExpire_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("revocations_expire")(x.asInstanceOf[js.Any])
  
  @JSImport("openpgp", "config.rsa_blinding")
  @js.native
  def rsaBlinding: js.Any = js.native
  
  inline def rsaBlinding_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsa_blinding")(x.asInstanceOf[js.Any])
  
  /**
    * {@link https://tools.ietf.org/html/rfc4880#section-3.7.1.3|RFC4880 3.7.1.3}:
    * Iteration Count Byte for S2K (String to Key)
    */
  @JSImport("openpgp", "config.s2k_iteration_count_byte")
  @js.native
  def s2kIterationCountByte: js.Any = js.native
  
  inline def s2kIterationCountByte_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("s2k_iteration_count_byte")(x.asInstanceOf[js.Any])
  
  @JSImport("openpgp", "config.show_comment")
  @js.native
  def showComment: js.Any = js.native
  
  inline def showComment_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("show_comment")(x.asInstanceOf[js.Any])
  
  @JSImport("openpgp", "config.show_version")
  @js.native
  def showVersion: js.Any = js.native
  
  inline def showVersion_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("show_version")(x.asInstanceOf[js.Any])
  
  @JSImport("openpgp", "config.tolerant")
  @js.native
  def tolerant: js.Any = js.native
  inline def tolerant_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tolerant")(x.asInstanceOf[js.Any])
  
  @JSImport("openpgp", "config.use_native")
  @js.native
  def useNative: js.Any = js.native
  
  inline def useNative_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("use_native")(x.asInstanceOf[js.Any])
  
  @JSImport("openpgp", "config.versionstring")
  @js.native
  def versionstring: js.Any = js.native
  inline def versionstring_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionstring")(x.asInstanceOf[js.Any])
  
  @JSImport("openpgp", "config.zero_copy")
  @js.native
  def zeroCopy: js.Any = js.native
  
  inline def zeroCopy_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zero_copy")(x.asInstanceOf[js.Any])
}
