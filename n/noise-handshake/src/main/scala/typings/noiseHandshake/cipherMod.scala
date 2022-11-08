package typings.noiseHandshake

import typings.node.bufferMod.global.Buffer
import typings.noiseHandshake.noiseHandshakeInts.`16`
import typings.noiseHandshake.noiseHandshakeInts.`32`
import typings.noiseHandshake.noiseHandshakeInts.`8`
import typings.noiseHandshake.noiseHandshakeStrings.ChaChaPoly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cipherMod {
  
  @JSImport("noise-handshake/cipher", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with CipherState {
    def this(key: js.typedarray.Uint8Array) = this()
    def this(key: Buffer) = this()
  }
  
  /* static member */
  @JSImport("noise-handshake/cipher", "KEYBYTES")
  @js.native
  val KEYBYTES: `32` = js.native
  
  /* static member */
  @JSImport("noise-handshake/cipher", "MACBYTES")
  @js.native
  val MACBYTES: `16` = js.native
  
  /* static member */
  @JSImport("noise-handshake/cipher", "NONCEBYTES")
  @js.native
  val NONCEBYTES: `8` = js.native
  
  @js.native
  trait CipherState extends StObject {
    
    val CIPHER_ALG: ChaChaPoly = js.native
    
    def _clear(): Unit = js.native
    
    def decrypt(ciphertext: String): Buffer | js.typedarray.Uint8Array = js.native
    def decrypt(ciphertext: String, additionalData: String): Buffer | js.typedarray.Uint8Array = js.native
    def decrypt(ciphertext: String, additionalData: js.typedarray.Uint8Array): Buffer | js.typedarray.Uint8Array = js.native
    def decrypt(ciphertext: String, additionalData: Buffer): Buffer | js.typedarray.Uint8Array = js.native
    def decrypt(ciphertext: js.typedarray.Uint8Array): Buffer | js.typedarray.Uint8Array = js.native
    def decrypt(ciphertext: js.typedarray.Uint8Array, additionalData: String): Buffer | js.typedarray.Uint8Array = js.native
    def decrypt(ciphertext: js.typedarray.Uint8Array, additionalData: js.typedarray.Uint8Array): Buffer | js.typedarray.Uint8Array = js.native
    def decrypt(ciphertext: js.typedarray.Uint8Array, additionalData: Buffer): Buffer | js.typedarray.Uint8Array = js.native
    def decrypt(ciphertext: Buffer): Buffer | js.typedarray.Uint8Array = js.native
    def decrypt(ciphertext: Buffer, additionalData: String): Buffer | js.typedarray.Uint8Array = js.native
    def decrypt(ciphertext: Buffer, additionalData: js.typedarray.Uint8Array): Buffer | js.typedarray.Uint8Array = js.native
    def decrypt(ciphertext: Buffer, additionalData: Buffer): Buffer | js.typedarray.Uint8Array = js.native
    
    def encrypt(plaintext: String): Buffer | js.typedarray.Uint8Array = js.native
    def encrypt(plaintext: String, additionalData: String): Buffer | js.typedarray.Uint8Array = js.native
    def encrypt(plaintext: String, additionalData: js.typedarray.Uint8Array): Buffer | js.typedarray.Uint8Array = js.native
    def encrypt(plaintext: String, additionalData: Buffer): Buffer | js.typedarray.Uint8Array = js.native
    def encrypt(plaintext: js.typedarray.Uint8Array): Buffer | js.typedarray.Uint8Array = js.native
    def encrypt(plaintext: js.typedarray.Uint8Array, additionalData: String): Buffer | js.typedarray.Uint8Array = js.native
    def encrypt(plaintext: js.typedarray.Uint8Array, additionalData: js.typedarray.Uint8Array): Buffer | js.typedarray.Uint8Array = js.native
    def encrypt(plaintext: js.typedarray.Uint8Array, additionalData: Buffer): Buffer | js.typedarray.Uint8Array = js.native
    def encrypt(plaintext: Buffer): Buffer | js.typedarray.Uint8Array = js.native
    def encrypt(plaintext: Buffer, additionalData: String): Buffer | js.typedarray.Uint8Array = js.native
    def encrypt(plaintext: Buffer, additionalData: js.typedarray.Uint8Array): Buffer | js.typedarray.Uint8Array = js.native
    def encrypt(plaintext: Buffer, additionalData: Buffer): Buffer | js.typedarray.Uint8Array = js.native
    
    def hasKey: Boolean = js.native
    
    def initialiseKey(key: js.typedarray.Uint8Array): Unit = js.native
    def initialiseKey(key: Buffer): Unit = js.native
    
    var key: Buffer | js.typedarray.Uint8Array | Null = js.native
    
    var nonce: Double | Null = js.native
    
    def setNonce(nonce: Double): Unit = js.native
  }
}
