package typings.nats

import typings.nats.anon.Duration
import typings.nats.queuedIteratorMod.QueuedIterator
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("nats/lib/nats-base-client/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("nats/lib/nats-base-client/util", "CR")
  @js.native
  val CR: Double = js.native
  
  @JSImport("nats/lib/nats-base-client/util", "CRLF")
  @js.native
  val CRLF: js.typedarray.Uint8Array = js.native
  
  @JSImport("nats/lib/nats-base-client/util", "CR_LF")
  @js.native
  val CR_LF: /* "\r\n" */ String = js.native
  
  @JSImport("nats/lib/nats-base-client/util", "CR_LF_LEN")
  @js.native
  val CR_LF_LEN: Double = js.native
  
  @JSImport("nats/lib/nats-base-client/util", "LF")
  @js.native
  val LF: Double = js.native
  
  @JSImport("nats/lib/nats-base-client/util", "Perf")
  @js.native
  open class Perf () extends StObject {
    
    def getEntries(): js.Array[Duration] = js.native
    
    def mark(key: String): Unit = js.native
    
    def measure(key: String, startKey: String, endKey: String): Unit = js.native
    
    var measures: Map[String, Double] = js.native
    
    var timers: Map[String, Double] = js.native
  }
  
  inline def collect[T](iter: QueuedIterator[T]): js.Promise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("collect")(iter.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[T]]]
  
  inline def deferred[T](): Deferred_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("deferred")().asInstanceOf[Deferred_[T]]
  
  inline def delay(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")().asInstanceOf[js.Promise[Unit]]
  inline def delay(ms: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(ms.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def extend(a: Any, b: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(List(a.asInstanceOf[js.Any]).`++`(b.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  inline def extractProtocolMessage(a: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractProtocolMessage")(a.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isUint8Array(a: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUint8Array")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def protoLen(ba: js.typedarray.Uint8Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("protoLen")(ba.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def render(frame: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(frame.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def shuffle[T](a: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def timeout[T](ms: Double): Timeout_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(ms.asInstanceOf[js.Any]).asInstanceOf[Timeout_[T]]
  
  @js.native
  trait Deferred_[T]
    extends js.Promise[T] {
    
    def reject(): Unit = js.native
    def reject(reason: Any): Unit = js.native
    
    def resolve(): Unit = js.native
    def resolve(value: T): Unit = js.native
    def resolve(value: js.Thenable[T]): Unit = js.native
  }
  
  trait Pending extends StObject {
    
    def close(): Unit
    
    var done: Boolean
    
    def err(err: js.Error): Unit
    
    var pending: Double
    
    def promise(): js.Promise[Any]
    
    var resolved: Boolean
    
    def write(c: Double): Unit
    
    def wrote(c: Double): Unit
  }
  object Pending {
    
    inline def apply(
      close: () => Unit,
      done: Boolean,
      err: js.Error => Unit,
      pending: Double,
      promise: () => js.Promise[Any],
      resolved: Boolean,
      write: Double => Unit,
      wrote: Double => Unit
    ): Pending = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), done = done.asInstanceOf[js.Any], err = js.Any.fromFunction1(err), pending = pending.asInstanceOf[js.Any], promise = js.Any.fromFunction0(promise), resolved = resolved.asInstanceOf[js.Any], write = js.Any.fromFunction1(write), wrote = js.Any.fromFunction1(wrote))
      __obj.asInstanceOf[Pending]
    }
    
    extension [Self <: Pending](x: Self) {
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setErr(value: js.Error => Unit): Self = StObject.set(x, "err", js.Any.fromFunction1(value))
      
      inline def setPending(value: Double): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setPromise(value: () => js.Promise[Any]): Self = StObject.set(x, "promise", js.Any.fromFunction0(value))
      
      inline def setResolved(value: Boolean): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: Double => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
      
      inline def setWrote(value: Double => Unit): Self = StObject.set(x, "wrote", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Timeout_[T]
    extends js.Promise[T] {
    
    def cancel(): Unit = js.native
  }
}
