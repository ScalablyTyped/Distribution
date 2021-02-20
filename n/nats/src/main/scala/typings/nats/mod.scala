package typings.nats

import typings.node.BufferEncoding
import typings.node.eventsMod.EventEmitter
import typings.node.tlsMod.TlsOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  
  @JSImport("nats", "connect")
  @js.native
  def connect(): Client = js.native
  @JSImport("nats", "connect")
  @js.native
  def connect(opts: ClientOpts): Client = js.native
  @JSImport("nats", "connect")
  @js.native
  def connect(url: js.UndefOr[scala.Nothing], opts: ClientOpts): Client = js.native
  @JSImport("nats", "connect")
  @js.native
  def connect(url: String): Client = js.native
  @JSImport("nats", "connect")
  @js.native
  def connect(url: String, opts: ClientOpts): Client = js.native
  @JSImport("nats", "connect")
  @js.native
  def connect(url: Double): Client = js.native
  @JSImport("nats", "connect")
  @js.native
  def connect(url: Double, opts: ClientOpts): Client = js.native
  
  @JSImport("nats", "createInbox")
  @js.native
  def createInbox(): String = js.native
  
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
  
  @js.native
  trait ClientOpts extends StObject {
    
    var encoding: js.UndefOr[BufferEncoding] = js.native
    
    var json: js.UndefOr[Boolean] = js.native
    
    var maxPingOut: js.UndefOr[Double] = js.native
    
    var maxReconnectAttempts: js.UndefOr[Double] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var nkey: js.UndefOr[String] = js.native
    
    var noEcho: js.UndefOr[Boolean] = js.native
    
    var noRandomize: js.UndefOr[Boolean] = js.native
    
    var nonceSigner: js.UndefOr[js.Function] = js.native
    
    var pass: js.UndefOr[String] = js.native
    
    var pedantic: js.UndefOr[Boolean] = js.native
    
    var pingInterval: js.UndefOr[Double] = js.native
    
    var preserveBuffers: js.UndefOr[Boolean] = js.native
    
    var reconnect: js.UndefOr[Boolean] = js.native
    
    var reconnectDelayHandler: js.UndefOr[js.Function0[Double]] = js.native
    
    var reconnectJitter: js.UndefOr[Double] = js.native
    
    var reconnectJitterTLS: js.UndefOr[Double] = js.native
    
    var reconnectTimeWait: js.UndefOr[Double] = js.native
    
    var servers: js.UndefOr[js.Array[String]] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var tls: js.UndefOr[Boolean | TlsOptions] = js.native
    
    var token: js.UndefOr[String] = js.native
    
    var tokenHandler: js.UndefOr[js.Function0[String]] = js.native
    
    var url: js.UndefOr[String] = js.native
    
    var useOldRequestStyle: js.UndefOr[Boolean] = js.native
    
    var user: js.UndefOr[String] = js.native
    
    var userCreds: js.UndefOr[String] = js.native
    
    var userJWT: js.UndefOr[js.Function0[String]] = js.native
    
    var verbose: js.UndefOr[Boolean] = js.native
    
    var waitOnFirstConnect: js.UndefOr[Boolean] = js.native
    
    var yieldTime: js.UndefOr[Double] = js.native
  }
  object ClientOpts {
    
    @scala.inline
    def apply(): ClientOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOpts]
    }
    
    @scala.inline
    implicit class ClientOptsMutableBuilder[Self <: ClientOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setMaxPingOut(value: Double): Self = StObject.set(x, "maxPingOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPingOutUndefined: Self = StObject.set(x, "maxPingOut", js.undefined)
      
      @scala.inline
      def setMaxReconnectAttempts(value: Double): Self = StObject.set(x, "maxReconnectAttempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxReconnectAttemptsUndefined: Self = StObject.set(x, "maxReconnectAttempts", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNkey(value: String): Self = StObject.set(x, "nkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNkeyUndefined: Self = StObject.set(x, "nkey", js.undefined)
      
      @scala.inline
      def setNoEcho(value: Boolean): Self = StObject.set(x, "noEcho", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoEchoUndefined: Self = StObject.set(x, "noEcho", js.undefined)
      
      @scala.inline
      def setNoRandomize(value: Boolean): Self = StObject.set(x, "noRandomize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoRandomizeUndefined: Self = StObject.set(x, "noRandomize", js.undefined)
      
      @scala.inline
      def setNonceSigner(value: js.Function): Self = StObject.set(x, "nonceSigner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceSignerUndefined: Self = StObject.set(x, "nonceSigner", js.undefined)
      
      @scala.inline
      def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
      
      @scala.inline
      def setPedantic(value: Boolean): Self = StObject.set(x, "pedantic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPedanticUndefined: Self = StObject.set(x, "pedantic", js.undefined)
      
      @scala.inline
      def setPingInterval(value: Double): Self = StObject.set(x, "pingInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPingIntervalUndefined: Self = StObject.set(x, "pingInterval", js.undefined)
      
      @scala.inline
      def setPreserveBuffers(value: Boolean): Self = StObject.set(x, "preserveBuffers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveBuffersUndefined: Self = StObject.set(x, "preserveBuffers", js.undefined)
      
      @scala.inline
      def setReconnect(value: Boolean): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnectDelayHandler(value: () => Double): Self = StObject.set(x, "reconnectDelayHandler", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReconnectDelayHandlerUndefined: Self = StObject.set(x, "reconnectDelayHandler", js.undefined)
      
      @scala.inline
      def setReconnectJitter(value: Double): Self = StObject.set(x, "reconnectJitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnectJitterTLS(value: Double): Self = StObject.set(x, "reconnectJitterTLS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnectJitterTLSUndefined: Self = StObject.set(x, "reconnectJitterTLS", js.undefined)
      
      @scala.inline
      def setReconnectJitterUndefined: Self = StObject.set(x, "reconnectJitter", js.undefined)
      
      @scala.inline
      def setReconnectTimeWait(value: Double): Self = StObject.set(x, "reconnectTimeWait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnectTimeWaitUndefined: Self = StObject.set(x, "reconnectTimeWait", js.undefined)
      
      @scala.inline
      def setReconnectUndefined: Self = StObject.set(x, "reconnect", js.undefined)
      
      @scala.inline
      def setServers(value: js.Array[String]): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServersUndefined: Self = StObject.set(x, "servers", js.undefined)
      
      @scala.inline
      def setServersVarargs(value: String*): Self = StObject.set(x, "servers", js.Array(value :_*))
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTls(value: Boolean | TlsOptions): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenHandler(value: () => String): Self = StObject.set(x, "tokenHandler", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTokenHandlerUndefined: Self = StObject.set(x, "tokenHandler", js.undefined)
      
      @scala.inline
      def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setUseOldRequestStyle(value: Boolean): Self = StObject.set(x, "useOldRequestStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseOldRequestStyleUndefined: Self = StObject.set(x, "useOldRequestStyle", js.undefined)
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserCreds(value: String): Self = StObject.set(x, "userCreds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserCredsUndefined: Self = StObject.set(x, "userCreds", js.undefined)
      
      @scala.inline
      def setUserJWT(value: () => String): Self = StObject.set(x, "userJWT", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUserJWTUndefined: Self = StObject.set(x, "userJWT", js.undefined)
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      @scala.inline
      def setWaitOnFirstConnect(value: Boolean): Self = StObject.set(x, "waitOnFirstConnect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitOnFirstConnectUndefined: Self = StObject.set(x, "waitOnFirstConnect", js.undefined)
      
      @scala.inline
      def setYieldTime(value: Double): Self = StObject.set(x, "yieldTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYieldTimeUndefined: Self = StObject.set(x, "yieldTime", js.undefined)
    }
  }
  
  @js.native
  trait NatsError extends Error {
    
    var chainedError: Error = js.native
    
    var code: String = js.native
  }
  object NatsError {
    
    @scala.inline
    def apply(chainedError: Error, code: String, message: String, name: String): NatsError = {
      val __obj = js.Dynamic.literal(chainedError = chainedError.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NatsError]
    }
    
    @scala.inline
    implicit class NatsErrorMutableBuilder[Self <: NatsError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChainedError(value: Error): Self = StObject.set(x, "chainedError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RequestOptions extends StObject {
    
    var max: js.UndefOr[Double] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object RequestOptions {
    
    @scala.inline
    def apply(): RequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptions]
    }
    
    @scala.inline
    implicit class RequestOptionsMutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait SubscribeOptions extends StObject {
    
    var max: js.UndefOr[Double] = js.native
    
    var queue: js.UndefOr[String] = js.native
  }
  object SubscribeOptions {
    
    @scala.inline
    def apply(): SubscribeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscribeOptions]
    }
    
    @scala.inline
    implicit class SubscribeOptionsMutableBuilder[Self <: SubscribeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
    }
  }
}
