package typings.openpgp.mod.`type`

import typings.openpgp.mod.Integer
import typings.openpgp.mod.enums.hash
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Implementation of the String-to-key specifier
  * {@link https://tools.ietf.org/html/rfc4880#section-3.7|RFC4880 3.7}:
  * String-to-key (S2K) specifiers are used to convert passphrase strings
  * into symmetric-key encryption/decryption keys.  They are used in two
  * places, currently: to encrypt the secret part of private keys in the
  * private keyring, and to convert passphrases to encryption keys for
  * symmetrically encrypted messages.
  */
@JSImport("openpgp", "type.s2k")
@js.native
object s2k extends js.Object {
  
  @js.native
  class S2K () extends js.Object {
    
    var algorithm: hash = js.native
    
    var c: Integer = js.native
    
    /**
      * Produces a key using the specified passphrase and the defined
      * hashAlgorithm
      * @param passphrase Passphrase containing user input
      * @returns Produced key with a length corresponding to
      *          hashAlgorithm hash length
      */
    def produce_key(passphrase: String): Uint8Array = js.native
    
    /**
      * Parsing function for a string-to-key specifier ( {@link https://tools.ietf.org/html/rfc4880#section-3.7|RFC 4880 3.7}).
      * @param input Payload of string-to-key specifier
      * @returns Actual length of the object
      */
    def read(input: String): Integer = js.native
    
    /**
      * Eight bytes of salt in a binary string.
      */
    var salt: String = js.native
    
    var `type`: typings.openpgp.mod.enums.s2k = js.native
    
    /**
      * Serializes s2k information
      * @returns binary representation of s2k
      */
    def write(): Uint8Array = js.native
  }
}
