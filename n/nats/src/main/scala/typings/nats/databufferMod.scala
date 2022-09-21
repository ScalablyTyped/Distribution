package typings.nats

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object databufferMod {
  
  @JSImport("nats/lib/nats-base-client/databuffer", "DataBuffer")
  @js.native
  open class DataBuffer () extends StObject {
    
    var buffers: js.Array[js.typedarray.Uint8Array] = js.native
    
    var byteLength: Double = js.native
    
    def drain(): js.typedarray.Uint8Array = js.native
    def drain(n: Double): js.typedarray.Uint8Array = js.native
    
    def fill(a: js.typedarray.Uint8Array, bufs: js.typedarray.Uint8Array*): Unit = js.native
    
    def length(): Double = js.native
    
    def pack(): Unit = js.native
    
    def peek(): js.typedarray.Uint8Array = js.native
    
    def reset(): Unit = js.native
    
    def size(): Double = js.native
  }
  /* static members */
  object DataBuffer {
    
    @JSImport("nats/lib/nats-base-client/databuffer", "DataBuffer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def concat(bufs: js.typedarray.Uint8Array*): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(bufs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def fromAscii(m: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAscii")(m.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def toAscii(a: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toAscii")(a.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
