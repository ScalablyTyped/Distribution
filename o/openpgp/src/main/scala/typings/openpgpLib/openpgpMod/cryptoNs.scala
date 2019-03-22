package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "crypto")
@js.native
object cryptoNs extends js.Object {
  /**
    * @see module:crypto/public_key/elliptic/ecdh
    */
  @JSName("aes_kw")
  @js.native
  object aesUnderscoreKwNs extends js.Object {
    /**
      * AES key unwrap
      * @param key
      * @param data
      * @returns
      * @throws
      */
    def unwrap(key: java.lang.String, data: java.lang.String): stdLib.Uint8Array = js.native
    /**
      * AES key wrap
      * @param key
      * @param data
      * @returns
      */
    def wrap(key: java.lang.String, data: java.lang.String): stdLib.Uint8Array = js.native
  }
  
  @JSName("cfb")
  @js.native
  object cfbNs extends js.Object {
    def decrypt(algo: js.Any, key: js.Any, ciphertext: js.Any, iv: js.Any): js.Promise[_] = js.native
    def encrypt(algo: js.Any, key: js.Any, plaintext: js.Any, iv: js.Any): js.Any = js.native
  }
  
  @JSName("cipher")
  @js.native
  object cipherNs extends js.Object {
    /**
      * AES-128 encryption and decryption (ID 7)
      * @param key 128-bit key
      * @see
      * @see
      * @returns
      */
    def aes128(key: java.lang.String): js.Object = js.native
    /**
      * AES-128 Block Cipher (ID 8)
      * @param key 192-bit key
      * @see
      * @see
      * @returns
      */
    def aes192(key: java.lang.String): js.Object = js.native
    /**
      * AES-128 Block Cipher (ID 9)
      * @param key 256-bit key
      * @see
      * @see
      * @returns
      */
    def aes256(key: java.lang.String): js.Object = js.native
    /**
      * Blowfish Block Cipher (ID 4)
      * @param key 128-bit key
      * @see
      * @returns
      */
    def blowfish(key: java.lang.String): js.Object = js.native
    /**
      * CAST-128 Block Cipher (ID 3)
      * @param key 128-bit key
      * @see
      * @returns
      */
    def cast5(key: java.lang.String): js.Object = js.native
    /**
      * Not implemented
      * @throws
      */
    def idea(): scala.Unit = js.native
    /**
      * Triple DES Block Cipher (ID 2)
      * @param key 192-bit key
      * @see
      * @returns
      */
    def tripledes(key: java.lang.String): js.Object = js.native
    /**
      * Twofish Block Cipher (ID 10)
      * @param key 256-bit key
      * @see
      * @returns
      */
    def twofish(key: java.lang.String): js.Object = js.native
  }
  
  @JSName("cmac")
  @js.native
  object cmacNs extends js.Object {
    /**
      * This implementation of CMAC is based on the description of OMAC in
      * http://web.cs.ucdavis.edu/~rogaway/papers/eax.pdf. As per that
      * document:
      * We have made a small modification to the OMAC algorithm as it was
      * originally presented, changing one of its two constants.
      * Specifically, the constant 4 at line 85 was the constant 1/2 (the
      * multiplicative inverse of 2) in the original definition of OMAC [14].
      * The OMAC authors indicate that they will promulgate this modification
      * [15], which slightly simplifies implementations.
      */
    val blockLength: js.Any = js.native
    /**
      * xor `padding` into the end of `data`. This function implements "the
      * operation xor→ [which] xors the shorter string into the end of longer
      * one". Since data is always as least as long as padding, we can
      * simplify the implementation.
      * @param data
      * @param padding
      */
    def rightXorMut(data: stdLib.Uint8Array, padding: stdLib.Uint8Array): scala.Unit = js.native
  }
  
  @JSName("crypto")
  @js.native
  object cryptoNs extends js.Object {
    /**
      * Generate algorithm-specific key parameters
      * @param algo The public key algorithm
      * @param bits Bit length for RSA keys
      * @param oid Object identifier for ECC keys
      * @returns The array of parameters
      */
    def generateParams(algo: java.lang.String, bits: openpgpLib.Integer, oid: openpgpLib.openpgpMod.typeNs.oidNs.OID): js.Array[_] = js.native
    /**
      * Generating a session key for the specified symmetric algorithm
      * See {@link https://tools.ietf.org/html/rfc4880#section-9.2|RFC 4880 9.2} for algorithms.
      * @param algo Symmetric encryption algorithm
      * @returns Random bytes as a string to be used as a key
      */
    def generateSessionKey(algo: openpgpLib.openpgpMod.enumsNs.symmetric): stdLib.Uint8Array = js.native
    /**
      * Returns the types comprising the encrypted session key of an algorithm
      * @param algo The public key algorithm
      * @returns The array of types
      */
    def getEncSessionKeyParamTypes(algo: java.lang.String): js.Array[_] = js.native
    /**
      * Generates a random byte prefix for the specified algorithm
      * See {@link https://tools.ietf.org/html/rfc4880#section-9.2|RFC 4880 9.2} for algorithms.
      * @param algo Symmetric encryption algorithm
      * @returns Random bytes with length equal to the block size of the cipher, plus the last two bytes repeated.
      */
    def getPrefixRandom(algo: openpgpLib.openpgpMod.enumsNs.symmetric): stdLib.Uint8Array = js.native
    /**
      * Returns the types comprising the private key of an algorithm
      * @param algo The public key algorithm
      * @returns The array of types
      */
    def getPrivKeyParamTypes(algo: java.lang.String): js.Array[_] = js.native
    /**
      * Returns the types comprising the public key of an algorithm
      * @param algo The public key algorithm
      * @returns The array of types
      */
    def getPubKeyParamTypes(algo: java.lang.String): js.Array[_] = js.native
    /**
      * Decrypts data using specified algorithm and private key parameters.
      * See {@link https://tools.ietf.org/html/rfc4880#section-9.1|RFC 4880 9.1} for public key algorithms.
      * @param algo Public key algorithm
      * @param key_params Algorithm-specific public, private key parameters
      * @param data_params encrypted session key parameters
      * @param fingerprint Recipient fingerprint
      * @returns An MPI containing the decrypted data
      */
    def publicKeyDecrypt(
      algo: openpgpLib.openpgpMod.enumsNs.publicKey,
      key_params: js.Array[
          openpgpLib.openpgpMod.typeNs.mpiNs.MPI | openpgpLib.openpgpMod.typeNs.oidNs.OID | openpgpLib.openpgpMod.typeNs.kdfUnderscoreParamsNs.KDFParams
        ],
      data_params: js.Array[
          openpgpLib.openpgpMod.typeNs.mpiNs.MPI | openpgpLib.openpgpMod.typeNs.oidNs.OID | openpgpLib.openpgpMod.typeNs.kdfUnderscoreParamsNs.KDFParams
        ],
      fingerprint: java.lang.String
    ): openpgpLib.openpgpMod.typeNs.mpiNs.MPI = js.native
    /**
      * Encrypts data using specified algorithm and public key parameters.
      * See {@link https://tools.ietf.org/html/rfc4880#section-9.1|RFC 4880 9.1} for public key algorithms.
      * @param algo Public key algorithm
      * @param pub_params Algorithm-specific public key parameters
      * @param data Data to be encrypted as MPI
      * @param fingerprint Recipient fingerprint
      * @returns encrypted session key parameters
      */
    def publicKeyEncrypt(
      algo: openpgpLib.openpgpMod.enumsNs.publicKey,
      pub_params: js.Array[
          openpgpLib.openpgpMod.typeNs.mpiNs.MPI | openpgpLib.openpgpMod.typeNs.oidNs.OID | openpgpLib.openpgpMod.typeNs.kdfUnderscoreParamsNs.KDFParams
        ],
      data: openpgpLib.openpgpMod.typeNs.mpiNs.MPI,
      fingerprint: java.lang.String
    ): js.Array[_] = js.native
  }
  
  @JSName("eax")
  @js.native
  object eaxNs extends js.Object {
    /**
      * Class to en/decrypt using EAX mode.
      * @param cipher The symmetric cipher algorithm to use e.g. 'aes128'
      * @param key The encryption key
      */
    def EAX(cipher: java.lang.String, key: stdLib.Uint8Array): scala.Unit = js.native
    /**
      * Decrypt ciphertext input.
      * @param ciphertext The ciphertext input to be decrypted
      * @param nonce The nonce (16 bytes)
      * @param adata Associated data to verify
      * @returns The plaintext output
      */
    def decrypt(ciphertext: stdLib.Uint8Array, nonce: stdLib.Uint8Array, adata: stdLib.Uint8Array): js.Promise[stdLib.Uint8Array] = js.native
    /**
      * Encrypt plaintext input.
      * @param plaintext The cleartext input to be encrypted
      * @param nonce The nonce (16 bytes)
      * @param adata Associated data to sign
      * @returns The ciphertext output
      */
    def encrypt(plaintext: stdLib.Uint8Array, nonce: stdLib.Uint8Array, adata: stdLib.Uint8Array): js.Promise[stdLib.Uint8Array] = js.native
  }
  
  @JSName("gcm")
  @js.native
  object gcmNs extends js.Object {
    /**
      * Class to en/decrypt using GCM mode.
      * @param cipher The symmetric cipher algorithm to use e.g. 'aes128'
      * @param key The encryption key
      */
    def GCM(cipher: java.lang.String, key: stdLib.Uint8Array): scala.Unit = js.native
  }
  
  /**
    * @see
    * @see
    */
  @JSName("hash")
  @js.native
  object hashNs extends js.Object {
    /**
      * @see module:md5
      */
    var md5: js.Any = js.native
    /**
      * @see hash.js
      */
    var ripemd: js.Any = js.native
    /**
      * @see asmCrypto
      */
    var sha1: js.Any = js.native
    /**
      * @see hash.js
      */
    var sha224: js.Any = js.native
    /**
      * @see asmCrypto
      */
    var sha256: js.Any = js.native
    /**
      * @see hash.js
      */
    var sha384: js.Any = js.native
    /**
      * @see asmCrypto
      */
    var sha512: js.Any = js.native
    /**
      * Create a hash on the specified data using the specified algorithm
      * @param algo Hash algorithm type (see {@link https://tools.ietf.org/html/rfc4880#section-9.4|RFC 4880 9.4})
      * @param data Data to be hashed
      * @returns hash value
      */
    def digest(algo: openpgpLib.openpgpMod.enumsNs.hash, data: stdLib.Uint8Array): js.Promise[stdLib.Uint8Array] = js.native
    /**
      * Returns the hash size in bytes of the specified hash algorithm type
      * @param algo Hash algorithm type (See {@link https://tools.ietf.org/html/rfc4880#section-9.4|RFC 4880 9.4})
      * @returns Size in bytes of the resulting hash
      */
    def getHashByteLength(algo: openpgpLib.openpgpMod.enumsNs.hash): openpgpLib.Integer = js.native
  }
  
  @JSName("ocb")
  @js.native
  object ocbNs extends js.Object {
    /**
      * Class to en/decrypt using OCB mode.
      * @param cipher The symmetric cipher algorithm to use e.g. 'aes128'
      * @param key The encryption key
      */
    def OCB(cipher: java.lang.String, key: stdLib.Uint8Array): scala.Unit = js.native
    /**
      * Decrypt ciphertext input.
      * @param ciphertext The ciphertext input to be decrypted
      * @param nonce The nonce (15 bytes)
      * @param adata Associated data to sign
      * @returns The ciphertext output
      */
    def decrypt(ciphertext: stdLib.Uint8Array, nonce: stdLib.Uint8Array, adata: stdLib.Uint8Array): js.Promise[stdLib.Uint8Array] = js.native
    /**
      * Encrypt plaintext input.
      * @param plaintext The cleartext input to be encrypted
      * @param nonce The nonce (15 bytes)
      * @param adata Associated data to sign
      * @returns The ciphertext output
      */
    def encrypt(plaintext: stdLib.Uint8Array, nonce: stdLib.Uint8Array, adata: stdLib.Uint8Array): js.Promise[stdLib.Uint8Array] = js.native
  }
  
  /**
    * @see module:crypto/public_key/rsa
    * @see module:crypto/public_key/elliptic/ecdh
    * @see module:packet.PublicKeyEncryptedSessionKey
    */
  @JSName("pkcs1")
  @js.native
  object pkcs1Ns extends js.Object {
    /**
      * ASN1 object identifiers for hashes
      * @see
      */
    val hash_headers: js.Any = js.native
    @JSName("eme")
    @js.native
    object emeNs extends js.Object {
      /**
        * Decode a EME-PKCS1-v1_5 padded message
        * @see
        * @param EM encoded message, an octet string
        * @returns message, an octet string
        */
      def decode(EM: java.lang.String): java.lang.String = js.native
      /**
        * Create a EME-PKCS1-v1_5 padded message
        * @see
        * @param M message to be encoded
        * @param k the length in octets of the key modulus
        * @returns EME-PKCS1 padded message
        */
      def encode(M: java.lang.String, k: openpgpLib.Integer): js.Promise[java.lang.String] = js.native
    }
    
    @JSName("emsa")
    @js.native
    object emsaNs extends js.Object {
      /**
        * Create a EMSA-PKCS1-v1_5 padded message
        * @see
        * @param algo Hash algorithm type used
        * @param hashed message to be encoded
        * @param emLen intended length in octets of the encoded message
        * @returns encoded message
        */
      def encode(algo: openpgpLib.Integer, hashed: stdLib.Uint8Array, emLen: openpgpLib.Integer): java.lang.String = js.native
    }
    
  }
  
  /**
    * @see module:packet.PublicKeyEncryptedSessionKey
    */
  @JSName("pkcs5")
  @js.native
  object pkcs5Ns extends js.Object {
    /**
      * Remove pkcs5 padding from a string.
      * @param msg Text to remove padding from
      * @returns Text with padding removed
      */
    def decode(msg: java.lang.String): java.lang.String = js.native
    /**
      * Add pkcs5 padding to a text.
      * @param msg Text to add padding
      * @returns Text with padding added
      */
    def encode(msg: java.lang.String): java.lang.String = js.native
  }
  
  @JSName("public_key")
  @js.native
  object publicUnderscoreKeyNs extends js.Object {
    @JSName("dsa")
    @js.native
    object dsaNs extends js.Object {
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
        hash_algo: openpgpLib.Integer,
        hashed: stdLib.Uint8Array,
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
        hash_algo: openpgpLib.Integer,
        r: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
        s: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
        hashed: stdLib.Uint8Array,
        g: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
        p: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
        q: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
        y: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any
      ): js.Any = js.native
    }
    
    @JSName("elgamal")
    @js.native
    object elgamalNs extends js.Object {
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
    @JSName("elliptic")
    @js.native
    object ellipticNs extends js.Object {
      @JSName("curve")
      @js.native
      object curveNs extends js.Object {
        @js.native
        class Curve () extends js.Object
        
      }
      
      @JSName("ecdh")
      @js.native
      object ecdhNs extends js.Object {
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
          oid: openpgpLib.openpgpMod.typeNs.oidNs.OID,
          cipher_algo: openpgpLib.openpgpMod.enumsNs.symmetric,
          hash_algo: openpgpLib.openpgpMod.enumsNs.hash,
          V: stdLib.Uint8Array,
          C: stdLib.Uint8Array,
          d: stdLib.Uint8Array,
          fingerprint: java.lang.String
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
        def encrypt(
          oid: openpgpLib.openpgpMod.typeNs.oidNs.OID,
          cipher_algo: openpgpLib.openpgpMod.enumsNs.symmetric,
          hash_algo: openpgpLib.openpgpMod.enumsNs.hash,
          m: openpgpLib.openpgpMod.typeNs.mpiNs.MPI,
          Q: stdLib.Uint8Array,
          fingerprint: java.lang.String
        ): js.Promise[openpgpLib.Anon_C] = js.native
        /**
          * Generate ECDHE secret from private key and public part of ephemeral key
          * @param curve Elliptic curve object
          * @param V Public part of ephemeral key
          * @param d Recipient private key
          * @returns Generated ephemeral secret
          */
        def genPrivateEphemeralKey(
          curve: openpgpLib.openpgpMod.cryptoNs.publicUnderscoreKeyNs.ellipticNs.curveNs.Curve,
          V: stdLib.Uint8Array,
          d: stdLib.Uint8Array
        ): js.Promise[
                /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ _
              ] = js.native
        /**
          * Generate ECDHE ephemeral key and secret from public key
          * @param curve Elliptic curve object
          * @param Q Recipient public key
          * @returns Returns public part of ephemeral key and generated ephemeral secret
          */
        def genPublicEphemeralKey(
          curve: openpgpLib.openpgpMod.cryptoNs.publicUnderscoreKeyNs.ellipticNs.curveNs.Curve,
          Q: stdLib.Uint8Array
        ): js.Promise[openpgpLib.Anon_S] = js.native
      }
      
      @JSName("ecdsa")
      @js.native
      object ecdsaNs extends js.Object {
        /**
          * Sign a message using the provided key
          * @param oid Elliptic curve object identifier
          * @param hash_algo Hash algorithm used to sign
          * @param m Message to sign
          * @param d Private key used to sign the message
          * @param hashed The hashed message
          * @returns Signature of the message
          */
        def sign(
          oid: openpgpLib.openpgpMod.typeNs.oidNs.OID,
          hash_algo: openpgpLib.openpgpMod.enumsNs.hash,
          m: stdLib.Uint8Array,
          d: stdLib.Uint8Array,
          hashed: stdLib.Uint8Array
        ): js.Object = js.native
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
        def verify(
          oid: openpgpLib.openpgpMod.typeNs.oidNs.OID,
          hash_algo: openpgpLib.openpgpMod.enumsNs.hash,
          signature: js.Object,
          m: stdLib.Uint8Array,
          Q: stdLib.Uint8Array,
          hashed: stdLib.Uint8Array
        ): scala.Boolean = js.native
      }
      
      @JSName("eddsa")
      @js.native
      object eddsaNs extends js.Object {
        /**
          * Sign a message using the provided keygit
          * @param oid Elliptic curve object identifier
          * @param hash_algo Hash algorithm used to sign
          * @param m Message to sign
          * @param d Private key used to sign
          * @param hashed The hashed message
          * @returns Signature of the message
          */
        def sign(
          oid: openpgpLib.openpgpMod.typeNs.oidNs.OID,
          hash_algo: openpgpLib.openpgpMod.enumsNs.hash,
          m: stdLib.Uint8Array,
          d: stdLib.Uint8Array,
          hashed: stdLib.Uint8Array
        ): js.Object = js.native
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
        def verify(
          oid: openpgpLib.openpgpMod.typeNs.oidNs.OID,
          hash_algo: openpgpLib.openpgpMod.enumsNs.hash,
          signature: js.Object,
          m: stdLib.Uint8Array,
          Q: stdLib.Uint8Array,
          hashed: stdLib.Uint8Array
        ): scala.Boolean = js.native
      }
      
      @JSName("key")
      @js.native
      object keyNs extends js.Object {
        @js.native
        class KeyPair () extends js.Object
        
      }
      
    }
    
    @JSName("prime")
    @js.native
    object primeNs extends js.Object {
      /**
        * Tests whether n is probably prime or not using Fermat's test with b = 2.
        * Fails if b^(n-1) mod n === 1.
        * @param n Number to test
        * @param b Optional Fermat test base
        * @returns
        */
      def fermat(
        n: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
        b: openpgpLib.Integer
      ): scala.Boolean = js.native
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
        k: openpgpLib.Integer
      ): scala.Boolean = js.native
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
        k: openpgpLib.Integer,
        rand: js.Function
      ): scala.Boolean = js.native
      /**
        * Probabilistic random number generator
        * @param bits Bit length of the prime
        * @param e Optional RSA exponent to check against the prime
        * @param k Optional number of iterations of Miller-Rabin test
        * @returns BN
        */
      def randomProbablePrime(
        bits: openpgpLib.Integer,
        e: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
        k: openpgpLib.Integer
      ): js.Any = js.native
    }
    
    @JSName("rsa")
    @js.native
    object rsaNs extends js.Object {
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
      def generate(B: openpgpLib.Integer, E: java.lang.String): js.Object = js.native
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
  
  @JSName("random")
  @js.native
  object randomNs extends js.Object {
    /**
      * Buffer for secure random numbers
      */
    def RandomBuffer(): scala.Unit = js.native
    /**
      * Create a secure random MPI that is greater than or equal to min and less than max.
      * @param min Lower bound, included
      * @param max Upper bound, excluded
      * @returns Random MPI
      */
    def getRandomBN(min: openpgpLib.openpgpMod.typeNs.mpiNs.MPI, max: openpgpLib.openpgpMod.typeNs.mpiNs.MPI): js.Any = js.native
    /**
      * Retrieve secure random byte array of the specified length
      * @param length Length in bytes to generate
      * @returns Random byte array
      */
    def getRandomBytes(length: openpgpLib.Integer): stdLib.Uint8Array = js.native
  }
  
  @JSName("signature")
  @js.native
  object signatureNs extends js.Object {
    /**
      * Creates a signature on data using specified algorithms and private key parameters.
      * See {@link https://tools.ietf.org/html/rfc4880#section-9.1|RFC 4880 9.1}
      * and {@link https://tools.ietf.org/html/rfc4880#section-9.4|RFC 4880 9.4}
      * for public key and hash algorithms.
      * @param algo Public key algorithm
      * @param hash_algo Hash algorithm
      * @param key_params Algorithm-specific public and private key parameters
      * @param data Data to be signed
      * @param hashed The hashed data
      * @returns Signature
      */
    def sign(
      algo: openpgpLib.openpgpMod.enumsNs.publicKey,
      hash_algo: openpgpLib.openpgpMod.enumsNs.hash,
      key_params: js.Array[openpgpLib.openpgpMod.typeNs.mpiNs.MPI],
      data: stdLib.Uint8Array,
      hashed: stdLib.Uint8Array
    ): stdLib.Uint8Array = js.native
    /**
      * Verifies the signature provided for data using specified algorithms and public key parameters.
      * See {@link https://tools.ietf.org/html/rfc4880#section-9.1|RFC 4880 9.1}
      * and {@link https://tools.ietf.org/html/rfc4880#section-9.4|RFC 4880 9.4}
      * for public key and hash algorithms.
      * @param algo Public key algorithm
      * @param hash_algo Hash algorithm
      * @param msg_MPIs Algorithm-specific signature parameters
      * @param pub_MPIs Algorithm-specific public key parameters
      * @param data Data for which the signature was created
      * @param hashed The hashed data
      * @returns True if signature is valid
      */
    def verify(
      algo: openpgpLib.openpgpMod.enumsNs.publicKey,
      hash_algo: openpgpLib.openpgpMod.enumsNs.hash,
      msg_MPIs: js.Array[openpgpLib.openpgpMod.typeNs.mpiNs.MPI],
      pub_MPIs: js.Array[openpgpLib.openpgpMod.typeNs.mpiNs.MPI],
      data: stdLib.Uint8Array,
      hashed: stdLib.Uint8Array
    ): scala.Boolean = js.native
  }
  
}

