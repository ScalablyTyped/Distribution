package typings.node.cryptoMod

import typings.node.NodeJS.ArrayBufferView
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("crypto", "DiffieHellmanGroup")
@js.native
open class DiffieHellmanGroupCls protected ()
  extends StObject
     with DiffieHellmanGroup {
  def this(name: String) = this()
  
  /* CompleteClass */
  override def computeSecret(otherPublicKey: ArrayBufferView): Buffer = js.native
  /* CompleteClass */
  @JSName("computeSecret")
  var computeSecret_Original: js.Function3[
    /* otherPublicKey */ ArrayBufferView, 
    /* inputEncoding */ js.UndefOr[Null], 
    /* outputEncoding */ js.UndefOr[Null], 
    Buffer
  ] = js.native
  
  /* CompleteClass */
  @JSName("constructor")
  var constructor_Original: js.Function0[Any] = js.native
  
  /* CompleteClass */
  override def generateKeys(): Buffer = js.native
  /* CompleteClass */
  @JSName("generateKeys")
  var generateKeys_Original: js.Function0[Buffer] = js.native
  
  /* CompleteClass */
  override def getGenerator(): Buffer = js.native
  /* CompleteClass */
  @JSName("getGenerator")
  var getGenerator_Original: js.Function0[Buffer] = js.native
  
  /* CompleteClass */
  override def getPrime(): Buffer = js.native
  /* CompleteClass */
  @JSName("getPrime")
  var getPrime_Original: js.Function0[Buffer] = js.native
  
  /* CompleteClass */
  override def getPrivateKey(): Buffer = js.native
  /* CompleteClass */
  @JSName("getPrivateKey")
  var getPrivateKey_Original: js.Function0[Buffer] = js.native
  
  /* CompleteClass */
  override def getPublicKey(): Buffer = js.native
  /* CompleteClass */
  @JSName("getPublicKey")
  var getPublicKey_Original: js.Function0[Buffer] = js.native
  
  /* CompleteClass */
  var verifyError: Double = js.native
}
