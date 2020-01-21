package typings.nodemailer.smtpConnectionMod

import typings.node.netMod.Socket
import typings.node.tlsMod.ConnectionOptions
import typings.nodemailer.sharedMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** defines authentication data */
  var auth: js.UndefOr[AuthenticationType] = js.undefined
  /** defines preferred authentication method, e.g. ‘PLAIN’ */
  var authMethod: js.UndefOr[String] = js.undefined
  /** connected socket to use instead of creating and connecting a new one. If secure option is true, then socket is upgraded from plaintext to ciphertext */
  var connection: js.UndefOr[Socket] = js.undefined
  /** how many milliseconds to wait for the connection to establish */
  var connectionTimeout: js.UndefOr[ms] = js.undefined
  var customAuth: js.UndefOr[CustomAuthenticationHandlers] = js.undefined
  /** if set to true, then logs SMTP traffic and message content, otherwise logs only transaction events */
  var debug: js.UndefOr[Boolean] = js.undefined
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
  /** initialized socket to use instead of creating a new one */
  var socket: js.UndefOr[Socket] = js.undefined
  /** how many milliseconds of inactivity to allow */
  var socketTimeout: js.UndefOr[ms] = js.undefined
  /** defines additional options to be passed to the socket constructor, e.g. {rejectUnauthorized: true} */
  var tls: js.UndefOr[ConnectionOptions] = js.undefined
  /** if set to true, then logs SMTP traffic without message content */
  var transactionLog: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    auth: AuthenticationType = null,
    authMethod: String = null,
    connection: Socket = null,
    connectionTimeout: Int | Double = null,
    customAuth: CustomAuthenticationHandlers = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    greetingTimeout: Int | Double = null,
    host: String = null,
    ignoreTLS: js.UndefOr[Boolean] = js.undefined,
    localAddress: String = null,
    logger: Logger | Boolean = null,
    name: String = null,
    opportunisticTLS: js.UndefOr[Boolean] = js.undefined,
    port: Int | Double = null,
    requireTLS: js.UndefOr[Boolean] = js.undefined,
    secure: js.UndefOr[Boolean] = js.undefined,
    socket: Socket = null,
    socketTimeout: Int | Double = null,
    tls: ConnectionOptions = null,
    transactionLog: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (authMethod != null) __obj.updateDynamic("authMethod")(authMethod.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (connectionTimeout != null) __obj.updateDynamic("connectionTimeout")(connectionTimeout.asInstanceOf[js.Any])
    if (customAuth != null) __obj.updateDynamic("customAuth")(customAuth.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (greetingTimeout != null) __obj.updateDynamic("greetingTimeout")(greetingTimeout.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreTLS)) __obj.updateDynamic("ignoreTLS")(ignoreTLS.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(opportunisticTLS)) __obj.updateDynamic("opportunisticTLS")(opportunisticTLS.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(requireTLS)) __obj.updateDynamic("requireTLS")(requireTLS.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    if (socket != null) __obj.updateDynamic("socket")(socket.asInstanceOf[js.Any])
    if (socketTimeout != null) __obj.updateDynamic("socketTimeout")(socketTimeout.asInstanceOf[js.Any])
    if (tls != null) __obj.updateDynamic("tls")(tls.asInstanceOf[js.Any])
    if (!js.isUndefined(transactionLog)) __obj.updateDynamic("transactionLog")(transactionLog.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

