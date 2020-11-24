package typings.nodemailerSmtpTransport.mod

import typings.node.tlsMod.ConnectionOptions
import typings.nodemailerSmtpTransport.anon.MaxConnections
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmtpOptions extends js.Object {
  
  /**
    * defines authentication data (see authentication section below)
    */
  var auth: js.UndefOr[AuthOptions] = js.native
  
  /**
    * defines preferred authentication method, eg. 'PLAIN'
    */
  var authMethod: js.UndefOr[String] = js.native
  
  /**
    * how many milliseconds to wait for the connection to establish
    */
  var connectionTimeout: js.UndefOr[Double] = js.native
  
  /**
    * if true, the connection emits all traffic between client and server as 'log' events
    */
  var debug: js.UndefOr[Boolean] = js.native
  
  /**
    * if true, then does not allow to use files as content. Use it when you want to use JSON data from untrusted source as the email. If an attachment or message node tries to fetch something from a file the sending returns an error
    */
  var disableFileAccess: js.UndefOr[Boolean] = js.native
  
  /**
    *  if true, then does not allow to use Urls as content
    */
  var disableUrlAccess: js.UndefOr[Boolean] = js.native
  
  /**
    * how many milliseconds to wait for the greeting after connection is established
    */
  var greetingTimeout: js.UndefOr[Double] = js.native
  
  /**
    * is the hostname or IP address to connect to (defaults to 'localhost')
    */
  var host: js.UndefOr[String] = js.native
  
  /**
    * if this is true and secure is false then TLS is not used even if the server supports STARTTLS extension
    */
  var ignoreTLS: js.UndefOr[Boolean] = js.native
  
  /**
    * is the local interface to bind to for network connections
    */
  var localAddress: js.UndefOr[String] = js.native
  
  /**
    * optional bunyan compatible logger instance. If set to true then logs to console. If value is not set or is false then nothing is logged
    */
  var logger: js.UndefOr[Boolean] = js.native
  
  /**
    * optional hostname of the client, used for identifying to the server
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * see Pooled SMTP for details about connection pooling
    */
  var pool: js.UndefOr[MaxConnections] = js.native
  
  /**
    * is the port to connect to (defaults to 25 or 465)
    */
  var port: js.UndefOr[Double] = js.native
  
  /**
    *  a proxy URL
    */
  var proxy: js.UndefOr[String] = js.native
  
  /**
    * if this is true and secure is false then Nodemailer tries to use STARTTLS even if the server does not advertise support for it. If the connection can not be encrypted then message is not sent
    */
  var requireTLS: js.UndefOr[Boolean] = js.native
  
  /**
    * defines if the connection should use SSL (if true) or not (if false)
    */
  var secure: js.UndefOr[Boolean] = js.native
  
  /**
    * Fills in certain SMTP configurations options (e.g. 'host', 'port', and 'secure') for
    * well-known services. Possible values:
    *   - '1und1'
    *   - 'AOL'
    *   - 'DebugMail.io'
    *   - 'DynectEmail'
    *   - 'FastMail'
    *   - 'GandiMail'
    *   - 'Gmail'
    *   - 'Godaddy'
    *   - 'GodaddyAsia'
    *   - 'GodaddyEurope'
    *   - 'hot.ee'
    *   - 'Hotmail'
    *   - 'iCloud'
    *   - 'mail.ee'
    *   - 'Mail.ru'
    *   - 'Mailgun'
    *   - 'Mailjet'
    *   - 'Mandrill'
    *   - 'Naver'
    *   - 'Postmark'
    *   - 'QQ'
    *   - 'QQex'
    *   - 'SendCloud'
    *   - 'SendGrid'
    *   - 'SES'
    *   - 'Sparkpost'
    *   - 'Yahoo'
    *   - 'Yandex'
    *   - 'Zoho'
    */
  var service: js.UndefOr[String] = js.native
  
  /**
    * how many milliseconds of inactivity to allow
    */
  var socketTimeout: js.UndefOr[Double] = js.native
  
  /**
    * defines additional options to be passed to the socket constructor, eg. {rejectUnauthorized: true}
    */
  var tls: js.UndefOr[ConnectionOptions] = js.native
}
object SmtpOptions {
  
  @scala.inline
  def apply(): SmtpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmtpOptions]
  }
  
  @scala.inline
  implicit class SmtpOptionsOps[Self <: SmtpOptions] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: AuthOptions): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setAuthMethod(value: String): Self = this.set("authMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthMethod: Self = this.set("authMethod", js.undefined)
    
    @scala.inline
    def setConnectionTimeout(value: Double): Self = this.set("connectionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionTimeout: Self = this.set("connectionTimeout", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDisableFileAccess(value: Boolean): Self = this.set("disableFileAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableFileAccess: Self = this.set("disableFileAccess", js.undefined)
    
    @scala.inline
    def setDisableUrlAccess(value: Boolean): Self = this.set("disableUrlAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableUrlAccess: Self = this.set("disableUrlAccess", js.undefined)
    
    @scala.inline
    def setGreetingTimeout(value: Double): Self = this.set("greetingTimeout", value.asInstanceOf[js.Any])
    
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
    def setLogger(value: Boolean): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPool(value: MaxConnections): Self = this.set("pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePool: Self = this.set("pool", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setProxy(value: String): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    
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
    def setSocketTimeout(value: Double): Self = this.set("socketTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketTimeout: Self = this.set("socketTimeout", js.undefined)
    
    @scala.inline
    def setTls(value: ConnectionOptions): Self = this.set("tls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTls: Self = this.set("tls", js.undefined)
  }
}
