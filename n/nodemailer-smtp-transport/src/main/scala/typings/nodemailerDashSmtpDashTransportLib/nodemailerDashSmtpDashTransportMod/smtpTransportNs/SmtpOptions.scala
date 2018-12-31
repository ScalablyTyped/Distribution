package typings
package nodemailerDashSmtpDashTransportLib.nodemailerDashSmtpDashTransportMod.smtpTransportNs

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
  var authMethod: js.UndefOr[java.lang.String] = js.undefined
  /**
    * how many milliseconds to wait for the connection to establish
    */
  var connectionTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * if true, the connection emits all traffic between client and server as 'log' events
    */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * if true, then does not allow to use files as content. Use it when you want to use JSON data from untrusted source as the email. If an attachment or message node tries to fetch something from a file the sending returns an error
    */
  var disableFileAccess: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  if true, then does not allow to use Urls as content
    */
  var disableUrlAccess: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * how many milliseconds to wait for the greeting after connection is established
    */
  var greetingTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * is the hostname or IP address to connect to (defaults to 'localhost')
    */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /**
    * if this is true and secure is false then TLS is not used even if the server supports STARTTLS extension
    */
  var ignoreTLS: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * is the local interface to bind to for network connections
    */
  var localAddress: js.UndefOr[java.lang.String] = js.undefined
  /**
    * optional bunyan compatible logger instance. If set to true then logs to console. If value is not set or is false then nothing is logged
    */
  var logger: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * optional hostname of the client, used for identifying to the server
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * see Pooled SMTP for details about connection pooling
    */
  var pool: js.UndefOr[nodemailerDashSmtpDashTransportLib.Anon_RateLimit] = js.undefined
  /**
    * is the port to connect to (defaults to 25 or 465)
    */
  var port: js.UndefOr[scala.Double] = js.undefined
  /**
    *  a proxy URL
    */
  var proxy: js.UndefOr[java.lang.String] = js.undefined
  /**
    * if this is true and secure is false then Nodemailer tries to use STARTTLS even if the server does not advertise support for it. If the connection can not be encrypted then message is not sent
    */
  var requireTLS: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * defines if the connection should use SSL (if true) or not (if false)
    */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
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
  var service: js.UndefOr[java.lang.String] = js.undefined
  /**
    * how many milliseconds of inactivity to allow
    */
  var socketTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * defines additional options to be passed to the socket constructor, eg. {rejectUnauthorized: true}
    */
  var tls: js.UndefOr[nodeLib.tlsMod.ConnectionOptions] = js.undefined
}

