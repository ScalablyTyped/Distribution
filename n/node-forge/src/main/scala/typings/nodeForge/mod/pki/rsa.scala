package typings.nodeForge.mod.pki

import typings.nodeForge.mod.Bytes
import typings.nodeForge.mod.jsbn.BigInteger
import typings.nodeForge.mod.md.MessageDigest
import typings.nodeForge.mod.pss.PSS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsa {
  
  @JSImport("node-forge", "pki.rsa")
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateKeyPair(): typings.nodeForge.mod.pki.rsa.KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")().asInstanceOf[typings.nodeForge.mod.pki.rsa.KeyPair]
  inline def generateKeyPair(bits: Double): typings.nodeForge.mod.pki.rsa.KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(bits.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.rsa.KeyPair]
  inline def generateKeyPair(bits: Double, e: Double): typings.nodeForge.mod.pki.rsa.KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(bits.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.rsa.KeyPair]
  inline def generateKeyPair(
    bits: Double,
    e: Double,
    callback: js.Function2[/* err */ js.Error, /* keypair */ typings.nodeForge.mod.pki.rsa.KeyPair, Unit]
  ): typings.nodeForge.mod.pki.rsa.KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(bits.asInstanceOf[js.Any], e.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.rsa.KeyPair]
  inline def generateKeyPair(
    bits: Double,
    e: Unit,
    callback: js.Function2[/* err */ js.Error, /* keypair */ typings.nodeForge.mod.pki.rsa.KeyPair, Unit]
  ): typings.nodeForge.mod.pki.rsa.KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(bits.asInstanceOf[js.Any], e.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.rsa.KeyPair]
  inline def generateKeyPair(bits: Unit, e: Double): typings.nodeForge.mod.pki.rsa.KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(bits.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.rsa.KeyPair]
  inline def generateKeyPair(
    bits: Unit,
    e: Double,
    callback: js.Function2[/* err */ js.Error, /* keypair */ typings.nodeForge.mod.pki.rsa.KeyPair, Unit]
  ): typings.nodeForge.mod.pki.rsa.KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(bits.asInstanceOf[js.Any], e.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.rsa.KeyPair]
  inline def generateKeyPair(
    bits: Unit,
    e: Unit,
    callback: js.Function2[/* err */ js.Error, /* keypair */ typings.nodeForge.mod.pki.rsa.KeyPair, Unit]
  ): typings.nodeForge.mod.pki.rsa.KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(bits.asInstanceOf[js.Any], e.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.rsa.KeyPair]
  inline def generateKeyPair(
    options: Unit,
    callback: js.Function2[/* err */ js.Error, /* keypair */ typings.nodeForge.mod.pki.rsa.KeyPair, Unit]
  ): typings.nodeForge.mod.pki.rsa.KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.rsa.KeyPair]
  inline def generateKeyPair(options: GenerateKeyPairOptions): typings.nodeForge.mod.pki.rsa.KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(options.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.pki.rsa.KeyPair]
  inline def generateKeyPair(
    options: GenerateKeyPairOptions,
    callback: js.Function2[/* err */ js.Error, /* keypair */ typings.nodeForge.mod.pki.rsa.KeyPair, Unit]
  ): typings.nodeForge.mod.pki.rsa.KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.rsa.KeyPair]
  
  inline def setPrivateKey(
    n: BigInteger,
    e: BigInteger,
    d: BigInteger,
    p: BigInteger,
    q: BigInteger,
    dP: BigInteger,
    dQ: BigInteger,
    qInv: BigInteger
  ): typings.nodeForge.mod.pki.rsa.PrivateKey = (^.asInstanceOf[js.Dynamic].applyDynamic("setPrivateKey")(n.asInstanceOf[js.Any], e.asInstanceOf[js.Any], d.asInstanceOf[js.Any], p.asInstanceOf[js.Any], q.asInstanceOf[js.Any], dP.asInstanceOf[js.Any], dQ.asInstanceOf[js.Any], qInv.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.rsa.PrivateKey]
  
  inline def setPublicKey(n: BigInteger, e: BigInteger): typings.nodeForge.mod.pki.rsa.PublicKey = (^.asInstanceOf[js.Dynamic].applyDynamic("setPublicKey")(n.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.pki.rsa.PublicKey]
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeForge.nodeForgeStrings.`RSAES-PKCS1-V1_5`
    - typings.nodeForge.nodeForgeStrings.`RSA-OAEP`
    - typings.nodeForge.nodeForgeStrings.RAW
    - typings.nodeForge.nodeForgeStrings.NONE
    - scala.Null
  */
  type EncryptionScheme = _EncryptionScheme | Null
  
  trait GenerateKeyPairOptions extends StObject {
    
    var algorithm: js.UndefOr[String] = js.undefined
    
    var bits: js.UndefOr[Double] = js.undefined
    
    var e: js.UndefOr[Double] = js.undefined
    
    var prng: js.UndefOr[Any] = js.undefined
    
    var workLoad: js.UndefOr[Double] = js.undefined
    
    var workerScript: js.UndefOr[String] = js.undefined
    
    var workers: js.UndefOr[Double] = js.undefined
  }
  object GenerateKeyPairOptions {
    
    inline def apply(): GenerateKeyPairOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerateKeyPairOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GenerateKeyPairOptions] (val x: Self) extends AnyVal {
      
      inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setBits(value: Double): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
      
      inline def setBitsUndefined: Self = StObject.set(x, "bits", js.undefined)
      
      inline def setE(value: Double): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      inline def setPrng(value: Any): Self = StObject.set(x, "prng", value.asInstanceOf[js.Any])
      
      inline def setPrngUndefined: Self = StObject.set(x, "prng", js.undefined)
      
      inline def setWorkLoad(value: Double): Self = StObject.set(x, "workLoad", value.asInstanceOf[js.Any])
      
      inline def setWorkLoadUndefined: Self = StObject.set(x, "workLoad", js.undefined)
      
      inline def setWorkerScript(value: String): Self = StObject.set(x, "workerScript", value.asInstanceOf[js.Any])
      
      inline def setWorkerScriptUndefined: Self = StObject.set(x, "workerScript", js.undefined)
      
      inline def setWorkers(value: Double): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
      
      inline def setWorkersUndefined: Self = StObject.set(x, "workers", js.undefined)
    }
  }
  
  trait KeyPair extends StObject {
    
    var privateKey: typings.nodeForge.mod.pki.rsa.PrivateKey
    
    var publicKey: typings.nodeForge.mod.pki.rsa.PublicKey
  }
  object KeyPair {
    
    inline def apply(
      privateKey: typings.nodeForge.mod.pki.rsa.PrivateKey,
      publicKey: typings.nodeForge.mod.pki.rsa.PublicKey
    ): typings.nodeForge.mod.pki.rsa.KeyPair = {
      val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nodeForge.mod.pki.rsa.KeyPair]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.nodeForge.mod.pki.rsa.KeyPair] (val x: Self) extends AnyVal {
      
      inline def setPrivateKey(value: typings.nodeForge.mod.pki.rsa.PrivateKey): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setPublicKey(value: typings.nodeForge.mod.pki.rsa.PublicKey): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PrivateKey extends StObject {
    
    var d: BigInteger = js.native
    
    var dP: BigInteger = js.native
    
    var dQ: BigInteger = js.native
    
    def decrypt(data: Bytes): Bytes = js.native
    def decrypt(data: Bytes, scheme: Unit, schemeOptions: Any): Bytes = js.native
    def decrypt(data: Bytes, scheme: EncryptionScheme): Bytes = js.native
    def decrypt(data: Bytes, scheme: EncryptionScheme, schemeOptions: Any): Bytes = js.native
    
    var e: BigInteger = js.native
    
    var n: BigInteger = js.native
    
    var p: BigInteger = js.native
    
    var q: BigInteger = js.native
    
    var qInv: BigInteger = js.native
    
    def sign(md: Bytes): Bytes = js.native
    def sign(md: Bytes, scheme: SignatureScheme): Bytes = js.native
    def sign(md: MessageDigest): Bytes = js.native
    def sign(md: MessageDigest, scheme: SignatureScheme): Bytes = js.native
  }
  
  @js.native
  trait PublicKey extends StObject {
    
    var e: BigInteger = js.native
    
    def encrypt(data: Bytes): Bytes = js.native
    def encrypt(data: Bytes, scheme: Unit, schemeOptions: Any): Bytes = js.native
    def encrypt(data: Bytes, scheme: EncryptionScheme): Bytes = js.native
    def encrypt(data: Bytes, scheme: EncryptionScheme, schemeOptions: Any): Bytes = js.native
    
    var n: BigInteger = js.native
    
    def verify(digest: Bytes, signature: Bytes): Boolean = js.native
    def verify(digest: Bytes, signature: Bytes, scheme: SignatureScheme): Boolean = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeForge.nodeForgeStrings.`RSASSA-PKCS1-V1_5`
    - typings.nodeForge.mod.pss.PSS
    - typings.nodeForge.nodeForgeStrings.NONE
    - scala.Null
  */
  type SignatureScheme = _SignatureScheme | PSS | Null
  
  trait _EncryptionScheme extends StObject
  
  trait _SignatureScheme extends StObject
}
