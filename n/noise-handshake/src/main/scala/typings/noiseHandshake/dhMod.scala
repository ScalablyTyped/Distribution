package typings.noiseHandshake

import typings.node.bufferMod.global.Buffer
import typings.noiseHandshake.anon.PickKeyPairsecretKey
import typings.noiseHandshake.noiseHandshakeInts.`32`
import typings.noiseHandshake.noiseHandshakeStrings.`25519`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dhMod {
  
  @JSImport("noise-handshake/dh", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("noise-handshake/dh", "ALG")
  @js.native
  val ALG: `25519` = js.native
  
  @JSImport("noise-handshake/dh", "DHLEN")
  @js.native
  val DHLEN: `32` = js.native
  
  @JSImport("noise-handshake/dh", "PKLEN")
  @js.native
  val PKLEN: `32` = js.native
  
  @JSImport("noise-handshake/dh", "SEEDLEN")
  @js.native
  val SEEDLEN: `32` = js.native
  
  @JSImport("noise-handshake/dh", "SKLEN")
  @js.native
  val SKLEN: `32` = js.native
  
  inline def dh(publicKey: js.typedarray.Uint8Array, secretKey: PickKeyPairsecretKey): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("dh")(publicKey.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def dh(publicKey: Buffer, secretKey: PickKeyPairsecretKey): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("dh")(publicKey.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  
  inline def generateKeyPair(): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")().asInstanceOf[KeyPair]
  inline def generateKeyPair(privateKey: js.typedarray.Uint8Array): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(privateKey.asInstanceOf[js.Any]).asInstanceOf[KeyPair]
  inline def generateKeyPair(privateKey: Buffer): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(privateKey.asInstanceOf[js.Any]).asInstanceOf[KeyPair]
  
  inline def generateSeedKeyPair(seed: js.typedarray.Uint8Array): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSeedKeyPair")(seed.asInstanceOf[js.Any]).asInstanceOf[KeyPair]
  inline def generateSeedKeyPair(seed: Buffer): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSeedKeyPair")(seed.asInstanceOf[js.Any]).asInstanceOf[KeyPair]
  
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
