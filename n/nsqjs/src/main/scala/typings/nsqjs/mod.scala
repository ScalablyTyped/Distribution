package typings.nsqjs

import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import typings.nsqjs.nsqjsStrings.backoff
import typings.nsqjs.nsqjsStrings.closed
import typings.nsqjs.nsqjsStrings.discard
import typings.nsqjs.nsqjsStrings.error
import typings.nsqjs.nsqjsStrings.message
import typings.nsqjs.nsqjsStrings.not_ready
import typings.nsqjs.nsqjsStrings.nsqd_closed
import typings.nsqjs.nsqjsStrings.nsqd_connected
import typings.nsqjs.nsqjsStrings.ready
import typings.nsqjs.nsqjsStrings.respond
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nsqjs", "Message")
  @js.native
  open class Message protected () extends EventEmitter {
    def this(rawMessage: Buffer, requeueDelay: Double, msgTimeout: Double, maxMsgTimeout: Double) = this()
    
    var attempts: Double = js.native
    
    var body: Buffer = js.native
    
    def finish(): Unit = js.native
    
    var hasResponded: Boolean = js.native
    
    val id: String = js.native
    
    def json(): Any = js.native
    
    @JSName("on")
    def on_backoff(event: backoff, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_respond(event: respond, listener: js.Function2[/* responseType */ Double, /* wireData */ Buffer, Unit]): this.type = js.native
    
    def requeue(): Unit = js.native
    def requeue(delay: Double): Unit = js.native
    def requeue(delay: Double, backoff: Boolean): Unit = js.native
    def requeue(delay: Unit, backoff: Boolean): Unit = js.native
    
    def respond(responseType: Double, wireData: Buffer): Unit = js.native
    
    def timeUntilTimeout(): Double | Null = js.native
    def timeUntilTimeout(hard: Boolean): Double | Null = js.native
    
    var timestamp: Double = js.native
    
    def touch(): Unit = js.native
  }
  /* static members */
  object Message {
    
    @JSImport("nsqjs", "Message")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("nsqjs", "Message.BACKOFF")
    @js.native
    def BACKOFF: String = js.native
    inline def BACKOFF_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BACKOFF")(x.asInstanceOf[js.Any])
    
    @JSImport("nsqjs", "Message.FINISH")
    @js.native
    def FINISH: Double = js.native
    inline def FINISH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FINISH")(x.asInstanceOf[js.Any])
    
    @JSImport("nsqjs", "Message.REQUEUE")
    @js.native
    def REQUEUE: Double = js.native
    inline def REQUEUE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REQUEUE")(x.asInstanceOf[js.Any])
    
    @JSImport("nsqjs", "Message.RESPOND")
    @js.native
    def RESPOND: String = js.native
    inline def RESPOND_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESPOND")(x.asInstanceOf[js.Any])
    
    @JSImport("nsqjs", "Message.TOUCH")
    @js.native
    def TOUCH: Double = js.native
    inline def TOUCH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOUCH")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("nsqjs", "Reader")
  @js.native
  open class Reader protected () extends EventEmitter {
    def this(topic: String, channel: String) = this()
    def this(topic: String, channel: String, options: ReaderConnectionConfigOptions) = this()
    
    def close(): Unit = js.native
    
    def connect(): Unit = js.native
    
    def connectToNSQD(host: String, port: Double): Unit = js.native
    
    def handleMessage(message: Message): Unit = js.native
    
    def isPaused(): Boolean = js.native
    
    def on(event: ready | not_ready, listener: js.Function0[Unit]): this.type = js.native
    def on(event: message | discard, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
    def on(
      event: nsqd_connected | nsqd_closed,
      listener: js.Function2[/* host */ String, /* port */ Double, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    def pause(): Unit = js.native
    
    def queryLookupd(): Unit = js.native
    
    def unpause(): Unit = js.native
  }
  /* static members */
  object Reader {
    
    @JSImport("nsqjs", "Reader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("nsqjs", "Reader.DISCARD")
    @js.native
    def DISCARD: String = js.native
    inline def DISCARD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISCARD")(x.asInstanceOf[js.Any])
    
    @JSImport("nsqjs", "Reader.ERROR")
    @js.native
    def ERROR: String = js.native
    inline def ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("nsqjs", "Reader.MESSAGE")
    @js.native
    def MESSAGE: String = js.native
    inline def MESSAGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MESSAGE")(x.asInstanceOf[js.Any])
    
    @JSImport("nsqjs", "Reader.NOT_READY")
    @js.native
    def NOT_READY: String = js.native
    inline def NOT_READY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_READY")(x.asInstanceOf[js.Any])
    
    @JSImport("nsqjs", "Reader.NSQD_CLOSED")
    @js.native
    def NSQD_CLOSED: String = js.native
    inline def NSQD_CLOSED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NSQD_CLOSED")(x.asInstanceOf[js.Any])
    
    @JSImport("nsqjs", "Reader.NSQD_CONNECTED")
    @js.native
    def NSQD_CONNECTED: String = js.native
    inline def NSQD_CONNECTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NSQD_CONNECTED")(x.asInstanceOf[js.Any])
    
    @JSImport("nsqjs", "Reader.READY")
    @js.native
    def READY: String = js.native
    inline def READY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("READY")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("nsqjs", "Writer")
  @js.native
  open class Writer protected () extends EventEmitter {
    def this(nsqdHost: String, nsqdPort: Double) = this()
    def this(nsqdHost: String, nsqdPort: Double, options: ConnectionConfigOptions) = this()
    
    def close(): Unit = js.native
    
    def connect(): Unit = js.native
    
    def deferPublish(topic: String, msgs: String, timeMs: Double): Unit = js.native
    def deferPublish(
      topic: String,
      msgs: String,
      timeMs: Double,
      callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    def deferPublish(topic: String, msgs: js.Array[Buffer | js.Object | String], timeMs: Double): Unit = js.native
    def deferPublish(
      topic: String,
      msgs: js.Array[Buffer | js.Object | String],
      timeMs: Double,
      callback: js.Function1[js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    def deferPublish(topic: String, msgs: js.Object, timeMs: Double): Unit = js.native
    def deferPublish(
      topic: String,
      msgs: js.Object,
      timeMs: Double,
      callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    def deferPublish(topic: String, msgs: Buffer, timeMs: Double): Unit = js.native
    def deferPublish(
      topic: String,
      msgs: Buffer,
      timeMs: Double,
      callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    
    val nsqdHost: String = js.native
    
    val nsqdPort: Double = js.native
    
    def on(event: ready | closed, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    def publish(topic: String, msgs: String): Unit = js.native
    def publish(topic: String, msgs: String, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    def publish(topic: String, msgs: js.Array[Buffer | js.Object | String]): Unit = js.native
    def publish(
      topic: String,
      msgs: js.Array[Buffer | js.Object | String],
      callback: js.Function1[js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    def publish(topic: String, msgs: js.Object): Unit = js.native
    def publish(topic: String, msgs: js.Object, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    def publish(topic: String, msgs: Buffer): Unit = js.native
    def publish(topic: String, msgs: Buffer, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  }
  /* static members */
  object Writer {
    
    @JSImport("nsqjs", "Writer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("nsqjs", "Writer.CLOSED")
    @js.native
    def CLOSED: String = js.native
    inline def CLOSED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSED")(x.asInstanceOf[js.Any])
    
    @JSImport("nsqjs", "Writer.ERROR")
    @js.native
    def ERROR: String = js.native
    inline def ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("nsqjs", "Writer.READY")
    @js.native
    def READY: String = js.native
    inline def READY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("READY")(x.asInstanceOf[js.Any])
  }
  
  trait ConnectionConfigOptions extends StObject {
    
    var authSecret: js.UndefOr[String] = js.undefined
    
    var clientId: js.UndefOr[String] = js.undefined
    
    var deflate: js.UndefOr[Boolean] = js.undefined
    
    var deflateLevel: js.UndefOr[Double] = js.undefined
    
    var heartbeatInterval: js.UndefOr[Double] = js.undefined
    
    var idleTimeout: js.UndefOr[Double] = js.undefined
    
    var maxInFlight: js.UndefOr[Double] = js.undefined
    
    var messageTimeout: js.UndefOr[Double] = js.undefined
    
    var outputBufferSize: js.UndefOr[Double] = js.undefined
    
    var outputBufferTimeout: js.UndefOr[Double] = js.undefined
    
    var requeueDelay: js.UndefOr[Double] = js.undefined
    
    var sampleRate: js.UndefOr[Double] = js.undefined
    
    var snappy: js.UndefOr[Boolean] = js.undefined
    
    var tls: js.UndefOr[Boolean] = js.undefined
    
    var tlsVerification: js.UndefOr[Boolean] = js.undefined
  }
  object ConnectionConfigOptions {
    
    inline def apply(): ConnectionConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionConfigOptions]
    }
    
    extension [Self <: ConnectionConfigOptions](x: Self) {
      
      inline def setAuthSecret(value: String): Self = StObject.set(x, "authSecret", value.asInstanceOf[js.Any])
      
      inline def setAuthSecretUndefined: Self = StObject.set(x, "authSecret", js.undefined)
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setDeflate(value: Boolean): Self = StObject.set(x, "deflate", value.asInstanceOf[js.Any])
      
      inline def setDeflateLevel(value: Double): Self = StObject.set(x, "deflateLevel", value.asInstanceOf[js.Any])
      
      inline def setDeflateLevelUndefined: Self = StObject.set(x, "deflateLevel", js.undefined)
      
      inline def setDeflateUndefined: Self = StObject.set(x, "deflate", js.undefined)
      
      inline def setHeartbeatInterval(value: Double): Self = StObject.set(x, "heartbeatInterval", value.asInstanceOf[js.Any])
      
      inline def setHeartbeatIntervalUndefined: Self = StObject.set(x, "heartbeatInterval", js.undefined)
      
      inline def setIdleTimeout(value: Double): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
      
      inline def setIdleTimeoutUndefined: Self = StObject.set(x, "idleTimeout", js.undefined)
      
      inline def setMaxInFlight(value: Double): Self = StObject.set(x, "maxInFlight", value.asInstanceOf[js.Any])
      
      inline def setMaxInFlightUndefined: Self = StObject.set(x, "maxInFlight", js.undefined)
      
      inline def setMessageTimeout(value: Double): Self = StObject.set(x, "messageTimeout", value.asInstanceOf[js.Any])
      
      inline def setMessageTimeoutUndefined: Self = StObject.set(x, "messageTimeout", js.undefined)
      
      inline def setOutputBufferSize(value: Double): Self = StObject.set(x, "outputBufferSize", value.asInstanceOf[js.Any])
      
      inline def setOutputBufferSizeUndefined: Self = StObject.set(x, "outputBufferSize", js.undefined)
      
      inline def setOutputBufferTimeout(value: Double): Self = StObject.set(x, "outputBufferTimeout", value.asInstanceOf[js.Any])
      
      inline def setOutputBufferTimeoutUndefined: Self = StObject.set(x, "outputBufferTimeout", js.undefined)
      
      inline def setRequeueDelay(value: Double): Self = StObject.set(x, "requeueDelay", value.asInstanceOf[js.Any])
      
      inline def setRequeueDelayUndefined: Self = StObject.set(x, "requeueDelay", js.undefined)
      
      inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
      
      inline def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
      
      inline def setSnappy(value: Boolean): Self = StObject.set(x, "snappy", value.asInstanceOf[js.Any])
      
      inline def setSnappyUndefined: Self = StObject.set(x, "snappy", js.undefined)
      
      inline def setTls(value: Boolean): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      inline def setTlsVerification(value: Boolean): Self = StObject.set(x, "tlsVerification", value.asInstanceOf[js.Any])
      
      inline def setTlsVerificationUndefined: Self = StObject.set(x, "tlsVerification", js.undefined)
    }
  }
  
  trait ReaderConnectionConfigOptions
    extends StObject
       with ConnectionConfigOptions {
    
    var lookupdHTTPAddresses: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var lookupdPollInterval: js.UndefOr[Double] = js.undefined
    
    var lookupdPollJitter: js.UndefOr[Double] = js.undefined
    
    var lowRdyTimeout: js.UndefOr[Double] = js.undefined
    
    var maxAttempts: js.UndefOr[Double] = js.undefined
    
    var maxBackoffDuration: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var nsqdTCPAddresses: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object ReaderConnectionConfigOptions {
    
    inline def apply(): ReaderConnectionConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReaderConnectionConfigOptions]
    }
    
    extension [Self <: ReaderConnectionConfigOptions](x: Self) {
      
      inline def setLookupdHTTPAddresses(value: String | js.Array[String]): Self = StObject.set(x, "lookupdHTTPAddresses", value.asInstanceOf[js.Any])
      
      inline def setLookupdHTTPAddressesUndefined: Self = StObject.set(x, "lookupdHTTPAddresses", js.undefined)
      
      inline def setLookupdHTTPAddressesVarargs(value: String*): Self = StObject.set(x, "lookupdHTTPAddresses", js.Array(value*))
      
      inline def setLookupdPollInterval(value: Double): Self = StObject.set(x, "lookupdPollInterval", value.asInstanceOf[js.Any])
      
      inline def setLookupdPollIntervalUndefined: Self = StObject.set(x, "lookupdPollInterval", js.undefined)
      
      inline def setLookupdPollJitter(value: Double): Self = StObject.set(x, "lookupdPollJitter", value.asInstanceOf[js.Any])
      
      inline def setLookupdPollJitterUndefined: Self = StObject.set(x, "lookupdPollJitter", js.undefined)
      
      inline def setLowRdyTimeout(value: Double): Self = StObject.set(x, "lowRdyTimeout", value.asInstanceOf[js.Any])
      
      inline def setLowRdyTimeoutUndefined: Self = StObject.set(x, "lowRdyTimeout", js.undefined)
      
      inline def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      inline def setMaxAttemptsUndefined: Self = StObject.set(x, "maxAttempts", js.undefined)
      
      inline def setMaxBackoffDuration(value: Double): Self = StObject.set(x, "maxBackoffDuration", value.asInstanceOf[js.Any])
      
      inline def setMaxBackoffDurationUndefined: Self = StObject.set(x, "maxBackoffDuration", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNsqdTCPAddresses(value: String | js.Array[String]): Self = StObject.set(x, "nsqdTCPAddresses", value.asInstanceOf[js.Any])
      
      inline def setNsqdTCPAddressesUndefined: Self = StObject.set(x, "nsqdTCPAddresses", js.undefined)
      
      inline def setNsqdTCPAddressesVarargs(value: String*): Self = StObject.set(x, "nsqdTCPAddresses", js.Array(value*))
    }
  }
}
