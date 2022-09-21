package typings.nats

import typings.nats.anon.Copy
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object denobufferMod {
  
  @JSImport("nats/lib/nats-base-client/denobuffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("nats/lib/nats-base-client/denobuffer", "AssertionError")
  @js.native
  open class AssertionError ()
    extends StObject
       with Error {
    def this(msg: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("nats/lib/nats-base-client/denobuffer", "DenoBuffer")
  @js.native
  open class DenoBuffer ()
    extends StObject
       with Reader
       with Writer {
    def this(ab: js.typedarray.ArrayBuffer) = this()
    
    var _buf: js.typedarray.Uint8Array = js.native
    
    def _grow(n: Double): Double = js.native
    
    var _off: Double = js.native
    
    def _reslice(len: Double): Unit = js.native
    
    def _tryGrowByReslice(n: Double): Double = js.native
    
    def bytes(): js.typedarray.Uint8Array = js.native
    def bytes(options: Copy): js.typedarray.Uint8Array = js.native
    
    def capacity: Double = js.native
    
    def empty(): Boolean = js.native
    
    def grow(n: Double): Unit = js.native
    
    def length: Double = js.native
    
    /* CompleteClass */
    override def read(p: js.typedarray.Uint8Array): Double | Null = js.native
    
    def readByte(): Double | Null = js.native
    
    def readFrom(r: Reader): Double = js.native
    
    def reset(): Unit = js.native
    
    def truncate(n: Double): Unit = js.native
    
    /* CompleteClass */
    override def write(p: js.typedarray.Uint8Array): Double = js.native
    
    def writeByte(n: Double): Double = js.native
    
    def writeString(s: String): Double = js.native
  }
  
  @JSImport("nats/lib/nats-base-client/denobuffer", "MAX_SIZE")
  @js.native
  val MAX_SIZE: Double = js.native
  
  inline def append(origin: js.typedarray.Uint8Array, b: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("append")(origin.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def assert(cond: Any): /* asserts cond */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("assert")(cond.asInstanceOf[js.Any]).asInstanceOf[/* asserts cond */ Boolean]
  inline def assert(cond: Any, msg: String): /* asserts cond */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(cond.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[/* asserts cond */ Boolean]
  
  inline def concat(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")().asInstanceOf[js.typedarray.Uint8Array]
  inline def concat(origin: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(origin.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def concat(origin: js.typedarray.Uint8Array, b: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(origin.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def concat(origin: Unit, b: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(origin.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def readAll(r: Reader): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("readAll")(r.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def writeAll(w: Writer, arr: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAll")(w.asInstanceOf[js.Any], arr.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Reader extends StObject {
    
    def read(p: js.typedarray.Uint8Array): Double | Null
  }
  object Reader {
    
    inline def apply(read: js.typedarray.Uint8Array => Double | Null): Reader = {
      val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read))
      __obj.asInstanceOf[Reader]
    }
    
    extension [Self <: Reader](x: Self) {
      
      inline def setRead(value: js.typedarray.Uint8Array => Double | Null): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
    }
  }
  
  trait Writer extends StObject {
    
    def write(p: js.typedarray.Uint8Array): Double
  }
  object Writer {
    
    inline def apply(write: js.typedarray.Uint8Array => Double): Writer = {
      val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[Writer]
    }
    
    extension [Self <: Writer](x: Self) {
      
      inline def setWrite(value: js.typedarray.Uint8Array => Double): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
}
