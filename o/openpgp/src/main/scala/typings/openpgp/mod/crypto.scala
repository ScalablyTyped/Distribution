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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object crypto {
  
  /**
    * @see module:crypto/public_key/elliptic/ecdh
    */
  object aesKw {
    
    @JSImport("openpgp", "crypto.aes_kw")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * AES key unwrap
      * @param key
      * @param data
      * @returns
      * @throws
      */
    inline def unwrap(key: String, data: String): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("unwrap")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    /**
      * AES key wrap
      * @param key
      * @param data
      * @returns
      */
    inline def wrap(key: String, data: String): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  }
  
  object cfb {
    
    @JSImport("openpgp", "crypto.cfb")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decrypt(algo: Any, key: Any, ciphertext: Any, iv: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(algo.asInstanceOf[js.Any], key.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    inline def encrypt(algo: Any, key: Any, plaintext: Any, iv: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(algo.asInstanceOf[js.Any], key.asInstanceOf[js.Any], plaintext.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  object cipher {
    
    @JSImport("openpgp", "crypto.cipher")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * AES-128 encryption and decryption (ID 7)
      * @param key 128-bit key
      * @see
      * @see
      * @returns
      */
    inline def aes128(key: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("aes128")(key.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    /**
      * AES-128 Block Cipher (ID 8)
      * @param key 192-bit key
      * @see
      * @see
      * @returns
      */
    inline def aes192(key: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("aes192")(key.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    /**
      * AES-128 Block Cipher (ID 9)
      * @param key 256-bit key
      * @see
      * @see
      * @returns
      */
    inline def aes256(key: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("aes256")(key.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    /**
      * Blowfish Block Cipher (ID 4)
      * @param key 128-bit key
      * @see
      * @returns
      */
    inline def blowfish(key: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("blowfish")(key.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    /**
      * CAST-128 Block Cipher (ID 3)
      * @param key 128-bit key
      * @see
      * @returns
      */
    inline def cast5(key: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("cast5")(key.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    /**
      * Not implemented
      * @throws
      */
    inline def idea(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("idea")().asInstanceOf[Unit]
    
    /**
      * Triple DES Block Cipher (ID 2)
      * @param key 192-bit key
      * @see
      * @returns
      */
    inline def tripledes(key: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("tripledes")(key.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    /**
      * Twofish Block Cipher (ID 10)
      * @param key 256-bit key
      * @see
      * @returns
      */
    inline def twofish(key: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("twofish")(key.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  }
  
  object cmac {
    
    @JSImport("openpgp", "crypto.cmac")
    @js.native
    val ^ : js.Any = js.native
    
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
    val blockLength: Any = js.native
    
    /**
      * xor `padding` into the end of `data`. This function implements "the
      * operation xor→ [which] xors the shorter string into the end of longer
      * one". Since data is always as least as long as padding, we can
      * simplify the implementation.
      * @param data
      * @param padding
      */
    inline def rightXorMut(data: js.typedarray.Uint8Array, padding: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rightXorMut")(data.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object crypto {
    
    @JSImport("openpgp", "crypto.crypto")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Generate algorithm-specific key parameters
      * @param algo The public key algorithm
      * @param bits Bit length for RSA keys
      * @param oid Object identifier for ECC keys
      * @returns The array of parameters
      */
    inline def generateParams(algo: String, bits: Integer, oid: OID): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateParams")(algo.asInstanceOf[js.Any], bits.asInstanceOf[js.Any], oid.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    /**
      * Generating a session key for the specified symmetric algorithm
      * See {@link https://tools.ietf.org/html/rfc4880#section-9.2|RFC 4880 9.2} for algorithms.
      * @param algo Symmetric encryption algorithm
      * @returns Random bytes as a string to be used as a key
      */
    inline def generateSessionKey(algo: symmetric): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSessionKey")(algo.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    /**
      * Returns the types comprising the encrypted session key of an algorithm
      * @param algo The public key algorithm
      * @returns The array of types
      */
    inline def getEncSessionKeyParamTypes(algo: String): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEncSessionKeyParamTypes")(algo.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    
    /**
      * Generates a random byte prefix for the specified algorithm
      * See {@link https://tools.ietf.org/html/rfc4880#section-9.2|RFC 4880 9.2} for algorithms.
      * @param algo Symmetric encryption algorithm
      * @returns Random bytes with length equal to the block size of the cipher, plus the last two bytes repeated.
      */
    inline def getPrefixRandom(algo: symmetric): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrefixRandom")(algo.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    /**
      * Returns the types comprising the private key of an algorithm
      * @param algo The public key algorithm
      * @returns The array of types
      */
    inline def getPrivKeyParamTypes(algo: String): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrivKeyParamTypes")(algo.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    
    /**
      * Returns the types comprising the public key of an algorithm
      * @param algo The public key algorithm
      * @returns The array of types
      */
    inline def getPubKeyParamTypes(algo: String): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPubKeyParamTypes")(algo.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    
    /**
      * Decrypts data using specified algorithm and private key parameters.
      * See {@link https://tools.ietf.org/html/rfc4880#section-9.1|RFC 4880 9.1} for public key algorithms.
      * @param algo Public key algorithm
      * @param key_params Algorithm-specific public, private key parameters
      * @param data_params encrypted session key parameters
      * @param fingerprint Recipient fingerprint
      * @returns An MPI containing the decrypted data
      */
    inline def publicKeyDecrypt(
      algo: publicKey,
      key_params: js.Array[MPI | OID | KDFParams],
      data_params: js.Array[MPI | OID | KDFParams],
      fingerprint: String
    ): MPI = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyDecrypt")(algo.asInstanceOf[js.Any], key_params.asInstanceOf[js.Any], data_params.asInstanceOf[js.Any], fingerprint.asInstanceOf[js.Any])).asInstanceOf[MPI]
    
    /**
      * Encrypts data using specified algorithm and public key parameters.
      * See {@link https://tools.ietf.org/html/rfc4880#section-9.1|RFC 4880 9.1} for public key algorithms.
      * @param algo Public key algorithm
      * @param pub_params Algorithm-specific public key parameters
      * @param data Data to be encrypted as MPI
      * @param fingerprint Recipient fingerprint
      * @returns encrypted session key parameters
      */
    inline def publicKeyEncrypt(algo: publicKey, pub_params: js.Array[MPI | OID | KDFParams], data: MPI, fingerprint: String): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyEncrypt")(algo.asInstanceOf[js.Any], pub_params.asInstanceOf[js.Any], data.asInstanceOf[js.Any], fingerprint.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  }
  
  object eax {
    
    @JSImport("openpgp", "crypto.eax")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Class to en/decrypt using EAX mode.
      * @param cipher The symmetric cipher algorithm to use e.g. 'aes128'
      * @param key The encryption key
      */
    inline def EAX(cipher: String, key: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EAX")(cipher.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Decrypt ciphertext input.
      * @param ciphertext The ciphertext input to be decrypted
      * @param nonce The nonce (16 bytes)
      * @param adata Associated data to verify
      * @returns The plaintext output
      */
    inline def decrypt(
      ciphertext: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.typedarray.Uint8Array
    ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], adata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
    
    /**
      * Encrypt plaintext input.
      * @param plaintext The cleartext input to be encrypted
      * @param nonce The nonce (16 bytes)
      * @param adata Associated data to sign
      * @returns The ciphertext output
      */
    inline def encrypt(
      plaintext: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.typedarray.Uint8Array
    ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(plaintext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], adata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  }
  
  object gcm {
    
    @JSImport("openpgp", "crypto.gcm")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Class to en/decrypt using GCM mode.
      * @param cipher The symmetric cipher algorithm to use e.g. 'aes128'
      * @param key The encryption key
      */
    inline def GCM(cipher: String, key: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("GCM")(cipher.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
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
    inline def digest(algo: typings.openpgp.mod.enums.hash, data: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(algo.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
    
    /**
      * Returns the hash size in bytes of the specified hash algorithm type
      * @param algo Hash algorithm type (See {@link https://tools.ietf.org/html/rfc4880#section-9.4|RFC 4880 9.4})
      * @returns Size in bytes of the resulting hash
      */
    inline def getHashByteLength(algo: typings.openpgp.mod.enums.hash): Integer = ^.asInstanceOf[js.Dynamic].applyDynamic("getHashByteLength")(algo.asInstanceOf[js.Any]).asInstanceOf[Integer]
    
    /**
      * @see module:md5
      */
    @JSImport("openpgp", "crypto.hash.md5")
    @js.native
    def md5: Any = js.native
    inline def md5_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("md5")(x.asInstanceOf[js.Any])
    
    /**
      * @see hash.js
      */
    @JSImport("openpgp", "crypto.hash.ripemd")
    @js.native
    def ripemd: Any = js.native
    inline def ripemd_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ripemd")(x.asInstanceOf[js.Any])
    
    /**
      * @see asmCrypto
      */
    @JSImport("openpgp", "crypto.hash.sha1")
    @js.native
    def sha1: Any = js.native
    inline def sha1_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha1")(x.asInstanceOf[js.Any])
    
    /**
      * @see hash.js
      */
    @JSImport("openpgp", "crypto.hash.sha224")
    @js.native
    def sha224: Any = js.native
    inline def sha224_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha224")(x.asInstanceOf[js.Any])
    
    /**
      * @see asmCrypto
      */
    @JSImport("openpgp", "crypto.hash.sha256")
    @js.native
    def sha256: Any = js.native
    inline def sha256_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha256")(x.asInstanceOf[js.Any])
    
    /**
      * @see hash.js
      */
    @JSImport("openpgp", "crypto.hash.sha384")
    @js.native
    def sha384: Any = js.native
    inline def sha384_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha384")(x.asInstanceOf[js.Any])
    
    /**
      * @see asmCrypto
      */
    @JSImport("openpgp", "crypto.hash.sha512")
    @js.native
    def sha512: Any = js.native
    inline def sha512_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha512")(x.asInstanceOf[js.Any])
  }
  
  object ocb {
    
    @JSImport("openpgp", "crypto.ocb")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Class to en/decrypt using OCB mode.
      * @param cipher The symmetric cipher algorithm to use e.g. 'aes128'
      * @param key The encryption key
      */
    inline def OCB(cipher: String, key: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("OCB")(cipher.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Decrypt ciphertext input.
      * @param ciphertext The ciphertext input to be decrypted
      * @param nonce The nonce (15 bytes)
      * @param adata Associated data to sign
      * @returns The ciphertext output
      */
    inline def decrypt(
      ciphertext: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.typedarray.Uint8Array
    ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], adata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
    
    /**
      * Encrypt plaintext input.
      * @param plaintext The cleartext input to be encrypted
      * @param nonce The nonce (15 bytes)
      * @param adata Associated data to sign
      * @returns The ciphertext output
      */
    inline def encrypt(
      plaintext: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.typedarray.Uint8Array
    ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(plaintext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], adata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  }
  
  /**
    * @see module:crypto/public_key/rsa
    * @see module:crypto/public_key/elliptic/ecdh
    * @see module:packet.PublicKeyEncryptedSessionKey
    */
  object pkcs1 {
    
    object eme {
      
      @JSImport("openpgp", "crypto.pkcs1.eme")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Decode a EME-PKCS1-v1_5 padded message
        * @see
        * @param EM encoded message, an octet string
        * @returns message, an octet string
        */
      inline def decode(EM: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(EM.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Create a EME-PKCS1-v1_5 padded message
        * @see
        * @param M message to be encoded
        * @param k the length in octets of the key modulus
        * @returns EME-PKCS1 padded message
        */
      inline def encode(M: String, k: Integer): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(M.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    }
    
    object emsa {
      
      @JSImport("openpgp", "crypto.pkcs1.emsa")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Create a EMSA-PKCS1-v1_5 padded message
        * @see
        * @param algo Hash algorithm type used
        * @param hashed message to be encoded
        * @param emLen intended length in octets of the encoded message
        * @returns encoded message
        */
      inline def encode(algo: Integer, hashed: js.typedarray.Uint8Array, emLen: Integer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(algo.asInstanceOf[js.Any], hashed.asInstanceOf[js.Any], emLen.asInstanceOf[js.Any])).asInstanceOf[String]
    }
    
    /**
      * ASN1 object identifiers for hashes
      * @see
      */
    @JSImport("openpgp", "crypto.pkcs1.hash_headers")
    @js.native
    val hashHeaders: Any = js.native
  }
  
  /**
    * @see module:packet.PublicKeyEncryptedSessionKey
    */
  object pkcs5 {
    
    @JSImport("openpgp", "crypto.pkcs5")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Remove pkcs5 padding from a string.
      * @param msg Text to remove padding from
      * @returns Text with padding removed
      */
    inline def decode(msg: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(msg.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Add pkcs5 padding to a text.
      * @param msg Text to add padding
      * @returns Text with padding added
      */
    inline def encode(msg: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(msg.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object publicKey {
    
    object dsa {
      
      @JSImport("openpgp", "crypto.public_key.dsa")
      @js.native
      val ^ : js.Any = js.native
      
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
      inline def sign(
        hash_algo: Integer,
        hashed: js.typedarray.Uint8Array,
        g: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
        p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
        q: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
        x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
      ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(hash_algo.asInstanceOf[js.Any], hashed.asInstanceOf[js.Any], g.asInstanceOf[js.Any], p.asInstanceOf[js.Any], q.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      
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
      inline def verify(
        hash_algo: Integer,
        r: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
        s: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
        hashed: js.typedarray.Uint8Array,
        g: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
        p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
        q: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
        y: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
      ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(hash_algo.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any], hashed.asInstanceOf[js.Any], g.asInstanceOf[js.Any], p.asInstanceOf[js.Any], q.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Any]
    }
    
    object elgamal {
      
      @JSImport("openpgp", "crypto.public_key.elgamal")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * ElGamal Encryption function
        * @param c1
        * @param c2
        * @param p
        * @param x
        * @returns BN
        */
      inline def decrypt(
        c1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
        c2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
        p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
        x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
      ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(c1.asInstanceOf[js.Any], c2.asInstanceOf[js.Any], p.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      /**
        * ElGamal Encryption function
        * @param m
        * @param p
        * @param g
        * @param y
        * @returns
        */
      inline def encrypt(
        m: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
        p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
        g: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
        y: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
      ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(m.asInstanceOf[js.Any], p.asInstanceOf[js.Any], g.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.Object]
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
        open class Curve () extends StObject
      }
      
      object ecdh {
        
        @JSImport("openpgp", "crypto.public_key.elliptic.ecdh")
        @js.native
        val ^ : js.Any = js.native
        
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
        inline def decrypt(
          oid: OID,
          cipher_algo: symmetric,
          hash_algo: hash,
          V: js.typedarray.Uint8Array,
          C: js.typedarray.Uint8Array,
          d: js.typedarray.Uint8Array,
          fingerprint: String
        ): js.Promise[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
              ] = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(oid.asInstanceOf[js.Any], cipher_algo.asInstanceOf[js.Any], hash_algo.asInstanceOf[js.Any], V.asInstanceOf[js.Any], C.asInstanceOf[js.Any], d.asInstanceOf[js.Any], fingerprint.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
              ]]
        
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
        inline def encrypt(
          oid: OID,
          cipher_algo: symmetric,
          hash_algo: hash,
          m: MPI,
          Q: js.typedarray.Uint8Array,
          fingerprint: String
        ): js.Promise[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(oid.asInstanceOf[js.Any], cipher_algo.asInstanceOf[js.Any], hash_algo.asInstanceOf[js.Any], m.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], fingerprint.asInstanceOf[js.Any])).asInstanceOf[js.Promise[C]]
        
        /**
          * Generate ECDHE secret from private key and public part of ephemeral key
          * @param curve Elliptic curve object
          * @param V Public part of ephemeral key
          * @param d Recipient private key
          * @returns Generated ephemeral secret
          */
        inline def genPrivateEphemeralKey(curve: Curve, V: js.typedarray.Uint8Array, d: js.typedarray.Uint8Array): js.Promise[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
              ] = (^.asInstanceOf[js.Dynamic].applyDynamic("genPrivateEphemeralKey")(curve.asInstanceOf[js.Any], V.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
              ]]
        
        /**
          * Generate ECDHE ephemeral key and secret from public key
          * @param curve Elliptic curve object
          * @param Q Recipient public key
          * @returns Returns public part of ephemeral key and generated ephemeral secret
          */
        inline def genPublicEphemeralKey(curve: Curve, Q: js.typedarray.Uint8Array): js.Promise[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("genPublicEphemeralKey")(curve.asInstanceOf[js.Any], Q.asInstanceOf[js.Any])).asInstanceOf[js.Promise[S]]
      }
      
      object ecdsa {
        
        @JSImport("openpgp", "crypto.public_key.elliptic.ecdsa")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Sign a message using the provided key
          * @param oid Elliptic curve object identifier
          * @param hash_algo Hash algorithm used to sign
          * @param m Message to sign
          * @param d Private key used to sign the message
          * @param hashed The hashed message
          * @returns Signature of the message
          */
        inline def sign(
          oid: OID,
          hash_algo: hash,
          m: js.typedarray.Uint8Array,
          d: js.typedarray.Uint8Array,
          hashed: js.typedarray.Uint8Array
        ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(oid.asInstanceOf[js.Any], hash_algo.asInstanceOf[js.Any], m.asInstanceOf[js.Any], d.asInstanceOf[js.Any], hashed.asInstanceOf[js.Any])).asInstanceOf[js.Object]
        
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
        inline def verify(
          oid: OID,
          hash_algo: hash,
          signature: js.Object,
          m: js.typedarray.Uint8Array,
          Q: js.typedarray.Uint8Array,
          hashed: js.typedarray.Uint8Array
        ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(oid.asInstanceOf[js.Any], hash_algo.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], m.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], hashed.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      }
      
      object eddsa {
        
        @JSImport("openpgp", "crypto.public_key.elliptic.eddsa")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Sign a message using the provided keygit
          * @param oid Elliptic curve object identifier
          * @param hash_algo Hash algorithm used to sign
          * @param m Message to sign
          * @param d Private key used to sign
          * @param hashed The hashed message
          * @returns Signature of the message
          */
        inline def sign(
          oid: OID,
          hash_algo: hash,
          m: js.typedarray.Uint8Array,
          d: js.typedarray.Uint8Array,
          hashed: js.typedarray.Uint8Array
        ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(oid.asInstanceOf[js.Any], hash_algo.asInstanceOf[js.Any], m.asInstanceOf[js.Any], d.asInstanceOf[js.Any], hashed.asInstanceOf[js.Any])).asInstanceOf[js.Object]
        
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
        inline def verify(
          oid: OID,
          hash_algo: hash,
          signature: js.Object,
          m: js.typedarray.Uint8Array,
          Q: js.typedarray.Uint8Array,
          hashed: js.typedarray.Uint8Array
        ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(oid.asInstanceOf[js.Any], hash_algo.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], m.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], hashed.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      }
      
      object key {
        
        @JSImport("openpgp", "crypto.public_key.elliptic.key.KeyPair")
        @js.native
        open class KeyPair () extends StObject
      }
    }
    
    object prime {
      
      @JSImport("openpgp", "crypto.public_key.prime")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Tests whether n is probably prime or not using Fermat's test with b = 2.
        * Fails if b^(n-1) mod n === 1.
        * @param n Number to test
        * @param b Optional Fermat test base
        * @returns
        */
      inline def fermat(
        n: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
        b: Integer
      ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fermat")(n.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      /**
        * Probabilistic primality testing
        * @param n Number to test
        * @param e Optional RSA exponent to check against the prime
        * @param k Optional number of iterations of Miller-Rabin test
        * @returns
        */
      inline def isProbablePrime(
        n: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
        e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
        k: Integer
      ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isProbablePrime")(n.asInstanceOf[js.Any], e.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      /**
        * Tests whether n is probably prime or not using the Miller-Rabin test.
        * See HAC Remark 4.28.
        * @param n Number to test
        * @param k Optional number of iterations of Miller-Rabin test
        * @param rand Optional function to generate potential witnesses
        * @returns
        */
      inline def millerRabin(
        n: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
        k: Integer,
        rand: js.Function
      ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("millerRabin")(n.asInstanceOf[js.Any], k.asInstanceOf[js.Any], rand.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      /**
        * Probabilistic random number generator
        * @param bits Bit length of the prime
        * @param e Optional RSA exponent to check against the prime
        * @param k Optional number of iterations of Miller-Rabin test
        * @returns BN
        */
      inline def randomProbablePrime(
        bits: Integer,
        e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
        k: Integer
      ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("randomProbablePrime")(bits.asInstanceOf[js.Any], e.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[Any]
    }
    
    object rsa {
      
      @JSImport("openpgp", "crypto.public_key.rsa")
      @js.native
      val ^ : js.Any = js.native
      
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
      inline def decrypt(
        m: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
        n: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
        e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
        d: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
        p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
        q: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
        u: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
      ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(m.asInstanceOf[js.Any], n.asInstanceOf[js.Any], e.asInstanceOf[js.Any], d.asInstanceOf[js.Any], p.asInstanceOf[js.Any], q.asInstanceOf[js.Any], u.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      /**
        * Encrypt message
        * @param m message
        * @param n RSA public modulus
        * @param e RSA public exponent
        * @returns RSA Ciphertext
        */
      inline def encrypt(
        m: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
        n: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
        e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
      ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(m.asInstanceOf[js.Any], n.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Any]
      
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
      inline def generate(B: Integer, E: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(B.asInstanceOf[js.Any], E.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      
      /**
        * Create signature
        * @param m message
        * @param n RSA public modulus
        * @param e RSA public exponent
        * @param d RSA private exponent
        * @returns RSA Signature
        */
      inline def sign(
        m: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
        n: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
        e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
        d: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
      ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(m.asInstanceOf[js.Any], n.asInstanceOf[js.Any], e.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      /**
        * Verify signature
        * @param s signature
        * @param n RSA public modulus
        * @param e RSA public exponent
        * @returns
        */
      inline def verify(
        s: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
        n: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
        e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
      ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(s.asInstanceOf[js.Any], n.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Any]
    }
  }
  
  object random {
    
    @JSImport("openpgp", "crypto.random")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Buffer for secure random numbers
      */
    inline def RandomBuffer(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("RandomBuffer")().asInstanceOf[Unit]
    
    /**
      * Create a secure random MPI that is greater than or equal to min and less than max.
      * @param min Lower bound, included
      * @param max Upper bound, excluded
      * @returns Random MPI
      */
    inline def getRandomBN(min: MPI, max: MPI): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getRandomBN")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /**
      * Retrieve secure random byte array of the specified length
      * @param length Length in bytes to generate
      * @returns Random byte array
      */
    inline def getRandomBytes(length: Integer): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomBytes")(length.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  }
  
  object signature {
    
    @JSImport("openpgp", "crypto.signature")
    @js.native
    val ^ : js.Any = js.native
    
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
    inline def sign(
      algo: publicKey,
      hash_algo: hash,
      key_params: js.Array[MPI],
      data: js.typedarray.Uint8Array,
      hashed: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algo.asInstanceOf[js.Any], hash_algo.asInstanceOf[js.Any], key_params.asInstanceOf[js.Any], data.asInstanceOf[js.Any], hashed.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
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
    inline def verify(
      algo: publicKey,
      hash_algo: hash,
      msg_MPIs: js.Array[MPI],
      pub_MPIs: js.Array[MPI],
      data: js.typedarray.Uint8Array,
      hashed: js.typedarray.Uint8Array
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algo.asInstanceOf[js.Any], hash_algo.asInstanceOf[js.Any], msg_MPIs.asInstanceOf[js.Any], pub_MPIs.asInstanceOf[js.Any], data.asInstanceOf[js.Any], hashed.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
}
