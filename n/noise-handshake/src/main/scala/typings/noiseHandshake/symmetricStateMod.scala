package typings.noiseHandshake

import typings.node.bufferMod.global.Buffer
import typings.noiseHandshake.dhMod.KeyPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symmetricStateMod {
  
  @JSImport("noise-handshake/symmetric-state", JSImport.Namespace)
  @js.native
  open class ^ () extends SymmetricState {
    def this(options: Options) = this()
  }
  
  /* static member */
  @JSImport("noise-handshake/symmetric-state", "alg")
  @js.native
  val alg: String = js.native
  
  @js.native
  trait Curve extends StObject {
    
    var ALG: String = js.native
    
    var DHLEN: Double = js.native
    
    var PKLEN: Double = js.native
    
    var SKLEN: Double = js.native
    
    def dh(publicKey: js.typedarray.Uint8Array, keyPair: KeyPair): Buffer | js.typedarray.Uint8Array = js.native
    def dh(publicKey: Buffer, keyPair: KeyPair): Buffer | js.typedarray.Uint8Array = js.native
    
    def generateKeyPair(): KeyPair = js.native
    def generateKeyPair(privateKey: js.typedarray.Uint8Array): KeyPair = js.native
    def generateKeyPair(privateKey: Buffer): KeyPair = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * A `curve` module for performing Noise over other curves.
      */
    var curve: js.UndefOr[Curve] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCurve(value: Curve): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
      
      inline def setCurveUndefined: Self = StObject.set(x, "curve", js.undefined)
    }
  }
  
  @js.native
  trait SymmetricState
    extends typings.noiseHandshake.cipherMod.^ {
    
    val DH_ALG: String = js.native
    
    var chainingKey: Buffer | js.typedarray.Uint8Array | Null = js.native
    
    var curve: Curve | Null = js.native
    
    def decryptAndHash(ciphertext: String): Buffer | js.typedarray.Uint8Array = js.native
    def decryptAndHash(ciphertext: js.typedarray.Uint8Array): Buffer | js.typedarray.Uint8Array = js.native
    def decryptAndHash(ciphertext: Buffer): Buffer | js.typedarray.Uint8Array = js.native
    
    var digest: Buffer | js.typedarray.Uint8Array | Null = js.native
    
    def encryptAndHash(plaintext: String): Buffer | js.typedarray.Uint8Array = js.native
    def encryptAndHash(plaintext: js.typedarray.Uint8Array): Buffer | js.typedarray.Uint8Array = js.native
    def encryptAndHash(plaintext: Buffer): Buffer | js.typedarray.Uint8Array = js.native
    
    def getHandshakeHash(): Buffer | js.typedarray.Uint8Array = js.native
    def getHandshakeHash(out: js.typedarray.Uint8Array): Buffer | js.typedarray.Uint8Array = js.native
    def getHandshakeHash(out: Buffer): Buffer | js.typedarray.Uint8Array = js.native
    
    def mixHash(data: js.typedarray.Uint8Array): Unit = js.native
    def mixHash(data: Buffer): Unit = js.native
    
    def mixKey(remoteKey: js.typedarray.Uint8Array, localKey: KeyPair): Unit = js.native
    def mixKey(remoteKey: Buffer, localKey: KeyPair): Unit = js.native
    
    var offset: Double | Null = js.native
    
    def split(): js.Tuple2[Buffer | js.typedarray.Uint8Array, Buffer | js.typedarray.Uint8Array] = js.native
  }
}
