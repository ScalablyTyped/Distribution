package typings.nodemailer.smtpPoolMod

import typings.node.netMod.Socket
import typings.node.tlsMod.ConnectionOptions
import typings.nodemailer.mod.TransportOptions
import typings.nodemailer.nodemailerBooleans.`true`
import typings.nodemailer.sharedMod.Logger
import typings.nodemailer.smtpConnectionMod.CustomAuthenticationHandlers
import typings.nodemailer.smtpConnectionMod.ms
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.nodemailer.smtpConnectionMod.Options because var conflicts: auth. Inlined host, port, secure, ignoreTLS, requireTLS, opportunisticTLS, name, localAddress, connectionTimeout, greetingTimeout, socketTimeout, logger, transactionLog, debug, authMethod, tls, socket, connection, customAuth */ @js.native
trait Options
  extends MailOptions
     with TransportOptions {
  
  /** defines preferred authentication method, e.g. ‘PLAIN’ */
  var authMethod: js.UndefOr[String] = js.native
  
  /** connected socket to use instead of creating and connecting a new one. If secure option is true, then socket is upgraded from plaintext to ciphertext */
  var connection: js.UndefOr[Socket] = js.native
  
  /** how many milliseconds to wait for the connection to establish */
  var connectionTimeout: js.UndefOr[ms] = js.native
  
  var customAuth: js.UndefOr[CustomAuthenticationHandlers] = js.native
  
  /** if set to true, then logs SMTP traffic and message content, otherwise logs only transaction events */
  var debug: js.UndefOr[Boolean] = js.native
  
  var getSocket: js.UndefOr[
    js.Function2[
      /* options */ this.type, 
      /* callback */ js.Function2[/* err */ Error | Null, /* socketOptions */ js.Any, Unit], 
      Unit
    ]
  ] = js.native
  
  /** how many milliseconds to wait for the greeting after connection is established */
  var greetingTimeout: js.UndefOr[ms] = js.native
  
  /** the hostname or IP address to connect to (defaults to ‘localhost’) */
  var host: js.UndefOr[String] = js.native
  
  /** turns off STARTTLS support if true */
  var ignoreTLS: js.UndefOr[Boolean] = js.native
  
  /** the local interface to bind to for network connections */
  var localAddress: js.UndefOr[String] = js.native
  
  /** optional bunyan compatible logger instance. If set to true then logs to console. If value is not set or is false then nothing is logged */
  var logger: js.UndefOr[Logger | Boolean] = js.native
  
  /** the count of maximum simultaneous connections to make against the SMTP server (defaults to 5) */
  var maxConnections: js.UndefOr[Double] = js.native
  
  /** limits the message count to be sent using a single connection (defaults to 100). After maxMessages is reached the connection is dropped and a new one is created for the following messages */
  var maxMessages: js.UndefOr[Double] = js.native
  
  /** optional hostname of the client, used for identifying to the server */
  var name: js.UndefOr[String] = js.native
  
  /** tries to use STARTTLS and continues normally if it fails */
  var opportunisticTLS: js.UndefOr[Boolean] = js.native
  
  /** set to true to use pooled connections (defaults to false) instead of creating a new connection for every email */
  var pool: `true` = js.native
  
  /** the port to connect to (defaults to 25 or 465) */
  var port: js.UndefOr[Double] = js.native
  
  /** defines the time measuring period in milliseconds (defaults to 1000, ie. to 1 second) for rate limiting */
  var rateDelta: js.UndefOr[Double] = js.native
  
  /** limits the message count to be sent in rateDelta time. Once rateLimit is reached, sending is paused until the end of the measuring period. This limit is shared between connections, so if one connection uses up the limit, then other connections are paused as well. If rateLimit is not set then sending rate is not limited */
  var rateLimit: js.UndefOr[Double] = js.native
  
  /** forces the client to use STARTTLS. Returns an error if upgrading the connection is not possible or fails. */
  var requireTLS: js.UndefOr[Boolean] = js.native
  
  /** defines if the connection should use SSL (if true) or not (if false) */
  var secure: js.UndefOr[Boolean] = js.native
  
  var service: js.UndefOr[String] = js.native
  
  /** initialized socket to use instead of creating a new one */
  var socket: js.UndefOr[Socket] = js.native
  
  /** how many milliseconds of inactivity to allow */
  var socketTimeout: js.UndefOr[ms] = js.native
  
  /** defines additional options to be passed to the socket constructor, e.g. {rejectUnauthorized: true} */
  var tls: js.UndefOr[ConnectionOptions] = js.native
  
  /** if set to true, then logs SMTP traffic without message content */
  var transactionLog: js.UndefOr[Boolean] = js.native
  
   // TODO http.ClientRequest?
  var url: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(pool: `true`): Options = {
    val __obj = js.Dynamic.literal(pool = pool.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPool(value: `true`): Self = this.set("pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthMethod(value: String): Self = this.set("authMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthMethod: Self = this.set("authMethod", js.undefined)
    
    @scala.inline
    def setConnection(value: Socket): Self = this.set("connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnection: Self = this.set("connection", js.undefined)
    
    @scala.inline
    def setConnectionTimeout(value: ms): Self = this.set("connectionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionTimeout: Self = this.set("connectionTimeout", js.undefined)
    
    @scala.inline
    def setCustomAuth(value: CustomAuthenticationHandlers): Self = this.set("customAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomAuth: Self = this.set("customAuth", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setGetSocket(
      value: (Options, /* callback */ js.Function2[/* err */ Error | Null, /* socketOptions */ js.Any, Unit]) => Unit
    ): Self = this.set("getSocket", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetSocket: Self = this.set("getSocket", js.undefined)
    
    @scala.inline
    def setGreetingTimeout(value: ms): Self = this.set("greetingTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreetingTimeout: Self = this.set("greetingTimeout", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setIgnoreTLS(value: Boolean): Self = this.set("ignoreTLS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreTLS: Self = this.set("ignoreTLS", js.undefined)
    
    @scala.inline
    def setLocalAddress(value: String): Self = this.set("localAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalAddress: Self = this.set("localAddress", js.undefined)
    
    @scala.inline
    def setLogger(value: Logger | Boolean): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setMaxConnections(value: Double): Self = this.set("maxConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxConnections: Self = this.set("maxConnections", js.undefined)
    
    @scala.inline
    def setMaxMessages(value: Double): Self = this.set("maxMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxMessages: Self = this.set("maxMessages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOpportunisticTLS(value: Boolean): Self = this.set("opportunisticTLS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpportunisticTLS: Self = this.set("opportunisticTLS", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setRateDelta(value: Double): Self = this.set("rateDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRateDelta: Self = this.set("rateDelta", js.undefined)
    
    @scala.inline
    def setRateLimit(value: Double): Self = this.set("rateLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRateLimit: Self = this.set("rateLimit", js.undefined)
    
    @scala.inline
    def setRequireTLS(value: Boolean): Self = this.set("requireTLS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireTLS: Self = this.set("requireTLS", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
    
    @scala.inline
    def setSocket(value: Socket): Self = this.set("socket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocket: Self = this.set("socket", js.undefined)
    
    @scala.inline
    def setSocketTimeout(value: ms): Self = this.set("socketTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketTimeout: Self = this.set("socketTimeout", js.undefined)
    
    @scala.inline
    def setTls(value: ConnectionOptions): Self = this.set("tls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTls: Self = this.set("tls", js.undefined)
    
    @scala.inline
    def setTransactionLog(value: Boolean): Self = this.set("transactionLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionLog: Self = this.set("transactionLog", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
