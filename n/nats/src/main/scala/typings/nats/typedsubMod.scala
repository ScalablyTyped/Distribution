package typings.nats

import typings.nats.errorMod.NatsError
import typings.nats.queuedIteratorMod.DispatchedFn
import typings.nats.queuedIteratorMod.IngestionFilterFn
import typings.nats.queuedIteratorMod.IngestionFilterFnResult
import typings.nats.queuedIteratorMod.ProtocolFilterFn
import typings.nats.queuedIteratorMod.QueuedIteratorImpl
import typings.nats.subscriptionMod.SubscriptionImpl
import typings.nats.typesMod.Msg
import typings.nats.typesMod.NatsConnection
import typings.nats.typesMod.Sub
import typings.nats.typesMod.SubOpts
import typings.nats.typesMod.Subscription
import typings.nats.utilMod.Deferred_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typedsubMod {
  
  @JSImport("nats/lib/nats-base-client/typedsub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("nats/lib/nats-base-client/typedsub", "TypedSubscription")
  @js.native
  open class TypedSubscription[T] protected ()
    extends QueuedIteratorImpl[T]
       with Sub[T] {
    def this(nc: NatsConnection, subject: String, opts: TypedSubscriptionOptions[T]) = this()
    
    def adapter(err: Null, msg: Msg): js.Tuple2[NatsError | Null, T | Null] = js.native
    def adapter(err: NatsError, msg: Msg): js.Tuple2[NatsError | Null, T | Null] = js.native
    @JSName("adapter")
    var adapter_Original: MsgAdapter[T] = js.native
    
    @JSName("closed")
    def closed_MTypedSubscription: js.Promise[Unit] = js.native
    
    /* InferMemberOverrides */
    override def getPending(): Double = js.native
    
    /* InferMemberOverrides */
    override def getProcessed(): Double = js.native
    
    /* InferMemberOverrides */
    override def getReceived(): Double = js.native
    
    var sub: SubscriptionImpl = js.native
    
    var subIterDone: Deferred_[Unit] = js.native
  }
  
  inline def checkFn(fn: Any, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkFn")(fn.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkFn(fn: Any, name: String, required: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkFn")(fn.asInstanceOf[js.Any], name.asInstanceOf[js.Any], required.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type MsgAdapter[T] = js.Function2[/* err */ NatsError | Null, /* msg */ Msg, js.Tuple2[NatsError | Null, T | Null]]
  
  type TypedCallback[T] = js.Function2[/* err */ NatsError | Null, /* msg */ T | Null, Unit]
  
  trait TypedSubscriptionOptions[T]
    extends StObject
       with SubOpts[T] {
    
    def adapter(err: Null, msg: Msg): js.Tuple2[NatsError | Null, T | Null]
    def adapter(err: NatsError, msg: Msg): js.Tuple2[NatsError | Null, T | Null]
    @JSName("adapter")
    var adapter_Original: MsgAdapter[T]
    
    @JSName("callback")
    var callback_TypedSubscriptionOptions: js.UndefOr[TypedCallback[T]] = js.undefined
    
    var cleanupFn: js.UndefOr[js.Function2[/* sub */ Subscription, /* info */ js.UndefOr[Any], Unit]] = js.undefined
    
    var dispatchedFn: js.UndefOr[DispatchedFn[T]] = js.undefined
    
    var ingestionFilterFn: js.UndefOr[IngestionFilterFn[T]] = js.undefined
    
    var protocolFilterFn: js.UndefOr[ProtocolFilterFn[T]] = js.undefined
  }
  object TypedSubscriptionOptions {
    
    inline def apply[T](adapter: (/* err */ NatsError | Null, /* msg */ Msg) => js.Tuple2[NatsError | Null, T | Null]): TypedSubscriptionOptions[T] = {
      val __obj = js.Dynamic.literal(adapter = js.Any.fromFunction2(adapter))
      __obj.asInstanceOf[TypedSubscriptionOptions[T]]
    }
    
    extension [Self <: TypedSubscriptionOptions[?], T](x: Self & TypedSubscriptionOptions[T]) {
      
      inline def setAdapter(value: (/* err */ NatsError | Null, /* msg */ Msg) => js.Tuple2[NatsError | Null, T | Null]): Self = StObject.set(x, "adapter", js.Any.fromFunction2(value))
      
      inline def setCallback(value: (/* err */ NatsError | Null, /* msg */ T | Null) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setCleanupFn(value: (/* sub */ Subscription, /* info */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "cleanupFn", js.Any.fromFunction2(value))
      
      inline def setCleanupFnUndefined: Self = StObject.set(x, "cleanupFn", js.undefined)
      
      inline def setDispatchedFn(value: /* data */ T | Null => Unit): Self = StObject.set(x, "dispatchedFn", js.Any.fromFunction1(value))
      
      inline def setDispatchedFnUndefined: Self = StObject.set(x, "dispatchedFn", js.undefined)
      
      inline def setIngestionFilterFn(value: (/* data */ T | Null, /* src */ js.UndefOr[Any]) => IngestionFilterFnResult): Self = StObject.set(x, "ingestionFilterFn", js.Any.fromFunction2(value))
      
      inline def setIngestionFilterFnUndefined: Self = StObject.set(x, "ingestionFilterFn", js.undefined)
      
      inline def setProtocolFilterFn(value: /* data */ T | Null => Boolean): Self = StObject.set(x, "protocolFilterFn", js.Any.fromFunction1(value))
      
      inline def setProtocolFilterFnUndefined: Self = StObject.set(x, "protocolFilterFn", js.undefined)
    }
  }
}
