package typings.nodemailer.smtpConnectionMod

import typings.node.netMod.Socket
import typings.node.tlsMod.ConnectionOptions
import typings.nodemailer.sharedMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
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
    def setAuth(value: AuthenticationType): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
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
    def setRequireTLS(value: Boolean): Self = this.set("requireTLS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireTLS: Self = this.set("requireTLS", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    
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
  }
}
