package typings.nodemailer.smtpConnectionMod

import typings.node.netMod.Socket
import typings.node.tlsMod.ConnectionOptions
import typings.nodemailer.sharedMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends StObject {
  
  /** defines authentication data */
  var auth: js.UndefOr[AuthenticationType] = js.native
  
  /** defines preferred authentication method, e.g. ‘PLAIN’ */
  var authMethod: js.UndefOr[String] = js.native
  
  /** connected socket to use instead of creating and connecting a new one. If secure option is true, then socket is upgraded from plaintext to ciphertext */
  var connection: js.UndefOr[Socket] = js.native
  
  /** how many milliseconds to wait for the connection to establish */
  var connectionTimeout: js.UndefOr[ms] = js.native
  
  var customAuth: js.UndefOr[CustomAuthenticationHandlers] = js.native
  
  /** if set to true, then logs SMTP traffic and message content, otherwise logs only transaction events */
  var debug: js.UndefOr[Boolean] = js.native
  
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
  
  /** optional hostname of the client, used for identifying to the server */
  var name: js.UndefOr[String] = js.native
  
  /** tries to use STARTTLS and continues normally if it fails */
  var opportunisticTLS: js.UndefOr[Boolean] = js.native
  
  /** the port to connect to (defaults to 25 or 465) */
  var port: js.UndefOr[Double] = js.native
  
  /** forces the client to use STARTTLS. Returns an error if upgrading the connection is not possible or fails. */
  var requireTLS: js.UndefOr[Boolean] = js.native
  
  /** defines if the connection should use SSL (if true) or not (if false) */
  var secure: js.UndefOr[Boolean] = js.native
  
  /** initialized socket to use instead of creating a new one */
  var socket: js.UndefOr[Socket] = js.native
  
  /** how many milliseconds of inactivity to allow */
  var socketTimeout: js.UndefOr[ms] = js.native
  
  /** defines additional options to be passed to the socket constructor, e.g. {rejectUnauthorized: true} */
  var tls: js.UndefOr[ConnectionOptions] = js.native
  
  /** if set to true, then logs SMTP traffic without message content */
  var transactionLog: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: AuthenticationType): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthMethod(value: String): Self = StObject.set(x, "authMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthMethodUndefined: Self = StObject.set(x, "authMethod", js.undefined)
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setConnection(value: Socket): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionTimeout(value: ms): Self = StObject.set(x, "connectionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionTimeoutUndefined: Self = StObject.set(x, "connectionTimeout", js.undefined)
    
    @scala.inline
    def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    @scala.inline
    def setCustomAuth(value: CustomAuthenticationHandlers): Self = StObject.set(x, "customAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomAuthUndefined: Self = StObject.set(x, "customAuth", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setGreetingTimeout(value: ms): Self = StObject.set(x, "greetingTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreetingTimeoutUndefined: Self = StObject.set(x, "greetingTimeout", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setIgnoreTLS(value: Boolean): Self = StObject.set(x, "ignoreTLS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreTLSUndefined: Self = StObject.set(x, "ignoreTLS", js.undefined)
    
    @scala.inline
    def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
    
    @scala.inline
    def setLogger(value: Logger | Boolean): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOpportunisticTLS(value: Boolean): Self = StObject.set(x, "opportunisticTLS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpportunisticTLSUndefined: Self = StObject.set(x, "opportunisticTLS", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setRequireTLS(value: Boolean): Self = StObject.set(x, "requireTLS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireTLSUndefined: Self = StObject.set(x, "requireTLS", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    @scala.inline
    def setSocket(value: Socket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocketTimeout(value: ms): Self = StObject.set(x, "socketTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocketTimeoutUndefined: Self = StObject.set(x, "socketTimeout", js.undefined)
    
    @scala.inline
    def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
    
    @scala.inline
    def setTls(value: ConnectionOptions): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
    
    @scala.inline
    def setTransactionLog(value: Boolean): Self = StObject.set(x, "transactionLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionLogUndefined: Self = StObject.set(x, "transactionLog", js.undefined)
  }
}
