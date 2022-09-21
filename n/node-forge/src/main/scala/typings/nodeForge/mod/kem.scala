package typings.nodeForge.mod

import typings.nodeForge.mod.md.MessageDigest
import typings.nodeForge.mod.pki.rsa.PrivateKey
import typings.nodeForge.mod.pki.rsa.PublicKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kem {
  
  @JSImport("node-forge", "kem")
  @js.native
  val ^ : js.Any = js.native
  
  inline def decrypt(privateKey: PrivateKey, encapsulation: String, keyLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(privateKey.asInstanceOf[js.Any], encapsulation.asInstanceOf[js.Any], keyLength.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encrypt(publicKey: PublicKey, keyLength: Double): EncryptResult = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(publicKey.asInstanceOf[js.Any], keyLength.asInstanceOf[js.Any])).asInstanceOf[EncryptResult]
  
  @JSImport("node-forge", "kem.kdf1")
  @js.native
  open class kdf1 protected ()
    extends StObject
       with MessageDigest {
    def this(md: MessageDigest) = this()
    def this(md: MessageDigest, digestLength: Double) = this()
  }
  
  @JSImport("node-forge", "kem.kdf2")
  @js.native
  open class kdf2 protected ()
    extends StObject
       with MessageDigest {
    def this(md: MessageDigest) = this()
    def this(md: MessageDigest, digestLength: Double) = this()
  }
  
  object rsa {
    
    @JSImport("node-forge", "kem.rsa")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(kdf: MessageDigest): typings.nodeForge.mod.kem.rsa.kem = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(kdf.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.kem.rsa.kem]
    inline def create(kdf: MessageDigest, options: Options): typings.nodeForge.mod.kem.rsa.kem = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(kdf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.kem.rsa.kem]
    
    trait Options extends StObject {
      
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
      
      def decrypt(privateKey: PrivateKey, encapsulation: String, keyLength: Double): String
      
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
    
    var encapsulation: String
    
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
}
