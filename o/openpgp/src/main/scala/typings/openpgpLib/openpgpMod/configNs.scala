package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "config")
@js.native
object configNs extends js.Object {
  /**
    * Chunk Size Byte for Authenticated Encryption with Additional Data (AEAD) mode
    * Only has an effect when aead_protect is set to true.
    * Must be an integer value from 0 to 56.
    */
  var aead_chunk_size_byte: js.Any = js.native
  /**
    * Default Authenticated Encryption with Additional Data (AEAD) encryption mode
    * Only has an effect when aead_protect is set to true.
    */
  var aead_mode: js.Any = js.native
  /**
    * Use Authenticated Encryption with Additional Data (AEAD) protection for symmetric encryption.
    * **NOT INTEROPERABLE WITH OTHER OPENPGP IMPLEMENTATIONS**
    * **FUTURE OPENPGP.JS VERSIONS MAY BREAK COMPATIBILITY WHEN USING THIS OPTION**
    */
  var aead_protect: js.Any = js.native
  /**
    * Use Authenticated Encryption with Additional Data (AEAD) protection for symmetric encryption.
    * 0 means we implement a variant of {@link https://tools.ietf.org/html/draft-ford-openpgp-format-00|this IETF draft}.
    * 4 means we implement {@link https://tools.ietf.org/html/draft-ietf-openpgp-rfc4880bis-04|RFC4880bis-04}.
    * Note that this determines how AEAD packets are parsed even when aead_protect is set to false
    */
  var aead_protect_version: js.Any = js.native
  var allow_unauthenticated_stream: js.Any = js.native
  var checksum_required: js.Any = js.native
  var commentstring: js.Any = js.native
  var compression: js.Any = js.native
  var debug: js.Any = js.native
  var deflate_level: js.Any = js.native
  var encryption_cipher: js.Any = js.native
  var ignore_mdc_error: js.Any = js.native
  /**
    * Use integrity protection for symmetric encryption
    */
  var integrity_protect: js.Any = js.native
  var keyserver: js.Any = js.native
  /**
    * Max userid string length (used for parsing)
    */
  var max_userid_length: js.Any = js.native
  var min_bytes_for_web_crypto: js.Any = js.native
  var node_store: js.Any = js.native
  /**
    * Work-around for rare GPG decryption bug when encrypting with multiple passwords.
    * **Slower and slightly less secure**
    */
  var password_collision_check: js.Any = js.native
  var prefer_hash_algorithm: js.Any = js.native
  var revocations_expire: js.Any = js.native
  var rsa_blinding: js.Any = js.native
  /**
    * {@link https://tools.ietf.org/html/rfc4880#section-3.7.1.3|RFC4880 3.7.1.3}:
    * Iteration Count Byte for S2K (String to Key)
    */
  var s2k_iteration_count_byte: js.Any = js.native
  var show_comment: js.Any = js.native
  var show_version: js.Any = js.native
  var tolerant: js.Any = js.native
  var use_native: js.Any = js.native
  var versionstring: js.Any = js.native
  var zero_copy: js.Any = js.native
  @JSName("localStorage")
  @js.native
  object localStorageNs extends js.Object {
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
      def read(): scala.Unit = js.native
      /**
        * Writes the config to HTML5 local storage
        */
      def write(): scala.Unit = js.native
    }
    
  }
  
}

