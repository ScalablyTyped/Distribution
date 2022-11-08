package typings.noiseCurveEd

import typings.node.bufferMod.global.Buffer
import typings.noiseCurveEd.noiseCurveEdInts.`32`
import typings.noiseCurveEd.noiseCurveEdInts.`64`
import typings.noiseCurveEd.noiseCurveEdStrings.Ed25519
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("noise-curve-ed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("noise-curve-ed", "ALG")
  @js.native
  val ALG: Ed25519 = js.native
  
  @JSImport("noise-curve-ed", "DHLEN")
  @js.native
  val DHLEN: `32` = js.native
  
  @JSImport("noise-curve-ed", "PKLEN")
  @js.native
  val PKLEN: `32` = js.native
  
  @JSImport("noise-curve-ed", "SCALARLEN")
  @js.native
  val SCALARLEN: `32` = js.native
  
  @JSImport("noise-curve-ed", "SKLEN")
  @js.native
  val SKLEN: `64` = js.native
  
  inline def dh(publicKey: js.typedarray.Uint8Array, secretKey: SecretKey): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("dh")(publicKey.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def dh(publicKey: Buffer, secretKey: SecretKey): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("dh")(publicKey.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  
  inline def generateKeyPair(): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")().asInstanceOf[KeyPair]
  inline def generateKeyPair(privKey: js.typedarray.Uint8Array): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(privKey.asInstanceOf[js.Any]).asInstanceOf[KeyPair]
  inline def generateKeyPair(privKey: Buffer): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(privKey.asInstanceOf[js.Any]).asInstanceOf[KeyPair]
  
  @JSImport("noise-curve-ed", "name")
  @js.native
  val name: Ed25519 = js.native
  
  trait KeyPair extends StObject {
    
    var publicKey: Buffer | js.typedarray.Uint8Array
    
    var secretKey: Buffer | js.typedarray.Uint8Array
  }
  object KeyPair {
    
    inline def apply(publicKey: Buffer | js.typedarray.Uint8Array, secretKey: Buffer | js.typedarray.Uint8Array): KeyPair = {
      val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyPair]
    }
    
    extension [Self <: KeyPair](x: Self) {
      
      inline def setPublicKey(value: Buffer | js.typedarray.Uint8Array): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setSecretKey(value: Buffer | js.typedarray.Uint8Array): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait SecretKey extends StObject {
    
    var scalar: js.UndefOr[Buffer | js.typedarray.Uint8Array] = js.undefined
    
    var secretKey: Buffer | js.typedarray.Uint8Array
  }
  object SecretKey {
    
    inline def apply(secretKey: Buffer | js.typedarray.Uint8Array): SecretKey = {
      val __obj = js.Dynamic.literal(secretKey = secretKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecretKey]
    }
    
    extension [Self <: SecretKey](x: Self) {
      
      inline def setScalar(value: Buffer | js.typedarray.Uint8Array): Self = StObject.set(x, "scalar", value.asInstanceOf[js.Any])
      
      inline def setScalarUndefined: Self = StObject.set(x, "scalar", js.undefined)
      
      inline def setSecretKey(value: Buffer | js.typedarray.Uint8Array): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
    }
  }
}
