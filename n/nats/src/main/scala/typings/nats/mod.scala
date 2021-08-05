package typings.nats

import typings.node.BufferEncoding
import typings.node.eventsMod.EventEmitter
import typings.node.tlsMod.TlsOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nats", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("nats", "BAD_AUTHENTICATION")
  @js.native
  val BAD_AUTHENTICATION: String = js.native
  
  @JSImport("nats", "BAD_CALLBACK")
  @js.native
  val BAD_CALLBACK: String = js.native
  
  @JSImport("nats", "BAD_CREDS")
  @js.native
  val BAD_CREDS: String = js.native
  
  @JSImport("nats", "BAD_JSON")
  @js.native
  val BAD_JSON: String = js.native
  
  @JSImport("nats", "BAD_MSG")
  @js.native
  val BAD_MSG: String = js.native
  
  @JSImport("nats", "BAD_OPTIONS")
  @js.native
  val BAD_OPTIONS: String = js.native
  
  @JSImport("nats", "BAD_REPLY")
  @js.native
  val BAD_REPLY: String = js.native
  
  @JSImport("nats", "BAD_SUBJECT")
  @js.native
  val BAD_SUBJECT: String = js.native
  
  @JSImport("nats", "BAD_TIMEOUT")
  @js.native
  val BAD_TIMEOUT: String = js.native
  
  @JSImport("nats", "CLIENT_CERT_REQ")
  @js.native
  val CLIENT_CERT_REQ: String = js.native
  
  @JSImport("nats", "CONN_CLOSED")
  @js.native
  val CONN_CLOSED: String = js.native
  
  @JSImport("nats", "CONN_DRAINING")
  @js.native
  val CONN_DRAINING: String = js.native
  
  @JSImport("nats", "CONN_ERR")
  @js.native
  val CONN_ERR: String = js.native
  
  @JSImport("nats", "CONN_TIMEOUT")
  @js.native
  val CONN_TIMEOUT: String = js.native
  
  @JSImport("nats", "INVALID_ENCODING")
  @js.native
  val INVALID_ENCODING: String = js.native
  
  @JSImport("nats", "NATS_PROTOCOL_ERR")
  @js.native
  val NATS_PROTOCOL_ERR: String = js.native
  
  @JSImport("nats", "NKEY_OR_JWT_REQ")
  @js.native
  val NKEY_OR_JWT_REQ: String = js.native
  
  @JSImport("nats", "NON_SECURE_CONN_REQ")
  @js.native
  val NON_SECURE_CONN_REQ: String = js.native
  
  @JSImport("nats", "NO_ECHO_NOT_SUPPORTED")
  @js.native
  val NO_ECHO_NOT_SUPPORTED: String = js.native
  
  @JSImport("nats", "NO_SEED_IN_CREDS")
  @js.native
  val NO_SEED_IN_CREDS: String = js.native
  
  @JSImport("nats", "NO_USER_JWT_IN_CREDS")
  @js.native
  val NO_USER_JWT_IN_CREDS: String = js.native
  
  @JSImport("nats", "OPENSSL_ERR")
  @js.native
  val OPENSSL_ERR: String = js.native
  
  @JSImport("nats", "PERMISSIONS_ERR")
  @js.native
  val PERMISSIONS_ERR: String = js.native
  
  @JSImport("nats", "REQ_TIMEOUT")
  @js.native
  val REQ_TIMEOUT: String = js.native
  
  @JSImport("nats", "SECURE_CONN_REQ")
  @js.native
  val SECURE_CONN_REQ: String = js.native
  
  @JSImport("nats", "SIGCB_NOTFUNC")
  @js.native
  val SIGCB_NOTFUNC: String = js.native
  
  @JSImport("nats", "SIGNATURE_REQUIRED")
  @js.native
  val SIGNATURE_REQUIRED: String = js.native
  
  @JSImport("nats", "STALE_CONNECTION_ERR")
  @js.native
  val STALE_CONNECTION_ERR: String = js.native
  
  @JSImport("nats", "SUB_DRAINING")
  @js.native
  val SUB_DRAINING: String = js.native
  
  inline def connect(): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")().asInstanceOf[Client]
  inline def connect(opts: ClientOpts): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(opts.asInstanceOf[js.Any]).asInstanceOf[Client]
  inline def connect(url: String): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any]).asInstanceOf[Client]
  inline def connect(url: String, opts: ClientOpts): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Client]
  inline def connect(url: Double): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any]).asInstanceOf[Client]
  inline def connect(url: Double, opts: ClientOpts): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Client]
  inline def connect(url: Unit, opts: ClientOpts): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Client]
  
  inline def createInbox(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createInbox")().asInstanceOf[String]
  
  @JSImport("nats", "version")
  @js.native
  val version: String = js.native
  
  @js.native
  trait Client extends EventEmitter {
    
    /**
    	 * Close the connection to the server.
    	 */
    def close(): Unit = js.native
    
    /**
    	 * Create a properly formatted inbox subject.
    	 */
    def createInbox(): String = js.native
    
    /**
    	 * Drains all subscriptions. If an opt_callback is provided, the callback
    	 * is called if there's an error with an error argument.
    	 *
    	 * Note that after calling drain, it is impossible to create new subscriptions
    	 * or any requests. As soon as all messages for the draining subscriptions are
    	 * processed, it is also impossible to publish new messages.
    	 *
    	 * A drained connection is closed when the opt_callback is called without arguments.
    	 * @param callback
    	 */
    def drain(): Unit = js.native
    def drain(callback: js.Function): Unit = js.native
    
    /**
    	 * Draining a subscription is similar to unsubscribe but inbound pending messages are
    	 * not discarded. When the last in-flight message is processed, the subscription handler
    	 * is removed.
    	 * @param sid
    	 * @param callback
    	 */
    def drainSubscription(sid: Double): Unit = js.native
    def drainSubscription(sid: Double, callback: js.Function): Unit = js.native
    
    /**
    	 * Flush outbound queue to server and call optional callback when server has processed
    	 * all data.
    	 */
    def flush(): Unit = js.native
    def flush(callback: js.Function): Unit = js.native
    
    /**
    	 * Report number of outstanding subscriptions on this connection.
    	 */
    def numSubscriptions(): Double = js.native
    
    /**
    	 * Publish a message to the given subject, with optional reply and callback.
    	 */
    def publish(subject: String): Unit = js.native
    def publish(subject: String, callback: js.Function): Unit = js.native
    def publish(subject: String, msg: js.Any): Unit = js.native
    def publish(subject: String, msg: js.Any, callback: js.Function): Unit = js.native
    def publish(subject: String, msg: js.Any, reply: String): Unit = js.native
    def publish(subject: String, msg: js.Any, reply: String, callback: js.Function): Unit = js.native
    
    /**
    	 * Publish a message with an implicit inbox listener as the reply. Message is optional.
    	 * This should be treated as a subscription. You can optionally indicate how many
    	 * messages you only want to receive and how long to wait for the messages using
    	 * opt_options = {max:N, timeout:N}. Otherwise you will need to unsubscribe to stop
    	 * the message stream manually by calling unsubscribe() on the subscription id returned.
    	 */
    def request(subject: String, callback: js.Function): Double = js.native
    def request(subject: String, msg: js.Any, callback: js.Function): Double = js.native
    def request(subject: String, msg: js.Any, options: RequestOptions, callback: js.Function): Double = js.native
    
    def requestOne(subject: String, msg: js.Any, options: RequestOptions, timeout: Double, callback: js.Function): Double = js.native
    def requestOne(subject: String, msg: js.Any, timeout: Double, callback: js.Function): Double = js.native
    /**
    	 * Publish a message with an implicit inbox listener as the reply. Message is optional.
    	 * This should be treated as a subscription. Request one, will terminate the subscription
    	 * after the first response is received or the timeout is reached.
    	 * The callback can be called with either a message payload or a NatsError to indicate
    	 * a timeout has been reached.
    	 * The subscription id is returned.
    	 */
    def requestOne(subject: String, timeout: Double, callback: js.Function): Double = js.native
    
    /**
    	 * Subscribe to a given subject, with optional options and callback. opts can be
    	 * omitted, even with a callback. A subscription id is returned.
    	 */
    def subscribe(subject: String, callback: js.Function): Double = js.native
    def subscribe(subject: String, opts: SubscribeOptions, callback: js.Function): Double = js.native
    
    /**
    	 * Set a timeout on a subscription.
    	 */
    def timeout(sid: Double, timeout: Double, expected: Double, callback: js.Function1[/* sid */ Double, Unit]): Unit = js.native
    
    /**
    	 * Unsubscribe to a given subscription id, with optional max number of messages before unsubscribing.
    	 */
    def unsubscribe(sid: Double): Unit = js.native
    def unsubscribe(sid: Double, max: Double): Unit = js.native
  }
  
  trait ClientOpts extends StObject {
    
    var encoding: js.UndefOr[BufferEncoding] = js.undefined
    
    var json: js.UndefOr[Boolean] = js.undefined
    
    var maxPingOut: js.UndefOr[Double] = js.undefined
    
    var maxReconnectAttempts: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var nkey: js.UndefOr[String] = js.undefined
    
    var noEcho: js.UndefOr[Boolean] = js.undefined
    
    var noRandomize: js.UndefOr[Boolean] = js.undefined
    
    var nonceSigner: js.UndefOr[js.Function] = js.undefined
    
    var pass: js.UndefOr[String] = js.undefined
    
    var pedantic: js.UndefOr[Boolean] = js.undefined
    
    var pingInterval: js.UndefOr[Double] = js.undefined
    
    var preserveBuffers: js.UndefOr[Boolean] = js.undefined
    
    var reconnect: js.UndefOr[Boolean] = js.undefined
    
    var reconnectDelayHandler: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var reconnectJitter: js.UndefOr[Double] = js.undefined
    
    var reconnectJitterTLS: js.UndefOr[Double] = js.undefined
    
    var reconnectTimeWait: js.UndefOr[Double] = js.undefined
    
    var servers: js.UndefOr[js.Array[String]] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var tls: js.UndefOr[Boolean | TlsOptions] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
    
    var tokenHandler: js.UndefOr[js.Function0[String]] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var useOldRequestStyle: js.UndefOr[Boolean] = js.undefined
    
    var user: js.UndefOr[String] = js.undefined
    
    var userCreds: js.UndefOr[String] = js.undefined
    
    var userJWT: js.UndefOr[js.Function0[String]] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
    
    var waitOnFirstConnect: js.UndefOr[Boolean] = js.undefined
    
    var yieldTime: js.UndefOr[Double] = js.undefined
  }
  object ClientOpts {
    
    inline def apply(): ClientOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOpts]
    }
    
    extension [Self <: ClientOpts](x: Self) {
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setMaxPingOut(value: Double): Self = StObject.set(x, "maxPingOut", value.asInstanceOf[js.Any])
      
      inline def setMaxPingOutUndefined: Self = StObject.set(x, "maxPingOut", js.undefined)
      
      inline def setMaxReconnectAttempts(value: Double): Self = StObject.set(x, "maxReconnectAttempts", value.asInstanceOf[js.Any])
      
      inline def setMaxReconnectAttemptsUndefined: Self = StObject.set(x, "maxReconnectAttempts", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNkey(value: String): Self = StObject.set(x, "nkey", value.asInstanceOf[js.Any])
      
      inline def setNkeyUndefined: Self = StObject.set(x, "nkey", js.undefined)
      
      inline def setNoEcho(value: Boolean): Self = StObject.set(x, "noEcho", value.asInstanceOf[js.Any])
      
      inline def setNoEchoUndefined: Self = StObject.set(x, "noEcho", js.undefined)
      
      inline def setNoRandomize(value: Boolean): Self = StObject.set(x, "noRandomize", value.asInstanceOf[js.Any])
      
      inline def setNoRandomizeUndefined: Self = StObject.set(x, "noRandomize", js.undefined)
      
      inline def setNonceSigner(value: js.Function): Self = StObject.set(x, "nonceSigner", value.asInstanceOf[js.Any])
      
      inline def setNonceSignerUndefined: Self = StObject.set(x, "nonceSigner", js.undefined)
      
      inline def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      inline def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
      
      inline def setPedantic(value: Boolean): Self = StObject.set(x, "pedantic", value.asInstanceOf[js.Any])
      
      inline def setPedanticUndefined: Self = StObject.set(x, "pedantic", js.undefined)
      
      inline def setPingInterval(value: Double): Self = StObject.set(x, "pingInterval", value.asInstanceOf[js.Any])
      
      inline def setPingIntervalUndefined: Self = StObject.set(x, "pingInterval", js.undefined)
      
      inline def setPreserveBuffers(value: Boolean): Self = StObject.set(x, "preserveBuffers", value.asInstanceOf[js.Any])
      
      inline def setPreserveBuffersUndefined: Self = StObject.set(x, "preserveBuffers", js.undefined)
      
      inline def setReconnect(value: Boolean): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
      
      inline def setReconnectDelayHandler(value: () => Double): Self = StObject.set(x, "reconnectDelayHandler", js.Any.fromFunction0(value))
      
      inline def setReconnectDelayHandlerUndefined: Self = StObject.set(x, "reconnectDelayHandler", js.undefined)
      
      inline def setReconnectJitter(value: Double): Self = StObject.set(x, "reconnectJitter", value.asInstanceOf[js.Any])
      
      inline def setReconnectJitterTLS(value: Double): Self = StObject.set(x, "reconnectJitterTLS", value.asInstanceOf[js.Any])
      
      inline def setReconnectJitterTLSUndefined: Self = StObject.set(x, "reconnectJitterTLS", js.undefined)
      
      inline def setReconnectJitterUndefined: Self = StObject.set(x, "reconnectJitter", js.undefined)
      
      inline def setReconnectTimeWait(value: Double): Self = StObject.set(x, "reconnectTimeWait", value.asInstanceOf[js.Any])
      
      inline def setReconnectTimeWaitUndefined: Self = StObject.set(x, "reconnectTimeWait", js.undefined)
      
      inline def setReconnectUndefined: Self = StObject.set(x, "reconnect", js.undefined)
      
      inline def setServers(value: js.Array[String]): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
      
      inline def setServersUndefined: Self = StObject.set(x, "servers", js.undefined)
      
      inline def setServersVarargs(value: String*): Self = StObject.set(x, "servers", js.Array(value :_*))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTls(value: Boolean | TlsOptions): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenHandler(value: () => String): Self = StObject.set(x, "tokenHandler", js.Any.fromFunction0(value))
      
      inline def setTokenHandlerUndefined: Self = StObject.set(x, "tokenHandler", js.undefined)
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUseOldRequestStyle(value: Boolean): Self = StObject.set(x, "useOldRequestStyle", value.asInstanceOf[js.Any])
      
      inline def setUseOldRequestStyleUndefined: Self = StObject.set(x, "useOldRequestStyle", js.undefined)
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserCreds(value: String): Self = StObject.set(x, "userCreds", value.asInstanceOf[js.Any])
      
      inline def setUserCredsUndefined: Self = StObject.set(x, "userCreds", js.undefined)
      
      inline def setUserJWT(value: () => String): Self = StObject.set(x, "userJWT", js.Any.fromFunction0(value))
      
      inline def setUserJWTUndefined: Self = StObject.set(x, "userJWT", js.undefined)
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      inline def setWaitOnFirstConnect(value: Boolean): Self = StObject.set(x, "waitOnFirstConnect", value.asInstanceOf[js.Any])
      
      inline def setWaitOnFirstConnectUndefined: Self = StObject.set(x, "waitOnFirstConnect", js.undefined)
      
      inline def setYieldTime(value: Double): Self = StObject.set(x, "yieldTime", value.asInstanceOf[js.Any])
      
      inline def setYieldTimeUndefined: Self = StObject.set(x, "yieldTime", js.undefined)
    }
  }
  
  trait NatsError
    extends StObject
       with Error {
    
    var chainedError: Error
    
    var code: String
  }
  object NatsError {
    
    inline def apply(chainedError: Error, code: String, message: String, name: String): NatsError = {
      val __obj = js.Dynamic.literal(chainedError = chainedError.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NatsError]
    }
    
    extension [Self <: NatsError](x: Self) {
      
      inline def setChainedError(value: Error): Self = StObject.set(x, "chainedError", value.asInstanceOf[js.Any])
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestOptions extends StObject {
    
    var max: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object RequestOptions {
    
    inline def apply(): RequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptions]
    }
    
    extension [Self <: RequestOptions](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait SubscribeOptions extends StObject {
    
    var max: js.UndefOr[Double] = js.undefined
    
    var queue: js.UndefOr[String] = js.undefined
  }
  object SubscribeOptions {
    
    inline def apply(): SubscribeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscribeOptions]
    }
    
    extension [Self <: SubscribeOptions](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      inline def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
    }
  }
}
