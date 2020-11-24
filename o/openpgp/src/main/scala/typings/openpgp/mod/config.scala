package typings.openpgp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openpgp", "config")
@js.native
object config extends js.Object {
  
  /**
    * Chunk Size Byte for Authenticated Encryption with Additional Data (AEAD) mode
    * Only has an effect when aead_protect is set to true.
    * Must be an integer value from 0 to 56.
    */
  @JSName("aead_chunk_size_byte")
  var aeadChunkSizeByte: js.Any = js.native
  
  /**
    * Default Authenticated Encryption with Additional Data (AEAD) encryption mode
    * Only has an effect when aead_protect is set to true.
    */
  @JSName("aead_mode")
  var aeadMode: js.Any = js.native
  
  /**
    * Use Authenticated Encryption with Additional Data (AEAD) protection for symmetric encryption.
    * **NOT INTEROPERABLE WITH OTHER OPENPGP IMPLEMENTATIONS**
    * **FUTURE OPENPGP.JS VERSIONS MAY BREAK COMPATIBILITY WHEN USING THIS OPTION**
    */
  @JSName("aead_protect")
  var aeadProtect: js.Any = js.native
  
  /**
    * Use Authenticated Encryption with Additional Data (AEAD) protection for symmetric encryption.
    * 0 means we implement a variant of {@link https://tools.ietf.org/html/draft-ford-openpgp-format-00|this IETF draft}.
    * 4 means we implement {@link https://tools.ietf.org/html/draft-ietf-openpgp-rfc4880bis-04|RFC4880bis-04}.
    * Note that this determines how AEAD packets are parsed even when aead_protect is set to false
    */
  @JSName("aead_protect_version")
  var aeadProtectVersion: js.Any = js.native
  
  @JSName("allow_unauthenticated_stream")
  var allowUnauthenticatedStream: js.Any = js.native
  
  @JSName("checksum_required")
  var checksumRequired: js.Any = js.native
  
  var commentstring: js.Any = js.native
  
  var compression: js.Any = js.native
  
  var debug: js.Any = js.native
  
  @JSName("deflate_level")
  var deflateLevel: js.Any = js.native
  
  @JSName("encryption_cipher")
  var encryptionCipher: js.Any = js.native
  
  @JSName("ignore_mdc_error")
  var ignoreMdcError: js.Any = js.native
  
  /**
    * Use integrity protection for symmetric encryption
    */
  @JSName("integrity_protect")
  var integrityProtect: js.Any = js.native
  
  var keyserver: js.Any = js.native
  
  /**
    * Max userid string length (used for parsing)
    */
  @JSName("max_userid_length")
  var maxUseridLength: js.Any = js.native
  
  @JSName("min_bytes_for_web_crypto")
  var minBytesForWebCrypto: js.Any = js.native
  
  @JSName("node_store")
  var nodeStore: js.Any = js.native
  
  /**
    * Work-around for rare GPG decryption bug when encrypting with multiple passwords.
    * **Slower and slightly less secure**
    */
  @JSName("password_collision_check")
  var passwordCollisionCheck: js.Any = js.native
  
  @JSName("prefer_hash_algorithm")
  var preferHashAlgorithm: js.Any = js.native
  
  @JSName("revocations_expire")
  var revocationsExpire: js.Any = js.native
  
  @JSName("rsa_blinding")
  var rsaBlinding: js.Any = js.native
  
  /**
    * {@link https://tools.ietf.org/html/rfc4880#section-3.7.1.3|RFC4880 3.7.1.3}:
    * Iteration Count Byte for S2K (String to Key)
    */
  @JSName("s2k_iteration_count_byte")
  var s2kIterationCountByte: js.Any = js.native
  
  @JSName("show_comment")
  var showComment: js.Any = js.native
  
  @JSName("show_version")
  var showVersion: js.Any = js.native
  
  var tolerant: js.Any = js.native
  
  @JSName("use_native")
  var useNative: js.Any = js.native
  
  var versionstring: js.Any = js.native
  
  @JSName("zero_copy")
  var zeroCopy: js.Any = js.native
  
  @js.native
  object localStorage extends js.Object {
    
    @js.native
    /**
      * This object is used for storing and retrieving configuration from HTML5 local storage.
      */
    class LocalStorage () extends js.Object {
      
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
}
