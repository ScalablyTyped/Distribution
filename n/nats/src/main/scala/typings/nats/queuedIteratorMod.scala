package typings.nats

import typings.nats.utilMod.Deferred_
import typings.std.AsyncIterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queuedIteratorMod {
  
  @JSImport("nats/lib/nats-base-client/queued_iterator", "QueuedIteratorImpl")
  @js.native
  open class QueuedIteratorImpl[T] ()
    extends StObject
       with QueuedIterator[T] {
    
    var _data: js.UndefOr[Any] = js.native
    
    var ctx: js.UndefOr[Any] = js.native
    
    var dispatchedFn: js.UndefOr[DispatchedFn[T]] = js.native
    
    /* protected */ var done: Boolean = js.native
    
    /* private */ var err: Any = js.native
    
    var filtered: Double = js.native
    
    var inflight: Double = js.native
    
    var ingestionFilterFn: js.UndefOr[IngestionFilterFn[T]] = js.native
    
    var iterClosed: Deferred_[Unit] = js.native
    
    def iterate(): AsyncIterableIterator[T] = js.native
    
    /* protected */ var noIterator: Boolean = js.native
    
    var pendingFiltered: Double = js.native
    
    var processed: Double = js.native
    
    var protocolFilterFn: js.UndefOr[ProtocolFilterFn[T]] = js.native
    
    /* CompleteClass */
    override def push(v: T): Unit = js.native
    
    var received: Double = js.native
    
    /* private */ var signal: Any = js.native
    
    /* private */ var yields: Any = js.native
  }
  
  type DispatchedFn[T] = js.Function1[/* data */ T | Null, Unit]
  
  trait Dispatcher[T] extends StObject {
    
    def push(v: T): Unit
  }
  object Dispatcher {
    
    inline def apply[T](push: T => Unit): Dispatcher[T] = {
      val __obj = js.Dynamic.literal(push = js.Any.fromFunction1(push))
      __obj.asInstanceOf[Dispatcher[T]]
    }
    
    extension [Self <: Dispatcher[?], T](x: Self & Dispatcher[T]) {
      
      inline def setPush(value: T => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    }
  }
  
  type IngestionFilterFn[T] = js.Function2[/* data */ T | Null, /* src */ js.UndefOr[Any], IngestionFilterFnResult]
  
  trait IngestionFilterFnResult extends StObject {
    
    var ingest: Boolean
    
    var protocol: Boolean
  }
  object IngestionFilterFnResult {
    
    inline def apply(ingest: Boolean, protocol: Boolean): IngestionFilterFnResult = {
      val __obj = js.Dynamic.literal(ingest = ingest.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[IngestionFilterFnResult]
    }
    
    extension [Self <: IngestionFilterFnResult](x: Self) {
      
      inline def setIngest(value: Boolean): Self = StObject.set(x, "ingest", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: Boolean): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    }
  }
  
  type ProtocolFilterFn[T] = js.Function1[/* data */ T | Null, Boolean]
  
  @js.native
  trait QueuedIterator[T]
    extends StObject
       with Dispatcher[T] {
    
    def getPending(): Double = js.native
    
    def getProcessed(): Double = js.native
    
    def getReceived(): Double = js.native
    
    def stop(): Unit = js.native
    def stop(err: js.Error): Unit = js.native
  }
}
