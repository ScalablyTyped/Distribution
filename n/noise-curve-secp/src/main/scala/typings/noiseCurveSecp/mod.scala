package typings.noiseCurveSecp

import typings.node.bufferMod.global.Buffer
import typings.noiseCurveSecp.anon.PickKeyPairsecretKey
import typings.noiseCurveSecp.noiseCurveSecpInts.`32`
import typings.noiseCurveSecp.noiseCurveSecpInts.`33`
import typings.noiseCurveSecp.noiseCurveSecpStrings.secp256k1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("noise-curve-secp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("noise-curve-secp", "ALG")
  @js.native
  val ALG: secp256k1 = js.native
  
  @JSImport("noise-curve-secp", "DHLEN")
  @js.native
  val DHLEN: `32` = js.native
  
  @JSImport("noise-curve-secp", "PKLEN")
  @js.native
  val PKLEN: `33` = js.native
  
  @JSImport("noise-curve-secp", "SKLEN")
  @js.native
  val SKLEN: `32` = js.native
  
  inline def dh(publicKey: js.typedarray.Uint8Array, secretKey: PickKeyPairsecretKey): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("dh")(publicKey.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def dh(publicKey: Buffer, secretKey: PickKeyPairsecretKey): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("dh")(publicKey.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def generateKeyPair(): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")().asInstanceOf[KeyPair]
  inline def generateKeyPair(privKey: js.typedarray.Uint8Array): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(privKey.asInstanceOf[js.Any]).asInstanceOf[KeyPair]
  inline def generateKeyPair(privKey: Buffer): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(privKey.asInstanceOf[js.Any]).asInstanceOf[KeyPair]
  
  @JSImport("noise-curve-secp", "name")
  @js.native
  val name: secp256k1 = js.native
  
  trait KeyPair extends StObject {
    
    var publicKey: Buffer | js.typedarray.Uint8Array
    
    var secretKey: Buffer | js.typedarray.Uint8Array
  }
  object KeyPair {
    
    inline def apply(publicKey: Buffer | js.typedarray.Uint8Array, secretKey: Buffer | js.typedarray.Uint8Array): KeyPair = {
      val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyPair]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyPair] (val x: Self) extends AnyVal {
      
      inline def setPublicKey(value: Buffer | js.typedarray.Uint8Array): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setSecretKey(value: Buffer | js.typedarray.Uint8Array): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
    }
  }
}
