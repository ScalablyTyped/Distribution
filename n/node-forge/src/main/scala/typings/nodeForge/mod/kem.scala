package typings.nodeForge.mod

import typings.nodeForge.mod.md.MessageDigest
import typings.nodeForge.mod.pki.rsa.PrivateKey
import typings.nodeForge.mod.pki.rsa.PublicKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kem {
  
  /**
    * Creates a key derivation API object that implements KDF1 per ISO 18033-2.
    *
    * @param md the hash API to use.
    * @param digestLength a digest length that must be positive and less than or equal to `md.digestLength`.
    *
    * @return a KDF1 API object.
    */
  @JSImport("node-forge", "kem.kdf1")
  @js.native
  open class kdf1 protected ()
    extends StObject
       with KDF {
    def this(md: MessageDigest) = this()
    def this(md: MessageDigest, digestLength: Double) = this()
    
    /**
      * Generate a key of the specified length.
      *
      * @param x the binary-encoded byte string to generate a key from.
      * @param length the number of bytes to generate (the size of the key).
      *
      * @return the key as a binary-encoded string.
      */
    /* CompleteClass */
    override def generate(x: String, length: Double): String = js.native
  }
  
  /**
    * Creates a key derivation API object that implements KDF2 per ISO 18033-2.
    *
    * @param md the hash API to use.
    * @param digestLength a digest length that must be positive and less than or equal to `md.digestLength`.
    *
    * @return a KDF2 API object.
    */
  @JSImport("node-forge", "kem.kdf2")
  @js.native
  open class kdf2 protected ()
    extends StObject
       with KDF {
    def this(md: MessageDigest) = this()
    def this(md: MessageDigest, digestLength: Double) = this()
    
    /**
      * Generate a key of the specified length.
      *
      * @param x the binary-encoded byte string to generate a key from.
      * @param length the number of bytes to generate (the size of the key).
      *
      * @return the key as a binary-encoded string.
      */
    /* CompleteClass */
    override def generate(x: String, length: Double): String = js.native
  }
  
  object rsa {
    
    @JSImport("node-forge", "kem.rsa")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an RSA KEM API object for generating a secret asymmetric key.
      *
      * The symmetric key may be generated via a call to 'encrypt', which will
      * produce a ciphertext to be transmitted to the recipient and a key to be
      * kept secret. The ciphertext is a parameter to be passed to 'decrypt' which
      * will produce the same secret key for the recipient to use to decrypt a
      * message that was encrypted with the secret key.
      *
      * @param kdf the KDF API to use (eg: `new forge.kem.kdf1()`).
      * @param options the options to use.
      */
    inline def create(kdf: KDF): typings.nodeForge.mod.kem.rsa.kem = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(kdf.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.kem.rsa.kem]
    inline def create(kdf: KDF, options: Options): typings.nodeForge.mod.kem.rsa.kem = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(kdf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.kem.rsa.kem]
    
    trait Options extends StObject {
      
      /**
        * A custom crypto-secure pseudo-random number generator to use.
        */
      var prng: js.UndefOr[typings.nodeForge.mod.kem.rsa.random] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setPrng(value: typings.nodeForge.mod.kem.rsa.random): Self = StObject.set(x, "prng", value.asInstanceOf[js.Any])
        
        inline def setPrngUndefined: Self = StObject.set(x, "prng", js.undefined)
      }
    }
    
    trait kem extends StObject {
      
      /**
        * Decrypts an encapsulated secret key.
        *
        * @param privateKey the RSA private key to decrypt with.
        * @param encapsulation the ciphertext for generating the secret key, as a binary-encoded
        * string of bytes.
        * @param keyLength the length, in bytes, of the secret key to generate.
        *
        * @return the secret key as a binary-encoded string of bytes.
        */
      def decrypt(privateKey: PrivateKey, encapsulation: String, keyLength: Double): String
      
      /**
        * Generates a secret key and its encapsulation.
        *
        * @param publicKey the RSA public key to encrypt with.
        * @param keyLength the length, in bytes, of the secret key to generate.
        */
      def encrypt(publicKey: PublicKey, keyLength: Double): EncryptResult
    }
    object kem {
      
      inline def apply(decrypt: (PrivateKey, String, Double) => String, encrypt: (PublicKey, Double) => EncryptResult): typings.nodeForge.mod.kem.rsa.kem = {
        val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction3(decrypt), encrypt = js.Any.fromFunction2(encrypt))
        __obj.asInstanceOf[typings.nodeForge.mod.kem.rsa.kem]
      }
      
      extension [Self <: typings.nodeForge.mod.kem.rsa.kem](x: Self) {
        
        inline def setDecrypt(value: (PrivateKey, String, Double) => String): Self = StObject.set(x, "decrypt", js.Any.fromFunction3(value))
        
        inline def setEncrypt(value: (PublicKey, Double) => EncryptResult): Self = StObject.set(x, "encrypt", js.Any.fromFunction2(value))
      }
    }
    
    trait random extends StObject {
      
      def getBytesSync(count: Double): Bytes
    }
    object random {
      
      inline def apply(getBytesSync: Double => Bytes): typings.nodeForge.mod.kem.rsa.random = {
        val __obj = js.Dynamic.literal(getBytesSync = js.Any.fromFunction1(getBytesSync))
        __obj.asInstanceOf[typings.nodeForge.mod.kem.rsa.random]
      }
      
      extension [Self <: typings.nodeForge.mod.kem.rsa.random](x: Self) {
        
        inline def setGetBytesSync(value: Double => Bytes): Self = StObject.set(x, "getBytesSync", js.Any.fromFunction1(value))
      }
    }
  }
  
  trait EncryptResult extends StObject {
    
    /**
      * The ciphertext for generating the secret key, as a binary-encoded string of bytes.
      */
    var encapsulation: String
    
    /**
      * The secret key to use for encrypting a message.
      */
    var key: String
  }
  object EncryptResult {
    
    inline def apply(encapsulation: String, key: String): EncryptResult = {
      val __obj = js.Dynamic.literal(encapsulation = encapsulation.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncryptResult]
    }
    
    extension [Self <: EncryptResult](x: Self) {
      
      inline def setEncapsulation(value: String): Self = StObject.set(x, "encapsulation", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait KDF extends StObject {
    
    /**
      * Generate a key of the specified length.
      *
      * @param x the binary-encoded byte string to generate a key from.
      * @param length the number of bytes to generate (the size of the key).
      *
      * @return the key as a binary-encoded string.
      */
    def generate(x: String, length: Double): String
  }
  object KDF {
    
    inline def apply(generate: (String, Double) => String): KDF = {
      val __obj = js.Dynamic.literal(generate = js.Any.fromFunction2(generate))
      __obj.asInstanceOf[KDF]
    }
    
    extension [Self <: KDF](x: Self) {
      
      inline def setGenerate(value: (String, Double) => String): Self = StObject.set(x, "generate", js.Any.fromFunction2(value))
    }
  }
}
