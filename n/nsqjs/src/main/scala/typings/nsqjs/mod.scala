package typings.nsqjs

import typings.node.Buffer
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
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nsqjs", "Message")
  @js.native
  class Message protected () extends EventEmitter {
    def this(rawMessage: Buffer, requeueDelay: Double, msgTimeout: Double, maxMsgTimeout: Double) = this()
    
    var attempts: Double = js.native
    
    var body: Buffer = js.native
    
    def finish(): Unit = js.native
    
    var hasResponded: Boolean = js.native
    
    val id: String = js.native
    
    def json(): js.Any = js.native
    
    @JSName("on")
    def on_backoff(event: backoff, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_respond(event: respond, listener: js.Function2[/* responseType */ Double, /* wireData */ Buffer, Unit]): this.type = js.native
    
    def requeue(): Unit = js.native
    def requeue(delay: js.UndefOr[scala.Nothing], backoff: Boolean): Unit = js.native
    def requeue(delay: Double): Unit = js.native
    def requeue(delay: Double, backoff: Boolean): Unit = js.native
    
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
    @scala.inline
    def BACKOFF_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BACKOFF")(x.asInstanceOf[js.Any])
    
    @JSImport("nsqjs", "Message.FINISH")
    @js.native
    def FINISH: Double = js.native
    @scala.inline
    def FINISH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FINISH")(x.asInstanceOf[js.Any])
    
    @JSImport("nsqjs", "Message.REQUEUE")
    @js.native
    def REQUEUE: Double = js.native
    @scala.inline
    def REQUEUE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REQUEUE")(x.asInstanceOf[js.Any])
    
    @JSImport("nsqjs", "Message.RESPOND")
    @js.native
    def RESPOND: String = js.native
    @scala.inline
    def RESPOND_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESPOND")(x.asInstanceOf[js.Any])
    
    @JSImport("nsqjs", "Message.TOUCH")
    @js.native
    def TOUCH: Double = js.native
    @scala.inline
    def TOUCH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOUCH")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("nsqjs", "Reader")
  @js.native
  class Reader protected () extends EventEmitter {
    def this(topic: String, channel: String) = this()
    def this(topic: String, channel: String, options: ReaderConnectionConfigOptions) = this()
    
    def close(): Unit = js.native
    
    def connect(): Unit = js.native
    
    def connectToNSQD(host: String, port: Double): Unit = js.native
    
    def handleMessage(message: Message): Unit = js.native
    
    def isPaused(): Boolean = js.native
    
    @JSName("on")
    def on_discard(event: discard, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_message(event: message, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
    @JSName("on")
    def on_notready(event: not_ready, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_nsqdclosed(event: nsqd_closed, listener: js.Function2[/* host */ String, /* port */ Double, Unit]): this.type = js.native
    @JSName("on")
    def on_nsqdconnected(event: nsqd_connected, listener: js.Function2[/* host */ String, /* port */ Double, Unit]): this.type = js.native
    @JSName("on")
    def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
    
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
    @scala.inline
    def DISCARD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISCARD")(x.asInstanceOf[js.Any])
    
    @JSImport("nsqjs", "Reader.ERROR")
    @js.native
    def ERROR: String = js.native
    @scala.inline
    def ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("nsqjs", "Reader.MESSAGE")
    @js.native
    def MESSAGE: String = js.native
    @scala.inline
    def MESSAGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MESSAGE")(x.asInstanceOf[js.Any])
    
    @JSImport("nsqjs", "Reader.NOT_READY")
    @js.native
    def NOT_READY: String = js.native
    @scala.inline
    def NOT_READY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_READY")(x.asInstanceOf[js.Any])
    
    @JSImport("nsqjs", "Reader.NSQD_CLOSED")
    @js.native
    def NSQD_CLOSED: String = js.native
    @scala.inline
    def NSQD_CLOSED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NSQD_CLOSED")(x.asInstanceOf[js.Any])
    
    @JSImport("nsqjs", "Reader.NSQD_CONNECTED")
    @js.native
    def NSQD_CONNECTED: String = js.native
    @scala.inline
    def NSQD_CONNECTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NSQD_CONNECTED")(x.asInstanceOf[js.Any])
    
    @JSImport("nsqjs", "Reader.READY")
    @js.native
    def READY: String = js.native
    @scala.inline
    def READY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("READY")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("nsqjs", "Writer")
  @js.native
  class Writer protected () extends EventEmitter {
    def this(nsqdHost: String, nsqdPort: Double) = this()
    def this(nsqdHost: String, nsqdPort: Double, options: ConnectionConfigOptions) = this()
    
    def close(): Unit = js.native
    
    def connect(): Unit = js.native
    
    def deferPublish(topic: String, msgs: String, timeMs: Double): Unit = js.native
    def deferPublish(
      topic: String,
      msgs: String,
      timeMs: Double,
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Unit = js.native
    def deferPublish(topic: String, msgs: js.Array[Buffer | js.Object | String], timeMs: Double): Unit = js.native
    def deferPublish(
      topic: String,
      msgs: js.Array[Buffer | js.Object | String],
      timeMs: Double,
      callback: js.Function1[js.UndefOr[Error], Unit]
    ): Unit = js.native
    def deferPublish(topic: String, msgs: js.Object, timeMs: Double): Unit = js.native
    def deferPublish(
      topic: String,
      msgs: js.Object,
      timeMs: Double,
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Unit = js.native
    def deferPublish(topic: String, msgs: Buffer, timeMs: Double): Unit = js.native
    def deferPublish(
      topic: String,
      msgs: Buffer,
      timeMs: Double,
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Unit = js.native
    
    val nsqdHost: String = js.native
    
    val nsqdPort: Double = js.native
    
    @JSName("on")
    def on_closed(event: closed, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
    
    def publish(topic: String, msgs: String): Unit = js.native
    def publish(topic: String, msgs: String, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    def publish(topic: String, msgs: js.Array[Buffer | js.Object | String]): Unit = js.native
    def publish(
      topic: String,
      msgs: js.Array[Buffer | js.Object | String],
      callback: js.Function1[js.UndefOr[Error], Unit]
    ): Unit = js.native
    def publish(topic: String, msgs: js.Object): Unit = js.native
    def publish(topic: String, msgs: js.Object, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    def publish(topic: String, msgs: Buffer): Unit = js.native
    def publish(topic: String, msgs: Buffer, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  }
  /* static members */
  object Writer {
    
    @JSImport("nsqjs", "Writer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("nsqjs", "Writer.CLOSED")
    @js.native
    def CLOSED: String = js.native
    @scala.inline
    def CLOSED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSED")(x.asInstanceOf[js.Any])
    
    @JSImport("nsqjs", "Writer.ERROR")
    @js.native
    def ERROR: String = js.native
    @scala.inline
    def ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("nsqjs", "Writer.READY")
    @js.native
    def READY: String = js.native
    @scala.inline
    def READY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("READY")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ConnectionConfigOptions extends StObject {
    
    var authSecret: js.UndefOr[String] = js.native
    
    var clientId: js.UndefOr[String] = js.native
    
    var deflate: js.UndefOr[Boolean] = js.native
    
    var deflateLevel: js.UndefOr[Double] = js.native
    
    var heartbeatInterval: js.UndefOr[Double] = js.native
    
    var idleTimeout: js.UndefOr[Double] = js.native
    
    var maxInFlight: js.UndefOr[Double] = js.native
    
    var messageTimeout: js.UndefOr[Double] = js.native
    
    var outputBufferSize: js.UndefOr[Double] = js.native
    
    var outputBufferTimeout: js.UndefOr[Double] = js.native
    
    var requeueDelay: js.UndefOr[Double] = js.native
    
    var sampleRate: js.UndefOr[Double] = js.native
    
    var snappy: js.UndefOr[Boolean] = js.native
    
    var tls: js.UndefOr[Boolean] = js.native
    
    var tlsVerification: js.UndefOr[Boolean] = js.native
  }
  object ConnectionConfigOptions {
    
    @scala.inline
    def apply(): ConnectionConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionConfigOptions]
    }
    
    @scala.inline
    implicit class ConnectionConfigOptionsMutableBuilder[Self <: ConnectionConfigOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthSecret(value: String): Self = StObject.set(x, "authSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthSecretUndefined: Self = StObject.set(x, "authSecret", js.undefined)
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      @scala.inline
      def setDeflate(value: Boolean): Self = StObject.set(x, "deflate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeflateLevel(value: Double): Self = StObject.set(x, "deflateLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeflateLevelUndefined: Self = StObject.set(x, "deflateLevel", js.undefined)
      
      @scala.inline
      def setDeflateUndefined: Self = StObject.set(x, "deflate", js.undefined)
      
      @scala.inline
      def setHeartbeatInterval(value: Double): Self = StObject.set(x, "heartbeatInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeartbeatIntervalUndefined: Self = StObject.set(x, "heartbeatInterval", js.undefined)
      
      @scala.inline
      def setIdleTimeout(value: Double): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdleTimeoutUndefined: Self = StObject.set(x, "idleTimeout", js.undefined)
      
      @scala.inline
      def setMaxInFlight(value: Double): Self = StObject.set(x, "maxInFlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxInFlightUndefined: Self = StObject.set(x, "maxInFlight", js.undefined)
      
      @scala.inline
      def setMessageTimeout(value: Double): Self = StObject.set(x, "messageTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageTimeoutUndefined: Self = StObject.set(x, "messageTimeout", js.undefined)
      
      @scala.inline
      def setOutputBufferSize(value: Double): Self = StObject.set(x, "outputBufferSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputBufferSizeUndefined: Self = StObject.set(x, "outputBufferSize", js.undefined)
      
      @scala.inline
      def setOutputBufferTimeout(value: Double): Self = StObject.set(x, "outputBufferTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputBufferTimeoutUndefined: Self = StObject.set(x, "outputBufferTimeout", js.undefined)
      
      @scala.inline
      def setRequeueDelay(value: Double): Self = StObject.set(x, "requeueDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequeueDelayUndefined: Self = StObject.set(x, "requeueDelay", js.undefined)
      
      @scala.inline
      def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
      
      @scala.inline
      def setSnappy(value: Boolean): Self = StObject.set(x, "snappy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnappyUndefined: Self = StObject.set(x, "snappy", js.undefined)
      
      @scala.inline
      def setTls(value: Boolean): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      @scala.inline
      def setTlsVerification(value: Boolean): Self = StObject.set(x, "tlsVerification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsVerificationUndefined: Self = StObject.set(x, "tlsVerification", js.undefined)
    }
  }
  
  @js.native
  trait ReaderConnectionConfigOptions extends ConnectionConfigOptions {
    
    var lookupdHTTPAddresses: js.UndefOr[String | js.Array[String]] = js.native
    
    var lookupdPollInterval: js.UndefOr[Double] = js.native
    
    var lookupdPollJitter: js.UndefOr[Double] = js.native
    
    var lowRdyTimeout: js.UndefOr[Double] = js.native
    
    var maxAttempts: js.UndefOr[Double] = js.native
    
    var maxBackoffDuration: js.UndefOr[Double] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var nsqdTCPAddresses: js.UndefOr[String | js.Array[String]] = js.native
  }
  object ReaderConnectionConfigOptions {
    
    @scala.inline
    def apply(): ReaderConnectionConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReaderConnectionConfigOptions]
    }
    
    @scala.inline
    implicit class ReaderConnectionConfigOptionsMutableBuilder[Self <: ReaderConnectionConfigOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLookupdHTTPAddresses(value: String | js.Array[String]): Self = StObject.set(x, "lookupdHTTPAddresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLookupdHTTPAddressesUndefined: Self = StObject.set(x, "lookupdHTTPAddresses", js.undefined)
      
      @scala.inline
      def setLookupdHTTPAddressesVarargs(value: String*): Self = StObject.set(x, "lookupdHTTPAddresses", js.Array(value :_*))
      
      @scala.inline
      def setLookupdPollInterval(value: Double): Self = StObject.set(x, "lookupdPollInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLookupdPollIntervalUndefined: Self = StObject.set(x, "lookupdPollInterval", js.undefined)
      
      @scala.inline
      def setLookupdPollJitter(value: Double): Self = StObject.set(x, "lookupdPollJitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLookupdPollJitterUndefined: Self = StObject.set(x, "lookupdPollJitter", js.undefined)
      
      @scala.inline
      def setLowRdyTimeout(value: Double): Self = StObject.set(x, "lowRdyTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowRdyTimeoutUndefined: Self = StObject.set(x, "lowRdyTimeout", js.undefined)
      
      @scala.inline
      def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAttemptsUndefined: Self = StObject.set(x, "maxAttempts", js.undefined)
      
      @scala.inline
      def setMaxBackoffDuration(value: Double): Self = StObject.set(x, "maxBackoffDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBackoffDurationUndefined: Self = StObject.set(x, "maxBackoffDuration", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNsqdTCPAddresses(value: String | js.Array[String]): Self = StObject.set(x, "nsqdTCPAddresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNsqdTCPAddressesUndefined: Self = StObject.set(x, "nsqdTCPAddresses", js.undefined)
      
      @scala.inline
      def setNsqdTCPAddressesVarargs(value: String*): Self = StObject.set(x, "nsqdTCPAddresses", js.Array(value :_*))
    }
  }
}
