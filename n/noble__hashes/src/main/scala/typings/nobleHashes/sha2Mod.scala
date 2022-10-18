package typings.nobleHashes

import typings.nobleHashes.utilsMod.Hash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sha2Mod {
  
  /* note: abstract class */ @JSImport("@noble/hashes/_sha2", "SHA2")
  @js.native
  open class SHA2[T /* <: SHA2[T] */] protected () extends Hash[T] {
    def this(blockLen: Double, outputLen: Double, padOffset: Double, isLE: Boolean) = this()
    
    /* protected */ var buffer: js.typedarray.Uint8Array = js.native
    
    /* protected */ var destroyed: Boolean = js.native
    
    /* protected */ var finished: Boolean = js.native
    
    /* protected */ def get(): js.Array[Double] = js.native
    
    val isLE: Boolean = js.native
    
    /* protected */ var length: Double = js.native
    
    val padOffset: Double = js.native
    
    /* protected */ var pos: Double = js.native
    
    /* protected */ def process(buf: js.typedarray.DataView, offset: Double): Unit = js.native
    
    /* protected */ def roundClean(): Unit = js.native
    
    /* protected */ def set(args: Double*): Unit = js.native
    
    /* protected */ var view: js.typedarray.DataView = js.native
  }
}
