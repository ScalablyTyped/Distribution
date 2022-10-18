package typings.node.cryptoMod

import typings.node.NodeJS.ArrayBufferView
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<node.crypto.DiffieHellman, 'setPublicKey' | 'setPrivateKey'> */
trait DiffieHellmanGroup extends StObject {
  
  def computeSecret(otherPublicKey: ArrayBufferView): Buffer
  @JSName("computeSecret")
  var computeSecret_Original: js.Function3[
    /* otherPublicKey */ ArrayBufferView, 
    /* inputEncoding */ js.UndefOr[Null], 
    /* outputEncoding */ js.UndefOr[Null], 
    Buffer
  ]
  
  @JSName("constructor")
  var constructor_Original: js.Function0[Any]
  
  def generateKeys(): Buffer
  @JSName("generateKeys")
  var generateKeys_Original: js.Function0[Buffer]
  
  def getGenerator(): Buffer
  @JSName("getGenerator")
  var getGenerator_Original: js.Function0[Buffer]
  
  def getPrime(): Buffer
  @JSName("getPrime")
  var getPrime_Original: js.Function0[Buffer]
  
  def getPrivateKey(): Buffer
  @JSName("getPrivateKey")
  var getPrivateKey_Original: js.Function0[Buffer]
  
  def getPublicKey(): Buffer
  @JSName("getPublicKey")
  var getPublicKey_Original: js.Function0[Buffer]
  
  var verifyError: Double
}
object DiffieHellmanGroup {
  
  /**
    * The `DiffieHellmanGroup` class takes a well-known modp group as its argument.
    * It works the same as `DiffieHellman`, except that it does not allow changing its keys after creation.
    * In other words, it does not implement `setPublicKey()` or `setPrivateKey()` methods.
    *
    * ```js
    * const { createDiffieHellmanGroup } = await import('node:crypto');
    * const dh = createDiffieHellmanGroup('modp1');
    * ```
    * The name (e.g. `'modp1'`) is taken from [RFC 2412](https://www.rfc-editor.org/rfc/rfc2412.txt) (modp1 and 2) and [RFC 3526](https://www.rfc-editor.org/rfc/rfc3526.txt):
    * ```bash
    * $ perl -ne 'print "$1\n" if /"(modp\d+)"/' src/node_crypto_groups.h
    * modp1  #  768 bits
    * modp2  # 1024 bits
    * modp5  # 1536 bits
    * modp14 # 2048 bits
    * modp15 # etc.
    * modp16
    * modp17
    * modp18
    * ```
    * @since v0.7.5
    */
  @JSImport("crypto", "DiffieHellmanGroup")
  @js.native
  val ^ : DiffieHellmanGroupConstructor = js.native
  
  extension [Self <: DiffieHellmanGroup](x: Self) {
    
    inline def setComputeSecret(
      value: (/* otherPublicKey */ ArrayBufferView, /* inputEncoding */ js.UndefOr[Null], /* outputEncoding */ js.UndefOr[Null]) => Buffer
    ): Self = StObject.set(x, "computeSecret", js.Any.fromFunction3(value))
    
    inline def setConstructor(value: () => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction0(value))
    
    inline def setGenerateKeys(value: () => Buffer): Self = StObject.set(x, "generateKeys", js.Any.fromFunction0(value))
    
    inline def setGetGenerator(value: () => Buffer): Self = StObject.set(x, "getGenerator", js.Any.fromFunction0(value))
    
    inline def setGetPrime(value: () => Buffer): Self = StObject.set(x, "getPrime", js.Any.fromFunction0(value))
    
    inline def setGetPrivateKey(value: () => Buffer): Self = StObject.set(x, "getPrivateKey", js.Any.fromFunction0(value))
    
    inline def setGetPublicKey(value: () => Buffer): Self = StObject.set(x, "getPublicKey", js.Any.fromFunction0(value))
    
    inline def setVerifyError(value: Double): Self = StObject.set(x, "verifyError", value.asInstanceOf[js.Any])
  }
}
