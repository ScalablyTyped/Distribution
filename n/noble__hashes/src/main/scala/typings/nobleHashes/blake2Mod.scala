package typings.nobleHashes

import typings.nobleHashes.utilsMod.Hash
import typings.nobleHashes.utilsMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blake2Mod {
  
  /* note: abstract class */ @JSImport("@noble/hashes/_blake2", "BLAKE2")
  @js.native
  open class BLAKE2[T /* <: BLAKE2[T] */] protected () extends Hash[T] {
    def this(blockLen: Double, outputLen: Double, opts: Unit, keyLen: Double, saltLen: Double, persLen: Double) = this()
    def this(
      blockLen: Double,
      outputLen: Double,
      opts: BlakeOpts,
      keyLen: Double,
      saltLen: Double,
      persLen: Double
    ) = this()
    
    /* protected */ var buffer: js.typedarray.Uint8Array = js.native
    
    /* protected */ var buffer32: js.typedarray.Uint32Array = js.native
    
    /* protected */ def compress(msg: js.typedarray.Uint32Array, offset: Double, isLast: Boolean): Unit = js.native
    
    /* protected */ var destroyed: Boolean = js.native
    
    /* protected */ var finished: Boolean = js.native
    
    /* protected */ def get(): js.Array[Double] = js.native
    
    /* protected */ var length: Double = js.native
    
    /* protected */ var pos: Double = js.native
    
    /* protected */ def set(args: Double*): Unit = js.native
  }
  
  @JSImport("@noble/hashes/_blake2", "SIGMA")
  @js.native
  val SIGMA: js.typedarray.Uint8Array = js.native
  
  trait BlakeOpts extends StObject {
    
    var dkLen: js.UndefOr[Double] = js.undefined
    
    var key: js.UndefOr[Input] = js.undefined
    
    var personalization: js.UndefOr[Input] = js.undefined
    
    var salt: js.UndefOr[Input] = js.undefined
  }
  object BlakeOpts {
    
    inline def apply(): BlakeOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlakeOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BlakeOpts] (val x: Self) extends AnyVal {
      
      inline def setDkLen(value: Double): Self = StObject.set(x, "dkLen", value.asInstanceOf[js.Any])
      
      inline def setDkLenUndefined: Self = StObject.set(x, "dkLen", js.undefined)
      
      inline def setKey(value: Input): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setPersonalization(value: Input): Self = StObject.set(x, "personalization", value.asInstanceOf[js.Any])
      
      inline def setPersonalizationUndefined: Self = StObject.set(x, "personalization", js.undefined)
      
      inline def setSalt(value: Input): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      inline def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
    }
  }
}
