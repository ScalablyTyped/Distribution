package typings.nodemailer

import typings.node.eventsMod.EventEmitter
import typings.node.netMod.Socket
import typings.node.tlsMod.ConnectionOptions
import typings.nodemailer.mimeNodeMod.Envelope
import typings.nodemailer.mod.Transport
import typings.nodemailer.mod.TransportOptions
import typings.nodemailer.nodemailerBooleans.`false`
import typings.nodemailer.nodemailerBooleans.`true`
import typings.nodemailer.nodemailerStrings.CUSTOM
import typings.nodemailer.nodemailerStrings.LOGIN
import typings.nodemailer.nodemailerStrings.OAUTH2
import typings.nodemailer.nodemailerStrings.XOAUTH2
import typings.nodemailer.nodemailerStrings.close
import typings.nodemailer.nodemailerStrings.error
import typings.nodemailer.sharedMod.Logger
import typings.nodemailer.smtpConnectionMod.Credentials
import typings.nodemailer.smtpConnectionMod.CustomAuthenticationHandlers
import typings.nodemailer.smtpConnectionMod.DSNOptions
import typings.nodemailer.smtpConnectionMod.ms
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object smtpTransportMod {
  
  @JSImport("nodemailer/lib/smtp-transport", JSImport.Namespace)
  @js.native
  class ^ protected () extends SMTPTransport {
    def this(options: String) = this()
    def this(options: Options) = this()
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    override def send(
      mail: typings.nodemailer.mailMessageMod.^,
      callback: js.Function2[/* err */ Error | Null, /* info */ typings.nodemailer.mod.SentMessageInfo, Unit]
    ): Unit = js.native
    
    /* CompleteClass */
    var verify: (js.UndefOr[
        js.Function1[/* callback */ js.Function2[/* err */ Error | Null, `true`, Unit], Unit]
      ]) & js.UndefOr[js.Function0[js.Promise[`true`]]] = js.native
    
    /* CompleteClass */
    var version: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodemailer.smtpTransportMod.AuthenticationTypeLogin
    - typings.nodemailer.smtpTransportMod.AuthenticationTypeOAuth2
  */
  trait AuthenticationType extends StObject
  object AuthenticationType {
    
    inline def AuthenticationTypeLogin(credentials: Credentials, method: String | `false`, user: String): typings.nodemailer.smtpTransportMod.AuthenticationTypeLogin = {
      val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("LOGIN")
      __obj.asInstanceOf[typings.nodemailer.smtpTransportMod.AuthenticationTypeLogin]
    }
    
    inline def AuthenticationTypeOAuth2(oauth2: typings.nodemailer.xoauth2Mod.^, user: String): typings.nodemailer.smtpTransportMod.AuthenticationTypeOAuth2 = {
      val __obj = js.Dynamic.literal(method = "XOAUTH2", oauth2 = oauth2.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("OAUTH2")
      __obj.asInstanceOf[typings.nodemailer.smtpTransportMod.AuthenticationTypeOAuth2]
    }
  }
  
  trait AuthenticationTypeCustom
    extends StObject
       with Credentials {
    
    var method: String
    
    var `type`: CUSTOM
  }
  object AuthenticationTypeCustom {
    
    inline def apply(method: String, pass: String, user: String): AuthenticationTypeCustom = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("CUSTOM")
      __obj.asInstanceOf[AuthenticationTypeCustom]
    }
    
    extension [Self <: AuthenticationTypeCustom](x: Self) {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setType(value: CUSTOM): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait AuthenticationTypeLogin
    extends StObject
       with AuthenticationType {
    
    var credentials: Credentials
    
    var method: String | `false`
    
    var `type`: LOGIN
    
    var user: String
  }
  object AuthenticationTypeLogin {
    
    inline def apply(credentials: Credentials, method: String | `false`, user: String): AuthenticationTypeLogin = {
      val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("LOGIN")
      __obj.asInstanceOf[AuthenticationTypeLogin]
    }
    
    extension [Self <: AuthenticationTypeLogin](x: Self) {
      
      inline def setCredentials(value: Credentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String | `false`): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setType(value: LOGIN): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait AuthenticationTypeOAuth2
    extends StObject
       with AuthenticationType {
    
    var method: XOAUTH2
    
    var oauth2: typings.nodemailer.xoauth2Mod.^
    
    var `type`: OAUTH2
    
    var user: String
  }
  object AuthenticationTypeOAuth2 {
    
    inline def apply(oauth2: typings.nodemailer.xoauth2Mod.^, user: String): AuthenticationTypeOAuth2 = {
      val __obj = js.Dynamic.literal(method = "XOAUTH2", oauth2 = oauth2.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("OAUTH2")
      __obj.asInstanceOf[AuthenticationTypeOAuth2]
    }
    
    extension [Self <: AuthenticationTypeOAuth2](x: Self) {
      
      inline def setMethod(value: XOAUTH2): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setOauth2(value: typings.nodemailer.xoauth2Mod.^): Self = StObject.set(x, "oauth2", value.asInstanceOf[js.Any])
      
      inline def setType(value: OAUTH2): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait MailOptions
    extends StObject
       with typings.nodemailer.mailerMod.Options {
    
    var auth: js.UndefOr[typings.nodemailer.smtpConnectionMod.AuthenticationType] = js.undefined
    
    var dsn: js.UndefOr[DSNOptions] = js.undefined
  }
  object MailOptions {
    
    inline def apply(): MailOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MailOptions]
    }
    
    extension [Self <: MailOptions](x: Self) {
      
      inline def setAuth(value: typings.nodemailer.smtpConnectionMod.AuthenticationType): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setDsn(value: DSNOptions): Self = StObject.set(x, "dsn", value.asInstanceOf[js.Any])
      
      inline def setDsnUndefined: Self = StObject.set(x, "dsn", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.nodemailer.smtpConnectionMod.Options because var conflicts: auth. Inlined host, port, secure, ignoreTLS, requireTLS, opportunisticTLS, name, localAddress, connectionTimeout, greetingTimeout, socketTimeout, logger, transactionLog, debug, authMethod, tls, socket, connection, customAuth */ trait Options
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
          /* callback */ js.Function2[/* err */ Error | Null, /* socketOptions */ js.Any, Unit], 
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
    
    /** optional hostname of the client, used for identifying to the server */
    var name: js.UndefOr[String] = js.undefined
    
    /** tries to use STARTTLS and continues normally if it fails */
    var opportunisticTLS: js.UndefOr[Boolean] = js.undefined
    
    /** the port to connect to (defaults to 25 or 465) */
    var port: js.UndefOr[Double] = js.undefined
    
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
      val __obj = js.Dynamic.literal()
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
        value: (Options, /* callback */ js.Function2[/* err */ Error | Null, /* socketOptions */ js.Any, Unit]) => Unit
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
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOpportunisticTLS(value: Boolean): Self = StObject.set(x, "opportunisticTLS", value.asInstanceOf[js.Any])
      
      inline def setOpportunisticTLSUndefined: Self = StObject.set(x, "opportunisticTLS", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
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
  
  @js.native
  trait SMTPTransport
    extends EventEmitter
       with Transport {
    
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    
    var auth: AuthenticationType = js.native
    
    /** Releases resources */
    @JSName("close")
    def close_MSMTPTransport(): Unit = js.native
    
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, error: Error): Boolean = js.native
    
    def getAuth(authOpts: typings.nodemailer.smtpConnectionMod.AuthenticationTypeLogin): AuthenticationType = js.native
    def getAuth(authOpts: typings.nodemailer.smtpConnectionMod.AuthenticationTypeOAuth2): AuthenticationType = js.native
    
    /** Placeholder function for creating proxy sockets. This method immediatelly returns without a socket */
    def getSocket(
      options: Options,
      callback: js.Function2[/* err */ Error | Null, /* socketOptions */ js.Object, Unit]
    ): Unit = js.native
    
    @JSName("listeners")
    def listeners_close(event: close): js.Array[js.Function0[Unit]] = js.native
    @JSName("listeners")
    def listeners_error(event: error): js.Array[js.Function1[/* err */ Error, Unit]] = js.native
    
    var logger: Logger = js.native
    
    @JSName("mailer")
    var mailer_SMTPTransport: typings.nodemailer.mailerMod.^ = js.native
    
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    
    var options: Options = js.native
    
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    
    @JSName("verify")
    def verify_MSMTPTransport(): js.Promise[`true`] = js.native
    /** Verifies SMTP configuration */
    @JSName("verify")
    def verify_true(callback: js.Function2[/* err */ Error | Null, `true`, Unit]): Unit = js.native
  }
  
  trait SentMessageInfo extends StObject {
    
    /** includes the envelope object for the message */
    var envelope: Envelope
    
    /** most transports should return the final Message-Id value used with this property */
    var messageId: String
  }
  object SentMessageInfo {
    
    inline def apply(envelope: Envelope, messageId: String): SentMessageInfo = {
      val __obj = js.Dynamic.literal(envelope = envelope.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SentMessageInfo]
    }
    
    extension [Self <: SentMessageInfo](x: Self) {
      
      inline def setEnvelope(value: Envelope): Self = StObject.set(x, "envelope", value.asInstanceOf[js.Any])
      
      inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    }
  }
}
