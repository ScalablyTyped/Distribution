package typings.openpgp.mod

import typings.openpgp.mod.enums.hash
import typings.openpgp.mod.enums.symmetric
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `type` {
  
  /**
    * Encoded symmetric key for ECDH
    */
  object ecdhSymkey {
    
    @JSImport("openpgp", "type.ecdh_symkey.ECDHSymmetricKey")
    @js.native
    class ECDHSymmetricKey () extends StObject {
      
      /**
        * Read an ECDHSymmetricKey from an Uint8Array
        * @param input Where to read the encoded symmetric key from
        * @returns Number of read bytes
        */
      def read(input: Uint8Array): Double = js.native
      
      /**
        * Write an ECDHSymmetricKey as an Uint8Array
        * @returns An array containing the value
        */
      def write(): Uint8Array = js.native
    }
  }
  
  /**
    * Implementation of type KDF parameters
    * {@link https://tools.ietf.org/html/rfc6637#section-7|RFC 6637 7}:
    * A key derivation function (KDF) is necessary to implement the EC
    * encryption.  The Concatenation Key Derivation Function (Approved
    * Alternative 1) [NIST-SP800-56A] with the KDF hash function that is
    * SHA2-256 [FIPS-180-3] or stronger is REQUIRED.
    */
  object kdfParams {
    
    @JSImport("openpgp", "type.kdf_params.KDFParams")
    @js.native
    class KDFParams protected () extends StObject {
      /**
        * @param hash Hash algorithm
        * @param cipher Symmetric algorithm
        */
      def this(hash: typings.openpgp.mod.enums.hash, cipher: symmetric) = this()
      
      /**
        * Read KDFParams from an Uint8Array
        * @param input Where to read the KDFParams from
        * @returns Number of read bytes
        */
      def read(input: Uint8Array): Double = js.native
      
      /**
        * Write KDFParams to an Uint8Array
        * @returns Array with the KDFParams value
        */
      def write(): Uint8Array = js.native
    }
  }
  
  /**
    * Implementation of type key id
    * {@link https://tools.ietf.org/html/rfc4880#section-3.3|RFC4880 3.3}:
    * A Key ID is an eight-octet scalar that identifies a key.
    * Implementations SHOULD NOT assume that Key IDs are unique.  The
    * section "Enhanced Key Formats" below describes how Key IDs are
    * formed.
    */
  object keyid {
    
    @JSImport("openpgp", "type.keyid.Keyid")
    @js.native
    class Keyid () extends StObject {
      
      /**
        * Checks equality of Key ID's
        * @param keyid
        * @param matchWildcard Indicates whether to check if either keyid is a wildcard
        */
      def equals(keyid: Keyid, matchWildcard: Boolean): Unit = js.native
      
      /**
        * Parsing method for a key id
        * @param input Input to read the key id from
        */
      def read(input: Uint8Array): Unit = js.native
    }
  }
  
  /**
    * Implementation of type MPI ( {@link https://tools.ietf.org/html/rfc4880#section-3.2|RFC4880 3.2})
    * Multiprecision integers (also called MPIs) are unsigned integers used
    * to hold large integers such as the ones used in cryptographic
    * calculations.
    * An MPI consists of two pieces: a two-octet scalar that is the length
    * of the MPI in bits followed by a string of octets that contain the
    * actual integer.
    */
  object mpi {
    
    @JSImport("openpgp", "type.mpi.MPI")
    @js.native
    class MPI () extends StObject {
      
      /**
        * Parsing function for a MPI ( {@link https://tools.ietf.org/html/rfc4880#section-3.2|RFC 4880 3.2}).
        * @param input Payload of MPI data
        * @param endian Endianness of the data; 'be' for big-endian or 'le' for little-endian
        * @returns Length of data read
        */
      def read(input: Uint8Array, endian: String): Integer = js.native
      
      /**
        * Converts the mpi object to a bytes as specified in
        * {@link https://tools.ietf.org/html/rfc4880#section-3.2|RFC4880 3.2}
        * @param endian Endianness of the payload; 'be' for big-endian or 'le' for little-endian
        * @param length Length of the data part of the MPI
        * @returns mpi Byte representation
        */
      def write(endian: String, length: Integer): Uint8Array = js.native
    }
  }
  
  /**
    * Wrapper to an OID value
    * {@link https://tools.ietf.org/html/rfc6637#section-11|RFC6637, section 11}:
    * The sequence of octets in the third column is the result of applying
    * the Distinguished Encoding Rules (DER) to the ASN.1 Object Identifier
    * with subsequent truncation.  The truncation removes the two fields of
    * encoded Object Identifier.  The first omitted field is one octet
    * representing the Object Identifier tag, and the second omitted field
    * is the length of the Object Identifier body.  For example, the
    * complete ASN.1 DER encoding for the NIST P-256 curve OID is "06 08 2A
    * 86 48 CE 3D 03 01 07", from which the first entry in the table above
    * is constructed by omitting the first two octets.  Only the truncated
    * sequence of octets is the valid representation of a curve OID.
    */
  object oid {
    
    @JSImport("openpgp", "type.oid.OID")
    @js.native
    class OID () extends StObject {
      
      /**
        * If a known curve object identifier, return the canonical name of the curve
        * @returns String with the canonical name of the curve
        */
      def getName(): String = js.native
      
      /**
        * Method to read an OID object
        * @param input Where to read the OID from
        * @returns Number of read bytes
        */
      def read(input: Uint8Array): Double = js.native
      
      /**
        * Serialize an OID object as a hex string
        * @returns String with the hex value of the OID
        */
      def toHex(): String = js.native
      
      /**
        * Serialize an OID object
        * @returns Array with the serialized value the OID
        */
      def write(): Uint8Array = js.native
    }
  }
  
  /**
    * Implementation of the String-to-key specifier
    * {@link https://tools.ietf.org/html/rfc4880#section-3.7|RFC4880 3.7}:
    * String-to-key (S2K) specifiers are used to convert passphrase strings
    * into symmetric-key encryption/decryption keys.  They are used in two
    * places, currently: to encrypt the secret part of private keys in the
    * private keyring, and to convert passphrases to encryption keys for
    * symmetrically encrypted messages.
    */
  object s2k {
    
    @JSImport("openpgp", "type.s2k.S2K")
    @js.native
    class S2K () extends StObject {
      
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
}
