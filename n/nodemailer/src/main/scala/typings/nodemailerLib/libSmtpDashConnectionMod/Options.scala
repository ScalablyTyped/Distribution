package typings
package nodemailerLib.libSmtpDashConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** defines authentication data */
  var auth: js.UndefOr[AuthenticationType] = js.undefined
  /** defines preferred authentication method, e.g. ‘PLAIN’ */
  var authMethod: js.UndefOr[java.lang.String] = js.undefined
  /** connected socket to use instead of creating and connecting a new one. If secure option is true, then socket is upgraded from plaintext to ciphertext */
  var connection: js.UndefOr[nodeLib.netMod.Socket] = js.undefined
  /** how many milliseconds to wait for the connection to establish */
  var connectionTimeout: js.UndefOr[ms] = js.undefined
  var customAuth: js.UndefOr[CustomAuthenticationHandlers] = js.undefined
  /** if set to true, then logs SMTP traffic and message content, otherwise logs only transaction events */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /** how many milliseconds to wait for the greeting after connection is established */
  var greetingTimeout: js.UndefOr[ms] = js.undefined
  /** the hostname or IP address to connect to (defaults to ‘localhost’) */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /** turns off STARTTLS support if true */
  var ignoreTLS: js.UndefOr[scala.Boolean] = js.undefined
  /** the local interface to bind to for network connections */
  var localAddress: js.UndefOr[java.lang.String] = js.undefined
  /** optional bunyan compatible logger instance. If set to true then logs to console. If value is not set or is false then nothing is logged */
  var logger: js.UndefOr[nodemailerLib.libSharedMod.Logger | scala.Boolean] = js.undefined
  /** optional hostname of the client, used for identifying to the server */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** tries to use STARTTLS and continues normally if it fails */
  var opportunisticTLS: js.UndefOr[scala.Boolean] = js.undefined
  /** the port to connect to (defaults to 25 or 465) */
  var port: js.UndefOr[scala.Double] = js.undefined
  /** forces the client to use STARTTLS. Returns an error if upgrading the connection is not possible or fails. */
  var requireTLS: js.UndefOr[scala.Boolean] = js.undefined
  /** defines if the connection should use SSL (if true) or not (if false) */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  /** initialized socket to use instead of creating a new one */
  var socket: js.UndefOr[nodeLib.netMod.Socket] = js.undefined
  /** how many milliseconds of inactivity to allow */
  var socketTimeout: js.UndefOr[ms] = js.undefined
  /** defines additional options to be passed to the socket constructor, e.g. {rejectUnauthorized: true} */
  var tls: js.UndefOr[nodeLib.tlsMod.ConnectionOptions] = js.undefined
  /** if set to true, then logs SMTP traffic without message content */
  var transactionLog: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    auth: AuthenticationType = null,
    authMethod: java.lang.String = null,
    connection: nodeLib.netMod.Socket = null,
    connectionTimeout: js.UndefOr[ms] = js.undefined,
    customAuth: CustomAuthenticationHandlers = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    greetingTimeout: js.UndefOr[ms] = js.undefined,
    host: java.lang.String = null,
    ignoreTLS: js.UndefOr[scala.Boolean] = js.undefined,
    localAddress: java.lang.String = null,
    logger: nodemailerLib.libSharedMod.Logger | scala.Boolean = null,
    name: java.lang.String = null,
    opportunisticTLS: js.UndefOr[scala.Boolean] = js.undefined,
    port: scala.Int | scala.Double = null,
    requireTLS: js.UndefOr[scala.Boolean] = js.undefined,
    secure: js.UndefOr[scala.Boolean] = js.undefined,
    socket: nodeLib.netMod.Socket = null,
    socketTimeout: js.UndefOr[ms] = js.undefined,
    tls: nodeLib.tlsMod.ConnectionOptions = null,
    transactionLog: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (authMethod != null) __obj.updateDynamic("authMethod")(authMethod)
    if (connection != null) __obj.updateDynamic("connection")(connection)
    if (!js.isUndefined(connectionTimeout)) __obj.updateDynamic("connectionTimeout")(connectionTimeout)
    if (customAuth != null) __obj.updateDynamic("customAuth")(customAuth)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(greetingTimeout)) __obj.updateDynamic("greetingTimeout")(greetingTimeout)
    if (host != null) __obj.updateDynamic("host")(host)
    if (!js.isUndefined(ignoreTLS)) __obj.updateDynamic("ignoreTLS")(ignoreTLS)
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(opportunisticTLS)) __obj.updateDynamic("opportunisticTLS")(opportunisticTLS)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(requireTLS)) __obj.updateDynamic("requireTLS")(requireTLS)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    if (socket != null) __obj.updateDynamic("socket")(socket)
    if (!js.isUndefined(socketTimeout)) __obj.updateDynamic("socketTimeout")(socketTimeout)
    if (tls != null) __obj.updateDynamic("tls")(tls)
    if (!js.isUndefined(transactionLog)) __obj.updateDynamic("transactionLog")(transactionLog)
    __obj.asInstanceOf[Options]
  }
}

