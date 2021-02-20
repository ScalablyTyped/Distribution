package typings.openpgp.mod

import typings.openpgp.anon.C
import typings.openpgp.anon.S
import typings.openpgp.mod.`type`.kdfParams.KDFParams
import typings.openpgp.mod.`type`.mpi.MPI
import typings.openpgp.mod.`type`.oid.OID
import typings.openpgp.mod.crypto.publicKey.elliptic.curve.Curve
import typings.openpgp.mod.enums.hash
import typings.openpgp.mod.enums.publicKey
import typings.openpgp.mod.enums.symmetric
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object crypto {
  
  /**
    * @see module:crypto/public_key/elliptic/ecdh
    */
  object aesKw {
    
    /**
      * AES key unwrap
      * @param key
      * @param data
      * @returns
      * @throws
      */
    @JSImport("openpgp", "crypto.aes_kw.unwrap")
    @js.native
    def unwrap(key: String, data: String): Uint8Array = js.native
    
    /**
      * AES key wrap
      * @param key
      * @param data
      * @returns
      */
    @JSImport("openpgp", "crypto.aes_kw.wrap")
    @js.native
    def wrap(key: String, data: String): Uint8Array = js.native
  }
  
  object cfb {
    
    @JSImport("openpgp", "crypto.cfb.decrypt")
    @js.native
    def decrypt(algo: js.Any, key: js.Any, ciphertext: js.Any, iv: js.Any): js.Promise[_] = js.native
    
    @JSImport("openpgp", "crypto.cfb.encrypt")
    @js.native
    def encrypt(algo: js.Any, key: js.Any, plaintext: js.Any, iv: js.Any): js.Any = js.native
  }
  
  object cipher {
    
    /**
      * AES-128 encryption and decryption (ID 7)
      * @param key 128-bit key
      * @see
      * @see
      * @returns
      */
    @JSImport("openpgp", "crypto.cipher.aes128")
    @js.native
    def aes128(key: String): js.Object = js.native
    
    /**
      * AES-128 Block Cipher (ID 8)
      * @param key 192-bit key
      * @see
      * @see
      * @returns
      */
    @JSImport("openpgp", "crypto.cipher.aes192")
    @js.native
    def aes192(key: String): js.Object = js.native
    
    /**
      * AES-128 Block Cipher (ID 9)
      * @param key 256-bit key
      * @see
      * @see
      * @returns
      */
    @JSImport("openpgp", "crypto.cipher.aes256")
    @js.native
    def aes256(key: String): js.Object = js.native
    
    /**
      * Blowfish Block Cipher (ID 4)
      * @param key 128-bit key
      * @see
      * @returns
      */
    @JSImport("openpgp", "crypto.cipher.blowfish")
    @js.native
    def blowfish(key: String): js.Object = js.native
    
    /**
      * CAST-128 Block Cipher (ID 3)
      * @param key 128-bit key
      * @see
      * @returns
      */
    @JSImport("openpgp", "crypto.cipher.cast5")
    @js.native
    def cast5(key: String): js.Object = js.native
    
    /**
      * Not implemented
      * @throws
      */
    @JSImport("openpgp", "crypto.cipher.idea")
    @js.native
    def idea(): Unit = js.native
    
    /**
      * Triple DES Block Cipher (ID 2)
      * @param key 192-bit key
      * @see
      * @returns
      */
    @JSImport("openpgp", "crypto.cipher.tripledes")
    @js.native
    def tripledes(key: String): js.Object = js.native
    
    /**
      * Twofish Block Cipher (ID 10)
      * @param key 256-bit key
      * @see
      * @returns
      */
    @JSImport("openpgp", "crypto.cipher.twofish")
    @js.native
    def twofish(key: String): js.Object = js.native
  }
  
  object cmac {
    
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
    @JSImport("openpgp", "crypto.cmac.blockLength")
    @js.native
    val blockLength: js.Any = js.native
    
    /**
      * xor `padding` into the end of `data`. This function implements "the
      * operation xor→ [which] xors the shorter string into the end of longer
      * one". Since data is always as least as long as padding, we can
      * simplify the implementation.
      * @param data
      * @param padding
      */
    @JSImport("openpgp", "crypto.cmac.rightXorMut")
    @js.native
    def rightXorMut(data: Uint8Array, padding: Uint8Array): Unit = js.native
  }
  
  object crypto {
    
    /**
      * Generate algorithm-specific key parameters
      * @param algo The public key algorithm
      * @param bits Bit length for RSA keys
      * @param oid Object identifier for ECC keys
      * @returns The array of parameters
      */
    @JSImport("openpgp", "crypto.crypto.generateParams")
    @js.native
    def generateParams(algo: String, bits: Integer, oid: OID): js.Array[_] = js.native
    
    /**
      * Generating a session key for the specified symmetric algorithm
      * See {@link https://tools.ietf.org/html/rfc4880#section-9.2|RFC 4880 9.2} for algorithms.
      * @param algo Symmetric encryption algorithm
      * @returns Random bytes as a string to be used as a key
      */
    @JSImport("openpgp", "crypto.crypto.generateSessionKey")
    @js.native
    def generateSessionKey(algo: symmetric): Uint8Array = js.native
    
    /**
      * Returns the types comprising the encrypted session key of an algorithm
      * @param algo The public key algorithm
      * @returns The array of types
      */
    @JSImport("openpgp", "crypto.crypto.getEncSessionKeyParamTypes")
    @js.native
    def getEncSessionKeyParamTypes(algo: String): js.Array[_] = js.native
    
    /**
      * Generates a random byte prefix for the specified algorithm
      * See {@link https://tools.ietf.org/html/rfc4880#section-9.2|RFC 4880 9.2} for algorithms.
      * @param algo Symmetric encryption algorithm
      * @returns Random bytes with length equal to the block size of the cipher, plus the last two bytes repeated.
      */
    @JSImport("openpgp", "crypto.crypto.getPrefixRandom")
    @js.native
    def getPrefixRandom(algo: symmetric): Uint8Array = js.native
    
    /**
      * Returns the types comprising the private key of an algorithm
      * @param algo The public key algorithm
      * @returns The array of types
      */
    @JSImport("openpgp", "crypto.crypto.getPrivKeyParamTypes")
    @js.native
    def getPrivKeyParamTypes(algo: String): js.Array[_] = js.native
    
    /**
      * Returns the types comprising the public key of an algorithm
      * @param algo The public key algorithm
      * @returns The array of types
      */
    @JSImport("openpgp", "crypto.crypto.getPubKeyParamTypes")
    @js.native
    def getPubKeyParamTypes(algo: String): js.Array[_] = js.native
    
    /**
      * Decrypts data using specified algorithm and private key parameters.
      * See {@link https://tools.ietf.org/html/rfc4880#section-9.1|RFC 4880 9.1} for public key algorithms.
      * @param algo Public key algorithm
      * @param key_params Algorithm-specific public, private key parameters
      * @param data_params encrypted session key parameters
      * @param fingerprint Recipient fingerprint
      * @returns An MPI containing the decrypted data
      */
    @JSImport("openpgp", "crypto.crypto.publicKeyDecrypt")
    @js.native
    def publicKeyDecrypt(
      algo: publicKey,
      key_params: js.Array[MPI | OID | KDFParams],
      data_params: js.Array[MPI | OID | KDFParams],
      fingerprint: String
    ): MPI = js.native
    
    /**
      * Encrypts data using specified algorithm and public key parameters.
      * See {@link https://tools.ietf.org/html/rfc4880#section-9.1|RFC 4880 9.1} for public key algorithms.
      * @param algo Public key algorithm
      * @param pub_params Algorithm-specific public key parameters
      * @param data Data to be encrypted as MPI
      * @param fingerprint Recipient fingerprint
      * @returns encrypted session key parameters
      */
    @JSImport("openpgp", "crypto.crypto.publicKeyEncrypt")
    @js.native
    def publicKeyEncrypt(algo: publicKey, pub_params: js.Array[MPI | OID | KDFParams], data: MPI, fingerprint: String): js.Array[_] = js.native
  }
  
  object eax {
    
    /**
      * Class to en/decrypt using EAX mode.
      * @param cipher The symmetric cipher algorithm to use e.g. 'aes128'
      * @param key The encryption key
      */
    @JSImport("openpgp", "crypto.eax.EAX")
    @js.native
    def EAX(cipher: String, key: Uint8Array): Unit = js.native
    
    /**
      * Decrypt ciphertext input.
      * @param ciphertext The ciphertext input to be decrypted
      * @param nonce The nonce (16 bytes)
      * @param adata Associated data to verify
      * @returns The plaintext output
      */
    @JSImport("openpgp", "crypto.eax.decrypt")
    @js.native
    def decrypt(ciphertext: Uint8Array, nonce: Uint8Array, adata: Uint8Array): js.Promise[Uint8Array] = js.native
    
    /**
      * Encrypt plaintext input.
      * @param plaintext The cleartext input to be encrypted
      * @param nonce The nonce (16 bytes)
      * @param adata Associated data to sign
      * @returns The ciphertext output
      */
    @JSImport("openpgp", "crypto.eax.encrypt")
    @js.native
    def encrypt(plaintext: Uint8Array, nonce: Uint8Array, adata: Uint8Array): js.Promise[Uint8Array] = js.native
  }
  
  object gcm {
    
    /**
      * Class to en/decrypt using GCM mode.
      * @param cipher The symmetric cipher algorithm to use e.g. 'aes128'
      * @param key The encryption key
      */
    @JSImport("openpgp", "crypto.gcm.GCM")
    @js.native
    def GCM(cipher: String, key: Uint8Array): Unit = js.native
  }
  
  /**
    * @see
    * @see
    */
  object hash {
    
    @JSImport("openpgp", "crypto.hash")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a hash on the specified data using the specified algorithm
      * @param algo Hash algorithm type (see {@link https://tools.ietf.org/html/rfc4880#section-9.4|RFC 4880 9.4})
      * @param data Data to be hashed
      * @returns hash value
      */
    @JSImport("openpgp", "crypto.hash.digest")
    @js.native
    def digest(algo: typings.openpgp.mod.enums.hash, data: Uint8Array): js.Promise[Uint8Array] = js.native
    
    /**
      * Returns the hash size in bytes of the specified hash algorithm type
      * @param algo Hash algorithm type (See {@link https://tools.ietf.org/html/rfc4880#section-9.4|RFC 4880 9.4})
      * @returns Size in bytes of the resulting hash
      */
    @JSImport("openpgp", "crypto.hash.getHashByteLength")
    @js.native
    def getHashByteLength(algo: typings.openpgp.mod.enums.hash): Integer = js.native
    
    /**
      * @see module:md5
      */
    @JSImport("openpgp", "crypto.hash.md5")
    @js.native
    def md5: js.Any = js.native
    @scala.inline
    def md5_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("md5")(x.asInstanceOf[js.Any])
    
    /**
      * @see hash.js
      */
    @JSImport("openpgp", "crypto.hash.ripemd")
    @js.native
    def ripemd: js.Any = js.native
    @scala.inline
    def ripemd_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ripemd")(x.asInstanceOf[js.Any])
    
    /**
      * @see asmCrypto
      */
    @JSImport("openpgp", "crypto.hash.sha1")
    @js.native
    def sha1: js.Any = js.native
    @scala.inline
    def sha1_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha1")(x.asInstanceOf[js.Any])
    
    /**
      * @see hash.js
      */
    @JSImport("openpgp", "crypto.hash.sha224")
    @js.native
    def sha224: js.Any = js.native
    @scala.inline
    def sha224_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha224")(x.asInstanceOf[js.Any])
    
    /**
      * @see asmCrypto
      */
    @JSImport("openpgp", "crypto.hash.sha256")
    @js.native
    def sha256: js.Any = js.native
    @scala.inline
    def sha256_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha256")(x.asInstanceOf[js.Any])
    
    /**
      * @see hash.js
      */
    @JSImport("openpgp", "crypto.hash.sha384")
    @js.native
    def sha384: js.Any = js.native
    @scala.inline
    def sha384_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha384")(x.asInstanceOf[js.Any])
    
    /**
      * @see asmCrypto
      */
    @JSImport("openpgp", "crypto.hash.sha512")
    @js.native
    def sha512: js.Any = js.native
    @scala.inline
    def sha512_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha512")(x.asInstanceOf[js.Any])
  }
  
  object ocb {
    
    /**
      * Class to en/decrypt using OCB mode.
      * @param cipher The symmetric cipher algorithm to use e.g. 'aes128'
      * @param key The encryption key
      */
    @JSImport("openpgp", "crypto.ocb.OCB")
    @js.native
    def OCB(cipher: String, key: Uint8Array): Unit = js.native
    
    /**
      * Decrypt ciphertext input.
      * @param ciphertext The ciphertext input to be decrypted
      * @param nonce The nonce (15 bytes)
      * @param adata Associated data to sign
      * @returns The ciphertext output
      */
    @JSImport("openpgp", "crypto.ocb.decrypt")
    @js.native
    def decrypt(ciphertext: Uint8Array, nonce: Uint8Array, adata: Uint8Array): js.Promise[Uint8Array] = js.native
    
    /**
      * Encrypt plaintext input.
      * @param plaintext The cleartext input to be encrypted
      * @param nonce The nonce (15 bytes)
      * @param adata Associated data to sign
      * @returns The ciphertext output
      */
    @JSImport("openpgp", "crypto.ocb.encrypt")
    @js.native
    def encrypt(plaintext: Uint8Array, nonce: Uint8Array, adata: Uint8Array): js.Promise[Uint8Array] = js.native
  }
  
  /**
    * @see module:crypto/public_key/rsa
    * @see module:crypto/public_key/elliptic/ecdh
    * @see module:packet.PublicKeyEncryptedSessionKey
    */
  object pkcs1 {
    
    object eme {
      
      /**
        * Decode a EME-PKCS1-v1_5 padded message
        * @see
        * @param EM encoded message, an octet string
        * @returns message, an octet string
        */
      @JSImport("openpgp", "crypto.pkcs1.eme.decode")
      @js.native
      def decode(EM: String): String = js.native
      
      /**
        * Create a EME-PKCS1-v1_5 padded message
        * @see
        * @param M message to be encoded
        * @param k the length in octets of the key modulus
        * @returns EME-PKCS1 padded message
        */
      @JSImport("openpgp", "crypto.pkcs1.eme.encode")
      @js.native
      def encode(M: String, k: Integer): js.Promise[String] = js.native
    }
    
    object emsa {
      
      /**
        * Create a EMSA-PKCS1-v1_5 padded message
        * @see
        * @param algo Hash algorithm type used
        * @param hashed message to be encoded
        * @param emLen intended length in octets of the encoded message
        * @returns encoded message
        */
      @JSImport("openpgp", "crypto.pkcs1.emsa.encode")
      @js.native
      def encode(algo: Integer, hashed: Uint8Array, emLen: Integer): String = js.native
    }
    
    /**
      * ASN1 object identifiers for hashes
      * @see
      */
    @JSImport("openpgp", "crypto.pkcs1.hash_headers")
    @js.native
    val hashHeaders: js.Any = js.native
  }
  
  /**
    * @see module:packet.PublicKeyEncryptedSessionKey
    */
  object pkcs5 {
    
    /**
      * Remove pkcs5 padding from a string.
      * @param msg Text to remove padding from
      * @returns Text with padding removed
      */
    @JSImport("openpgp", "crypto.pkcs5.decode")
    @js.native
    def decode(msg: String): String = js.native
    
    /**
      * Add pkcs5 padding to a text.
      * @param msg Text to add padding
      * @returns Text with padding added
      */
    @JSImport("openpgp", "crypto.pkcs5.encode")
    @js.native
    def encode(msg: String): String = js.native
  }
  
  object publicKey {
    
    object dsa {
      
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
      @JSImport("openpgp", "crypto.public_key.dsa.sign")
      @js.native
      def sign(
        hash_algo: Integer,
        hashed: Uint8Array,
        g: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
        p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
        q: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
        x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
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
      @JSImport("openpgp", "crypto.public_key.dsa.verify")
      @js.native
      def verify(
        hash_algo: Integer,
        r: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
        s: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
        hashed: Uint8Array,
        g: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
        p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
        q: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
        y: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
      ): js.Any = js.native
    }
    
    object elgamal {
      
      /**
        * ElGamal Encryption function
        * @param c1
        * @param c2
        * @param p
        * @param x
        * @returns BN
        */
      @JSImport("openpgp", "crypto.public_key.elgamal.decrypt")
      @js.native
      def decrypt(
        c1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
        c2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
        p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
        x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
      ): js.Any = js.native
      
      /**
        * ElGamal Encryption function
        * @param m
        * @param p
        * @param g
        * @param y
        * @returns
        */
      @JSImport("openpgp", "crypto.public_key.elgamal.encrypt")
      @js.native
      def encrypt(
        m: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
        p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
        g: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
        y: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
      ): js.Object = js.native
    }
    
    /**
      * @see module:crypto/public_key/elliptic/curve
      * @see module:crypto/public_key/elliptic/ecdh
      * @see module:crypto/public_key/elliptic/ecdsa
      * @see module:crypto/public_key/elliptic/eddsa
      */
    object elliptic {
      
      object curve {
        
        @JSImport("openpgp", "crypto.public_key.elliptic.curve.Curve")
        @js.native
        class Curve () extends StObject
      }
      
      object ecdh {
        
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
        @JSImport("openpgp", "crypto.public_key.elliptic.ecdh.decrypt")
        @js.native
        def decrypt(
          oid: OID,
          cipher_algo: symmetric,
          hash_algo: hash,
          V: Uint8Array,
          C: Uint8Array,
          d: Uint8Array,
          fingerprint: String
        ): js.Promise[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ _
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
        @JSImport("openpgp", "crypto.public_key.elliptic.ecdh.encrypt")
        @js.native
        def encrypt(oid: OID, cipher_algo: symmetric, hash_algo: hash, m: MPI, Q: Uint8Array, fingerprint: String): js.Promise[C] = js.native
        
        /**
          * Generate ECDHE secret from private key and public part of ephemeral key
          * @param curve Elliptic curve object
          * @param V Public part of ephemeral key
          * @param d Recipient private key
          * @returns Generated ephemeral secret
          */
        @JSImport("openpgp", "crypto.public_key.elliptic.ecdh.genPrivateEphemeralKey")
        @js.native
        def genPrivateEphemeralKey(curve: Curve, V: Uint8Array, d: Uint8Array): js.Promise[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ _
              ] = js.native
        
        /**
          * Generate ECDHE ephemeral key and secret from public key
          * @param curve Elliptic curve object
          * @param Q Recipient public key
          * @returns Returns public part of ephemeral key and generated ephemeral secret
          */
        @JSImport("openpgp", "crypto.public_key.elliptic.ecdh.genPublicEphemeralKey")
        @js.native
        def genPublicEphemeralKey(curve: Curve, Q: Uint8Array): js.Promise[S] = js.native
      }
      
      object ecdsa {
        
        /**
          * Sign a message using the provided key
          * @param oid Elliptic curve object identifier
          * @param hash_algo Hash algorithm used to sign
          * @param m Message to sign
          * @param d Private key used to sign the message
          * @param hashed The hashed message
          * @returns Signature of the message
          */
        @JSImport("openpgp", "crypto.public_key.elliptic.ecdsa.sign")
        @js.native
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
        @JSImport("openpgp", "crypto.public_key.elliptic.ecdsa.verify")
        @js.native
        def verify(oid: OID, hash_algo: hash, signature: js.Object, m: Uint8Array, Q: Uint8Array, hashed: Uint8Array): Boolean = js.native
      }
      
      object eddsa {
        
        /**
          * Sign a message using the provided keygit
          * @param oid Elliptic curve object identifier
          * @param hash_algo Hash algorithm used to sign
          * @param m Message to sign
          * @param d Private key used to sign
          * @param hashed The hashed message
          * @returns Signature of the message
          */
        @JSImport("openpgp", "crypto.public_key.elliptic.eddsa.sign")
        @js.native
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
        @JSImport("openpgp", "crypto.public_key.elliptic.eddsa.verify")
        @js.native
        def verify(oid: OID, hash_algo: hash, signature: js.Object, m: Uint8Array, Q: Uint8Array, hashed: Uint8Array): Boolean = js.native
      }
      
      object key {
        
        @JSImport("openpgp", "crypto.public_key.elliptic.key.KeyPair")
        @js.native
        class KeyPair () extends StObject
      }
    }
    
    object prime {
      
      /**
        * Tests whether n is probably prime or not using Fermat's test with b = 2.
        * Fails if b^(n-1) mod n === 1.
        * @param n Number to test
        * @param b Optional Fermat test base
        * @returns
        */
      @JSImport("openpgp", "crypto.public_key.prime.fermat")
      @js.native
      def fermat(
        n: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
        b: Integer
      ): Boolean = js.native
      
      /**
        * Probabilistic primality testing
        * @param n Number to test
        * @param e Optional RSA exponent to check against the prime
        * @param k Optional number of iterations of Miller-Rabin test
        * @returns
        */
      @JSImport("openpgp", "crypto.public_key.prime.isProbablePrime")
      @js.native
      def isProbablePrime(
        n: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
        e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
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
      @JSImport("openpgp", "crypto.public_key.prime.millerRabin")
      @js.native
      def millerRabin(
        n: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
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
      @JSImport("openpgp", "crypto.public_key.prime.randomProbablePrime")
      @js.native
      def randomProbablePrime(
        bits: Integer,
        e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
        k: Integer
      ): js.Any = js.native
    }
    
    object rsa {
      
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
      @JSImport("openpgp", "crypto.public_key.rsa.decrypt")
      @js.native
      def decrypt(
        m: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
        n: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
        e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
        d: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
        p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
        q: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
        u: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
      ): js.Any = js.native
      
      /**
        * Encrypt message
        * @param m message
        * @param n RSA public modulus
        * @param e RSA public exponent
        * @returns RSA Ciphertext
        */
      @JSImport("openpgp", "crypto.public_key.rsa.encrypt")
      @js.native
      def encrypt(
        m: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
        n: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
        e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
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
      @JSImport("openpgp", "crypto.public_key.rsa.generate")
      @js.native
      def generate(B: Integer, E: String): js.Object = js.native
      
      /**
        * Create signature
        * @param m message
        * @param n RSA public modulus
        * @param e RSA public exponent
        * @param d RSA private exponent
        * @returns RSA Signature
        */
      @JSImport("openpgp", "crypto.public_key.rsa.sign")
      @js.native
      def sign(
        m: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
        n: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
        e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
        d: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
      ): js.Any = js.native
      
      /**
        * Verify signature
        * @param s signature
        * @param n RSA public modulus
        * @param e RSA public exponent
        * @returns
        */
      @JSImport("openpgp", "crypto.public_key.rsa.verify")
      @js.native
      def verify(
        s: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
        n: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
        e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
      ): js.Any = js.native
    }
  }
  
  object random {
    
    /**
      * Buffer for secure random numbers
      */
    @JSImport("openpgp", "crypto.random.RandomBuffer")
    @js.native
    def RandomBuffer(): Unit = js.native
    
    /**
      * Create a secure random MPI that is greater than or equal to min and less than max.
      * @param min Lower bound, included
      * @param max Upper bound, excluded
      * @returns Random MPI
      */
    @JSImport("openpgp", "crypto.random.getRandomBN")
    @js.native
    def getRandomBN(min: MPI, max: MPI): js.Any = js.native
    
    /**
      * Retrieve secure random byte array of the specified length
      * @param length Length in bytes to generate
      * @returns Random byte array
      */
    @JSImport("openpgp", "crypto.random.getRandomBytes")
    @js.native
    def getRandomBytes(length: Integer): Uint8Array = js.native
  }
  
  object signature {
    
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
    @JSImport("openpgp", "crypto.signature.sign")
    @js.native
    def sign(algo: publicKey, hash_algo: hash, key_params: js.Array[MPI], data: Uint8Array, hashed: Uint8Array): Uint8Array = js.native
    
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
    @JSImport("openpgp", "crypto.signature.verify")
    @js.native
    def verify(
      algo: publicKey,
      hash_algo: hash,
      msg_MPIs: js.Array[MPI],
      pub_MPIs: js.Array[MPI],
      data: Uint8Array,
      hashed: Uint8Array
    ): Boolean = js.native
  }
}
