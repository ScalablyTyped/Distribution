package typings.nodemailerSmtpTransport.mod

import typings.node.tlsMod.ConnectionOptions
import typings.nodemailerSmtpTransport.anon.MaxConnections
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmtpOptions extends js.Object {
  /**
    * defines authentication data (see authentication section below)
    */
  var auth: js.UndefOr[AuthOptions] = js.undefined
  /**
    * defines preferred authentication method, eg. 'PLAIN'
    */
  var authMethod: js.UndefOr[String] = js.undefined
  /**
    * how many milliseconds to wait for the connection to establish
    */
  var connectionTimeout: js.UndefOr[Double] = js.undefined
  /**
    * if true, the connection emits all traffic between client and server as 'log' events
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * if true, then does not allow to use files as content. Use it when you want to use JSON data from untrusted source as the email. If an attachment or message node tries to fetch something from a file the sending returns an error
    */
  var disableFileAccess: js.UndefOr[Boolean] = js.undefined
  /**
    *  if true, then does not allow to use Urls as content
    */
  var disableUrlAccess: js.UndefOr[Boolean] = js.undefined
  /**
    * how many milliseconds to wait for the greeting after connection is established
    */
  var greetingTimeout: js.UndefOr[Double] = js.undefined
  /**
    * is the hostname or IP address to connect to (defaults to 'localhost')
    */
  var host: js.UndefOr[String] = js.undefined
  /**
    * if this is true and secure is false then TLS is not used even if the server supports STARTTLS extension
    */
  var ignoreTLS: js.UndefOr[Boolean] = js.undefined
  /**
    * is the local interface to bind to for network connections
    */
  var localAddress: js.UndefOr[String] = js.undefined
  /**
    * optional bunyan compatible logger instance. If set to true then logs to console. If value is not set or is false then nothing is logged
    */
  var logger: js.UndefOr[Boolean] = js.undefined
  /**
    * optional hostname of the client, used for identifying to the server
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * see Pooled SMTP for details about connection pooling
    */
  var pool: js.UndefOr[MaxConnections] = js.undefined
  /**
    * is the port to connect to (defaults to 25 or 465)
    */
  var port: js.UndefOr[Double] = js.undefined
  /**
    *  a proxy URL
    */
  var proxy: js.UndefOr[String] = js.undefined
  /**
    * if this is true and secure is false then Nodemailer tries to use STARTTLS even if the server does not advertise support for it. If the connection can not be encrypted then message is not sent
    */
  var requireTLS: js.UndefOr[Boolean] = js.undefined
  /**
    * defines if the connection should use SSL (if true) or not (if false)
    */
  var secure: js.UndefOr[Boolean] = js.undefined
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
  var service: js.UndefOr[String] = js.undefined
  /**
    * how many milliseconds of inactivity to allow
    */
  var socketTimeout: js.UndefOr[Double] = js.undefined
  /**
    * defines additional options to be passed to the socket constructor, eg. {rejectUnauthorized: true}
    */
  var tls: js.UndefOr[ConnectionOptions] = js.undefined
}

object SmtpOptions {
  @scala.inline
  def apply(
    auth: AuthOptions = null,
    authMethod: String = null,
    connectionTimeout: js.UndefOr[Double] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    disableFileAccess: js.UndefOr[Boolean] = js.undefined,
    disableUrlAccess: js.UndefOr[Boolean] = js.undefined,
    greetingTimeout: js.UndefOr[Double] = js.undefined,
    host: String = null,
    ignoreTLS: js.UndefOr[Boolean] = js.undefined,
    localAddress: String = null,
    logger: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    pool: MaxConnections = null,
    port: js.UndefOr[Double] = js.undefined,
    proxy: String = null,
    requireTLS: js.UndefOr[Boolean] = js.undefined,
    secure: js.UndefOr[Boolean] = js.undefined,
    service: String = null,
    socketTimeout: js.UndefOr[Double] = js.undefined,
    tls: ConnectionOptions = null
  ): SmtpOptions = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (authMethod != null) __obj.updateDynamic("authMethod")(authMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(connectionTimeout)) __obj.updateDynamic("connectionTimeout")(connectionTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFileAccess)) __obj.updateDynamic("disableFileAccess")(disableFileAccess.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableUrlAccess)) __obj.updateDynamic("disableUrlAccess")(disableUrlAccess.get.asInstanceOf[js.Any])
    if (!js.isUndefined(greetingTimeout)) __obj.updateDynamic("greetingTimeout")(greetingTimeout.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreTLS)) __obj.updateDynamic("ignoreTLS")(ignoreTLS.get.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(logger)) __obj.updateDynamic("logger")(logger.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pool != null) __obj.updateDynamic("pool")(pool.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (!js.isUndefined(requireTLS)) __obj.updateDynamic("requireTLS")(requireTLS.get.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.get.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (!js.isUndefined(socketTimeout)) __obj.updateDynamic("socketTimeout")(socketTimeout.get.asInstanceOf[js.Any])
    if (tls != null) __obj.updateDynamic("tls")(tls.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmtpOptions]
  }
}

