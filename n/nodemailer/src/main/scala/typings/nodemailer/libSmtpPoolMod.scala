package typings.nodemailer

import typings.node.eventsMod.EventEmitter
import typings.node.netMod.Socket
import typings.node.tlsMod.ConnectionOptions
import typings.nodemailer.libMimeNodeMod.Envelope
import typings.nodemailer.libSharedMod.Logger
import typings.nodemailer.libSmtpConnectionMod.AuthenticationType
import typings.nodemailer.libSmtpConnectionMod.CustomAuthenticationHandlers
import typings.nodemailer.libSmtpConnectionMod.DSNOptions
import typings.nodemailer.libSmtpConnectionMod.ms
import typings.nodemailer.mod.Transport
import typings.nodemailer.mod.TransportOptions
import typings.nodemailer.nodemailerBooleans.`true`
import typings.nodemailer.nodemailerStrings.idle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSmtpPoolMod {
  
  /**
    * Creates a SMTP pool transport object for Nodemailer
    */
  @JSImport("nodemailer/lib/smtp-pool", JSImport.Namespace)
  @js.native
  open class ^ () extends SMTPPool {
    def this(options: String) = this()
    def this(options: Options) = this()
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    override def send(
      mail: typings.nodemailer.libMailerMailMessageMod.^[SentMessageInfo],
      callback: js.Function2[/* err */ js.Error | Null, SentMessageInfo, Unit]
    ): Unit = js.native
    
    /* CompleteClass */
    var version: String = js.native
  }
  
  trait MailOptions
    extends StObject
       with typings.nodemailer.libMailerMod.Options {
    
    var auth: js.UndefOr[AuthenticationType] = js.undefined
    
    var dsn: js.UndefOr[DSNOptions] = js.undefined
  }
  object MailOptions {
    
    inline def apply(): MailOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MailOptions]
    }
    
    extension [Self <: MailOptions](x: Self) {
      
      inline def setAuth(value: AuthenticationType): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setDsn(value: DSNOptions): Self = StObject.set(x, "dsn", value.asInstanceOf[js.Any])
      
      inline def setDsnUndefined: Self = StObject.set(x, "dsn", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.nodemailer.libSmtpConnectionMod.Options because var conflicts: auth. Inlined host, port, secure, ignoreTLS, requireTLS, opportunisticTLS, name, localAddress, connectionTimeout, greetingTimeout, socketTimeout, logger, transactionLog, debug, authMethod, tls, socket, connection, customAuth */ trait Options
    extends StObject
       with MailOptions
       with TransportOptions {
    
    /** defines preferred authentication method, e.g. ‘PLAIN’ */
    var authMethod: js.UndefOr[String] = js.undefined
    
    /** connected socket to use instead of creating and connecting a new one. If secure option is true, then socket is upgraded from plaintext to ciphertext */
    var connection: js.UndefOr[Socket] = js.undefined
    
    /** how many milliseconds to wait for the connection to establish */
    var connectionTimeout: js.UndefOr[ms] = js.undefined
    
    var customAuth: js.UndefOr[CustomAuthenticationHandlers] = js.undefined
    
    /** if set to true, then logs SMTP traffic and message content, otherwise logs only transaction events */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var getSocket: js.UndefOr[
        js.Function2[
          /* options */ this.type, 
          /* callback */ js.Function2[/* err */ js.Error | Null, /* socketOptions */ Any, Unit], 
          Unit
        ]
      ] = js.undefined
    
    /** how many milliseconds to wait for the greeting after connection is established */
    var greetingTimeout: js.UndefOr[ms] = js.undefined
    
    /** the hostname or IP address to connect to (defaults to ‘localhost’) */
    var host: js.UndefOr[String] = js.undefined
    
    /** turns off STARTTLS support if true */
    var ignoreTLS: js.UndefOr[Boolean] = js.undefined
    
    /** the local interface to bind to for network connections */
    var localAddress: js.UndefOr[String] = js.undefined
    
    /** optional bunyan compatible logger instance. If set to true then logs to console. If value is not set or is false then nothing is logged */
    var logger: js.UndefOr[Logger | Boolean] = js.undefined
    
    /** the count of maximum simultaneous connections to make against the SMTP server (defaults to 5) */
    var maxConnections: js.UndefOr[Double] = js.undefined
    
    /** limits the message count to be sent using a single connection (defaults to 100). After maxMessages is reached the connection is dropped and a new one is created for the following messages */
    var maxMessages: js.UndefOr[Double] = js.undefined
    
    /** optional hostname of the client, used for identifying to the server */
    var name: js.UndefOr[String] = js.undefined
    
    /** tries to use STARTTLS and continues normally if it fails */
    var opportunisticTLS: js.UndefOr[Boolean] = js.undefined
    
    /** set to true to use pooled connections (defaults to false) instead of creating a new connection for every email */
    var pool: `true`
    
    /** the port to connect to (defaults to 25 or 465) */
    var port: js.UndefOr[Double] = js.undefined
    
    /** defines the time measuring period in milliseconds (defaults to 1000, ie. to 1 second) for rate limiting */
    var rateDelta: js.UndefOr[Double] = js.undefined
    
    /** limits the message count to be sent in rateDelta time. Once rateLimit is reached, sending is paused until the end of the measuring period. This limit is shared between connections, so if one connection uses up the limit, then other connections are paused as well. If rateLimit is not set then sending rate is not limited */
    var rateLimit: js.UndefOr[Double] = js.undefined
    
    /** forces the client to use STARTTLS. Returns an error if upgrading the connection is not possible or fails. */
    var requireTLS: js.UndefOr[Boolean] = js.undefined
    
    /** defines if the connection should use SSL (if true) or not (if false) */
    var secure: js.UndefOr[Boolean] = js.undefined
    
    var service: js.UndefOr[String] = js.undefined
    
    /** initialized socket to use instead of creating a new one */
    var socket: js.UndefOr[Socket] = js.undefined
    
    /** how many milliseconds of inactivity to allow */
    var socketTimeout: js.UndefOr[ms] = js.undefined
    
    /** defines additional options to be passed to the socket constructor, e.g. {rejectUnauthorized: true} */
    var tls: js.UndefOr[ConnectionOptions] = js.undefined
    
    /** if set to true, then logs SMTP traffic without message content */
    var transactionLog: js.UndefOr[Boolean] = js.undefined
    
    // TODO http.ClientRequest?
    var url: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal(pool = true)
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAuthMethod(value: String): Self = StObject.set(x, "authMethod", value.asInstanceOf[js.Any])
      
      inline def setAuthMethodUndefined: Self = StObject.set(x, "authMethod", js.undefined)
      
      inline def setConnection(value: Socket): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setConnectionTimeout(value: ms): Self = StObject.set(x, "connectionTimeout", value.asInstanceOf[js.Any])
      
      inline def setConnectionTimeoutUndefined: Self = StObject.set(x, "connectionTimeout", js.undefined)
      
      inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
      
      inline def setCustomAuth(value: CustomAuthenticationHandlers): Self = StObject.set(x, "customAuth", value.asInstanceOf[js.Any])
      
      inline def setCustomAuthUndefined: Self = StObject.set(x, "customAuth", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setGetSocket(
        value: (Options, /* callback */ js.Function2[/* err */ js.Error | Null, /* socketOptions */ Any, Unit]) => Unit
      ): Self = StObject.set(x, "getSocket", js.Any.fromFunction2(value))
      
      inline def setGetSocketUndefined: Self = StObject.set(x, "getSocket", js.undefined)
      
      inline def setGreetingTimeout(value: ms): Self = StObject.set(x, "greetingTimeout", value.asInstanceOf[js.Any])
      
      inline def setGreetingTimeoutUndefined: Self = StObject.set(x, "greetingTimeout", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setIgnoreTLS(value: Boolean): Self = StObject.set(x, "ignoreTLS", value.asInstanceOf[js.Any])
      
      inline def setIgnoreTLSUndefined: Self = StObject.set(x, "ignoreTLS", js.undefined)
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      inline def setLogger(value: Logger | Boolean): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setMaxConnections(value: Double): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
      
      inline def setMaxConnectionsUndefined: Self = StObject.set(x, "maxConnections", js.undefined)
      
      inline def setMaxMessages(value: Double): Self = StObject.set(x, "maxMessages", value.asInstanceOf[js.Any])
      
      inline def setMaxMessagesUndefined: Self = StObject.set(x, "maxMessages", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOpportunisticTLS(value: Boolean): Self = StObject.set(x, "opportunisticTLS", value.asInstanceOf[js.Any])
      
      inline def setOpportunisticTLSUndefined: Self = StObject.set(x, "opportunisticTLS", js.undefined)
      
      inline def setPool(value: `true`): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setRateDelta(value: Double): Self = StObject.set(x, "rateDelta", value.asInstanceOf[js.Any])
      
      inline def setRateDeltaUndefined: Self = StObject.set(x, "rateDelta", js.undefined)
      
      inline def setRateLimit(value: Double): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
      
      inline def setRateLimitUndefined: Self = StObject.set(x, "rateLimit", js.undefined)
      
      inline def setRequireTLS(value: Boolean): Self = StObject.set(x, "requireTLS", value.asInstanceOf[js.Any])
      
      inline def setRequireTLSUndefined: Self = StObject.set(x, "requireTLS", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
      
      inline def setSocket(value: Socket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      inline def setSocketTimeout(value: ms): Self = StObject.set(x, "socketTimeout", value.asInstanceOf[js.Any])
      
      inline def setSocketTimeoutUndefined: Self = StObject.set(x, "socketTimeout", js.undefined)
      
      inline def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
      
      inline def setTls(value: ConnectionOptions): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      inline def setTransactionLog(value: Boolean): Self = StObject.set(x, "transactionLog", value.asInstanceOf[js.Any])
      
      inline def setTransactionLogUndefined: Self = StObject.set(x, "transactionLog", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /**
    * Creates a SMTP pool transport object for Nodemailer
    */
  @js.native
  trait SMTPPool
    extends EventEmitter
       with Transport[SentMessageInfo] {
    
    @JSName("addListener")
    def addListener_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
    
    /** Closes all connections in the pool. If there is a message being sent, the connection is closed later */
    @JSName("close")
    def close_MSMTPPool(): Unit = js.native
    
    @JSName("emit")
    def emit_idle(event: idle): Boolean = js.native
    
    /** Placeholder function for creating proxy sockets. This method immediatelly returns without a socket */
    def getSocket(options: Options, callback: js.Function2[/* err */ js.Error | Null, /* socketOptions */ Any, Unit]): Unit = js.native
    
    var idling: Boolean = js.native
    
    /** Returns true if there are free slots in the queue */
    def isIdle(): Boolean = js.native
    
    @JSName("listeners")
    def listeners_idle(event: idle): js.Array[js.Function0[Unit]] = js.native
    
    var logger: Logger = js.native
    
    @JSName("mailer")
    var mailer_SMTPPool: typings.nodemailer.libMailerMod.^[SentMessageInfo] = js.native
    
    @JSName("on")
    def on_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("once")
    def once_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
    
    var options: Options = js.native
    
    @JSName("prependListener")
    def prependListener_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("verify")
    def verify_MSMTPPool(): js.Promise[`true`] = js.native
    /** Verifies SMTP configuration */
    @JSName("verify")
    def verify_true(callback: js.Function2[/* err */ js.Error | Null, `true`, Unit]): Unit = js.native
  }
  
  trait SentMessageInfo
    extends StObject
       with typings.nodemailer.libSmtpConnectionMod.SentMessageInfo {
    
    /** includes the envelope object for the message */
    var envelope: Envelope
    
    /** most transports should return the final Message-Id value used with this property */
    var messageId: String
  }
  object SentMessageInfo {
    
    inline def apply(
      accepted: js.Array[String],
      envelope: Envelope,
      envelopeTime: Double,
      messageId: String,
      messageSize: Double,
      messageTime: Double,
      rejected: js.Array[String],
      response: String
    ): SentMessageInfo = {
      val __obj = js.Dynamic.literal(accepted = accepted.asInstanceOf[js.Any], envelope = envelope.asInstanceOf[js.Any], envelopeTime = envelopeTime.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], messageSize = messageSize.asInstanceOf[js.Any], messageTime = messageTime.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[SentMessageInfo]
    }
    
    extension [Self <: SentMessageInfo](x: Self) {
      
      inline def setEnvelope(value: Envelope): Self = StObject.set(x, "envelope", value.asInstanceOf[js.Any])
      
      inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    }
  }
}
