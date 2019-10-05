package typings.openpgp.openpgpMod.crypto

import typings.openpgp.Anon_C
import typings.openpgp.Anon_S
import typings.openpgp.Integer
import typings.openpgp.openpgpMod.`type`.mpi.MPI
import typings.openpgp.openpgpMod.`type`.oid.OID
import typings.openpgp.openpgpMod.crypto.public_key.elliptic.curve.Curve
import typings.openpgp.openpgpMod.enums.hash
import typings.openpgp.openpgpMod.enums.symmetric
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "crypto.public_key")
@js.native
object public_key extends js.Object {
  @js.native
  object dsa extends js.Object {
    /**
      * DSA Sign function
      * @param hash_algo
      * @param hashed
      * @param g
      * @param p
      * @param q
      * @param x
      * @returns
      */
    def sign(
      hash_algo: Integer,
      hashed: Uint8Array,
      g: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
      p: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
      q: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
      x: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any
    ): js.Object = js.native
    /**
      * DSA Verify function
      * @param hash_algo
      * @param r
      * @param s
      * @param hashed
      * @param g
      * @param p
      * @param q
      * @param y
      * @returns BN
      */
    def verify(
      hash_algo: Integer,
      r: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
      s: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
      hashed: Uint8Array,
      g: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
      p: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
      q: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
      y: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any
    ): js.Any = js.native
  }
  
  @js.native
  object elgamal extends js.Object {
    /**
      * ElGamal Encryption function
      * @param c1
      * @param c2
      * @param p
      * @param x
      * @returns BN
      */
    def decrypt(
      c1: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
      c2: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
      p: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
      x: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any
    ): js.Any = js.native
    /**
      * ElGamal Encryption function
      * @param m
      * @param p
      * @param g
      * @param y
      * @returns
      */
    def encrypt(
      m: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
      p: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
      g: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
      y: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any
    ): js.Object = js.native
  }
  
  /**
    * @see module:crypto/public_key/elliptic/curve
    * @see module:crypto/public_key/elliptic/ecdh
    * @see module:crypto/public_key/elliptic/ecdsa
    * @see module:crypto/public_key/elliptic/eddsa
    */
  @js.native
  object elliptic extends js.Object {
    @js.native
    object curve extends js.Object {
      @js.native
      class Curve () extends js.Object
      
    }
    
    @js.native
    object ecdh extends js.Object {
      /**
        * Decrypt and unwrap the value derived from session key
        * @param oid Elliptic curve object identifier
        * @param cipher_algo Symmetric cipher to use
        * @param hash_algo Hash algorithm to use
        * @param V Public part of ephemeral key
        * @param C Encrypted and wrapped value derived from session key
        * @param d Recipient private key
        * @param fingerprint Recipient fingerprint
        * @returns Value derived from session
        */
      def decrypt(
        oid: OID,
        cipher_algo: symmetric,
        hash_algo: hash,
        V: Uint8Array,
        C: Uint8Array,
        d: Uint8Array,
        fingerprint: String
      ): js.Promise[
            /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ _
          ] = js.native
      /**
        * Encrypt and wrap a session key
        * @param oid Elliptic curve object identifier
        * @param cipher_algo Symmetric cipher to use
        * @param hash_algo Hash algorithm to use
        * @param m Value derived from session key (RFC 6637)
        * @param Q Recipient public key
        * @param fingerprint Recipient fingerprint
        * @returns Returns public part of ephemeral key and encoded session key
        */
      def encrypt(oid: OID, cipher_algo: symmetric, hash_algo: hash, m: MPI, Q: Uint8Array, fingerprint: String): js.Promise[Anon_C] = js.native
      /**
        * Generate ECDHE secret from private key and public part of ephemeral key
        * @param curve Elliptic curve object
        * @param V Public part of ephemeral key
        * @param d Recipient private key
        * @returns Generated ephemeral secret
        */
      def genPrivateEphemeralKey(curve: Curve, V: Uint8Array, d: Uint8Array): js.Promise[
            /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ _
          ] = js.native
      /**
        * Generate ECDHE ephemeral key and secret from public key
        * @param curve Elliptic curve object
        * @param Q Recipient public key
        * @returns Returns public part of ephemeral key and generated ephemeral secret
        */
      def genPublicEphemeralKey(curve: Curve, Q: Uint8Array): js.Promise[Anon_S] = js.native
    }
    
    @js.native
    object ecdsa extends js.Object {
      /**
        * Sign a message using the provided key
        * @param oid Elliptic curve object identifier
        * @param hash_algo Hash algorithm used to sign
        * @param m Message to sign
        * @param d Private key used to sign the message
        * @param hashed The hashed message
        * @returns Signature of the message
        */
      def sign(oid: OID, hash_algo: hash, m: Uint8Array, d: Uint8Array, hashed: Uint8Array): js.Object = js.native
      /**
        * Verifies if a signature is valid for a message
        * @param oid Elliptic curve object identifier
        * @param hash_algo Hash algorithm used in the signature
        * @param signature Signature to verify
        * @param m Message to verify
        * @param Q Public key used to verify the message
        * @param hashed The hashed message
        * @returns
        */
      def verify(oid: OID, hash_algo: hash, signature: js.Object, m: Uint8Array, Q: Uint8Array, hashed: Uint8Array): Boolean = js.native
    }
    
    @js.native
    object eddsa extends js.Object {
      /**
        * Sign a message using the provided keygit
        * @param oid Elliptic curve object identifier
        * @param hash_algo Hash algorithm used to sign
        * @param m Message to sign
        * @param d Private key used to sign
        * @param hashed The hashed message
        * @returns Signature of the message
        */
      def sign(oid: OID, hash_algo: hash, m: Uint8Array, d: Uint8Array, hashed: Uint8Array): js.Object = js.native
      /**
        * Verifies if a signature is valid for a message
        * @param oid Elliptic curve object identifier
        * @param hash_algo Hash algorithm used in the signature
        * @param signature Signature to verify the message
        * @param m Message to verify
        * @param Q Public key used to verify the message
        * @param hashed The hashed message
        * @returns
        */
      def verify(oid: OID, hash_algo: hash, signature: js.Object, m: Uint8Array, Q: Uint8Array, hashed: Uint8Array): Boolean = js.native
    }
    
    @js.native
    object key extends js.Object {
      @js.native
      class KeyPair () extends js.Object
      
    }
    
  }
  
  @js.native
  object prime extends js.Object {
    /**
      * Tests whether n is probably prime or not using Fermat's test with b = 2.
      * Fails if b^(n-1) mod n === 1.
      * @param n Number to test
      * @param b Optional Fermat test base
      * @returns
      */
    def fermat(
      n: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
      b: Integer
    ): Boolean = js.native
    /**
      * Probabilistic primality testing
      * @param n Number to test
      * @param e Optional RSA exponent to check against the prime
      * @param k Optional number of iterations of Miller-Rabin test
      * @returns
      */
    def isProbablePrime(
      n: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
      e: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
      k: Integer
    ): Boolean = js.native
    /**
      * Tests whether n is probably prime or not using the Miller-Rabin test.
      * See HAC Remark 4.28.
      * @param n Number to test
      * @param k Optional number of iterations of Miller-Rabin test
      * @param rand Optional function to generate potential witnesses
      * @returns
      */
    def millerRabin(
      n: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
      k: Integer,
      rand: js.Function
    ): Boolean = js.native
    /**
      * Probabilistic random number generator
      * @param bits Bit length of the prime
      * @param e Optional RSA exponent to check against the prime
      * @param k Optional number of iterations of Miller-Rabin test
      * @returns BN
      */
    def randomProbablePrime(
      bits: Integer,
      e: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
      k: Integer
    ): js.Any = js.native
  }
  
  @js.native
  object rsa extends js.Object {
    /**
      * Decrypt RSA message
      * @param m message
      * @param n RSA public modulus
      * @param e RSA public exponent
      * @param d RSA private exponent
      * @param p RSA private prime p
      * @param q RSA private prime q
      * @param u RSA private inverse of prime q
      * @returns RSA Plaintext
      */
    def decrypt(
      m: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
      n: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
      e: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
      d: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
      p: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
      q: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
      u: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any
    ): js.Any = js.native
    /**
      * Encrypt message
      * @param m message
      * @param n RSA public modulus
      * @param e RSA public exponent
      * @returns RSA Ciphertext
      */
    def encrypt(
      m: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
      n: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
      e: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any
    ): js.Any = js.native
    /**
      * Generate a new random private key B bits long with public exponent E.
      * When possible, webCrypto is used. Otherwise, primes are generated using
      * 40 rounds of the Miller-Rabin probabilistic random prime generation algorithm.
      * @see module:crypto/public_key/prime
      * @param B RSA bit length
      * @param E RSA public exponent in hex string
      * @returns RSA public modulus, RSA public exponent, RSA private exponent,
      *          RSA private prime p, RSA private prime q, u = q ** -1 mod p
      */
    def generate(B: Integer, E: String): js.Object = js.native
    /**
      * Create signature
      * @param m message
      * @param n RSA public modulus
      * @param e RSA public exponent
      * @param d RSA private exponent
      * @returns RSA Signature
      */
    def sign(
      m: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
      n: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
      e: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
      d: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any
    ): js.Any = js.native
    /**
      * Verify signature
      * @param s signature
      * @param n RSA public modulus
      * @param e RSA public exponent
      * @returns
      */
    def verify(
      s: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
      n: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
      e: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any
    ): js.Any = js.native
  }
  
}

