package typings.nextgenEvents

import org.scalablytyped.runtime.StringDictionary
import typings.nextgenEvents.anon.Ack
import typings.nextgenEvents.anon.Async
import typings.nextgenEvents.nextgenEventsNumbers.`0`
import typings.nextgenEvents.nextgenEventsNumbers.`1`
import typings.nextgenEvents.nextgenEventsNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nextgen-events", JSImport.Namespace)
  @js.native
  class ^ () extends NextGenEvents
  
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
  @JSImport("nextgen-events", "emitCallback")
  @js.native
  def emitCallback(event: Event): Unit = js.native
  
  /* static member */
  @JSImport("nextgen-events", "emitEvent")
  @js.native
  def emitEvent(event: Event): Event = js.native
  
  /* static member */
  @JSImport("nextgen-events", "emitToOneListener")
  @js.native
  def emitToOneListener(event: Event, listener: js.Any, removedListeners: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("nextgen-events", "filterOutCallback")
  @js.native
  def filterOutCallback(what: js.Any, currentElement: js.Any): Boolean = js.native
  
  /* static member */
  @JSImport("nextgen-events", "getContextScope")
  @js.native
  def getContextScope(context: Context, scopeName: String): Scope = js.native
  
  /* static member */
  @JSImport("nextgen-events", "groupAddListener")
  @js.native
  def groupAddListener(emitters: js.Array[NextGenEvents], eventName: String): js.Any = js.native
  @JSImport("nextgen-events", "groupAddListener")
  @js.native
  def groupAddListener(
    emitters: js.Array[NextGenEvents],
    eventName: String,
    fn: js.UndefOr[scala.Nothing],
    options: AddListenerOptions
  ): js.Any = js.native
  @JSImport("nextgen-events", "groupAddListener")
  @js.native
  def groupAddListener(emitters: js.Array[NextGenEvents], eventName: String, fn: Func): js.Any = js.native
  @JSImport("nextgen-events", "groupAddListener")
  @js.native
  def groupAddListener(emitters: js.Array[NextGenEvents], eventName: String, fn: Func, options: AddListenerOptions): js.Any = js.native
  
  /* static member */
  @JSImport("nextgen-events", "groupDefineStates")
  @js.native
  def groupDefineStates(emitters: js.Array[NextGenEvents], args: js.Any*): Unit = js.native
  
  @JSImport("nextgen-events", "groupEmit")
  @js.native
  def groupEmit(emitters: js.Array[NextGenEvents], nice: js.UndefOr[scala.Nothing], args: js.Any*): Unit = js.native
  /* static member */
  @JSImport("nextgen-events", "groupEmit")
  @js.native
  def groupEmit(emitters: js.Array[NextGenEvents], nice: Double, args: js.Any*): Unit = js.native
  
  /* static member */
  @JSImport("nextgen-events", "groupGlobalOnce")
  @js.native
  def groupGlobalOnce(emitters: js.Array[NextGenEvents], eventName: String): Unit = js.native
  @JSImport("nextgen-events", "groupGlobalOnce")
  @js.native
  def groupGlobalOnce(
    emitters: js.Array[NextGenEvents],
    eventName: String,
    fn: js.UndefOr[scala.Nothing],
    options: AddListenerOptions
  ): Unit = js.native
  @JSImport("nextgen-events", "groupGlobalOnce")
  @js.native
  def groupGlobalOnce(emitters: js.Array[NextGenEvents], eventName: String, fn: Func): Unit = js.native
  @JSImport("nextgen-events", "groupGlobalOnce")
  @js.native
  def groupGlobalOnce(emitters: js.Array[NextGenEvents], eventName: String, fn: Func, options: AddListenerOptions): Unit = js.native
  
  /* static member */
  @JSImport("nextgen-events", "groupGlobalOnceAll")
  @js.native
  def groupGlobalOnceAll(emitters: js.Array[NextGenEvents], eventName: String): Unit = js.native
  @JSImport("nextgen-events", "groupGlobalOnceAll")
  @js.native
  def groupGlobalOnceAll(
    emitters: js.Array[NextGenEvents],
    eventName: String,
    fn: js.UndefOr[scala.Nothing],
    options: AddListenerOptions
  ): Unit = js.native
  @JSImport("nextgen-events", "groupGlobalOnceAll")
  @js.native
  def groupGlobalOnceAll(emitters: js.Array[NextGenEvents], eventName: String, fn: Func): Unit = js.native
  @JSImport("nextgen-events", "groupGlobalOnceAll")
  @js.native
  def groupGlobalOnceAll(emitters: js.Array[NextGenEvents], eventName: String, fn: Func, options: AddListenerOptions): Unit = js.native
  
  /* static member */
  @JSImport("nextgen-events", "groupOn")
  @js.native
  def groupOn(emitters: js.Array[NextGenEvents], eventName: String): js.Any = js.native
  @JSImport("nextgen-events", "groupOn")
  @js.native
  def groupOn(
    emitters: js.Array[NextGenEvents],
    eventName: String,
    fn: js.UndefOr[scala.Nothing],
    options: AddListenerOptions
  ): js.Any = js.native
  @JSImport("nextgen-events", "groupOn")
  @js.native
  def groupOn(emitters: js.Array[NextGenEvents], eventName: String, fn: Func): js.Any = js.native
  @JSImport("nextgen-events", "groupOn")
  @js.native
  def groupOn(emitters: js.Array[NextGenEvents], eventName: String, fn: Func, options: AddListenerOptions): js.Any = js.native
  
  /* static member */
  @JSImport("nextgen-events", "groupOnce")
  @js.native
  def groupOnce(emitters: js.Array[NextGenEvents], eventName: String): Unit = js.native
  @JSImport("nextgen-events", "groupOnce")
  @js.native
  def groupOnce(
    emitters: js.Array[NextGenEvents],
    eventName: String,
    fn: js.UndefOr[scala.Nothing],
    options: AddListenerOptions
  ): Unit = js.native
  @JSImport("nextgen-events", "groupOnce")
  @js.native
  def groupOnce(emitters: js.Array[NextGenEvents], eventName: String, fn: Func): Unit = js.native
  @JSImport("nextgen-events", "groupOnce")
  @js.native
  def groupOnce(emitters: js.Array[NextGenEvents], eventName: String, fn: Func, options: AddListenerOptions): Unit = js.native
  
  /* static member */
  @JSImport("nextgen-events", "groupOnceFirst")
  @js.native
  def groupOnceFirst(emitters: js.Array[NextGenEvents], eventName: String): Unit = js.native
  @JSImport("nextgen-events", "groupOnceFirst")
  @js.native
  def groupOnceFirst(
    emitters: js.Array[NextGenEvents],
    eventName: String,
    fn: js.UndefOr[scala.Nothing],
    options: AddListenerOptions
  ): Unit = js.native
  @JSImport("nextgen-events", "groupOnceFirst")
  @js.native
  def groupOnceFirst(emitters: js.Array[NextGenEvents], eventName: String, fn: Func): Unit = js.native
  @JSImport("nextgen-events", "groupOnceFirst")
  @js.native
  def groupOnceFirst(emitters: js.Array[NextGenEvents], eventName: String, fn: Func, options: AddListenerOptions): Unit = js.native
  
  /* static member */
  @JSImport("nextgen-events", "groupOnceLast")
  @js.native
  def groupOnceLast(emitters: js.Array[NextGenEvents], eventName: String): Unit = js.native
  @JSImport("nextgen-events", "groupOnceLast")
  @js.native
  def groupOnceLast(
    emitters: js.Array[NextGenEvents],
    eventName: String,
    fn: js.UndefOr[scala.Nothing],
    options: AddListenerOptions
  ): Unit = js.native
  @JSImport("nextgen-events", "groupOnceLast")
  @js.native
  def groupOnceLast(emitters: js.Array[NextGenEvents], eventName: String, fn: Func): Unit = js.native
  @JSImport("nextgen-events", "groupOnceLast")
  @js.native
  def groupOnceLast(emitters: js.Array[NextGenEvents], eventName: String, fn: Func, options: AddListenerOptions): Unit = js.native
  
  /* static member */
  @JSImport("nextgen-events", "groupRemoveAllListeners")
  @js.native
  def groupRemoveAllListeners(emitters: js.Array[NextGenEvents], eventName: String): Unit = js.native
  
  /* static member */
  @JSImport("nextgen-events", "groupRemoveListener")
  @js.native
  def groupRemoveListener(emitters: js.Array[NextGenEvents], eventName: String, id: Double): Unit = js.native
  
  /* static member */
  @JSImport("nextgen-events", "groupWaitFor")
  @js.native
  def groupWaitFor(emitters: js.Array[NextGenEvents], eventName: String): js.Promise[Unit] = js.native
  
  /* static member */
  @JSImport("nextgen-events", "groupWaitForAll")
  @js.native
  def groupWaitForAll(emitters: js.Array[NextGenEvents], eventName: String): js.Promise[Unit] = js.native
  
  @JSImport("nextgen-events", "groupWaitForEmit")
  @js.native
  def groupWaitForEmit(emitters: js.Array[NextGenEvents], nice: js.UndefOr[scala.Nothing], args: js.Any*): js.Promise[Unit] = js.native
  /* static member */
  @JSImport("nextgen-events", "groupWaitForEmit")
  @js.native
  def groupWaitForEmit(emitters: js.Array[NextGenEvents], nice: Double, args: js.Any*): js.Promise[Unit] = js.native
  
  /* static member */
  @JSImport("nextgen-events", "groupWaitForFirst")
  @js.native
  def groupWaitForFirst(emitters: js.Array[NextGenEvents], eventName: String): js.Promise[Unit] = js.native
  
  /* static member */
  @JSImport("nextgen-events", "groupWaitForFirstAll")
  @js.native
  def groupWaitForFirstAll(emitters: js.Array[NextGenEvents], eventName: String): js.Promise[Unit] = js.native
  
  /* static member */
  @JSImport("nextgen-events", "groupWaitForLast")
  @js.native
  def groupWaitForLast(emitters: js.Array[NextGenEvents], eventName: String): js.Promise[Unit] = js.native
  
  /* static member */
  @JSImport("nextgen-events", "groupWaitForLastAll")
  @js.native
  def groupWaitForLastAll(emitters: js.Array[NextGenEvents], eventName: String): js.Promise[Unit] = js.native
  
  /* static member */
  @JSImport("nextgen-events", "init")
  @js.native
  def init(): Unit = js.native
  
  /* static member */
  @JSImport("nextgen-events", "initFrom")
  @js.native
  def initFrom(from: NextGenEvents): Unit = js.native
  
  /* static member */
  @JSImport("nextgen-events", "listenerCount")
  @js.native
  def listenerCount(emitter: NextGenEvents, eventName: String): Double = js.native
  
  /* static member */
  @JSImport("nextgen-events", "listenerWrapper")
  @js.native
  def listenerWrapper(listener: js.Any, event: js.Any, contextScope: String, serial: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("nextgen-events", "mergeListeners")
  @js.native
  def mergeListeners(foreigners: Listeners): Unit = js.native
  
  /* static member */
  @JSImport("nextgen-events", "noop")
  @js.native
  def noop(args: js.Any*): Unit = js.native
  
  /* static member */
  @JSImport("nextgen-events", "processScopeQueue")
  @js.native
  def processScopeQueue(self: NextGenEvents, contextScope: Scope, serial: Boolean, isCompletionCallback: Boolean): Unit = js.native
  
  /* static member */
  @JSImport("nextgen-events", "reset")
  @js.native
  def reset(emitter: NextGenEvents): Unit = js.native
  
  /* static member */
  @JSImport("nextgen-events", "share")
  @js.native
  def share(source: NextGenEvents, target: NextGenEvents): Unit = js.native
  
  type AddListenerOptions = Boolean | Async
  
  @js.native
  trait Context extends StObject {
    
    var nice: Double = js.native
    
    var ready: Boolean = js.native
    
    var scopes: StringDictionary[js.Any] = js.native
    
    var serial: Boolean = js.native
    
    var status: js.Any = js.native
  }
  object Context {
    
    @scala.inline
    def apply(nice: Double, ready: Boolean, scopes: StringDictionary[js.Any], serial: Boolean, status: js.Any): Context = {
      val __obj = js.Dynamic.literal(nice = nice.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNice(value: Double): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopes(value: StringDictionary[js.Any]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerial(value: Boolean): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: js.Any): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ContextOptions extends StObject {
    
    var nice: js.UndefOr[Double] = js.native
    
    var ready: Boolean = js.native
    
    var scopes: StringDictionary[Scope] = js.native
    
    var serial: js.UndefOr[js.Any] = js.native
    
    var status: js.UndefOr[js.Any] = js.native
  }
  object ContextOptions {
    
    @scala.inline
    def apply(ready: Boolean, scopes: StringDictionary[Scope]): ContextOptions = {
      val __obj = js.Dynamic.literal(ready = ready.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextOptions]
    }
    
    @scala.inline
    implicit class ContextOptionsMutableBuilder[Self <: ContextOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNice(value: Double): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNiceUndefined: Self = StObject.set(x, "nice", js.undefined)
      
      @scala.inline
      def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopes(value: StringDictionary[Scope]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerial(value: js.Any): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerialUndefined: Self = StObject.set(x, "serial", js.undefined)
      
      @scala.inline
      def setStatus(value: js.Any): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  @js.native
  trait Event extends StObject {
    
    var args: js.Any = js.native
    
    def callback(interrupt: js.Any): js.Any = js.native
    
    var emitter: NextGenEvents = js.native
    
    var interrupt: Null = js.native
    
    var mice: Double = js.native
    
    var name: String = js.native
    
    var sync: Boolean = js.native
  }
  object Event {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallback(value: js.Any => js.Any): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEmitter(value: NextGenEvents): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterrupt(value: Null): Self = StObject.set(x, "interrupt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMice(value: Double): Self = StObject.set(x, "mice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    }
  }
  
  type Func = js.Function1[/* repeated */ js.Any, js.Any]
  
  @js.native
  trait Listeners extends StObject {
    
    var error: js.Array[Func] = js.native
    
    var interrupt: js.Array[Func] = js.native
    
    var newListener: js.Array[Func] = js.native
    
    var removeListener: js.Array[Func] = js.native
  }
  object Listeners {
    
    @scala.inline
    def apply(
      error: js.Array[Func],
      interrupt: js.Array[Func],
      newListener: js.Array[Func],
      removeListener: js.Array[Func]
    ): Listeners = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], interrupt = interrupt.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any], removeListener = removeListener.asInstanceOf[js.Any])
      __obj.asInstanceOf[Listeners]
    }
    
    @scala.inline
    implicit class ListenersMutableBuilder[Self <: Listeners] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Array[Func]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorVarargs(value: Func*): Self = StObject.set(x, "error", js.Array(value :_*))
      
      @scala.inline
      def setInterrupt(value: js.Array[Func]): Self = StObject.set(x, "interrupt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterruptVarargs(value: Func*): Self = StObject.set(x, "interrupt", js.Array(value :_*))
      
      @scala.inline
      def setNewListener(value: js.Array[Func]): Self = StObject.set(x, "newListener", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewListenerVarargs(value: Func*): Self = StObject.set(x, "newListener", js.Array(value :_*))
      
      @scala.inline
      def setRemoveListener(value: js.Array[Func]): Self = StObject.set(x, "removeListener", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveListenerVarargs(value: Func*): Self = StObject.set(x, "removeListener", js.Array(value :_*))
    }
  }
  
  @js.native
  trait NextGenEvents extends StObject {
    
    def addListener(eventName: String): this.type = js.native
    def addListener(eventName: String, fn: js.UndefOr[scala.Nothing], options: AddListenerOptions): this.type = js.native
    def addListener(eventName: String, fn: js.Any): this.type = js.native
    def addListener(eventName: String, fn: js.Any, options: AddListenerOptions): this.type = js.native
    
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
    def on(eventName: String, fn: js.UndefOr[scala.Nothing], options: AddListenerOptions): this.type = js.native
    def on(eventName: String, fn: js.Any): this.type = js.native
    def on(eventName: String, fn: js.Any, options: AddListenerOptions): this.type = js.native
    
    def once(eventName: String): this.type = js.native
    def once(eventName: String, fn: js.UndefOr[scala.Nothing], options: AddListenerOptions): this.type = js.native
    def once(eventName: String, fn: js.Any): this.type = js.native
    def once(eventName: String, fn: js.Any, options: AddListenerOptions): this.type = js.native
    
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
    
    def waitForEmit(name: String, args: js.Any*): js.Promise[_] = js.native
    def waitForEmit(nice: Double, name: String, args: js.Any*): js.Promise[_] = js.native
  }
  
  @js.native
  trait Scope extends StObject {
    
    var queue: js.Array[_] = js.native
    
    var ready: Boolean = js.native
  }
  object Scope {
    
    @scala.inline
    def apply(queue: js.Array[_], ready: Boolean): Scope = {
      val __obj = js.Dynamic.literal(queue = queue.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scope]
    }
    
    @scala.inline
    implicit class ScopeMutableBuilder[Self <: Scope] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQueue(value: js.Array[_]): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueVarargs(value: js.Any*): Self = StObject.set(x, "queue", js.Array(value :_*))
      
      @scala.inline
      def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    }
  }
  
  type States = StringDictionary[js.Any]
}
