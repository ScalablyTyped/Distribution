package typings.nextgenEvents

import org.scalablytyped.runtime.StringDictionary
import typings.nextgenEvents.anon.Ack
import typings.nextgenEvents.anon.Async
import typings.nextgenEvents.nextgenEventsNumbers.`0`
import typings.nextgenEvents.nextgenEventsNumbers.`1`
import typings.nextgenEvents.nextgenEventsNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nextgen-events", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with NextGenEvents
  @JSImport("nextgen-events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("nextgen-events", "CONTEXT_DISABLED")
  @js.native
  val CONTEXT_DISABLED: `1` = js.native
  
  /* static member */
  @JSImport("nextgen-events", "CONTEXT_ENABLED")
  @js.native
  val CONTEXT_ENABLED: `0` = js.native
  
  /* static member */
  @JSImport("nextgen-events", "CONTEXT_QUEUED")
  @js.native
  val CONTEXT_QUEUED: `2` = js.native
  
  @JSImport("nextgen-events", "DESYNC")
  @js.native
  val DESYNC: Double = js.native
  
  @JSImport("nextgen-events", "Internal")
  @js.native
  class Internal () extends StObject {
    def this(from: NextGenEvents) = this()
    
    var contexts: StringDictionary[Context] = js.native
    
    var depth: Double = js.native
    
    def desync(fn: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Unit = js.native
    
    var interruptible: Boolean = js.native
    
    var listeners: Listeners = js.native
    
    var maxListeners: Double = js.native
    
    var nice: Double = js.native
    
    var stateGroups: StringDictionary[js.Any] = js.native
    
    var states: States = js.native
  }
  
  @JSImport("nextgen-events", "Proxy")
  @js.native
  class Proxy () extends StObject {
    
    def addLocalService(name: String, heartBeatEmitter: js.Any, options: Ack): Unit = js.native
    
    def addRemoteService(name: String): Unit = js.native
    
    def destroy(): js.Any = js.native
    
    def push(data: js.Any): Unit = js.native
    
    def receive(raw: js.Any): Unit = js.native
    
    var remoteServices: StringDictionary[NextGenEvents] = js.native
    
    def send(message: js.Any): Unit = js.native
  }
  
  @JSImport("nextgen-events", "SYNC")
  @js.native
  val SYNC: Double = js.native
  
  @JSImport("nextgen-events", "defaultMaxListeners")
  @js.native
  val defaultMaxListeners: Double = js.native
  
  /* static member */
  inline def emitCallback(event: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("emitCallback")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* static member */
  inline def emitEvent(event: Event): Event = ^.asInstanceOf[js.Dynamic].applyDynamic("emitEvent")(event.asInstanceOf[js.Any]).asInstanceOf[Event]
  
  /* static member */
  inline def emitToOneListener(event: Event, listener: js.Any, removedListeners: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("emitToOneListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], removedListeners.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def filterOutCallback(what: js.Any, currentElement: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOutCallback")(what.asInstanceOf[js.Any], currentElement.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def getContextScope(context: Context, scopeName: String): Scope = (^.asInstanceOf[js.Dynamic].applyDynamic("getContextScope")(context.asInstanceOf[js.Any], scopeName.asInstanceOf[js.Any])).asInstanceOf[Scope]
  
  /* static member */
  inline def groupAddListener(emitters: js.Array[NextGenEvents], eventName: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("groupAddListener")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def groupAddListener(emitters: js.Array[NextGenEvents], eventName: String, fn: Unit, options: AddListenerOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("groupAddListener")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def groupAddListener(emitters: js.Array[NextGenEvents], eventName: String, fn: Func): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("groupAddListener")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def groupAddListener(emitters: js.Array[NextGenEvents], eventName: String, fn: Func, options: AddListenerOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("groupAddListener")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /* static member */
  inline def groupDefineStates(emitters: js.Array[NextGenEvents], args: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupDefineStates")(emitters.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def groupEmit(emitters: js.Array[NextGenEvents], nice: Double, args: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupEmit")(emitters.asInstanceOf[js.Any], nice.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def groupEmit(emitters: js.Array[NextGenEvents], nice: Unit, args: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupEmit")(emitters.asInstanceOf[js.Any], nice.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def groupGlobalOnce(emitters: js.Array[NextGenEvents], eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupGlobalOnce")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def groupGlobalOnce(emitters: js.Array[NextGenEvents], eventName: String, fn: Unit, options: AddListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupGlobalOnce")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def groupGlobalOnce(emitters: js.Array[NextGenEvents], eventName: String, fn: Func): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupGlobalOnce")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def groupGlobalOnce(emitters: js.Array[NextGenEvents], eventName: String, fn: Func, options: AddListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupGlobalOnce")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def groupGlobalOnceAll(emitters: js.Array[NextGenEvents], eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupGlobalOnceAll")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def groupGlobalOnceAll(emitters: js.Array[NextGenEvents], eventName: String, fn: Unit, options: AddListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupGlobalOnceAll")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def groupGlobalOnceAll(emitters: js.Array[NextGenEvents], eventName: String, fn: Func): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupGlobalOnceAll")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def groupGlobalOnceAll(emitters: js.Array[NextGenEvents], eventName: String, fn: Func, options: AddListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupGlobalOnceAll")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def groupOn(emitters: js.Array[NextGenEvents], eventName: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("groupOn")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def groupOn(emitters: js.Array[NextGenEvents], eventName: String, fn: Unit, options: AddListenerOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("groupOn")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def groupOn(emitters: js.Array[NextGenEvents], eventName: String, fn: Func): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("groupOn")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def groupOn(emitters: js.Array[NextGenEvents], eventName: String, fn: Func, options: AddListenerOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("groupOn")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /* static member */
  inline def groupOnce(emitters: js.Array[NextGenEvents], eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupOnce")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def groupOnce(emitters: js.Array[NextGenEvents], eventName: String, fn: Unit, options: AddListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupOnce")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def groupOnce(emitters: js.Array[NextGenEvents], eventName: String, fn: Func): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupOnce")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def groupOnce(emitters: js.Array[NextGenEvents], eventName: String, fn: Func, options: AddListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupOnce")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def groupOnceFirst(emitters: js.Array[NextGenEvents], eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupOnceFirst")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def groupOnceFirst(emitters: js.Array[NextGenEvents], eventName: String, fn: Unit, options: AddListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupOnceFirst")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def groupOnceFirst(emitters: js.Array[NextGenEvents], eventName: String, fn: Func): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupOnceFirst")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def groupOnceFirst(emitters: js.Array[NextGenEvents], eventName: String, fn: Func, options: AddListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupOnceFirst")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def groupOnceLast(emitters: js.Array[NextGenEvents], eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupOnceLast")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def groupOnceLast(emitters: js.Array[NextGenEvents], eventName: String, fn: Unit, options: AddListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupOnceLast")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def groupOnceLast(emitters: js.Array[NextGenEvents], eventName: String, fn: Func): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupOnceLast")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def groupOnceLast(emitters: js.Array[NextGenEvents], eventName: String, fn: Func, options: AddListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupOnceLast")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def groupRemoveAllListeners(emitters: js.Array[NextGenEvents], eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupRemoveAllListeners")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def groupRemoveListener(emitters: js.Array[NextGenEvents], eventName: String, id: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupRemoveListener")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def groupWaitFor(emitters: js.Array[NextGenEvents], eventName: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupWaitFor")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /* static member */
  inline def groupWaitForAll(emitters: js.Array[NextGenEvents], eventName: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupWaitForAll")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /* static member */
  inline def groupWaitForEmit(emitters: js.Array[NextGenEvents], nice: Double, args: js.Any*): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupWaitForEmit")(emitters.asInstanceOf[js.Any], nice.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def groupWaitForEmit(emitters: js.Array[NextGenEvents], nice: Unit, args: js.Any*): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupWaitForEmit")(emitters.asInstanceOf[js.Any], nice.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /* static member */
  inline def groupWaitForFirst(emitters: js.Array[NextGenEvents], eventName: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupWaitForFirst")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /* static member */
  inline def groupWaitForFirstAll(emitters: js.Array[NextGenEvents], eventName: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupWaitForFirstAll")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /* static member */
  inline def groupWaitForLast(emitters: js.Array[NextGenEvents], eventName: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupWaitForLast")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /* static member */
  inline def groupWaitForLastAll(emitters: js.Array[NextGenEvents], eventName: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupWaitForLastAll")(emitters.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /* static member */
  inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
  
  /* static member */
  inline def initFrom(from: NextGenEvents): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initFrom")(from.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* static member */
  inline def listenerCount(emitter: NextGenEvents, eventName: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("listenerCount")(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def listenerWrapper(listener: js.Any, event: js.Any, contextScope: String, serial: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("listenerWrapper")(listener.asInstanceOf[js.Any], event.asInstanceOf[js.Any], contextScope.asInstanceOf[js.Any], serial.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def mergeListeners(foreigners: Listeners): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeListeners")(foreigners.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* static member */
  inline def noop(args: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* static member */
  inline def processScopeQueue(self: NextGenEvents, contextScope: Scope, serial: Boolean, isCompletionCallback: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("processScopeQueue")(self.asInstanceOf[js.Any], contextScope.asInstanceOf[js.Any], serial.asInstanceOf[js.Any], isCompletionCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def reset(emitter: NextGenEvents): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(emitter.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* static member */
  inline def share(source: NextGenEvents, target: NextGenEvents): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("share")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type AddListenerOptions = Boolean | Async
  
  trait Context extends StObject {
    
    var nice: Double
    
    var ready: Boolean
    
    var scopes: StringDictionary[js.Any]
    
    var serial: Boolean
    
    var status: js.Any
  }
  object Context {
    
    inline def apply(nice: Double, ready: Boolean, scopes: StringDictionary[js.Any], serial: Boolean, status: js.Any): Context = {
      val __obj = js.Dynamic.literal(nice = nice.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setNice(value: Double): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
      
      inline def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      inline def setScopes(value: StringDictionary[js.Any]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setSerial(value: Boolean): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: js.Any): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContextOptions extends StObject {
    
    var nice: js.UndefOr[Double] = js.undefined
    
    var ready: Boolean
    
    var scopes: StringDictionary[Scope]
    
    var serial: js.UndefOr[js.Any] = js.undefined
    
    var status: js.UndefOr[js.Any] = js.undefined
  }
  object ContextOptions {
    
    inline def apply(ready: Boolean, scopes: StringDictionary[Scope]): ContextOptions = {
      val __obj = js.Dynamic.literal(ready = ready.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextOptions]
    }
    
    extension [Self <: ContextOptions](x: Self) {
      
      inline def setNice(value: Double): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
      
      inline def setNiceUndefined: Self = StObject.set(x, "nice", js.undefined)
      
      inline def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      inline def setScopes(value: StringDictionary[Scope]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setSerial(value: js.Any): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
      
      inline def setSerialUndefined: Self = StObject.set(x, "serial", js.undefined)
      
      inline def setStatus(value: js.Any): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  trait Event extends StObject {
    
    var args: js.Any
    
    def callback(interrupt: js.Any): js.Any
    
    var emitter: NextGenEvents
    
    var interrupt: Null
    
    var mice: Double
    
    var name: String
    
    var sync: Boolean
  }
  object Event {
    
    inline def apply(
      args: js.Any,
      callback: js.Any => js.Any,
      emitter: NextGenEvents,
      interrupt: Null,
      mice: Double,
      name: String,
      sync: Boolean
    ): Event = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], callback = js.Any.fromFunction1(callback), emitter = emitter.asInstanceOf[js.Any], interrupt = interrupt.asInstanceOf[js.Any], mice = mice.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    extension [Self <: Event](x: Self) {
      
      inline def setArgs(value: js.Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setCallback(value: js.Any => js.Any): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setEmitter(value: NextGenEvents): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
      
      inline def setInterrupt(value: Null): Self = StObject.set(x, "interrupt", value.asInstanceOf[js.Any])
      
      inline def setMice(value: Double): Self = StObject.set(x, "mice", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Func extends StObject {
    
    def apply(args: js.Any*): js.Any = js.native
  }
  
  trait Listeners extends StObject {
    
    var error: js.Array[Func]
    
    var interrupt: js.Array[Func]
    
    var newListener: js.Array[Func]
    
    var removeListener: js.Array[Func]
  }
  object Listeners {
    
    inline def apply(
      error: js.Array[Func],
      interrupt: js.Array[Func],
      newListener: js.Array[Func],
      removeListener: js.Array[Func]
    ): Listeners = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], interrupt = interrupt.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any], removeListener = removeListener.asInstanceOf[js.Any])
      __obj.asInstanceOf[Listeners]
    }
    
    extension [Self <: Listeners](x: Self) {
      
      inline def setError(value: js.Array[Func]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorVarargs(value: Func*): Self = StObject.set(x, "error", js.Array(value :_*))
      
      inline def setInterrupt(value: js.Array[Func]): Self = StObject.set(x, "interrupt", value.asInstanceOf[js.Any])
      
      inline def setInterruptVarargs(value: Func*): Self = StObject.set(x, "interrupt", js.Array(value :_*))
      
      inline def setNewListener(value: js.Array[Func]): Self = StObject.set(x, "newListener", value.asInstanceOf[js.Any])
      
      inline def setNewListenerVarargs(value: Func*): Self = StObject.set(x, "newListener", js.Array(value :_*))
      
      inline def setRemoveListener(value: js.Array[Func]): Self = StObject.set(x, "removeListener", value.asInstanceOf[js.Any])
      
      inline def setRemoveListenerVarargs(value: Func*): Self = StObject.set(x, "removeListener", js.Array(value :_*))
    }
  }
  
  @js.native
  trait NextGenEvents extends StObject {
    
    def addListener(eventName: String): this.type = js.native
    def addListener(eventName: String, fn: js.Any): this.type = js.native
    def addListener(eventName: String, fn: js.Any, options: AddListenerOptions): this.type = js.native
    def addListener(eventName: String, fn: Unit, options: AddListenerOptions): this.type = js.native
    
    def addListenerContext(contextName: String, options: ContextOptions): this.type = js.native
    
    def defineStates(states: js.Any*): Unit = js.native
    
    def destroyListenerContext(contextName: String): this.type = js.native
    
    def desyncUseNextTick(useNextTick: Boolean): Unit = js.native
    
    def disableListenerContext(contextName: String): this.type = js.native
    
    def emit(name: String, args: js.Any*): Event = js.native
    def emit(nice: Double, name: String, args: js.Any*): Event = js.native
    
    def enableListenerContext(contextName: String): this.type = js.native
    
    def getAllStates(): States = js.native
    
    def getMaxListeners(): Double = js.native
    
    def hasState(state: String): Boolean = js.native
    
    def listenerCount(eventName: String): Double = js.native
    
    def listeners(eventName: String): js.Array[Func] = js.native
    
    def off(eventName: String, id: js.Any): this.type = js.native
    
    def on(eventName: String): this.type = js.native
    def on(eventName: String, fn: js.Any): this.type = js.native
    def on(eventName: String, fn: js.Any, options: AddListenerOptions): this.type = js.native
    def on(eventName: String, fn: Unit, options: AddListenerOptions): this.type = js.native
    
    def once(eventName: String): this.type = js.native
    def once(eventName: String, fn: js.Any): this.type = js.native
    def once(eventName: String, fn: js.Any, options: AddListenerOptions): this.type = js.native
    def once(eventName: String, fn: Unit, options: AddListenerOptions): this.type = js.native
    
    def queueListenerContext(contextName: String): this.type = js.native
    
    def removeAllListeners(eventName: String): this.type = js.native
    
    def removeListener(eventName: String, id: js.Any): this.type = js.native
    
    def serializeListenerContext(contextName: String): this.type = js.native
    def serializeListenerContext(contextName: String, value: Boolean): this.type = js.native
    
    def setInterruptible(isInterruptible: Boolean): Unit = js.native
    
    def setListenerContextNice(contextName: String, nice: Double): this.type = js.native
    
    def setMaxListeners(n: Double): this.type = js.native
    
    def setNice(nice: Double): Unit = js.native
    
    def waitFor(eventName: String): js.Promise[this.type] = js.native
    
    def waitForAll(eventName: String): js.Promise[this.type] = js.native
    
    def waitForEmit(name: String, args: js.Any*): js.Promise[js.Any] = js.native
    def waitForEmit(nice: Double, name: String, args: js.Any*): js.Promise[js.Any] = js.native
  }
  
  trait Scope extends StObject {
    
    var queue: js.Array[js.Any]
    
    var ready: Boolean
  }
  object Scope {
    
    inline def apply(queue: js.Array[js.Any], ready: Boolean): Scope = {
      val __obj = js.Dynamic.literal(queue = queue.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scope]
    }
    
    extension [Self <: Scope](x: Self) {
      
      inline def setQueue(value: js.Array[js.Any]): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      inline def setQueueVarargs(value: js.Any*): Self = StObject.set(x, "queue", js.Array(value :_*))
      
      inline def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    }
  }
  
  type States = StringDictionary[js.Any]
}
