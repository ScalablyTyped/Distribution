package typings.phoenix

import org.scalablytyped.runtime.StringDictionary
import typings.phoenix.anon.Diff
import typings.phoenix.anon.Joins
import typings.phoenix.anon.PartialSocketConnectOptio
import typings.std.JSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("phoenix", "Ajax")
  @js.native
  class Ajax () extends StObject
  /* static members */
  object Ajax {
    
    @JSImport("phoenix", "Ajax")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("phoenix", "Ajax.appendParams")
    @js.native
    def appendParams(url: String, params: js.Any): String = js.native
    
    @JSImport("phoenix", "Ajax.parseJSON")
    @js.native
    def parseJSON(resp: String): JSON = js.native
    
    @JSImport("phoenix", "Ajax.request")
    @js.native
    def request(method: String, endPoint: String, accept: String, body: js.Any): Unit = js.native
    @JSImport("phoenix", "Ajax.request")
    @js.native
    def request(
      method: String,
      endPoint: String,
      accept: String,
      body: js.Any,
      timeout: js.UndefOr[scala.Nothing],
      ontimeout: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* response */ js.UndefOr[js.Any], Unit]
    ): Unit = js.native
    @JSImport("phoenix", "Ajax.request")
    @js.native
    def request(
      method: String,
      endPoint: String,
      accept: String,
      body: js.Any,
      timeout: js.UndefOr[scala.Nothing],
      ontimeout: js.Any
    ): Unit = js.native
    @JSImport("phoenix", "Ajax.request")
    @js.native
    def request(
      method: String,
      endPoint: String,
      accept: String,
      body: js.Any,
      timeout: js.UndefOr[scala.Nothing],
      ontimeout: js.Any,
      callback: js.Function1[/* response */ js.UndefOr[js.Any], Unit]
    ): Unit = js.native
    @JSImport("phoenix", "Ajax.request")
    @js.native
    def request(method: String, endPoint: String, accept: String, body: js.Any, timeout: Double): Unit = js.native
    @JSImport("phoenix", "Ajax.request")
    @js.native
    def request(
      method: String,
      endPoint: String,
      accept: String,
      body: js.Any,
      timeout: Double,
      ontimeout: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* response */ js.UndefOr[js.Any], Unit]
    ): Unit = js.native
    @JSImport("phoenix", "Ajax.request")
    @js.native
    def request(method: String, endPoint: String, accept: String, body: js.Any, timeout: Double, ontimeout: js.Any): Unit = js.native
    @JSImport("phoenix", "Ajax.request")
    @js.native
    def request(
      method: String,
      endPoint: String,
      accept: String,
      body: js.Any,
      timeout: Double,
      ontimeout: js.Any,
      callback: js.Function1[/* response */ js.UndefOr[js.Any], Unit]
    ): Unit = js.native
    
    @JSImport("phoenix", "Ajax.serialize")
    @js.native
    def serialize(obj: js.Any, parentKey: String): String = js.native
    
    @JSImport("phoenix", "Ajax.states")
    @js.native
    def states: StringDictionary[Double] = js.native
    @scala.inline
    def states_=(x: StringDictionary[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("states")(x.asInstanceOf[js.Any])
    
    @JSImport("phoenix", "Ajax.xdomainRequest")
    @js.native
    def xdomainRequest(req: js.Any, method: String, endPoint: String, body: js.Any): Unit = js.native
    @JSImport("phoenix", "Ajax.xdomainRequest")
    @js.native
    def xdomainRequest(
      req: js.Any,
      method: String,
      endPoint: String,
      body: js.Any,
      timeout: js.UndefOr[scala.Nothing],
      ontimeout: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* response */ js.UndefOr[js.Any], Unit]
    ): Unit = js.native
    @JSImport("phoenix", "Ajax.xdomainRequest")
    @js.native
    def xdomainRequest(
      req: js.Any,
      method: String,
      endPoint: String,
      body: js.Any,
      timeout: js.UndefOr[scala.Nothing],
      ontimeout: js.Any
    ): Unit = js.native
    @JSImport("phoenix", "Ajax.xdomainRequest")
    @js.native
    def xdomainRequest(
      req: js.Any,
      method: String,
      endPoint: String,
      body: js.Any,
      timeout: js.UndefOr[scala.Nothing],
      ontimeout: js.Any,
      callback: js.Function1[/* response */ js.UndefOr[js.Any], Unit]
    ): Unit = js.native
    @JSImport("phoenix", "Ajax.xdomainRequest")
    @js.native
    def xdomainRequest(req: js.Any, method: String, endPoint: String, body: js.Any, timeout: Double): Unit = js.native
    @JSImport("phoenix", "Ajax.xdomainRequest")
    @js.native
    def xdomainRequest(
      req: js.Any,
      method: String,
      endPoint: String,
      body: js.Any,
      timeout: Double,
      ontimeout: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* response */ js.UndefOr[js.Any], Unit]
    ): Unit = js.native
    @JSImport("phoenix", "Ajax.xdomainRequest")
    @js.native
    def xdomainRequest(req: js.Any, method: String, endPoint: String, body: js.Any, timeout: Double, ontimeout: js.Any): Unit = js.native
    @JSImport("phoenix", "Ajax.xdomainRequest")
    @js.native
    def xdomainRequest(
      req: js.Any,
      method: String,
      endPoint: String,
      body: js.Any,
      timeout: Double,
      ontimeout: js.Any,
      callback: js.Function1[/* response */ js.UndefOr[js.Any], Unit]
    ): Unit = js.native
    
    @JSImport("phoenix", "Ajax.xhrRequest")
    @js.native
    def xhrRequest(req: js.Any, method: String, endPoint: String, accept: String, body: js.Any): Unit = js.native
    @JSImport("phoenix", "Ajax.xhrRequest")
    @js.native
    def xhrRequest(
      req: js.Any,
      method: String,
      endPoint: String,
      accept: String,
      body: js.Any,
      timeout: js.UndefOr[scala.Nothing],
      ontimeout: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* response */ js.UndefOr[js.Any], Unit]
    ): Unit = js.native
    @JSImport("phoenix", "Ajax.xhrRequest")
    @js.native
    def xhrRequest(
      req: js.Any,
      method: String,
      endPoint: String,
      accept: String,
      body: js.Any,
      timeout: js.UndefOr[scala.Nothing],
      ontimeout: js.Any
    ): Unit = js.native
    @JSImport("phoenix", "Ajax.xhrRequest")
    @js.native
    def xhrRequest(
      req: js.Any,
      method: String,
      endPoint: String,
      accept: String,
      body: js.Any,
      timeout: js.UndefOr[scala.Nothing],
      ontimeout: js.Any,
      callback: js.Function1[/* response */ js.UndefOr[js.Any], Unit]
    ): Unit = js.native
    @JSImport("phoenix", "Ajax.xhrRequest")
    @js.native
    def xhrRequest(req: js.Any, method: String, endPoint: String, accept: String, body: js.Any, timeout: Double): Unit = js.native
    @JSImport("phoenix", "Ajax.xhrRequest")
    @js.native
    def xhrRequest(
      req: js.Any,
      method: String,
      endPoint: String,
      accept: String,
      body: js.Any,
      timeout: Double,
      ontimeout: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* response */ js.UndefOr[js.Any], Unit]
    ): Unit = js.native
    @JSImport("phoenix", "Ajax.xhrRequest")
    @js.native
    def xhrRequest(
      req: js.Any,
      method: String,
      endPoint: String,
      accept: String,
      body: js.Any,
      timeout: Double,
      ontimeout: js.Any
    ): Unit = js.native
    @JSImport("phoenix", "Ajax.xhrRequest")
    @js.native
    def xhrRequest(
      req: js.Any,
      method: String,
      endPoint: String,
      accept: String,
      body: js.Any,
      timeout: Double,
      ontimeout: js.Any,
      callback: js.Function1[/* response */ js.UndefOr[js.Any], Unit]
    ): Unit = js.native
  }
  
  @JSImport("phoenix", "Channel")
  @js.native
  class Channel protected () extends StObject {
    def this(topic: String) = this()
    def this(topic: String, params: js.Function0[js.Object]) = this()
    def this(topic: String, params: js.Object) = this()
    def this(topic: String, params: js.UndefOr[scala.Nothing], socket: Socket) = this()
    def this(topic: String, params: js.Function0[js.Object], socket: Socket) = this()
    def this(topic: String, params: js.Object, socket: Socket) = this()
    
    def join(): Push = js.native
    def join(timeout: Double): Push = js.native
    
    def leave(): Push = js.native
    def leave(timeout: Double): Push = js.native
    
    def off(event: String): Unit = js.native
    def off(event: String, ref: Double): Unit = js.native
    
    def on(event: String, callback: js.Function1[/* response */ js.UndefOr[js.Any], Unit]): Double = js.native
    
    def onClose(callback: js.Function3[/* payload */ js.Any, /* ref */ js.Any, /* joinRef */ js.Any, Unit]): Unit = js.native
    
    def onError(callback: js.Function1[/* reason */ js.UndefOr[js.Any], Unit]): Unit = js.native
    
    def onMessage(event: String, payload: js.Any, ref: js.Any): js.Any = js.native
    
    def push(event: String, payload: js.Object): Push = js.native
    def push(event: String, payload: js.Object, timeout: Double): Push = js.native
  }
  
  @JSImport("phoenix", "LongPoll")
  @js.native
  class LongPoll protected () extends StObject {
    def this(endPoint: String) = this()
    
    def close(): Unit = js.native
    def close(code: js.UndefOr[scala.Nothing], reason: js.Any): Unit = js.native
    def close(code: js.Any): Unit = js.native
    def close(code: js.Any, reason: js.Any): Unit = js.native
    
    def closeAndRetry(): Unit = js.native
    
    def endpointURL(): String = js.native
    
    def normalizeEndpoint(endPoint: String): String = js.native
    
    def ontimeout(): Unit = js.native
    
    def poll(): Unit = js.native
    
    def send(body: js.Any): Unit = js.native
  }
  
  @JSImport("phoenix", "Presence")
  @js.native
  class Presence protected () extends StObject {
    def this(channel: Channel) = this()
    def this(channel: Channel, opts: PresenceOpts) = this()
    
    def inPendingSyncState(): Boolean = js.native
    
    def list[T](): js.Array[T] = js.native
    def list[T](chooser: js.Function2[/* key */ String, /* presence */ js.Any, T]): js.Array[T] = js.native
    
    def onJoin(callback: PresenceOnJoinCallback): Unit = js.native
    
    def onLeave(callback: PresenceOnLeaveCallback): Unit = js.native
    
    def onSync(callback: js.Function0[Unit]): Unit = js.native
  }
  /* static members */
  object Presence {
    
    @JSImport("phoenix", "Presence.list")
    @js.native
    def list[T](presences: js.Object): js.Array[T] = js.native
    @JSImport("phoenix", "Presence.list")
    @js.native
    def list[T](presences: js.Object, chooser: js.Function2[/* key */ String, /* presence */ js.Any, T]): js.Array[T] = js.native
    
    @JSImport("phoenix", "Presence.syncDiff")
    @js.native
    def syncDiff(currentState: js.Object, diff: Joins): js.Any = js.native
    @JSImport("phoenix", "Presence.syncDiff")
    @js.native
    def syncDiff(
      currentState: js.Object,
      diff: Joins,
      onJoin: js.UndefOr[scala.Nothing],
      onLeave: PresenceOnLeaveCallback
    ): js.Any = js.native
    @JSImport("phoenix", "Presence.syncDiff")
    @js.native
    def syncDiff(currentState: js.Object, diff: Joins, onJoin: PresenceOnJoinCallback): js.Any = js.native
    @JSImport("phoenix", "Presence.syncDiff")
    @js.native
    def syncDiff(
      currentState: js.Object,
      diff: Joins,
      onJoin: PresenceOnJoinCallback,
      onLeave: PresenceOnLeaveCallback
    ): js.Any = js.native
    
    @JSImport("phoenix", "Presence.syncState")
    @js.native
    def syncState(currentState: js.Object, newState: js.Object): js.Any = js.native
    @JSImport("phoenix", "Presence.syncState")
    @js.native
    def syncState(
      currentState: js.Object,
      newState: js.Object,
      onJoin: js.UndefOr[scala.Nothing],
      onLeave: PresenceOnLeaveCallback
    ): js.Any = js.native
    @JSImport("phoenix", "Presence.syncState")
    @js.native
    def syncState(currentState: js.Object, newState: js.Object, onJoin: PresenceOnJoinCallback): js.Any = js.native
    @JSImport("phoenix", "Presence.syncState")
    @js.native
    def syncState(
      currentState: js.Object,
      newState: js.Object,
      onJoin: PresenceOnJoinCallback,
      onLeave: PresenceOnLeaveCallback
    ): js.Any = js.native
  }
  
  @JSImport("phoenix", "Push")
  @js.native
  class Push protected () extends StObject {
    def this(channel: Channel, event: String, payload: js.Object, timeout: Double) = this()
    
    def receive(status: String, callback: js.Function1[/* response */ js.UndefOr[js.Any], _]): this.type = js.native
    
    def resend(timeout: Double): Unit = js.native
    
    def send(): Unit = js.native
  }
  
  @JSImport("phoenix", "Socket")
  @js.native
  class Socket protected () extends StObject {
    def this(endPoint: String) = this()
    def this(endPoint: String, opts: PartialSocketConnectOptio) = this()
    
    def channel(topic: String): Channel = js.native
    def channel(topic: String, chanParams: js.Object): Channel = js.native
    
    def connect(): Unit = js.native
    def connect(params: js.Any): Unit = js.native
    
    def connectionState(): ConnectionState = js.native
    
    def disconnect(): Unit = js.native
    def disconnect(callback: js.UndefOr[scala.Nothing], code: js.UndefOr[scala.Nothing], reason: String): Unit = js.native
    def disconnect(callback: js.UndefOr[scala.Nothing], code: Double): Unit = js.native
    def disconnect(callback: js.UndefOr[scala.Nothing], code: Double, reason: String): Unit = js.native
    def disconnect(callback: js.Function0[Unit]): Unit = js.native
    def disconnect(callback: js.Function0[Unit], code: js.UndefOr[scala.Nothing], reason: String): Unit = js.native
    def disconnect(callback: js.Function0[Unit], code: Double): Unit = js.native
    def disconnect(callback: js.Function0[Unit], code: Double, reason: String): Unit = js.native
    
    def endPointURL(): String = js.native
    
    def hasLogger(): Boolean = js.native
    
    def isConnected(): Boolean = js.native
    
    def log(kind: String, message: String, data: js.Any): Unit = js.native
    
    def makeRef(): MessageRef = js.native
    
    def off(refs: js.Array[MessageRef]): Unit = js.native
    
    def onClose(callback: js.Function1[/* cb */ js.Any, Unit]): MessageRef = js.native
    
    def onError(callback: js.Function1[/* cb */ js.Any, Unit]): MessageRef = js.native
    
    def onMessage(callback: js.Function1[/* cb */ js.Any, Unit]): MessageRef = js.native
    
    def onOpen(callback: js.Function1[/* cb */ js.Any, Unit]): MessageRef = js.native
    
    def protocol(): String = js.native
    
    def push(data: js.Object): Unit = js.native
    
    def remove(channel: Channel): Unit = js.native
  }
  
  @JSImport("phoenix", "Timer")
  @js.native
  class Timer protected () extends StObject {
    def this(callback: js.Function0[Unit], timerCalc: js.Function1[/* tries */ Double, Double]) = this()
    
    def reset(): Unit = js.native
    
    def scheduleTimeout(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.phoenix.phoenixStrings.arraybuffer
    - typings.phoenix.phoenixStrings.blob
  */
  trait BinaryType extends StObject
  object BinaryType {
    
    @scala.inline
    def arraybuffer: typings.phoenix.phoenixStrings.arraybuffer = "arraybuffer".asInstanceOf[typings.phoenix.phoenixStrings.arraybuffer]
    
    @scala.inline
    def blob: typings.phoenix.phoenixStrings.blob = "blob".asInstanceOf[typings.phoenix.phoenixStrings.blob]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.phoenix.phoenixStrings.connecting
    - typings.phoenix.phoenixStrings.open
    - typings.phoenix.phoenixStrings.closing
    - typings.phoenix.phoenixStrings.closed
  */
  trait ConnectionState extends StObject
  object ConnectionState {
    
    @scala.inline
    def closed: typings.phoenix.phoenixStrings.closed = "closed".asInstanceOf[typings.phoenix.phoenixStrings.closed]
    
    @scala.inline
    def closing: typings.phoenix.phoenixStrings.closing = "closing".asInstanceOf[typings.phoenix.phoenixStrings.closing]
    
    @scala.inline
    def connecting: typings.phoenix.phoenixStrings.connecting = "connecting".asInstanceOf[typings.phoenix.phoenixStrings.connecting]
    
    @scala.inline
    def open: typings.phoenix.phoenixStrings.open = "open".asInstanceOf[typings.phoenix.phoenixStrings.open]
  }
  
  type MessageRef = String
  
  type PresenceOnJoinCallback = js.Function3[
    /* key */ js.UndefOr[String], 
    /* currentPresence */ js.UndefOr[js.Any], 
    /* newPresence */ js.UndefOr[js.Any], 
    Unit
  ]
  
  type PresenceOnLeaveCallback = js.Function3[
    /* key */ js.UndefOr[String], 
    /* currentPresence */ js.UndefOr[js.Any], 
    /* newPresence */ js.UndefOr[js.Any], 
    Unit
  ]
  
  @js.native
  trait PresenceOpts extends StObject {
    
    var events: js.UndefOr[Diff] = js.native
  }
  object PresenceOpts {
    
    @scala.inline
    def apply(): PresenceOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PresenceOpts]
    }
    
    @scala.inline
    implicit class PresenceOptsMutableBuilder[Self <: PresenceOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvents(value: Diff): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    }
  }
  
  @js.native
  trait SocketConnectOption extends StObject {
    
    var binaryType: BinaryType = js.native
    
    def decode(payload: String, callback: js.Function1[/* decoded */ js.Any, Unit]): Unit = js.native
    
    def encode(payload: js.Object, callback: js.Function1[/* encoded */ js.Any, Unit]): Unit = js.native
    
    var heartbeatIntervalMs: Double = js.native
    
    def logger(kind: String, message: String, data: js.Any): Unit = js.native
    
    var longpollerTimeout: Double = js.native
    
    var params: js.Object | js.Function0[js.Object] = js.native
    
    def reconnectAfterMs(tries: Double): Double = js.native
    
    def rejoinAfterMs(tries: Double): Double = js.native
    
    var timeout: Double = js.native
    
    var transport: String = js.native
    
    var vsn: String = js.native
  }
  object SocketConnectOption {
    
    @scala.inline
    def apply(
      binaryType: BinaryType,
      decode: (String, js.Function1[/* decoded */ js.Any, Unit]) => Unit,
      encode: (js.Object, js.Function1[/* encoded */ js.Any, Unit]) => Unit,
      heartbeatIntervalMs: Double,
      logger: (String, String, js.Any) => Unit,
      longpollerTimeout: Double,
      params: js.Object | js.Function0[js.Object],
      reconnectAfterMs: Double => Double,
      rejoinAfterMs: Double => Double,
      timeout: Double,
      transport: String,
      vsn: String
    ): SocketConnectOption = {
      val __obj = js.Dynamic.literal(binaryType = binaryType.asInstanceOf[js.Any], decode = js.Any.fromFunction2(decode), encode = js.Any.fromFunction2(encode), heartbeatIntervalMs = heartbeatIntervalMs.asInstanceOf[js.Any], logger = js.Any.fromFunction3(logger), longpollerTimeout = longpollerTimeout.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], reconnectAfterMs = js.Any.fromFunction1(reconnectAfterMs), rejoinAfterMs = js.Any.fromFunction1(rejoinAfterMs), timeout = timeout.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any], vsn = vsn.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketConnectOption]
    }
    
    @scala.inline
    implicit class SocketConnectOptionMutableBuilder[Self <: SocketConnectOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBinaryType(value: BinaryType): Self = StObject.set(x, "binaryType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecode(value: (String, js.Function1[/* decoded */ js.Any, Unit]) => Unit): Self = StObject.set(x, "decode", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEncode(value: (js.Object, js.Function1[/* encoded */ js.Any, Unit]) => Unit): Self = StObject.set(x, "encode", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHeartbeatIntervalMs(value: Double): Self = StObject.set(x, "heartbeatIntervalMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogger(value: (String, String, js.Any) => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLongpollerTimeout(value: Double): Self = StObject.set(x, "longpollerTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: js.Object | js.Function0[js.Object]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsFunction0(value: () => js.Object): Self = StObject.set(x, "params", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReconnectAfterMs(value: Double => Double): Self = StObject.set(x, "reconnectAfterMs", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRejoinAfterMs(value: Double => Double): Self = StObject.set(x, "rejoinAfterMs", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransport(value: String): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVsn(value: String): Self = StObject.set(x, "vsn", value.asInstanceOf[js.Any])
    }
  }
}
